package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psz extends amzm {
    private final amzg b;
    private final amzg c;

    public psz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.psz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        oko okoVar = (oko) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        int iF = okoVar.f();
        j$.util.Objects.requireNonNull(mguVar);
        return aiql.z(java.lang.Integer.valueOf(gus.aD(mfy.aE, iF, mguVar).f()));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
