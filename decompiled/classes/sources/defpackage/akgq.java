package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akgq implements defpackage.akgr {
    public final defpackage.akgp a;
    private final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    public akgq(defpackage.akgp akgpVar) {
        this.a = akgpVar;
    }

    @Override // defpackage.akgr
    public final void a(akft akftVar) {
        this.b.put(this.a.a(akftVar), akftVar);
    }

    public final akft b(java.lang.Object obj) {
        if (obj != null) {
            return (akft) this.b.get(obj);
        }
        return null;
    }
}
