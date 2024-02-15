package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class menuDTO {
	private String menuid;
	private String price;
	private String name;
	private int cnt;
}
