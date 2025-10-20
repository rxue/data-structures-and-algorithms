def merge(L1:list[int], L2:list[int]) -> list[int]:
    """
    Suppose we have two lists L1 and L2 that contain integers which are sorted in ascending order.

    Create a function merge that gets these lists as parameters and returns a new sorted list L that has all the elements of L1 and L2.

    So, len(L) should equal to len(L1)+len(L2). Do this using the fact that both lists are already sorted.

    You can’t use the sorted function or the sort method in implementing the merge method. You can however use these sorted in the main function for creating inputs to the merge function.

    :param L1:
    :param L2:
    :return: sorted merged list of L1 and L2
    """
    idx1 = idx2 = 0
    result = []
    while idx1 < len(L1) or idx2 < len(L2):
        if idx1 <len(L1) and idx2 <len(L2):
            if L1[idx1] < L2[idx2]:
                result.append(L1[idx1])
                idx1 += 1
            elif L2[idx2] < L1[idx1]:
                result.append(L2[idx2])
                idx2 += 1
            else:
                result.append(L1[idx1])
                idx1 += 1
                result.append(L2[idx2])
                idx2 += 1
        elif idx1 == len(L1) and idx2 < len(L2):
            result.append(L2[idx2])
            idx2 += 1
        elif idx2 == len(L2) and idx1 < len(L1):
            result.append(L1[idx1])
            idx1 += 1
    return result
