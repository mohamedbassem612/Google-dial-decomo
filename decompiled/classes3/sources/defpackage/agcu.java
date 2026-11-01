package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcu extends agad {
    public final android.graphics.RectF w;

    public agcu(defpackage.agcu agcuVar) {
        super(agcuVar);
        this.w = agcuVar.w;
    }

    public final android.graphics.drawable.Drawable newDrawable() {
        int i = defpackage.agcw.b;
        agaf agcvVar = new defpackage.agcv(this);
        agcvVar.invalidateSelf();
        return agcvVar;
    }

    public agcu(agal agalVar, android.graphics.RectF rectF) {
        super(agalVar);
        this.w = rectF;
    }
}
