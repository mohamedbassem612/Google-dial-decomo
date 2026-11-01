package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abit implements aono {
    public final /* synthetic */ long a;

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.abis abisVar = (defpackage.abis) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f(abisVar, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != cavVar.B(abisVar) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            aehj.be(abisVar, this.a, cavVar, iIntValue & 14);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
