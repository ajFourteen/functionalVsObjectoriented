package de.fourteen.it.functionalvsobjectoriented.naiv;

public final class EuklidischerAlgorithmusNaiv {

    public int berechneDenGgtVon(final int a, final int b) {
        if (a < 0) return berechneDenGgtVon(Math.abs(a), b);
        if (b < 0) return berechneDenGgtVon(a, Math.abs(b));
        if (a < b) return berechneDenGgtVon(b, a);
        assert a >= b && b >= 0;
        if (b == 0) return Math.abs(a);
        final int r = a % b;
        if (r == 0) return b;
        return berechneDenGgtVon(b, r);
    }
}