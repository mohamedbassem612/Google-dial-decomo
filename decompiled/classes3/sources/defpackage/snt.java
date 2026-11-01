package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class snt implements ahlb {
    public static final j$.time.Duration a;
    public static final aimz b;
    public final defpackage.zey c;
    public final defpackage.zgz d;
    public final defpackage.zlr e;
    private final aoss f;
    private final ahda g;

    static {
        j$.time.Duration durationOfDays = j$.time.Duration.ofDays(7L);
        aooh.e(durationOfDays, "ofDays(...)");
        a = durationOfDays;
        b = aimz.i("com/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/LocalNetworkIdentityHasRcsSynclet");
    }

    public snt(aoss aossVar, defpackage.zlr zlrVar, defpackage.zey zeyVar, defpackage.zgz zgzVar, aazc aazcVar) {
        aooh.f(aossVar, "backgroundScope");
        aooh.f(zeyVar, "dialerHasRcsDao");
        aooh.f(aazcVar, "clock");
        this.f = aossVar;
        this.e = zlrVar;
        this.c = zeyVar;
        this.d = zgzVar;
        this.g = new ahda((byte[]) null);
    }

    public final ajcq a() {
        return aosv.C(ahvr.ag(this.f, this.g, new defpackage.ryc(this, (aoln) null, 3)));
    }
}
