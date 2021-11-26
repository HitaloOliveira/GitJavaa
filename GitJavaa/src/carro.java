
public class carro {
	public static void main(String args[]) {
		dadosCarro dc = new dadosCarro();
		
		dc.setMarca("Chevrolet");
		dc.setModelo("Cruze");
		dc.setConsuQl("100 KM");
		dc.setVlrMercado(80000);
		dc.setQtdKm(100);
		dc.setQtdLitro(10);
		dc.setAnoFab(2021);
		dc.setVlrcarOri(80000);
		dc.imprimirConteudo();
		dc.setAnoCarro(2023); 
	}

}

