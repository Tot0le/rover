
public class Main {

	public static void main(String[] args) {
		
		Obstacle obstacle1 = new Obstacle();
		Position position_obstacle1 = new Position(67,69);
		Grid grid = new Grid(100,100);
		grid.addObstacle(obstacle1, position_obstacle1);
		
		Position position_robot1 = new Position(66,69);
		Robot robot1 = new Robot('E', position_robot1);
		grid.addRobot(robot1, position_robot1);
		System.out.println(robot1);
		robot1.forward();
		System.out.println(robot1);
		
	}

}
