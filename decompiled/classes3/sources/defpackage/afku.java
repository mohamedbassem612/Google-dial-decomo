package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afku implements afkp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afku(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a(java.lang.String str) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.afko) obj).d = str;
            return;
        }
        defpackage.afky afkyVar = (defpackage.afky) obj;
        afkyVar.l = str;
        afjj afjjVarA = afkyVar.a();
        if (afjjVarA != null) {
            defpackage.aprf.w(aehj.b, afjjVarA);
        }
    }
}
