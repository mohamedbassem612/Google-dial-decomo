package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class angq implements defpackage.aeyd {
    private final /* synthetic */ int $cid;

    public /* synthetic */ angq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aeyd
    public final java.lang.Object a(java.lang.Object obj) throws defpackage.alaz {
        if (this.$cid == 0) {
            return (defpackage.adyh) defpackage.alad.y(defpackage.adyh.b, (byte[]) obj);
        }
        byte[] bArr = (byte[]) obj;
        defpackage.alad aladVarE = defpackage.alad.E(defpackage.alfc.a, bArr, 0, bArr.length, defpackage.akzq.a);
        defpackage.alad.V(aladVarE);
        return (defpackage.alfc) aladVarE;
    }
}
