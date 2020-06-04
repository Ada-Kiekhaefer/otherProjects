#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Apr  9 18:23:50 2020

@author: Ada
"""
#Use classes to define new types
class Point:
    def move(self):
        print("move")
    
    def draw(self):
        print("draw")
        

point1 = Point()
point1.draw()
point1.x = 10
point1.y = 20
print(point1.x)

point2 = Point()
point2.x =1
print(point2.x)
        
# Add constructor
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def move(self):
        print("move")    
    def draw(self):
        print("draw")


point = Point(10,20)
print(point.x)
point.x = 11
print(point.x)

#Exercise
class Person:
    def __init__(self, name):
        self.name = name
    def talk(self):
        print(f"Hi, I am {self.name}!")
        
person = Person("Jack")
#print(person.name)
person.talk()

bob = Person("Bob")
bob.talk()

# inheritance
class Mammal:
    def walk(self):
        print("walk")
    

class Dog(Mammal): #inherit method from Mammal class
    pass #python doesn't like empty class
    

class Cat(Mammal):
    def be_annoying(self):
        print("annoying")


dog1 = Dog()
dog1.walk()

cat1 = Cat()
cat1.be_annoying()

            