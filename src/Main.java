public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();

        String message = "";
        for(int i = 0; i < 200; i++)
            message += "statetsttdeteet";
        myBox.printMessageInBox(message);

        myBox.setWidth(60);
        myBox.printMessageInBox("pioshpojwpoejfpjpojnpvfvfopofejjwopejfowemjpofjwpeojfwpeojfpowejfowempowpfjwjo" +
                "pioshpojwpoejfpjpojnpvfvfopofejjwopejfowemjpofjwpeojfwpeojfpowejfowempowpfjwjo" +
                "pioshpojwpoejfpjpojnpvfvfopofejjwopejfowemjpofjwpeojfwpeojfpowejfowempowpfjwjo" +
                "pioshpojwpoejfpjpojnpvfvfopofejjwopejfowemjpofjwpeojfwpeojfpowejfowempowpfjwjo" +
                "pioshpojwpoejfpjpojnpvfvfopofejjwopejfowemjpofjwpeojfwpeojfpowejfowempowpfjwjo" +
                "jfwpeojfpowejfowempowpf");
    }
}
