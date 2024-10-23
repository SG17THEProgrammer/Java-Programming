public class if_else_1 {
    public static void main(String[] args) {
        int age=35;
        String city="Patna";
        if ((city=="Delhi") && (age>20 && age <30 )) {
            System.out.println("Sales Manager delhi ncr");
        }

             else if ((city=="Mumbai")&&(age>20 && age<30)) {
            System.out.println("Sales Manager Mumbai");
        }
                else if ((city!="Delhi")&&(city!="Mumbai") &&(age>20 && age<30)){
            System.out.println("Associate Sales Manager");
            }
                else if ((city=="Agra")&&(age>30 &&age<40) ){
            System.out.println("Manger Operation agra");
        }
                else if((city=="Mathura")&&(age>30 &&age<40)){
            System.out.println("Manger Operation Mathura");
        }
                else if((city!="Delhi")&&(city!="Mumbai")&&(city!="Agra")&&(city!="Mathura")&&(age>30 && age<40)){
            System.out.println("Assistant Manager operations");
        }
    }

}
