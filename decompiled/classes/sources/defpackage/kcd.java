package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kcd implements defpackage.aonp {
    public final /* synthetic */ java.util.List a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ kcd(java.util.List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    @Override // defpackage.aonp
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.nf nfVar = (defpackage.nf) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        defpackage.cav cavVar = (defpackage.cav) obj3;
        int iIntValue2 = ((java.lang.Integer) obj4).intValue();
        if (nfVar == null) {
            defpackage.aooh.i("$this$items");
        }
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= true != cavVar.z(iIntValue) ? 16 : 32;
        }
        if (cavVar.H((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
            defpackage.kcq.b((defpackage.kkh) this.a.get(iIntValue), !this.b, cavVar, 0);
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }
}
