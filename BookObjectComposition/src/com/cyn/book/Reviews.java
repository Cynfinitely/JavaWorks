package com.cyn.book;

public class Reviews {
	private Integer id;
	private String description;
	private Integer rating;

	public Reviews(Integer id, String description, Integer rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}

}
