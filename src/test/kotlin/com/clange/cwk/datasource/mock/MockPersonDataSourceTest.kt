package com.clange.cwk.datasource.mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockPersonDataSourceTest {

    private val mockDataSource = MockPersonDataSource()

    @Test
    fun `should provide a collection of persons`() {
        // given

        // when
        val persons = mockDataSource.getPersons()

        // then
        assertThat(persons).isNotEmpty
    }

    @Test
    fun `should provide some mock data`() {
        // given

        // when
        val persons = mockDataSource.getPersons()

        // then
        assertThat(persons).allMatch { it.firstName.isNotBlank() }
        assertThat(persons).allMatch { it.lastName.isNotBlank() }
        assertThat(persons).allMatch { it.age != 0  }
    }
}