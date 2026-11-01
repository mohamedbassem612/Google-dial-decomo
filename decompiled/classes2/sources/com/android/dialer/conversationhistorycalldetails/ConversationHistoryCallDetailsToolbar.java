package com.android.dialer.conversationhistorycalldetails;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ConversationHistoryCallDetailsToolbar extends android.support.v7.widget.Toolbar {
    private final android.content.Context B;
    private final android.widget.TextView C;
    private final android.widget.TextView D;
    private final android.widget.QuickContactBadge E;
    private final androidx.constraintlayout.widget.ConstraintLayout F;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationHistoryCallDetailsToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = context;
        lym lymVarBA = mni.bA(context);
        android.view.View viewInflate = inflate(context, 2131624115, this);
        this.C = (android.widget.TextView) viewInflate.findViewById(2131427819);
        this.D = (android.widget.TextView) viewInflate.findViewById(2131428669);
        android.widget.QuickContactBadge quickContactBadge = (android.widget.QuickContactBadge) viewInflate.findViewById(2131428750);
        this.E = quickContactBadge;
        this.F = viewInflate.findViewById(2131427715);
        lymVarBA.bt().E(quickContactBadge, 32);
        setElevation(getResources().getDimensionPixelSize(2131167880));
        android.graphics.drawable.Drawable drawable = context.getDrawable(2131231925);
        drawable.setTint(urg.c(context, 2130968958));
        t(drawable);
        q(2132020590);
        u(new defpackage.lde(context, 14));
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getResources().getDimensionPixelSize(2131167881), getPaddingBottom());
    }

    public final void E(defpackage.lyn lynVar) {
        android.content.Context context = this.B;
        lym lymVarBA = mni.bA(context);
        ops opsVarIB = lymVarBA.iB();
        abwd abwdVar = lynVar.c;
        if (abwdVar == null) {
            abwdVar = abwd.a;
        }
        android.widget.QuickContactBadge quickContactBadge = this.E;
        opsVarIB.h(quickContactBadge, abwdVar, false);
        java.lang.CharSequence charSequenceAq = pez.aq(context, lynVar.d);
        android.widget.TextView textView = this.C;
        textView.setText(charSequenceAq);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < charSequenceAq.length(); i++) {
            char cCharAt = charSequenceAq.charAt(i);
            if (android.telephony.PhoneNumberUtils.isNonSeparator(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        java.lang.String string = sb.toString();
        if (!string.isEmpty() && string.charAt(0) == '*') {
            android.text.Spannable spannableNewSpannable = android.text.Spannable.Factory.getInstance().newSpannable(charSequenceAq);
            for (android.text.style.TtsSpan ttsSpan : (android.text.style.TtsSpan[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), android.text.style.TtsSpan.class)) {
                spannableNewSpannable.removeSpan(ttsSpan);
            }
            spannableNewSpannable.setSpan(new android.text.style.TtsSpan.VerbatimBuilder(charSequenceAq.toString()).build(), 0, spannableNewSpannable.length(), 33);
            textView.setContentDescription(spannableNewSpannable);
        }
        boolean zIsEmpty = lynVar.e.isEmpty();
        android.widget.TextView textView2 = this.D;
        if (!zIsEmpty) {
            textView2.setVisibility(0);
            textView2.setText(pez.aq(context, lynVar.e));
            if (lynVar.f) {
                textView2.setTextColor(lymVarBA.ip() ? urg.c(context, 2130968953) : urg.c(context, 2130968948));
                return;
            } else {
                textView2.setTextColor(urg.c(context, android.R.attr.textColorSecondary));
                return;
            }
        }
        textView2.setVisibility(8);
        textView2.setText((java.lang.CharSequence) null);
        defpackage.due dueVar = new defpackage.due();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.F;
        dueVar.c(constraintLayout);
        dueVar.e(textView.getId(), 3, quickContactBadge.getId(), 3);
        dueVar.e(textView.getId(), 4, quickContactBadge.getId(), 4);
        dueVar.b(constraintLayout);
    }
}
