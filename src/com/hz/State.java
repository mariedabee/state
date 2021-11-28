package com.hz;

    public interface State {
        //defining a State interface that contains a method for every action in the Gumball Machine.
        public void insertQuarter();
        public void ejectQuarter();
        public void turnCrank();
        public void dispense();

        public void refill();

}
