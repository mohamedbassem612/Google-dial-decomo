package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aghb extends aomh implements aonp {
    int a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ long c;

    public aghb(aoln aolnVar) {
        super(4, aolnVar);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        long jLongValue = ((java.lang.Number) obj3).longValue();
        defpackage.aghb aghbVar = new defpackage.aghb((aoln) obj4);
        aghbVar.b = (java.lang.Throwable) obj2;
        aghbVar.c = jLongValue;
        return aghbVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        boolean z = true;
        aooc.af(obj);
        if (i == 0) {
            java.lang.Object obj2 = this.b;
            long j = this.c;
            if (obj2 instanceof defpackage.aghe) {
                long jMin = java.lang.Math.min(60000L, (long) (java.lang.Math.pow(2.0d, j) * 1000.0d));
                defpackage.aghd.d.x("Retrying connection in " + jMin + " ms (attempt " + j + ')');
                this.a = 1;
                if (aosv.j(jMin, this) == aoluVar) {
                    return aoluVar;
                }
            } else {
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
