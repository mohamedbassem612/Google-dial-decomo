package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ffb extends defpackage.few {
    private final java.util.HashMap e = new java.util.HashMap();
    private android.os.Handler f;

    protected ffb() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ffv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ffw, java.lang.Object] */
    @Override // defpackage.few
    protected final void e() {
        for (izg izgVar : this.e.values()) {
            izgVar.c.d(izgVar.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ffv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ffw, java.lang.Object] */
    @Override // defpackage.few
    protected final void g() {
        for (izg izgVar : this.e.values()) {
            izgVar.c.f(izgVar.a);
        }
    }

    @Override // defpackage.few
    protected void i(defpackage.ewm ewmVar) {
        this.f = eum.ah();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fct, fga, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ffw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ffv, java.lang.Object] */
    @Override // defpackage.few
    protected void l() {
        java.util.HashMap map = this.e;
        for (izg izgVar : map.values()) {
            ?? r2 = izgVar.c;
            r2.k(izgVar.a);
            ?? r1 = izgVar.b;
            r2.n(r1);
            r2.m(r1);
        }
        map.clear();
    }

    protected defpackage.ffu t(java.lang.Object obj, defpackage.ffu ffuVar) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ffw, java.lang.Object] */
    @Override // defpackage.ffw
    public void u() {
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((izg) it.next()).c.u();
        }
    }

    protected abstract void v(java.lang.Object obj, defpackage.ffw ffwVar, defpackage.erm ermVar);

    protected final void w(final java.lang.Object obj, defpackage.ffw ffwVar) {
        java.util.HashMap map = this.e;
        ahvr.bM(!map.containsKey(obj));
        defpackage.ffv ffvVar = new defpackage.ffv() { // from class: fez
            @Override // defpackage.ffv
            public final void a(defpackage.ffw ffwVar2, defpackage.erm ermVar) {
                this.a.v(obj, ffwVar2, ermVar);
            }
        };
        defpackage.ffa ffaVar = new defpackage.ffa(this, obj);
        map.put(obj, new izg(ffwVar, ffvVar, ffaVar));
        android.os.Handler handler = this.f;
        ahvr.ci(handler);
        ffwVar.c(handler, ffaVar);
        android.os.Handler handler2 = this.f;
        ahvr.ci(handler2);
        ffwVar.b(handler2, ffaVar);
        defpackage.fag fagVarA = a();
        defpackage.fip fipVar = this.b;
        ahvr.ci(fipVar);
        ffwVar.h(ffvVar, fagVarA, fipVar);
        if (this.a.isEmpty()) {
            ffwVar.d(ffvVar);
        }
    }

    protected void x(java.lang.Object obj) {
    }

    protected void y(java.lang.Object obj) {
    }
}
