def solution(n):
    answer = 0
    
    for i in str(n):
        answer += int(i);
    
    return answer

s = solution(123)
print(s)
