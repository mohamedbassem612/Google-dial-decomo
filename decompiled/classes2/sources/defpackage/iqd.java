package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iqd implements ahlb {
    public final ecx b;
    public final rlv c;
    public final aoin d;
    public final defpackage.ipz e;
    private final aoss g;
    public static final defpackage.hgu f = new defpackage.hgu();
    public static final aimz a = aimz.i("com/android/dialer/backup/impl/UnboundedRestoreSynclet");

    public iqd(aoss aossVar, ecx ecxVar, rlv rlvVar, aoin aoinVar, defpackage.ipz ipzVar) {
        aooh.f(aossVar, "backgroundScope");
        aooh.f(ecxVar, "dataStore");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "unboundedRestoreRetryLimit");
        this.g = aossVar;
        this.b = ecxVar;
        this.c = rlvVar;
        this.d = aoinVar;
        this.e = ipzVar;
    }

    public final ajcq a() {
        return aosv.F(this.g, 0, new defpackage.iqc(this, null), 3);
    }
}
