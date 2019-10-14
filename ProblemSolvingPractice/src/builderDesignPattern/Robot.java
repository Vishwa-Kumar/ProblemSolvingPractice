package builderDesignPattern;

public class Robot implements RobotPlan{

	
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	@Override
	public void setRobotHead(String head) {
		// TODO Auto-generated method stub
		this.robotHead=head;
		
	}

	@Override
	public void setRobotTorso(String torso) {
		// TODO Auto-generated method stub
		this.robotTorso=torso;
	}

	public String getRobotHead() {
		return robotHead;
	}

	public String getRobotTorso() {
		return robotTorso;
	}

	public String getRobotArms() {
		return robotArms;
	}

	public String getRobotLegs() {
		return robotLegs;
	}

	@Override
	public void setRobotArms(String arms) {
		// TODO Auto-generated method stub
		this.robotArms=arms;
		
	}

	@Override
	public void setRobotLegs(String legs) {
		// TODO Auto-generated method stub
		this.robotLegs=legs;
	}

}
