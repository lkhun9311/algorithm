def solution(phone_number):
    answer = ''
    input = phone_number;
    number = len(input[:-4]);
    output = "*" * number + input[-4:];
    
    answer = output
    
    return answer

s = solution("01033334444")
print(s)
