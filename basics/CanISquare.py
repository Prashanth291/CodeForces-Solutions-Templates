import math
import sys
input = sys.stdin.read

data = input().split()
index = 0

t = int(data[index])
index += 1

for _ in range(t):
    n = int(data[index])
    index += 1
    nums = list(map(int, data[index:index + n]))
    index += n

    total = sum(nums)
    root = int(math.isqrt(total)) 
    if root * root == total:
        print("YES")
    else:
        print("NO")
