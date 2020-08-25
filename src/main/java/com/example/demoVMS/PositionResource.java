package com.example.demoVMS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoVMS.domain.vesselPosition.VesselPositionDTO;
import com.example.demoVMS.domain.vesselPosition.VesselPositionViewModel;

@RestController
@RequestMapping(PositionResource.baseUrl)
public class PositionResource {
	public static final String baseUrl = "api/positions";
	
	/**
	 * Every demo project needs a "hello world" function :)
	 * @return "Hello world"
	 */
	@GetMapping()
	public String hello() {
		return "Hello world";
	}
	
	/**
	 * Receives vessel position information from client, does something with it and returns a viewModel with slightly altered information.
	 * @param vesselPosition Positional information from the client.
	 * @return A viewModel created with given information.
	 */
	@PostMapping()
	public VesselPositionViewModel doStuff(@RequestBody VesselPositionDTO vesselPosition) {
		return new VesselPositionViewModel(vesselPosition);		
	}

}
