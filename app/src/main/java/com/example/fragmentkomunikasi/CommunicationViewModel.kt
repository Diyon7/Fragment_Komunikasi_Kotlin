package com.example.fragmentkomunikasi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// untuk menampung data viewmodel live data instance
class CommunicationViewModel : ViewModel() {
    // inisialisasi variabel
    private val mName = MutableLiveData<String>()
    // inisialisasi variabel
    val name: LiveData<String>
        get() = mName

    fun setName(name: String) {
        mName.value = name
    }
}