package br.com.caelum.tdd.exercicio1;

public enum Cargo {
	DESENVOLVEDOR (new DezOuVintePorCento()),
	DBA(new DezOuVintePorCento()),
	TESTER(new DezOuVintePorCento()),
	GERENTE_PROJETOS(new DezOuVintePorCento());
	
	private CalculoDeImposto calculo;

	private Cargo(CalculoDeImposto calculo){
		this.calculo = calculo;
	}
	
	public CalculoDeImposto getCalculo() {
		return calculo;
	}
}
