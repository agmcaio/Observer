import interfaces.Poll;

import java.util.ArrayList;
import java.util.List;

public class SimplePoll {
    private List<String> options = new ArrayList<>();
    private List<Integer> voteList = new ArrayList<>();
    private List<Poll> listeners = new ArrayList<>();

    public void addOpcao(String opcao) {
        options.add(opcao);
        voteList.add(0);
        disparaNovaOpcao();
    }

    public void votar(int opcaoIndex) {
        if (opcaoIndex >= 0 && opcaoIndex < voteList.size()) {
            voteList.set(opcaoIndex, voteList.get(opcaoIndex) + 1);
            disparaNovoVoto();
        }
    }

    public List<String> getOptions() {
        return options;
    }

    public List<Integer> getVotes() {
        return voteList;
    }

    public void addEnqueteListener(Poll listener) {
        listeners.add(listener);
    }

    private void disparaNovoVoto() {
        for (Poll listener : listeners) {
            listener.vote();
        }
    }

    private void disparaNovaOpcao() {
        for (Poll listener : listeners) {
            listener.options();
        }
    }
}
