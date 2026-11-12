
public class Robot {
	private char direction;
	private Sensor sensor;
	private Position position;
	private Grid grid;
	
	public Robot(char direction, Position position) {
		this.direction = direction;
		this.position = position;
		this.sensor = new Sensor();
	}
	
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	public void forward() {
		if (direction == 'N') {
			this.position.setY(this.position.y() +1);
		} else if (direction == 'S') {
			this.position.setY(this.position.y() -1);
		} else if (direction == 'E') {
			this.position.setX(this.position.x() +1);
		} else if (direction == 'W') {
			this.position.setX(this.position.x() -1);
		}
		
	}
	
	public void backward() {
		if (direction == 'N') {
			this.position.setY(this.position.y() -1);
		} else if (direction == 'S') {
			this.position.setY(this.position.y() +1);
		} else if (direction == 'E') {
			this.position.setX(this.position.x() -1);
		} else if (direction == 'W') {
			this.position.setX(this.position.x() +1);
		}
	}
	
	public void left() {
		if (direction == 'N') {
			direction = 'W';
		} else if (direction == 'S') {
			direction = 'E';
		} else if (direction == 'E') {
			direction = 'N';
		} else if (direction == 'W') {
			direction = 'S';
		}
	}
	
	public void right() {
		if (direction == 'N') {
			direction = 'E';
		} else if (direction == 'S') {
			direction = 'W';
		} else if (direction == 'E') {
			direction = 'S';
		} else if (direction == 'W') {
			direction = 'N';
		}
	}
	
	@Override
	public String toString() {
		
		return "Robot facing " + direction + " at " + position;
	}
	
//	public void updateDirection() {
//		if (this.angleDirection % 360 == 0) {
//			this.direction = 'N';
//		} else if (this.angleDirection % 180% == 0) {
//			this.direction
//		}
//		if (this.angleDirection == 90) {
//			this.direction = 'E';
//		} else if (this.angleDirection == 0) {
//			
//		}
//	}
}
