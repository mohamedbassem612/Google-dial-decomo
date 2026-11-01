package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class enz implements emv {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public enz(defpackage.emm emmVar, int i) {
        this.$cid = i;
        aooh.f(emmVar, "generatedAdapter");
        this.a = emmVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [emm, java.lang.Object] */
    public final void a(emx emxVar, emp empVar) {
        if (this.$cid == 0) {
            ?? r2 = this.a;
            r2.a();
            r2.a();
            return;
        }
        new java.util.HashMap();
        int i = 0;
        while (true) {
            defpackage.emm[] emmVarArr = (defpackage.emm[]) this.a;
            if (i >= emmVarArr.length) {
                break;
            }
            emmVarArr[i].a();
            i++;
        }
        for (defpackage.emm emmVar : emmVarArr) {
            emmVar.a();
        }
    }

    public enz(defpackage.emm[] emmVarArr, int i) {
        this.$cid = i;
        this.a = emmVarArr;
    }
}
