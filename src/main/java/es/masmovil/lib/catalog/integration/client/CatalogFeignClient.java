package es.masmovil.lib.catalog.integration.client;

import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import es.masmovil.lib.catalog.integration.PhoneRSDTO;

@ConditionalOnProperty(name = "api.ms.url.phonecatalog" )
@FeignClient(name="catalog", url="${api.ms.url.phonecatalog}", decode404 = true)


public interface CatalogFeignClient {

	@GetMapping(value = "/phones")
	ResponseEntity<List<PhoneRSDTO>> getListPhones();
	
	@GetMapping(value = "/phones/{id}")
	ResponseEntity<PhoneRSDTO> getPhoneById(@PathVariable String id);
}
