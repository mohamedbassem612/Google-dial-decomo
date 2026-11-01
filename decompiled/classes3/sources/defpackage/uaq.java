package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uaq {
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/service/SonicPromoGridController");
    public final mba b;
    public final aoin e;
    public final ajct f;
    public final agsm g;
    public final defpackage.uae h;
    public final zpz j;
    public final defpackage.rap k;
    public final defpackage.qbe l;
    private final defpackage.ubl n;
    public final defpackage.zni c = new leq(this, 9);
    public final defpackage.qtx d = new nyy(this, 18);
    public final ahda m = new ahda();
    public defpackage.qzp i = defpackage.qzp.c;

    public uaq(aoin aoinVar, ajct ajctVar, zpz zpzVar, defpackage.qbe qbeVar, mba mbaVar, defpackage.rap rapVar, defpackage.ubl ublVar, agsm agsmVar, defpackage.uae uaeVar) {
        this.e = aoinVar;
        this.f = ajctVar;
        this.j = zpzVar;
        this.l = qbeVar;
        this.b = mbaVar;
        this.k = rapVar;
        this.n = ublVar;
        this.g = agsmVar;
        this.h = uaeVar;
    }

    public final void a() {
        jwe jweVar = new jwe(j$.time.Instant.now().toEpochMilli(), 7);
        defpackage.ubl ublVar = this.n;
        ajcq ajcqVarBl = ublVar.c.bl(jweVar);
        ublVar.b.s(ajcqVarBl, defpackage.ubl.a);
        this.g.g(ahvr.H(ajcqVarBl, new defpackage.tcy(this, 13), this.f), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final void b() {
        this.g.g(this.m.g(new defpackage.tvg(this, 9), this.f), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final void c() {
        this.g.g(this.m.g(new defpackage.tvg(this, 8), this.f), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
