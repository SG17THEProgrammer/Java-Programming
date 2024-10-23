
interface BANK1{
     int getRateOfInterest();
}
 class Axis1 implements BANK1{
     public int getRateOfInterest(){
        return 1;
     }
}
class Sbi1 implements BANK1{
    public int getRateOfInterest(){
        return 2;
    }
}
class Pnb1 implements BANK1{
    public int getRateOfInterest() {
        return 3;
    }
}

class que10{
    public static void main(String args[]){
//        Axis1 b=new Axis1();
//        int interest=b.getRateOfInterest();
//        System.out.println("Rate of Interest is: "+interest+" %");
//
//        sbi b1=new sbi();
//        interest=b1.getRateOfInterest();
//        System.out.println("Rate of Interest is: "+interest+" %");
//
//        pnb b2=new pnb();
//        interest=b2.getRateOfInterest();
//        System.out.println("Rate of Interest is: "+interest+" %");

                            //or

        Sbi1 b= new Sbi1();
        Axis1 b1 = new Axis1();
        Pnb1 b2 = new Pnb1();
        System.out.println("SBI = "+b.getRateOfInterest());
        System.out.println("Axis = "+b1.getRateOfInterest());
        System.out.println("PNB = "+b2.getRateOfInterest());

    }
}


