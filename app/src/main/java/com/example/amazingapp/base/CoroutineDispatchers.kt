package com.example.amazingapp.base

import kotlinx.coroutines.CoroutineDispatcher


class CoroutineDispatchers(
    val main: CoroutineDispatcher,
    val io: CoroutineDispatcher,
    val default: CoroutineDispatcher,
    val mainImmediate: CoroutineDispatcher,
)
