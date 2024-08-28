import sys
input = sys.stdin.readline
n = int(input())
time = list(map(int, input().split()))
time.sort()
result = 0
for i in range(len(time)):
    temp = 0
    for j in range(i+1):
        temp += time[j]
    result += temp
print(result)