package org.example.lesson22

class MainScreenViewModel {
    var mainScreenState = MainScreenState("")

    fun loadData() {
        mainScreenState = mainScreenState.copy(DataState.EMPTY.state)
        Thread.sleep(1000)

        mainScreenState = mainScreenState.copy(DataState.LOADING.state, true)
        Thread.sleep(1000)

        mainScreenState = mainScreenState.copy(DataState.LOADED.state, false)
    }

    enum class DataState(val state: String) {
        EMPTY("отсутствие данных"),
        LOADING("загрузка  данных"),
        LOADED("наличие загруженных данных")
    }

    data class MainScreenState(val data: String, val isLoading: Boolean = false)
}