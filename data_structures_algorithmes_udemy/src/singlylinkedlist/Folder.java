package singlylinkedlist;

import java.util.HashSet;
import java.util.Set;
// german/unit/subject

public class Folder  {
	 
	String folderName;
	Set<Folder> subFolders; //u1, u2
	Folder superFolder;
	String path;
	int depth;
	
	public Folder(String folderName) {
		if(folderName.contains("/")) throw new IllegalArgumentException("Invalid folder name");
		this.folderName = folderName;
		subFolders = new HashSet<>();
		this.path = folderName;
	}
	
	void addSubFolder(Folder subFolder) {
		subFolder.path = this.path + "/" + subFolder.folderName;
		if(!subFolders.add(subFolder)) {
			System.out.println("Already exist");
		}
		subFolder.depth++;
		
	}
	
	void assignSuperFolder(Folder superFolder) {
		path = superFolder.path + "/" + path;
		while(depth > 0) {
			for(Folder sub: subFolders) {
				sub.path = superFolder.path + "/" + sub.path;
			}
		}
		
		depth++;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || obj.getClass() != this.getClass()) return false;
		Folder other = (Folder) obj;
		return this.path.equals(other.path); 
	}
	
	@Override
	public int hashCode() {
		return path.hashCode() + 53;
	}
	
	
	
	
	
}


