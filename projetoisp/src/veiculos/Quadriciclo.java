package veiculos;

/**
 * 
 * @author Dione
 *
 */
public class Quadriciclo implements IVeiculo, IVeiculoQuadriciclo {

	private double motor;
	private String cor;
	private String ano;
	private int bancos;

	public Quadriciclo(double motor, String cor, String ano, int bancos) {

		configuracaoQuadriciclo(motor, cor, ano, bancos);
	}

	@Override
	public void configuracaoQuadriciclo(double motor, String cor, String ano, int bancos) {

		this.motor = motor;
		this.cor = cor;
		this.ano = ano;
		this.bancos = bancos;

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<EXPECIFICAÇÃO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Produção de Quadriciclos. Motor: " + motor + "  Cor: " + cor + "  Ano: " + ano
				+ "  Bancos: " + bancos);

		startVeiculo();

	}

	@Override
	public void startVeiculo() {
		System.out.println("Motores funcionando!");
	}
}