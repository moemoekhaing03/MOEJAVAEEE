package io.github.Moemoe03.SOLID;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

	private String name;
	private Color color;
	private Size size;
}