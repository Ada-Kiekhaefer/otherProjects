#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Apr  8 17:58:41 2020

@author: Ada
"""
for item in 'Python':
    print(item)

for item in ['Job', 'Adams', 'Mike']:
    print(item)
    
for item in range(10):
    print(item)

for item in range(5, 10):
    print(item)

for item in range(5, 10, 2):
    print(item)
    
prices = [10, 20, 30]
total = 0
for price in prices:
    total += price
print(f'Total =  {total}')

for x in range(4):
    for y in range(3):
        print(f'({x},{y})')
