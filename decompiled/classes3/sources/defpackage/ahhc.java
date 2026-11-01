package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahhc implements defpackage.ahgv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahhc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ahgv
    public final java.lang.Object a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ahyn ahynVarH = ahyn.h(((ahys) obj).a);
            ahwt ahwtVar = ahwt.a;
            return new defpackage.amdx(new defpackage.agzr(ahynVarH, ahwtVar, ahwtVar, ahwtVar));
        }
        if (((defpackage.ahhe) obj).c.b) {
            return aojh.a;
        }
        throw new java.lang.IllegalStateException("This shouldn't happen. If there was a client-side error, it should've crashed during `flowId` generation. Please report go/tiktok-bug.");
    }
}
