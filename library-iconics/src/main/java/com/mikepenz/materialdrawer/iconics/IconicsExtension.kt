package com.mikepenz.materialdrawer.iconics

import android.os.Build
import com.mikepenz.iconics.typeface.IIcon
import com.mikepenz.materialdrawer.model.BaseDrawerItem
import com.mikepenz.materialdrawer.model.MiniProfileDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.ProfileSettingDrawerItem

var <T : BaseDrawerItem<*, *>> T.iconicsIcon: IconicsImageHolder?
    get() = icon as? IconicsImageHolder
    set(value) {
        this.icon = value
        //if we are on api 21 or higher we use the IconicsDrawable for selection too and color it with the correct color
        //else we use just the one drawable and enable tinting on press
        if (Build.VERSION.SDK_INT >= 21) {
            this.selectedIcon = value
        } else if (value != null) {
            this.withIconTintingEnabled(true)
        }
    }

@Deprecated("Please consider to replace with the actual property setter")
fun <T : BaseDrawerItem<*, *>> T.withIcon(icon: IIcon): T {
    this.iconicsIcon = IconicsImageHolder(icon)
    return this
}

var <T : ProfileDrawerItem> T.iconicsIcon: IconicsImageHolder?
    get() = icon as? IconicsImageHolder
    set(value) {
        this.icon = value
    }

@Deprecated("Please consider to replace with the actual property setter")
fun ProfileDrawerItem.withIcon(icon: IIcon): ProfileDrawerItem {
    this.iconicsIcon = IconicsImageHolder(icon)
    return this
}

var <T : ProfileSettingDrawerItem> T.iconicsIcon: IconicsImageHolder?
    get() = icon as? IconicsImageHolder
    set(value) {
        this.icon = value
    }

@Deprecated("Please consider to replace with the actual property setter")
fun ProfileSettingDrawerItem.withIcon(icon: IIcon): ProfileSettingDrawerItem {
    this.icon = IconicsImageHolder(icon)
    return this
}

var <T : MiniProfileDrawerItem> T.iconicsIcon: IconicsImageHolder?
    get() = icon as? IconicsImageHolder
    set(value) {
        this.icon = value
    }

@Deprecated("Please consider to replace with the actual property setter")
fun MiniProfileDrawerItem.withIcon(icon: IIcon): MiniProfileDrawerItem {
    this.icon = IconicsImageHolder(icon)
    return this
}