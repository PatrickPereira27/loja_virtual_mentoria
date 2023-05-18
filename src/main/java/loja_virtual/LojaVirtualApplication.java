package loja_virtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "loja_virtual_model")
public class LojaVirtualApplication {

	public static void main(String[] args) {
		// chave para commit 
		//----->    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
		SpringApplication.run(LojaVirtualApplication.class, args);
	}

}
