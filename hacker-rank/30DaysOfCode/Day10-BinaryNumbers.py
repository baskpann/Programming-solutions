#!/bin/python3

if __name__ == __main__:
    n = int(input())
    tmp = []
    cnt = 0
    count = []
    while n > 0:
        tmp.append(n % 2)
        n //= 2
    binary = tmp[::-1]
    for i in binary:
        if i == 1:
            cnt = cnt + 1
            count.append(cnt)
        else:
            cnt = 0
    print(max(count))
