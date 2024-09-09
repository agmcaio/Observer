import java.util.Scanner;

public class VoteScreen {
    private SimplePoll enquete;
    private CtrlVoteScreen controlador;

    public VoteScreen(SimplePoll enquete) {
        this.enquete = enquete;
        this.controlador = new CtrlVoteScreen(enquete);
    }

    public void show() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                System.out.println("Vote em uma opção (ou digite 'sair' para encerrar):");

                for (int i = 0; i < enquete.getOptions().size(); i++) {
                    System.out.println(i + ": " + enquete.getOptions().get(i));
                }

                String entrada = scanner.next();

                if (entrada.equalsIgnoreCase("sair")) {
                    continuar = false;
                } else {
                    try {
                        int opcao = Integer.parseInt(entrada);

                        if (opcao >= 0 && opcao < enquete.getOptions().size()) {
                            controlador.registerVote(opcao);
                        } else {
                            System.out.println("Opção inválida. Tente novamente.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, insira um número ou 'sair' para encerrar.");
                    }
                }
            }
        }

        System.out.println("Enquete encerrada. Obrigado por votar!");
    }
}
