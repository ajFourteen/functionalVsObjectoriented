package de.fourteen.it.functionalvsobjectoriented;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import de.fourteen.it.functionalvsobjectoriented.funktional.euklidischerAlgorithmus.EuklidischerAlgorithmus;
import de.fourteen.it.functionalvsobjectoriented.funktional.euklidischerAlgorithmus.EuklidischerAlgorithmusFunktional;
import de.fourteen.it.functionalvsobjectoriented.naiv.EuklidischerAlgorithmusNaiv;
import de.fourteen.it.functionalvsobjectoriented.objectoriented.euklidischeralgorithmus.EuklidischerAlgorithmusFacade;
import de.fourteen.it.functionalvsobjectoriented.objectoriented.euklidischeralgorithmus.EuklidischerAlgorithmusObjektorientiert;

final class GgtBerechnungTest {
    private static final int A = 289;
    private static final int B = 323;
    private static final int EXPECTED_GGT = 17;

    @Test
    void ggtBerechnungNaiv() {
        EuklidischerAlgorithmusNaiv sut = new EuklidischerAlgorithmusNaiv();

        final int actualGgt = sut.berechneDenGgtVon(A, B);

        assertThat(actualGgt).isEqualTo(EXPECTED_GGT);
    }

    @Test
    void ggtBerechnungObjectorientiert() {
        EuklidischerAlgorithmusObjektorientiert sut = new EuklidischerAlgorithmusFacade();

        final int actualGgt = sut.berechneDenGgtVon(A, B);

        assertThat(actualGgt).isEqualTo(EXPECTED_GGT);
    }

    @Test
    void ggtBerechnungFunktional() {
        EuklidischerAlgorithmusFunktional sut = EuklidischerAlgorithmus::berechneDenGgtVon;

        final int actualGgt = sut.apply(A, B);

        assertThat(actualGgt).isEqualTo(EXPECTED_GGT);
    }
}
