package ch.d4span.taskbutler.ui.vaadin.views

import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.tabs.Tab
import com.vaadin.flow.component.tabs.Tabs
import java.util.stream.Collectors
import kotlin.streams.toList
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MainViewTest {
    private lateinit var view: MainView

    @BeforeTest
    fun prepare() {
        this.view = MainView()
    }

    @Test
    fun layoutType() {
        assertTrue { view is HorizontalLayout }
        assertTrue { view.alignItems == FlexComponent.Alignment.CENTER}
    }

    @Test
    fun viewContainsTabs() {
        this.view.children.toList().run {
            assertEquals(1, size)

            val tabs = first()
            assertTrue(tabs is Tabs)

            tabs.children.toList().run {
                assertEquals(2, count())

                toList().run {
                    assertEquals("By Topic", (first() as Tab).label)
                    assertEquals("By Service", (last() as Tab).label)
                }
            }
        }
    }
}