package ua.lviv.iot.machinery.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.lviv.iot.machinery.models.Machine;
import ua.lviv.iot.machinery.enums.FuelType;
import ua.lviv.iot.machinery.enums.SortOrder;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class MachineryManager {
	private List<Machine> machines;

	public List<Machine> searchByMileage(
			final double mileage) {
		return machines.stream().filter(
				machine -> machine.getMileage() == mileage)
				.collect(Collectors.toList());
	}

	public List<Machine> searchByFuelType(
			final FuelType fuelType) {
		return machines.stream()
				.filter(machine -> machine
						.getFuelType() == fuelType)
				.collect(Collectors.toList());
	}

	private List<Machine> getMachines(
			final SortOrder sortOrder,
			final Comparator<Machine> comparing) {
		if (sortOrder.equals(SortOrder.ASC)) {
			return machines.stream().sorted(comparing)
					.collect(Collectors.toList());
		}
		return machines.stream()
				.sorted(comparing.reversed())
				.collect(Collectors.toList());
	}

	public List<Machine> sortByMileage(
			final SortOrder sortOrder) {
		return getMachines(sortOrder,
				Comparator.comparing(Machine::getMileage));
	}

	public List<Machine> sortByFuelConsumptionPerHour(
			final SortOrder sortOrder) {
		return getMachines(sortOrder, Comparator
				.comparing(Machine::getFuelConsumption));
	}
}
