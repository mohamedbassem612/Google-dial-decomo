package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fag {
    public static final defpackage.fag a;
    public final java.lang.String b;
    private final defpackage.faf c;

    static {
        new defpackage.fag("");
        a = new defpackage.fag("preload");
    }

    public fag(java.lang.String str) {
        this.b = str;
        this.c = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.faf() : null;
    }

    public final synchronized android.media.metrics.LogSessionId a() {
        defpackage.faf fafVar;
        fafVar = this.c;
        ahvr.ci(fafVar);
        return fafVar.a;
    }

    public final synchronized void b(android.media.metrics.LogSessionId logSessionId) {
        defpackage.faf fafVar = this.c;
        ahvr.ci(fafVar);
        ahvr.bY(mp$.ExternalSyntheticApiModelOutline0.m(fafVar.a, mp$.ExternalSyntheticApiModelOutline0.m()));
        fafVar.a = logSessionId;
    }
}
