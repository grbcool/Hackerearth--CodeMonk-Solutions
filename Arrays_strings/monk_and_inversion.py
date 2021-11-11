t = int(input())
for _ in range(t):
    n =int(input())
    mat = [list(map(int,input().split())) for i in range(n)]
    count =0
    for i in range(n):
        for j in range(n):
            for k in range(i,n):
                for l in range(j,n):
                    if mat[i][j]>mat[k][l]:
                        count+=1
    print(count)                    
