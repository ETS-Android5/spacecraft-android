package com.hawksjamesf.uicomponent.coordinator

import android.view.View
import com.google.android.material.R

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawks.jamesf
 * @since: Nov/23/2019  Sat
 */
fun View.getViewOffsetHelper(): ViewOffsetHelper {
    var offsetHelper = getTag(R.id.view_offset_helper) as? ViewOffsetHelper
    if (offsetHelper == null) {
        offsetHelper = ViewOffsetHelper(this)
        setTag(R.id.view_offset_helper, offsetHelper)
    }
    return offsetHelper
}

fun View.getMaxOffsetForPinChild(containerHeight:Int): Int {
    val lp = layoutParams as CollapsingBarsLayout.LayoutParams
    return containerHeight - getViewOffsetHelper().layoutTop - height - lp.bottomMargin

}