package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class upc implements aono {
    public final /* synthetic */ defpackage.abki a;
    public final /* synthetic */ defpackage.uow b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ccp d;
    public final /* synthetic */ aonj e;

    public /* synthetic */ upc(defpackage.abki abkiVar, defpackage.uow uowVar, int i, ccp ccpVar, aonj aonjVar) {
        this.a = abkiVar;
        this.b = uowVar;
        this.c = i;
        this.d = ccpVar;
        this.e = aonjVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f((afe) obj, "$this$AnimatedAvatarContainer");
        int i = iIntValue & 17;
        if (cavVar.H(i != 16, iIntValue & 1)) {
            defpackage.uow uowVar = this.b;
            aehj.ao(new abkp(this.a, (java.lang.String) null), azm.g(cmw.c, 56.0f), (crd) null, cavVar, 48, 4);
            java.lang.Integer num = ((defpackage.uov) uowVar).e;
            if (num != null) {
                cavVar.u(-561334755);
                ttj.x(num.intValue(), (cmw) null, cavVar, 0);
                cavVar.o();
            } else {
                cavVar.u(-561258836);
                cavVar.o();
            }
            ccp ccpVar = this.d;
            java.lang.Integer numM = ttj.m(ccpVar);
            if (numM != null) {
                z = numM.intValue() == this.c;
            }
            boolean zB = cavVar.B(ccpVar);
            java.lang.Object objG = cavVar.g();
            if (zB || objG == cau.a) {
                objG = new sky(ccpVar, 20);
                cavVar.w(objG);
            }
            aaoo.Q(z, (aomy) objG, (cmw) null, 0L, (aon) null, (drs) null, (crd) null, den.ak(cavVar).G, 0.0f, cfo.j(331637627, new jai(this.e, uowVar, ccpVar, 8), cavVar), cavVar, 0, 48, 1916);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
