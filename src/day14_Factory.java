public class day14_Factory {
    interface Notification {
        void send(String to, String message);
    }

    class EmailNotification implements Notification{

        @Override
        public void send(String to, String message) {
            System.out.println("Sending Email: "+message +", to "+to);
        }
    }
    class InstagramNotification implements Notification{

        @Override
        public void send(String to, String message) {
            System.out.println("Sending Instagram: "+message +", to "+to);
        }
    }

    static Notification getNotification(day14_Factory factory, String type){
        return switch (type){
            case "Email"-> factory.new EmailNotification();
            case "Instagram"-> factory.new InstagramNotification();
            default -> throw new IllegalArgumentException("Invalid notification type: "+type);
        };
    }

    static void main() {
        day14_Factory factory = new day14_Factory();
        String type = "Instagram";
        getNotification(factory, type).send("00000000000","I'm lasikaa");
    }
}