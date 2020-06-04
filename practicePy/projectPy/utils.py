#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Apr 10 16:07:09 2020

@author: Ada
"""

def find_max(number_list):
    max_num = number_list[0]
    for number in number_list:
        if number > max_num:
            max_num = number
    return max_num