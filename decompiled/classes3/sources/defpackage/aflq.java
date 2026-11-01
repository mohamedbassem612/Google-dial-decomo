package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aflq extends android.widget.LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final aigf c = aigf.o(0, 2131232056, 1, 2131232052, 2, 2131232050, 3, 2131232048, 4, 2131232054);
    public defpackage.aflp a;

    public aflq(android.content.Context context) {
        super(context);
        setOrientation(1);
    }

    public final void a(defpackage.amjf amjfVar) {
        int iW;
        android.view.View[] viewArr;
        amhn amhnVar = amjfVar.c;
        if (amhnVar == null) {
            amhnVar = amhn.a;
        }
        android.view.View[] viewArr2 = new android.view.View[amhnVar.b.size()];
        amhn amhnVar2 = amjfVar.c;
        if (amhnVar2 == null) {
            amhnVar2 = amhn.a;
        }
        alat alatVar = amhnVar2.b;
        int i = amjfVar.d;
        int iW2 = a.W(i);
        boolean z = ((iW2 != 0 && iW2 == 4) || ((iW = a.W(i)) != 0 && iW == 5)) && alatVar.size() == 5;
        int i2 = 0;
        while (i2 < alatVar.size()) {
            int i3 = i2 + 1;
            int iW3 = a.W(((defpackage.amhm) alatVar.get(i2)).c);
            if (iW3 == 0 || iW3 != 4) {
                android.view.LayoutInflater.from(getContext()).inflate(2131624649, (android.view.ViewGroup) this, true);
                android.view.View childAt = getChildAt(getChildCount() - 1);
                viewArr2[i2] = childAt;
                android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(2131429164);
                textView.setText(((defpackage.amhm) alatVar.get(i2)).e);
                textView.setContentDescription(((defpackage.amhm) alatVar.get(i2)).e);
                android.widget.ImageView imageView = (android.widget.ImageView) viewArr2[i2].findViewById(2131429163);
                if (z) {
                    int iW4 = a.W(amjfVar.d);
                    imageView.setImageDrawable(aehj.F(den.bO(getContext(), ((java.lang.Integer) c.get(java.lang.Integer.valueOf((iW4 == 0 || iW4 != 5) ? i2 : c.d - i3))).intValue()), getContext(), getContext().getColor(2131102937)));
                } else {
                    imageView.setVisibility(8);
                }
                viewArr = viewArr2;
                viewArr2[i2].setOnClickListener(new defpackage.ahpp(this, viewArr, (java.util.List) alatVar, i2, 1));
            } else {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(getContext()).inflate(2131624650, (android.view.ViewGroup) this, true);
                android.widget.EditText editText = (android.widget.EditText) linearLayout.findViewById(2131429169);
                aehj.A(editText, (android.widget.TextView) linearLayout.findViewById(2131429171));
                linearLayout.findViewById(2131429170).setOnClickListener(new defpackage.wtm(editText, 19));
                editText.addTextChangedListener(new defpackage.aflo(this, (java.util.List) alatVar, i2, 0));
                editText.setOnFocusChangeListener(new defpackage.afln(this, editText, (java.util.List) alatVar, i2, 0));
                viewArr2[i2] = editText;
                viewArr = viewArr2;
            }
            viewArr2 = viewArr;
            i2 = i3;
        }
    }
}
