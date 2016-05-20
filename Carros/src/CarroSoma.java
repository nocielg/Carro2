
public class CarroSoma extends CarrodeCorrida {
//teste
	private double potencia;
	public CarroSoma(String nome,double potencia, int velocidadeMaxima) {
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
