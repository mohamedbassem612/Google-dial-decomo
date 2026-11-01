package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ezd {
    public final defpackage.ezc a;
    public int b;
    public java.lang.Object c;
    public final android.os.Looper d;
    public final long e = -9223372036854775807L;
    private final defpackage.ezb f;
    private boolean g;
    private boolean h;

    public ezd(defpackage.ezb ezbVar, defpackage.ezc ezcVar, android.os.Looper looper) {
        this.f = ezbVar;
        this.a = ezcVar;
        this.d = looper;
    }

    public final synchronized void a(boolean z) {
        this.h |= z;
        notifyAll();
    }

    public final synchronized void b() {
    }

    public final void c() {
        ahvr.bY(!this.g);
        this.g = true;
        defpackage.eyj eyjVar = (defpackage.eyj) this.f;
        if (!eyjVar.n && eyjVar.g.getThread().isAlive()) {
            eyjVar.f.i(14, this).b();
        } else {
            defpackage.etr.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }

    public final void d(java.lang.Object obj) {
        ahvr.bY(!this.g);
        this.c = obj;
    }

    public final void e(int i) {
        ahvr.bY(!this.g);
        this.b = i;
    }
}
