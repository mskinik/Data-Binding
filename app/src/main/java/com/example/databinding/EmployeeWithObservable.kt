package com.example.databinding

import android.databinding.ObservableField

/**
 * Created by mustafasuleymankinik on 22.01.2022
 */
data class EmployeeWithObservable(
    val name:ObservableField<String> = ObservableField<String>(),
    val surname:ObservableField<String> = ObservableField<String>(),
    val title:ObservableField<String> = ObservableField<String>(),
    val degree:ObservableField<Int> = ObservableField<Int>(),
    val image:ObservableField<String> = ObservableField<String>()
)
