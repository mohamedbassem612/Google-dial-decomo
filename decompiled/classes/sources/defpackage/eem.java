package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eem implements defpackage.eco {
    public final java.io.File a;
    public final defpackage.efa b;
    private final java.util.concurrent.atomic.AtomicBoolean c;

    public eem(java.io.File file, defpackage.efa efaVar) {
        if (file == null) {
            defpackage.aooh.i("file");
        }
        this.a = file;
        this.b = efaVar;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // defpackage.eco
    public final void a() {
        this.c.set(true);
    }

    protected final void b() {
        if (this.c.get()) {
            throw new java.lang.IllegalStateException("This scope has already been closed.");
        }
    }
}
