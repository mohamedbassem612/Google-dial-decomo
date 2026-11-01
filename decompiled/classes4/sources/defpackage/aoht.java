package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoht extends defpackage.aohi {
    final defpackage.anql a;
    volatile boolean b;
    private final boolean d;
    private boolean e;
    public final boolean c = true;
    private boolean f = false;
    private boolean g = false;

    public aoht(defpackage.anql anqlVar, boolean z) {
        this.a = anqlVar;
        this.d = z;
    }

    @Override // defpackage.aohy
    public final void e() {
        this.a.a(anqw.b, new anph());
        this.g = true;
    }

    @Override // defpackage.aohy
    public final void f(java.lang.Throwable th) {
        anph anphVar = new anph();
        anph anphVarA = anqw.a(th);
        if (anphVarA != null) {
            anphVar.g(anphVarA);
        }
        this.a.a(anqw.d(th), anphVar);
        this.f = true;
    }

    @Override // defpackage.aohy
    public final void g(java.lang.Object obj) {
        if (this.b && this.d) {
            throw new defpackage.anqz(anqw.c.f("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception"), null);
        }
        ahvr.bZ(!this.f, "Stream was terminated by error, no further calls are allowed");
        ahvr.bZ(!this.g, "Stream is already completed, no further calls are allowed");
        if (!this.e) {
            this.a.d(new anph());
            this.e = true;
        }
        this.a.g(obj);
    }
}
