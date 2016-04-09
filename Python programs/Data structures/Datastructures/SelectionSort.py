def select(seq, start):
    minIndex = start
    for j in range(start+1,len(seq)):
        if seq[minIndex] > seq[j]:
            minIndex = j
    return