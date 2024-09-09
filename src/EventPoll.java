public class EventPoll {
    private SimplePoll poll;
    private String opcao;

    public EventPoll(SimplePoll poll, String opcao) {
        this.poll = poll;
        this.opcao = opcao;
    }

    public SimplePoll getPool() {
        return poll;
    }

    public String getOption() {
        return opcao;
    }
}
