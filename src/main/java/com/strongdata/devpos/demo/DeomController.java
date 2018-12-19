package com.strongdata.devpos.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeomController {
 @GetMapping
	public String test() {
		return "hello demo jenkins";
	}
}
