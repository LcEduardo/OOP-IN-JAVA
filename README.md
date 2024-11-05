# 🚀 Bem-vindo ao meu Projeto de Estudo de Programação Orientada a Objetos (POO)! 🎓

Neste repositório, estou explorando conceitos fundamentais de POO como herança, polimorfismo, encapsulamento e interfaces. 💻✨ A cada commit, você encontrará exemplos práticos e explicações detalhadas para ajudar no entendimento dessas técnicas essenciais para o desenvolvimento em Java. Vamos juntos aprimorar nossas habilidades de programação! 🚀👩‍💻

## Classe e Objetos:
- **Classes** é um modelo, molde, uma planta de um prédio.
- O **objeto** é sua instância (concretização do molde).

![Classe.png](img%2FClasse.png)

Os objetos tem **atributos** e **métodos**.

- **Atributo**: cor da casa, tamanho, quantas janelas e etc.
- **Métodos**: comportamentos, ações.

Uma classe pode ter vários objetos. Pense na classe Casa, cada casa construída em cada esquina, rua e bairro é um objeto que vem da mesma classe, mas com suas peculiares diferentes.

### Encapsulamento:

Serve para obtermos:

- **Proteção dos dados:** protege o estado interno da classe. Atributos privados não podem ser modificados.
- **Controle de acesso:** controlar como são acessados e modificados (``getter`` e ``setter``).
- **Manutenção:** código interno não afeta código interno.

#### Privados e Públicos:

- Atributos privados (``private``): impede acesso a eles de fora da classe. Declarar atributos como públicos (`public`) permite que qualquer classe em qualquer pacote acesse e modifique esses atributos diretamente. Isso pode levar a vários problemas
- Métodos públicos: permite acesso controlado aos atributos privados.

#### Métodos getter e setter:

- ``getter``: métodos que permitem a leitura do valor de um atributo.
- ``setter``: métodos que permitem modificar o valor de um atributo, com validação para garantir a integridade dos dados.

### Código:

#### Inicializando:
```java
public static class Predio {

}
```

#### Atributos:
```java
// Atributos privados da classe Predio 
private String cor; // Cor do prédio 
private int andares; // Quantidade de andares no prédio 
private int janelas; // Quantidade de janelas no prédio
```

#### Métodos getters:
```java
// Método getter para o atributo 'cor' 
public String getCor(){ 
	return cor; // Retorna a cor do prédio 
} 

// Método getter para o atributo 'andares' 
public int getAndares(){ 
	return andares; // Retorna a quantidade de andares do prédio 
}
```

#### Métodos setters:
```java
// Método setter para o atributo 'cor' 
public void setCor(String cor){ 
	this.cor = cor; // Define uma nova cor para o prédio 3
} 

// Método setter para o atributo 'andares' 
public void setAndares(int andares){ 
	this.andares = andares; // Define uma nova quantidade de andares para o prédio 
}

```
#### Construtores:
```java
// Construtor da classe Predio
    public Predio(String cor, int andares, int janelas){
        
        this.cor = cor;
        this.andares = andares;
        this.janelas = janelas;
    }
```

Quando você cria um novo objeto de uma classe, o construtor define os valores iniciais dos atributos do objeto, garantindo que ele esteja em um estado consistente desde o início. Cada vez que você cria um novo objeto, o construtor é chamado para inicializar esse novo objeto com valores específicos, que podem ser diferentes de outros objetos da mesma classe.

#### Instanciação de objeto:

```java
Predio predio1 = new Predio("Amarelo", 10, 20);
```

## Herança

**Herança:** é basicamente uma forma de uma classe herdar métodos e atributos de outra classe. Dessa forma, podemos reutilizar o código já existente. 

![herança.png](img%2Fheran%C3%A7a.png)

Nesse exemplo, podemos observar que filho herdara as caraterísticas do pai. Todas as caraterísticas públicas, as privadas só serão acessadas pelos métodos ``get`` e ``set``.
- **Atenção:** a classe pai não tem acesso as características públicas da classe filho. Por isso, chama-se herança.

#### Por Exemplo:
```java
// Classe base
class Personagem {
    private String nome;
    private int idade;
}

// Classe derivada de Personagem
class Pirata extends Personagem {
    private String navio;

    public Pirata(String nome, int idade, String navio) {
        super(nome, idade);
        this.navio = navio;
    }
}

// Outra classe derivada de Personagem
class Marine extends Personagem {
    private String patente;

    public Marine(String nome, int idade, String patente) {
        super(nome, idade);
        this.patente = patente;
    }
}
```
código completo no arquivo src/Heranca.

- Classe pai é `Personagem`.
- Seus filhos são `Pirata` e `Marine`. Esses podem acessar nome e idade da classe personagem.
- `Pirata` então pode ter o `nome`, `idade` e `navio`.
- `Marine` então pode ter o `nome`, `idade` e `patente`.
- `Personagem` não pode acessar `navio` ou `patente`.

![Herança01.png](img%2FHeran%C3%A7a01.png)

## Polimorfismo

**Polimorfismo:** Que vem do termo _muitas formas_, em Java significa "um nome, mas muitas formas". Ele é uma forma de permitir que um único método se comporte de maneira diferente, dependendo do tipo específico do objeto que o chama.

