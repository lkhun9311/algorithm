#https://www.acmicpc.net/problem/10773
testCases = int(input())

stack = list()
for testCase in range(testCases):
    x = int(input())
    if x == 0:
        if len(stack) != 0:
            stack.pop()
            continue
        elif x == 0 & len(stack) == 0:
            print("Error - stack is empty")
            continue
    stack.append(x)

#sum() 사용 - list의 원소들의 합 출력
print(sum(stack))
