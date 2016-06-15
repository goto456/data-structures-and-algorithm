#!/usr/bin/env python
# -*- coding:utf-8 -*-
#########################################################################
# File Name: quick_sort.py
# Author: Wang Biwen
# mail: wangbiwen88@126.com
# Created Time: 2016.06.07
#########################################################################

import random

def partition(nums, left, right):
    if left >= right:
        return nums
    length = len(nums)
    print left
    pivot_value = nums[left]
    while left < right:
        while nums[right] >= pivot_value and left < right:
            right -= 1
        if left < right:
            nums[left] = nums[right]
            left += 1
        while nums[left] <= pivot_value and left < right:
            left += 1
        if left < right:
            nums[right] = nums[left]
            right -= 1
    nums[left] = pivot_value
    return left

def quick_sort(nums, left, right):
    pivot_pos = partition(nums, left, right)
    quick_sort(nums, pivot_pos + 1, right)
    quick_sort(nums, left, pivot_pos - 1)
    return nums

def test():
    nums = random.sample(range(100), 20)
    print nums
    print quick_sort(nums, 0, len(nums) - 1)

if __name__ == '__main__':
    test()

