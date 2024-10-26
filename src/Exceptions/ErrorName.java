package Exceptions;

public class ErrorName extends Exception{
    public ErrorName(){
        super("Nome escrito errado pae!");
    }

    public ErrorName(String message){
        super(message);
    }
}
