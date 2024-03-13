import java.io.Console;

interface Product{
    void Title();
    void Price();
    void Rate();
}

interface User{
    void Login(String login);
    void Password(String password);
}

class Employee implements User{
    public String name;
    private String login;
    private String password;

    Employee(String name){
        this.name = name;
    }

    public void Login(String login){
        this.login = login;
    }

    public void Password(String password){
        this.password = password;
    }
}

class Client implements User{
    public String name;
    private String login;
    private String password;

    Client(String name){
        this.name = name;
    }

    public void Login(String login){
        this.login = login;
    }

    public void Password(String password){
        this.password = password;
    }
}

class Admin implements User{
    public String name;
    private String login;
    private String password;

    Admin(String name){
        this.name = name;
    }

    public void Login(String login){
        this.login = login;
    }

    public void Password(String password){
        this.password = password;
    }
}

class Milk implements Product{
    public String title;
    public double price;
    public int rate;

    Milk(String title, double price, int rate){
        this.title = title;
        this.price = price;
        this.rate = rate;
    }

    public void Title(){
        System.out.println(title);
    }

    public void Price(){
        System.out.println(price);
    }

    public void Rate(){
        System.out.println(rate);
    }
}

class Bread implements Product{
    public String title;
    public double price;
    public int rate;

    Bread(String title, double price, int rate){
        this.title = title;
        this.price = price;
        this.rate = rate;
    }

    public void Title(){
        System.out.println(title);
    }

    public void Price(){
        System.out.println(price);
    }

    public void Rate(){
        System.out.println(rate);
    }
}

class Water implements Product{
    public String title;
    public double price;
    public int rate;

    Water(String title, double price, int rate){
        this.title = title;
        this.price = price;
        this.rate = rate;
    }

    public void Title(){
        System.out.println(title);
    }

    public void Price(){
        System.out.println(price);
    }

    public void Rate(){
        System.out.println(rate);
    }
}

class Worker implements Product, User{

    Product product;
    public String name;
    private String login;
    private String password;

    Worker(String name){
        this.name = name;
    }

    public void Login(String login){
        this.login = login;
    }

    public void Password(String password){
        this.password = password;
    }

    public void Print(Product product){
        this.product = product;
        System.out.println(this.name);
        Title();
        Price();
        Rate();
    }

    public void Title(){
        product.Title();
    }

    public void Price(){
        product.Price();
    }

    public void Rate(){
        product.Rate();
    }

}

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk("Молоко", 100, 5);
        milk.Rate();

        Bread bread = new Bread("Хлеб", 30, 4);
        Water water = new Water("Вода", 20, 5);

        Employee employee = new Employee("Tom");
        employee.Login("mail1@mail.ru");
        employee.Password("1234567");

        Client client = new Client("Tim");

        Admin admin = new Admin("Admin");

        Worker worker = new Worker("Tomas");
        worker.Print(bread);
    }
}
