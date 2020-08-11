import sys

if __name__ == '__main__':
    n = int(input())
    count = 0
    maxValue = -sys.maxunicode - 1

    while n > 0:
        if n % 2 == 1:
            count += 1
            if count > maxValue:
                maxValue = count
        else:
            count = 0

        n //= 2

    print(maxValue)