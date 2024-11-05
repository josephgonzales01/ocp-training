package com.lintyc.Enums;

public class WorkingWithEnums {

    /*
         simple enum is composed of just a list of values, and ; at the end of the list is optional
    */
    public static enum SimpleSeason {SUMMER, AUTUMN, WINTER, SPRING}

    /*
        1. A more complex enum may have a list of enum values that calls its constructor and must end with ;
        2. All enum constructors are implicitly private, with the access modifier being optional.
        3. enum constructor cannot be called outside but only within the enum itself
        4. enum constructor call should not use a new keyword which normally used for objects.
        5. enum constructor are only called once.
     */
    public static enum ComplexSeason {
        WINTER("High"), SPRING("Medium"), SUMMER("High"), FALL("Low");
        private final String expectedVisitors;

        ComplexSeason(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
            System.out.println("ComplexSeason " + this.name() + " constructor called!!");
        }

        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }

    }

    /*
        Another complex enum with overridable method, notice SPRING and FALL it only use the default getHours
        1. Enum may also contain abstract method, in fact enums can implement an interface
     */
    public static enum ComplexSeason2 implements SeasonHours{
        WINTER {
            public String getHours() {
                return "10am-3pm";
            }
        },
        SUMMER {
            public String getHours() {
                return "9am-7pm";
            }
        },
        SPRING, FALL;

        public String getHours() {
            return "9am-5pm";
        }
    }

    interface SeasonHours {
        String getHours();
    }


    public static void main(String[] args) {

        /*

                    Demo of simple enum

         ***************************************************/

        var s = SimpleSeason.WINTER;
        System.out.println(s); // when toString() is called it returns the enum name
        System.out.println(s == SimpleSeason.WINTER); // enums can be compared with == because they are static final constants

        /*
            retrieve enums values with values(), each enum value has name() and ordinal() methods
        */
        for (var season : SimpleSeason.values()) {
            System.out.println(season.name() + " = " + season.ordinal());
        }

        SimpleSeason summer = SimpleSeason.valueOf("SUMMER"); // valueOf returns the enum whos name is exact what is passed
        //Season rainy = Season.valueOf("winter"); // IllegalArgumentException since Winter did exist but not winter

        /*
            In switch statement we use enum name for each case statement,
         */
        var msg = switch (s) {
            case WINTER -> "Get out the sled!";
            case SUMMER -> "Time for the pool!";
            case SimpleSeason.SPRING -> "Everything is colorful!"; // prev cases looks better
            default -> "Is it Autumn yet?";
        };
        System.out.println(msg);


        /*

                    Demo of complex enum

        ********************************************************/

        ComplexSeason fall1 = ComplexSeason.FALL; //print ComplexSeason constructor called!!
        ComplexSeason fall2 = ComplexSeason.FALL; //doesn't print anything

        ComplexSeason2 spring = ComplexSeason2.SPRING;
        System.out.println(spring.getHours()); // uses the default getHours();
        System.out.println(ComplexSeason2.SUMMER.getHours()); // uses the overridden getHours();
    }
}
