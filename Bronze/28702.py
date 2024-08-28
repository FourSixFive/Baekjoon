List = []
for i in range(3):
    temp = input()+str(i+1)
    temp2 = temp[0:len(temp)-1]
    if temp2 != 'Fizz':
        if temp2 != 'Buzz':
            if temp2 != 'FizzBuzz':
                List.append(temp)

big = 0
result = 0
for i in List:
    temp = int(i[len(i)-1:len(i)+1])
    if int(big) < temp:
        big = i

last = int(big[len(big)-1:len(big)+1])
if last == 1:
    result = int(big[0:len(big)-1])+3
elif last == 2:
    result = int(big[0:len(big)-1])+2
elif last == 3:
    result = int(big[0:len(big)-1])+1

if result % 3 == 0 and result % 5 == 0:
    print('FizzBuzz')
elif result % 3 == 0:
    print('Fizz')
elif result % 5 == 0:
    print('Buzz')
else:
    print(result)