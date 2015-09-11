package shop;

import java.io.PrintWriter;

/*
 * ��Ʒ
 */
public class Item {
	// property
	
	/**
	 * ��Ʒ���
	 */
	private int id;
	
	/**
	 * ��Ʒ����
	 */
	private String name;
	
	/**
	 * ��Ʒ����
	 */
	private String description;
	
	/**
	 * ��Ʒ������
	 */
	private String producer;
	
	/**
	 * ��Ʒʣ������
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
