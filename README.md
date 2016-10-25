---
title: Unit Testing Lab
type: lab
duration: "1:30"
creator: James Davis (NYC)

---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Unit Testing

## Introduction

In a previous lab you created various subclasses of an Animal class.
Today you are going to start with an Android version of that project (provided as [starter-code](starter-code)) and write unit tests for it.

Just like in the original Animals lab, there are Mammal and Reptile classes that extend Animal, then some more specific classes that extend those.
Each class inherits a `getTopSpeed()` method from Animal, and each class implements its own version of the `makeNoise()` method.

## Exercise

#### Requirements

Begin with the [code provided](starter-code) and write tests to make sure:
- The animals make their appropriate sounds
- The animals have their appropriate top speeds
- The Zoo (singleton) properly adds and removes animals

Remember:
- You should make a separate test-class file for each target-class you are testing
- Some of your tests may need to call methods the target-class inherits from an ancestor class


##### Bonus

- Create a new animal and write appropriate tests for it

#### Starter code

The [starter code](starter-code) is an Android version of the previous animals lab you did in IntelliJ. This version incorporates the singleton design pattern for the Zoo object.

#### Deliverable

Submit a pull request with app with all passing tests!

## Additional Resources

- [JUnit docs](http://junit.org/)
