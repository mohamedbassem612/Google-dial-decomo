package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qri extends amzm {
    private final amyz b;
    private final amyz c;
    private final amyz d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public qri(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amyz amyzVar4, amyz amyzVar5, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qri.class), amyzVar);
        this.b = amyzVar3;
        this.c = amyzVar4;
        this.d = amyzVar5;
        this.e = amzs.b(amzgVar);
        this.f = amzs.b(amzgVar2);
        this.g = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final defpackage.zcy zcyVar = (defpackage.zcy) list.get(0);
        final defpackage.qrv qrvVar = (defpackage.qrv) list.get(1);
        mgu mguVar = (mgu) list.get(2);
        final amyz amyzVar = this.b;
        final amyz amyzVar2 = this.c;
        final amyz amyzVar3 = this.d;
        return aiql.z((defpackage.qqn) mguVar.h(new java.util.function.Supplier() { // from class: qqs
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                if ((!((java.lang.Boolean) amyzVar.a()).booleanValue() && !((java.lang.Boolean) amyzVar2.a()).booleanValue()) || !((java.lang.Boolean) amyzVar3.a()).booleanValue()) {
                    return defpackage.qqn.c;
                }
                if (qrvVar.l.get()) {
                    return defpackage.qqn.c;
                }
                defpackage.zcy zcyVar2 = zcyVar;
                defpackage.zcy zcyVar3 = defpackage.zcy.a;
                int iOrdinal = zcyVar2.ordinal();
                if (iOrdinal != 2) {
                    return iOrdinal != 3 ? defpackage.qqn.c : defpackage.qqn.a;
                }
                return defpackage.qqn.b;
            }
        }).b(mfy.cX).c(new defpackage.pvu(9)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        return aiql.w(new ajcq[]{this.e.d(), this.f.d(), amzgVar.d()});
    }
}
