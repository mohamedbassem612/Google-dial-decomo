package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nyj extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    final /* synthetic */ nyl g;
    final /* synthetic */ defpackage.hkd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyj(nyl nylVar, defpackage.hkd hkdVar, aoln aolnVar) {
        super(2, aolnVar);
        this.g = nylVar;
        this.h = hkdVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        nyl nylVar;
        defpackage.hkd hkdVar;
        java.lang.Object objAN;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        aolu aoluVar = aolu.a;
        int i = this.f;
        if (i == 0) {
            aooc.af(obj);
            nylVar = this.g;
            boolean zBooleanValue = ((java.lang.Boolean) nylVar.c.a()).booleanValue();
            hkdVar = this.h;
            if (zBooleanValue) {
                java.lang.String str = hkdVar.c;
                aooh.e(str, "getNormalizedNumber(...)");
                this.f = 1;
                obj = nylVar.j(str, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                return (nwy) obj;
            }
            objAN = gus.aN(nwy.a.m());
            ajcq ajcqVarC = nylVar.b.c();
            this.a = nylVar;
            this.b = hkdVar;
            this.c = objAN;
            this.d = objAN;
            this.e = objAN;
            this.f = 2;
            obj = aosv.D(ajcqVarC, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj2 = objAN;
            obj3 = obj2;
            aooh.e(obj, "await(...)");
            ((kaw) obj3).y((nwv) obj);
            nxg nxgVar = nylVar.a;
            java.lang.String str2 = hkdVar.c;
            aooh.e(str2, "getNormalizedNumber(...)");
            this.a = objAN;
            this.b = obj2;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = 3;
            obj = nxgVar.d(str2, this);
            if (obj != aoluVar) {
                return aoluVar;
            }
            obj4 = objAN;
            obj5 = obj2;
        } else {
            if (i == 1) {
                aooc.af(obj);
                return (nwy) obj;
            }
            if (i != 2) {
                obj5 = (kaw) this.b;
                obj4 = (kaw) this.a;
                aooc.af(obj);
            } else {
                java.lang.Object obj6 = this.e;
                obj2 = this.d;
                java.lang.Object obj7 = this.c;
                hkdVar = (defpackage.hkd) this.b;
                nylVar = (nyl) this.a;
                aooc.af(obj);
                obj3 = obj6;
                objAN = obj7;
                aooh.e(obj, "await(...)");
                ((kaw) obj3).y((nwv) obj);
                nxg nxgVar2 = nylVar.a;
                java.lang.String str3 = hkdVar.c;
                aooh.e(str3, "getNormalizedNumber(...)");
                this.a = objAN;
                this.b = obj2;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 3;
                obj = nxgVar2.d(str3, this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj4 = objAN;
                obj5 = obj2;
            }
        }
        defpackage.nwx nwxVar = (defpackage.nwx) obj;
        if (nwxVar == null) {
            nwxVar = defpackage.nwx.UNKNOWN_REACHABILITY;
        }
        ((kaw) obj5).z(nwxVar);
        return ((kaw) obj4).x();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nyj(this.g, this.h, aolnVar);
    }
}
