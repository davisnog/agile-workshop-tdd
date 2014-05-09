package br.com.caelum.tdd.exercicio1;

public enum Cargo {
	DESENVOLVEDOR (new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteECincoPorCento()),
	TESTER(new QuinzeOuVinteECincoPorCento()),
	GERENTE_PROJETOS(new QuinzeOuVinteECincoPorCentoGerente());
	
	private CalculoDeImposto calculo;

	private Cargo(CalculoDeImposto calculo){
		this.calculo = calculo;
	}
	
	public CalculoDeImposto getCalculo() {
		return calculo;
	}
}
