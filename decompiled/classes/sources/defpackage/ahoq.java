package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahoq implements java.lang.Runnable, defpackage.ahpm {
    private defpackage.ahpj a;
    private defpackage.ahpj b;
    private final boolean c = defpackage.afec.h(java.lang.Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public ahoq(defpackage.ahpj ahpjVar, boolean z) {
        this.f = false;
        this.a = ahpjVar;
        this.b = ahpjVar;
        this.f = z;
    }

    private final void b() {
        this.d = true;
        this.a.p(this.c && !this.e && defpackage.afec.h(java.lang.Thread.currentThread()));
        this.a = null;
    }

    public final void a(defpackage.ajcq ajcqVar) {
        if (this.d) {
            throw new java.lang.IllegalStateException("Span was already closed. Did you attach it to a future after closing the SpanEndSignal (e.g. outside the try-with-resources block)?");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        this.a.t();
        ajcqVar.c(this, defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        defpackage.ahpj ahpjVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new java.lang.IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (ahpjVar != null) {
                ahpjVar.close();
            }
            if (this.f) {
                defpackage.ahns.d((defpackage.ahpe) defpackage.ahns.d.get(), defpackage.ahoo.a);
            }
        } catch (java.lang.Throwable th) {
            if (ahpjVar != null) {
                try {
                    ahpjVar.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.d && this.e) {
            b();
        } else {
            defpackage.afec.a().post(new ahlo(2));
        }
    }
}
