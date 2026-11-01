package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afki implements android.widget.CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ defpackage.afkk a;
    private final int b;

    public afki(defpackage.afkk afkkVar, int i) {
        j$.util.Objects.requireNonNull(afkkVar);
        this.a = afkkVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        android.widget.CheckBox checkBox;
        if (j$.util.Objects.equals(compoundButton.getTag(), "NoneOfTheAbove")) {
            defpackage.afkk afkkVar = this.a;
            afkkVar.a[this.b] = z;
            if (z) {
                if (afkkVar.getChildCount() != afkkVar.a.length + 1) {
                    android.util.Log.e("SurveyMultipleSelectView", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i = 0; i < afkkVar.getChildCount(); i++) {
                    android.widget.CheckBox checkBox2 = (android.widget.CheckBox) afkkVar.getChildAt(i).findViewById(2131429165);
                    if (!j$.util.Objects.equals(checkBox2.getTag(), "NoneOfTheAbove")) {
                        checkBox2.setChecked(false);
                    }
                }
            }
        } else {
            boolean zEquals = j$.util.Objects.equals(compoundButton.getTag(), "OtherPleaseSpecify");
            defpackage.afkk afkkVar2 = this.a;
            if (zEquals) {
                afkkVar2.a[this.b] = z;
                if (z) {
                    android.widget.CheckBox checkBox3 = (android.widget.CheckBox) afkkVar2.findViewWithTag("NoneOfTheAbove");
                    if (checkBox3 != null) {
                        checkBox3.setChecked(false);
                    }
                    for (int i2 = 0; i2 < afkkVar2.getChildCount(); i2++) {
                        android.widget.EditText editText = (android.widget.EditText) afkkVar2.getChildAt(i2).findViewById(2131429169);
                        if (editText != null) {
                            editText.requestFocus();
                            break;
                        }
                    }
                }
            } else {
                afkkVar2.a[this.b] = z;
                if (z && (checkBox = (android.widget.CheckBox) afkkVar2.findViewWithTag("NoneOfTheAbove")) != null) {
                    checkBox.setChecked(false);
                }
            }
        }
        defpackage.afkk afkkVar3 = this.a;
        afkkVar3.c.a(new defpackage.afpl(afkkVar3.b, afkkVar3.a, (byte[]) null));
    }
}
