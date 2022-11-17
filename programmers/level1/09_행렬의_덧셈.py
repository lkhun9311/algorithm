def solution(arr1, arr2):
    answer = []

    for i in range(len(arr1)):
        arr_result = []
        for j in range(len(arr1[0])):
            arr_result.append(arr1[i][j] + arr2[i][j])
        answer.append(arr_result)

    return answer


s = solution([[1, 2], [2, 3]], [[3, 4], [5, 6]])
print(s)
