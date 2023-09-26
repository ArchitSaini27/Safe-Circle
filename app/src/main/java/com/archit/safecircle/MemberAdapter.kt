package com.archit.safecircle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberAdapter(private val members:Array<MemberItem>) : RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val view: View=LayoutInflater.from(parent.context).inflate(R.layout.member_item,parent,false)
        return MemberViewHolder(view)

    }

    override fun getItemCount(): Int {
        return members.size

    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.bind(members[position])

    }

    class MemberViewHolder(val item: View):RecyclerView.ViewHolder(item){


        val img: ImageView=item.findViewById(R.id.image_memberItem)
        val name: TextView=item.findViewById(R.id.text_name_member_item)
        val desc:TextView=item.findViewById(R.id.text_desc_member_item)

        fun bind( memberItem: MemberItem) {
            name.text=memberItem.Name
            img.setImageResource(memberItem.Image)
            desc.text=memberItem.Location

        }



    }

}