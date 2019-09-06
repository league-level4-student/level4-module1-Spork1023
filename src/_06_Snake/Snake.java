package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		switch(currentDirection) {
		case RIGHT:
			getHeadLocation().x = getHeadLocation().x + 1;
			break;
		case LEFT:
			getHeadLocation().x = getHeadLocation().x - 1;
			break;
		case UP:
			getHeadLocation().y = getHeadLocation().y - 1;
			break;
		case DOWN:
			getHeadLocation().y = getHeadLocation().y + 1;
			break;
		}

		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		for (int i = snake.size(); i > 0; i--) {
			if(i != 1) {
				snake.set(i, snake.get(i--));
			}
			else {
				snake.set(i, snake.get(0));
			}
		}
		
		//3. set the location of the head to the new location calculated in step 1
		head.setLocation(getHeadLocation());

		//4. set canMove to true
		canMove = true;
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
		if(canMove) {
			currentDirection = d;
			canMove = false;
		}
		if(d == Direction.UP && currentDirection == Direction.DOWN) {
			canMove = false;
		}
		else if(d == Direction.DOWN && currentDirection == Direction.UP) {
			canMove = false;
		}
		else if(d == Direction.LEFT && currentDirection == Direction.RIGHT) {
			canMove = false;
		}
		else if(d == Direction.RIGHT && currentDirection == Direction.LEFT) {
			canMove = false;
		}
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake.clear();
		//2. set the location of the head
		head.setLocation(loc);
		//3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		boolean rt = false;
		if(getHeadLocation().x > 15) {
			rt = true;
		}
		else if(getHeadLocation().x < 0) {
			rt = true;
		}
		else if(getHeadLocation().y > 12) {
			rt = true;
		}
		else if(getHeadLocation().y < 0) {
			rt = true;
		}
		return rt;
	}
	
	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		boolean rt = false;
		for (int i = 1; i < snake.size(); i++) {
			if(snake.get(i) == snake.get(0)) {
				rt = true;
			}
		}
		return rt;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		boolean rt = false;
		for (int i = 0; i < snake.size(); i++) {
			if(snake.get(i).getLocation() == loc) {
				rt = true;
			}
			else {
				rt = false;
			}
		}
		return rt;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
