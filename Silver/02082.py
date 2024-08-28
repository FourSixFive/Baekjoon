import sys
input = sys.stdin.readline

clock = []
for i in range(5):
    temp = input().split()
    clock.append(temp)
clock2 = []
for i in range(4):
    temp = ''
    for j in range(5):
        temp += clock[j][i]
    clock2.append(temp)

numbers = {0:'####.##.##.####', 1:'..#..#..#..#..#', 2:'###..#####..###', 3:'###..####..####', 4:'#.##.####..#..#', 5:'####..###..####', 6:'####..####.####', 7:'###..#..#..#..#', 8:'####.#####.####', 9:'####.####..####'}

profit = []
for i in clock2:
    maximum = 0
    temp = ''
    for j in range(len(numbers)):
        count = 0
        for k in range(15):
            if i[k] == numbers[j][k]:
                count += 1
        if maximum < count:
            maximum = count
            for l, v in numbers.items():
                if v == numbers[j]:
                    temp = l
            print(count)
    profit.append(temp)
    print(profit)