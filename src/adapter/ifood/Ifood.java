package adapter.ifood;

import java.util.ArrayList;
import java.util.List;

public class Ifood {

    List<ItemComida> itens = new ArrayList<>();

    public void adicionarItens(ItemComida item) {
        itens.add(item);
    }
}
