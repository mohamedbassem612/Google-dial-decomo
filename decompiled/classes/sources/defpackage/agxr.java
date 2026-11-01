package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agxr {
    public final java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;

    public agxr() {
        this.b = new java.lang.Object();
        this.a = new java.util.ArrayList();
    }

    private final void g() {
        synchronized (this.a) {
            if (!((defpackage.ajbg) this.b).e().isDone()) {
                throw new java.lang.IllegalStateException();
            }
            java.lang.Object obj = this.b;
            defpackage.apnt apntVar = new defpackage.apnt(this);
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            try {
                defpackage.ajbe ajbeVar = ((defpackage.ajbg) obj).c;
                if (!ajbeVar.d(defpackage.ajbf.a, defpackage.ajbf.f)) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = ajbeVar.a;
                    int iOrdinal = ((defpackage.ajbf) atomicReference.get()).ordinal();
                    if (iOrdinal == 1) {
                        throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
                    }
                    if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                        throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
                    }
                    if (iOrdinal == 5) {
                        throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() twice");
                    }
                    throw new java.lang.AssertionError(atomicReference);
                }
                ajbeVar.c.c(new defpackage.abqu(ajbeVar, apntVar, 17, null), ajbmVar);
                defpackage.aiql.L(defpackage.ajbg.d, obj);
                this.b = null;
            } catch (java.lang.Throwable th) {
                defpackage.aiql.L(defpackage.ajbg.d, obj);
                throw th;
            }
        }
    }

    public final defpackage.agxh a() {
        defpackage.agxh agxhVar;
        synchronized (this.a) {
            if (this.b != null) {
                g();
            }
            try {
                defpackage.ajck ajckVar = ((defpackage.ajbe) ((defpackage.ajyk) this.c).b).c;
                defpackage.ahvr.cc(ajckVar.isDone(), "Future was expected to be done: %s", ajckVar);
                agxhVar = (defpackage.agxh) defpackage.a.h(ajckVar);
            } catch (java.util.concurrent.ExecutionException e) {
                throw new defpackage.agyh(e.getCause());
            }
        }
        return agxhVar;
    }

    public final defpackage.ajcq b() {
        defpackage.ajcq ajcqVarE;
        synchronized (this.a) {
            java.lang.Object obj = this.b;
            ajcqVarE = obj != null ? ((defpackage.ajbg) obj).e() : defpackage.ajcm.a;
        }
        return ajcqVarE;
    }

    public final void c() {
        synchronized (this.a) {
            java.lang.Object obj = this.b;
            if (obj != null) {
                try {
                    defpackage.ajbe ajbeVar = ((defpackage.ajbg) obj).c;
                    defpackage.ajbg.a.a().logp(java.util.logging.Level.FINER, "com.google.common.util.concurrent.ClosingFuture$State", "cancel", "cancelling {0}", ajbeVar);
                    if (ajbeVar.c.cancel(false)) {
                        ajbeVar.c();
                    }
                    defpackage.aiql.L(defpackage.ajbg.d, obj);
                    g();
                } catch (java.lang.Throwable th) {
                    defpackage.aiql.L(defpackage.ajbg.d, obj);
                    throw th;
                }
            }
            ((defpackage.ajbe) ((defpackage.ajyk) this.c).b).c();
        }
    }

    public final int d() {
        return ((defpackage.adw) this.a).e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map$Entry] */
    public final java.util.Map.Entry e() {
        ?? r1 = this.c;
        if (r1 != 0) {
            return r1;
        }
        throw new java.util.NoSuchElementException("Collection is empty.");
    }

    public final boolean f(java.lang.Object obj) {
        if (obj == null) {
            defpackage.aooh.i("key");
        }
        return defpackage.adw.f((defpackage.adw) this.a, obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public agxr(defpackage.ajbg ajbgVar) throws afeb {
        this.a = new java.lang.Object();
        defpackage.afec.c();
        this.b = ajbgVar;
    }

    public agxr(byte[] bArr, byte[] bArr2) {
        long[] jArr = defpackage.adx.a;
        this.a = new defpackage.adw(6);
    }

    public agxr(him himVar) {
        this.a = himVar;
    }

    public agxr(byte[] bArr) {
        this.a = new defpackage.adw(6);
    }
}
