package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bmo implements aonn {
    public final /* synthetic */ cmw a;
    public final /* synthetic */ akc b;
    public final /* synthetic */ defpackage.byj c;
    public final /* synthetic */ defpackage.aon d;
    public final /* synthetic */ crd e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ aono h;

    public /* synthetic */ bmo(cmw cmwVar, akc akcVar, defpackage.byj byjVar, defpackage.aon aonVar, crd crdVar, long j, float f, aono aonoVar) {
        this.a = cmwVar;
        this.b = akcVar;
        this.c = byjVar;
        this.d = aonVar;
        this.e = crdVar;
        this.f = j;
        this.g = f;
        this.h = aonoVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        if (cavVar.H(i != 2, iIntValue & 1)) {
            defpackage.byj byjVar = this.c;
            boolean zB = cavVar.B(byjVar);
            java.lang.Object objG = cavVar.g();
            if (zB || objG == cau.a) {
                objG = new defpackage.bll(byjVar, 8);
                cavVar.w(objG);
            }
            aono aonoVar = this.h;
            float f = this.g;
            long j = this.f;
            crd crdVar = this.e;
            defpackage.brj.g(this.a, this.b, (aomy) objG, this.d, crdVar, j, f, aonoVar, cavVar, 0);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
