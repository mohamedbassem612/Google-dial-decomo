package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbe {
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference(defpackage.ajbf.a);
    final defpackage.ajbb b;
    public final defpackage.ajck c;

    public ajbe(defpackage.ajck ajckVar, defpackage.ajbb ajbbVar) {
        this.c = ajckVar;
        this.b = ajbbVar;
    }

    final void a(defpackage.ajbb ajbbVar) {
        b(defpackage.ajbf.a, defpackage.ajbf.b);
        ajbbVar.b(this.b, defpackage.ajbm.INSTANCE);
    }

    public final void b(defpackage.ajbf ajbfVar, defpackage.ajbf ajbfVar2) {
        defpackage.ahvr.ce(d(ajbfVar, ajbfVar2), "Expected status to be %s, but it was %s", ajbfVar, ajbfVar2);
    }

    public final void c() {
        defpackage.ajbg.a.a().logp(java.util.logging.Level.FINER, "com.google.common.util.concurrent.ClosingFuture$State", "close", "closing {0}", this);
        this.b.close();
    }

    public final boolean d(defpackage.ajbf ajbfVar, defpackage.ajbf ajbfVar2) {
        return defpackage.anty.Q(this.a, ajbfVar, ajbfVar2);
    }

    final defpackage.ajck e() {
        defpackage.ajbe ajbeVar;
        if (d(defpackage.ajbf.a, defpackage.ajbf.c)) {
            ajbeVar = this;
            defpackage.ajbg.a.a().logp(java.util.logging.Level.FINER, "com.google.common.util.concurrent.ClosingFuture$State", "finishToFuture", "will close {0}", ajbeVar);
            ajbeVar.c.c(new defpackage.ahjn(ajbeVar, 8), defpackage.ajbm.INSTANCE);
        } else {
            ajbeVar = this;
            int iOrdinal = ((defpackage.ajbf) ajbeVar.a.get()).ordinal();
            if (iOrdinal == 0) {
                throw new java.lang.AssertionError();
            }
            if (iOrdinal == 1) {
                throw new java.lang.IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                throw new java.lang.IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (iOrdinal == 5) {
                throw new java.lang.IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return ajbeVar.c;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym("ClosingFuture");
        ahymVar.b("status", this.a.get());
        ahymVar.a(this.c);
        return ahymVar.toString();
    }
}
