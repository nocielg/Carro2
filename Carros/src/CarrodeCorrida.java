
public abstract class CarrodeCorrida {

	/**
	 * @param args
	 */
	public CarrodeCorrida (String nome, int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}

	public abstract void acelerar();

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;

	public int getVelocidade() {
		return velocidade;
	}

	public void frear() {
		velocidade = velocidade/2;
	}

	public String getNome() {
		return nome;
	}
	/*void imprimir(){
		System.out.println("O carro" +nome+ "está a velocidade de"+getVelocidade()+"km/h");
		
	}
	*/

}
