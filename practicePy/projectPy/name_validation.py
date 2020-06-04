#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Apr  7 14:32:15 2020

@author: Ada
"""

name = input("Enter your name: ")

if len(name) < 3:
    print("Name must be at least 3 characters")
elif len(name) > 50:
    print("Name can be maximum of 50 characters")
else:
    print("Name looks good!")