package de.fourteen.it.functionalvsobjectoriented.objectoriented.euklidischeralgorithmus;

import java.util.function.BiFunction;

import de.fourteen.it.functionalvsobjectoriented.objectoriented.math.Modulo;
import de.fourteen.it.functionalvsobjectoriented.objectoriented.rekursiveralgorithmus.RekursiverFall;

final class EaRekursiverFall implements RekursiverFall<EaInputParameter> {

    private final BiFunction<Integer, Integer, Integer> berechnungVonR;

    EaRekursiverFall(BiFunction<Integer, Integer, Integer> berechnungVonR) {
        this.berechnungVonR = berechnungVonR;
    }

    EaRekursiverFall() {
        this(new Modulo());
    }

    @Override
    public EaInputParameter verarbeiteVorRekursiv(EaInputParameter i) {
        final int r = berechnungVonR.apply(i.a(), i.b());
		return new EaInputParameter(i.b(), r);
    }

}
