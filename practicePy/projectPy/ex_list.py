#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Apr  8 18:21:14 2020

@author: Ada
"""
#
numbers = [2, 3, 4, 5, 6]
number2 = numbers
numbers.append(10)
print(number2)

#
numbers = [2, 3, 4, 5, 6]
number2 = numbers.copy()
numbers.append(10)
print(number2)

numbers.insert(0, 20)
print(numbers)

numbers.remove(5)
print(numbers)

#remove last item from the list
numbers.pop()
print(numbers)

#return index
print(numbers.index(3))

#check is 50 is in the list
print(50 in numbers)

#
print(numbers.count(3))

numbers.sort()
print(numbers)

numbers.reverse()
print(numbers)

#find unique numbers
numbers = [2, 2, 4, 6, 3, 4, 6, 1]
uniques = []
for number in numbers:
    if number not in uniques:
        uniques.append(number)

print(uniques)


coordinates = [1, 2, 3]
print(coordinates[0])
x, y, z = coordinates

#Tuples: immutable objects
coordinates = (1, 2, 3)
print(coordinates[0])
x, y, z = coordinates

#dictionary
customer = {
        "name": "Ada Kiek",
        "age": 30,
        "is_verified": True
        }

print(customer["name"])

customer["name"] = "Ada Jamr"
print(customer["name"])

customer["birthday"] = "Nov 21, 1979"

#
digits_mapping = {
        "1": "one",
        "2": "two",
        "3": "three",
        "4": "four",
        "5": "five",
        "6": "six",
        "7": "seven",
        "8": "eight",
        "9": "nine",
        }

phone = input("Phone: ")
phone_str = ""
for ch in phone:
    phone_str += digits_mapping[ch] + " "
#    phone_str += digits_mapping.get(ch, "!") + " "    
print(phone_str)

#
message = input(">")
words = message.split(' ')
emojis = {
        ":)" : "😀",
        ":(" : "😢",        
        }
output = ""
for word in words:
    output += emojis.get(word, word) + " "
print(output)
        