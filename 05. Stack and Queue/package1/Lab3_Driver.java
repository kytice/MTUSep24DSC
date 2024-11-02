package package1;

public class Lab3_Driver {
    public static void main(String[] args) {
        String[] testExpressions = {
                "(a + b * (c / (d – e)))",
                "(a + b * {c / (d – e)}) + [d / e]",
                "((())]",
                "(2+[5+7]+1)",
                "<{[}]>",
                ""
        };

        for (String expr : testExpressions) {
            System.out.println("Expression: " + expr);
            System.out.println("Is balanced: " + Lab3_Stack.isBalanced(expr));
            System.out.println();
        }
    }
}
