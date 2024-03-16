import os
import time


class User:
    def __init__(self,name,id):
        self.name = name
        self.id = id
        self.is_logged_in = False
        self.password = 12345
        self.post_amount = 1

user_1 = User('Kevin', 109493031)



def auth_check(function):
    print(function)
    def wf(*args,**kwargs):
        user_provided_password = int(input('Enter Your Password:\n'))
        if user_provided_password == args[0].password:
            args[0].is_logged_in = True
            if args[0].is_logged_in == True:
                function(args[0])
            else:
                print('you need to be logged in before you can post bruh')
        else:
            print('Incorrect Password for provided user')
    return wf


@auth_check
def new_blog_post(user_name):
    if user_name.post_amount < 1:
        print(f"This is {user_name.name}'s first blog post!")
    else:
        print(f"This is {user_name.name}'s New post!")



new_blog_post(user_1)
