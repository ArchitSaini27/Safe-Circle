package com.archit.safecircle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class HomeScreenFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val memberItemArray: Array<MemberItem> =arrayOf(
            MemberItem("Archit","Noida",R.drawable.ic_launcher_background),
            MemberItem("Bhawna","Munich",R.drawable.ic_launcher_background),
            MemberItem("Shashi","Noida",R.drawable.ic_launcher_background)
        )
        val adapter:MemberAdapter= MemberAdapter(memberItemArray)
        val rv:RecyclerView=requireView().findViewById(R.id.member_recycler_view)
        rv.adapter=adapter

    }


    companion object {

        @JvmStatic
        fun newInstance() =HomeScreenFragment()

    }
}