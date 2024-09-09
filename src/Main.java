public class Main {
    public static void main(String[] args) {
        SimplePoll poll = new SimplePoll();
        
        ResultScreen resultScreen = new ResultScreen(poll);
        PercentageResultScreen percentageScreen = new PercentageResultScreen(poll);

        System.out.println("Vamo tomar uma?");

        poll.addOpcao("Sim");
        poll.addOpcao("Claro");

        VoteScreen votationScreen = new VoteScreen(poll);
        votationScreen.show();
    }
}
