package OrientacaoAObjeto;

public class MensagemDoDia {
	
	public static void mensagemDoDia(int a) {
		switch (a) {
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("BOM DIA!");
				break;
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
				System.out.println("BOA TARDE!");
				break;
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("BOA NOITE!");
				break;
			default:
				System.out.println("Opcao invalida.");
				break;
		}
	}

}
