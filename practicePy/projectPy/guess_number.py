#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Apr  7 15:02:26 2020

@author: Ada
"""
secret_number = 9
guess_count = 0
guess_limit = 3

while guess_count < guess_limit:
    guess_number = int(input("Enter a number: "))
    guess_count += 1
    if guess_number == secret_number:
        print("You won!")
        break
else:            
    print("You lost!")
            
    
    
