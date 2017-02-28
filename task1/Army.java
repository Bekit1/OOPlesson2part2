package task1;

public class Army  {
private String name;

public Army(String name) {
	super();
	this.name = name;
}

public Army() {
	super();
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void show(Voenkom v){
	v.showMale();
}
}
