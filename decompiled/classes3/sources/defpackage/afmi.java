package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afmi extends defpackage.afke {
    private android.widget.LinearLayout d;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.d = (android.widget.LinearLayout) layoutInflater.inflate(2131624656, viewGroup, false);
        int i = ((aw) this).m.getInt("DisplayLogoResId", 0);
        defpackage.afjs.c((android.widget.ImageView) this.d.findViewById(2131429175), java.lang.Integer.valueOf(i));
        android.widget.TextView textView = (android.widget.TextView) this.d.findViewById(2131429187);
        android.text.Spanned spannedF = yv.f(this.b.c);
        textView.setText(spannedF);
        textView.setContentDescription(spannedF.toString());
        textView.announceForAccessibility(textView.getContentDescription());
        java.lang.String strF = afjz.f(this.b.e);
        if (!android.text.TextUtils.isEmpty(strF)) {
            android.widget.TextView textView2 = (android.widget.TextView) this.d.findViewById(2131429160);
            aehj aehjVar = afjy.c;
            if (defpackage.ankt.a.eZ().a(A()) && i == 0 && (textView2.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                ((android.view.ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMarginStart(dX().getDimensionPixelOffset(2131167851));
            }
            java.lang.String string = this.b.d;
            if (android.text.TextUtils.isEmpty(string)) {
                string = dX().getString(2132020361);
            }
            textView2.setContentDescription(string);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new defpackage.afmh(this, strF), 0, string.length(), 0);
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            textView2.setText(spannableString);
            if (afjz.k(z())) {
                textView2.setClickable(false);
                textView2.setLongClickable(false);
            }
            textView2.setOnTouchListener(new defpackage.afmg(0));
            textView2.setVisibility(0);
        }
        return this.d;
    }

    @Override // defpackage.afke
    public final amig c() {
        return null;
    }

    @Override // defpackage.afke
    public final void f() {
        if (this.d != null) {
            int i = 0;
            while (i < this.d.getChildCount()) {
                android.view.View childAt = this.d.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(((long) i) * 80);
            }
        }
    }

    @Override // defpackage.afke
    public final void p() {
        b().aY();
        b().q(true, this);
        if (!android.text.TextUtils.isEmpty(afjz.f(this.b.e)) || b() == null) {
            return;
        }
        aehj aehjVar = afjy.c;
        if (afjy.b(defpackage.ankk.a.eZ().a(afjy.b))) {
            b().f();
        }
        b().c();
    }

    @Override // defpackage.afke
    public final void q(java.lang.String str) {
    }
}
