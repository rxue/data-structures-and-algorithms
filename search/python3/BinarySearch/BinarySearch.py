def binarySearch(e:int, nums:list) -> int:
    low = 0
    high = len(nums)
    while low <= high:
        i = (low + high)//2
        if nums[i] == e:
            return i
        elif nums[i] > e:
            high = i
        else:
            low = i