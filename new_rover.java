package com.example.bruno.zup;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class new_rover extends AppCompatActivity {
    private EditText edtXPlateau;
    private EditText edtYPlateau;
    private EditText edtX;
    private EditText edtY;
    private EditText edtDirection;
    private EditText edtInstruction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_rover);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        edtXPlateau = (EditText) super.findViewById(R.id.edtXPLateau);
        edtXPlateau = (EditText) super.findViewById(R.id.edtYPlateau);
        edtX = (EditText) super.findViewById(R.id.edtX);
        edtY = (EditText) super.findViewById(R.id.edtY);
        edtDirection = (EditText) super.findViewById(R.id.edtDirection);
        edtInstruction = (EditText) super.findViewById(R.id.edtInstruction);

    }


    public void NewRover(View v) {
        try {

            //tive problema com a entrada de dados
            Plateau plateau = new Plateau();
            plateau.setX(Integer.parseInt((edtXPlateau.getText().toString())));
            plateau.setY(Integer.parseInt((edtYPlateau.getText().toString())));

            Position position = new Position();
            position.setX(Integer.parseInt(edtX.getText().toString()));
            position.setY(Integer.parseInt(edtY.getText().toString()));
            position.setDirection(Direction.valueOf(edtDirection.getText().toString()));

            Rover rover = new Rover();
            rover.setPlateau(plateau);
            rover.setPosition(position);

            Instruction instruction = new Instruction();
            instruction.process(edtInstruction.getText().toString(), rover);


            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Rover eviado com sucesso! Posicao final: " + rover.getPosition());
            dlg.setNeutralButton("OK", null);
            dlg.show();

        } catch (Exception e) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro no envio!" + e.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
    }
}





