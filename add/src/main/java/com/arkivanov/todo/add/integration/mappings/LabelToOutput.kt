package com.arkivanov.todo.add.integration.mappings

import com.arkivanov.todo.add.TodoAddComponent.Output
import com.arkivanov.todo.add.store.AddStore.Label

internal val labelToOutput: Label.() -> Output? =
    {
        when (this) {
            is Label.Added -> Output.Added(id = id, timestamp = timestamp, text = text)
        }
    }