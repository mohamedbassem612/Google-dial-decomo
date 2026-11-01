package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class riv extends defpackage.xnl {
    private static final aimz j = aimz.i("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentPrecalculationTask");
    public final java.util.Map a;
    private final defpackage.aehd k = defpackage.aehd.e;
    private final abce l;

    public riv(java.util.Map map, abce abceVar) {
        this.a = map;
        this.l = abceVar;
    }

    @Override // defpackage.xmb
    public final /* synthetic */ defpackage.xkq a() {
        return this.k;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.rio rioVar, aoln aolnVar) {
        defpackage.rit ritVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.rit) {
            ritVar = (defpackage.rit) aolnVar;
            int i = ritVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ritVar.d = i - Integer.MIN_VALUE;
            } else {
                ritVar = new defpackage.rit(this, aolnVar);
            }
        } else {
            ritVar = new defpackage.rit(this, aolnVar);
        }
        java.lang.Object objY = ritVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ritVar.d;
        if (i2 == 0) {
            aooc.af(objY);
            aaum aaumVarM = this.l.m(rioVar.e());
            ritVar.a = rioVar;
            ritVar.d = 1;
            objY = aooh.Y(aaumVarM, ritVar);
            if (objY == aoluVar) {
                obj = rioVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = ritVar.a;
            aooc.af(objY);
            obj = obj2;
        }
        obj = rioVar;
        defpackage.aaqe aaqeVar = (defpackage.aaqe) objY;
        if (aaqeVar == null) {
            j.b().l("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentPrecalculationTask", "getConsentValue", 88, "JoyballConsentPrecalculationTask.kt").y("consentData not found for %s", obj);
            return new defpackage.riq(false, 4);
        }
        boolean z = java.lang.Boolean.parseBoolean(aaqeVar.d);
        aimz aimzVar = j;
        if (z) {
            aimzVar.b().l("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentPrecalculationTask", "getConsentValue", 98, "JoyballConsentPrecalculationTask.kt").y("consentValue is true for %s", obj);
            return new defpackage.riq(true, 2);
        }
        aimzVar.b().l("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentPrecalculationTask", "getConsentValue", 93, "JoyballConsentPrecalculationTask.kt").y("consentValue is false for %s", obj);
        return new defpackage.riq(false, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xnl
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.riu riuVar;
        if (aolnVar instanceof defpackage.riu) {
            riuVar = (defpackage.riu) aolnVar;
            int i = riuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                riuVar.c = i - Integer.MIN_VALUE;
            } else {
                riuVar = new defpackage.riu(this, aolnVar);
            }
        } else {
            riuVar = new defpackage.riu(this, aolnVar);
        }
        java.lang.Object objM = riuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = riuVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objM);
                j.b().l("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentPrecalculationTask", "runTask", 36, "JoyballConsentPrecalculationTask.kt").v("runTask");
                riuVar.c = 1;
                objM = aosv.m(new defpackage.ris(this, null), riuVar);
                if (objM == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objM);
            }
            java.util.Map map = (java.util.Map) objM;
            defpackage.riq riqVar = (defpackage.riq) map.get(defpackage.rim.DOBBY);
            if (riqVar == null) {
                riqVar = new defpackage.riq(false, 4);
            }
            defpackage.riq riqVar2 = (defpackage.riq) map.get(defpackage.rim.SHARPIE);
            if (riqVar2 == null) {
                riqVar2 = new defpackage.riq(false, 4);
            }
            return new defpackage.aehe(riqVar.a, riqVar2.a, riqVar.b, riqVar2.b, false);
        } catch (aacw e) {
            j.d().k(e).l("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentPrecalculationTask", "runTask", 54, "JoyballConsentPrecalculationTask.kt").v("ConsentManager api error");
            return new defpackage.aehe(false, false, 1, 1, true);
        }
    }
}
