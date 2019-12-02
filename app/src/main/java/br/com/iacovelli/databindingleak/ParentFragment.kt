package br.com.iacovelli.databindingleak

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.parent_fragment.*

class ParentFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.parent_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val childFragment1 = ChildFragment1()
        childFragmentManager.commit {
            add(R.id.parentFragmentContainer, childFragment1)
        }

        nextScreenButton.setOnClickListener {
            childFragmentManager.commit {
                replace(R.id.parentFragmentContainer, ChildFragment2())
                addToBackStack(null)
            }
        }
    }
}