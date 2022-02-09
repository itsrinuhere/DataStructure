def binarysearch(low,high,key):
    if(low == high):
        if(value[low]==key):
            return key 
    else:
        return 0
        
    return key
    
if __name__ == '__main__':
    value = []
    n = int(input("enter size:\t"))
    for i in range(0,n):
        value.append(int(input("Enter  value :\t")))
    key = int(input("Enter search key:\t"))    
    print(binarysearch(0,0-(n+1)/2,key))
