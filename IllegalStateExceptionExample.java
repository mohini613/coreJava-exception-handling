package ExceptionHandling;

public class IllegalStateExceptionExample {
 public static void main(String[] args) {
	        Clock clock = new Clock();
	        
	        // Trying to set the time before starting the clock
	        try {
	            clock.setTime(10, 30);
	        } catch (IllegalStateException e) {
	            System.out.println("Caught IllegalStateException: " + e.getMessage());
	        }
	        
	        // Start the clock
	        clock.start();
	        
	        // Now set the time
	        clock.setTime(11, 15);
	        System.out.println("Current time: " + clock.getTime());
	    }

	    static class Clock {
	        private int hour;
	        private int minute;
	        private boolean started;

	        public void setTime(int hour, int minute) {
	            if (!started) {
	                throw new IllegalStateException("Cannot set time before starting the clock");
	            }
	            this.hour = hour;
	            this.minute = minute;
	        }

	        public void start() {
	            started = true;
	            System.out.println("Clock started");
	        }

	        public String getTime() {
	            return hour + ":" + minute;
	        }
	    }
	}


