package ch.d4span.taskbutler.ui.vaadin.views

import com.vaadin.flow.component.Text
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route
class MainView : VerticalLayout() {
    init {
        add(Text("Welcome to MainView."))
    }
}