t = int(input())
dic = {}
mod = 1000000009
def count(n):
    if dic.get(n,False):
        return dic[n]
    if n==0:
        dic[0] = 1
        return dic[0]
    if n==1:
        dic[1] = 10
        return dic[1]

    temp1 = count(int(n/2))
    temp2 = count(int(n/2)-1)
    if (n & 1)==0:            
        dic[n] = (temp1*temp1 - temp2*temp2) % mod
    else:
        temp3 = count(int(n/2)+1)
        dic[n] = (temp3*temp1 - temp2*temp1) % mod
    return dic[n]        


for _ in range(t):
    n = int(input())
    if len(dic)>100000:
        dic={}
    print(count(n))
 
