package entities;

public class Produto {
    public String nome;
    public double preco;
    public double desconto;
//Nao precisa receber nenhum paremtro pois dentro do objeto produto, já tem tudo que é necessário. 
    public double precoComDesconto(double descontoDoGerente) { //Calcular preço
        return preco * (1 - desconto - descontoDoGerente);
    }
}
