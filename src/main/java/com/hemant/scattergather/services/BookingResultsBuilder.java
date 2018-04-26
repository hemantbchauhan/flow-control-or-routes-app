package com.hemant.scattergather.services;

import java.util.ArrayList;
import java.util.List;

import com.hemant.scattergather.Result;
import com.hemant.scattergather.ResultsBuilder;

public class BookingResultsBuilder extends ResultsBuilder {

	@Override
	public List<Result> getResults() {

		List<Result> results = new ArrayList<Result>();
		
		results.add(new Result(250, "Booking.com", 3));
		results.add(new Result(300, "Booking.com", 4));
		results.add(new Result(350, "Booking.com", 5));
		
		return results;
	}

}
