package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xmg implements java.lang.Runnable {
    private final emy a;
    private final java.lang.ref.WeakReference b;
    private final aonj c;
    private boolean d;

    public xmg(emy emyVar, java.lang.ref.WeakReference weakReference, aonj aonjVar) {
        aooh.f(emyVar, "registry");
        aooh.f(weakReference, "lifecycleOwner");
        this.a = emyVar;
        this.b = weakReference;
        this.c = aonjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            return;
        }
        if (this.b.get() != null) {
            this.c.a(this.a);
        }
        this.d = true;
    }
}
