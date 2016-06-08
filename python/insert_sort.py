#!/usr/bin/env python
# -*- coding:utf-8 -*-
#########################################################################
# File Name: insert_sort.py
# Author: Wang Biwen
# mail: wangbiwen88@126.com
# Created Time: 2016.06.07
#########################################################################

import random

def insert_sort(nums):
    length = len(nums)
    for i in range(1, length):
        temp = nums[i]
        j = i
        while j > 0 and nums[j - 1] > temp:
            nums[j] = nums[j - 1]
            j -= 1
        nums[j] = temp
    return nums

def test():
    lst = random.sample(range(100), 100)
    print lst
    sort_lst = insert_sort(lst)
    print sort_lst

if __name__ == '__main__':
    test()

