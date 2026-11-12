import java.util.HashMap;

public record Grid(int width, int height, HashMap<Position, Obstacle> obstacles,HashMap<Position, Robot> robots) {
	
	public Grid(int width, int height) {
		this(width, height, new HashMap<Position, Obstacle>(), new HashMap<Position, Robot>());
	}

	public void addObstacle(Obstacle obstacle, Position position) {
		obstacles.put(position, obstacle);
	}

	public void addRobot(Robot robot, Position position) {
		robots.put(position, robot);
	}
}
