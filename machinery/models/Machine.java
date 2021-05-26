package ua.lviv.iot.machinery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import ua.lviv.iot.machinery.enums.FuelType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Machine {
	private String model;
	private String wheelFormula;
	private double mileage;
	private double fuelConsumptionPerHour;
	private FuelType fuelType;
}
