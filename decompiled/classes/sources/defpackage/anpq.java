package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anpq {
    public final int a;
    public final defpackage.anqi b;
    public final defpackage.anrc c;
    public final defpackage.anpu d;
    public final java.util.concurrent.ScheduledExecutorService e;
    public final java.util.concurrent.Executor f;
    private final defpackage.anmd g;
    private final defpackage.anpm h;
    private final defpackage.anpy i;
    private final java.util.IdentityHashMap j;

    public anpq(defpackage.anpo anpoVar) {
        java.lang.Integer num = anpoVar.a;
        if (num == null) {
            throw new java.lang.NullPointerException("defaultPort not set");
        }
        this.a = num.intValue();
        defpackage.anqi anqiVar = anpoVar.b;
        if (anqiVar == null) {
            throw new java.lang.NullPointerException("proxyDetector not set");
        }
        this.b = anqiVar;
        defpackage.anrc anrcVar = anpoVar.c;
        if (anrcVar == null) {
            throw new java.lang.NullPointerException("syncContext not set");
        }
        this.c = anrcVar;
        defpackage.anpu anpuVar = anpoVar.d;
        if (anpuVar == null) {
            throw new java.lang.NullPointerException("serviceConfigParser not set");
        }
        this.d = anpuVar;
        this.e = anpoVar.e;
        this.g = anpoVar.f;
        this.f = anpoVar.g;
        anvt anvtVar = anpoVar.h;
        this.h = anvtVar == null ? new anvt(this, 1) : anvtVar;
        this.i = anpoVar.i;
        java.util.IdentityHashMap identityHashMap = anpoVar.j;
        this.j = identityHashMap != null ? new java.util.IdentityHashMap(identityHashMap) : null;
    }

    public final java.lang.Object a(defpackage.anpp anppVar) {
        java.util.IdentityHashMap identityHashMap = this.j;
        if (identityHashMap != null) {
            return identityHashMap.get(anppVar);
        }
        return null;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.e("defaultPort", this.a);
        ahymVarL.b("proxyDetector", this.b);
        ahymVarL.b("syncContext", this.c);
        ahymVarL.b("serviceConfigParser", this.d);
        ahymVarL.b("customArgs", this.j);
        ahymVarL.b("scheduledExecutorService", this.e);
        ahymVarL.b("channelLogger", this.g);
        ahymVarL.b("executor", this.f);
        ahymVarL.b("overrideAuthority", null);
        ahymVarL.b("metricRecorder", this.h);
        ahymVarL.b("nameResolverRegistry", this.i);
        return ahymVarL.toString();
    }
}
