package Study.lesson7;

public class Member {
    private final String name;
    private String surname;
    private final int day, month, year;
    private final String mail, phone;
    private int weight, lowPressure, highPressure, steps, age;

    public Member(String name, String surname, int day, int month, int year, String mail, String phone, int weight, int lowPressure, int highPressure, int steps) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.mail = mail;
        this.phone = phone;
        this.weight = weight;
        this.lowPressure = lowPressure;
        this.highPressure = highPressure;
        this.steps = steps;
        this.age = 2022 - year;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String getMail() {
        return mail;
    }
    public String getPhone() {
        return phone;
    }
    public int getWeight() {
        return weight;
    }
    public int getLowPressure() {
        return lowPressure;
    }
    public int getHighPressure() {
        return highPressure;
    }
    public int getSteps() {
        return steps;
    }
    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setLowPressure(int lowPressure) {
        this.lowPressure = lowPressure;
    }
    public void setHighPressure(int highPressure) {
        this.highPressure = highPressure;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }
    public void printAccountInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", weight=" + weight +
                ", lowPressure=" + lowPressure +
                ", highPressure=" + highPressure +
                ", steps=" + steps +
                ", age=" + age +
                '}';
    }
}
