package com.gcmatic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class InicioController {
	@GetMapping("/login")
	public String inicioSesion() {
		return "login";
	}
}
