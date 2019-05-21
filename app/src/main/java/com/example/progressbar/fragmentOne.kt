package com.example.progressbar

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_one.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [fragmentOne.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [fragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class fragmentOne : Fragment() {
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {

        val root = inflater.inflate(R.layout.fragment_one, container, false)

        // TODO Start Progress Bar
        root.buttonStart.setOnClickListener {
            listener?.onStartProgressBar()
        }

        // TODO Stop Progress Bar
        root.buttonStop.setOnClickListener {
            listener?.onStopProgressBar()
        }

        return root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        // TODO Connect Interface from MainActivity
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException()
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    // TODO Implement Interface to MainActivity
    interface OnFragmentInteractionListener {
        fun onStartProgressBar()
        fun onStopProgressBar()
    }

}
