package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqn implements java.lang.AutoCloseable {
    public boolean c;
    private final defpackage.heq g;
    public final java.util.concurrent.locks.ReentrantLock a = new java.util.concurrent.locks.ReentrantLock();
    public final java.util.Map b = new java.util.LinkedHashMap();
    public final java.util.Set d = new java.util.LinkedHashSet();
    public final java.util.Set e = new java.util.LinkedHashSet();
    private final defpackage.gqm f = new defpackage.gqm(this);

    public gqn(defpackage.heq heqVar) {
        this.g = heqVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.gqm gqmVar = this.f;
        aooh.f(gqmVar, "listener");
        ((android.hardware.input.InputManager) this.g.a).unregisterInputDeviceListener(gqmVar);
    }
}
