package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amxp implements defpackage.amyp {
    private volatile java.lang.Object a;
    private final java.lang.Object b = new java.lang.Object();
    private final defpackage.apnt c;

    public amxp(defpackage.apnt apntVar) {
        this.c = apntVar;
    }

    @Override // defpackage.amyp
    public final java.lang.Object B() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    defpackage.apnt apntVar = this.c;
                    defpackage.amyz amyzVar = defpackage.hka.a;
                    this.a = new him(new defpackage.adae(apntVar.a));
                }
            }
        }
        return this.a;
    }
}
