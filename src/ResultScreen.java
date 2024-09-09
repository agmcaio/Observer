import interfaces.Poll;

public class ResultScreen implements Poll {
    private SimplePoll poll;

    public ResultScreen(SimplePoll enquete) {
        this.poll = enquete;
        enquete.addEnqueteListener(this);
    }

    @Override
    public void vote() {
        showResult();
    }

    @Override
    public void options() {
        showResult();
    }

    public void showResult() {
        System.out.println("Resultado parcial:");
        for (int i = 0; i < poll.getOptions().size(); i++) {
            System.out.println(poll.getOptions().get(i) + ": " + poll.getVotes().get(i) + " votos");
        }
    }
}
