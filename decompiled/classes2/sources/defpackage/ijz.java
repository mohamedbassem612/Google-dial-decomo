package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ijz extends aomh implements aonn {
    long a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.ika f;
    final /* synthetic */ defpackage.igb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijz(defpackage.ika ikaVar, defpackage.igb igbVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = ikaVar;
        this.g = igbVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        long j;
        java.lang.Object obj4;
        aolu aoluVar = aolu.a;
        if (this.e != 0) {
            j = this.a;
            obj2 = this.d;
            java.lang.Object obj5 = this.c;
            obj3 = this.b;
            aooc.af(obj);
            obj4 = obj5;
        } else {
            aooc.af(obj);
            defpackage.ika ikaVar = this.f;
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            obj2 = this.g;
            apdp apdpVar = ikaVar.f;
            this.b = apdpVar;
            this.c = ikaVar;
            this.d = obj2;
            this.a = epochMilli;
            this.e = 1;
            if (apdpVar.b(this) == aoluVar) {
                return aoluVar;
            }
            obj3 = apdpVar;
            j = epochMilli;
            obj4 = ikaVar;
        }
        try {
            defpackage.ijx ijxVar = ((defpackage.ika) obj4).c;
            if (ijxVar != null) {
                ((defpackage.ika) obj4).e += (long) ((defpackage.igb) obj2).c.c();
                long j2 = j - ((defpackage.ika) obj4).d;
                akzm akzmVar = ijxVar.a.c;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                if (j2 >= aldf.a(akzmVar)) {
                    long j3 = (((long) (((defpackage.igb) obj2).d << 1)) * j2) / 1000;
                    double d = (j3 - ((defpackage.ika) obj4).e) / j3;
                    aimz aimzVar = zih.a;
                    aoov.al(((defpackage.ika) obj4).b, zih.b.plus(aols.a), 1, new defpackage.ijy(null, ijxVar, d));
                    ((defpackage.ika) obj4).d = j;
                    ((defpackage.ika) obj4).e = 0L;
                }
            }
            return aojh.a;
        } finally {
            ((apdp) obj3).d();
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ijz(this.f, this.g, aolnVar);
    }
}
