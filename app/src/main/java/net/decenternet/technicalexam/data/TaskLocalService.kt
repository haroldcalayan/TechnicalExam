package net.decenternet.technicalexam.data

import net.decenternet.technicalexam.domain.Task

interface TaskLocalService {
    fun save(task: Task)
    fun findAll(): List<Task>
}