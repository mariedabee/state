package com.hz;
    /*Now implementing a State class for every state of the machine.
    These classes will be responsible for the behavior of the machine (Context)
    when it is in the corresponding state.
    This way we delegate the work to the individual state classes.
    The first state that will implement the State interface is NoQuarterState */
    public class NoQuarterState implements State {
        GumballMachine gumballMachine;

        public NoQuarterState(GumballMachine gumballMachine) {
            this.gumballMachine = gumballMachine;
        }

        public void insertQuarter() {
            System.out.println("You inserted a quarter");
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }

        public void ejectQuarter() {
            System.out.println("You haven't inserted a quarter");
        }

        public void turnCrank() {
            System.out.println("You turned, but there's no quarter");
        }

        public void dispense() {
            System.out.println("You need to pay first");
        }

        public void refill() { }

        public String toString() {
            return "waiting for quarter";
        }

}
