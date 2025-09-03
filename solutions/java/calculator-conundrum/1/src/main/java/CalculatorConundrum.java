class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
       try { if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.equals("+")) {
            return String.format("%d + %d = %d", operand1, operand2, (operand1 + operand2));
        } else if (operation.equals("*")){
            return String.format("%d * %d = %d", operand1, operand2, (operand1 * operand2));
        } else if(operation.equals("/")){
            return String.format("%d / %d = %d", operand1, operand2, (operand1 / operand2));
        }  else if (operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        } else {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
             } catch(ArithmeticException e){
               throw new IllegalOperationException("Division by zero is not allowed",e);
             }
    }
}
