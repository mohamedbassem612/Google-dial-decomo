package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofl extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public ofl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.ofl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        oev oevVar = (oev) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        defpackage.lyo lyoVar = (defpackage.lyo) list.get(2);
        aoss aossVar = (aoss) list.get(3);
        aooh.f(oevVar, "enableFn");
        aooh.f(optional, "optionalDialerPhoneNumber");
        aooh.f(lyoVar, "simpleSmsDecodeResultCache");
        aooh.f(aossVar, "lightweightScope");
        if (!oevVar.a()) {
            return aiql.z(j$.util.Optional.empty());
        }
        defpackage.hkd hkdVar = (defpackage.hkd) aooh.q(optional);
        return hkdVar == null ? aiql.z(j$.util.Optional.empty()) : aosv.C(aoov.am(aossVar, 0, new defpackage.nrw(lyoVar, hkdVar, (aoln) null, 17), 3));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
