package Study.lesson7;

public class Main {

    public static void main(String[] args) {

        Member volodymyr = new Member("Volodymyr", "Poroshenko", 25,1, 1978, "president@gmail.com", "0666131200", 83,90,130,7301);
        Member stepan = new Member("Stepan", "Giga", 1,1,1909,"oun@ukr.net", "0660070777", 68,80,120,1328);
        Member kirill = new Member("Kirill","Stremousov", 1,4,1988, "kill@gmail.com", "0981022022", 78,70,110,14000);

        volodymyr.printAccountInfo();
        stepan.printAccountInfo();
        kirill.printAccountInfo();

        System.out.println("");

        volodymyr.setSurname("Zelensky");
        stepan.setSurname("Bandera");
        kirill.setWeight(39);
        kirill.setLowPressure(0);
        kirill.setHighPressure(0);

        volodymyr.printAccountInfo();
        stepan.printAccountInfo();
        kirill.printAccountInfo();

        System.out.println("Hello Git");
    }
}
