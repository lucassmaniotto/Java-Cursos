package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Performance {
    TO_BE_DESIRED {
        @Override
        public BigDecimal percentReajust() {
            return new BigDecimal("0.03");
        }
    }, GOOD {
        @Override
        public BigDecimal percentReajust() {
            return new BigDecimal("0.15");
        }
    }, GREAT {
        @Override
        public BigDecimal percentReajust() {
            return new BigDecimal("0.20");
        }
    }, ESPECTACULAR {
        @Override
        public BigDecimal percentReajust() {
            return new BigDecimal("0.40");
        }
    };
    
    public abstract BigDecimal percentReajust();
}
