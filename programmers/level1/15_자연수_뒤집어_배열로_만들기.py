def solution(n):
    answer = [];
    
    for i in str(n):
        answer.append(int(i));
    
    answer.reverse();
    
    return answer

s = solution("12345")
print(s)
