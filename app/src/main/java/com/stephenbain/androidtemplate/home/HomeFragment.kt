package com.stephenbain.androidtemplate.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.stephenbain.androidtemplate.R
import com.stephenbain.androidtemplate.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    override val layoutId: Int
        get() = R.layout.fragment_home

    private val viewModel by getViewModel<HomeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.state.observe(viewLifecycleOwner) { state ->
            text.text = state.text
        }
    }
}
