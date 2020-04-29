# RPGDiceRoller
A Dice Roller Library for Role-Playing Game Systems

## Starting Point

This library helps you to implement an RPG application.
You just need to import the libray in your project and use this methods.

## Methods

```
- DiceRoller.roll(String rollExpression)
- DiceRoller.diceRoll(String dice)
```

### DiceRoller.roll(String rollExpression)

By passing a Roll Expression as a paramether, this method will calculate the full expression and will return the result.

Example:
1d6 + 3d4 - 1

1d6 will get back a number from 1 up to 6
3d4 will get back a sum of 3 numbers from 1 up to 4
1 will be returned, but subtracting

final result will be a value between 3 and 17

### DiceRoller.diceRoll(String dice)

By passing a Dice as a paramether, this method will "roll the dice" one or multiple times and will return the result.

Example:
2d12

2d12 will get back a sum of 2 numbers from 1 up to 12

final result will be a value between 2 and 24

## Versioning

We use [SemVer](http://semver.org/) for versioning. For available versions, see the [tags of this repositóry](https://github.com/coppolaop/RPGDiceRoller/tags). 

## Creator

* **Marcos "Coppola" Gonçalves** - *2020* - [Coppolaop](https://github.com/coppolaop)

## Developers

* **Marcos "Coppola" Gonçalves** - *2020* - [Coppolaop](https://github.com/coppolaop)

## Testers

* **Marcos "Coppola" Gonçalves** - *2020* - [Coppolaop](https://github.com/coppolaop)

## License

This project is licensed under the Apache-2.0 license - see [LICENSE.md] (LICENSE) for more details.
