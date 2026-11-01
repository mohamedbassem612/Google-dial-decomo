package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlb extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qlb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aihd aihdVar = (aihd) list.get(0);
        aihd aihdVar2 = (aihd) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        aooh.f(aihdVar, "safePhoneActionButtons");
        aooh.f(aihdVar2, "safeAndroidAutoActionButtons");
        java.util.Set setCW = ajsz.cW(new defpackage.qid[]{defpackage.qid.UNHOLD, defpackage.qid.MUTE, defpackage.qid.UNMUTE});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : aihdVar) {
            if (setCW.contains(((defpackage.qib) obj2).a)) {
                arrayList.add(obj2);
            }
        }
        return aiql.z(zBooleanValue ? ahvr.bv(ajsz.bT(arrayList, ajsz.bX(aihdVar2, new defpackage.qxq(1)))) : ahvr.bv(arrayList));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
