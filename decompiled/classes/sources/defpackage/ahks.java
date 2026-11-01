package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahks implements defpackage.git {
    public boolean a;
    private final defpackage.ahzi b;

    public ahks(android.content.Context context, java.util.concurrent.Callable callable, defpackage.aewz aewzVar) {
        this.b = defpackage.ahvr.bI(new defpackage.aeuw(this, callable, context, aewzVar, 3));
    }

    @Override // defpackage.git
    public final defpackage.gip b() {
        return ((defpackage.git) this.b.eZ()).b();
    }

    @Override // defpackage.git
    public final java.lang.String c() {
        return ((defpackage.git) this.b.eZ()).c();
    }

    @Override // defpackage.git, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((defpackage.git) this.b.eZ()).close();
    }

    @Override // defpackage.git
    public final void d(boolean z) {
        this.a = z;
    }
}
