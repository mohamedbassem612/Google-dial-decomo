package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gjd implements defpackage.git {
    public final android.content.Context a;
    public final java.lang.String b;
    public final defpackage.giq c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final defpackage.aoir g;

    public gjd(android.content.Context context, java.lang.String str, defpackage.giq giqVar, boolean z, boolean z2) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.a = context;
        this.b = str;
        this.c = giqVar;
        this.d = z;
        this.e = z2;
        this.g = new defpackage.aoiy(new defpackage.ghb(this, 3));
    }

    private final defpackage.gjc a() {
        return (defpackage.gjc) this.g.a();
    }

    @Override // defpackage.git
    public final defpackage.gip b() {
        return a().b();
    }

    @Override // defpackage.git
    public final java.lang.String c() {
        return this.b;
    }

    @Override // defpackage.git, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            a().close();
        }
    }

    @Override // defpackage.git
    public final void d(boolean z) {
        if (this.g.b()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }
}
