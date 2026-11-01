package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeun {
    public static final defpackage.aeun a = new defpackage.aeun();
    public int b;
    private final defpackage.aeqz c;

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public aeun(long j, long j2) {
        defpackage.ahvr.bU(((j2 > j ? 1 : (j2 == j ? 0 : -1)) ^ (-1)) >>> 31, "End time %s is before start time %s.", j2, j);
        this.c = new defpackage.aeqz(new defpackage.aera(j, j), new defpackage.aera(j2, j2));
        this.b = 0;
    }

    public static boolean d(defpackage.aeun aeunVar) {
        return aeunVar == null || aeunVar == a;
    }

    final long a() {
        defpackage.aeqz aeqzVar = this.c;
        return aeqzVar.b.a - aeqzVar.a.a;
    }

    final long b() {
        defpackage.aeqz aeqzVar = this.c;
        return aeqzVar.b.b - aeqzVar.a.b;
    }

    public final void c() {
        this.c.b = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), j$.time.Duration.ofMillis(android.os.SystemClock.uptimeMillis()).toMillis());
    }

    public aeun() {
        this.c = new defpackage.aeqz();
    }
}
