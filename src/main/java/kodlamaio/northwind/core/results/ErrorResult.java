package kodlamaio.northwind.core.results;

import kodlamaio.northwind.core.utilities.Result;

public class ErrorResult extends Result{

	public ErrorResult() {
		super(true);
	}
	
	public ErrorResult(String message) {
		super(true,message);
	}
	
}
