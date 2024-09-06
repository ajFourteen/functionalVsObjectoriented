package de.fourteen.it.functionalvsobjectoriented.objectoriented.euklidischeralgorithmus;

import de.fourteen.it.functionalvsobjectoriented.objectoriented.rekursiveralgorithmus.RekursiverAlgorithmus;

final class EuklidischerAlgorithmusInternImpl implements EuklidischerAlgorithmusIntern {

	private final RekursiverAlgorithmus<EaInputParameter, Integer> delegate = new RekursiverAlgorithmus<>(
			new EaAbbruchbedingung(),
			new EaBasisfall(),
			new EaRekursiverFall());

	@Override
	public int berechneDenGgtVon(final EaInputParameter i) {
		return delegate.berechneRekursiv(i);
	}

}