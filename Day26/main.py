actRetDay = list(map(int, input().split(' ')))
expDay = list(map(int, input().split(' ')))

fine = 0
if expDay[2] < actRetDay[2]:
    fine = 10000
elif expDay[2] == actRetDay[2]:
    if actRetDay[1] > expDay[1]:
        fine = (actRetDay[1] - expDay[1]) * 500
    elif actRetDay[1] == expDay[1] and actRetDay[0] > expDay[0]:
        fine = (actRetDay[0] - expDay[0]) * 15

print(fine)