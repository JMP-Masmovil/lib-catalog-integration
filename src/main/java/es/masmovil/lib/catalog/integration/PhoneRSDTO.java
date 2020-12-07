package es.masmovil.lib.catalog.integration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneRSDTO {
	
	private String identifier;

	private String name;
	
	private String price;
	
	private String description;

	private String urlImage;
		
}
