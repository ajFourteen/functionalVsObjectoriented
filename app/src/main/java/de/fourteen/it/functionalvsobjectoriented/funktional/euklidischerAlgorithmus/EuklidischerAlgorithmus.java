package de.fourteen.it.functionalvsobjectoriented.funktional.euklidischerAlgorithmus;

import static de.fourteen.it.functionalvsobjectoriented.funktional.math.Modulo.modulo;
import static de.fourteen.it.functionalvsobjectoriented.funktional.rekursiverAlgorithmus.RekursiverAlgorithmus.rekursiv;

import java.util.function.Function;

public final class EuklidischerAlgorithmus {

	private EuklidischerAlgorithmus() {
	}

	public static int berechneDenGgtVon(final int a, final int b) {
		return berechneDenGgtIntern(new EaInputParameter(a, b));
	}

	static int berechneDenGgtIntern(EaInputParameter input) {
		return rekursiv(
				EuklidischerAlgorithmus::abbruchbedingung,
				EuklidischerAlgorithmus::basisfall,
				EuklidischerAlgorithmus::vorRekursiveVerarbeitung)
				.apply(input);
	}

	static boolean abbruchbedingung(EaInputParameter i) {
		return i.b() == 0;
	}

	static int basisfall(EaInputParameter i) {
		return i.a();
	}

	static EaInputParameter vorRekursiveVerarbeitung(EaInputParameter i) {
		return ((Function<EaInputParameter, EaInputParameter>) EaParameterTransformator::transformiereParameter)
				.andThen(EuklidischerAlgorithmus::berechneR)
				.andThen(EuklidischerAlgorithmus::ersetzeADurchB)
				.andThen(EuklidischerAlgorithmus::ersetzeBDurchR)
				.apply(i);
	}

	static EaInternalParameter berechneR(EaInputParameter i) {
		return new EaInternalParameter(i.a(), i.b(), modulo(i.a(), i.b()));
	}

	static EaInternalParameter ersetzeADurchB(EaInternalParameter i) {
		return new EaInternalParameter(i.b(), i.b(), i.r());
	}

	static EaInputParameter ersetzeBDurchR(EaInternalParameter i) {
		return new EaInputParameter(i.a(), i.r());
	}
}
