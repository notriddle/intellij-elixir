package org.elixir_lang.mix.configuration

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.ConfigurationTypeBase
import com.intellij.openapi.extensions.Extensions
import org.elixir_lang.icons.ElixirIcons

/**
 * https://github.com/ignatov/intellij-erlang/blob/master/src/org/intellij/erlang/rebar/runner/RebarRunConfigurationType.java
 */
class Type: ConfigurationTypeBase(TYPE_ID, TYPE_NAME, "Runs a Mix command", ElixirIcons.MIX) {
    override fun getConfigurationFactories(): Array<ConfigurationFactory> = arrayOf(Factory)

    companion object {
        val INSTANCE: Type
            get() = Extensions.findExtension<ConfigurationType, Type>(ConfigurationType.CONFIGURATION_TYPE_EP, Type::class.java)
    }
}

const val TYPE_ID = "MixRunConfigurationType"
const val TYPE_NAME = "Elixir Mix"
