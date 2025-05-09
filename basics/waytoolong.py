n = int(input())
l = []
for i in range(n):
    l.append(input())
ans = []
for i in l:
    size = len(i)
    if size > 10:
        ans.append(i[0]+str(size-2)+i[-1])
    else:
        ans.append(i)

for i in ans:
    print(i)