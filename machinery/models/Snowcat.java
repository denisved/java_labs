package ua.lviv.iot.machinery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.machinery.enums.FuelType;
import ua.lviv.iot.machinery.enums.Material;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Snowcat extends Machine {
	private double bucketScopeInMeters;
	public Material material;
	
	public Snowcat(final String model, final String wheelFormula, final double mileage, final double fuelConsumptionPerHour,
			final FuelType fuelType, double bucketScopeInMeters, Material material) {
		super(model, wheelFormula, mileage, fuelConsumptionPerHour, fuelType);
		this.bucketScopeInMeters = bucketScopeInMeters;
		this.material = material;
	}
}
