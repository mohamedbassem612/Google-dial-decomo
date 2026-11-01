package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sec extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;
    private final amzg e;

    public sec(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.sec.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
        this.e = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final smx smxVar = (smx) list.get(0);
        defpackage.aeok aeokVar = (defpackage.aeok) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        aooh.f(smxVar, "patrickPhaseTwoEnabledFn");
        aooh.f(aeokVar, "callingCardSharingState");
        aooh.f(aossVar, "lightweightScope");
        final amyz amyzVar = this.d;
        return aiql.z(new defpackage.uyg(new defpackage.zka() { // from class: sdz
            @Override // defpackage.zka
            public final boolean a() {
                return smxVar.a() && ((java.lang.Boolean) amyzVar.a()).booleanValue();
            }
        }, (ajas) new qat(aossVar, aeokVar, 8)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
