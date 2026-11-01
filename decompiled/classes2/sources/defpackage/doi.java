package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class doi extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    private final den a;

    public doi(den denVar) {
        this.a = denVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) throws aois {
        if (textPaint != null) {
            if (!aooh.n(this.a, csl.a)) {
                throw new aois();
            }
            textPaint.setStyle(android.graphics.Paint.Style.FILL);
        }
    }
}
