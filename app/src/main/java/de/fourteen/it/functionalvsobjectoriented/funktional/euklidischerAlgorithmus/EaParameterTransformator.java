package de.fourteen.it.functionalvsobjectoriented.funktional.euklidischerAlgorithmus;

final class EaParameterTransformator {

	static EaInputParameter transformiereParameter(EaInputParameter i) {
		return aGrößerGleichB(absoluteWerte(i));
	}

	private static EaInputParameter absoluteWerte(EaInputParameter i) {
		return new EaInputParameter(Math.abs(i.a()), Math.abs(i.b()));
	}

	private static EaInputParameter aGrößerGleichB(EaInputParameter i) {
		return new EaInputParameter(Math.max(i.a(), i.b()), Math.min(i.a(), i.b()));
	}
}