package com.covid.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('PATIENT') or hasRole('PHARMACIEN') or hasRole('ADMIN') or hasRole('LIVREUR')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/pat")
	@PreAuthorize("hasRole('PATIENT')")
	public String patientAccess() {
		return "PATIENT Board.";
	}

	@GetMapping("/phar")
	@PreAuthorize("hasRole('PHARMACIEN')")
	public String pharmacienAccess() {
		return "PHARMACIEN Board.";
	}

	@GetMapping("/liv")
	@PreAuthorize("hasRole('LIVREUR')")
	public String livreurAccess() {
		return "LIVREUR Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
}