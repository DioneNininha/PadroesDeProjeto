package veiculos;

/**
 * 
 * @author Dione
 *
 */
public class Diciclo implements IVeiculo, IVeiculoDiciclo {

	private double motor;
	private String cor;
	private String ano;

	public Diciclo(double motor, String cor, String ano) {

		configuracaoDiciclo(motor, cor, ano);
	}

	@Override
	public void configuracaoDiciclo(double motor, String cor, String ano) {

		this.motor = motor;
		this.cor = cor;
		this.ano = ano;

		System.out.println("Cria??o de um Diciclo: " + motor + " " + cor + " " + ano);

		startVeiculo();
	}



	@Override
	public void startVeiculo() {
	}
}
