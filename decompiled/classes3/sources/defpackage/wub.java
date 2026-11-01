package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wub extends android.text.style.ClickableSpan {
    final /* synthetic */ defpackage.wmv a;

    public wub(defpackage.wmv wmvVar) {
        this.a = wmvVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        aooh.f(view, "view");
        ahvr.j(new defpackage.wua(this.a), view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        aooh.f(textPaint, "textPaint");
        textPaint.setUnderlineText(true);
    }
}
