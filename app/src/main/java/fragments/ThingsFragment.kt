package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.mkbservices.coursework.R
import org.w3c.dom.Text


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ThingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThingsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_things, container, false)

        // Find the FAB by its ID



        return view
    }
//    private lateinit var fab1: FloatingActionButton
//    private lateinit var fab2: FloatingActionButton
//    private lateinit var fab3: FloatingActionButton
//    private lateinit var fab4: FloatingActionButton
//
//    private lateinit var textView1: TextView
//    private lateinit var textView2: TextView
//    private lateinit var textView3: TextView
//    private lateinit var textView4: TextView

//    private val fabTextViewMap = mapOf<FloatingActionButton, TextView>(
//        fab1 to textView1,
//        fab2 to textView2,
//        fab3 to textView3,
//        fab4 to textView4
//    )
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val fab1: FloatingActionButton = view.findViewById(R.id.things_fab_1)
//        val fab2: FloatingActionButton = view.findViewById(R.id.things_fab_2)
//        val fab3: FloatingActionButton = view.findViewById(R.id.things_fab)
//        val fab4: FloatingActionButton = view.findViewById(R.id.things_fab_4)
//
//        val textView1: TextView = view.findViewById(R.id.things_fab_1_textView)
//        val textView2: TextView = view.findViewById(R.id.things_fab_2_textView)
//        val textView3: TextView = view.findViewById(R.id.things_fab_3_textView)
//        val textView4: TextView = view.findViewById(R.id.things_fab_4_textView)
//
//        fab1.setOnClickListener{showOrHideTextView(fab1)}
//    }

//    private fun showOrHideTextView(fab:FloatingActionButton){
//       val textView = fabTextViewMap[fab]
//       if(textView?.visibility==View.VISIBLE){
//           textView.visibility= View.GONE
//       }else{
//           textView?.visibility=View.GONE
//       }
//    }




    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ThingsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ThingsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}