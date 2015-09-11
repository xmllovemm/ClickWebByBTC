package shop;

import java.io.PrintWriter;

/*
 * 商品
 */
public class Item {
	// property
	
	/**
	 * 商品编号
	 */
	private int id;
	
	/**
	 * 商品名称
	 */
	private String name;
	
	/**
	 * 商品描述
	 */
	private String description;
	
	/**
	 * 商品制造商
	 */
	private String producer;
	
	/**
	 * 商品剩余数量
	 */
	private int count;
	
	public Item(int id, String name, String description, String producer, int count) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.producer = producer;
		this.count = count;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getProducer() {
		return this.producer;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public void setProducer(String value) {
		this.producer = value;
	}
	
	public void setCount(int value) {
		this.count = value;
	}
}
