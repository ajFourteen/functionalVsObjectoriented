package de.fourteen.it.functionalvsobjectoriented.objectoriented.euklidischeralgorithmus;

public final class EuklidischerAlgorithmusFacade implements EuklidischerAlgorithmusObjektorientiert {

    private final EuklidischerAlgorithmusIntern euklidischerAlgorithmus = new EaParameterTransformationProxy(
            new EuklidischerAlgorithmusInternImpl());

    @Override
    public int berechneDenGgtVon(final int a, final int b) {
        return this.euklidischerAlgorithmus.berechneDenGgtVon(new EaInputParameter(a, b));
    }

}
