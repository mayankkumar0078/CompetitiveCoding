package test;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.getPattern("test@gmail.com"));
    }

    public String getPattern(String value) {
        char[] valueArray = value.toCharArray();

        int capitalLetterCount = 0;
        int smallLetterCount = 0;
        int numberCount = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char previouschar = valueArray[0];
        for (int i = 0; i < valueArray.length; i++) {
            if (isCapital(valueArray[i])) {
                capitalLetterCount++;
                if (isCapital(previouschar)) {
                    previouschar = valueArray[i];
                    continue;
                } else {
                    stringBuilder.append("X" + "(" + capitalLetterCount + ")");
                    capitalLetterCount = 0;
                    previouschar = '\0';
                }

            }

            if (isSmall(valueArray[i])) {
                smallLetterCount++;
                if (isSmall(previouschar)) {
                    previouschar = valueArray[i];
                    continue;
                }
            } else if(!isSmall(previouschar)){
                stringBuilder.append("x" + "(" + capitalLetterCount + ")");
                smallLetterCount = 0;
                previouschar = '\0';
            }

            if (isNumber(valueArray[i])) {
                numberCount++;
                if (isNumber(previouschar)) {
                    previouschar = valueArray[i];
                    continue;
                } else {
                    stringBuilder.append("9" + "(" + numberCount + ")");
                    numberCount = 0;
                    previouschar = '\0';
                }
            }

        }
        return stringBuilder.toString();
    }

        private boolean isCapital( char c){
            return c >= 65 && c <= 90;
        }

        private boolean isSmall ( char c){
            return c >= 97 && c <= 122;
        }

        private boolean isNumber ( char c){
            return c >= 48 && c <= 57;
        }

    }
