package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ohr {
    private static final aimz a = aimz.i("com/android/dialer/expresso/sender/impl/service/ExpressoSenderPreconditions");
    private final defpackage.ofh b;
    private final afpl c;

    public ohr(afpl afplVar, defpackage.ofh ofhVar, defpackage.ofc ofcVar) {
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(ofhVar, "expressoSharedPreconditions");
        aooh.f(ofcVar, "inCallLogger");
        this.c = afplVar;
        this.b = ofhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ohq ohqVar;
        if (aolnVar instanceof defpackage.ohq) {
            ohqVar = (defpackage.ohq) aolnVar;
            int i = ohqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ohqVar.c = i - Integer.MIN_VALUE;
            } else {
                ohqVar = new defpackage.ohq(this, aolnVar);
            }
        } else {
            ohqVar = new defpackage.ohq(this, aolnVar);
        }
        java.lang.Object objD = ohqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ohqVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.c.X();
            ohqVar.d = this;
            ohqVar.c = 1;
            objD = aosv.D(ajcqVarX, ohqVar);
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
        this = ohqVar.d;
        aooc.af(objD);
        aooh.e(objD, "await(...)");
        ohqVar.d = null;
        ohqVar.c = 2;
        java.lang.Object objB = this.b((defpackage.hkl) objD, ohqVar);
        if (objB != aoluVar) {
            return objB;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.hkl hklVar, aoln aolnVar) {
        defpackage.ohp ohpVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.ohp) {
            ohpVar = (defpackage.ohp) aolnVar;
            int i = ohpVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ohpVar.d = i - Integer.MIN_VALUE;
            } else {
                ohpVar = new defpackage.ohp(this, aolnVar);
            }
        } else {
            ohpVar = new defpackage.ohp(this, aolnVar);
        }
        java.lang.Object objC = ohpVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ohpVar.d;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = ohpVar.a;
                aooc.af(objC);
                obj = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            if (objC != zpo.c) {
                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/sender/impl/service/ExpressoSenderPreconditions", "arePreconditionsSatified", 49, "ExpressoSenderPreconditions.kt").v("expresso is only valid in the dialing stage, not showing ui");
            } else {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        aooc.af(objC);
        defpackage.ofh ofhVar = this.b;
        ohpVar.a = hklVar;
        ohpVar.d = 1;
        objC = ofhVar.c(hklVar, ohpVar);
        if (objC == aoluVar) {
            obj = hklVar;
            return aoluVar;
        }
        obj = hklVar;
        if (((java.lang.Boolean) objC).booleanValue()) {
            ohpVar.a = null;
            ohpVar.d = 2;
            objC = aosv.D(((defpackage.oho) aooc.ar(obj, defpackage.oho.class)).y(), ohpVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            if (objC != zpo.c) {
                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/sender/impl/service/ExpressoSenderPreconditions", "arePreconditionsSatified", 49, "ExpressoSenderPreconditions.kt").v("expresso is only valid in the dialing stage, not showing ui");
            } else {
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
