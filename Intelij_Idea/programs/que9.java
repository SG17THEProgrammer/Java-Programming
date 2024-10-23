abstract class bank{
    abstract int getRateOfInterest();
}
class Sbi extends bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends bank{
    int getRateOfInterest() {
        return 5;
    }
}

class que9{
    public static void main(String args[]){
        bank b=new Sbi();
        int interest=b.getRateOfInterest();
        System.out.println("Rate of Interest is: "+interest+" %");

        bank b1=new PNB();
        interest=b1.getRateOfInterest();
        System.out.println("Rate of Interest is: "+interest+" %");

    }}


