package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class odl {
    private static final aimz a = aimz.i("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSTelephonyInfoCache");
    private defpackage.odi b;
    private final apdp c = new apdp();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.odj odjVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.odj) {
            odjVar = (defpackage.odj) aolnVar;
            int i = odjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                odjVar.c = i - Integer.MIN_VALUE;
            } else {
                odjVar = new defpackage.odj(this, aolnVar);
            }
        } else {
            odjVar = new defpackage.odj(this, aolnVar);
        }
        java.lang.Object obj = odjVar.a;
        defpackage.odi odiVar = aolu.a;
        int i2 = odjVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.c;
                odjVar.d = apdpVar2;
                odjVar.c = 1;
                if (apdpVar2.b(odjVar) != odiVar) {
                    apdpVar = apdpVar2;
                }
                return odiVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = odjVar.d;
            aooc.af(obj);
            odiVar = this.b;
            return odiVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object b(defpackage.odi odiVar, aoln aolnVar) {
        defpackage.odk odkVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.odk) {
            odkVar = (defpackage.odk) aolnVar;
            int i = odkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                odkVar.c = i - Integer.MIN_VALUE;
            } else {
                odkVar = new defpackage.odk(this, aolnVar);
            }
        } else {
            odkVar = new defpackage.odk(this, aolnVar);
        }
        java.lang.Object obj = odkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = odkVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.c;
            odkVar.d = odiVar;
            odkVar.e = apdpVar;
            odkVar.c = 1;
            if (apdpVar.b(odkVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = odkVar.e;
            defpackage.odi odiVar2 = odkVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            odiVar = odiVar2;
        }
        try {
            a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSTelephonyInfoCache", "setConnectionEventExtras$<anonymous>", 23, "SatelliteSOSTelephonyInfoCache.kt").v("Set connection event extras.");
            this.b = odiVar;
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }
}
