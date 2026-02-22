# What did I learn 
## Data Types
- When to use int vs double/float—averages and profit calculations need floating-point types because integer division truncates decimals (e.g., dividing by 3 vs 3.0 gave different results: 604.8 vs 608.4)
- Choosing the right data type affects the accuracy of your final output
## Expressions & Calculations
- How to formulate expressions in Java (e.g., eggsPerChicken * chickenCount)
- Java follows order of operations (PEMDAS), but shorthand operators remove ambiguity
## Shorthand/Compound Assignment Operators
- += (addition assignment)—accumulating total eggs across days
- -=, *=, /=—used when dividing chicken count by 2 after the wild beast event
- ++ / -- increment and decrement operators—adding one chicken on Tuesday
Difference between chickenCount++ (uses old value first) vs ++chickenCount (increments first)
## Accumulator Variables
- totalEggs started at 0 and built up across multiple days—a cumulative/accumulator pattern
## Functions/Methods
- Creating a countEggs() method outside main to avoid repeating the same calculation
- Passing parameters between methods (scope—variables in main aren't accessible elsewhere)
- Return types—using int instead of void when the method needs to send a value back
## Output Labels
- Printing descriptive labels alongside variable values so output is readable (e.g., "daily average = " + dailyAverage)

