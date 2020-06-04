#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Apr  7 14:38:09 2020

@author: Ada
"""

weight = float(input("Weight: "))
unit = input("(L)bs or (K)g: ")

if (unit.upper() == "L"):
    converted = weight * 0.45
    print(f"You are {converted} kilos")
else:
    converted = float(weight) * 2.2
    print(f"You are {converted} lbs")

    
    