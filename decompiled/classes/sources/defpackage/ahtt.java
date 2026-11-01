package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahtt {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/ui/locale/DirectBootMigrationManager");
    public final android.content.Context b;
    public final java.util.concurrent.Executor c;
    private final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();

    public ahtt(android.content.Context context, java.util.concurrent.Executor executor) {
        this.b = context;
        this.c = executor;
    }

    final void a() {
        if (defpackage.ahtx.a.b && this.d.compareAndSet(false, true)) {
            defpackage.abyl.d(this.b, new ahts(this, 2));
        }
    }
}
