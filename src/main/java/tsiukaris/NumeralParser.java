package tsiukaris;

class NumeralParser {

    private static final String[] numerals = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    static int replaceNumbers (String input) {

        int reslt = 0;
        int tempBuf = 0;
        String[] words = input.split(" ");
        for (String word : words) {

            if (word.equals("thousand")) {
                reslt *= 1000;
                tempBuf = 0;
                continue;
            }
            if (word.equals("hundred")) {
                reslt -= tempBuf;
                reslt += tempBuf * 100;
                tempBuf = 0;
                continue;
            }

            for (int i = 0; i < numerals.length; i++) {
                if (word.equals(numerals[i])) {
                    if (i < 20) {
                        tempBuf = i + 1;  //9
                        reslt += tempBuf; //9
                        break;
                    } else if (i > 19) {
                        tempBuf = (i - 19) * 10 + 20;
                        reslt += tempBuf;
                        break;
                    }
                }
            }
        }

        return reslt;
    }

}
