package shop;

import java.util.HashMap;

/*
 * ���ﳵ
 */
public class Cart {
	/**
	 * �û�ID
	 */
	private int userId;
	
	/**
	 * �û�����ӵ���Ʒ
	 */
	private HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();
	
	/**
	 * ����Ʒ��ӵ����ﳵ
	 * @param id ��Ʒ���
	 * @param quantity ��Ʒ����
	 */
	public void addItem(int id, int quantity) {
		Integer n = items.get(id);
		if (n == null) {
			n = 0;
		}
		items.put(id, n + quantity);
	}
	
	/**
	 * ����Ʒ�Ƴ����ﳵ
	 * @param id
	 */
	public void removeItem(int id) {
		items.remove(id);
	}
	
	/**
	 * ������Ʒ��Ӧ����
	 * @param id ��Ʒid
	 * @param quantity �µ�����
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
