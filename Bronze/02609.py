a, b = map(int, input().split())
List_a = []
List_b = []
set = set()
LCM = 1
GCM = 1
while True:
    for i in range(2, a+1):
        if a % i == 0:
            List_a.append(i)
            set.add(i)
            a //= i
            break
    if a == 1:
        break
while True:
    for i in range(2, b+1):
        if b % i == 0:
            List_b.append(i)
            set.add(i)
            b //= i
            break
    if b == 1:
        break
List_set = list(set)

for i in List_set:
    if i in (List_a and List_b):
        if List_a.count(i) >= List_b.count(i):
            LCM *= i ** List_a.count(i)
            GCM *= i ** List_b.count(i)
        else:
            LCM *= i ** List_b.count(i)
            GCM *= i ** List_a.count(i)
    elif i in (List_a or List_b):
        if i in List_a:
            LCM *= i ** List_a.count(i)
        else:
            LCM *= i ** List_b.count(i)
if GCM == 0:
    GCM = 1
print(GCM)
print(LCM)
