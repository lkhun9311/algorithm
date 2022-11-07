
def solution(arr):
    answer = 0

    num = 0

    for i in range(len(arr)):
        num += arr[i]

    answer = num / len(arr)

    return answer


s = solution([1,2,3,4])
print(s)
