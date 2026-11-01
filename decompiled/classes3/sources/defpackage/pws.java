package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pws extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;
    private final amzg f;

    public pws(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.pws.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
        this.f = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        int iIntValue = ((java.lang.Integer) list.get(2)).intValue();
        mgu mguVar = (mgu) list.get(3);
        if (zBooleanValue && zBooleanValue2 && iIntValue >= ((java.lang.Long) this.e.a()).longValue()) {
            z = true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.cs).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
