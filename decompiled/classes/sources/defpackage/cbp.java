package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbp {
    public static final defpackage.cdh a = new defpackage.cdh();

    public static final defpackage.aoss a(defpackage.aolr aolrVar, defpackage.cav cavVar) {
        return new defpackage.cdy(cavVar.h(), aolrVar);
    }

    public static final void b(java.lang.Object obj, java.lang.Object obj2, defpackage.aonj aonjVar, defpackage.cav cavVar) {
        boolean zB = cavVar.B(obj) | cavVar.B(obj2);
        java.lang.Object objG = cavVar.g();
        if (zB || objG == defpackage.cau.a) {
            objG = new defpackage.cbl(aonjVar);
            cavVar.w(objG);
        }
    }

    public static final void c(java.lang.Object obj, defpackage.aonj aonjVar, defpackage.cav cavVar) {
        boolean zB = cavVar.B(obj);
        java.lang.Object objG = cavVar.g();
        if (zB || objG == defpackage.cau.a) {
            objG = new defpackage.cbl(aonjVar);
            cavVar.w(objG);
        }
    }

    public static final void d(java.lang.Object[] objArr, defpackage.aonj aonjVar, defpackage.cav cavVar) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        boolean z = cavVar.z(objArrCopyOf.length);
        for (java.lang.Object obj : objArrCopyOf) {
            z |= cavVar.B(obj);
        }
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (z || objR == defpackage.cau.a) {
            cbtVar.ab(new defpackage.cbl(aonjVar));
        }
    }

    public static final void e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, defpackage.aonn aonnVar, defpackage.cav cavVar) {
        boolean zB = cavVar.B(obj) | cavVar.B(obj2) | cavVar.B(obj3);
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (zB || objR == defpackage.cau.a) {
            objR = new defpackage.ccf(cbtVar.v, aonnVar);
            cbtVar.ab(objR);
        }
    }

    public static final void f(java.lang.Object obj, java.lang.Object obj2, defpackage.aonn aonnVar, defpackage.cav cavVar) {
        defpackage.aolr aolrVarH = cavVar.h();
        boolean zB = cavVar.B(obj) | cavVar.B(obj2);
        java.lang.Object objG = cavVar.g();
        if (zB || objG == defpackage.cau.a) {
            objG = new defpackage.ccf(aolrVarH, aonnVar);
            cavVar.w(objG);
        }
    }

    public static final void g(java.lang.Object obj, defpackage.aonn aonnVar, defpackage.cav cavVar) {
        defpackage.aolr aolrVarH = cavVar.h();
        boolean zB = cavVar.B(obj);
        java.lang.Object objG = cavVar.g();
        if (zB || objG == defpackage.cau.a) {
            objG = new defpackage.ccf(aolrVarH, aonnVar);
            cavVar.w(objG);
        }
    }

    public static final void h(java.lang.Object[] objArr, defpackage.aonn aonnVar, defpackage.cav cavVar) {
        int length = objArr.length;
        defpackage.aolr aolrVarH = cavVar.h();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        boolean z = cavVar.z(objArrCopyOf.length);
        for (java.lang.Object obj : objArrCopyOf) {
            z |= cavVar.B(obj);
        }
        java.lang.Object objG = cavVar.g();
        if (z || objG == defpackage.cau.a) {
            cavVar.w(new defpackage.ccf(aolrVarH, aonnVar));
        }
    }
}
