package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class sxz implements defpackage.zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ sxz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [aoin, java.lang.Object] */
    @Override // defpackage.zcs
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return ((defpackage.swq) this.a).a();
            case 1:
                ?? r2 = this.a;
                if (r2 == 0) {
                    defpackage.aooh.i("<this>");
                }
                return ((java.lang.Boolean) r2.a()).booleanValue();
            case 2:
                return ((defpackage.tcq) this.a).a();
            case 3:
                return ((defpackage.tkk) this.a).a();
            case 4:
                return ((defpackage.tkk) this.a).a();
            case 5:
                return ((defpackage.tkk) this.a).a();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.tzc) this.a).a();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                j$.util.Optional optionalG = ((defpackage.zjm) this.a).g();
                defpackage.aooh.e(optionalG, "getFeature(...)");
                if (optionalG == null) {
                    defpackage.aooh.i("<this>");
                }
                defpackage.mnp mnpVar = (defpackage.mnp) optionalG.orElse((java.lang.Object) null);
                return mnpVar == null || !mnpVar.e();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.afsq.ca(this.a);
            case 9:
                return ((defpackage.usg) this.a).a();
            case 10:
                return ((defpackage.uzj) this.a).a();
            case 11:
                return defpackage.afsq.ca(this.a);
            case 12:
                return ((defpackage.vlh) this.a).a();
            case 13:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            case 14:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            case 15:
                return ((defpackage.vlh) this.a).a();
            case 16:
                return ((defpackage.whh) this.a).a();
            case 17:
                return ((defpackage.whh) this.a).a();
            case 18:
                return ((defpackage.wyc) this.a).a();
            case 19:
                return ((defpackage.tvn) this.a).c();
            default:
                return ((defpackage.tvn) this.a).c();
        }
    }
}
