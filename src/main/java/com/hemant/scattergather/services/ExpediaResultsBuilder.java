package com.hemant.scattergather.services;

import java.util.ArrayList;
import java.util.List;

import com.hemant.scattergather.Result;
import com.hemant.scattergather.ResultsBuilder;

public class ExpediaResultsBuilder extends ResultsBuilder {

	@Override
	public List<Result> getResults() {

		List<Result> results = new ArrayList<Result>();
		
		results.add(new Result(200, "Expedia", 2));
		results.add(new Result(250, "Expedia", 3));
		results.add(new Result(300, "Expedia", 4));
		
		return results;
	}

}
