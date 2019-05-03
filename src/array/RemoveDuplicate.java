package array;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveDuplicate {

	public <T> void deleteDuplicate(List<T> list){
		System.out.println(list);
		for(int i=0;i < list.size();i++){
			for(int j = i+1;j<list.size();j++ ){
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
				}
				
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new CopyOnWriteArrayList();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(6);
		list.add(7);
		
		RemoveDuplicate removeObject = new RemoveDuplicate();
		removeObject.deleteDuplicate(list);
		
		List<String> stringList = new ArrayList();
		stringList.add("Hi6");
		stringList.add("Hi7");
		stringList.add("Hi9");
		stringList.add("Hi4");
		stringList.add("Hi5");
		stringList.add("Hi8");
		stringList.add("Hi2");
		stringList.add("Hi1");
		stringList.add("Hi4");
		stringList.add("Hi7");
		stringList.add("Hi1");
		stringList.add("Hi3");
		
		removeObject.deleteDuplicate(stringList);
	}

}
