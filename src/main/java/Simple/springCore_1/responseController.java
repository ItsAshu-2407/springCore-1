package Simple.springCore_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class responseController {
	@RequestMapping("/hello")
	public String ghost() {
		return "Hi Welcome to the Coding World";
		
	}
}
