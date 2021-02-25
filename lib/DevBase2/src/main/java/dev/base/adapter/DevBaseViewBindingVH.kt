package dev.base.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import dev.base.utils.ViewBindingUtils

/**
 * detail: RecyclerView ViewBinding ViewHolder
 * @author Ttt
 */
class DevBaseViewBindingVH<VB : ViewBinding> : RecyclerView.ViewHolder {

    @JvmField
    val binding: VB

    constructor(itemView: View) : super(itemView) {
        binding = ViewBindingUtils.viewBindingJavaClass(null, null, itemView, javaClass)
    }

    constructor(vb: VB) : super(vb.root) {
        binding = vb
    }

    constructor(
        parent: ViewGroup,
        @LayoutRes resource: Int
    ) : this(LayoutInflater.from(parent.context).inflate(resource, null))

    constructor(
        context: Context,
        @LayoutRes resource: Int
    ) : this(LayoutInflater.from(context).inflate(resource, null))
}