package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afkk extends android.widget.LinearLayout {
    public boolean[] a;
    public java.lang.String b;
    public defpackage.afkj c;

    public afkk(android.content.Context context) {
        super(context);
        setOrientation(1);
    }

    public final void a(defpackage.amin aminVar, boolean[] zArr) {
        if (zArr == null) {
            amhn amhnVar = aminVar.c;
            if (amhnVar == null) {
                amhnVar = amhn.a;
            }
            this.a = new boolean[amhnVar.b.size()];
        } else {
            this.a = zArr;
        }
        amhn amhnVar2 = aminVar.c;
        if (amhnVar2 == null) {
            amhnVar2 = amhn.a;
        }
        alat alatVar = amhnVar2.b;
        for (int i = 0; i < alatVar.size(); i++) {
            int iW = a.W(((defpackage.amhm) alatVar.get(i)).c);
            if (iW == 0 || iW != 4) {
                boolean z = this.a[i];
                int iW2 = a.W(((defpackage.amhm) alatVar.get(i)).c);
                if (iW2 == 0) {
                    iW2 = 1;
                }
                java.lang.String str = iW2 == 5 ? "NoneOfTheAbove" : null;
                java.lang.String str2 = ((defpackage.amhm) alatVar.get(i)).e;
                android.view.LayoutInflater.from(getContext()).inflate(2131624641, (android.view.ViewGroup) this, true);
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) getChildAt(i);
                android.widget.CheckBox checkBox = (android.widget.CheckBox) frameLayout.findViewById(2131429165);
                checkBox.setText(str2);
                checkBox.setContentDescription(str2);
                checkBox.setChecked(z);
                checkBox.setOnCheckedChangeListener(new defpackage.afki(this, i));
                frameLayout.setOnClickListener(new defpackage.wtm(checkBox, 15));
                if (str != null) {
                    checkBox.setTag(str);
                }
            } else {
                android.view.LayoutInflater.from(getContext()).inflate(2131624642, (android.view.ViewGroup) this, true);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(i);
                android.widget.CheckBox checkBox2 = (android.widget.CheckBox) linearLayout.findViewById(2131429165);
                checkBox2.setContentDescription(getResources().getString(2132020349));
                checkBox2.setChecked(this.a[i]);
                checkBox2.setOnCheckedChangeListener(new defpackage.afki(this, i));
                checkBox2.setTag("OtherPleaseSpecify");
                android.widget.EditText editText = (android.widget.EditText) linearLayout.findViewById(2131429169);
                aehj.A(editText, (android.widget.TextView) linearLayout.findViewById(2131429325));
                android.view.View viewFindViewById = linearLayout.findViewById(2131429170);
                viewFindViewById.setOnTouchListener(new defpackage.afld(checkBox2, viewFindViewById, editText, 1));
                editText.addTextChangedListener(new defpackage.aflo(this, i, checkBox2, 1));
                editText.setOnFocusChangeListener(new defpackage.afln(this, i, checkBox2, editText, 1));
                aehj aehjVar = afjy.c;
                if (defpackage.ankn.a.eZ().a(getContext())) {
                    editText.setFocusable(false);
                    editText.postDelayed(new aetv(editText, 19), 500L);
                }
            }
        }
    }
}
