package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aekl {
    public android.content.Context a;
    public defpackage.aelt b;
    public defpackage.aejo c;
    private aeiv d;
    private java.util.concurrent.ExecutorService e;
    private defpackage.aele f;
    private defpackage.acov g;
    private final ahyn h = ahwt.a;
    private defpackage.aljb i;
    private defpackage.wsk j;

    public final defpackage.aekm a() {
        aeiv aeivVar;
        java.util.concurrent.ExecutorService executorService;
        defpackage.wsk wskVar;
        defpackage.aele aeleVar;
        defpackage.acov acovVar;
        defpackage.aelt aeltVar;
        defpackage.aejo aejoVar;
        if (!c().f()) {
            d(java.util.concurrent.Executors.newCachedThreadPool(aehj.l()));
        }
        c().b();
        aeiv aeivVar2 = new aeiv(b().a);
        this.d = aeivVar2;
        this.i = new defpackage.aljb(aeivVar2, b().a);
        defpackage.wsk wskVar2 = b().c;
        if (wskVar2 == null) {
            b();
            throw null;
        }
        this.j = wskVar2;
        defpackage.aele aeleVar2 = this.f;
        if (!(aeleVar2 == null ? ahwt.a : ahyn.h(aeleVar2)).f()) {
            this.f = new defpackage.aeld(b().a, this.a);
        }
        defpackage.acov acovVar2 = this.g;
        if (acovVar2 == null) {
            throw new java.lang.IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if (!(acovVar2 instanceof defpackage.acou)) {
            this.b = new defpackage.aelv(b().a, aeivVar2, acovVar2);
        }
        defpackage.aljb aljbVar = this.i;
        if (aljbVar != null && (aeivVar = this.d) != null && (executorService = this.e) != null && (wskVar = this.j) != null && (aeleVar = this.f) != null && (acovVar = this.g) != null && (aeltVar = this.b) != null && (aejoVar = this.c) != null) {
            return new defpackage.aekm(aljbVar, aeivVar, executorService, wskVar, aeleVar, acovVar, aeltVar, aejoVar, this.h);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.i == null) {
            sb.append(" limitedAvailableAccountsModel");
        }
        if (this.d == null) {
            sb.append(" internalAccountsModel");
        }
        if (this.e == null) {
            sb.append(" backgroundExecutor");
        }
        if (this.j == null) {
            sb.append(" avatarImageLoader");
        }
        if (this.f == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (this.g == null) {
            sb.append(" vePrimitives");
        }
        if (this.b == null) {
            sb.append(" visualElements");
        }
        if (this.c == null) {
            sb.append(" accountLayer");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final defpackage.aejo b() {
        defpackage.aejo aejoVar = this.c;
        if (aejoVar != null) {
            return aejoVar;
        }
        throw new java.lang.IllegalStateException("Property \"accountLayer\" has not been set");
    }

    public final ahyn c() {
        java.util.concurrent.ExecutorService executorService = this.e;
        return executorService == null ? ahwt.a : ahyn.h(executorService);
    }

    public final void d(java.util.concurrent.ExecutorService executorService) {
        if (executorService == null) {
            throw new java.lang.NullPointerException("Null backgroundExecutor");
        }
        this.e = executorService;
    }

    public final void e(defpackage.acov acovVar) {
        if (acovVar == null) {
            throw new java.lang.NullPointerException("Null vePrimitives");
        }
        this.g = acovVar;
    }
}
