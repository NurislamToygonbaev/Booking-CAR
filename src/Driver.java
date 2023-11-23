public enum Driver {
    NURISLAM {
        @Override
        public void getInfo() {
            String phoneNumber = "0770102030";
            int age = 25;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    },
    NURKAMIL {
        @Override
        public void getInfo() {
            String phoneNumber = "0502373977";
            int age = 23;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    },
    AJYBEK {
        @Override
        public void getInfo() {
            String phoneNumber = "0220459810";
            int age = 28;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    },
    NURLAN {
        @Override
        public void getInfo() {
            String phoneNumber = "0880123456";
            int age = 20;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    },
    URMAT {
        @Override
        public void getInfo() {
            String phoneNumber = "0772120947";
            int age = 19;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    },
    MIRLAN {
        @Override
        public void getInfo() {
            String phoneNumber = "0555298208";
            int age = 21;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    },
    ELDIYAR {
        @Override
        public void getInfo() {
            String phoneNumber = "0504200482";
            int age = 19;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    },
    NURGAZY {
        @Override
        public void getInfo() {
            String phoneNumber = "0703459620";
            int age = 22;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    },
    NURTAAZIM {
        @Override
        public void getInfo() {
            String phoneNumber = "0505349142";
            int age = 18;
            System.out.println("Phone number: "+ phoneNumber + "\n "+"age: " + age);
        }
    };

    public abstract void getInfo();



}
