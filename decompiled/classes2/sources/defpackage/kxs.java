package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kxs implements znl {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public kxs(defpackage.ibs ibsVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ibsVar);
        this.a = ibsVar;
    }

    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.kxx) this.a).c();
            return ajcm.a;
        }
        if (i == 1) {
            ((defpackage.ibs) this.a).b();
            return ajcm.a;
        }
        if (i == 2) {
            pzj pzjVar = (pzj) this.a;
            return aosv.F(pzjVar.a, 0, new oxe(pzjVar, (aoln) null, 6, (byte[]) null), 3);
        }
        aimw aimwVarL = wky.a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuController", "onCallDeactivated", 264, "XatuController.java");
        wky wkyVar = (wky) this.a;
        aimwVarL.y("[%s] deactivated", wkyVar.m);
        return wkyVar.d(new wkx(wre.d, j$.util.Optional.empty()));
    }

    public /* synthetic */ kxs(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
