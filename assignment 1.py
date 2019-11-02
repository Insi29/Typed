#Task 1
import math
import datetime
print("Twinkle Twinkle little star","\n\tHow I wonder what you are?","\n\t\t Up above the world so high","\n\t\t Like a diamond in the sky","\n Twinkle twinkle little star","\n\t How I wonder what you are?")
#Task 2
import sys
print('Version of python:',sys.version)
#Task 3
print('The current date and time is :',datetime.datetime.now().strftime('%dth %B %Y, %H:%M %p'))
#Task 4
radius=int(input('Enter the radius of circle:'))
area=math.pi*(radius**2)
print('Area of given circle is:',area,'sqcm')
#Task 5
firstname=str(input('Enter the first name:'))
lastname=str(input('Enter the last name:'))
name=firstname+lastname
for i in range(1,len(name)+1):
	print(name[-i],sep=" ")
#Task 6
a=int(input('Enter the number to be added:'))
b=int(input('Enter the other number:'))
print('Result:',a+b)
