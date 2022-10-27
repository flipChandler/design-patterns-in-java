package strategy.transportadora.solution;

import strategy.transportadora.solution.frete.Normal;
import strategy.transportadora.solution.frete.Sedex;

public enum ETipoFrete {

    NORMAL {
        @Override
        public Frete obterFrete() {
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Frete obterFrete() {
            return new Sedex();
        }
    };

    public abstract Frete obterFrete();     // metodo abstratom dentro de um enum, cada um tem que implementar esse metodo
}
