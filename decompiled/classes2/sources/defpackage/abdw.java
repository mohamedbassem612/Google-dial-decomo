package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abdw implements cye {
    final /* synthetic */ java.util.List a;
    final /* synthetic */ ccp b;
    final /* synthetic */ int c;

    public abdw(java.util.List list, ccp ccpVar, int i) {
        this.a = list;
        this.b = ccpVar;
        this.c = i;
    }

    public final /* synthetic */ int a(cxf cxfVar, java.util.List list, int i) {
        return vn.f(this, cxfVar, list, i);
    }

    public final /* synthetic */ int b(cxf cxfVar, java.util.List list, int i) {
        return vn.g(this, cxfVar, list, i);
    }

    public final /* synthetic */ int c(cxf cxfVar, java.util.List list, int i) {
        return vn.h(this, cxfVar, list, i);
    }

    public final /* synthetic */ int d(cxf cxfVar, java.util.List list, int i) {
        return vn.i(this, cxfVar, list, i);
    }

    public final cyf e(cyi cyiVar, java.util.List list, long j) {
        java.lang.Object next;
        int i;
        aooh.f(cyiVar, "$this$Layout");
        java.util.List listCc = ajsz.cc(this.a, list);
        java.util.Iterator it = listCc.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            i = this.c;
            next = it.next();
        } while (((cyd) ((aoiu) next).b).c(dpd.b(j)) > i);
        aoiu aoiuVar = (aoiu) next;
        if (aoiuVar == null) {
            aoiuVar = (aoiu) ajsz.bI(listCc);
        }
        this.b.b(aoiuVar.a);
        czc czcVarV = ((cyd) aoiuVar.b).v(j);
        return den.z(cyiVar, czcVarV.a, czcVarV.b, new xms(czcVarV, 19));
    }
}
