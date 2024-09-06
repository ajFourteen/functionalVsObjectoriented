package de.fourteen.it.functionalvsobjectoriented.objectoriented.euklidischeralgorithmus;

import de.fourteen.it.functionalvsobjectoriented.objectoriented.rekursiveralgorithmus.Basisfall;

final class EaBasisfall implements Basisfall<EaInputParameter, Integer> {

    @Override
    public Integer berechneTrivialeLösung(EaInputParameter i) {
        return i.a();
    }

}
