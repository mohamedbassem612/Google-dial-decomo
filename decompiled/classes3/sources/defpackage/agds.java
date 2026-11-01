package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agds extends dye {
    private final com.google.android.material.textfield.TextInputLayout a;

    public agds(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequenceConcat;
        java.lang.CharSequence charSequence2;
        android.widget.TextView textView;
        super.c(view, ebdVar);
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.a;
        android.widget.EditText editText = textInputLayout.c;
        android.text.Editable text = editText != null ? editText.getText() : null;
        java.lang.CharSequence charSequenceF = textInputLayout.f();
        defpackage.agdi agdiVar = textInputLayout.d;
        java.lang.CharSequence charSequence3 = agdiVar.n ? agdiVar.m : null;
        java.lang.CharSequence charSequenceE = textInputLayout.e();
        java.lang.CharSequence charSequence4 = textInputLayout.j ? textInputLayout.i : null;
        int i = textInputLayout.f;
        java.lang.CharSequence contentDescription = (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) ? textView.getContentDescription() : null;
        boolean zIsEmpty = android.text.TextUtils.isEmpty(text);
        boolean z = !zIsEmpty;
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(charSequenceF);
        boolean z2 = textInputLayout.p;
        boolean zIsEmpty3 = android.text.TextUtils.isEmpty(charSequenceE);
        boolean z3 = !zIsEmpty3;
        boolean z4 = (zIsEmpty3 && android.text.TextUtils.isEmpty(contentDescription)) ? false : true;
        java.lang.CharSequence charSequence5 = true == zIsEmpty2 ? null : charSequenceF;
        java.lang.CharSequence charSequenceConcat2 = charSequence3;
        if (android.text.TextUtils.isEmpty(charSequence3)) {
            charSequence = charSequenceE;
        } else {
            charSequence = charSequenceE;
            if (agdiVar.e == 2 && agdiVar.o != null && !android.text.TextUtils.isEmpty(agdiVar.m)) {
                if (!android.text.TextUtils.isEmpty(charSequence5)) {
                    charSequenceConcat2 = android.text.TextUtils.concat(charSequence5, ", ", charSequenceConcat2);
                }
                charSequence5 = charSequenceConcat2;
            }
        }
        defpackage.agdo agdoVar = textInputLayout.a;
        android.widget.TextView textView2 = agdoVar.a;
        if (textView2.getVisibility() == 0) {
            ebdVar.a.setLabelFor(textView2);
            ebdVar.T(textView2);
        } else {
            ebdVar.T(agdoVar.c);
        }
        if (zIsEmpty) {
            if (!android.text.TextUtils.isEmpty(charSequence5)) {
                ebdVar.R(charSequence5);
                if (!z2 && charSequence4 != null) {
                    ebdVar.R(android.text.TextUtils.concat(charSequence5, ", ", charSequence4));
                }
            } else if (charSequence4 != null) {
                ebdVar.R(charSequence4);
            }
        } else if (android.text.TextUtils.isEmpty(charSequence5)) {
            ebdVar.R(text);
        } else {
            if (text == null) {
                if (charSequence5 == null) {
                    charSequence5 = "";
                    charSequence2 = null;
                } else {
                    charSequence2 = charSequence5;
                }
            } else if (charSequence5 == null) {
                charSequence5 = text;
                charSequence2 = null;
            } else {
                android.text.SpanWatcher[] spanWatcherArr = (android.text.SpanWatcher[]) text.getSpans(0, text.length(), android.text.SpanWatcher.class);
                if (spanWatcherArr == null || (spanWatcherArr.length) == 0) {
                    charSequenceConcat = android.text.TextUtils.concat(text, ", ", charSequence5);
                } else {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(text);
                    for (android.text.SpanWatcher spanWatcher : spanWatcherArr) {
                        spannableStringBuilder.removeSpan(spanWatcher);
                    }
                    charSequenceConcat = spannableStringBuilder.append((java.lang.CharSequence) ", ").append(charSequence5);
                }
                java.lang.CharSequence charSequence6 = charSequence5;
                charSequence5 = charSequenceConcat;
                charSequence2 = charSequence6;
            }
            ebdVar.R(charSequence5);
            charSequence5 = charSequence2;
        }
        if (!android.text.TextUtils.isEmpty(charSequence5)) {
            if (true == z) {
                charSequence5 = null;
            }
            ebdVar.D(charSequence5);
            ebdVar.O(zIsEmpty);
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        ebdVar.F(i);
        if (z4) {
            ebdVar.z(true == z3 ? charSequence : contentDescription);
        }
        textInputLayout.b.c().v(ebdVar);
    }

    public final void d(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        int i = com.google.android.material.textfield.TextInputLayout.s;
        this.a.b.c().w(accessibilityEvent);
    }
}
