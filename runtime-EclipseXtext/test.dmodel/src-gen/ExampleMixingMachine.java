	package fr.uha.ensisa.idm.mixin.example;
	
	import fr.uha.ensisa.idm.mixin.sim.svg.SVGMixingMachine;
	
	public class ExampleMixingMachine extends SVGMixingMachine {
	
	final static int MAX_POS = 11;
	final static int LGATE_POS = 4;
	final static int RGATE_POS = 11;
	private static int currentPos = 5;
	static final int RESERVOIR_POS = 4;
	static final int DRAIN_POS = 5;
	static final int MAX_CAPACITY = 30;
	
	private static boolean lDoorOpened = false;
	private static boolean rDoorOpened = false;
	
	public int run() {
		absoluteMove(1);
		filt(0);
		suck(5);
		absoluteMove(6);
		filt(0);
		blow(5);
		cleanup();
		wait(10);
		absoluteMove(2);
		filt(2);
		suck(3);
		absoluteMove(7);
		filt(0);
		blow(3);
		cleanup();
		wait(5);
		absoluteMove(3);
		filt(1);
		suck(3);
		absoluteMove(6);
		filt(0);
		blow(3);
		cleanup();
		absoluteMove(7);
		filt(0);
		suck(3);
		absoluteMove(6);
		filt(0);
		blow(3);
		cleanup();
		wait(5);
		absoluteMove(6);
		filt(1);
		suck(11);
		absoluteMove(11);
		filt(0);
		blow(11);
		cleanup();
		return 0;
	}
		
	private void absoluteMove(int absolute){
		if(absolute > MAX_POS || absolute < 1){
				throw new IllegalStateException("Position incorrecte");
		}
		int offset = absolute - currentPos;
		openGates(absolute);
		move(offset);
		currentPos = absolute;
		closeGates();
	}
			
	private void openGates(int dest){
	
		if (!lDoorOpened &&
				(currentPos < LGATE_POS && dest >= LGATE_POS ||
				dest < LGATE_POS && currentPos >= LGATE_POS)
		){

			open(0);
			lDoorOpened = true;
		}

		if ( !rDoorOpened &&
				(currentPos < RGATE_POS && dest >= RGATE_POS ||
				dest < RGATE_POS && currentPos >= RGATE_POS)
		){
			open(1);
			rDoorOpened = true;
		}
	
	}
	
	private void closeGates(){
		if (lDoorOpened && currentPos >= LGATE_POS){
			shut(0);
			lDoorOpened = false;
		}

		if (rDoorOpened && currentPos < RGATE_POS ){
			shut(1);
			rDoorOpened = false;
		}
	}
	
		
	private void cleanup(){
		filt(0);
		absoluteMove( RESERVOIR_POS );
		suck(MAX_CAPACITY);
		absoluteMove(DRAIN_POS);
		blow(MAX_CAPACITY);
	}
	
	public static void main(String[] args) {
		ExampleMixingMachine main = new ExampleMixingMachine();
		for (int i = 1; i <= main.getInputCups(); ++i) {
			main.setAtInputCup(i, 9);
		}
		main.run();
	}
}		
