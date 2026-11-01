package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgh implements defpackage.aonp {
    final /* synthetic */ java.util.List a;

    public kgh(java.util.List list) {
        this.a = list;
    }

    @Override // defpackage.aonp
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i;
        defpackage.nf nfVar = (defpackage.nf) obj;
        int iIntValue = ((java.lang.Number) obj2).intValue();
        defpackage.cav cavVar = (defpackage.cav) obj3;
        int iIntValue2 = ((java.lang.Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != cavVar.B(nfVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != cavVar.z(iIntValue) ? 16 : 32;
        }
        if (cavVar.H((i & 147) != 146, i & 1)) {
            defpackage.kgm kgmVar = (defpackage.kgm) this.a.get(iIntValue);
            cavVar.u(21292808);
            defpackage.kcq.s(kgmVar, null, cavVar, 0);
            cavVar.o();
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }
}
