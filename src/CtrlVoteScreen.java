public class CtrlVoteScreen {
    private SimplePoll enquete;

    public CtrlVoteScreen(SimplePoll enquete) {
        this.enquete = enquete;
    }

    public void registerVote(int opcao) {
        enquete.votar(opcao);
    }
}