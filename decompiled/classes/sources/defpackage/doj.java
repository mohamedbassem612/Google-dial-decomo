package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class doj extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final defpackage.crb a;
    public final defpackage.ccp b = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cpp(9205357640488583168L), defpackage.cdu.c);
    private final float c;
    private final defpackage.cer d;

    public doj(defpackage.crb crbVar, float f) {
        this.a = crbVar;
        this.c = f;
        bup bupVar = new bup(this, 18);
        defpackage.ajxw ajxwVar = defpackage.ceo.a;
        this.d = new defpackage.cbk(bupVar, null);
    }

    public final long a() {
        return ((defpackage.cpp) this.b.a()).a;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        dnv.d(textPaint, this.c);
        textPaint.setShader((android.graphics.Shader) this.d.a());
    }
}
