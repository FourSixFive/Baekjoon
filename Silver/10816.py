import sys
input = sys.stdin.readline
n = int(input())
List_a = list(map(int, input().split()))

List = dict()
for i in List_a:
    if i in List.keys():
        List[i] = List[i] + 1
    else:
        List[i] = 1
m = int(input())
List_b = list(map(int, input().split()))

for i in List_b:
    if i in List.keys():
        print(List[i], end = " ")
    else:
        print(0, end = " ")