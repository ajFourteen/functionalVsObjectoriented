package de.fourteen.it.functionalvsobjectoriented.objectoriented.euklidischeralgorithmus;

import de.fourteen.it.functionalvsobjectoriented.objectoriented.rekursiveralgorithmus.Abbruchbedingung;

final class EaAbbruchbedingung implements Abbruchbedingung<EaInputParameter> {

	@Override
	public boolean istErfüllt(EaInputParameter i) {
        return i.b() == 0;
	}
	
}
