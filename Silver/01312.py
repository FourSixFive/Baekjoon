import sys
input = sys.stdin.readline
a, b, n = map(int, input().split())

cnt = 0
result = 0
while cnt <= n:
    if a < b:
        a *= 10

    div = a//b
    quo = a%b
    a = quo
    result = div

    cnt += 1

print(result)