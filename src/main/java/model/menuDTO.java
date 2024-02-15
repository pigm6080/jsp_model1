package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString
public class menuDTO {
	private int menuid;
	private int price;
	private String name;
	private int cnt;
}
