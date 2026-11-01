package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qwv extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;
    private final amyz f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public qwv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3, amyz amyzVar4, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.qwv.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
        this.f = amyzVar4;
        this.g = amzs.b(amzgVar4);
        this.h = amzs.b(amzgVar5);
        this.i = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(5)).booleanValue();
        if (!zBooleanValue && zBooleanValue3 && ((!zBooleanValue4 || !optional.isPresent() || ((android.os.PersistableBundle) optional.orElseThrow()).getBoolean("vt_upgrade_supported_for_downgraded_rtt_call")) && (!zBooleanValue2 || ((((java.lang.Boolean) this.e.a()).booleanValue() || ((java.lang.Boolean) this.f.a()).booleanValue()) && zBooleanValue5)))) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
