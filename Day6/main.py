if __name__ == '__main__':
    tests = int(input())

    for a0 in range(0, tests):
        s = input()
        first = ""
        second = ""

        for i in range(0, len(s)):
            if (i % 2) == 0:
                first += s[i]
            else: second += s[i]

        print(first, second)