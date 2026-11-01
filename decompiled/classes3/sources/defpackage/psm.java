package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psm extends amzm {
    private final amyz b;
    private final amzg c;
    private final amzg d;

    public psm(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.psm.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
        this.d = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        return aiql.z(java.lang.Boolean.valueOf(((java.lang.Boolean) this.b.a()).booleanValue() ? ((java.lang.Boolean) new mgf((mgu) list.get(1), ((android.telecom.Call) list.get(0)).getDetails().hasProperty(16384)).a(mfy.T).f()).booleanValue() : false));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.c.d(), this.d.d()});
    }
}
