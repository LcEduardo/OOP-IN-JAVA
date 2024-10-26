package Exceptions;

public class Step1 {
    public static void main(String[] args) {
        Pessoa lucas = new Pessoa("Lucas", 3.49);
        Pessoa rafa = new Pessoa("Rafael", 1);

        lucas.Hello();

        try{
            lucas.validarNome(lucas.getName());
        } catch (ErrorName e){
            System.out.println(e.getMessage());
        }

        // Dividindo
        try {
            double resul = 0;
            if (rafa.getMoney() == 0){
                throw new ArithmeticException("Calma lá");
            }
            resul = 100 / rafa.getMoney();
        } catch (ArithmeticException e) {
            System.out.println("Valor zero não né pae.");
            // Exibir detalhes do erro (opcional)
            System.out.println("Detalhes do erro: " + e.getMessage());
        }
    }
}
