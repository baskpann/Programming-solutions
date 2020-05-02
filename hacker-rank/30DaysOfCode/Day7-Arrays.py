#!/bin/python3

if __name__ == __main__:
    n = int(input())

    arr = list(map(int, input().rstrip().split()))
    rev = arr[::-1]
    for i in rev:
        print(i, end = )
