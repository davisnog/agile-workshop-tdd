package br.com.caelum.tdd.exercicio2;

public class NotaFiscalDaoSqlServer implements NotaFiscalDao {
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("salva nf no banco");
	}

}
