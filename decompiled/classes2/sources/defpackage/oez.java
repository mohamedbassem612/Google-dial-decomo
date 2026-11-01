package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oez {
    public final aoss a;
    public final java.util.ArrayList b;
    public akzm c;
    public final ahda d;

    public oez(aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = aossVar;
        this.d = new ahda((byte[]) null);
        this.b = new java.util.ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.oex oexVar;
        if (aolnVar instanceof defpackage.oex) {
            oexVar = (defpackage.oex) aolnVar;
            int i = oexVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oexVar.c = i - Integer.MIN_VALUE;
            } else {
                oexVar = new defpackage.oex(this, aolnVar);
            }
        } else {
            oexVar = new defpackage.oex(this, aolnVar);
        }
        java.lang.Object objA = oexVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oexVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aosy aosyVarAg = ahvr.ag(this.a, this.d, new defpackage.mhq(this, (aoln) null, 18));
            oexVar.c = 1;
            objA = aosyVarAg.a(oexVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        aooh.e(objA, "await(...)");
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.oeu oeuVar, aoln aolnVar) {
        defpackage.oey oeyVar;
        if (aolnVar instanceof defpackage.oey) {
            oeyVar = (defpackage.oey) aolnVar;
            int i = oeyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oeyVar.c = i - Integer.MIN_VALUE;
            } else {
                oeyVar = new defpackage.oey(this, aolnVar);
            }
        } else {
            oeyVar = new defpackage.oey(this, aolnVar);
        }
        java.lang.Object obj = oeyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oeyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aosy aosyVarAg = ahvr.ag(this.a, this.d, new defpackage.ofa(this, oeuVar, (aoln) null, 1));
            oeyVar.c = 1;
            if (aosyVarAg.a(oeyVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
