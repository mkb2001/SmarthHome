package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mkbservices.coursework.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RoutinesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RoutinesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val textView = view?.findViewById<TextView>(R.id.textView18_1)
        val routines = view?.findViewById<TextView>(R.id.Routines)
        val routinesText = view?.findViewById<TextView>(R.id.Routines_text)
        val routinesImage = view?.findViewById<ImageView>(R.id.Routines_text)
        val routinesFab = view?.findViewById<FloatingActionButton>(R.id.my_fab)
        val routinesLayout = view?.findViewById<LinearLayout>(R.id.linearLayout)
        val routinesLayout1 = view?.findViewById<LinearLayout>(R.id.linearLayout2)
        val newtext = arguments?.getString("new_text")
        if (newtext != null) {
            if (textView != null) {
                if (routines != null) {
                    routines.visibility = View.GONE
                }
                if (routinesText != null) {
                    routinesText.visibility = View.GONE
                }
                if (routinesImage != null) {
                    routinesImage.visibility = View.GONE
                }
                if (routinesFab != null) {
                    routinesFab.visibility = View.GONE
                }
                if (routinesLayout != null) {
                    routinesLayout.visibility=View.VISIBLE
                }
                if (routinesLayout1 != null) {
                    routinesLayout1.visibility=View.VISIBLE
                }
                textView.text = newtext
            }
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_routines, container, false)
    }

    companion object {
        fun newInstance(text: String): RoutinesFragment {
            val args = Bundle()
            args.putString("text", text)
            val fragment = RoutinesFragment()
            fragment.arguments = args
            return fragment
        }
    }
}