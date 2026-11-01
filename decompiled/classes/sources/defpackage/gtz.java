package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gtz extends defpackage.aomh implements defpackage.aonp {
    int a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ long c;

    public gtz(defpackage.aoln aolnVar) {
        super(4, aolnVar);
    }

    @Override // defpackage.aonp
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        long jLongValue = ((java.lang.Number) obj3).longValue();
        defpackage.gtz gtzVar = new defpackage.gtz((defpackage.aoln) obj4);
        gtzVar.b = (java.lang.Throwable) obj2;
        gtzVar.c = jLongValue;
        return gtzVar.b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2 = this.b;
        long j = this.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i == 0) {
            defpackage.gsh.a();
            android.util.Log.e(defpackage.gub.a, "Cannot check for unfinished work", (java.lang.Throwable) obj2);
            long jMin = java.lang.Math.min(30000 * j, defpackage.gub.b);
            this.b = null;
            this.c = j;
            this.a = 1;
            if (defpackage.aosv.j(jMin, this) == aoluVar) {
                return aoluVar;
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
