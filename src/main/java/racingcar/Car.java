package racingcar;

import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;
    private static final int MOVE_CAR = 4;
    private static final String MOVE_POSITION = "-";
    private static final int MAX_LENGTH = 9;
    private static final int MIN_LENGTH = 1;

    public Car(String name) {
        this.name = name;
    }
    
    // 추가 기능 구현
    
	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}
	
	private boolean isMove(int number) {
		return number > MOVE_CAR;
	}
	
	private void judgmentMove() {
		int randomNumber = RandomUtils.nextInt(MIN_LENGTH, MAX_LENGTH);
		if (isMove(randomNumber)) {
			this.position ++;
		}
	}
	
	public void countMovePosition(int count) {
		while(!(count==0)) {
			judgmentMove();
			count--;
		}
	}

	public void printCarMoving() {
		System.out.print(this.name + ":" );
		for (int i = 0; i < this.position; i++) {
			System.out.print(MOVE_POSITION);
		}
	}
	
}
