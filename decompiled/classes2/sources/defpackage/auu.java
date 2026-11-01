package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class auu implements defpackage.atw {
    public final defpackage.auy a;
    public final aiq b;
    public final kaw c;
    private final cmy d = apg.b;

    public auu(defpackage.auy auyVar, kaw kawVar, aiq aiqVar) {
        this.a = auyVar;
        this.c = kawVar;
        this.b = aiqVar;
    }

    @Override // defpackage.atw
    public final /* synthetic */ java.lang.Object a(asv asvVar, float f, aoln aolnVar) {
        return b(asvVar, f, defpackage.atx.a, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.atw
    public final java.lang.Object b(asv asvVar, float f, aonj aonjVar, aoln aolnVar) {
        defpackage.aus ausVar;
        if (aolnVar instanceof defpackage.aus) {
            ausVar = (defpackage.aus) aolnVar;
            int i = ausVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ausVar.c = i - Integer.MIN_VALUE;
            } else {
                ausVar = new defpackage.aus(this, aolnVar);
            }
        } else {
            ausVar = new defpackage.aus(this, aolnVar);
        }
        java.lang.Object objC = ausVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ausVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            ausVar.c = 1;
            objC = c(asvVar, f, aonjVar, ausVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        vx vxVar = (vx) objC;
        return new java.lang.Float(((java.lang.Number) vxVar.b).floatValue() != 0.0f ? ((java.lang.Number) ((air) vxVar.a).b()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [aonj] */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final java.lang.Object c(asv asvVar, float f, aonj aonjVar, aoln aolnVar) {
        defpackage.auq auqVar;
        ?? r13;
        if (aolnVar instanceof defpackage.auq) {
            auqVar = (defpackage.auq) aolnVar;
            int i = auqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                auqVar.d = i - Integer.MIN_VALUE;
            } else {
                auqVar = new defpackage.auq(this, aolnVar);
            }
        } else {
            auqVar = new defpackage.auq(this, aolnVar);
        }
        java.lang.Object objAj = auqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = auqVar.d;
        if (i2 == 0) {
            aooc.af(objAj);
            cmy cmyVar = this.d;
            defpackage.aur aurVar = new defpackage.aur(this, f, aonjVar, asvVar, null);
            auqVar.a = aonjVar;
            auqVar.d = 1;
            objAj = aoov.aj(cmyVar, aurVar, auqVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            r13 = aonjVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj = auqVar.a;
            aooc.af(objAj);
            r13 = obj;
        }
        vx vxVar = (vx) objAj;
        r13.a(new java.lang.Float(0.0f));
        return vxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(asv asvVar, float f, float f2, aonj aonjVar, aoln aolnVar) {
        defpackage.aut autVar;
        if (aolnVar instanceof defpackage.aut) {
            autVar = (defpackage.aut) aolnVar;
            int i = autVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                autVar.c = i - Integer.MIN_VALUE;
            } else {
                autVar = new defpackage.aut(this, aolnVar);
            }
        } else {
            autVar = new defpackage.aut(this, aolnVar);
        }
        defpackage.aut autVar2 = autVar;
        java.lang.Object objA = autVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = autVar2.c;
        if (i2 == 0) {
            aooc.af(objA);
            if (java.lang.Math.abs(f) == 0.0f || java.lang.Math.abs(f2) == 0.0f) {
                return den.br(f, f2);
            }
            autVar2.c = 1;
            kaw kawVar = this.c;
            objA = (java.lang.Math.abs(den.cb(kawVar, f2)) >= java.lang.Math.abs(f) ? new defpackage.auz(kawVar, 1) : new defpackage.auz(this.b, 0)).a(asvVar, new java.lang.Float(f), new java.lang.Float(f2), aonjVar, autVar2);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        return ((vx) objA).a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.auu) {
            defpackage.auu auuVar = (defpackage.auu) obj;
            if (aooh.n(auuVar.b, this.b) && aooh.n(auuVar.c, this.c) && aooh.n(auuVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }
}
