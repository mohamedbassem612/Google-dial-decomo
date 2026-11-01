package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghn extends defpackage.aghq {
    private final android.content.Context a;

    public aghn(android.content.Context context) {
        this.a = context;
    }

    @Override // defpackage.aghq, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            textPaint.setFakeBoldText(this.a.getResources().getConfiguration().fontWeightAdjustment == 300);
        }
        textPaint.setUnderlineText(true);
    }
}
