Given an array of ints, is it possible to choose a group of some of the ints,
beginning at the start index, such that the group sums to the given target?
However, with the additional constraint that all 6&#39;s must be chosen. (No
loops needed.)

possibleSum6(0, [5, 6, 2], 8) → true
possibleSum6(0, [5, 6, 2], 9) → false
possibleSum6(0, [5, 6, 2], 7) → false