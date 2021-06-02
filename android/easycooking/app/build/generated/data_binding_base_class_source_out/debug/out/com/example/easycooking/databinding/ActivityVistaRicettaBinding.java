// Generated by view binder compiler. Do not edit!
package com.example.easycooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.easycooking.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVistaRicettaBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView Ingredienti;

  @NonNull
  public final TextView Quantit;

  @NonNull
  public final TextView UnitDimisura;

  @NonNull
  public final TextView categoria;

  @NonNull
  public final TextView immagineRicettaVista;

  @NonNull
  public final TextView intolleranze;

  @NonNull
  public final TextView origine;

  @NonNull
  public final ImageView photo;

  @NonNull
  public final TextView procedimentoVista;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TableLayout tableLayout2;

  @NonNull
  public final TableLayout tableLayout3;

  @NonNull
  public final TableLayout tableLayout4;

  @NonNull
  public final TextView tempoCottura;

  @NonNull
  public final TextView tempoPreparazione;

  @NonNull
  public final TextView tempoTotale;

  @NonNull
  public final TextView textView27;

  @NonNull
  public final TextView textView28;

  @NonNull
  public final TextView textView29;

  @NonNull
  public final TextView textView33;

  @NonNull
  public final TextView textView34;

  @NonNull
  public final TextView textView35;

  @NonNull
  public final TextView textView36;

  @NonNull
  public final TextView textView41;

  @NonNull
  public final TextView textView43;

  @NonNull
  public final TextView vegano;

  private ActivityVistaRicettaBinding(@NonNull ScrollView rootView, @NonNull TextView Ingredienti,
      @NonNull TextView Quantit, @NonNull TextView UnitDimisura, @NonNull TextView categoria,
      @NonNull TextView immagineRicettaVista, @NonNull TextView intolleranze,
      @NonNull TextView origine, @NonNull ImageView photo, @NonNull TextView procedimentoVista,
      @NonNull TableLayout tableLayout, @NonNull TableLayout tableLayout2,
      @NonNull TableLayout tableLayout3, @NonNull TableLayout tableLayout4,
      @NonNull TextView tempoCottura, @NonNull TextView tempoPreparazione,
      @NonNull TextView tempoTotale, @NonNull TextView textView27, @NonNull TextView textView28,
      @NonNull TextView textView29, @NonNull TextView textView33, @NonNull TextView textView34,
      @NonNull TextView textView35, @NonNull TextView textView36, @NonNull TextView textView41,
      @NonNull TextView textView43, @NonNull TextView vegano) {
    this.rootView = rootView;
    this.Ingredienti = Ingredienti;
    this.Quantit = Quantit;
    this.UnitDimisura = UnitDimisura;
    this.categoria = categoria;
    this.immagineRicettaVista = immagineRicettaVista;
    this.intolleranze = intolleranze;
    this.origine = origine;
    this.photo = photo;
    this.procedimentoVista = procedimentoVista;
    this.tableLayout = tableLayout;
    this.tableLayout2 = tableLayout2;
    this.tableLayout3 = tableLayout3;
    this.tableLayout4 = tableLayout4;
    this.tempoCottura = tempoCottura;
    this.tempoPreparazione = tempoPreparazione;
    this.tempoTotale = tempoTotale;
    this.textView27 = textView27;
    this.textView28 = textView28;
    this.textView29 = textView29;
    this.textView33 = textView33;
    this.textView34 = textView34;
    this.textView35 = textView35;
    this.textView36 = textView36;
    this.textView41 = textView41;
    this.textView43 = textView43;
    this.vegano = vegano;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVistaRicettaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVistaRicettaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_vista_ricetta, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVistaRicettaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Ingredienti;
      TextView Ingredienti = rootView.findViewById(id);
      if (Ingredienti == null) {
        break missingId;
      }

      id = R.id.Quantità;
      TextView Quantit = rootView.findViewById(id);
      if (Quantit == null) {
        break missingId;
      }

      id = R.id.Unitàdimisura;
      TextView UnitDimisura = rootView.findViewById(id);
      if (UnitDimisura == null) {
        break missingId;
      }

      id = R.id.categoria;
      TextView categoria = rootView.findViewById(id);
      if (categoria == null) {
        break missingId;
      }

      id = R.id.immagine_ricetta_vista;
      TextView immagineRicettaVista = rootView.findViewById(id);
      if (immagineRicettaVista == null) {
        break missingId;
      }

      id = R.id.intolleranze;
      TextView intolleranze = rootView.findViewById(id);
      if (intolleranze == null) {
        break missingId;
      }

      id = R.id.origine;
      TextView origine = rootView.findViewById(id);
      if (origine == null) {
        break missingId;
      }

      id = R.id.photo;
      ImageView photo = rootView.findViewById(id);
      if (photo == null) {
        break missingId;
      }

      id = R.id.procedimento_vista;
      TextView procedimentoVista = rootView.findViewById(id);
      if (procedimentoVista == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = rootView.findViewById(id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.tableLayout2;
      TableLayout tableLayout2 = rootView.findViewById(id);
      if (tableLayout2 == null) {
        break missingId;
      }

      id = R.id.tableLayout3;
      TableLayout tableLayout3 = rootView.findViewById(id);
      if (tableLayout3 == null) {
        break missingId;
      }

      id = R.id.tableLayout4;
      TableLayout tableLayout4 = rootView.findViewById(id);
      if (tableLayout4 == null) {
        break missingId;
      }

      id = R.id.tempo_cottura;
      TextView tempoCottura = rootView.findViewById(id);
      if (tempoCottura == null) {
        break missingId;
      }

      id = R.id.tempo_preparazione;
      TextView tempoPreparazione = rootView.findViewById(id);
      if (tempoPreparazione == null) {
        break missingId;
      }

      id = R.id.tempo_totale;
      TextView tempoTotale = rootView.findViewById(id);
      if (tempoTotale == null) {
        break missingId;
      }

      id = R.id.textView27;
      TextView textView27 = rootView.findViewById(id);
      if (textView27 == null) {
        break missingId;
      }

      id = R.id.textView28;
      TextView textView28 = rootView.findViewById(id);
      if (textView28 == null) {
        break missingId;
      }

      id = R.id.textView29;
      TextView textView29 = rootView.findViewById(id);
      if (textView29 == null) {
        break missingId;
      }

      id = R.id.textView33;
      TextView textView33 = rootView.findViewById(id);
      if (textView33 == null) {
        break missingId;
      }

      id = R.id.textView34;
      TextView textView34 = rootView.findViewById(id);
      if (textView34 == null) {
        break missingId;
      }

      id = R.id.textView35;
      TextView textView35 = rootView.findViewById(id);
      if (textView35 == null) {
        break missingId;
      }

      id = R.id.textView36;
      TextView textView36 = rootView.findViewById(id);
      if (textView36 == null) {
        break missingId;
      }

      id = R.id.textView41;
      TextView textView41 = rootView.findViewById(id);
      if (textView41 == null) {
        break missingId;
      }

      id = R.id.textView43;
      TextView textView43 = rootView.findViewById(id);
      if (textView43 == null) {
        break missingId;
      }

      id = R.id.vegano;
      TextView vegano = rootView.findViewById(id);
      if (vegano == null) {
        break missingId;
      }

      return new ActivityVistaRicettaBinding((ScrollView) rootView, Ingredienti, Quantit,
          UnitDimisura, categoria, immagineRicettaVista, intolleranze, origine, photo,
          procedimentoVista, tableLayout, tableLayout2, tableLayout3, tableLayout4, tempoCottura,
          tempoPreparazione, tempoTotale, textView27, textView28, textView29, textView33,
          textView34, textView35, textView36, textView41, textView43, vegano);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
