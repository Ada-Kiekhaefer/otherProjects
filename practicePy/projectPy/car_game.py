#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Apr  7 17:27:49 2020

@author: Ada
"""

  
command = ""
started = False
stopped = False

while True:
    command = input(">").lower()
    if command == "help":
        print("""
start - to start the car")
print("stop - to stop the car")
print("quit - to exit
        """)
    elif command == "start":
        if started:
            print("Car is already started!")
        else:
            started = True
            print("Car started...Ready to go!")
            
    elif command == "stop":
        if not started:
            print("Car is already stop")
        else:
            started = False
            print("Car stopped!")
            
    elif command == "quit":
        break        
    else:
        print("I don't understand that")

    