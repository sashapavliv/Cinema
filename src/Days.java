public enum Days {
    MONDAY {
        @Override
        public String toString() {
            return "Monday: \n";
        }
    },
    TUESDAY{
        @Override
        public String toString() {
            return "Tuesday: \n";
        }
    },
    WEDNESDAY{
        @Override
        public String toString() {
            return "Wednesday: \n";
        }
    },
    THURSDAY{
        @Override
        public String toString() {
            return "Thursday: \n";
        }
    },
    FRIDAY{
        @Override
        public String toString() {
            return "Friday: \n";
        }
    },
    SATURDAY{
        @Override
        public String toString() {
            return "Saturday: \n";
        }
    },
    SUNDAY{
        @Override
        public String toString() {
            return "Sunday: \n";
        }
    };

    Days() {

    }
}
