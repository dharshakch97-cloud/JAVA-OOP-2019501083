interface Student {
    boolean canThink();
    boolean canLearn();
    boolean canCode();
}

interface Cricketer extends Student {
    boolean canBat();
    boolean canBowl();
    boolean canField();
}

interface Guy extends Cricketer {
    boolean canWalk();
    boolean canSpeak();
    boolean canRun();
}

class Person implements Guy {
        public boolean canThink() {
            return true;
        }
        public boolean canLearn() {
            return true;
        }
        public boolean canCode() {
            return true;
        }
        public boolean canBat() {
            return true;
        }
        public boolean canBowl() {
            return true;
        }
        public boolean canField() {
            return true;
        }
        public boolean canWalk() {
            return true;
        }
        public boolean canSpeak() {
            return true;
        }
        public boolean canRun() {
            return true;
        }
}

final class InterfaceExtends {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.canBat());
    }
}