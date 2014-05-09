package br.com.caelum.tdd.exercicio1;

public class QuinzeOuVinteECincoPorCento implements CalculoDeImposto {

	@Override
	public double calcular(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		}
		else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}

}
