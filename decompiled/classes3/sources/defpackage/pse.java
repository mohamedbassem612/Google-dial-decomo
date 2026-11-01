package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pse extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pse(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pse.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        android.telecom.Call call = (android.telecom.Call) list.get(0);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(1);
        mgu mguVar = (mgu) list.get(2);
        if (zpoVar == defpackage.zpo.f && call.getDetails().hasProperty(16)) {
            z = true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.W).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
