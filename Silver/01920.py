import sys
input = sys.stdin.readline
n = int(input())
set_a = set(map(int, input().split()))
m = int(input())
List_a = list(map(int, input().split()))

for i in List_a:
    if set_a.__contains__(i):
        print(1)
    else:
        print(0)