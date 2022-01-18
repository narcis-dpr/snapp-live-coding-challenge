package cab.snapp.livecoding.ui.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cab.snapp.livecoding.databinding.ItemServicesBinding

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ServicesViewHolder(ItemServicesBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount() = 20

    inner class ServicesViewHolder(binding: ItemServicesBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            // Hello Snapp!
        }
    }
}