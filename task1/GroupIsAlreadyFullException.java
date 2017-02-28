package task1;

public class GroupIsAlreadyFullException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Group is already full";
	}

}
