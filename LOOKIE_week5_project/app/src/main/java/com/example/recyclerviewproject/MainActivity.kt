package com.example.recyclerviewproject

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planList = ArrayList<Plan>()

        dialog_Btn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.dialog_view, null)
            val dialogDate = dialogView.findViewById<EditText>(R.id.dialog_date)
            val dialogContent = dialogView.findViewById<EditText>(R.id.dialog_content)

            builder.setView(dialogView)
                .setPositiveButton("ADD") { dialog, i ->
                    val date = dialogDate.text.toString()
                    val content = dialogContent.text.toString()
                    planList.add(Plan(date, content))
                }
                .setNegativeButton("BACK", null)
                .show()
        }

        val customAdapter = PlanAdapter(planList, LayoutInflater.from(this))
        planRecyclerview.adapter = customAdapter
        val manager = LinearLayoutManager(this)
        manager.reverseLayout = true
        manager.stackFromEnd = true
        planRecyclerview.layoutManager = manager

    }
}

class Plan(val date: String, val content: String) { }

class PlanAdapter (
    val planList: ArrayList<Plan>,
    val inflater: LayoutInflater
): RecyclerView.Adapter<PlanAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val date: TextView
        val content: TextView

        init {
            date = itemView.findViewById(R.id.plan_date)
            content = itemView.findViewById(R.id.plan_content)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.plan_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return planList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.date.setText(planList.get(position).date)
        holder.content.setText(planList.get(position).content)
    }

}