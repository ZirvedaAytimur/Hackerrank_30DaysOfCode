#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        nk = input().split()

        n = int(nk[0])

        k = int(nk[1])

        max = -sys.maxsize - 1
        for i in range(1, n):
            for j in range(i + 1, n + 1):
                if (i & j) < k and (i & j) > max:
                    max = i & j
        print(max)