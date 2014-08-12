/**
 * 
 */
package com.urlisit.esiteswrapper.views;

import java.util.List;
import java.util.Locale;

import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.urlisit.esiteswrapper.R;

/**
 * @author Todd Url
 *
 * Manages the Site configuration
 */
public class SiteView extends Fragment implements OnClickListener, TextToSpeech.OnInitListener, OnItemSelectedListener {
  
  public static final int VIEW_NUMBER = 0;
  public static final String VIEW_TITLE = "Site Configuration";
  public static final String VIEW_BACKGROUND_COLOR = "VIEW_BACKGROUND_COLOR";
  public static final String VIEW_NUMBER_KEY = "view_number";
  private TextToSpeech spokenText; 
  private String foo = "This is a test";
  
  /**
   * Default constructor. Every fragment must have an empty constructor, so it can be instantiated when restoring its activity's state.
   * It is strongly recommended that subclasses do not have other constructors with parameters, since these constructors will not be called
   * when the fragment is re-instantiated; instead, arguments can be supplied by the caller with setArguments(Bundle) and later retrieved
   * by the Fragment with getArguments().
   */
  public SiteView() { }
  
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    spokenText = new TextToSpeech(getActivity(), this); 
    View view = inflater.inflate(R.layout.site, container, false);
    view.setBackgroundColor(getArguments().getInt(VIEW_BACKGROUND_COLOR));
    
    TextView nameLabel = (TextView) view.findViewById(R.id.site_name_label);
    nameLabel.setText(nameLabel.getContentDescription());
    ImageButton nameDescription = (ImageButton) view.findViewById(R.id.site_name_description);
    nameDescription.setOnClickListener(this);
    EditText nameField = (EditText) view.findViewById(R.id.site_name_field);
    nameField.addTextChangedListener(new TextWatcher() {
      @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
      @Override public void onTextChanged(CharSequence s, int start, int before, int count) { }
      @Override public void afterTextChanged(Editable s) {
        getArguments().putString(getString(R.string.site_name_tag), s.toString());
      }
    });
    
    TextView descriptionLabel = (TextView) view.findViewById(R.id.site_description_label);
    descriptionLabel.setText(descriptionLabel.getContentDescription());
    ImageButton descriptionDescription = (ImageButton) view.findViewById(R.id.site_description_description);
    descriptionDescription.setOnClickListener(this);
    EditText descriptionField = (EditText) view.findViewById(R.id.site_description_field);
    descriptionField.addTextChangedListener(new TextWatcher() {
      @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
      @Override public void onTextChanged(CharSequence s, int start, int before, int count) { }
      @Override public void afterTextChanged(Editable s) {
        getArguments().putString(getString(R.string.site_description_tag), s.toString());
      }
    });
    
    
    /*
    List<View> focusables = view.getFocusables(View.FOCUS_RIGHT);
    for (View focusable : focusables) {
      Log.w("SiteView", "onCreateView() getFocusables()=" + focusable.toString());
    }
    */
    
    return view;
  }

  @Override
  public void onClick(View view) {
    spokenText.speak((String) view.getContentDescription(), TextToSpeech.QUEUE_FLUSH, null);
    new AlertDialog.Builder(view.getContext(), AlertDialog.THEME_HOLO_DARK)
    .setMessage(view.getContentDescription())
    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialog, int which) {
        dialog.dismiss();
        spokenText.stop();
      }
    }).show();
  }

  @Override
  public void onInit(int status) {
    if (status == TextToSpeech.SUCCESS) {
      int result = spokenText.setLanguage(Locale.US);
      if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
        Log.e("TTS", "This Language is not supported");
      }
    } else {
      Log.e("TTS", "Initilization Failed!");
    }
  }
  
  @Override
  public void onAttach(Activity activity) {
    super.onAttach(activity);
  }

  @Override
  public void onSaveInstanceState(Bundle savedInstanceState) {
    spokenText.shutdown();
  }

  @Override
  public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void onNothingSelected(AdapterView<?> arg0) {
    // TODO Auto-generated method stub
    
  }
  
}
