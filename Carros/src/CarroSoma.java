
public class CarroSoma extends CarrodeCorrida {
//teste
	private int potencia;
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.nome = nome;
		this.potencia = potencia;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}
	
	@Override
	public void acelerar(){
		velocidade+=potencia;
		if (velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;
	}

}
