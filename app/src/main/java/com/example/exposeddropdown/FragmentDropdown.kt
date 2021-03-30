package com.example.exposeddropdown

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentDropdown.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentDropdown : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view: View = inflater.inflate(R.layout.fragment_dropdown, container, false)
        val findId = view.findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)

        val language = resources.getStringArray(R.array.language)
        val stringAdapter = ArrayAdapter(requireContext(), R.layout.string_layout, language)

        findId.setAdapter(stringAdapter)

        // Inflate the layout for this fragment
        return view
    }
}