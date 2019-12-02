package br.com.iacovelli.databindingleak

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import br.com.iacovelli.databindingleak.databinding.ChildFragment2Binding

class ChildFragment2: Fragment() {

    lateinit var dataBinding: ChildFragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.child_fragment_2, container, false)
        dataBinding.lifecycleOwner = this
        return dataBinding.root
    }
}