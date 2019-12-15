package ch.d4span.taskbutler.ui.vaadin.views

import com.vaadin.flow.component.Text
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.tabs.Tab
import com.vaadin.flow.component.tabs.Tabs
import com.vaadin.flow.router.Route

@Route
class MainView : HorizontalLayout() {
    init {
        apply {
            alignItems = FlexComponent.Alignment.CENTER
        }

        add(Tabs(Tab("By Topic"), Tab("By Service")))
    }
}