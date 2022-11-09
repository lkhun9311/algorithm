def solution(n):
    answer = 0

    for i in range(1, n):
        if n % i == 1:
            answer = i
            break

    return answer


s = solution(10)
print(s)
