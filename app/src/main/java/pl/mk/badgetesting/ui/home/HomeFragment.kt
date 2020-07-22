package pl.mk.badgetesting.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.badge.BadgeUtils
import pl.mk.badgetesting.R


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: ImageView = root.findViewById(R.id.text_home)


        val badgeDrawable = BadgeDrawable.create(context!!)
        badgeDrawable.number = 32
        BadgeUtils.attachBadgeDrawable(badgeDrawable, textView, root.findViewById(R.id.frame_layout))

        homeViewModel.text.observe(viewLifecycleOwner, Observer {
        })
        return root
    }
}