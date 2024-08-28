import sys
input = sys.stdin.readline
n, blackjack = map(int, input().split())
List = list(map(int, input().split()))

result = 0
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            c = List[i]+List[j]+List[k]
            if c > blackjack:
                continue
            else:
                if result < c:
                    result = c
print(result)