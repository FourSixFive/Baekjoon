n = int(input())
List = []
while n > 1:
    for i in range(2, n+1):
        if n % i == 0:
            List.append(i)
            n = n//i
            break
for i in List:
    print(i)