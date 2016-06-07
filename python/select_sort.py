#!/usr/bin/env python
# -*- coding:utf-8 -*-
#########################################################################
# File Name: select_sort.py
# Author: Wang Biwen
# mail: wangbiwen88@126.com
# Created Time: 2016.06.07
#########################################################################

import random

def select_sort(nums):
    length = len(nums)
    min_index = 0
    for i in range(length - 1):
        min_index = i
        for j in range(i + 1, length):
            if nums[j] < nums[min_index]:
                min_index = j
        if min_index != i:
            nums[i], nums[min_index] = nums[min_index], nums[i]
    return nums

def test():
    lst = random.sample(range(100), 20)
    print lst
    sort_lst = select_sort(lst)
    print sort_lst

if __name__ == '__main__':
    test()
