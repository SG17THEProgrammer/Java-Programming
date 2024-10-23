class Palindrome{
    public static void main(String args[]){
        int r,sum=0,temp;
        int x=-121;

        temp=x;
        while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(temp==sum)
            System.out.println("true");
        else
            System.out.println("false");
    }
}  