package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gzb {
    public static final java.lang.String a = gsh.b("ConstraintTrkngWrkr");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(ipc ipcVar, gxl gxlVar, aoln aolnVar) {
        defpackage.gza gzaVar;
        if (aolnVar instanceof defpackage.gza) {
            gzaVar = (defpackage.gza) aolnVar;
            int i = gzaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gzaVar.b = i - Integer.MIN_VALUE;
            } else {
                gzaVar = new defpackage.gza(aolnVar);
            }
        } else {
            gzaVar = new defpackage.gza(aolnVar);
        }
        java.lang.Object objAu = gzaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = gzaVar.b;
        if (i2 == 0) {
            aooc.af(objAu);
            edg edgVar = new edg(new gdc(ipcVar.p(gxlVar), new defpackage.amj(gxlVar, (aoln) null, 11), 12), 3);
            gzaVar.b = 1;
            objAu = aoov.au(edgVar, gzaVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        return new java.lang.Integer(((defpackage.gvn) objAu).a);
    }
}
