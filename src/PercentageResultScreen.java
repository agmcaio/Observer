import interfaces.Poll;

public class PercentageResultScreen implements Poll {
    private SimplePoll poll;

    public PercentageResultScreen(SimplePoll poll) {
        this.poll = poll;
        poll.addEnqueteListener(this);
    }

    @Override
    public void vote() {
        showPercentageResults();
    }

    @Override
    public void options() {
        showPercentageResults();
    }

    public void showPercentageResults() {
        int totalVotos = poll.getVotes().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Resultado percentual:");
        for (int i = 0; i < poll.getOptions().size(); i++) {
            double percentual = (totalVotos > 0) ? (poll.getVotes().get(i) * 100.0 / totalVotos) : 0;
            System.out.println(poll.getOptions().get(i) + ": " + percentual + "%");
        }
    }
}
