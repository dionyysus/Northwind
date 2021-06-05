package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;

public interface UserService {

	Result add(User user);
	DataResult<User> findByEmail(String email);
	
	
}
