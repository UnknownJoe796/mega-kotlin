package com.ivieleague.mega

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.ivieleague.mega.builder.execute
import org.junit.Test

/**
 * Tests the core functionality.
 * Created by josep on 4/22/2017.
 */
class BasicTest {


    @Test
    fun testBasic() {
        val root = StandardRoot().apply {
            functions["add"] = StandardFunction {
                (it.execute("left") as Int) + (it.execute("right") as Int)
            }
            functions["mega.integer.signed.4.literal"] = StandardFunction(InterpretationInterface::literal)
            functions["increment"] = StandardFunction().apply {
                executions[Languages.DEFAULT] = StandardCall("add").apply {
                    arguments["left"] = Reference.RArgument(listOf(SubRef.Key("value")))
                    arguments["right"] = Reference.RCall(StandardCall("mega.integer.signed.4.literal", literal = 1))
                }
            }

            calls["main"] = StandardCall("increment", language = Languages.INTERPRET).apply {
                arguments["value"] = Reference.RCall(StandardCall("mega.integer.signed.4.literal", literal = 3))
            }
        }

        val yaml = ObjectMapper(YAMLFactory()).writeValueAsString(PrimitiveConversion.run { root.toPrimitive() })
        println(yaml)
        val recreated = PrimitiveConversion.run { ObjectMapper(YAMLFactory()).readValue(yaml, Map::class.java).toRoot() }
        val recreatedYaml = ObjectMapper(YAMLFactory()).writeValueAsString(PrimitiveConversion.run { recreated.toPrimitive() })
        println(recreatedYaml)

        val interpreter = SimpleInterpreter(root.calls["main"]!!, subRef = SubRef.Key("main"), language = Languages.INTERPRET, root = root, parent = null)
        println(interpreter.execute())
    }
}