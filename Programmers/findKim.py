def solution(seoul):
    for i in range(len(seoul)):
        if seoul[i] == "Kim":
            index = i
    answer = '김서방은 %d에 있다' %index
    return answer

#index 함수를 사용하는게 더 좋아보임