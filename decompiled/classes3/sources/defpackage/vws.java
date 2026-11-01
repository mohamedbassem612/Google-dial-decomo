package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vws {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/tab/impl/ui/SimSelectorViewPeer");
    public j$.util.Optional b = j$.util.Optional.empty();
    public final aify c;
    private final defpackage.vww d;

    public vws(defpackage.vww vwwVar, rlv rlvVar, ajwr ajwrVar) {
        this.d = vwwVar;
        defpackage.vww.inflate(vwwVar.getContext(), 2131624451, vwwVar);
        com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = (com.google.android.material.button.MaterialButtonToggleGroup) vwwVar.findViewById(2131429291);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < materialButtonToggleGroup.getChildCount(); i++) {
            arrayList.add((com.google.android.material.button.MaterialButton) materialButtonToggleGroup.getChildAt(i));
        }
        this.c = aify.n(arrayList);
        materialButtonToggleGroup.e.add(new defpackage.ajxi(this, rlvVar, ajwrVar));
    }

    private final void c(int i) {
        this.d.findViewById(2131428955).setVisibility(i);
    }

    final void a(defpackage.vwq vwqVar) {
        this.b = j$.util.Optional.of(vwqVar);
        alat alatVar = vwqVar.d;
        int size = alatVar.size();
        if (size < 2) {
            c(8);
            return;
        }
        c(0);
        defpackage.vtt vttVar = vwqVar.c;
        if (vttVar == null) {
            vttVar = defpackage.vtt.a;
        }
        int i = 0;
        while (true) {
            aify aifyVar = this.c;
            if (i >= aifyVar.size()) {
                break;
            }
            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) aifyVar.get(i);
            materialButton.setVisibility(i < size ? 0 : 8);
            if (i < size) {
                defpackage.vtu vtuVar = (defpackage.vtu) alatVar.get(i);
                defpackage.vtu vtuVar2 = (defpackage.vtu) alatVar.get(i);
                android.graphics.drawable.Drawable drawable = null;
                if ((vtuVar.b & 2) != 0 && vtuVar.d) {
                    drawable = this.d.getContext().getDrawable(2131232237);
                }
                materialButton.m(drawable);
                defpackage.vtt vttVar2 = vtuVar.c;
                if (vttVar2 == null) {
                    vttVar2 = defpackage.vtt.a;
                }
                materialButton.setText(vttVar2.e);
                defpackage.vtt vttVar3 = vtuVar2.c;
                if (vttVar3 == null) {
                    vttVar3 = defpackage.vtt.a;
                }
                b(materialButton, vttVar.equals(vttVar3));
            }
            i++;
        }
        com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = (com.google.android.material.button.MaterialButtonToggleGroup) this.d.findViewById(2131429291);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) materialButtonToggleGroup.getLayoutParams();
        layoutParams.weight = size > 2 ? 20.0f : 4.0f;
        materialButtonToggleGroup.setLayoutParams(layoutParams);
    }

    public final void b(com.google.android.material.button.MaterialButton materialButton, boolean z) {
        materialButton.setSelected(z);
        android.content.Context applicationContext = this.d.getContext().getApplicationContext();
        materialButton.setClickable(!z);
        android.content.res.ColorStateList colorStateListValueOf = z ? android.content.res.ColorStateList.valueOf(urg.c(applicationContext, 2130969101)) : android.content.res.ColorStateList.valueOf(urg.c(applicationContext, 2130969102));
        if (materialButton.w()) {
            defpackage.afrl afrlVar = materialButton.b;
            if (afrlVar.l != colorStateListValueOf) {
                afrlVar.l = colorStateListValueOf;
                afrlVar.g();
            }
        }
        materialButton.setTextColor(z ? urg.c(applicationContext, 2130969103) : urg.c(applicationContext, 2130969104));
        materialButton.setBackgroundColor(z ? urg.c(applicationContext, 2130969100) : applicationContext.getColor(android.R.color.transparent));
    }
}
