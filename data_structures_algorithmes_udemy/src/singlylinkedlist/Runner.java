package singlylinkedlist;

public class Runner {
	
	 public static void main(String[] args) {
//		 SinglyLinkedList sLL = new SinglyLinkedList();
//		 sLL.createSinglyLinkedList(5);
//		 System.out.println(sLL.head.value);
//		 sLL.insertInLinkedList(6, 1);
//		 sLL.insertInLinkedList(7, 3);
//		 sLL.insertInLinkedList(8, 4);
//		 sLL.insertInLinkedList(9, 0);
//		 sLL.traverseSinglyLinkedList();
//		 System.out.println("size :" + sLL.size);
//		 sLL.deleteSLL();
//		 sLL.traverseSinglyLinkedList();
		 
		 Node n = new Node(4);
		 Node newNext = new Node(5);
		 Node newNext2 = new Node(8);
		 
		 System.out.println("---------");
		 
		 n.next = newNext;
		 newNext = n;
		 System.out.println(n);
		 System.out.println(newNext);
		 System.out.println(newNext2);
		 
		 
		 
	//	 -----------------  FOLDER --------------------------
		 
//		 	Folder german = new Folder("German");
//		 	Folder unit = new Folder("Unit");
//		 	Folder subject = new Folder("Subject");
//		 	german.addSubFolder(unit);
//		 	unit.addSubFolder(subject);
//		 	
//		 	//System.out.println(subject.path);
//		 	
//		 	Folder subjectt = new Folder("Subject");
//		 	Folder subjecttt = new Folder("Subject");
//		 	//unit.addSubFolder(subjectt);
//		 	
//		 	
////		 	System.out.println("-----------");
////		 	System.out.println(subject.path);
//		 	unit.addSubFolder(subjectt);
//		 	unit.addSubFolder(subjecttt);
//		 	System.out.println(unit.subFolders.size());
//
//		 	Folder languages = new Folder("Languages");
//		 	
//		 	german.assignSuperFolder(languages);
//		 	System.out.println(german.path);
//		 	System.out.println(subject.path);

		  }

}
