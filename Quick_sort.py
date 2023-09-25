import pandas as pd

file = 'inupt_quick_sort.xlsx'

df = pd.read_excel(file, header=None)
resort = df.values

def Quick_sort(arr, start, end):
    left = start
    right = end
    pivot = int((right-left)/2)
    temp = arr[pivot]
    arr[pivot] = arr[left]
    arr[left] = temp
    pivot = temp

    while True:
        if(arr[left] <= pivot):
            left+=1
        elif(arr[right] > pivot):
            right-=1
        else:
            temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            left+=1
            right-=1
        if(left >= right):
            temp = arr[start]
            arr[start] = arr[right]
            arr[right] = temp
            break
    if(right-start>0):
        Quick_sort(arr, start, right-1)
    if(end-right>0):
        Quick_sort(arr, right+1, end)
    
        
Quick_sort(resort, 0, len(resort)-1)    

print(resort)