package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class ahca implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahca(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [erg, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                java.lang.Object objA = ((aexq) this.a).a();
                if (objA instanceof akzc) {
                    return (akzc) objA;
                }
                akzc akzcVarU = akzc.u((byte[]) objA);
                aooh.c(akzcVarU);
                return akzcVarU;
            case 1:
                akzc akzcVarU2 = akzc.u(android.util.Base64.decode((java.lang.String) this.a, 3));
                aooh.e(akzcVarU2, "copyFrom(...)");
                return akzcVarU2;
            case 2:
                ahay ahayVar = (ahay) this.a;
                akzc akzcVar = ahayVar.c == 5 ? (akzc) ahayVar.d : akzc.d;
                aooh.e(akzcVar, "getBytesValue(...)");
                return akzcVar;
            case 3:
                return (ahix) this.a.a();
            case 4:
                return (java.lang.Boolean) this.a.a();
            case 5:
                return (java.lang.Boolean) this.a.a();
            case 6:
                this.a.u();
                return aojh.a;
            case 7:
                return java.lang.Boolean.valueOf(((ajsz) this.a).du());
            case 8:
                return java.lang.Boolean.valueOf(((defpackage.anql) this.a).e());
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                java.lang.Object obj = this.a;
                aooh.f(obj, "array");
                return new defpackage.aokf((float[]) obj);
            default:
                ((apms) this.a).i(false, 2, 0);
                return aojh.a;
        }
    }
}
