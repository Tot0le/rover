
public class Robot {
	private char direction;
	private int x;
	private int y;
	
	public Robot(char direction) {
		this.direction = direction;
	}
	
	public void forward() {
		if (direction == 'N') {
			this.y += 1;
		} else if (direction == 'S') {
			this.y -= 1;
		} else if (direction == 'E') {
			this.x -= 1;
		} else if (direction == 'W') {
			this.x += 1;
		}
		
	}
	
	public void backward() {
		if (direction == 'N') {
			this.y -= 1;
		} else if (direction == 'S') {
			this.y += 1;
		} else if (direction == 'E') {
			this.x += 1;
		} else if (direction == 'W') {
			this.x -= 1;
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
