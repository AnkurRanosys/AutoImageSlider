package com.ranosys.autoimageslider.interfaces

import com.ranosys.autoimageslider.constants.ActionTypes

interface TouchListener {
    /**
     * Click listener touched item function.
     *
     * @param  touched  slider boolean
     */
    fun onTouched(touched: ActionTypes)
}