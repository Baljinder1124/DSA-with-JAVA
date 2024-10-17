num = input("Enter number ")
c = 0
for i in range(1 , num):
     if (num%i == 0):
        c = c+1
if(c==2):
    print(num,"is prime.")
else:
    print(num,"is not prime.")