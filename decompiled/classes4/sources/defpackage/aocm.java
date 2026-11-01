package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aocm implements defpackage.aocy {
    public final defpackage.anmo a;
    private final java.util.concurrent.Executor b;
    private final java.util.concurrent.Executor c;
    private final defpackage.aocx d;
    private defpackage.aocy e;

    public aocm(java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, defpackage.aocx aocxVar, defpackage.anmo anmoVar) {
        this.b = executor;
        this.c = executor2;
        this.d = aocxVar;
        this.a = anmoVar;
    }

    @Override // defpackage.aocy
    public final void a(anqw anqwVar) {
        int i = defpackage.aoik.a;
        if (!anqwVar.h()) {
            java.lang.Throwable annxVar = anqwVar.q;
            if (annxVar == null) {
                anqw anqwVarF = anqw.c.f("RPC cancelled");
                anpc anpcVar = defpackage.annw.a;
                annxVar = new defpackage.annx(anqwVarF);
            }
            this.c.execute(new defpackage.aoch(this.a, annxVar, 0));
        }
        this.b.execute(new defpackage.aoci(this, anqwVar));
    }

    @Override // defpackage.aocy
    public final void b() {
        int i = defpackage.aoik.a;
        this.b.execute(new defpackage.aocj(this));
    }

    public final defpackage.aocy c() {
        defpackage.aocy aocyVar = this.e;
        if (aocyVar != null) {
            return aocyVar;
        }
        throw new java.lang.IllegalStateException("listener unset");
    }

    @Override // defpackage.aodm
    public final void d(defpackage.aodl aodlVar) {
        int i = defpackage.aoik.a;
        this.b.execute(new defpackage.aock(this, aodlVar));
    }

    @Override // defpackage.aodm
    public final void e() {
        int i = defpackage.aoik.a;
        this.b.execute(new defpackage.aocl(this));
    }

    public final void f(java.lang.Throwable th) {
        this.d.e(anqw.d.f("Application error processing RPC").e(th), new anph());
    }

    final void g(defpackage.aocy aocyVar) {
        ahvr.cj(aocyVar, "listener must not be null");
        ahvr.bZ(this.e == null, "Listener already set");
        this.e = aocyVar;
    }
}
