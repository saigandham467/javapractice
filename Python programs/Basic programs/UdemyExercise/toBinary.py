"""

print('enter the value of n')
n=int(input())
"""

import numpy as np
def toBinary(n):
    if n>1:
        toBinary(n//2)
    print(n % 2, end=' ')

toBinary(100)