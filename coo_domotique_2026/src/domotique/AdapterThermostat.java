package domotique;

import thermos.Thermostat;

public class AdapterThermostat implements Appareil {

	private Thermostat thermos;

	/**
	 * creation adpateur
	 * 
	 * @param st
	 *            thermostat a adpater
	 */
	public AdapterThermostat(Thermostat st) {
		this.thermos = st;
	}

	@Override
	public void allumer() {
		this.thermos.monterTemperature();
	}

	@Override
	public void eteindre() {
		this.thermos.baisserTemperature();
	}

	public String toString(){
		return this.thermos.toString();
	}
}
