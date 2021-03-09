package com.xunfos.comparison.java.i_safe;


import java.util.List;
import java.util.Objects;

public class iii_extensions {
    public static void main(String[] args) {
        final Float sum = BOARDGAME_LIST.stream()
                .filter(game -> game.numberOfPlayers > 1)
                .filter(game -> game.getMinimumAge() >= 10)
                .map(game -> game.price)
                .reduce(0f, Float::sum);

        System.out.printf("Sum was %f", sum);
    }

    private static List<Boardgame> BOARDGAME_LIST = List.of(
            new Boardgame(2, 10, 99, "Bohnanza", 123.0f),
            new Boardgame(6, 18, 56, "Cards against Humanity", 420.69f)
    );

    private static class Boardgame {
        private int numberOfPlayers;
        private int minimumAge;
        private int maximumAge;
        private String name;
        private float price;

        public Boardgame(final int numberOfPlayers, final int minimumAge, final int maximumAge, final String name, final float price) {
            this.numberOfPlayers = numberOfPlayers;
            this.minimumAge = minimumAge;
            this.maximumAge = maximumAge;
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public int getNumberOfPlayers() {
            return numberOfPlayers;
        }

        public void setNumberOfPlayers(final int numberOfPlayers) {
            this.numberOfPlayers = numberOfPlayers;
        }

        public int getMinimumAge() {
            return minimumAge;
        }

        public void setMinimumAge(final int minimumAge) {
            this.minimumAge = minimumAge;
        }

        public int getMaximumAge() {
            return maximumAge;
        }

        public void setMaximumAge(final int maximumAge) {
            this.maximumAge = maximumAge;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(final float price) {
            this.price = price;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Boardgame boardgame = (Boardgame) o;
            return numberOfPlayers == boardgame.numberOfPlayers && minimumAge == boardgame.minimumAge && maximumAge == boardgame.maximumAge && Float.compare(boardgame.price, price) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(numberOfPlayers, minimumAge, maximumAge, price);
        }

        @Override
        public String toString() {
            return "Boardgame{" +
                    "numberOfPlayers=" + numberOfPlayers +
                    ", minimumAge=" + minimumAge +
                    ", maximumAge=" + maximumAge +
                    ", price=" + price +
                    '}';
        }
    }
}
