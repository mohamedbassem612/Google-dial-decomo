package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gtv {
    public static final java.lang.String a = defpackage.gsh.b("Schedulers");

    public static void a(defpackage.grk grkVar, androidx.work.impl.WorkDatabase workDatabase, java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.gxm gxmVarD = workDatabase.D();
        new java.util.ArrayList();
        workDatabase.n();
        try {
            java.util.List listD = gxmVarD.d();
            defpackage.gus gusVar = grkVar.p;
            c(gxmVarD, listD);
            java.util.List listU = gxmVarD.u();
            int i = grkVar.m;
            java.util.List listB = gxmVarD.B();
            c(gxmVarD, listB);
            if (listD != null) {
                listB.addAll(listD);
            }
            int i2 = grkVar.j;
            workDatabase.q();
            workDatabase.o();
            b(listB, list, true);
            b(listU, list, false);
        } catch (java.lang.Throwable th) {
            workDatabase.o();
            throw th;
        }
    }

    private static void b(java.util.List list, java.util.List list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        defpackage.gxl[] gxlVarArr = (defpackage.gxl[]) list.toArray(new defpackage.gxl[list.size()]);
        java.util.ListIterator listIterator = ((defpackage.aokv) list2).listIterator(0);
        while (listIterator.hasNext()) {
            defpackage.gtt gttVar = (defpackage.gtt) listIterator.next();
            if (gttVar.d() == z) {
                gttVar.c(gxlVarArr);
            }
        }
    }

    private static void c(defpackage.gxm gxmVar, java.util.List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                gxmVar.w(((defpackage.gxl) it.next()).b, jCurrentTimeMillis);
            }
        }
    }
}
