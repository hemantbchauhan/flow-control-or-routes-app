package com.hemant.scattergather;

import java.util.List;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.processor.MessageProcessor;

public abstract class ResultsBuilder implements MessageProcessor {

	public abstract List<Result> getResults();
	
	@Override
	public MuleEvent process(MuleEvent event) throws MuleException {
		List<Result> results = this.getResults();
		
		event.getMessage().setPayload(results);
		
		return event;
	}
	
}
