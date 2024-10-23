public class Check_if_connector_is_connected_or_not {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Class Found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
    }
}