import sys

if __name__ == "__main__":
    inputs = int(input())
    phoneBook = {}

    for i in range(inputs):
        contact = input().split()
        phoneBook[contact[0]] = contact[1]

    lines = sys.stdin.readlines()
    for i in lines:
        name = i.strip()
        if name in phoneBook:
            print(name + '=' + str(phoneBook[name]))
        else:
            print('Not found')