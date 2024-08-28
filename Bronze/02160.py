import sys
from dataclasses import replace

input = sys.stdin.readline
n = int(input())

List = []
for i in range(n):

    painting = ''
    for j in range(5):
        painting += input()
    painting = painting.replace('\n','')
    List.append(str(i+1)+painting)

maximum = 0
result = []
for i in range(n):
    for j in range(i+1,n):
        count = 0
        for k in range(1, 36):
            # print(List[i][k], List[j][k])
            if List[i][k] == List[j][k]:
                count += 1

        if count > maximum:
            maximum = count
            result.clear()
            result.append(List[i][0])
            result.append(List[j][0])
        print('i, j : ', i, j)
        print('count : ', count)
        print('result : ', result)
print(*result)