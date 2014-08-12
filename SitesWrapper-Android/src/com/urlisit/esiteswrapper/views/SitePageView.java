/**
 * 
 */
package com.urlisit.esiteswrapper.views;

import java.util.Locale;

import com.urlisit.esiteswrapper.R;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * @author url
 *
 */
public class SitePageView extends Fragment implements TextToSpeech.OnInitListener {
  
  public static final int PAGE_NUMBER = 0;
  public static final String PAGE_COLOR = "PAGE_COLOR";
  
  private TextToSpeech audio;

  /**
   * 
   */
  public SitePageView() { }
  
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState != null) {
      Log.w("SitePageView", "onCreate() - savedInstanceState != null");
    } else {
      Log.w("SitePageView", "onCreate() - savedInstanceState == null");
    }
  }
  
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    if (savedInstanceState != null) {
      Log.w("SitePageView", "onCreateView() - savedInstanceState != null");
    } else {
      Log.w("SitePageView", "onCreateView() - savedInstanceState == null");
    }
    View view = inflater.inflate(R.layout.site, container, false);
    view.setBackgroundColor(getArguments().getInt(PAGE_COLOR));
    audio = new TextToSpeech(getActivity(), this);
    attachEditTextField(view, R.id.site_name_label, R.id.site_name_description, R.id.site_name_field);
    attachEditTextField(view, R.id.site_description_label, R.id.site_description_description, R.id.site_description_field);
    return view;
  }
  
  /**
   * Sets the content of the label and information button views from values specified in the contentDescription attributes of the views
   * 
   * @param view
   * @param textView
   * @param imageButton
   */
  private void setFieldLabel(View view, int textView, int imageButton) {
    TextView label = (TextView) view.findViewById(textView);
    label.setText((CharSequence) label.getTag());
    final ImageButton infoButton = (ImageButton) view.findViewById(imageButton);
    infoButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        audio.speak((String) infoButton.getContentDescription(), TextToSpeech.QUEUE_FLUSH, null);
        new AlertDialog.Builder(view.getContext(), AlertDialog.THEME_HOLO_LIGHT)
        .setMessage(infoButton.getContentDescription())
        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
            audio.stop();
          }
        }).show();
      }
    });
  }
  
  private void attachEditTextField(final View view, int textView, int imageButton, int editText) {
    /*
     * Set the label and information button to the values specified in the TextView "tag" and ImageButton "contentDescription"
     */
    setFieldLabel(view, textView, imageButton);
    final EditText field = (EditText) view.findViewById(editText);
    /*
     * If the bundle contains content for this field's tag, then set the field's content from the bundle's content
     */
    if (getArguments().getString((String) field.getTag()) != null) {
      field.setText(getArguments().getString((String) field.getTag()));
    }
    /*
     * Update the bundle's content for the field's tag whenever the field's content changes
     */
    field.addTextChangedListener(new TextWatcher() {
      @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
      @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}
      @Override public void afterTextChanged(Editable contents) {
        getArguments().putString((String) field.getTag(), contents.toString());
      }
    });
  }

  @Override
  public void onInit(int status) {
    if (status == TextToSpeech.SUCCESS) {
      int result = audio.setLanguage(Locale.US);
      if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
        Log.e("TTS", "This Language is not supported");
      }
    } else {
      Log.e("TTS", "Initilization Failed!");
    }
  }

  @Override
  public void onSaveInstanceState(Bundle savedInstanceState) {
    audio.shutdown();
  }

}
