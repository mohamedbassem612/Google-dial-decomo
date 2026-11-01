package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofq {
    private static final aimz a = aimz.i("com/android/dialer/expresso/receiver/impl/service/ExpressoReceiverPreconditions");
    private final defpackage.ofh b;
    private final afpl c;

    public ofq(afpl afplVar, defpackage.ofh ofhVar) {
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(ofhVar, "expressoSharedPreconditions");
        this.c = afplVar;
        this.b = ofhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ofp ofpVar;
        if (aolnVar instanceof defpackage.ofp) {
            ofpVar = (defpackage.ofp) aolnVar;
            int i = ofpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofpVar.c = i - Integer.MIN_VALUE;
            } else {
                ofpVar = new defpackage.ofp(this, aolnVar);
            }
        } else {
            ofpVar = new defpackage.ofp(this, aolnVar);
        }
        java.lang.Object objD = ofpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ofpVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.c.X();
            ofpVar.d = this;
            ofpVar.c = 1;
            objD = aosv.D(ajcqVarX, ofpVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        this = ofpVar.d;
        aooc.af(objD);
        aooh.e(objD, "await(...)");
        ofpVar.d = null;
        ofpVar.c = 2;
        java.lang.Object objB = this.b((defpackage.hkl) objD, ofpVar);
        if (objB != aoluVar) {
            return objB;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.hkl hklVar, aoln aolnVar) {
        defpackage.ofo ofoVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.ofo) {
            ofoVar = (defpackage.ofo) aolnVar;
            int i = ofoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofoVar.d = i - Integer.MIN_VALUE;
            } else {
                ofoVar = new defpackage.ofo(this, aolnVar);
            }
        } else {
            ofoVar = new defpackage.ofo(this, aolnVar);
        }
        java.lang.Object objC = ofoVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ofoVar.d;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = ofoVar.a;
                aooc.af(objC);
                obj = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            if (objC != zpo.d) {
                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/receiver/impl/service/ExpressoReceiverPreconditions", "arePreconditionsSatified", 46, "ExpressoReceiverPreconditions.kt").v("the call is no longer ringing");
            } else {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        aooc.af(objC);
        defpackage.ofh ofhVar = this.b;
        ofoVar.a = hklVar;
        ofoVar.d = 1;
        objC = ofhVar.c(hklVar, ofoVar);
        if (objC == aoluVar) {
            obj = hklVar;
            return aoluVar;
        }
        obj = hklVar;
        if (((java.lang.Boolean) objC).booleanValue()) {
            ofoVar.a = null;
            ofoVar.d = 2;
            objC = aosv.D(((defpackage.ofn) aooc.ar(obj, defpackage.ofn.class)).y(), ofoVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            if (objC != zpo.d) {
                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/receiver/impl/service/ExpressoReceiverPreconditions", "arePreconditionsSatified", 46, "ExpressoReceiverPreconditions.kt").v("the call is no longer ringing");
            } else {
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
