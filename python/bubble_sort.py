#!/usr/bin/env python
# -*- coding:utf-8 -*-
#########################################################################
# File Name: bubble_sort.py
# Author: Wang Biwen
# mail: wangbiwen88@126.com
# Created Time: 2016.06.06
#########################################################################

import random

def bubble_sort(nums):
    length = len(nums)
    for i in range(length-1):
        for j in range(length-1, i, -1):
            if nums[j] < nums[j-1]:
                nums[j], nums[j-1] = nums[j-1], nums[j]
    return nums


def test():
    lst = random.sample(range(100), 20)
    print lst
    sort_lst = bubble_sort(lst)
    print sort_lst

if __name__ == '__main__':
    test()
