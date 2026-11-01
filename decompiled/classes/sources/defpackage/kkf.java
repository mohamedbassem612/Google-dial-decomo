package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kkf implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public kkf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aomy
    public final /* synthetic */ java.lang.Object a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i == 0) {
            return new defpackage.kkh[((defpackage.aoxh[]) obj).length];
        }
        java.util.List list = ((defpackage.cbw) obj).a;
        defpackage.adw adwVar = new defpackage.adw(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.cfj cfjVar = (defpackage.cfj) list.get(i2);
            java.lang.Object obj2 = cfjVar.b;
            defpackage.cey.b(adwVar, obj2 != null ? new ccc(java.lang.Integer.valueOf(cfjVar.a), obj2) : java.lang.Integer.valueOf(cfjVar.a), cfjVar);
        }
        return new defpackage.cey(adwVar);
    }
}
