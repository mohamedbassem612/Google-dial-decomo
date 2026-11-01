package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abkz implements aono {
    public final /* synthetic */ defpackage.abld a;
    public final /* synthetic */ defpackage.ablc b;
    public final /* synthetic */ int c;

    public /* synthetic */ abkz(defpackage.abld abldVar, defpackage.ablc ablcVar, int i) {
        this.a = abldVar;
        this.b = ablcVar;
        this.c = i;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f((axx) obj, "$this$FlowRow");
        int i = iIntValue & 17;
        if (cavVar.H(i != 16, iIntValue & 1)) {
            int i2 = this.c;
            defpackage.ablc ablcVar = this.b;
            defpackage.abld abldVar = this.a;
            cavVar.u(1947244513);
            aehj.Z(abldVar, cavVar, 0);
            cavVar.o();
            cavVar.u(1947330290);
            den.aR(azm.k(cmw.c, 8.0f), cavVar);
            cavVar.o();
            cavVar.u(1947391484);
            aehj.ae(ablcVar, i2, cavVar, 0);
            cavVar.o();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
