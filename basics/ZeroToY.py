def main():
    t = int(input())
    for _ in range(t):
        xy = list(map(int,input().split()))
        x = xy[0]# 3 42
        y = xy[1]
        steps = 0
        pow_ = [1] * 10
        for i in range(1, 10):
            pow_[i] = pow_[i - 1] * 10

        while y != 0:
            
            if y >= x:
                for i in range(9, -1, -1):
                    if y >= (x * pow_[i]):
                        y -= (x * pow_[i])
                        break
            else:
                steps+=y
                break
            
            steps += 1
        print(steps)

if __name__ == "__main__":
    main()
