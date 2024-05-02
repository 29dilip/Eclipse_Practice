package ArrayList;

public class studentss implements Comparable<studentss>{///has compareTo() to override/// comes in java.lang.pacakage//
		
	String name;
	int id;
	double marks;

	public studentss(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	@Override
	public int compareTo(studentss that) {
		// TODO Auto-generated method stub
		if(this.name.length()>that.name.length()) {
			return 1;
		}
		else if(this.name.length()==that.name.length()){
			return 0;
		}
		
		return -1;
	}
	
}
