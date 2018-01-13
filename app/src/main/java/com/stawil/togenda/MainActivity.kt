package com.stawil.togenda

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

    @BindView(R.id.view_frameLayout)
    lateinit var frameLayout: FrameLayout

    @BindView(R.id.view_navigation)
    lateinit var tabLayout: TabLayout

    @BindView(R.id.view_toolbar)
    lateinit var toolBar: Toolbar

    @BindView(R.id.floating_action_button)
    lateinit var fab: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        setSupportActionBar(toolBar)

        tabLayout.clearOnTabSelectedListeners()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        supportFragmentManager.beginTransaction()
                                .replace(frameLayout.id, AgendaFragment.newInstance())
                                .commit()
                    }
                    1 -> {
                        supportFragmentManager.beginTransaction()
                                .replace(frameLayout.id, TodoFragment.newInstance())
                                .commit()
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                //unimplemented
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                //unimplemented
            }
        })
    }

    @OnClick(R.id.floating_action_button)
    fun newTask() {
        //todo:create a new task
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {
                //todo: add setings menu
                return true
            }
            android.R.id.home -> {
                onBackPressed()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
