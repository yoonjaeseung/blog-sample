package com.dataflow.sample

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cloud.task.configuration.EnableTask

@SpringBootApplication
@EnableTask
@EnableBatchProcessing
@EnableConfigurationProperties(BillArgument::class)
class SampleTaskApplication

fun main(args: Array<String>) {
    runApplication<SampleTaskApplication>(*args)
}