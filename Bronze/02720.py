import sys
input = sys.stdin.readline
n = int(input())
for i in range(n):
    changes = int(input())
    Quarter = 0
    Dime = 0
    Nickel = 0
    Penny = 0
    while changes > 0:
        print(changes)
        if changes >= 25:
            Quarter += 1
            changes -= 25
        elif changes >= 10:
            Dime += 1
            changes -= 10
        elif changes >= 5:
            Nickel += 1
            changes -= 5
        elif changes >= 1:
            Penny += 1
            changes -= 1
    print(Quarter, Dime, Nickel, Penny)