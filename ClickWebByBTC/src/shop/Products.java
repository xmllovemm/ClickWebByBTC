package shop;

import java.util.*;




/**
 * 产品
 * @author Lemon
 *
 */
public class Products {
	private List<Item> itemList = new ArrayList<Item>();
	
	
	public Products() {
		itemList.add(new Item(1, "铅笔", "2B铅笔，考试利器", "China", 100));
		itemList.add(new Item(2, "钢笔", "英雄专用钢笔", "India", 300));
		itemList.add(new Item(3, "毛笔", "唐伯虎画笔", "唐朝", 4));
		itemList.add(new Item(4, "橡皮擦", "妈妈再也不用担心我写错字了", "步步高", 3500));
		itemList.add(new Item(5, "圆规", "<<画个圈圈诅咒你>>专用", "懒羊羊", 5));
	}
	
	public List<Item> getItemList() {
		return this.itemList;
	}
}
