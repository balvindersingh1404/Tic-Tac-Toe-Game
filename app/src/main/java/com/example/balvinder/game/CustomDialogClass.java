package com.example.balvinder.game;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CustomDialogClass extends Dialog implements
    android.view.View.OnClickListener {

  public Activity c;
  public Dialog d;
  public Button ok;
  String player;
  TextView txt_dia;
Boolean okclicked=false;
  public CustomDialogClass(Activity a,String player) {
    super(a);
    this.c = a;
    this.player=player;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.custom_dialogue);
    setCanceledOnTouchOutside(false);
    ok = (Button) findViewById(R.id.btn_ok);
    ok.setOnClickListener(this);
    txt_dia=(TextView) findViewById(R.id.txt_dia);
    if(player.equals("DRAW"))
    { txt_dia.setText("MATCH DRAW");}
    else{
    txt_dia.setText(player+" WINS");}
  }

  @Override
  public void onClick(View v) {
    okclicked=true;
    switch (v.getId()) {
    case R.id.btn_ok:

      break;
    default:
      break;
    }
    dismiss();
  }

}