package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pqd implements aono {
    public final /* synthetic */ cer a;
    public final /* synthetic */ long b;
    public final /* synthetic */ cer c;

    public /* synthetic */ pqd(cer cerVar, long j, cer cerVar2) {
        this.a = cerVar;
        this.b = j;
        this.c = cerVar2;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f((afe) obj, "$this$AnimatedVisibility");
        int i = iIntValue & 17;
        if (cavVar.H(i != 16, iIntValue & 1)) {
            defpackage.pne pneVar = (defpackage.pne) this.a.a();
            if (pneVar == null) {
                cavVar.u(1571176655);
                cavVar.o();
            } else {
                cer cerVar = this.c;
                long j = this.b;
                cavVar.u(1571176656);
                cmt cmtVar = cmw.c;
                boolean zA = cavVar.A(j) | cavVar.B(cerVar);
                java.lang.Object objG = cavVar.g();
                if (zA || objG == cau.a) {
                    objG = new defpackage.aev(j, cerVar, 8);
                    cavVar.w(objG);
                }
                pez.D(pneVar, cfd.J(cmtVar, (aonj) objG), cavVar, 0);
                cavVar.o();
            }
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
