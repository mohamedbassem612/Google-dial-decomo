package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class bdz implements defpackage.czq {
    private final defpackage.ado a;
    private final defpackage.aogc b;

    public bdz(defpackage.aogc aogcVar) {
        this.b = aogcVar;
        defpackage.ado adoVar = defpackage.adp.a;
        this.a = new defpackage.ado(6);
    }

    @Override // defpackage.czq
    public final void a(defpackage.czp czpVar) {
        defpackage.ado adoVar = this.a;
        adoVar.f();
        defpackage.ads adsVar = czpVar.a;
        java.lang.Object[] objArr = adsVar.b;
        long[] jArr = adsVar.c;
        int i = adsVar.e;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            java.lang.Object obj = objArr[i];
            java.lang.Object objBB = this.b.bB(obj);
            int iC = adoVar.c(objBB, 0);
            int i2 = (int) (j & 2147483647L);
            if (iC == 7) {
                czpVar.remove(obj);
            } else {
                adoVar.h(objBB, iC + 1);
            }
            i = i2;
        }
    }

    @Override // defpackage.czq
    public final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aogc aogcVar = this.b;
        return defpackage.aooh.n(aogcVar.bB(obj), aogcVar.bB(obj2));
    }
}
