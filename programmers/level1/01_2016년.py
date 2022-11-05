def solution(a, b):
    answer = ''

    days = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    dates = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    tot_days = 0

    for i in range(0, a - 1):
        tot_days += days[i]

    tot_days += b

    answer = str(dates[tot_days % 7 - 1])

    return answer


s = solution(5, 24)
print(s)
