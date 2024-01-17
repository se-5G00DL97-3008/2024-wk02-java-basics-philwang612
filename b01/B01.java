class B01 {
    public static void main(String[] args) {
        int bottles = 99;

        while (bottles > 0) {
            String bottlesWord = bottles == 1 ? "bottle" : "bottles";
            System.out.println(bottles + " " + bottlesWord + " of beer on the wall, " + bottles + " " + bottlesWord + " of beer.");
            bottles--;

            bottlesWord = bottles == 1 ? "bottle" : "bottles";
            String bottlesLeft = bottles > 0 ? bottles + " " + bottlesWord : "no more bottles";

            System.out.println("Take one down and pass it around, " + bottlesLeft + " of beer on the wall.\n");
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
    }
