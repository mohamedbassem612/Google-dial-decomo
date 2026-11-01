package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aetx {
    public final aoin a;
    public final aett b;
    public final android.os.Handler c;
    public final aequ d;
    public int e = 0;
    public long f = -1;
    public volatile long g = -1;
    volatile boolean h = false;
    final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference(ajcm.a);
    public final defpackage.aeok j;
    private final ajcu k;

    public aetx(ajcu ajcuVar, defpackage.aeok aeokVar, aoin aoinVar, aett aettVar, aequ aequVar, android.os.Handler handler) {
        this.k = ajcuVar;
        this.j = aeokVar;
        this.a = aoinVar;
        this.b = aettVar;
        this.c = handler;
        this.d = aequVar;
    }

    public final void a(java.lang.Runnable runnable, int i) {
        if (this.h) {
            ajdd ajddVar = new ajdd();
            this.i.set(ajddVar);
            if (this.h) {
                ajddVar.q(this.k.b(runnable, i, java.util.concurrent.TimeUnit.MILLISECONDS));
            }
        }
    }

    final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.i.set(aiql.C(new aetv(this, 7), this.k));
    }
}
