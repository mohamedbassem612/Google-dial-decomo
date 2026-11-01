package com.android.dialer.searchfragment.enhancedsearch.menu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DialerExpandedSheetView extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    public boolean a;
    public int b;
    private final defpackage.tjh[] c;
    private final java.lang.Runnable[] d;
    private final ahbv e;

    public DialerExpandedSheetView(android.content.Context context) {
        super(context);
        this.c = new defpackage.tjh[4];
        this.d = new java.lang.Runnable[4];
        this.e = j();
        h(context);
    }

    private final void h(android.content.Context context) {
        setOrientation(1);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        for (int i = 0; i < 4; i++) {
            android.view.View viewInflate = layoutInflaterFrom.inflate(2131624013, (android.view.ViewGroup) this, false);
            addView(viewInflate);
            viewInflate.setTag(2131427631, java.lang.Integer.valueOf(i));
            viewInflate.setOnClickListener(this);
        }
        g(2);
    }

    private final void i(int i, boolean z) {
        getChildAt(i).setEnabled(z);
    }

    private final ahbv j() {
        return ((tjk) agab.aH(getContext(), tjk.class)).oM();
    }

    public final void a() {
        for (int i = 0; i < 4; i++) {
            java.lang.Runnable runnable = this.d[i];
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void b(int i, defpackage.tjj tjjVar) {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) getChildAt(i);
        int i2 = tjjVar.a;
        int iIntValue = ((java.lang.Integer) tjjVar.b.orElse(java.lang.Integer.valueOf(i2))).intValue();
        materialButton.n(tjjVar.c);
        materialButton.setText(i2);
        materialButton.setContentDescription(getContext().getString(iIntValue));
    }

    public final void c(defpackage.tjh tjhVar, java.lang.Runnable runnable) {
        this.c[0] = tjhVar;
        i(0, tjhVar != null);
        this.d[0] = runnable;
    }

    public final void d(defpackage.tjh tjhVar, java.lang.Runnable runnable) {
        this.c[3] = tjhVar;
        i(3, tjhVar != null);
        this.d[3] = runnable;
    }

    public final void e(defpackage.tjh tjhVar, java.lang.Runnable runnable) {
        this.c[1] = tjhVar;
        i(1, tjhVar != null);
        this.d[1] = runnable;
    }

    public final void f(defpackage.tjh tjhVar, java.lang.Runnable runnable) {
        this.c[2] = tjhVar;
        i(2, tjhVar != null);
        this.d[2] = runnable;
    }

    public final void g(int i) {
        int i2;
        this.b = i;
        int i3 = i - 1;
        if (i3 != 0) {
            i2 = i3 != 1 ? 4 : 3;
        } else {
            i2 = 2;
        }
        int i4 = 0;
        while (i4 < i2) {
            this.e.C((com.google.android.material.button.MaterialButton) getChildAt(i4), new inx(i4 == 0, i4 == i2 + (-1)));
            i4++;
        }
        getChildAt(2).setVisibility(i == 1 ? 8 : 0);
        getChildAt(3).setVisibility(i != 3 ? 8 : 0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.tjh tjhVar = this.c[((java.lang.Integer) view.getTag(2131427631)).intValue()];
        if (tjhVar != null) {
            tjhVar.a();
        }
    }

    public DialerExpandedSheetView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new defpackage.tjh[4];
        this.d = new java.lang.Runnable[4];
        this.e = j();
        h(context);
    }

    public DialerExpandedSheetView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new defpackage.tjh[4];
        this.d = new java.lang.Runnable[4];
        this.e = j();
        h(context);
    }

    public DialerExpandedSheetView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new defpackage.tjh[4];
        this.d = new java.lang.Runnable[4];
        this.e = j();
        h(context);
    }
}
