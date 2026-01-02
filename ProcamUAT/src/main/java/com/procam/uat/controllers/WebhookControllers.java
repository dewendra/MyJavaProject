package com.procam.uat.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/procam-uat/merchandise")
public class WebhookControllers {

	@RequestMapping(value = { "/one-glint", "/callback", "/rwof", "/timing", "/accreditation", "/addons" }, method = {RequestMethod.GET,
			RequestMethod.POST }, produces = "application/json")
	public ResponseEntity<Map<String, Object>> handleWebhook(@RequestBody(required = false) String payload) {

		if (payload == null) {
			payload = "No payload received (GET request)";
		}

		System.out.println("Webhook payload received:");
		System.out.println(payload);

		Map<String, Object> response = new HashMap<>();
		response.put("status", true);
		response.put("donation_id", "9876543210");

		return ResponseEntity.ok(response);

	}

	/*
	 * @RequestMapping(value = "/one-glint", method = { RequestMethod.GET,
	 * RequestMethod.POST }, produces = "application/json") public
	 * ResponseEntity<Map<String, Object>> oneGlintWebhook(@RequestBody(required =
	 * false) String payload) {
	 * 
	 * System.out.println("Webhook payload received:"); System.out.println(payload);
	 * 
	 * Map<String, Object> response = new HashMap<>(); response.put("status", true);
	 * response.put("donation_id", "9876543210");
	 * 
	 * return ResponseEntity.ok(response);
	 * 
	 * }
	 */

	@RequestMapping(value = "/callback", method = { RequestMethod.GET,
			RequestMethod.POST }, produces = "application/json")
	public ResponseEntity<Map<String, Object>> callbackWebhook(@RequestBody(required = false) String payload) {

		System.out.println("Webhook payload received:");
		System.out.println(payload);

		Map<String, Object> response = new HashMap<>();
		response.put("status", true);
		response.put("donation_id", "9876543210");

		return ResponseEntity.ok(response);

	}

	@RequestMapping(value = "/rwof", method = { RequestMethod.GET, RequestMethod.POST }, produces = "application/json")
	public ResponseEntity<Map<String, Object>> rwofWebhook(@RequestBody(required = false) String payload) {

		System.out.println("Webhook payload received:");
		System.out.println(payload);

		Map<String, Object> response = new HashMap<>();
		response.put("status", true);
		response.put("donation_id", "9876543210");

		return ResponseEntity.ok(response);

	}

	@RequestMapping(value = "/timing", method = { RequestMethod.GET,
			RequestMethod.POST }, produces = "application/json")
	public ResponseEntity<Map<String, Object>> timingWebhook(@RequestBody(required = false) String payload) {

		System.out.println("Webhook payload received:");
		System.out.println(payload);

		Map<String, Object> response = new HashMap<>();
		response.put("status", true);
		response.put("donation_id", "9876543210");

		return ResponseEntity.ok(response);

	}

	@RequestMapping(value = "/accreditation", method = { RequestMethod.GET,
			RequestMethod.POST }, produces = "application/json")
	public ResponseEntity<Map<String, Object>> accreditationWebhook(@RequestBody(required = false) String payload) {

		System.out.println("Webhook payload received:");
		System.out.println(payload);

		Map<String, Object> response = new HashMap<>();
		response.put("status", true);
		response.put("donation_id", "9876543210");

		return ResponseEntity.ok(response);

	}

	@RequestMapping(value = "/addons", method = { RequestMethod.GET,
			RequestMethod.POST }, produces = "application/json")
	public ResponseEntity<Map<String, Object>> addonsWebhook(@RequestBody(required = false) String payload) {

		System.out.println("Webhook payload received:");
		System.out.println(payload);

		Map<String, Object> response = new HashMap<>();
		response.put("status", true);
		response.put("donation_id", "9876543210");

		return ResponseEntity.ok(response);

	}
}
