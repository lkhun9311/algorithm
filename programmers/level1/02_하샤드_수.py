def solution(x):
    answer = True
    num = 0

    new_list = list(str(x))

    for i in range(len(new_list)):
        num += int(new_list[i])

    if x % num != 0:
        answer = False

    return answer


s = solution(10)
print(s)
