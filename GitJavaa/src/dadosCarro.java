
public class dadosCarro {
	private String marca;
	private String modelo;
	private String consuQl;
	private float vlrMercado;
	private int anoFab;
	private int qtdKm;
	private int qtdLitro;
	private int consuKm;
	private double vlrcarPor;
	private double vlrcarOri;
	private double porce;
	private int anoCarro;
	//----------------------------------------
	public int getAnoCarro() {
		return anoCarro;
	}
	public void setAnoCarro(int anoCarro) {
		if (anoCarro > 2023) {
			System.out.println("Usado");
		}
		else if(anoCarro == 2023) {
			System.out.println("Seminovo");
		}
			else if(anoCarro == anoFab) {
				System.out.println("Novo");
			
		}else {
			
		}
		
		this.anoCarro = anoCarro;
	}
	public double getVlrcarOri() {
		return vlrcarOri;
	}
	public void setVlrcarOri(double vlrcarOri) {
		this.vlrcarOri = vlrcarOri;
	}
	public int getQtdKm() {
		return qtdKm;
	}
	public void setQtdKm(int qtdKm) {
		this.qtdKm = qtdKm;
	}
	public int getQtdLitro() {
		return qtdLitro;
	}
	public void setQtdLitro(int qtdLitro) {
		this.qtdLitro = qtdLitro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getConsuQl() {
		return consuQl;
	}
	public void setConsuQl(String consuQl) {
		
		this.consuQl = consuQl;
	}
	public float getVlrMercado() {
		return vlrMercado;
	}
	public void setVlrMercado(float vlrMercado) {
		this.vlrMercado = vlrMercado;
	}
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	public int retornaConsumo(){
		this.consuKm=(this.qtdKm/this.qtdLitro);
		return consuKm;
	}	
	public double retornaPorcentagem() {
		this.porce=(this.vlrcarOri*0.05);
		this.vlrcarPor=(this.vlrcarOri-this.porce);
		return vlrcarPor;
	}	
	public void imprimirConteudo(){
		
		System.out.println("Marca do veiculo: " + this.getMarca() + "\nModelo do veiculo: " + this.getModelo() +
				"\nQuilometragem do veiculo: "+ this.getConsuQl() + "\nValor do veiculo: " + this.getVlrMercado() + 
				"\nAno de fabricação do veiculo: " + this.getAnoFab() + "\nConsumo por KM: " + this.retornaConsumo() +
				"\nValor com porcentagem de venda: " + retornaPorcentagem());
        	
	}

}
