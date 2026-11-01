package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ysx extends aomh implements aonn {
    java.lang.Object a;
    int b;
    int c;
    final /* synthetic */ defpackage.ysy d;
    final /* synthetic */ defpackage.yse e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysx(defpackage.ysy ysyVar, defpackage.yse yseVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = ysyVar;
        this.e = yseVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:48:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        ysg ysgVar;
        java.lang.Object objC;
        int i;
        java.lang.Throwable thC;
        defpackage.ymk ymkVar;
        java.lang.Object objE;
        java.lang.Object obj2;
        defpackage.ymk ymkVar2;
        java.lang.Throwable thC2;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    i = this.b;
                    if (i2 != 3) {
                        ymkVar2 = (defpackage.ymk) this.a;
                        aooc.af(obj);
                        obj2 = ((aoiw) obj).a;
                    } else {
                        obj3 = this.a;
                    }
                } else {
                    i = this.b;
                    obj3 = this.a;
                }
                ysgVar = (ysg) obj3;
                aooc.af(obj);
                objC = ((aoiw) obj).a;
                thC = aoiw.c(objC);
                if (thC != null) {
                    ymkVar = (defpackage.ymk) objC;
                    ysgVar.f();
                    defpackage.ysy ysyVar = this.d;
                    this.a = ymkVar;
                    this.b = i;
                    this.c = 4;
                    objE = ysyVar.d.e(ymkVar, this);
                    if (objE != aoluVar) {
                        return aoluVar;
                    }
                    obj2 = objE;
                    ymkVar2 = ymkVar;
                } else if ((thC instanceof defpackage.ymi) || ((defpackage.ymi) thC).b != 606) {
                    defpackage.ysy.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/modelavailability/AiCoreModelAvailability", "getFreshModelAvailability$<anonymous>$<anonymous>", 78, "AiCoreModelAvailability.kt").w("[%s] aiFeature is unavailable", i);
                    return defpackage.yta.b;
                }
                return defpackage.yta.c;
            }
            ysgVar = (ysg) this.a;
            aooc.af(obj);
            thC2 = aoiw.c(obj2);
            if (thC2 == null) {
                int iIntValue = ((java.lang.Number) obj2).intValue();
                defpackage.ysy.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/modelavailability/AiCoreModelAvailability", "getFreshModelAvailability$<anonymous>", 118, "AiCoreModelAvailability.kt").M("[%s] - aiFeatureStatus: %s -> %s", ymkVar2, new java.lang.Integer(iIntValue), wsc.A(iIntValue));
                return wsc.A(iIntValue);
            }
            if ((thC2 instanceof defpackage.ymi) || ((defpackage.ymi) thC2).b != 606) {
                defpackage.ysy.a.d().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/modelavailability/AiCoreModelAvailability", "getFreshModelAvailability$<anonymous>$<anonymous>", 110, "AiCoreModelAvailability.kt").w("[%s] aiFeatureStatus is unavailable", i);
                return defpackage.yta.b;
            }
            return defpackage.yta.c;
        }
        aooc.af(obj);
        defpackage.ysy ysyVar2 = this.d;
        defpackage.yse yseVar = this.e;
        aoin aoinVar = (aoin) ysyVar2.e.k().get(yseVar);
        ysg ysgVar2 = aoinVar != null ? (ysg) aoinVar.a() : null;
        if (ysgVar2 == null) {
            java.util.Objects.toString(yseVar);
            throw new java.lang.IllegalStateException("AiCoreIntegration not found for AiCoreFeature: ".concat(java.lang.String.valueOf(yseVar)));
        }
        defpackage.ytj ytjVar = ysyVar2.b;
        this.a = ysgVar2;
        this.c = 1;
        obj = ytjVar.b("com.google.android.aicore", this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        ysgVar = ysgVar2;
        java.lang.Long l = (java.lang.Long) obj;
        if ((l != null ? l.longValue() : -1L) < ysgVar.b()) {
            return defpackage.yta.a;
        }
        defpackage.ysy ysyVar3 = this.d;
        int iA = ysyVar3.c.a(this.e);
        java.lang.Integer numD = ysgVar.d();
        if (numD != null) {
            defpackage.ysu ysuVar = ysyVar3.d;
            int iIntValue2 = numD.intValue();
            this.a = ysgVar;
            this.b = iA;
            this.c = 2;
            objC = ysuVar.d(iA, iIntValue2, this);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            defpackage.ysu ysuVar2 = ysyVar3.d;
            this.a = ysgVar;
            this.b = iA;
            this.c = 3;
            objC = ysuVar2.c(iA, this);
            if (objC == aoluVar) {
                return aoluVar;
            }
        }
        i = iA;
        thC = aoiw.c(objC);
        if (thC != null) {
            if (thC instanceof defpackage.ymi) {
            }
            defpackage.ysy.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/modelavailability/AiCoreModelAvailability", "getFreshModelAvailability$<anonymous>$<anonymous>", 78, "AiCoreModelAvailability.kt").w("[%s] aiFeature is unavailable", i);
            return defpackage.yta.b;
        }
        ymkVar = (defpackage.ymk) objC;
        ysgVar.f();
        defpackage.ysy ysyVar4 = this.d;
        this.a = ymkVar;
        this.b = i;
        this.c = 4;
        objE = ysyVar4.d.e(ymkVar, this);
        if (objE != aoluVar) {
            return aoluVar;
        }
        obj2 = objE;
        ymkVar2 = ymkVar;
        thC2 = aoiw.c(obj2);
        if (thC2 == null) {
            int iIntValue3 = ((java.lang.Number) obj2).intValue();
            defpackage.ysy.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/modelavailability/AiCoreModelAvailability", "getFreshModelAvailability$<anonymous>", 118, "AiCoreModelAvailability.kt").M("[%s] - aiFeatureStatus: %s -> %s", ymkVar2, new java.lang.Integer(iIntValue3), wsc.A(iIntValue3));
            return wsc.A(iIntValue3);
        }
        if (thC2 instanceof defpackage.ymi) {
        }
        defpackage.ysy.a.d().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/modelavailability/AiCoreModelAvailability", "getFreshModelAvailability$<anonymous>$<anonymous>", 110, "AiCoreModelAvailability.kt").w("[%s] aiFeatureStatus is unavailable", i);
        return defpackage.yta.b;
        return defpackage.yta.c;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ysx(this.d, this.e, aolnVar);
    }
}
