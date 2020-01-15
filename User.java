package com.example.talksquad.Model;

public class User {
    private String Id;
    private String username;
    private String ImageURL;
    private String status;
    public User(String user_id, String userName, String image_URL,String Status){
        Id=user_id;
        username=userName;
        ImageURL=image_URL;
        status=Status;

    }
    public User(){

    }
    //public void setUsername(String u){
    //  username=u;

    //}

    public String getUsername() {
        return username;
    }



    public String getImageURL() {
        return ImageURL;
    }


    public String getId() {
        return Id;
    }

    public String getStatus() {
        return status;
    }
}

