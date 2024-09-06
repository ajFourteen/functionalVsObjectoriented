package de.fourteen.it.functionalvsobjectoriented.funktional.rekursiverAlgorithmus;

import java.util.function.Function;

public final class RekursiverAlgorithmus {

    private RekursiverAlgorithmus() {
    }

    public static <I, R> Function<I, R> rekursiv(
            Function<I, Boolean> abbruchbedingung,
            Function<I, R> basisfall,
            Function<I, I> vorRekursiveVerarbeitung) {
        return (I i) -> abbruchbedingung.apply(i)
                ? basisfall.apply(i)
                : vorRekursiveVerarbeitung.andThen(rekursiv(abbruchbedingung, basisfall, vorRekursiveVerarbeitung)).apply(i);
    }

}
