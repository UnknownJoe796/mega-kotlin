package com.ivieleague.mega.stdlib

import com.ivieleague.mega.StandardFunction
import com.ivieleague.mega.builder.execute

/**
 * Integer functions for the standard library
 * Created by josep on 4/22/2017.
 */

fun StandardLibrary.numbers() {
    functions["mega.float.2.tan"] = StandardFunction { Math.tan((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.minus"] = StandardFunction { (it.execute("left") as Float).minus((it.execute("right") as Float)) }
    functions["mega.float.2.ceiling"] = StandardFunction { Math.ceil((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.compare"] = StandardFunction { ((it.execute("lesser") as Float) < (it.execute("greater") as Float)) }
    functions["mega.float.2.log"] = StandardFunction { Math.log((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.cos"] = StandardFunction { Math.cos((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.log10"] = StandardFunction { Math.log10((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.squareRoot"] = StandardFunction { Math.sqrt((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.acos"] = StandardFunction { Math.acos((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.atan"] = StandardFunction { Math.atan((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.plus"] = StandardFunction { (it.execute("left") as Float).plus((it.execute("right") as Float)) }
    functions["mega.float.2.equal"] = StandardFunction { ((it.execute("left") as Float) == (it.execute("right") as Float)) }
    functions["mega.float.2.times"] = StandardFunction { (it.execute("left") as Float).times((it.execute("right") as Float)) }
    functions["mega.float.2.round"] = StandardFunction { Math.round((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.negate"] = StandardFunction { ((it.execute("value") as Float).unaryMinus()) }
    functions["mega.float.2.absolute"] = StandardFunction { Math.abs((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.sin"] = StandardFunction { Math.sin((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.divide"] = StandardFunction { (it.execute("left") as Float).div((it.execute("right") as Float)) }
    functions["mega.float.2.asin"] = StandardFunction { Math.asin((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.power"] = StandardFunction { Math.pow((it.execute("value") as Float).toDouble(), (it.execute("ARG1") as Float).toDouble()).toFloat() }
    functions["mega.float.2.floor"] = StandardFunction { Math.floor((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.2.remainder"] = StandardFunction { (it.execute("left") as Float).rem((it.execute("right") as Float)) }

    functions["mega.float.2_to_mega.float.4"] = StandardFunction { (it.execute("value") as Float).toFloat() }
    functions["mega.float.2_to_mega.float.8"] = StandardFunction { (it.execute("value") as Float).toDouble() }
    functions["mega.float.2_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Float).toByte() }
    functions["mega.float.2_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Float).toShort() }
    functions["mega.float.2_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Float).toInt() }
    functions["mega.float.2_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Float).toLong() }
    functions["mega.float.2_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Float).toByte() }
    functions["mega.float.2_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Float).toShort() }
    functions["mega.float.2_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Float).toInt() }
    functions["mega.float.2_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Float).toLong() }
    functions["mega.float.2_to_mega.string"] = StandardFunction { (it.execute("value") as Float).toString() }

    functions["mega.float.4.tan"] = StandardFunction { Math.tan((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.minus"] = StandardFunction { (it.execute("left") as Float).minus((it.execute("right") as Float)) }
    functions["mega.float.4.ceiling"] = StandardFunction { Math.ceil((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.compare"] = StandardFunction { ((it.execute("lesser") as Float) < (it.execute("greater") as Float)) }
    functions["mega.float.4.log"] = StandardFunction { Math.log((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.cos"] = StandardFunction { Math.cos((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.log10"] = StandardFunction { Math.log10((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.squareRoot"] = StandardFunction { Math.sqrt((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.acos"] = StandardFunction { Math.acos((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.atan"] = StandardFunction { Math.atan((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.plus"] = StandardFunction { (it.execute("left") as Float).plus((it.execute("right") as Float)) }
    functions["mega.float.4.equal"] = StandardFunction { ((it.execute("left") as Float) == (it.execute("right") as Float)) }
    functions["mega.float.4.times"] = StandardFunction { (it.execute("left") as Float).times((it.execute("right") as Float)) }
    functions["mega.float.4.round"] = StandardFunction { Math.round((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.negate"] = StandardFunction { ((it.execute("value") as Float).unaryMinus()) }
    functions["mega.float.4.absolute"] = StandardFunction { Math.abs((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.sin"] = StandardFunction { Math.sin((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.divide"] = StandardFunction { (it.execute("left") as Float).div((it.execute("right") as Float)) }
    functions["mega.float.4.asin"] = StandardFunction { Math.asin((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.power"] = StandardFunction { Math.pow((it.execute("value") as Float).toDouble(), (it.execute("ARG1") as Float).toDouble()).toFloat() }
    functions["mega.float.4.floor"] = StandardFunction { Math.floor((it.execute("value") as Float).toDouble()).toFloat() }
    functions["mega.float.4.remainder"] = StandardFunction { (it.execute("left") as Float).rem((it.execute("right") as Float)) }

    functions["mega.float.4_to_mega.float.2"] = StandardFunction { (it.execute("value") as Float).toFloat() }
    functions["mega.float.4_to_mega.float.8"] = StandardFunction { (it.execute("value") as Float).toDouble() }
    functions["mega.float.4_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Float).toByte() }
    functions["mega.float.4_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Float).toShort() }
    functions["mega.float.4_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Float).toInt() }
    functions["mega.float.4_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Float).toLong() }
    functions["mega.float.4_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Float).toByte() }
    functions["mega.float.4_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Float).toShort() }
    functions["mega.float.4_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Float).toInt() }
    functions["mega.float.4_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Float).toLong() }
    functions["mega.float.4_to_mega.string"] = StandardFunction { (it.execute("value") as Float).toString() }

    functions["mega.float.8.tan"] = StandardFunction { Math.tan((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.minus"] = StandardFunction { (it.execute("left") as Double).minus((it.execute("right") as Double)) }
    functions["mega.float.8.ceiling"] = StandardFunction { Math.ceil((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.compare"] = StandardFunction { ((it.execute("lesser") as Double) < (it.execute("greater") as Double)) }
    functions["mega.float.8.log"] = StandardFunction { Math.log((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.cos"] = StandardFunction { Math.cos((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.log10"] = StandardFunction { Math.log10((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.squareRoot"] = StandardFunction { Math.sqrt((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.acos"] = StandardFunction { Math.acos((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.atan"] = StandardFunction { Math.atan((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.plus"] = StandardFunction { (it.execute("left") as Double).plus((it.execute("right") as Double)) }
    functions["mega.float.8.equal"] = StandardFunction { ((it.execute("left") as Double) == (it.execute("right") as Double)) }
    functions["mega.float.8.times"] = StandardFunction { (it.execute("left") as Double).times((it.execute("right") as Double)) }
    functions["mega.float.8.round"] = StandardFunction { Math.round((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.negate"] = StandardFunction { ((it.execute("value") as Double).unaryMinus()) }
    functions["mega.float.8.absolute"] = StandardFunction { Math.abs((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.sin"] = StandardFunction { Math.sin((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.divide"] = StandardFunction { (it.execute("left") as Double).div((it.execute("right") as Double)) }
    functions["mega.float.8.asin"] = StandardFunction { Math.asin((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.power"] = StandardFunction { Math.pow((it.execute("value") as Double).toDouble(), (it.execute("ARG1") as Double).toDouble()) }
    functions["mega.float.8.floor"] = StandardFunction { Math.floor((it.execute("value") as Double).toDouble()) }
    functions["mega.float.8.remainder"] = StandardFunction { (it.execute("left") as Double).rem((it.execute("right") as Double)) }

    functions["mega.float.8_to_mega.float.2"] = StandardFunction { (it.execute("value") as Double).toFloat() }
    functions["mega.float.8_to_mega.float.4"] = StandardFunction { (it.execute("value") as Double).toFloat() }
    functions["mega.float.8_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Double).toByte() }
    functions["mega.float.8_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Double).toShort() }
    functions["mega.float.8_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Double).toInt() }
    functions["mega.float.8_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Double).toLong() }
    functions["mega.float.8_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Double).toByte() }
    functions["mega.float.8_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Double).toShort() }
    functions["mega.float.8_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Double).toInt() }
    functions["mega.float.8_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Double).toLong() }
    functions["mega.float.8_to_mega.string"] = StandardFunction { (it.execute("value") as Double).toString() }

    functions["mega.integer.signed.1.equal"] = StandardFunction { ((it.execute("left") as Byte) == (it.execute("right") as Byte)) }
    functions["mega.integer.signed.1.minus"] = StandardFunction { (it.execute("left") as Byte).minus((it.execute("right") as Byte)).toByte() }
    functions["mega.integer.signed.1.times"] = StandardFunction { (it.execute("left") as Byte).times((it.execute("right") as Byte)).toByte() }
    functions["mega.integer.signed.1.compare"] = StandardFunction { ((it.execute("lesser") as Byte) < (it.execute("greater") as Byte)) }
    functions["mega.integer.signed.1.negate"] = StandardFunction { ((it.execute("value") as Byte).unaryMinus()).toByte() }
    functions["mega.integer.signed.1.absolute"] = StandardFunction { Math.abs((it.execute("value") as Byte).toDouble()).toByte() }
    functions["mega.integer.signed.1.divide"] = StandardFunction { (it.execute("left") as Byte).div((it.execute("right") as Byte)).toByte() }
    functions["mega.integer.signed.1.remainder"] = StandardFunction { (it.execute("left") as Byte).rem((it.execute("right") as Byte)).toByte() }
    functions["mega.integer.signed.1.plus"] = StandardFunction { (it.execute("left") as Byte).plus((it.execute("right") as Byte)).toByte() }

    functions["mega.integer.signed.1_to_mega.float.2"] = StandardFunction { (it.execute("value") as Byte).toFloat() }
    functions["mega.integer.signed.1_to_mega.float.4"] = StandardFunction { (it.execute("value") as Byte).toFloat() }
    functions["mega.integer.signed.1_to_mega.float.8"] = StandardFunction { (it.execute("value") as Byte).toDouble() }
    functions["mega.integer.signed.1_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Byte).toShort() }
    functions["mega.integer.signed.1_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Byte).toInt() }
    functions["mega.integer.signed.1_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Byte).toLong() }
    functions["mega.integer.signed.1_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Byte).toByte() }
    functions["mega.integer.signed.1_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Byte).toShort() }
    functions["mega.integer.signed.1_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Byte).toInt() }
    functions["mega.integer.signed.1_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Byte).toLong() }
    functions["mega.integer.signed.1_to_mega.string"] = StandardFunction { (it.execute("value") as Byte).toString() }

    functions["mega.integer.signed.2.equal"] = StandardFunction { ((it.execute("left") as Short) == (it.execute("right") as Short)) }
    functions["mega.integer.signed.2.minus"] = StandardFunction { (it.execute("left") as Short).minus((it.execute("right") as Short)).toShort() }
    functions["mega.integer.signed.2.times"] = StandardFunction { (it.execute("left") as Short).times((it.execute("right") as Short)).toShort() }
    functions["mega.integer.signed.2.compare"] = StandardFunction { ((it.execute("lesser") as Short) < (it.execute("greater") as Short)) }
    functions["mega.integer.signed.2.negate"] = StandardFunction { ((it.execute("value") as Short).unaryMinus()).toShort() }
    functions["mega.integer.signed.2.absolute"] = StandardFunction { Math.abs((it.execute("value") as Short).toDouble()).toShort() }
    functions["mega.integer.signed.2.divide"] = StandardFunction { (it.execute("left") as Short).div((it.execute("right") as Short)).toShort() }
    functions["mega.integer.signed.2.remainder"] = StandardFunction { (it.execute("left") as Short).rem((it.execute("right") as Short)).toShort() }
    functions["mega.integer.signed.2.plus"] = StandardFunction { (it.execute("left") as Short).plus((it.execute("right") as Short)).toShort() }

    functions["mega.integer.signed.2_to_mega.float.2"] = StandardFunction { (it.execute("value") as Short).toFloat() }
    functions["mega.integer.signed.2_to_mega.float.4"] = StandardFunction { (it.execute("value") as Short).toFloat() }
    functions["mega.integer.signed.2_to_mega.float.8"] = StandardFunction { (it.execute("value") as Short).toDouble() }
    functions["mega.integer.signed.2_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Short).toByte() }
    functions["mega.integer.signed.2_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Short).toInt() }
    functions["mega.integer.signed.2_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Short).toLong() }
    functions["mega.integer.signed.2_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Short).toByte() }
    functions["mega.integer.signed.2_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Short).toShort() }
    functions["mega.integer.signed.2_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Short).toInt() }
    functions["mega.integer.signed.2_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Short).toLong() }
    functions["mega.integer.signed.2_to_mega.string"] = StandardFunction { (it.execute("value") as Short).toString() }

    functions["mega.integer.signed.4.equal"] = StandardFunction { ((it.execute("left") as Int) == (it.execute("right") as Int)) }
    functions["mega.integer.signed.4.minus"] = StandardFunction { (it.execute("left") as Int).minus((it.execute("right") as Int)) }
    functions["mega.integer.signed.4.times"] = StandardFunction { (it.execute("left") as Int).times((it.execute("right") as Int)) }
    functions["mega.integer.signed.4.compare"] = StandardFunction { ((it.execute("lesser") as Int) < (it.execute("greater") as Int)) }
    functions["mega.integer.signed.4.negate"] = StandardFunction { ((it.execute("value") as Int).unaryMinus()) }
    functions["mega.integer.signed.4.absolute"] = StandardFunction { Math.abs((it.execute("value") as Int).toDouble()) }
    functions["mega.integer.signed.4.divide"] = StandardFunction { (it.execute("left") as Int).div((it.execute("right") as Int)) }
    functions["mega.integer.signed.4.remainder"] = StandardFunction { (it.execute("left") as Int).rem((it.execute("right") as Int)) }
    functions["mega.integer.signed.4.plus"] = StandardFunction { (it.execute("left") as Int).plus((it.execute("right") as Int)) }

    functions["mega.integer.signed.4_to_mega.float.2"] = StandardFunction { (it.execute("value") as Int).toFloat() }
    functions["mega.integer.signed.4_to_mega.float.4"] = StandardFunction { (it.execute("value") as Int).toFloat() }
    functions["mega.integer.signed.4_to_mega.float.8"] = StandardFunction { (it.execute("value") as Int).toDouble() }
    functions["mega.integer.signed.4_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Int).toByte() }
    functions["mega.integer.signed.4_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Int).toShort() }
    functions["mega.integer.signed.4_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Int).toLong() }
    functions["mega.integer.signed.4_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Int).toByte() }
    functions["mega.integer.signed.4_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Int).toShort() }
    functions["mega.integer.signed.4_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Int).toInt() }
    functions["mega.integer.signed.4_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Int).toLong() }
    functions["mega.integer.signed.4_to_mega.string"] = StandardFunction { (it.execute("value") as Int).toString() }

    functions["mega.integer.signed.8.equal"] = StandardFunction { ((it.execute("left") as Long) == (it.execute("right") as Long)) }
    functions["mega.integer.signed.8.minus"] = StandardFunction { (it.execute("left") as Long).minus((it.execute("right") as Long)) }
    functions["mega.integer.signed.8.times"] = StandardFunction { (it.execute("left") as Long).times((it.execute("right") as Long)) }
    functions["mega.integer.signed.8.compare"] = StandardFunction { ((it.execute("lesser") as Long) < (it.execute("greater") as Long)) }
    functions["mega.integer.signed.8.negate"] = StandardFunction { ((it.execute("value") as Long).unaryMinus()) }
    functions["mega.integer.signed.8.absolute"] = StandardFunction { Math.abs((it.execute("value") as Long).toDouble()) }
    functions["mega.integer.signed.8.divide"] = StandardFunction { (it.execute("left") as Long).div((it.execute("right") as Long)) }
    functions["mega.integer.signed.8.remainder"] = StandardFunction { (it.execute("left") as Long).rem((it.execute("right") as Long)) }
    functions["mega.integer.signed.8.plus"] = StandardFunction { (it.execute("left") as Long).plus((it.execute("right") as Long)) }

    functions["mega.integer.signed.8_to_mega.float.2"] = StandardFunction { (it.execute("value") as Long).toFloat() }
    functions["mega.integer.signed.8_to_mega.float.4"] = StandardFunction { (it.execute("value") as Long).toFloat() }
    functions["mega.integer.signed.8_to_mega.float.8"] = StandardFunction { (it.execute("value") as Long).toDouble() }
    functions["mega.integer.signed.8_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Long).toByte() }
    functions["mega.integer.signed.8_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Long).toShort() }
    functions["mega.integer.signed.8_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Long).toInt() }
    functions["mega.integer.signed.8_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Long).toByte() }
    functions["mega.integer.signed.8_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Long).toShort() }
    functions["mega.integer.signed.8_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Long).toInt() }
    functions["mega.integer.signed.8_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Long).toLong() }
    functions["mega.integer.signed.8_to_mega.string"] = StandardFunction { (it.execute("value") as Long).toString() }

    functions["mega.integer.unsigned.1.equal"] = StandardFunction { ((it.execute("left") as Byte) == (it.execute("right") as Byte)) }
    functions["mega.integer.unsigned.1.minus"] = StandardFunction { (it.execute("left") as Byte).minus((it.execute("right") as Byte)).toByte() }
    functions["mega.integer.unsigned.1.times"] = StandardFunction { (it.execute("left") as Byte).times((it.execute("right") as Byte)).toByte() }
    functions["mega.integer.unsigned.1.compare"] = StandardFunction { ((it.execute("lesser") as Byte) < (it.execute("greater") as Byte)) }
    functions["mega.integer.unsigned.1.divide"] = StandardFunction { (it.execute("left") as Byte).div((it.execute("right") as Byte)).toByte() }
    functions["mega.integer.unsigned.1.remainder"] = StandardFunction { (it.execute("left") as Byte).rem((it.execute("right") as Byte)).toByte() }
    functions["mega.integer.unsigned.1.plus"] = StandardFunction { (it.execute("left") as Byte).plus((it.execute("right") as Byte)).toByte() }

    functions["mega.integer.unsigned.1_to_mega.float.2"] = StandardFunction { (it.execute("value") as Byte).toFloat() }
    functions["mega.integer.unsigned.1_to_mega.float.4"] = StandardFunction { (it.execute("value") as Byte).toFloat() }
    functions["mega.integer.unsigned.1_to_mega.float.8"] = StandardFunction { (it.execute("value") as Byte).toDouble() }
    functions["mega.integer.unsigned.1_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Byte).toByte() }
    functions["mega.integer.unsigned.1_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Byte).toShort() }
    functions["mega.integer.unsigned.1_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Byte).toInt() }
    functions["mega.integer.unsigned.1_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Byte).toLong() }
    functions["mega.integer.unsigned.1_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Byte).toShort() }
    functions["mega.integer.unsigned.1_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Byte).toInt() }
    functions["mega.integer.unsigned.1_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Byte).toLong() }
    functions["mega.integer.unsigned.1_to_mega.string"] = StandardFunction { (it.execute("value") as Byte).toString() }

    functions["mega.integer.unsigned.2.equal"] = StandardFunction { ((it.execute("left") as Short) == (it.execute("right") as Short)) }
    functions["mega.integer.unsigned.2.minus"] = StandardFunction { (it.execute("left") as Short).minus((it.execute("right") as Short)).toShort() }
    functions["mega.integer.unsigned.2.times"] = StandardFunction { (it.execute("left") as Short).times((it.execute("right") as Short)).toShort() }
    functions["mega.integer.unsigned.2.compare"] = StandardFunction { ((it.execute("lesser") as Short) < (it.execute("greater") as Short)) }
    functions["mega.integer.unsigned.2.divide"] = StandardFunction { (it.execute("left") as Short).div((it.execute("right") as Short)).toShort() }
    functions["mega.integer.unsigned.2.remainder"] = StandardFunction { (it.execute("left") as Short).rem((it.execute("right") as Short)).toShort() }
    functions["mega.integer.unsigned.2.plus"] = StandardFunction { (it.execute("left") as Short).plus((it.execute("right") as Short)).toShort() }

    functions["mega.integer.unsigned.2_to_mega.float.2"] = StandardFunction { (it.execute("value") as Short).toFloat() }
    functions["mega.integer.unsigned.2_to_mega.float.4"] = StandardFunction { (it.execute("value") as Short).toFloat() }
    functions["mega.integer.unsigned.2_to_mega.float.8"] = StandardFunction { (it.execute("value") as Short).toDouble() }
    functions["mega.integer.unsigned.2_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Short).toByte() }
    functions["mega.integer.unsigned.2_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Short).toShort() }
    functions["mega.integer.unsigned.2_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Short).toInt() }
    functions["mega.integer.unsigned.2_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Short).toLong() }
    functions["mega.integer.unsigned.2_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Short).toByte() }
    functions["mega.integer.unsigned.2_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Short).toInt() }
    functions["mega.integer.unsigned.2_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Short).toLong() }
    functions["mega.integer.unsigned.2_to_mega.string"] = StandardFunction { (it.execute("value") as Short).toString() }

    functions["mega.integer.unsigned.4.equal"] = StandardFunction { ((it.execute("left") as Int) == (it.execute("right") as Int)) }
    functions["mega.integer.unsigned.4.minus"] = StandardFunction { (it.execute("left") as Int).minus((it.execute("right") as Int)) }
    functions["mega.integer.unsigned.4.times"] = StandardFunction { (it.execute("left") as Int).times((it.execute("right") as Int)) }
    functions["mega.integer.unsigned.4.compare"] = StandardFunction { ((it.execute("lesser") as Int) < (it.execute("greater") as Int)) }
    functions["mega.integer.unsigned.4.divide"] = StandardFunction { (it.execute("left") as Int).div((it.execute("right") as Int)) }
    functions["mega.integer.unsigned.4.remainder"] = StandardFunction { (it.execute("left") as Int).rem((it.execute("right") as Int)) }
    functions["mega.integer.unsigned.4.plus"] = StandardFunction { (it.execute("left") as Int).plus((it.execute("right") as Int)) }

    functions["mega.integer.unsigned.4_to_mega.float.2"] = StandardFunction { (it.execute("value") as Int).toFloat() }
    functions["mega.integer.unsigned.4_to_mega.float.4"] = StandardFunction { (it.execute("value") as Int).toFloat() }
    functions["mega.integer.unsigned.4_to_mega.float.8"] = StandardFunction { (it.execute("value") as Int).toDouble() }
    functions["mega.integer.unsigned.4_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Int).toByte() }
    functions["mega.integer.unsigned.4_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Int).toShort() }
    functions["mega.integer.unsigned.4_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Int).toInt() }
    functions["mega.integer.unsigned.4_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Int).toLong() }
    functions["mega.integer.unsigned.4_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Int).toByte() }
    functions["mega.integer.unsigned.4_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Int).toShort() }
    functions["mega.integer.unsigned.4_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as Int).toLong() }
    functions["mega.integer.unsigned.4_to_mega.string"] = StandardFunction { (it.execute("value") as Int).toString() }

    functions["mega.integer.unsigned.8.equal"] = StandardFunction { ((it.execute("left") as Long) == (it.execute("right") as Long)) }
    functions["mega.integer.unsigned.8.minus"] = StandardFunction { (it.execute("left") as Long).minus((it.execute("right") as Long)) }
    functions["mega.integer.unsigned.8.times"] = StandardFunction { (it.execute("left") as Long).times((it.execute("right") as Long)) }
    functions["mega.integer.unsigned.8.compare"] = StandardFunction { ((it.execute("lesser") as Long) < (it.execute("greater") as Long)) }
    functions["mega.integer.unsigned.8.divide"] = StandardFunction { (it.execute("left") as Long).div((it.execute("right") as Long)) }
    functions["mega.integer.unsigned.8.remainder"] = StandardFunction { (it.execute("left") as Long).rem((it.execute("right") as Long)) }
    functions["mega.integer.unsigned.8.plus"] = StandardFunction { (it.execute("left") as Long).plus((it.execute("right") as Long)) }

    functions["mega.integer.unsigned.8_to_mega.float.2"] = StandardFunction { (it.execute("value") as Long).toFloat() }
    functions["mega.integer.unsigned.8_to_mega.float.4"] = StandardFunction { (it.execute("value") as Long).toFloat() }
    functions["mega.integer.unsigned.8_to_mega.float.8"] = StandardFunction { (it.execute("value") as Long).toDouble() }
    functions["mega.integer.unsigned.8_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as Long).toByte() }
    functions["mega.integer.unsigned.8_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as Long).toShort() }
    functions["mega.integer.unsigned.8_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as Long).toInt() }
    functions["mega.integer.unsigned.8_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as Long).toLong() }
    functions["mega.integer.unsigned.8_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as Long).toByte() }
    functions["mega.integer.unsigned.8_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as Long).toShort() }
    functions["mega.integer.unsigned.8_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as Long).toInt() }
    functions["mega.integer.unsigned.8_to_mega.string"] = StandardFunction { (it.execute("value") as Long).toString() }


    functions["mega.string_to_mega.float.2"] = StandardFunction { (it.execute("value") as String).toFloat() }
    functions["mega.string_to_mega.float.4"] = StandardFunction { (it.execute("value") as String).toFloat() }
    functions["mega.string_to_mega.float.8"] = StandardFunction { (it.execute("value") as String).toDouble() }
    functions["mega.string_to_mega.integer.signed.1"] = StandardFunction { (it.execute("value") as String).toByte() }
    functions["mega.string_to_mega.integer.signed.2"] = StandardFunction { (it.execute("value") as String).toShort() }
    functions["mega.string_to_mega.integer.signed.4"] = StandardFunction { (it.execute("value") as String).toInt() }
    functions["mega.string_to_mega.integer.signed.8"] = StandardFunction { (it.execute("value") as String).toLong() }
    functions["mega.string_to_mega.integer.unsigned.1"] = StandardFunction { (it.execute("value") as String).toByte() }
    functions["mega.string_to_mega.integer.unsigned.2"] = StandardFunction { (it.execute("value") as String).toShort() }
    functions["mega.string_to_mega.integer.unsigned.4"] = StandardFunction { (it.execute("value") as String).toInt() }
    functions["mega.string_to_mega.integer.unsigned.8"] = StandardFunction { (it.execute("value") as String).toLong() }

    functions["mega.integer.signed.4.and"] = StandardFunction {
        (it.execute("this") as kotlin.Int).and(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.compareTo"] = StandardFunction {
        (it.execute("this") as kotlin.Int).compareTo(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.dec"] = StandardFunction {
        (it.execute("this") as kotlin.Int).dec()
    }
    functions["mega.integer.signed.4.div"] = StandardFunction {
        (it.execute("this") as kotlin.Int).div(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.inc"] = StandardFunction {
        (it.execute("this") as kotlin.Int).inc()
    }
    functions["mega.integer.signed.4.inv"] = StandardFunction {
        (it.execute("this") as kotlin.Int).inv()
    }
    functions["mega.integer.signed.4.minus"] = StandardFunction {
        (it.execute("this") as kotlin.Int).minus(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.mod"] = StandardFunction {
        (it.execute("this") as kotlin.Int).mod(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.or"] = StandardFunction {
        (it.execute("this") as kotlin.Int).or(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.plus"] = StandardFunction {
        (it.execute("this") as kotlin.Int).plus(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.rangeTo"] = StandardFunction {
        (it.execute("this") as kotlin.Int).rangeTo(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.rem"] = StandardFunction {
        (it.execute("this") as kotlin.Int).rem(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.shl"] = StandardFunction {
        (it.execute("this") as kotlin.Int).shl(it.execute("bitCount") as kotlin.Int)
    }
    functions["mega.integer.signed.4.shr"] = StandardFunction {
        (it.execute("this") as kotlin.Int).shr(it.execute("bitCount") as kotlin.Int)
    }
    functions["mega.integer.signed.4.times"] = StandardFunction {
        (it.execute("this") as kotlin.Int).times(it.execute("other") as kotlin.Int)
    }
    functions["mega.integer.signed.4.toByte"] = StandardFunction {
        (it.execute("this") as kotlin.Int).toByte()
    }
    functions["mega.integer.signed.4.toChar"] = StandardFunction {
        (it.execute("this") as kotlin.Int).toChar()
    }
    functions["mega.integer.signed.4.toDouble"] = StandardFunction {
        (it.execute("this") as kotlin.Int).toDouble()
    }
    functions["mega.integer.signed.4.toFloat"] = StandardFunction {
        (it.execute("this") as kotlin.Int).toFloat()
    }
    functions["mega.integer.signed.4.toInt"] = StandardFunction {
        (it.execute("this") as kotlin.Int).toInt()
    }
    functions["mega.integer.signed.4.toLong"] = StandardFunction {
        (it.execute("this") as kotlin.Int).toLong()
    }
    functions["mega.integer.signed.4.toShort"] = StandardFunction {
        (it.execute("this") as kotlin.Int).toShort()
    }
    functions["mega.integer.signed.4.unaryMinus"] = StandardFunction {
        (it.execute("this") as kotlin.Int).unaryMinus()
    }
    functions["mega.integer.signed.4.unaryPlus"] = StandardFunction {
        (it.execute("this") as kotlin.Int).unaryPlus()
    }
    functions["mega.integer.signed.4.ushr"] = StandardFunction {
        (it.execute("this") as kotlin.Int).ushr(it.execute("bitCount") as kotlin.Int)
    }
    functions["mega.integer.signed.4.xor"] = StandardFunction {
        (it.execute("this") as kotlin.Int).xor(it.execute("other") as kotlin.Int)
    }
}