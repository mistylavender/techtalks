## Calculator Algorithm

Shunting Yard Algorithm:
* 


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
