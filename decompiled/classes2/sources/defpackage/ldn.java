package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ldn {
    public final java.lang.String f;
    public final java.util.concurrent.Executor g;
    public final rwi h;
    public final android.media.AudioManager i;
    public final oju j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final afpl q;
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.List c = new java.util.ArrayList();
    public final java.util.List d = new java.util.ArrayList();
    public final java.util.List e = new java.util.ArrayList();
    public final akzx p = defpackage.lkb.a.m();

    public ldn(java.lang.String str, ajct ajctVar, afpl afplVar, rwi rwiVar, android.media.AudioManager audioManager, oju ojuVar) {
        this.f = str;
        this.g = new ajdc(ajctVar);
        this.q = afplVar;
        this.h = rwiVar;
        this.i = audioManager;
        this.j = ojuVar;
    }

    public final ajcq a(defpackage.ljw ljwVar) {
        return ahvr.E(new defpackage.jnv(this, ljwVar, 16, null), this.g);
    }

    public final ajcq b() {
        return ahvr.E(new defpackage.ldf(this, 6), this.g);
    }
}
