package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pvx extends amzm {
    private final amzg b;
    private final amzg c;

    public pvx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pvx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.pvf pvfVar = (defpackage.pvf) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        j$.util.Optional optionalD = pvfVar.d();
        if (true == optionalD.isPresent()) {
            optionalD = j$.util.Optional.ofNullable(((defpackage.pvc) optionalD.get()).a());
        }
        return aiql.z((j$.util.Optional) new mgr(mguVar, optionalD).a(mfy.cl).g(new defpackage.pir(20)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
