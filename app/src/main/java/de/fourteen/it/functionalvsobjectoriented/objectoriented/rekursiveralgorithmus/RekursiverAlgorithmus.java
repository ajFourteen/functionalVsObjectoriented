package de.fourteen.it.functionalvsobjectoriented.objectoriented.rekursiveralgorithmus;

public final class RekursiverAlgorithmus<I, R> {

    private final Abbruchbedingung<I> abbruchbedingung;
    private final Basisfall<I, R> basisfall;
    private final RekursiverFall<I> rekursiverFall;

    public RekursiverAlgorithmus(
            Abbruchbedingung<I> abbruchbedingung,
            Basisfall<I, R> basisfall,
            RekursiverFall<I> rekursiverFall) {
        this.abbruchbedingung = abbruchbedingung;
        this.basisfall = basisfall;
        this.rekursiverFall = rekursiverFall;
    }

    public R berechneRekursiv(I i) {
        if (abbruchbedingung.istErfüllt(i))
            return basisfall.berechneTrivialeLösung(i);
        return berechneRekursiv(rekursiverFall.verarbeiteVorRekursiv(i));
    }
}