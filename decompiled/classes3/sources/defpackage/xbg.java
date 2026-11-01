package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbg implements defpackage.xbt {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public xbg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xbt
    public final void a(defpackage.wvg wvgVar) {
        if (this.$cid == 0) {
            defpackage.wvf wvfVar = wvgVar.c == 1 ? (defpackage.wvf) wvgVar.d : defpackage.wvf.a;
            java.lang.Object obj = this.a;
            agsm.i(1154, aiql.D(ahqx.i(new defpackage.wzc(obj, wvfVar.c, 4)), ((defpackage.xbf) obj).c), "failed to log audio data", new java.lang.Object[0]);
        } else {
            java.lang.Object obj2 = this.a;
            ajas ajasVarB = ahqx.b(new defpackage.wwg(obj2, wvgVar, 4));
            defpackage.xbc xbcVar = (defpackage.xbc) obj2;
            agsm.i(1150, xbcVar.e.e(ajasVarB, xbcVar.a), "failed to submit audio data", new java.lang.Object[0]);
        }
    }
}
