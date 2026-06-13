public class day82 {
    enum LANGUAGE{
        EN("English"),
        TA("Tamil"),
        GR("German"),
        JP("Japanese");

        String description;
        LANGUAGE(String description){
            this.description = description;
        }
    }
    static void main(){
        System.out.println(LANGUAGE.EN.description);
    }
}
