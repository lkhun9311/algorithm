def solution(a, b):
    return sum(list(range(min(a, b), max(a, b) + 1)))


s = solution(3, 3)
print(s)
