package model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class menuVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String menuid;
	private String price;
	private String name;
	private int cnt;
}
