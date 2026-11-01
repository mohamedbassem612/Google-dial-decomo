package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dqb implements cye {
    final /* synthetic */ defpackage.dqc a;
    final /* synthetic */ dbk b;

    public dqb(defpackage.dqc dqcVar, dbk dbkVar) {
        this.a = dqcVar;
        this.b = dbkVar;
    }

    private final int f(int i) {
        defpackage.dqc dqcVar = this.a;
        dqcVar.measure(defpackage.dqc.m(0, i, dqcVar.getLayoutParams().width), 0);
        return dqcVar.getMeasuredHeight();
    }

    private final int g(int i) {
        defpackage.dqc dqcVar = this.a;
        dqcVar.measure(0, defpackage.dqc.m(0, i, dqcVar.getLayoutParams().height));
        return dqcVar.getMeasuredWidth();
    }

    public final int a(cxf cxfVar, java.util.List list, int i) {
        return f(i);
    }

    public final int b(cxf cxfVar, java.util.List list, int i) {
        return g(i);
    }

    public final int c(cxf cxfVar, java.util.List list, int i) {
        return f(i);
    }

    public final int d(cxf cxfVar, java.util.List list, int i) {
        return g(i);
    }

    public final cyf e(cyi cyiVar, java.util.List list, long j) {
        defpackage.dqc dqcVar = this.a;
        if (dqcVar.getChildCount() == 0) {
            return den.z(cyiVar, dpd.d(j), dpd.c(j), new defpackage.dkq(7));
        }
        if (dpd.d(j) != 0) {
            dqcVar.getChildAt(0).setMinimumWidth(dpd.d(j));
        }
        if (dpd.c(j) != 0) {
            dqcVar.getChildAt(0).setMinimumHeight(dpd.c(j));
        }
        dqcVar.measure(defpackage.dqc.m(dpd.d(j), dpd.b(j), dqcVar.getLayoutParams().width), defpackage.dqc.m(dpd.c(j), dpd.a(j), dqcVar.getLayoutParams().height));
        return den.z(cyiVar, dqcVar.getMeasuredWidth(), dqcVar.getMeasuredHeight(), new dpz(dqcVar, this.b, 4));
    }
}
