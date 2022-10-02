#   Code Coverage Methods

##  Statement coverage
Statement coverage is a white box testing technique, which involves the execution of all the statements at least once in the source code. It is used for calculation of the number of statements in source code which have been executed. The main purpose of Statement Coverage is to cover all the possible paths, lines and statements in source code.

Statement coverage is used to derive scenario based upon the structure of the code under test.
Using this technique we can check what the source code is expected to do and what it should not. It can also be used to check the quality of the code and the flow of different paths in the program. The main drawback of this technique is that we cannot test the false condition in it.


`
statement coverage = (number of executed statements/total number of statements) * 100
`

In White Box Testing, the tester is concentrating on how the software works. In other words, the tester will be concentrating on the internal working of source code concerning control flow graphs or flow charts.

Generally in any software, if we look at the source code, there will be a wide variety of elements like operators, functions, looping, exceptional handlers, etc. Based on the input to the program, some of the code statements may not be executed. The goal of Statement coverage is to cover all the possible path’s, line, and statement in the code.

What is covered by Statement Coverage?

1. Unused Statements
2. Dead Code
3. Unused Branches
4. Missing Statements

##  Branch coverage
Branch Coverage is a white box testing method in which every outcome from a code module(statement or loop) is tested. The purpose of branch coverage is to ensure that each decision condition from every branch is executed at least once. It helps to measure fractions of independent code segments and to find out sections having no branches. It covers all the possible outcomes (true and false) of each condition of decision point at least once.

The formula to calculate Branch Coverage:

`
branch coverage = number of executed branches / total number of branches
`

Branch coverage Testing offers the following advantages:

* Allows you to validate-all the branches in the code
* Helps you to ensure that no branched lead to any abnormality of the program’s operation
* Branch coverage method removes issues which happen because of statement coverage testing
* Allows you to find those areas which are not tested by other testing methods
* It allows you to find a quantitative measure of code coverage
* Branch coverage ignores branches inside the Boolean expressions


##  Condition(Predicate) coverage
Condition coverage testing is a type of white-box testing that tests all the conditional expressions in a program for all possible outcomes of the conditions. It is also called predicate coverage.
In branch coverage, all conditions must be executed at least once. On the other hand, in condition coverage, all possible outcomes of all conditions must be tested at least once.
Condition coverage is seen for Boolean expression, it ensures whether all the Boolean expressions have been evaluated to both TRUE and FALSE. It measures the conditions independently of each other.
Other control-flow code-coverage measures include linear code sequence and jump (LCSAJ) coverage, multiple condition coverage (also known as condition combination coverage) and condition determination coverage (also known as multiple condition decision coverage or modified condition decision coverage, MCDC). This technique requires the coverage of all conditions that can affect or determine the decision outcome.
