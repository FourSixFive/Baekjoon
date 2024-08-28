import sys
input = sys.stdin.readline
while True:
    excel = str(input())
    excel.replace('R', ' ')
    excel.replace('C', ' ')
    print(excel)