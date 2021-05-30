package ua.lviv.iot.machinery.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope; 

import lombok.Getter;
import ua.lviv.iot.machinery.models.Machine;

@Service
@ApplicationScope
public class MachineService {
	
	private AtomicInteger id = new AtomicInteger(0);
	
	@Getter
	private Map<Integer, Machine> machinesMap = new HashMap<Integer, Machine>();
	
	public List<Machine> getMachines() {
        return machinesMap.values().stream().collect(Collectors.toList());
    }
	
    public Machine getMachine(final Integer id) {
    	return machinesMap.get(id);
    }

    public Machine addMachine(final Machine machine) {
        machine.setId(id.incrementAndGet());
        machinesMap.put(machine.getId(), machine);
        return machine;
    }

    public Machine updateMachine(final Integer id, final Machine machine) {
        machine.setId(id);
        return machinesMap.put(id, machine);
    }

    public Machine deleteMachine(final Integer id) {
        return machinesMap.remove(id);
    }
}