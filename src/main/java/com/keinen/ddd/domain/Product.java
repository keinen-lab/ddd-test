package com.keinen.ddd.domain;

import com.keinen.ddd.infra.MoneyConverter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

	@EmbeddedId private ProductId id;

	private String name;

	@Convert(converter = MoneyConverter.class)
	private Money price;

	private String detail;

	@OneToMany(
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
			orphanRemoval = true,
			fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	@OrderColumn(name = "list_idx")
	private List<Image> images = new ArrayList<>();

	public void changeImages(List<Image> newImages) {
		images.clear();
		images = newImages;
	}
}
