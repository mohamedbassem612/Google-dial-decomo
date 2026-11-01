package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahhp {
    public volatile xsx a;
    private final defpackage.aoin c;
    private final defpackage.ahhq d;
    private final boolean e;
    private final java.lang.Object f = new java.lang.Object();
    public final android.content.ComponentCallbacks2 b = new defpackage.ahhm(this);

    public ahhp(defpackage.aoin aoinVar, defpackage.ahhq ahhqVar, boolean z) {
        this.c = aoinVar;
        this.d = ahhqVar;
        this.e = z;
    }

    public final xsv a(java.lang.Class cls) {
        return b().a(cls);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final xsx b() throws afeb {
        if (this.e) {
            defpackage.afec.c();
        }
        if (this.a == null) {
            synchronized (this.f) {
                if (this.a == null) {
                    this.a = (xsx) this.c.a();
                    this.d.a(this);
                }
            }
        }
        return this.a;
    }

    public final void c(yfa yfaVar) {
        b().h(yfaVar);
    }
}
