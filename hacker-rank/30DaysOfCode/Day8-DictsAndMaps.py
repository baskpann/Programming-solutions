# Enter your code here. Read input from STDIN. Print output to STDOUT
import sys

n = int(input())
pb = dict()

for _ in range(n):
    tmp = [x for x in input().split()]
    pb[tmp[0]] = tmp[1]

for line in sys.stdin:
    msg = line.rstrip().split()
    tmp = msg[0]
    if tmp in pb:
        print(tmp+ = + pb[tmp])
    else:
        print(Not found)
