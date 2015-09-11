package shop;

import java.util.HashMap;

/*
 * 购物车
 */
public class Cart {
	/**
	 * 用户ID
	 */
	private int userId;
	
	/**
	 * 用户已添加的商品
	 */
	private HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();
	
	/**
	 * 将商品添加到购物车
	 * @param id 商品编号
	 * @param quantity 商品数量
	 */
	public void addItem(int id, int quantity) {
		Integer n = items.get(id);
		if (n == null) {
			n = 0;
		}
		items.put(id, n + quantity);
	}
	
	/**
	 * 将商品移除购物车
	 * @param id
	 */
	public void removeItem(int id) {
		items.remove(id);
	}
	
	/**
	 * 更新商品对应数量
	 * @param id 商品id
	 * @param quantity 新的数量
	 */
	public void updateItem(int id, int quantity) {
		if (items.containsKey(id)) {
			items.remove(id);
		}
		items.put(id, new Integer(quantity));
	}
	
	public HashMap<Integer, Integer> getItems() {
		return items;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setUserId(int id) {
		this.userId = id;
	}
	
	public void clearItems() {
		items.clear();
	}
	
}
