void main() {
    IO.print("Enter Your Age: ");
    int age = Integer.parseInt(IO.readln());

    String genAge;

    if ((age <= 0) || (age >= 100)) {
        genAge = "Error input";
    } else if (age >= 80) {
        genAge = "Child";
    } else if (age >= 70) {
        genAge = "Teenager";
    } else if (age >= 60) {
        genAge = "Adult";
    } else if (score >= 50) {
        genAge = "Senior";
    }
    IO.println("Your age is: " + genAge);
}
