package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class alq implements defpackage.aix {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public alq(aiw aiwVar, float f, float f2, int i) {
        this.$cid = i;
        int iB = aiwVar.b();
        defpackage.ajp[] ajpVarArr = new defpackage.ajp[iB];
        for (int i2 = 0; i2 < iB; i2++) {
            ajpVarArr[i2] = new defpackage.ajp(f, f2, aiwVar.a(i2));
        }
        this.a = ajpVarArr;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajm, java.lang.Object] */
    @Override // defpackage.aix
    public final /* synthetic */ defpackage.ajm a(int i) {
        int i2 = this.$cid;
        ?? r1 = this.a;
        return i2 != 0 ? ((defpackage.ajp[]) r1)[i] : r1;
    }

    public alq(float f, float f2, int i) {
        this.$cid = i;
        this.a = new defpackage.ajp(f, f2, 0.01f);
    }
}
