package shop;

import java.util.*;




/**
 * ��Ʒ
 * @author Lemon
 *
 */
public class Products {
	private List<Item> itemList = new ArrayList<Item>();
	
	
	public Products() {
		itemList.add(new Item(1, "Ǧ��", "2BǦ�ʣ���������", "China", 100));
		itemList.add(new Item(2, "�ֱ�", "Ӣ��ר�øֱ�", "India", 300));
		itemList.add(new Item(3, "ë��", "�Ʋ�������", "�Ƴ�", 4));
		itemList.add(new Item(4, "��Ƥ��", "������Ҳ���õ�����д������", "������", 3500));
		itemList.add(new Item(5, "Բ��", "<<����ȦȦ������>>ר��", "������", 5));
	}
	
	public List<Item> getItemList() {
		return this.itemList;
	}
}
