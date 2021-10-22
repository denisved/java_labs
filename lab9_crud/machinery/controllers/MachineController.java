package ua.lviv.iot.machinery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.machinery.models.Machine;
import ua.lviv.iot.machinery.service.MachineService;


@RestController
@RequestMapping(path = "/machine")
public final class MachineController {
	@Autowired
	private MachineService machineService;

	@GetMapping(path = "/{id}")
	public ResponseEntity<Machine> getMachine(@PathVariable Integer id) {
		if (machineService.getMachine(id) != null) {
			return new ResponseEntity<>(machineService.getMachine(id), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
	@GetMapping
	public ResponseEntity<List<Machine>> getMachines() {
		return new ResponseEntity<>(machineService.getMachines(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Machine> createMachine(@RequestBody final Machine machine) {
		return new ResponseEntity<>(machineService.addMachine(machine), HttpStatus.CREATED);
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Machine> updateMachine(@PathVariable final Integer id, 
			@RequestBody final Machine machine) {
		if (machineService.getMachinesMap().containsKey(id)) {
			return new ResponseEntity<>(machineService.updateMachine(id, machine), HttpStatus.OK);
		}
		else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	@DeleteMapping(path = "/{id}")
    public ResponseEntity<Machine> deleteMachine(@PathVariable Integer id) {
        if (machineService.getMachinesMap().containsKey(id)) {
            return new ResponseEntity<>(machineService.deleteMachine(id), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}