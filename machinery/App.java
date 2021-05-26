package ua.lviv.iot.machinery;

import ua.lviv.iot.machinery.models.Machine;
import ua.lviv.iot.machinery.models.Loader;
import ua.lviv.iot.machinery.models.Snowcat;
import ua.lviv.iot.machinery.enums.Material;
import ua.lviv.iot.machinery.enums.SortOrder;
import ua.lviv.iot.machinery.manager.MachineryManager;
import ua.lviv.iot.machinery.enums.FuelType;
import java.util.List;
import ua.lviv.iot.machinery.manager.MachineryManager;

public class App {
    public static void main(String[] args) {
    	List<Machine> machines = List.of(
    			new Machine("Model-1", "5x2", 5.35, 6.2, FuelType.Diesel),
    			new Loader("Model-2", "4x2", 5.2, 6.0, FuelType.Gas, 2.3, 2.5),
    			new Snowcat("Model-3", "5x2.1", 5.2, 6.0, FuelType.Gas, 2.3, Material.Aluminum)
    			);
    	MachineryManager machineManager = new MachineryManager(machines);
    	System.out.println(machineManager.searchByMileage(5.2));
    	System.out.println(machineManager.searchByFuelType(FuelType.Diesel));
    	System.out.println(machineManager.sortByMileage(SortOrder.ASC));
    	System.out.println(machineManager.sortByFuelConsumptionPerHour(SortOrder.DESC));
    	
    }
}