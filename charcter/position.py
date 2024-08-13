n=int(input())
a=0
b=1
for i in range(1,n):
    temp=a+b
    a=b
    b=temp
    print(a)
