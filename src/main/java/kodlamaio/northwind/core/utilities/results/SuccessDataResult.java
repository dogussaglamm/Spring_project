package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {
	
	public SuccessDataResult(T data, String message) {
		super(data, true, message);
		
	}
	
}
