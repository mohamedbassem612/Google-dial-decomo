package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ump extends android.text.style.ClickableSpan {
    final /* synthetic */ android.view.View.OnClickListener a;

    public ump(defpackage.akwb akwbVar, android.view.View.OnClickListener onClickListener) {
        this.a = onClickListener;
        j$.util.Objects.requireNonNull(akwbVar);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        this.a.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
    }
}
