#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Apr  9 17:42:48 2020

@author: Ada
"""
#Ex1 
try:
    age = int(input('Age: '))
    print(age)
except ValueError:
    print('Invalid value')

#Ex2   
try:
    age = int(input('Age: '))
    income = 20000
    risk = income / age
except ValueError:
    print('Invalid value')
except ZeroDivisionError:
    print('Age cannot be zero')
        