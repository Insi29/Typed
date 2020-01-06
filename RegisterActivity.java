public class RegisterActivity extends AppCompatActivity {
    MaterialEditText username,email,password;
    Button then_register;
    FirebaseAuth auth;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.username);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        then_register=findViewById(R.id.register);
        auth=FirebaseAuth.getInstance();
        then_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_username=username.getText().toString();
                String txt_email=email.getText().toString();
                String txt_password=password.getText().toString();
                if(TextUtils.isEmpty(txt_username) || TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                    
                }
            }
        });
    }
    private void register(final String username, String email, String password){
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    FirebaseUser firebaseUser=auth.getCurrentUser();
                    assert firebaseUser!=null;
                    String userid=firebaseUser.getUid();
                    reference= FirebaseDatabase.getInstance().getReference("Users").child(userid);
                    HashMap <String,String>hashmap =new HashMap<>();
                    hashmap.put("Id",userid);
                    hashmap.put("username",username);
                    hashmap.put("ImageURL","default");
                    reference.setValue(hashmap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Intent intent=new Intent(RegisterActivity.this,MainActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                                finish();

                                }
                            }
                        });
                    }else{
                    Toast.makeText(RegisterActivity.this,"You can't register with this email or password ",Toast.LENGTH_SHORT).show();




                }
            }
        });


    }
}
