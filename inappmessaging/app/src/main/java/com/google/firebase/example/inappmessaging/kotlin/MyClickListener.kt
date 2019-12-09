package com.google.firebase.example.inappmessaging.kotlin

import com.google.firebase.inappmessaging.FirebaseInAppMessagingClickListener
import com.google.firebase.inappmessaging.model.Action
import com.google.firebase.inappmessaging.model.InAppMessage

// [START fiam_click_listener]
class MyClickListener : FirebaseInAppMessagingClickListener {

    override fun messageClicked(inAppMessage: InAppMessage, action: Action) {
        // Determine which URL the user clicked
        val url = action.actionUrl

        // Get general information about the campaign
        val metadata = inAppMessage.campaignMetadata

        // ...
    }
}
// [END fiam_click_listener]

// [START fiam_click_listener_bundles]
class MyClickListener : FirebaseInAppMessagingClickListener {

    override fun messageClicked(inAppMessage: InAppMessage, action: Action) {
        // Determine which URL the user clicked
        val url = action.actionUrl

        // Get data bundle for the inapp message
        val dataBundle = inAppMessage.getData
        // ...
    }
}
// [END fiam_click_listener_bundles]

