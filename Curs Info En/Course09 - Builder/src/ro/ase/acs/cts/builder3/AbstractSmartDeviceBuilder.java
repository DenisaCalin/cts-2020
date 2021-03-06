package ro.ase.acs.cts.builder3;

import ro.ase.acs.cts.SmartDevice;
import ro.ase.acs.cts.module.InterfataDisplay;
import ro.ase.acs.cts.module.InterfataExternalMemory;
import ro.ase.acs.cts.module.InterfataGPS;

public abstract class AbstractSmartDeviceBuilder {
	public abstract void adaugaWiFi(boolean areWiFi);
	public abstract void adaugaGPS(InterfataGPS modulGPS);
	public abstract void adaugaDisplay(InterfataDisplay display);
	public abstract void adaugaSDCard(InterfataExternalMemory cardMemorie);
	public abstract SmartDevice getDispozitiv();
}
