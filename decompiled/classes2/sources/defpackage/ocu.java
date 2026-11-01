package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ocu {
    public static final aimz a = aimz.i("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteFeaturePromoController");
    public final aoin b;
    public final aolr c;
    public final aoss d;
    public boolean e;
    public aoub f;
    public aoub g;
    public final zoi h;
    public final zpz i;
    public final apdp j;
    public final apdp k;

    public ocu(aoin aoinVar, zpz zpzVar, aolr aolrVar, aoss aossVar) {
        aooh.f(aoinVar, "hideModalCountdownTimerMillis");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        this.b = aoinVar;
        this.i = zpzVar;
        this.c = aolrVar;
        this.d = aossVar;
        this.j = new apdp();
        this.k = new apdp();
        this.h = new defpackage.jwb(this, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ocr ocrVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ocr) {
            ocrVar = (defpackage.ocr) aolnVar;
            int i = ocrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ocrVar.c = i - Integer.MIN_VALUE;
            } else {
                ocrVar = new defpackage.ocr(this, aolnVar);
            }
        } else {
            ocrVar = new defpackage.ocr(this, aolnVar);
        }
        java.lang.Object obj = ocrVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = ocrVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.j;
                ocrVar.d = apdpVar2;
                ocrVar.c = 1;
                if (apdpVar2.b(ocrVar) != boolValueOf) {
                    apdpVar = apdpVar2;
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = ocrVar.d;
            aooc.af(obj);
            boolValueOf = java.lang.Boolean.valueOf(this.e);
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ocs ocsVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ocs) {
            ocsVar = (defpackage.ocs) aolnVar;
            int i = ocsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ocsVar.c = i - Integer.MIN_VALUE;
            } else {
                ocsVar = new defpackage.ocs(this, aolnVar);
            }
        } else {
            ocsVar = new defpackage.ocs(this, aolnVar);
        }
        java.lang.Object obj = ocsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ocsVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteFeaturePromoController", "showPromo", 65, "SatelliteFeaturePromoController.kt").v("enter");
            apdp apdpVar2 = this.k;
            ocsVar.d = apdpVar2;
            ocsVar.c = 1;
            if (apdpVar2.b(ocsVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = ocsVar.d;
            aooc.af(obj);
        }
        try {
            if (this.f != null) {
                a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteFeaturePromoController", "showPromo$<anonymous>", 68, "SatelliteFeaturePromoController.kt").v("Modal is already being shown for this call.");
            } else {
                aosy aosyVarAm = aoov.am(this.d, 0, new defpackage.oct(this, (aoln) null, 1, (byte[]) null), 3);
                this.f = aooc.V(aosyVarAm);
                this.i.a(aosv.C(aosyVarAm));
            }
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }
}
