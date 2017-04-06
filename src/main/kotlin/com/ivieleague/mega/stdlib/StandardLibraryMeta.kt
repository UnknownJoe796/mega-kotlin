package com.ivieleague.mega.stdlib

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.ivieleague.mega.JSON

/**
 * Created by joseph on 4/5/17.
 */
fun StandardLibraryMeta() = JSON.toCall(ObjectMapper(YAMLFactory()).readValue("""---
mega:
  pointer:
    get:
      _compressed: "get [this]"
  boolean:
    equal:
      _compressed: "[values| = ]"
    not:
      _compressed: "not [value]"
    or:
      _compressed: "[values| or ]"
    and:
      _compressed: "[values| and ]"
    true:
      _compressed: "true"
    false:
      _compressed: "false"
    xor:
      _compressed: "[values| xor ]"
  debug:
    print:
      _compressed: "print [value]"
    info:
      _compressed: "get debug info from [value]"
  void:
    literal:
      _compressed: "nothing"
  string:
    concat:
      _compressed: "Combine [values]"
    join:
      _compressed: "Join [values] separating with [separator]"
    literal: {}
  array:
    literal:
      _compressed: "Array: [values]"
    make:
      _compressed: "Array: [count] copies of [value]"
    generate:
      _compressed: "Incomplete" #TODO
    element:
      _compressed: "[array][index]"
  meta:
    forEach:
      _compressed: "For each child of [ref], do:\n[statement]"
      index:
        _compressed: "Get current index of [forEach]"
    exists:
      _compressed: "[ref] exists"
  control:
    loop:
      _compressed: "Repeat [body]"
      break:
        _compressed: "Exit [loop]"
      continue:
        _compressed: "Skip the rest and continue [loop]"
    block:
      _compressed: "Do the following: \n[variables]\n[statements]"
      variable:
        _compressed: "starts out as [value], type [type]"
    if:
      _compressed: "if [condition]\nthen [consequent]\notherwise [alternative]"
  integer:
    signed:
      1:
        equal:
          _compressed: "[left] = [right]"
        product:
          _compressed: "[values| × ]"
        negative:
          _compressed: "-[value]"
        compare:
          _compressed: "[smaller] < [larger]"
        absolute:
          _compressed: "|[value]|"
        subtract:
          _compressed: "[left] - [right]"
        sum:
          _compressed: "[values| + ]"
        divide:
          _compressed: "[left] ÷ [right]"
        modulus:
          _compressed: "[left] modulus [right]"
        literal: {}
      2:
        equal:
          _compressed: "[left] = [right]"
        product:
          _compressed: "[values| × ]"
        negative:
          _compressed: "-[value]"
        compare:
          _compressed: "[smaller] < [larger]"
        absolute:
          _compressed: "|[value]|"
        subtract:
          _compressed: "[left] - [right]"
        sum:
          _compressed: "[values| + ]"
        divide:
          _compressed: "[left] ÷ [right]"
        modulus:
          _compressed: "[left] modulus [right]"
        literal: {}
      4:
        equal:
          _compressed: "[left] = [right]"
        product:
          _compressed: "[values| × ]"
        negative:
          _compressed: "-[value]"
        compare:
          _compressed: "[smaller] < [larger]"
        absolute:
          _compressed: "|[value]|"
        subtract:
          _compressed: "[left] - [right]"
        sum:
          _compressed: "[values| + ]"
        divide:
          _compressed: "[left] ÷ [right]"
        modulus:
          _compressed: "[left] modulus [right]"
        literal: {}
      8:
        equal:
          _compressed: "[left] = [right]"
        product:
          _compressed: "[values| × ]"
        negative:
          _compressed: "-[value]"
        compare:
          _compressed: "[smaller] < [larger]"
        absolute:
          _compressed: "|[value]|"
        subtract:
          _compressed: "[left] - [right]"
        sum:
          _compressed: "[values| + ]"
        divide:
          _compressed: "[left] ÷ [right]"
        modulus:
          _compressed: "[left] modulus [right]"
        literal: {}
    unsigned:
      1:
        equal:
          _compressed: "[left] = [right]"
        product:
          _compressed: "[values| × ]"
        compare:
          _compressed: "[smaller] < [larger]"
        subtract:
          _compressed: "[left] - [right]"
        sum:
          _compressed: "[values| + ]"
        divide:
          _compressed: "[left] ÷ [right]"
        modulus:
          _compressed: "[left] modulus [right]"
        literal: {}
      2:
        equal:
          _compressed: "[left] = [right]"
        product:
          _compressed: "[values| × ]"
        compare:
          _compressed: "[smaller] < [larger]"
        subtract:
          _compressed: "[left] - [right]"
        sum:
          _compressed: "[values| + ]"
        divide:
          _compressed: "[left] ÷ [right]"
        modulus:
          _compressed: "[left] modulus [right]"
        literal: {}
      4:
        equal:
          _compressed: "[left] = [right]"
        product:
          _compressed: "[values| × ]"
        compare:
          _compressed: "[smaller] < [larger]"
        subtract:
          _compressed: "[left] - [right]"
        sum:
          _compressed: "[values| + ]"
        divide:
          _compressed: "[left] ÷ [right]"
        modulus:
          _compressed: "[left] modulus [right]"
        literal: {}
      8:
        equal:
          _compressed: "[left] = [right]"
        product:
          _compressed: "[values| × ]"
        compare:
          _compressed: "[smaller] < [larger]"
        subtract:
          _compressed: "[left] - [right]"
        sum:
          _compressed: "[values| + ]"
        divide:
          _compressed: "[left] ÷ [right]"
        modulus:
          _compressed: "[left] modulus [right]"
        literal: {}
  float:
    2:
      equal:
        _compressed: "[left] = [right]"
      product:
        _compressed: "[values| × ]"
      negative:
        _compressed: "-[value]"
      compare:
        _compressed: "[smaller] < [larger]"
      absolute:
        _compressed: "|[value]|"
      subtract:
        _compressed: "[left] - [right]"
      sum:
        _compressed: "[values| + ]"
      divide:
        _compressed: "[left] ÷ [right]"
      modulus:
        _compressed: "[left] modulus [right]"
      literal: {}
    4:
      equal:
        _compressed: "[left] = [right]"
      product:
        _compressed: "[values| × ]"
      negative:
        _compressed: "-[value]"
      compare:
        _compressed: "[smaller] < [larger]"
      absolute:
        _compressed: "|[value]|"
      subtract:
        _compressed: "[left] - [right]"
      sum:
        _compressed: "[values| + ]"
      divide:
        _compressed: "[left] ÷ [right]"
      modulus:
        _compressed: "[left] modulus [right]"
      literal: {}
    8:
      equal:
        _compressed: "[left] = [right]"
      product:
        _compressed: "[values| × ]"
      negative:
        _compressed: "-[value]"
      compare:
        _compressed: "[smaller] < [larger]"
      absolute:
        _compressed: "|[value]|"
      subtract:
        _compressed: "[left] - [right]"
      sum:
        _compressed: "[values| + ]"
      divide:
        _compressed: "[left] ÷ [right]"
      modulus:
        _compressed: "[left] modulus [right]"
      literal: {}
  type:
    equal:
      _compressed: "[left] = [right]"
    set:
      _compressed: "set [this] to [value]"
""", Map::class.java))