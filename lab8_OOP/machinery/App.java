package ua.lviv.iot.machinery;

import ua.lviv.iot.machinery.models.Machine;
import ua.lviv.iot.machinery.models.Loader;
import ua.lviv.iot.machinery.models.Snowcat;
import ua.lviv.iot.machinery.enums.Material;
import ua.lviv.iot.machinery.enums.SortOrder;
import ua.lviv.iot.machinery.enums.FuelType;
import ua.lviv.iot.machinery.manager.MachineryManager;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Machine> machines = List.of(
				new Machine("Model-1", "5x2", 105, 2,
						FuelType.Diesel),
				new Loader("Model-2", "4x2", 125, 2.5,
						FuelType.Gas, 500000, 45.25),
				new Snowcat("Model-3", "5x2.1", 200.5, 3.0,
						FuelType.Gasoline, 1.5,
						Material.Aluminum));
		MachineryManager machineManager = new MachineryManager(
				machines);
		System.out.println(
				machineManager.searchByMileage(105.0));
		System.out.println(machineManager
				.searchByFuelType(FuelType.Gas));
		System.out.println(machineManager
				.sortByMileage(SortOrder.ASC));
		System.out.println(
				machineManager.sortByFuelConsumptionPerHour(
						SortOrder.DESC));

	}
}