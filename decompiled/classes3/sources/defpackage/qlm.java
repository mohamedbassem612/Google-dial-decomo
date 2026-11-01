package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlm extends amzm {
    private final amzg b;

    public qlm(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlm.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        aooh.f(aihdVar, "statusBarNotificationInhibitors");
        if (!(aihdVar instanceof java.util.Collection) || !aihdVar.isEmpty()) {
            java.util.Iterator it = aihdVar.iterator();
            while (it.hasNext()) {
                ((defpackage.qje) it.next()).a();
            }
        }
        return aiql.z(java.lang.Boolean.FALSE);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
