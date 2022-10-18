package by.sekrotse.personal.repository

import by.sekrotse.personal.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PersonRepository: JpaRepository<Person, UUID> {
}