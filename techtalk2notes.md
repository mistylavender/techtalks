## Calculator Algorithm

Shunting Yard Algorithm:
* use precedence of PEMDAS
* separate the different values into tokens that can be arranged
* puts all numbers into queue and then operators into the stack
* based on the precedence assigned, the operators will be pushed out of the stack after the values and put into their following orders
* in order to use RPN (reverse polish notation) there must be the operators after the numbers
* the RPN will then be used by placing the numbers in a stack and once an operator is seen, the last two numbers in the stack are popped out and then have the operator used on them
* the following strategy is used till you get a single answer without operators and that is printed out as the result


```
// Takes RPN and produces a final result
    private void rpnToResult() {
        // Stack used to hold calculation while process RPN
        Stack calculation = new Stack();
        HashMap<String, Double> hm = new HashMap<>();
        boolean variablePresent = false;
        double firstNo = 0.0;
        double secondNo = 0.0;

        for (int i = 0; i < reverse_polish.size(); i++) // for loop to process RPN
        {
            // If the token is a number
            if (!(isOperator(reverse_polish.get(i)))) {
                // Push number to stack
                calculation.push(reverse_polish.get(i));
            } else {
                if (reverse_polish.get(i).equals("=")) {
                    double firstPop = Double.valueOf(calculation.pop().toString());
                    String secondPop = calculation.pop().toString();
                    hm.put(secondPop, firstPop);
                    variablePresent = true;
                } else if (reverse_polish.get(i).equals("SQRT")) {
                    double firstPop = Double.valueOf(calculation.pop().toString());
                    result = Math.sqrt(firstPop);
                } else {
                    if (variablePresent) {
                        String firstPop = calculation.pop().toString();
                        String secondPop = calculation.pop().toString();
                        if (hm.get(firstPop) != null) {
                            firstNo = hm.get(firstPop);
                        } else {
                            firstNo = Double.valueOf(firstPop);

                        }
                        if (hm.get(secondPop) != null) {
                            secondNo = hm.get(secondPop);
                        } else {
                            secondNo = Double.valueOf(secondPop);

                        }
                    } else {
                        String firstPop = calculation.pop().toString();
                        String secondPop = calculation.pop().toString();
                        firstNo = Double.valueOf(firstPop);
                        secondNo = Double.valueOf(secondPop);
                    }
                }

                // Pop the two top entries
                // Based off of Token operator calculate result
                if (reverse_polish.get(i).equals("%")) {
                    result = secondNo % firstNo;
                } else if (reverse_polish.get(i).equals("^")) {
                    result = Math.pow(secondNo, firstNo);
                } else if (reverse_polish.get(i).equals("*")) {
                    result = secondNo * firstNo;
                } else if (reverse_polish.get(i).equals("/")) {
                    result = secondNo / firstNo;
                } else if (reverse_polish.get(i).equals("+")) {
                    result = secondNo + firstNo;
                } else if (reverse_polish.get(i).equals("-")) {
                    result = secondNo - firstNo;
                }
        // Push result back onto the stack
        calculation.push(result);
    }
}

        // Pop final result and set as final result for expression
        this.result = (double)calculation.pop();
    }
```
