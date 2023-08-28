import javax.swing.*;

public class Calculator {
    private String name;
    private String operator;

    public Calculator() {
        intro();
    }

    public void intro() {
        this.name = JOptionPane.showInputDialog(null, "Olá, qual o seu nome?", "Assistente Virtual", JOptionPane.PLAIN_MESSAGE);
        if (this.name == null) System.exit(0);
        else if (this.name.isEmpty() || this.name.length() < 3 || !isString(this.name)) {
            JOptionPane.showMessageDialog(null, "Por favor, insira seu nome", "Erro", JOptionPane.WARNING_MESSAGE);
            intro();
        }
        JOptionPane.showMessageDialog(null, "Olá " + name + ", sou um programa de calculadora e irei resolver todas as operações que escolher");
        calc();
    }

    private void calc() {
        int op;

        this.operator = JOptionPane.showInputDialog(null, "Qual das operações a seguir você quer fazer?\n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão\n5.Fatorial");
        if (this.operator == null) System.exit(0);
        else if (this.operator.isEmpty() || !isInterger(this.operator)) {
            JOptionPane.showMessageDialog(null, "Erro na validação do operador", "Erro", JOptionPane.WARNING_MESSAGE);
            calc();
        }

        op = Integer.parseInt(this.operator);

        switch (op) {
            case 1:
                sum();
                calc();
            case 2:
                sub();
                calc();
            case 3:
                mult();
                calc();
            case 4:
                div();
                calc();
            case 5:
                fac();
                calc();
            default:
                JOptionPane.showMessageDialog(null, "Erro na validação do operador", "Erro", JOptionPane.WARNING_MESSAGE);
                calc();
        }
    }

     private void sum() {
        double[] intNum = new double[2];

        String num1 = JOptionPane.showInputDialog(null, "Que número gostaria de utilizar?", "Soma", JOptionPane.PLAIN_MESSAGE);
        if (num1 == null) System.exit(0);
        else if (num1.isEmpty() || !isDecorint(num1)) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String num2 = JOptionPane.showInputDialog(null, "E o segundo número?", "Soma", JOptionPane.PLAIN_MESSAGE);
        if (num2 == null) System.exit(0);
        else if (num2.isEmpty() || !isDecorint(num2)) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        intNum[0] = Double.parseDouble(num1);
        intNum[1] = Double.parseDouble(num2);
        double result1 = intNum[0] + intNum[1];
        JOptionPane.showMessageDialog(null, "O resultado é " + result1, "Resultado", JOptionPane.QUESTION_MESSAGE);
    }

    private void sub() {
        double[] intNum = new double[2];

        String num3 = JOptionPane.showInputDialog(null, "Que número gostaria de utilizar?", "Subtração", JOptionPane.PLAIN_MESSAGE);
        if (num3 == null) System.exit(0);
        else if (num3.isEmpty() || !isDecorint(num3)) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String num4 = JOptionPane.showInputDialog(null, "E o segundo número?", "Subtração", JOptionPane.PLAIN_MESSAGE);
        if (num4 == null) System.exit(0);
        else if (num4.isEmpty() || !isDecorint(num4)) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        intNum[0] = Double.parseDouble(num3);
        intNum[1] = Double.parseDouble(num4);
        double result2 = intNum[0] - intNum[1];
        JOptionPane.showMessageDialog(null, "O resultado é " + result2, "Resultado", JOptionPane.QUESTION_MESSAGE);
    }

    private void mult() {
        double[] intNum = new double[2];

        String num5 = JOptionPane.showInputDialog(null, "Que número gostaria de utilizar?", "Multiplicação", JOptionPane.PLAIN_MESSAGE);
        if (num5 == null) System.exit(0);
        else if (num5.isEmpty() || !isDecorint(num5)) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String num6 = JOptionPane.showInputDialog(null, "E o segundo número?", "Multiplicação", JOptionPane.PLAIN_MESSAGE);
        if (num6 == null) System.exit(0);
        else if (num6.isEmpty() || !isDecorint(num6)) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        intNum[0] = Double.parseDouble(num5);
        intNum[1] = Double.parseDouble(num6);
        double result3 = intNum[0] * intNum[1];
        JOptionPane.showMessageDialog(null, "O resultado é " + result3, "Resultado", JOptionPane.QUESTION_MESSAGE);
    }

    private void div() {
        double[] intNum = new double[2];

        String num7 = JOptionPane.showInputDialog(null, "Que número gostaria de utilizar?", "Divisão", JOptionPane.PLAIN_MESSAGE);
        if (num7 == null) System.exit(0);
        else if (num7.isEmpty() || !isDecorint(num7)) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String num8 = JOptionPane.showInputDialog(null, "E o segundo número?", "Divisão", JOptionPane.PLAIN_MESSAGE);
        if (num8 == null) System.exit(0);
        else if (num8.isEmpty() || !isDecorint(num8)) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        intNum[0] = Double.parseDouble(num7);
        intNum[1] = Double.parseDouble(num8);
        double result4 = intNum[0] / intNum[1];
        JOptionPane.showMessageDialog(null, "O resultado é " + result4, "Resultado", JOptionPane.QUESTION_MESSAGE);
    }

    private void fac () {
        String client = JOptionPane.showInputDialog(null, "Que número gostaria de fatorar?", "Fatorial", JOptionPane.PLAIN_MESSAGE);
        double fat;
        double clientDB;

        if (client == null) System.exit(0);
        else if (client.isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro ao identificar o número, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        clientDB = Double.parseDouble(client);

        if (clientDB < 0 || !isInterger(client)) {
            JOptionPane.showMessageDialog(null, "Não é possível fazer o fatorial de número negativo ou decimal", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (clientDB == 0) {
            JOptionPane.showMessageDialog(null, "Não é possível fazer o fatorial de zero", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        fat = clientDB;

        for (int i = 1; i < clientDB; i++) {
            fat = fat * (clientDB - i);
        }
        JOptionPane.showMessageDialog(null, "O resultado é " + fat, "Resultado", JOptionPane.QUESTION_MESSAGE);
    }


    private boolean isString(String string) {
        return string.matches("[a-zA-Z]+");
    }

    private boolean isInterger(String integer) {
        return integer.matches("\\d+$");
    }


    private boolean isDecorint(String num) {
        return num.matches("-?\\d+(\\.\\d+)?");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
