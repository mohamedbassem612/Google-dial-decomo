package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amxo implements defpackage.amyp {
    public final defpackage.eoi a;
    public final android.content.Context b;
    private volatile defpackage.amwx c;
    private final java.lang.Object d = new java.lang.Object();

    public amxo(defpackage.mp mpVar) {
        this.a = mpVar;
        this.b = mpVar;
    }

    @Override // defpackage.amyp
    public final /* bridge */ /* synthetic */ java.lang.Object B() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = ((defpackage.amxm) a(this.a, this.b).a(defpackage.amxm.class)).a;
                }
            }
        }
        return this.c;
    }

    public final defpackage.eog a(defpackage.eoi eoiVar, android.content.Context context) {
        return new defpackage.eog(eoiVar, new defpackage.amxk(this, context, 0));
    }
}
