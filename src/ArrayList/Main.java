package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pirata op1 = new Pirata("Luffy");
        Pirata op2 = new Pirata("Zoro");
        Pirata op3 = new Pirata("Nami");

        // Criando um ArrayList redimensionavel
        ArrayList<String> names = new ArrayList<>();

        // Adicionando elementos no ArrayList
        names.add(op1.getNome());
        names.add(op2.getNome());
        names.add(op3.getNome());

        // Exibir elementos
        System.out.println(names);
        System.out.println(names.get(1));

        // Alterando o nome de um objeto
        names.set(1, "Usopp");
        System.out.println(names.get(1));

        // Remover um elemento
        names.remove(1);
        System.out.println(names.get(1));

    }
}
