x = int(input())

arr = []
while(x!=0):
    arr.append(x%10)
    x=x//10

arr.reverse()
if 9 - arr[0] !=0 :
    arr[0] = min(arr[0],9-arr[0])

for i in range(1,len(arr)):
    arr[i] = min(arr[i],9-arr[i])

ans = 0

for i in arr:
    ans = ans*10 + i

print(ans)