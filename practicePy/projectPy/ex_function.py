#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Apr  9 13:36:48 2020

@author: Ada
"""
#Ex1
def greet_user(name):
    print(f'Hi {name}!')
    print('Welcome aboard' )
    

greet_user("John") 

#Ex2
def square(number):
    return number * number
    
print(square(3))


def emoji_converter(message):
    words = message.split(" ")
    emojis = {
            ":)" : "😀",
            ":(" : "😢",        
            }
    output = ""
    for word in words:
        output += emojis.get(word, word) + " "
    return output


message = input(">")
print(emoji_converter(message))
