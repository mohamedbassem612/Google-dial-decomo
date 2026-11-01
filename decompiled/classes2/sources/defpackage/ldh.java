package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ldh extends kh {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/history/CallScreenSessionAdapter");
    public abwd e;
    public defpackage.lkq f;
    public defpackage.lgo g;
    public int h;
    private final android.content.Context i;

    public ldh(android.content.Context context) {
        this.i = context;
    }

    static boolean w(defpackage.lgo lgoVar) {
        int iAN = a.aN(lgoVar.g);
        return iAN != 0 && iAN == 2;
    }

    public final int a() {
        defpackage.lkq lkqVar = this.f;
        if (lkqVar == null) {
            return 0;
        }
        return lkqVar.b.b.size();
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        return new defpackage.ldj(android.view.LayoutInflater.from(this.i).inflate(2131624069, viewGroup, false));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:67:0x0170  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x0043  */
    public final /* synthetic */ void m(ld ldVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        android.view.View view;
        boolean z5;
        int i2;
        int dimensionPixelSize;
        android.widget.ImageView imageView;
        boolean zW;
        int i3;
        int i4;
        boolean z6;
        int i5;
        defpackage.lgo lgoVar;
        defpackage.ldj ldjVar = (defpackage.ldj) ldVar;
        defpackage.lgo lgoVar2 = (defpackage.lgo) this.f.b.b.get(i);
        android.widget.TextView textView = ldjVar.x;
        textView.setVisibility(8);
        android.widget.TextView textView2 = ldjVar.s;
        textView2.setText("");
        android.widget.TextView textView3 = ldjVar.w;
        textView3.setVisibility(8);
        if (i > 0) {
            if (w(lgoVar2) == w((defpackage.lgo) this.f.b.b.get(i - 1))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i6 = i + 1;
        boolean z7 = i6 < a() && w(lgoVar2) == w((defpackage.lgo) this.f.b.b.get(i6));
        abwd abwdVar = this.e;
        if (z) {
            if (z7) {
                z2 = true;
                z3 = true;
            } else {
                z2 = false;
            }
            if (!z || z2) {
                z4 = false;
            } else {
                z4 = true;
            }
            textView2.setText(lgoVar2.e);
            view = ldjVar.v;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
            z5 = z;
            if (true != w(lgoVar2)) {
                i2 = 8388613;
            } else {
                i2 = 8388611;
            }
            layoutParams.gravity = i2;
            if (z5) {
                dimensionPixelSize = ldjVar.t.getDimensionPixelSize(2131165440);
            } else {
                dimensionPixelSize = ldjVar.t.getDimensionPixelSize(2131165439);
            }
            layoutParams.topMargin = dimensionPixelSize;
            view.setLayoutParams(layoutParams);
            imageView = ldjVar.u;
            if (w(lgoVar2)) {
                imageView.setVisibility(8);
            } else if (z5) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                ((ldi) agab.aH(view.getContext(), ldi.class)).iB().f(imageView, abwdVar, false);
            }
            if (w(lgoVar2)) {
                textView2.setTextColor(ldjVar.y);
                textView2.setBackgroundTintList(ldjVar.A);
            } else {
                textView2.setTextColor(ldjVar.z);
                textView2.setBackgroundTintList(ldjVar.B);
            }
            if (z4) {
                textView2.setBackgroundResource(2131231845);
            } else if (z3) {
                if (w(lgoVar2)) {
                    textView2.setBackgroundResource(2131232074);
                } else {
                    textView2.setBackgroundResource(2131231791);
                }
            } else if (z5) {
                if (w(lgoVar2)) {
                    textView2.setBackgroundResource(2131232071);
                } else {
                    textView2.setBackgroundResource(2131231788);
                }
            } else if (w(lgoVar2)) {
                textView2.setBackgroundResource(2131232079);
            } else {
                textView2.setBackgroundResource(2131231796);
            }
            if (z7) {
                textView3.setVisibility(8);
                z6 = true;
            } else {
                long j = lgoVar2.c;
                zW = w(lgoVar2);
                i3 = this.h;
                textView3.setVisibility(0);
                android.content.Context context = textView3.getContext();
                if (i != i3) {
                    i4 = 1;
                } else {
                    i4 = 17;
                }
                textView3.setText(android.text.format.DateUtils.formatDateTime(context, j, i4));
                z6 = true;
                if (true != zW) {
                    i5 = 8388613;
                } else {
                    i5 = 8388611;
                }
                textView3.setGravity(i5);
            }
            lgoVar = this.g;
            if (lgoVar != null || lgoVar.e.isEmpty()) {
                textView.setVisibility(8);
            }
            if (i6 == a()) {
                a.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionAdapter", "onBindViewHolder", 76, "CallScreenSessionAdapter.java").v("show termination message");
                defpackage.lgo lgoVar3 = this.g;
                int iAN = a.aN(lgoVar3.g);
                ahvr.bM((iAN == 0 || iAN != 4) ? false : z6);
                textView.setText(lgoVar3.e);
                textView.setVisibility(0);
                return;
            }
            return;
        }
        z2 = z7;
        z3 = false;
        if (z) {
            z4 = false;
        } else {
            z4 = false;
        }
        textView2.setText(lgoVar2.e);
        view = ldjVar.v;
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
        z5 = z;
        if (true != w(lgoVar2)) {
            i2 = 8388613;
        } else {
            i2 = 8388611;
        }
        layoutParams2.gravity = i2;
        if (z5) {
            dimensionPixelSize = ldjVar.t.getDimensionPixelSize(2131165440);
        } else {
            dimensionPixelSize = ldjVar.t.getDimensionPixelSize(2131165439);
        }
        layoutParams2.topMargin = dimensionPixelSize;
        view.setLayoutParams(layoutParams2);
        imageView = ldjVar.u;
        if (w(lgoVar2)) {
            imageView.setVisibility(8);
        } else if (z5) {
            imageView.setVisibility(0);
            ((ldi) agab.aH(view.getContext(), ldi.class)).iB().f(imageView, abwdVar, false);
        } else {
            imageView.setVisibility(4);
        }
        if (w(lgoVar2)) {
            textView2.setTextColor(ldjVar.y);
            textView2.setBackgroundTintList(ldjVar.A);
        } else {
            textView2.setTextColor(ldjVar.z);
            textView2.setBackgroundTintList(ldjVar.B);
        }
        if (z4) {
            textView2.setBackgroundResource(2131231845);
        } else if (z3) {
            if (w(lgoVar2)) {
                textView2.setBackgroundResource(2131232074);
            } else {
                textView2.setBackgroundResource(2131231791);
            }
        } else if (z5) {
            if (w(lgoVar2)) {
                textView2.setBackgroundResource(2131232079);
            } else {
                textView2.setBackgroundResource(2131231796);
            }
        } else if (w(lgoVar2)) {
            textView2.setBackgroundResource(2131232071);
        } else {
            textView2.setBackgroundResource(2131231788);
        }
        if (z7) {
            textView3.setVisibility(8);
            z6 = true;
        } else {
            long j2 = lgoVar2.c;
            zW = w(lgoVar2);
            i3 = this.h;
            textView3.setVisibility(0);
            android.content.Context context2 = textView3.getContext();
            if (i != i3) {
                i4 = 1;
            } else {
                i4 = 17;
            }
            textView3.setText(android.text.format.DateUtils.formatDateTime(context2, j2, i4));
            z6 = true;
            if (true != zW) {
                i5 = 8388613;
            } else {
                i5 = 8388611;
            }
            textView3.setGravity(i5);
        }
        lgoVar = this.g;
        if (lgoVar != null) {
        }
        textView.setVisibility(8);
    }
}
