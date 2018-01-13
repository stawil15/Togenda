package com.stawil.togenda

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder

class AgendaFragment : Fragment() {

    @BindView(R.id.rv_agenda)
    var rvAgenda: RecyclerView? = null

    private var unbinder: Unbinder? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_agenda, container, false)
        unbinder = ButterKnife.bind(view)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        unbinder?.unbind()
    }

    companion object {
        fun newInstance(): AgendaFragment {
            val fragment = AgendaFragment()
            fragment.retainInstance = true
            return fragment
        }
    }
}
