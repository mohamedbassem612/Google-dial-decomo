package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibd {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl");
    public final defpackage.hzd b;
    public final ajct c;
    public final ajcu d;
    public final defpackage.iay e;
    public final defpackage.ibs f;
    public final defpackage.hyv g;
    public final defpackage.ibc h = new defpackage.ibc();
    public final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());

    public ibd(defpackage.hzd hzdVar, ajct ajctVar, ajcu ajcuVar, defpackage.iay iayVar, defpackage.ibs ibsVar, defpackage.hyv hyvVar) {
        this.b = hzdVar;
        this.c = ajctVar;
        this.d = ajcuVar;
        this.e = iayVar;
        this.f = ibsVar;
        this.g = hyvVar;
    }

    public final ajcq a(long j) {
        return ahvr.I(this.b.a(), new defpackage.jwi(this, j, 1), this.d);
    }

    public final ajcq b() {
        return ahvr.H(this.g.b(), new defpackage.exn(10), ajbm.a);
    }

    public final ajcq c() {
        return ahvr.H(this.g.b(), new defpackage.exn(8), ajbm.a);
    }
}
