#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Apr  7 14:10:16 2020

@author: Ada
"""

house_price = 1000000
has_good_credit = True

if has_good_credit:
    down_payment = 0.1 * house_price
else:
    down_payment = 0.2 * house_price
print(f"Down payment: ${down_payment}")
