package com.example.fragmentkomunikasi

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText

class FirstFrament : Fragment() {
    // inisialisasi variabel communicationviewmodel
    private var communicationViewModel: CommunicationViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        // tampilan yang dibuat
        super.onCreate(savedInstanceState)
        communicationViewModel =
            ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // menampilkan layout halaman yang akan ditampilkan
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // tampilan yang dibuat
        super.onViewCreated(view, savedInstanceState)
        // menerima inputan yang berasal dari halaman layiut
        val nameEditText = view.findViewById<TextInputEditText>(R.id.textInputTextName)
        // eksekusi inputan yang diterima
        nameEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }
                override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                    communicationViewModel!!.setName(charSequence.toString())
                }
                override fun afterTextChanged(editable: Editable) {
                }
            })
    }

    companion object {
        fun newInstance(): FirstFrament {
            return FirstFrament()
        }
    }
}