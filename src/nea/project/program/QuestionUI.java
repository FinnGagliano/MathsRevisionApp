package nea.project.program;
//These are all of the imports that I have needed to use as I code my program

import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Random;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class QuestionUI extends javax.swing.JFrame {

    //Declaring The variables that are required to extract information from the database
    Connection Connecting = null;
    ResultSet Result = null;
    Statement Stmt = null;

    /*These public static variables make it so that I don't have to re-extract the variables on each button
    *So if they are given a value, the value will be the same in all other instances where it appears
     */
    public static int Topic;
    public static String UsersID;
    public static String CorrectAnswer;
    public static String DifSet;
    public static int GoodProgress;
    public static int BadProgress;
    public static int PreviousQNum;
    public static int NewScore;
    public static int NewPosScore;
    public static int TopicCheck;
    String Query;
    String Question;

    public QuestionUI() {
        initComponents();
        //Setting The 4 answer buttons and label that will display the question to invisble, as the user needs to extract
        //the information that's displayed on these from the dtabase first, so they need to first be invisible
        lblQuestion.setVisible(false);
        btnAns1.setVisible(false);
        btnAns2.setVisible(false);
        btnAns3.setVisible(false);
        btnAns4.setVisible(false);
        //Makes the Text of the labels stick to the center of the label
        lblTopic.setHorizontalAlignment(SwingConstants.CENTER);
        lblTopic.setVerticalAlignment(SwingConstants.CENTER);
        lblQuestion.setHorizontalAlignment(SwingConstants.CENTER);
        lblQuestion.setVerticalAlignment(SwingConstants.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        btnAns1 = new javax.swing.JButton();
        btnAns2 = new javax.swing.JButton();
        btnAns3 = new javax.swing.JButton();
        btnAns4 = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        btnCalculator = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setMaximumSize(new java.awt.Dimension(687, 417));
        setMinimumSize(new java.awt.Dimension(687, 417));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(66, 100, 100));

        lblTopic.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        lblTopic.setForeground(new java.awt.Color(255, 255, 255));
        lblTopic.setText("WELCOME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblQuestion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        lblQuestion.setText("Question");
        lblQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAns1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnAns1.setText("1");
        btnAns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAns1ActionPerformed(evt);
            }
        });

        btnAns2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnAns2.setText("2");
        btnAns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAns2ActionPerformed(evt);
            }
        });

        btnAns3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnAns3.setText("3");
        btnAns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAns3ActionPerformed(evt);
            }
        });

        btnAns4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnAns4.setText("4");
        btnAns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAns4ActionPerformed(evt);
            }
        });

        btnGo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnGo.setText("Begin");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        btnCalculator.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnCalculator.setText("Calculator");
        btnCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculatorActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnExit.setText("Back");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalculator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGo)
                        .addGap(272, 272, 272)
                        .addComponent(btnExit)
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAns3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAns2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAns4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAns1)
                    .addComponent(btnAns2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAns4)
                    .addComponent(btnAns3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculator)
                    .addComponent(btnGo)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        //Setting this button to invisible means that the user can't extract another question from the database if they don't know the answer
        //This stops the user cheating the system to get an advantage
        btnGo.setVisible(false);
        //The objects that were set to invisible before are now visible, as they are going to have their text altered
        lblQuestion.setVisible(true);
        btnAns1.setVisible(true);
        btnAns2.setVisible(true);
        btnAns3.setVisible(true);
        btnAns4.setVisible(true);
        String Answer2 = null;
        String Answer3 = null;
        String Answer4 = null;

        //Sets the label displaying the topic chosen to the correct text
        switch (Topic) {
            case 0:
                //If the user has not chosen a topic then questions will be selected from all topics
                Random num0 = new Random();
                Topic = num0.nextInt(4);
                while (Topic == 0) {
                    Topic = num0.nextInt(4);
                }
                if (Topic == 1) {
                    lblTopic.setText("Factorising Equations");
                } else if (Topic == 2) {
                    lblTopic.setText("Coordinate Geometry");
                } else if (Topic == 3) {
                    lblTopic.setText("Numerical Equations");
                }
                TopicCheck = 1;
                break;
            case 1:
                lblTopic.setText("Factorising Equations");
                break;
            case 2:
                lblTopic.setText("Coordinate Geometry");
                break;
            case 3:
                lblTopic.setText("Numerical Equations");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error With Topic");
        }
        //Calls The database connection code from the ConnectDB Class
        Connecting = ConnectDB.ConnectDB();

        //A try-catch method is being used to find any errors within the system  
        try {

            /*The point of having "Topic" + Topic + "Difficulty" is so that when the query is run, the correct
             *TopicDifficulty variable will be extracted, so if Topic = 1, then Topic1Difficulty will be extracted etc.
             */
            Query = "SELECT Topic" + Topic + "Difficulty FROM progress WHERE UserID = " + UsersID;
            Stmt = Connecting.prepareStatement(Query);
            Result = Stmt.executeQuery(Query);
            while (Result.next()) {
                //The query has been executed, and the Difficulty setting has been taken from the result set
                DifSet = Result.getString("Topic" + Topic + "Difficulty");
                Random num1 = new Random();
                Random num2 = new Random();
                Random num3 = new Random();
                Random num4 = new Random();

                if (Topic == 3) {
                    int int1 = 1;
                    int op1 = 1;
                    int op2 = 1;
                    int int2 = 1;
                    int DifCheck = 0;
                    int OpCheck = 4;
                    String QuestionPart;
                    String FirstOp = "";
                    String SecondOp = "";
                    Question = "";

                    if (Integer.parseInt(DifSet) < 3) {
                        /*DifCheck is set higher than if the difficulty setting was 3
                        * The reason for this is so that the loop is only run once resulting in a shorter equation,
                        making the question easier for the user*/
                        DifCheck = 2;
                    } else {
                        DifCheck = 1;
                    }

                    //The only operators that can be used if difficulty setting = 1 are + and -, making the question easier
                    if (Integer.parseInt(DifSet) == 1) {
                        OpCheck = 2;
                    }

                    while (DifCheck < 3) {

                        int1 = num1.nextInt(10);
                        op1 = num2.nextInt(OpCheck);
                        op2 = num3.nextInt(OpCheck);
                        int2 = num4.nextInt(10);

                        //ops is an array storing the different types of operators that can be used
                        String[] ops = {"+", "-", "*", "/"};
                        //FirstOp and SecondOp have now got a single operator assigned to them as a string
                        FirstOp = ops[op1];
                        SecondOp = ops[op2];

                        /*This while loop prevents there being a dividing by 0 error in the equation, 
                        stops a '0' following a '/' symbol */ 
                        while (FirstOp.contentEquals("/") && int2 == 0) {
                            op2 = num3.nextInt(4);
                            FirstOp = ops[op2];
                        }

                        //Creates a part of a question, contains integers followed by operators
                        QuestionPart = Integer.toString(int1) + " " + FirstOp + " " + 
                                Integer.toString(int2) + " " + SecondOp + " ";
                        //Adds the question part onto the other question parts
                        Question = Question + QuestionPart;

                        //Regulates if the loop is going to be run again (will only run again if Difficulty Setting = 3)
                        DifCheck = DifCheck + 1;

                    }

                    int1 = num1.nextInt(10);
                    while (int1 == 0) {
                        int1 = num1.nextInt(10);
                    }
                    //Adds an Integer to the end of the question so that the equation is completed
                    Question = Question + Integer.toString(int1);
                    //Question has now been presented to the user
                    lblQuestion.setText(Question);
                    //A method used to take an equation in string format and find the answer of the equation
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine engine = manager.getEngineByName("JavaScript");
                    //Used to leave every answer to 1 decimal place
                    DecimalFormat Decimal = new DecimalFormat("#.0");
                    //Declares the value of the result of the equation

                    String Ans = engine.eval(Question).toString();

                    if (Ans.contains(".")) {

                        double Answer = (double) engine.eval(Question);

                        //Converts the answer of the equation to a string, as Integers cannot be cast to strings
                        CorrectAnswer = String.valueOf(Decimal.format(Answer));
                        //Creates incorrect answers by adding a random double to the correct answer
                        Answer2 = String.valueOf(Decimal.format(Answer + num1.nextDouble()));
                        Answer3 = String.valueOf(Decimal.format(Answer - num2.nextDouble()));
                        Answer4 = String.valueOf(Decimal.format(Answer + num3.nextDouble()));

                        /*Prevents one of the incorrect answers from being equal to the correct answer
                    But the incorrect answers could potentially be equal to each other, although very unlikely */
                        while (CorrectAnswer.equals(Answer2) || CorrectAnswer.equals(Answer3) || CorrectAnswer.equals(Answer4)) {
                            Answer2 = String.valueOf(Decimal.format(Answer + num1.nextDouble()));
                            Answer3 = String.valueOf(Decimal.format(Answer - num2.nextDouble()));
                            Answer4 = String.valueOf(Decimal.format(Answer + num3.nextDouble()));
                        }
                    } else {
                        int Answer = (int) engine.eval(Question);
                        CorrectAnswer = String.valueOf(Decimal.format(Answer));
                        //Creates incorrect answers by adding a random double to the correct answer
                        Answer2 = String.valueOf(Decimal.format(Answer + num1.nextInt(5)));
                        Answer3 = String.valueOf(Decimal.format(Answer - num2.nextInt(5)));
                        Answer4 = String.valueOf(Decimal.format(Answer + num3.nextInt(5)));

                        while (CorrectAnswer.equals(Answer2) || CorrectAnswer.equals(Answer3) || CorrectAnswer.equals(Answer4)) {
                            Answer2 = String.valueOf(Decimal.format(Answer + num1.nextInt(5)));
                            Answer3 = String.valueOf(Decimal.format(Answer - num2.nextInt(5)));
                            Answer4 = String.valueOf(Decimal.format(Answer + num3.nextInt(5)));
                        }

                    }
                    //If Topic does not equal 3 (If topic is 1 or 2)
                } else {
                    /*This is the query that is going to extract a question and answer based on the topic the user has chosen 
                    and their difficulty setting in that topic */
                    Query = "SELECT Question, CorrectAnswer FROM questions WHERE DifficultySetting=" + DifSet + 
                            " AND Topic =" + Topic;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);
                    while (Result.next()) {
                        Question = Result.getString("Question");
                        CorrectAnswer = Result.getString("CorrectAnswer");

                        if (Topic == 1 && Integer.parseInt(DifSet) == 1) {
                            int Z = num1.nextInt(5);
                            int Y = num2.nextInt(5);
                            //The mathmatical formula of how a quadratic is formed
                            int B = Z + Y;
                            int C = Z * Y;
                            //Replaces the letters b and c with the correct Integers
                            Question = Question.replace("b", Integer.toString(B)).replace("c", Integer.toString(C));;

                            lblQuestion.setText(Question);
                            //Replaces the letters z and y with incorrect values to create incorrect answer choices
                            Answer2 = CorrectAnswer.replace("z", (Integer.toString(Z + 2))).replace("y", (Integer.toString(Y + 2)));
                            Answer3 = CorrectAnswer.replace("z", (Integer.toString(Z - 2))).replace("y", (Integer.toString(Y - 2)));
                            Answer4 = CorrectAnswer.replace("z", (Integer.toString(Z + 3))).replace("y", (Integer.toString(Y + 3)));
                            //Inserts the correct values to create the correct answer choice
                            CorrectAnswer = CorrectAnswer.replace("z", Integer.toString(Z)).replace("y", Integer.toString(Y));
                        }
                        if (Topic == 1 && Integer.parseInt(DifSet) == 2) {
                            int Z = num1.nextInt(5);
                            int Y = num2.nextInt(5);
                            int W = num3.nextInt(5);

                            /*If Z is 0 or 1 then the value will be changed, 
                            as this would make the question the same difficulty as the previous setting */
                            while (Z == 0) {
                                Z = num1.nextInt(5);
                            }

                            while (Z == 1) {
                                Z = num1.nextInt(5);
                            }
                            //If W is 0 then the value will be changed so that the question is not too easy
                            while (W == 0) {
                                W = num3.nextInt(5);
                            }
                            //The mathmatical formula for finding the values inside a quadratic of this form
                            int A = Z;
                            int B = (Z * W) + Y;
                            int C = (W * Y);

                            //Also replaces the letters it needs to for the question and answer choices to be appropriate
                            Question = Question.replace("a", Integer.toString(A)).replace("b", Integer.toString(B)).replace("c", Integer.toString(C));
                            lblQuestion.setText(Question);

                            Answer2 = CorrectAnswer.replace("z", (Integer.toString(Z))).replace("y", (Integer.toString(Y + 2))).replace("w", (Integer.toString(W + 3)));
                            Answer3 = CorrectAnswer.replace("z", (Integer.toString(Z))).replace("y", (Integer.toString(Y + 1))).replace("w", (Integer.toString(W + 2)));
                            Answer4 = CorrectAnswer.replace("z", (Integer.toString(Z))).replace("y", (Integer.toString(Y + 3))).replace("w", (Integer.toString(W + 1)));
                            CorrectAnswer = CorrectAnswer.replace("z", (Integer.toString(Z))).replace("y", (Integer.toString(Y))).replace("w", (Integer.toString(W)));
                        }
                        if (Topic == 1 && Integer.parseInt(DifSet) == 3) {
                            int Z = num1.nextInt(10);
                            //Only need to square the number that is randomized for these questions
                            int A = Z * Z;
                            Question = Question.replace("a", Integer.toString(A));
                            lblQuestion.setText(Question);
                            Answer2 = CorrectAnswer.replace("z", (Integer.toString(Z + 2)));
                            Answer3 = CorrectAnswer.replace("z", (Integer.toString(Z - 1)));
                            Answer4 = CorrectAnswer.replace("z", (Integer.toString(Z + 3)));
                            CorrectAnswer = CorrectAnswer.replace("z", Integer.toString(Z));
                        }
                        if (Topic == 2 && Integer.parseInt(DifSet) == 1) {
                            int M = num1.nextInt(15);
                            int C = num1.nextInt(15);
                            Question = Question.replace("m", Integer.toString(M)).replace("c", Integer.toString(C));
                            lblQuestion.setText(Question);
                            Answer2 = CorrectAnswer.replace("a", (Integer.toString(M - 6)));
                            Answer3 = CorrectAnswer.replace("a", (Integer.toString(M - 1)));
                            Answer4 = CorrectAnswer.replace("a", (Integer.toString(M + 5)));
                            CorrectAnswer = CorrectAnswer.replace("a", Integer.toString(M));
                        }
                        if (Topic == 2 && Integer.parseInt(DifSet) == 2) {
                            //Z = x value and J = y value, cannot be X and Y because it interferes with the rest of the question
                            int Z = num1.nextInt(5);
                            int J = num2.nextInt(10);
                            int M = num3.nextInt(5);

                            //This is the way that the Y intercept is found by rearranging the Y=mx+c formula
                            int C = J - (M * Z);
                            Question = Question.replace("m", Integer.toString(M)).replace("z", Integer.toString(Z)).replace("j", Integer.toString(J));
                            lblQuestion.setText(Question);
                            Answer2 = CorrectAnswer.replace("c", Integer.toString(C - 3));
                            Answer3 = CorrectAnswer.replace("c", Integer.toString(C + 2));
                            Answer4 = CorrectAnswer.replace("c", Integer.toString(C - 1));
                            CorrectAnswer = CorrectAnswer.replace("c", Integer.toString(C));
                        }
                        if (Topic == 2 && Integer.parseInt(DifSet) == 3) {
                            //X and Y are the x and y values of one point, Z and W are the x and y values of another point
                            int X = num1.nextInt(10);
                            int Y = num2.nextInt(10);
                            int Z = num3.nextInt(10);
                            int W = num4.nextInt(10);

                            while (W == Y) {
                                W = num4.nextInt(10);
                            }
                            while (Z == X) {
                                Z = num3.nextInt(10);
                            }

                            //A is the gradient, which is found using the formula (y2-y1 / x2-x1)
                            int A = (W - Y) / (Z - X);
                            Question = Question.replace("x", Integer.toString(X)).replace("y", Integer.toString(Y)).
                                    replace("z", Integer.toString(Z)).replace("w", Integer.toString(W));
                            lblQuestion.setText(Question);
                            Answer2 = CorrectAnswer.replace("a", Integer.toString(A + 3));
                            Answer3 = CorrectAnswer.replace("a", Integer.toString(A - 2));
                            Answer4 = CorrectAnswer.replace("a", Integer.toString(A + 1));
                            CorrectAnswer = CorrectAnswer.replace("a", Integer.toString(A));
                        }
                    }

                }

                //ButtonRandomizer will be assigned a random integer value between 1 and 4
                Random num5 = new Random();
                int ButtonRandomizer = num5.nextInt(5);
                /* The CorrectAnswer choice will be displayed as text in the button that corresponds with the integer value assigned to ButtonRandomizer
               *The other answer choices will be assigned to the remaining answer buttons
               *This is done so that there is not a noticeable pattern of where the correct answer choice will appear so that users cannot cheat
                 */

                if (ButtonRandomizer <= 1) {
                    btnAns1.setText(CorrectAnswer);
                    btnAns2.setText(Answer2);
                    btnAns3.setText(Answer3);
                    btnAns4.setText(Answer4);

                }
                if (ButtonRandomizer == 2) {
                    btnAns1.setText(Answer4);
                    btnAns2.setText(CorrectAnswer);
                    btnAns3.setText(Answer2);
                    btnAns4.setText(Answer3);
                }
                if (ButtonRandomizer == 3) {
                    btnAns1.setText(Answer3);
                    btnAns2.setText(Answer4);
                    btnAns3.setText(CorrectAnswer);
                    btnAns4.setText(Answer2);
                }
                if (ButtonRandomizer >= 4) {
                    btnAns1.setText(Answer2);
                    btnAns2.setText(Answer3);
                    btnAns3.setText(Answer4);
                    btnAns4.setText(CorrectAnswer);
                }

            }

        } catch (SQLException | HeadlessException | NumberFormatException | ScriptException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnGoActionPerformed

    private void btnAns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAns1ActionPerformed
        //Another connection to the database
        Connecting = ConnectDB.ConnectDB();
        int NewPercentage = 0;

        try {
            //Extracts the total possible score from the database
            Query = "SELECT Topic" + Topic + "PossibleScore FROM progress WHERE UserID = " + UsersID;
            Stmt = Connecting.prepareStatement(Query);
            Result = Stmt.executeQuery(Query);
            while (Result.next()) {
                String PossibleScore = Result.getString("Topic" + Topic + "PossibleScore");
                //Adds 10 to the possible score regardless of whether or not the question was answered correctly and then updates it
                NewPosScore = Integer.parseInt(PossibleScore) + 10;
                Query = "UPDATE progress SET Topic" + Topic + "PossibleScore = " + String.valueOf(NewPosScore) + " WHERE UserID = " + UsersID;
                Stmt = Connecting.prepareStatement(Query);
                Stmt.executeUpdate(Query);

                if (btnAns1.getText().contentEquals(CorrectAnswer)) {
                    //Selects the current score from that topic
                    Query = "SELECT Topic" + Topic + "Score FROM progress WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);

                    while (Result.next()) {
                        String Score = Result.getString("Topic" + Topic + "Score");
                        //Adds 10 to the current score
                        NewScore = Integer.parseInt(Score) + 10;
                        //Updates the new score
                        Query = "UPDATE progress SET Topic" + Topic + "Score = " + String.valueOf(NewScore) + " WHERE UserID = " + UsersID;
                        Stmt = Connecting.prepareStatement(Query);
                        Stmt.executeUpdate(Query);

                        //Selects the current success percentage in that topic
                        Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = " + UsersID;
                        Stmt = Connecting.prepareStatement(Query);
                        Result = Stmt.executeQuery(Query);
                        while (Result.next()) {
                            String OldPercentage = Result.getString("Topic" + Topic + "Percentage");

                            //Calculates a new or 'current' percentage based on the new score and new possible score
                            int CurrentPercentage = (NewScore * 100) / NewPosScore;
                            /*Finds an average of the old percentage and the current percentage to get a new percentage
                            * This way the percentage does not increase by too much at once, making the transition more gradual*/
                            NewPercentage = (Integer.parseInt(OldPercentage) + CurrentPercentage) / 2;

                            //Updates the new percentage
                            Query = "UPDATE progress SET Topic" + Topic + "Percentage = " + Integer.toString(NewPercentage) + " WHERE UserID = " + UsersID;
                            Stmt = Connecting.prepareStatement(Query);
                            Stmt.executeUpdate(Query);

                            //Let's the user know they were Correct and restarts the class               
                            JOptionPane.showMessageDialog(null, "Answer is Correct!");

                        }
                    }
                } else {
                    //Selects the current score, however it will not have an additional 10 points added to it
                    Query = "SELECT Topic" + Topic + "Score FROM progress WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);
                    while (Result.next()) {
                        String Score = Result.getString("Topic" + Topic + "Score");

                        if (Integer.parseInt(Score) > 0) {
                            /*If the user has answerd questions correctly before then a new percentage will be calculated, same as before
                            * However, this time the current percentage is going to be lower than the old percentage. Therefore the New percentage will also be lower */
                            Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = " + UsersID;
                            Stmt = Connecting.prepareStatement(Query);
                            Result = Stmt.executeQuery(Query);
                            while (Result.next()) {
                                String OldPercentage = Result.getString("Topic" + Topic + "Percentage");
                                int CurrentPercentage = (Integer.parseInt(Score) * 100) / NewPosScore;
                                NewPercentage = (Integer.parseInt(OldPercentage) + CurrentPercentage) / 2;

                                //The new percentage is updated
                                Query = "UPDATE progress SET Topic" + Topic + "Percentage = " + Integer.toString(NewPercentage) + " WHERE UserID = " + UsersID;
                                Stmt = Connecting.prepareStatement(Query);
                                Stmt.executeUpdate(Query);
                                //The same boundaries are used as when the user gets a question correct

                            }
                        }
                    }
                    //Lets the user know they were incorrect
                    JOptionPane.showMessageDialog(null, "Answer is incorrect... The correct answer was '" + CorrectAnswer + "'");
                }
                /*These values are used as boundaries, so that if the new percentage is within them then the user will have their 
                            * Difficulty setting updated to suit whatever boundary their percentage is in */
                if (NewPercentage <= 40) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 1 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }
                if (NewPercentage > 40 && NewPercentage <= 60) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 2 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }
                if (NewPercentage > 60) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 3 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }

                //Resets the topic to 0 so that the topic can then be randomized again, rather than continuing with the current topic
                if (TopicCheck == 1) {
                    Topic = 0;
                    TopicCheck = 0;
                }

                new QuestionUI().setVisible(true);
                this.dispose();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnAns1ActionPerformed

    private void btnAns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAns2ActionPerformed
        //Another connection to the database
        Connecting = ConnectDB.ConnectDB();
        int NewPercentage = 0;

        try {
            //Extracts the total possible score from the database
            Query = "SELECT Topic" + Topic + "PossibleScore FROM progress WHERE UserID = " + UsersID;
            Stmt = Connecting.prepareStatement(Query);
            Result = Stmt.executeQuery(Query);
            while (Result.next()) {
                String PossibleScore = Result.getString("Topic" + Topic + "PossibleScore");
                //Adds 10 to the possible score regardless of whether or not the question was answered correctly and then updates it
                NewPosScore = Integer.parseInt(PossibleScore) + 10;
                Query = "UPDATE progress SET Topic" + Topic + "PossibleScore = " + String.valueOf(NewPosScore) + " WHERE UserID = " + UsersID;
                Stmt = Connecting.prepareStatement(Query);
                Stmt.executeUpdate(Query);

                if (btnAns2.getText().contentEquals(CorrectAnswer)) {
                    //Selects the current score from that topic
                    Query = "SELECT Topic" + Topic + "Score FROM progress WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);

                    while (Result.next()) {
                        String Score = Result.getString("Topic" + Topic + "Score");
                        //Adds 10 to the current score
                        NewScore = Integer.parseInt(Score) + 10;
                        //Updates the new score
                        Query = "UPDATE progress SET Topic" + Topic + "Score = " + String.valueOf(NewScore) + " WHERE UserID = " + UsersID;
                        Stmt = Connecting.prepareStatement(Query);
                        Stmt.executeUpdate(Query);

                        //Selects the current success percentage in that topic
                        Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = " + UsersID;
                        Stmt = Connecting.prepareStatement(Query);
                        Result = Stmt.executeQuery(Query);
                        while (Result.next()) {
                            String OldPercentage = Result.getString("Topic" + Topic + "Percentage");

                            //Calculates a new or 'current' percentage based on the new score and new possible score
                            int CurrentPercentage = (NewScore * 100) / NewPosScore;
                            /*Finds an average of the old percentage and the current percentage to get a new percentage
                            * This way the percentage does not increase by too much at once, making the transition more gradual*/
                            NewPercentage = (Integer.parseInt(OldPercentage) + CurrentPercentage) / 2;

                            //Updates the new percentage
                            Query = "UPDATE progress SET Topic" + Topic + "Percentage = " + Integer.toString(NewPercentage) + " WHERE UserID = " + UsersID;
                            Stmt = Connecting.prepareStatement(Query);
                            Stmt.executeUpdate(Query);

                            //Let's the user know they were Correct and restarts the class               
                            JOptionPane.showMessageDialog(null, "Answer is Correct!");

                        }
                    }
                } else {
                    //Selects the current score, however it will not have an additional 10 points added to it
                    Query = "SELECT Topic" + Topic + "Score FROM progress WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);
                    while (Result.next()) {
                        String Score = Result.getString("Topic" + Topic + "Score");

                        if (Integer.parseInt(Score) > 0) {
                            /*If the user has answerd questions correctly before then a new percentage will be calculated, same as before
                            * However, this time the current percentage is going to be lower than the old percentage. Therefore the New percentage will also be lower */
                            Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = " + UsersID;
                            Stmt = Connecting.prepareStatement(Query);
                            Result = Stmt.executeQuery(Query);
                            while (Result.next()) {
                                String OldPercentage = Result.getString("Topic" + Topic + "Percentage");
                                int CurrentPercentage = (Integer.parseInt(Score) * 100) / NewPosScore;
                                NewPercentage = (Integer.parseInt(OldPercentage) + CurrentPercentage) / 2;

                                //The new percentage is updated
                                Query = "UPDATE progress SET Topic" + Topic + "Percentage = " + Integer.toString(NewPercentage) + " WHERE UserID = " + UsersID;
                                Stmt = Connecting.prepareStatement(Query);
                                Stmt.executeUpdate(Query);
                                //The same boundaries are used as when the user gets a question correct

                            }
                        }
                    }
                    //Lets the user know they were incorrect
                    JOptionPane.showMessageDialog(null, "Answer is incorrect... The correct answer was '" + CorrectAnswer + "'");
                }
                /*These values are used as boundaries, so that if the new percentage is within them then the user will have their 
                            * Difficulty setting updated to suit whatever boundary their percentage is in */
                if (NewPercentage <= 40) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 1 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }
                if (NewPercentage > 40 && NewPercentage <= 60) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 2 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }
                if (NewPercentage > 60) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 3 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }

                //Resets the topic to 0 so that the topic can then be randomized again, rather than continuing with the current topic
                if (TopicCheck == 1) {
                    Topic = 0;
                    TopicCheck = 0;
                }

                new QuestionUI().setVisible(true);
                this.dispose();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnAns2ActionPerformed

    private void btnAns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAns3ActionPerformed
        //Another connection to the database
        Connecting = ConnectDB.ConnectDB();
        int NewPercentage = 0;

        try {
            //Extracts the total possible score from the database
            Query = "SELECT Topic" + Topic + "PossibleScore FROM progress WHERE UserID = " + UsersID;
            Stmt = Connecting.prepareStatement(Query);
            Result = Stmt.executeQuery(Query);
            while (Result.next()) {
                String PossibleScore = Result.getString("Topic" + Topic + "PossibleScore");
                //Adds 10 to the possible score regardless of whether or not the question was answered correctly and then updates it
                NewPosScore = Integer.parseInt(PossibleScore) + 10;
                Query = "UPDATE progress SET Topic" + Topic + "PossibleScore = " + String.valueOf(NewPosScore) + " WHERE UserID = " + UsersID;
                Stmt = Connecting.prepareStatement(Query);
                Stmt.executeUpdate(Query);

                if (btnAns3.getText().contentEquals(CorrectAnswer)) {
                    //Selects the current score from that topic
                    Query = "SELECT Topic" + Topic + "Score FROM progress WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);

                    while (Result.next()) {
                        String Score = Result.getString("Topic" + Topic + "Score");
                        //Adds 10 to the current score
                        NewScore = Integer.parseInt(Score) + 10;
                        //Updates the new score
                        Query = "UPDATE progress SET Topic" + Topic + "Score = " + String.valueOf(NewScore) + " WHERE UserID = " + UsersID;
                        Stmt = Connecting.prepareStatement(Query);
                        Stmt.executeUpdate(Query);

                        //Selects the current success percentage in that topic
                        Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = " + UsersID;
                        Stmt = Connecting.prepareStatement(Query);
                        Result = Stmt.executeQuery(Query);
                        while (Result.next()) {
                            String OldPercentage = Result.getString("Topic" + Topic + "Percentage");

                            //Calculates a new or 'current' percentage based on the new score and new possible score
                            int CurrentPercentage = (NewScore * 100) / NewPosScore;
                            /*Finds an average of the old percentage and the current percentage to get a new percentage
                            * This way the percentage does not increase by too much at once, making the transition more gradual*/
                            NewPercentage = (Integer.parseInt(OldPercentage) + CurrentPercentage) / 2;

                            //Updates the new percentage
                            Query = "UPDATE progress SET Topic" + Topic + "Percentage = " + Integer.toString(NewPercentage) + " WHERE UserID = " + UsersID;
                            Stmt = Connecting.prepareStatement(Query);
                            Stmt.executeUpdate(Query);

                            //Let's the user know they were Correct and restarts the class               
                            JOptionPane.showMessageDialog(null, "Answer is Correct!");

                        }
                    }
                } else {
                    //Selects the current score, however it will not have an additional 10 points added to it
                    Query = "SELECT Topic" + Topic + "Score FROM progress WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);
                    while (Result.next()) {
                        String Score = Result.getString("Topic" + Topic + "Score");

                        if (Integer.parseInt(Score) > 0) {
                            /*If the user has answerd questions correctly before then a new percentage will be calculated, same as before
                            * However, this time the current percentage is going to be lower than the old percentage. Therefore the New percentage will also be lower */
                            Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = " + UsersID;
                            Stmt = Connecting.prepareStatement(Query);
                            Result = Stmt.executeQuery(Query);
                            while (Result.next()) {
                                String OldPercentage = Result.getString("Topic" + Topic + "Percentage");
                                int CurrentPercentage = (Integer.parseInt(Score) * 100) / NewPosScore;
                                NewPercentage = (Integer.parseInt(OldPercentage) + CurrentPercentage) / 2;

                                //The new percentage is updated
                                Query = "UPDATE progress SET Topic" + Topic + "Percentage = " + Integer.toString(NewPercentage) + " WHERE UserID = " + UsersID;
                                Stmt = Connecting.prepareStatement(Query);
                                Stmt.executeUpdate(Query);
                                //The same boundaries are used as when the user gets a question correct

                            }
                        }
                    }
                    //Lets the user know they were incorrect
                    JOptionPane.showMessageDialog(null, "Answer is incorrect... The correct answer was '" + CorrectAnswer + "'");
                }
                /*These values are used as boundaries, so that if the new percentage is within them then the user will have their 
                            * Difficulty setting updated to suit whatever boundary their percentage is in */
                if (NewPercentage <= 40) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 1 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }
                if (NewPercentage > 40 && NewPercentage <= 60) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 2 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }
                if (NewPercentage > 60) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 3 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }

                //Resets the topic to 0 so that the topic can then be randomized again, rather than continuing with the current topic
                if (TopicCheck == 1) {
                    Topic = 0;
                    TopicCheck = 0;
                }

                new QuestionUI().setVisible(true);
                this.dispose();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnAns3ActionPerformed

    private void btnAns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAns4ActionPerformed
        //Another connection to the database
        Connecting = ConnectDB.ConnectDB();
        int NewPercentage = 0;

        try {
            //Extracts the total possible score from the database
            Query = "SELECT Topic" + Topic + "PossibleScore FROM progress WHERE UserID = " + UsersID;
            Stmt = Connecting.prepareStatement(Query);
            Result = Stmt.executeQuery(Query);
            while (Result.next()) {
                String PossibleScore = Result.getString("Topic" + Topic + "PossibleScore");
                //Adds 10 to the possible score regardless of whether or not the question was answered correctly and then updates it
                NewPosScore = Integer.parseInt(PossibleScore) + 10;
                Query = "UPDATE progress SET Topic" + Topic + "PossibleScore = " + String.valueOf(NewPosScore) + " WHERE UserID = " + UsersID;
                Stmt = Connecting.prepareStatement(Query);
                Stmt.executeUpdate(Query);

                if (btnAns4.getText().contentEquals(CorrectAnswer)) {
                    //Selects the current score from that topic
                    Query = "SELECT Topic" + Topic + "Score FROM progress WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);

                    while (Result.next()) {
                        String Score = Result.getString("Topic" + Topic + "Score");
                        //Adds 10 to the current score
                        NewScore = Integer.parseInt(Score) + 10;
                        //Updates the new score
                        Query = "UPDATE progress SET Topic" + Topic + "Score = " + String.valueOf(NewScore) + " WHERE UserID = " + UsersID;
                        Stmt = Connecting.prepareStatement(Query);
                        Stmt.executeUpdate(Query);

                        //Selects the current success percentage in that topic
                        Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = " + UsersID;
                        Stmt = Connecting.prepareStatement(Query);
                        Result = Stmt.executeQuery(Query);
                        while (Result.next()) {
                            String OldPercentage = Result.getString("Topic" + Topic + "Percentage");

                            //Calculates a new or 'current' percentage based on the new score and new possible score
                            int CurrentPercentage = (NewScore * 100) / NewPosScore;
                            /*Finds an average of the old percentage and the current percentage to get a new percentage
                            * This way the percentage does not increase by too much at once, making the transition more gradual*/
                            NewPercentage = (Integer.parseInt(OldPercentage) + CurrentPercentage) / 2;

                            //Updates the new percentage
                            Query = "UPDATE progress SET Topic" + Topic + "Percentage = " + Integer.toString(NewPercentage) + " WHERE UserID = " + UsersID;
                            Stmt = Connecting.prepareStatement(Query);
                            Stmt.executeUpdate(Query);

                            //Let's the user know they were Correct and restarts the class               
                            JOptionPane.showMessageDialog(null, "Answer is Correct!");

                        }
                    }
                } else {
                    //Selects the current score, however it will not have an additional 10 points added to it
                    Query = "SELECT Topic" + Topic + "Score FROM progress WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery(Query);
                    while (Result.next()) {
                        String Score = Result.getString("Topic" + Topic + "Score");

                        if (Integer.parseInt(Score) > 0) {
                            /*If the user has answerd questions correctly before then a new percentage will be calculated, same as before
                            * However, this time the current percentage is going to be lower than the old percentage. Therefore the New percentage will also be lower */
                            Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = " + UsersID;
                            Stmt = Connecting.prepareStatement(Query);
                            Result = Stmt.executeQuery(Query);
                            while (Result.next()) {
                                String OldPercentage = Result.getString("Topic" + Topic + "Percentage");
                                int CurrentPercentage = (Integer.parseInt(Score) * 100) / NewPosScore;
                                NewPercentage = (Integer.parseInt(OldPercentage) + CurrentPercentage) / 2;

                                //The new percentage is updated
                                Query = "UPDATE progress SET Topic" + Topic + "Percentage = " + Integer.toString(NewPercentage) + " WHERE UserID = " + UsersID;
                                Stmt = Connecting.prepareStatement(Query);
                                Stmt.executeUpdate(Query);
                                //The same boundaries are used as when the user gets a question correct

                            }
                        }
                    }
                    //Lets the user know they were incorrect
                    JOptionPane.showMessageDialog(null, "Answer is incorrect... The correct answer was '" + CorrectAnswer + "'");
                }
                /*These values are used as boundaries, so that if the new percentage is within them then the user will have their 
                            * Difficulty setting updated to suit whatever boundary their percentage is in */
                if (NewPercentage <= 40) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 1 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }
                if (NewPercentage > 40 && NewPercentage <= 60) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 2 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }
                if (NewPercentage > 60) {
                    Query = "UPDATE progress SET Topic" + Topic + "Difficulty = 3 WHERE UserID = " + UsersID;
                    Stmt = Connecting.prepareStatement(Query);
                    Stmt.executeUpdate(Query);
                }

                //Resets the topic to 0 so that the topic can then be randomized again, rather than continuing with the current topic
                if (TopicCheck == 1) {
                    Topic = 0;
                    TopicCheck = 0;
                }

                new QuestionUI().setVisible(true);
                this.dispose();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnAns4ActionPerformed

    private void btnCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculatorActionPerformed
        //Opens up a class containing a calculator for the user to make use of when completing questions
        new Calculator().setVisible(true);
    }//GEN-LAST:event_btnCalculatorActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        new MainMenuUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAns1;
    private javax.swing.JButton btnAns2;
    private javax.swing.JButton btnAns3;
    private javax.swing.JButton btnAns4;
    private javax.swing.JButton btnCalculator;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTopic;
    // End of variables declaration//GEN-END:variables
}
