package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iab implements defpackage.hzn, defpackage.hzq {
    private final android.content.Context a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();

    public iab(android.content.Context context) {
        this.a = context;
    }

    private final void c(java.lang.String str, boolean z) {
        ((android.media.AudioManager) this.a.getSystemService(android.media.AudioManager.class)).setParameters(java.lang.String.format(java.util.Locale.US, "direction=%s;device_mute=%s;", str, true != z ? "false" : "true"));
    }

    @Override // defpackage.hzn
    public final ajcq a(boolean z) {
        c("rx", z);
        this.b.set(z);
        return aiql.z((java.lang.Object) null);
    }

    @Override // defpackage.hzn
    public final boolean b() {
        return this.b.get();
    }

    @Override // defpackage.hzq
    public final ajcq e(boolean z) {
        c("tx", z);
        this.c.set(z);
        return aiql.z((java.lang.Object) null);
    }

    @Override // defpackage.hzq
    public final boolean f() {
        return this.c.get();
    }
}
