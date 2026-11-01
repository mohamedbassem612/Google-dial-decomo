package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkv {
    private long a;
    private final long b;
    private final java.util.List c;

    public ahkv() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        this.b = 180000L;
        this.c = new java.util.ArrayList();
    }

    public final defpackage.ahkw a() {
        defpackage.ahvr.bZ(this.a != 0, "You must specify a minimum sync interval for all syncs.");
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        for (defpackage.ahky ahkyVar : this.c) {
            aigbVar.i(ahkyVar.a, ahkyVar);
        }
        return new defpackage.ahkw(this.a, this.b, aigbVar.e(true));
    }

    public final void b(defpackage.ahky ahkyVar) {
        this.c.add(ahkyVar);
    }

    public final void c(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.a = java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
