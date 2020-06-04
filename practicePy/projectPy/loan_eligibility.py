#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Apr  7 14:19:02 2020

@author: Ada
"""
print("----- Ex 1 -----")

has_high_income = False
has_good_credit = True

#if has_high_income and has_good_credit:
if has_high_income or has_good_credit:
    print("Eligible for loan")
else:
    print("Not eligible for loan")
    
print("----- Ex 2 -----")

has_criminal_record = False
if has_good_credit and not has_criminal_record:
    print("Eligible for loan")
else:
    print("Not eligible for loan")


