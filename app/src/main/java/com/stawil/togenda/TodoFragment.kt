package com.stawil.togenda

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.Unbinder

class TodoFragment : Fragment() {

    private var unbinder: Unbinder? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_todo, container, false)
        unbinder = ButterKnife.bind(view)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        unbinder?.unbind()
    }

    companion object {
        fun newInstance(): TodoFragment {
            val fragment = TodoFragment()
            fragment.retainInstance = true
            return fragment
        }
    }
}
