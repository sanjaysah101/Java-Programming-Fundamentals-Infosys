# Problem Statement:

Objective: To understand how to create variables, blocks, and methods using static and how to instantiate objects outside the class for the class's private constructors.

Problem Description: Create a Loan class for the class diagram shown

 
<img src="1.png"> 

Exercise-a (Static variable and method):

## Objective: 
To understand how to create static variables and methods and their usage.

## Problem Description: 
To count the number of objects created using static variable and method

### Step 1: 
To the above Loan class add a static variable loanCounter and the corresponding static getter method.

<img src="2.png"> 
 
### Step 2: 
In both, the constructors of the Loan class add the following statement

<img src="3.png"> 

### Step 3: 
Use the below skeleton code for the Tester class to do the required implementation.

<pre class="prettyprint linenums:1 prettyprinted" id="codepane0" style=""><ol class="linenums"><li value="1" class="L0"><code class="language-java"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">class</span><span class="pln"> </span><span class="typ">LoanTester</span><span class="pun">{</span></code></li><li class="L1"><code class="language-java"><span class="pln">   </span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> main </span><span class="pun">(</span><span class="typ">String</span><span class="pun">[]</span><span class="pln"> args</span><span class="pun">){</span></code></li><li class="L2"><code class="language-java"></code></li><li class="L3"><code class="language-java"><span class="pln">      </span><span class="com">//Create 2 objects of Loan class using the default and 2 using parametrized constructor.</span></code></li><li class="L4"><code class="language-java"><span class="pln">      </span><span class="com">//Use getter methods and display the value of loanCounter for every instance</span></code></li><li class="L5"><code class="language-java"></code></li><li class="L6"><code class="language-java"><span class="pln">  </span><span class="pun">}</span></code></li><li class="L7"><code class="language-java"><span class="pun">}</span></code><button id="copyButton0" class="transparent-button" tabindex="0" aria-label="copy" onclick="copyToClipBoardFunction(codepane0,copyButton0)" style="float: right; color: white;"><img aria-label="copy button" src="/assets/common/plugins/web-module/copyButtonImage.svg"></button></li></ol></pre>

Step 4: Compile and execute the program

Summary of this exercise:

You have learned

How to create static variables and methods