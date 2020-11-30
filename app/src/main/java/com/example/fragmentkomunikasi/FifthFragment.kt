package com.example.fragmentkomunikasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class FifthFragment : Fragment() {
    // inisialisasi variabel communication view model
    private var communicationViewModel: CommunicationViewModel? = null
    // inisialisasi txtname
    private var txtName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        // tampilan yang dibuat pemanggilan yang dilakukan sistem
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.
        of(requireActivity()).
        get(CommunicationViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // menampilkan layout halaman yang akan ditampilkan
        return inflater.inflate(R.layout.fragment_fifth,
            container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        // tampilan yang dibuat
        super.onViewCreated(view, savedInstanceState)
        // tempat data yang akan ditampilkan
        txtName = view.findViewById(R.id.textViewName)
        communicationViewModel!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })
    }
    companion object {
        fun newInstance(): FifthFragment {
            return FifthFragment()
        }
    }
}