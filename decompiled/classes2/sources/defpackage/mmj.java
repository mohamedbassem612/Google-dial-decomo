package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mmj implements agyz {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public mmj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ agxk a() {
        int i = this.$cid;
        if (i == 0) {
            return defpackage.mml.a;
        }
        if (i != 1) {
            return i != 2 ? umx.a : new agxj("calling_card_sharing_data_source");
        }
        return ixt.a;
    }

    public final ajcq b() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.mml mmlVar = (defpackage.mml) this.a;
            return aosv.F(mmlVar.b, 0, new defpackage.lve(mmlVar, (aoln) null, 13), 3);
        }
        if (i == 1) {
            ixt ixtVar = (ixt) this.a;
            return aosv.F(ixtVar.d, 0, new defpackage.hqi(ixtVar, (aoln) null, 7), 3);
        }
        java.lang.Object obj = this.a;
        if (i != 2) {
            umx umxVar = (umx) obj;
            return aosv.F(umxVar.c, 0, new uke(umxVar, (aoln) null, 6), 3);
        }
        ryf ryfVar = (ryf) obj;
        return aosv.F(ryfVar.e, 0, new ryc(ryfVar, (aoln) null, 0), 3);
    }
}
