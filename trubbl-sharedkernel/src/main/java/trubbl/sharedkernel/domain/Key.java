package trubbl.sharedkernel.domain;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class Key {

	private String key;

	public Key() {
		this.key = UUID.randomUUID().toString();
	}

	@JsonCreator
	public Key(String key) {
		this.key = key;
	}

	@JsonValue
	public String toString() {
		return key;
	}
}
