void main() {
    IO.print("Enter Your Age: ");
    int age = Integer.parseInt(IO.readln());

    String genAge;

    if ((age < 0) || (age > 120)) {
        genAge = "Error input";
    } else if (age < 10) {
        genAge = "Child";
    } else if (age < 20) {
        genAge = "Teenager";
    } else if (age < 60) {
        genAge = "Adult";
    } else {
        genAge = "Senior";
    }
    IO.println("Your age is: " + genAge);
}