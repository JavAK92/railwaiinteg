package com.employee.EMS.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class empDTO {
	
	
	//private long id;
	private String firstname;
	private String lastname;
	private String emaild;

}
