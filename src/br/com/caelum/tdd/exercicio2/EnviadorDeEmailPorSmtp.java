package br.com.caelum.tdd.exercicio2;

public class EnviadorDeEmailPorSmtp implements EnviadorDeEmail {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("envia email da nf " + notaFiscal.getId());
	}

}
