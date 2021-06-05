package kodlamaio.northwind.core.results;

import kodlamaio.northwind.core.utilities.Result;

public class SuccessResult extends Result {

	public SuccessResult() {
		super(true);
	}
	public SuccessResult(String message) {
		super(true,message);
	}
	
}
