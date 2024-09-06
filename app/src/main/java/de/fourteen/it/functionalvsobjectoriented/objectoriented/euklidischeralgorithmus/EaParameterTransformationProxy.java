package de.fourteen.it.functionalvsobjectoriented.objectoriented.euklidischeralgorithmus;

final class EaParameterTransformationProxy implements EuklidischerAlgorithmusIntern {

    private final EuklidischerAlgorithmusIntern delegate;

    EaParameterTransformationProxy(EuklidischerAlgorithmusIntern realEuklidischerAlgorithmus) {
        this.delegate = new EaParameterTransformationAbsoluteWerteProxy(
                new EaParameterTransformationAGrößerBProxy(realEuklidischerAlgorithmus));
    }

    @Override
    public int berechneDenGgtVon(final EaInputParameter i) {
        return delegate.berechneDenGgtVon(i);
    }

}

final class EaParameterTransformationAbsoluteWerteProxy implements EuklidischerAlgorithmusIntern {
    private final EuklidischerAlgorithmusIntern realEuklidischerAlgorithmus;

    EaParameterTransformationAbsoluteWerteProxy(EuklidischerAlgorithmusIntern realEuklidischerAlgorithmus) {
        this.realEuklidischerAlgorithmus = realEuklidischerAlgorithmus;
    }

    @Override
    public int berechneDenGgtVon(final EaInputParameter i) {
        final int absA = Math.abs(i.a());
        final int absB = Math.abs(i.b());
        return this.realEuklidischerAlgorithmus.berechneDenGgtVon(new EaInputParameter(absA, absB));
    }

}

final class EaParameterTransformationAGrößerBProxy implements EuklidischerAlgorithmusIntern {
    private final EuklidischerAlgorithmusIntern realEuklidischerAlgorithmus;

    EaParameterTransformationAGrößerBProxy(EuklidischerAlgorithmusIntern realEuklidischerAlgorithmus) {
        this.realEuklidischerAlgorithmus = realEuklidischerAlgorithmus;
    }

    @Override
    public int berechneDenGgtVon(final EaInputParameter i) {
        final int newA = Math.max(i.a(), i.b());
        final int newB = Math.min(i.a(), i.b());
        return this.realEuklidischerAlgorithmus.berechneDenGgtVon(new EaInputParameter(newA, newB));
    }

}
