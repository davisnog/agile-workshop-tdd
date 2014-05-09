package br.com.caelum.tdd.exercicio2;

public class SapComunicador implements Sap {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("envia nf pro sap");
	}

}
