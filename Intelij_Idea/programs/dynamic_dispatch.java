// Method run time pr decide ho rha hai konsa run hoga as object run-time pr banta hai
 class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class dynamic_dispatch {
    public static void main(String[] args) {
        Phone obj = new Phone(); // Allowed
        SmartPhone smobj = new SmartPhone(); // Allowed

        Phone obj1 = new SmartPhone(); // Yes it is allowed

        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj1.on(); // SmartPhone wala on chalega..
        // obj.music(); Not Allowed


    }
}
