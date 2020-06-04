#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Apr 10 15:46:55 2020

@author: Ada
"""
# use module to organize codes
# refer to each file (containing related codes, classes, etc) as module

import converter
from converter import lbs_to_kg
from utils import find_max


print(converter.kg_to_lbs(70))

print(lbs_to_kg(120))

numbers = [4, 10, 6, 2]
print(find_max(numbers))

#a package : a folder for multiple modules

#Ex2
import ecommerce.shipping

ecommerce.shipping.calc_shipping()

#Ex3
from ecommerce.shipping import calc_shipping
#from ecommerce import shipping

calc_shipping()
#shipping.calc_shipping()

# python built-in module
import random

for i in range(3):
    print(random.random())

for i in range(3):
    print(random.randint(10, 20))
    
members = ['John', 'Mary', 'Bob']
leader = random.choice(members)
print(leader)

#Ex dice
import random


class Dice:
    def roll(self):
        first = random.randint(1, 6)
        second = random.randint(1, 6)
        return first, second  #return tuple by default


dice = Dice()
dice.roll()


from pathlib import Path
path = Path("ecommerce")
print(path.exists())

path = Path("emails")
path.mkdir() #create the directory
path.rmdir() # remove the directory

path = Path()
for file in path.glob('*'):
    print(file)

for file in path.glob('*.py'):
    print(file)