**Por exemplo:** Pense em um show de talentos. Nesse show, temos cantores, mágicos e dançarinos. Sabemos que todos vão se apresentar, mas cada um fará isso de uma forma diferente. Basicamente, essa é uma analogia para o polimorfismo.

```java
// Classe base
class Personagem {
    void atacar() {
        System.out.println("O personagem ataca!");
    }
}

// Classe derivada: Luffy
class Luffy extends Personagem {
    @Override
    void atacar() {
        System.out.println("Luffy usa o Gum-Gum Pistol!");
    }
}

// Classe derivada: Zoro
class Zoro extends Personagem {
    @Override
    void atacar() {
        System.out.println("Zoro usa o Santoryu!");
    }
}

// Classe derivada: Sanji
class Sanji extends Personagem {
    @Override
    void atacar() {
        System.out.println("Sanji usa o Diable Jambe!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polimorfismo em ação
        Personagem personagem;

        personagem = new Luffy();
        personagem.atacar();  // Saída: Luffy usa o Gum-Gum Pistol!

        personagem = new Zoro();
        personagem.atacar();  // Saída: Zoro usa o Santoryu!

        personagem = new Sanji();
        personagem.atacar();  // Saída: Sanji usa o Diable Jambe!
    }
}

```

Nesse código, basicamente temos uma classe pai `Personagem` que possui um método `atacar()` que exibe na tela a mensagem "O personagem ataca". No entanto, observe que nas classes filhas esse mesmo método é redefinido, e cada personagem possui uma característica específica para o ataque.

Por exemplo, Luffy é um personagem que possui o poder da borracha, então seu ataque é "Gum-Gum Pistol". Já Zoro tem seu próprio ataque, e o Sanji também. Assim, podemos especificar o método `atacar()` em cada personagem com seu próprio poder, todos derivando do método principal.

O uso do `@Override` é para garantir que um classe filha vai sobrescrever o método da classe pai e não criar outro método, além de evitar erros de digitação.

#### Vantagens:
- **Simplifica o código:** por que em vez de duplicar o método para cada classe,  você pode ter uma interface comum e assim permitir que cada classe adicione sua exemplificação.
- **Códigos genéricos:** definirmos códigos que podem ser usados para diferentes tipos de objetos sem precisar saber de fato que classe é.

## Interfaces

### O que é?

Interfaces criam **assinaturas** de métodos e propriedades.

```java
public interface Fruta {
    public void qualFruta();
}
```
Observe que a `interface Fruta` tem um método `public void qualFruta()` que **não possui implementação**, apenas define o que deve ser feito. Isso é chamado de contrato, pois as classes (subtipos) que implementarem essa interface têm a obrigação de implementar todos os métodos que ela disponibiliza.

```java
public class Luffy extends Personagem implements Fruta {
    // Construtor da classe 'Luffy' que chama o construtor da superclasse 'Personagem'.
    public Luffy(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação do método 'qualFruta' da interface 'Fruta'.
    @Override
    public void qualFruta() {
        System.out.println("Luffy tem a Gomu-gomu no Mi");
    }
}
```
No exemplo acima, criamos uma **classe** `Luffy` que deriva de uma classe pai chamada `Personagem`, que por ora não nos interessa. Observe que utilizamos `implements` para estabelecer um contrato com a interface `Fruta`.

```java
// Implementação do método 'qualFruta' da interface 'Fruta'. 
@Override 
public void qualFruta() {     
	System.out.println("Luffy tem a Gomu-gomu no Mi"); 
}

```
Nessa parte do código da **classe** `Luffy` é onde implementamos o método definido na interface. Observe que a interface apenas especifica o que deve ser feito; a forma como isso é implementado fica a cargo das necessidades da classe ou subtipo que a utiliza. No caso, como ``Luffy`` tem a fruta *Gomu-gomu no Mi*, adaptamos essa informação ao método que diz qual é a fruta.

### Qual a diferença entre Classe e Interface?

![Interface01.png](img%2FInterface01.png)

**Classes:**
- Podem ter métodos com implementações completas;
- O uso do [[Polimorfismo]] para estender e modificar métodos;
- Reutilização de código;
- Classe filha;
- Herança;

**Interfaces:**
- Define apenas assinaturas de métodos;
- Não tem implementação própria;
- Flexibilidade;
- Subtipos;
- Contrato;

### Por que usar interfaces?

Em **Programação Orientada a Objetos** podemos nos deparar com um problema denominado **Herança Múltipla:** que o corre quando uma classe filha tem duas classes pais.

![interfaces02.png](img%2Finterfaces02.png)

A classe `Luffy` tem duas classes "pais": `Personagem` e `Fruta`. O problema nesse caso é que, se as classes "pais" tiverem um método com o mesmo nome, isso causará um conflito. O Java, por si só, não permite isso, e já impede a compilação do código, gerando uma mensagem de erro. Portanto, uma classe filha não pode herdar de duas classes "pais". Nesse contexto, entram as interfaces, pois uma classe pode herdar de uma classe pai e, ao mesmo tempo, estabelecer um contrato com uma interface, resolvendo assim esse problema.

```java
public class Luffy extends Personagem implements Fruta {
	// conteúdo
}
```

No exemplo acima, ``Luffy`` deriva de ``Personagem`` e tem contrato com a interface ``Fruta``.

## 