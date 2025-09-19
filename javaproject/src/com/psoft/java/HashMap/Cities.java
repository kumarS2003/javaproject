package com.psoft.java.HashMap;

public class Cities {
	String State;
	String City;

	public Cities(String state, String city) {
		super();
		State = state;
		City = city;
	}

	@Override
	public String toString() {
		return "Cities [State=" + State + ", City=" + City + "]";
	}

}
