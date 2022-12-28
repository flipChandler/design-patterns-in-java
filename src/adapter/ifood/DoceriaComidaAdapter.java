package adapter.ifood;

public class DoceriaComidaAdapter implements ItemComida {

    private ItemDoceria item;

    public DoceriaComidaAdapter(ItemDoceria item) {
        this.item = item;
    }

    @Override
    public String getNomeItem() {
        return getNomeItem();
    }

    @Override
    public String getPrecoItem() {
        return getPrecoItem();
    }

    @Override
    public String getNomeRestaurante() {
        return item.getNomeLoja();
    }
}
