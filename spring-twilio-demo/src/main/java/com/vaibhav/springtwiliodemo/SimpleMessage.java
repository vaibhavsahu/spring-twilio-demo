package com.vaibhav.springtwiliodemo;

public class SimpleMessage {
        private String to;
        private String message;

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }


        @Override
        public String toString() {
            return "SimpleMessage{" +
                    "to='" + to + '\'' +
                    ", message='" + message + '\'' +
                    '}';
        }
}
