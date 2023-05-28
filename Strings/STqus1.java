//Using String literals:
String str1 = "Hello, World!";

//Using the new keyword:
String str2 = new String("Hello, World!");

//Using a character array:

char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String str3 = new String(charArray);

//Using the StringBuilder or StringBuffer class:
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(", ");
sb.append("World!");
String str4 = sb.toString();

//Concatenating existing strings:
String str5 = "Hello" + ", " + "World!";

//Using the format() method:
String str6 = String.format("The value of pi is approximately %.2f", Math.PI);




