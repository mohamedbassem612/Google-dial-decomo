package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoet implements defpackage.aogm {
    private static final java.util.logging.Logger d = java.util.logging.Logger.getLogger(defpackage.aofk.class.getName());
    public final defpackage.aoes a;
    public final defpackage.aogm b;
    public final defpackage.apjb c = new defpackage.apjb(java.util.logging.Level.FINE, defpackage.aofk.class);

    public aoet(defpackage.aoes aoesVar, defpackage.aogm aogmVar) {
        this.a = aoesVar;
        this.b = aogmVar;
    }

    @Override // defpackage.aogm
    public final void a(aogy aogyVar) {
        throw null;
    }

    @Override // defpackage.aogm
    public final void b() {
        throw null;
    }

    @Override // defpackage.aogm
    public final void c(boolean z, int i, apoy apoyVar, int i2) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (java.io.IOException e) {
            d.logp(e.getClass().equals(java.io.IOException.class) ? java.util.logging.Level.FINE : java.util.logging.Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (java.lang.Throwable) e);
        }
    }

    @Override // defpackage.aogm
    public final void d() {
        try {
            this.b.d();
        } catch (java.io.IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.aogm
    public final void e(boolean z, int i, int i2) {
        long j = ((long) i) << 32;
        long j2 = ((long) i2) & 4294967295L;
        defpackage.apjb apjbVar = this.c;
        if (!z) {
            apjbVar.d(2, j | j2);
        } else if (apjbVar.a()) {
            long j3 = j | j2;
            java.lang.Object obj = apjbVar.b;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) apjbVar.a, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", anty.t(2) + " PING: ack=true bytes=" + j3);
        }
        try {
            defpackage.aogm aogmVar = this.b;
            if (z) {
                ((defpackage.aoeu) aogmVar).b.h++;
            }
            ((defpackage.aoeu) aogmVar).a.e(z, i, i2);
        } catch (java.io.IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.aogm
    public final void f(int i, defpackage.aogl aoglVar) {
        this.c.e(2, i, aoglVar);
        try {
            defpackage.aogm aogmVar = this.b;
            ((defpackage.aoeu) aogmVar).b.h++;
            ((defpackage.aoeu) aogmVar).a.f(i, aoglVar);
        } catch (java.io.IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.aogm
    public final void g(aogy aogyVar) {
        throw null;
    }

    @Override // defpackage.aogm
    public final void h(int i, long j) {
        this.c.g(2, i, j);
        try {
            ((defpackage.aoeu) this.b).a.h(i, j);
        } catch (java.io.IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.aogm
    public final void i(defpackage.aogl aoglVar, byte[] bArr) {
        appb appbVar = appb.a;
        this.c.c(2, 0, aoglVar, aoov.aR(bArr));
        try {
            defpackage.aogm aogmVar = this.b;
            ((defpackage.aoeu) aogmVar).a.i(aoglVar, bArr);
            aogmVar.d();
        } catch (java.io.IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.aogm
    public final void j(boolean z, int i, java.util.List list) {
        throw null;
    }
}
