package Exceptions;

public class Pessoa {
    private String name;
    private double money;

    public Pessoa(String name, double valor){
        this.name = name;
        this.money = valor;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void Hello(){
        System.out.println("Hello my name is " + name + " How are you today?");
    }

    public void validarNome(String name) throws ErrorName{
        if(!name.equals("Lucas")){
            throw new ErrorName();
        }

        System.out.println("Nome está correto!");
    }
}
