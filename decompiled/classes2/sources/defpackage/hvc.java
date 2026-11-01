package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvc {
    public static final aimz a = aimz.i("com/android/dialer/assistedemergencydialing/impl/service/AssistedEmergencyDialingController");
    public final defpackage.hwj b;
    public final defpackage.iok c;
    public final qbe d;
    public final pqm e;
    private final defpackage.hvn f;
    private final defpackage.hvo g;
    private final aoss h;
    private final afpl i;

    public hvc(defpackage.hvn hvnVar, defpackage.hwj hwjVar, defpackage.hvo hvoVar, qbe qbeVar, pqm pqmVar, aoss aossVar, afpl afplVar, defpackage.iok iokVar) {
        aooh.f(hvnVar, "emergencyInfoCache");
        aooh.f(hwjVar, "voiceAssistAudioPlayer");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(pqmVar, "callController");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(iokVar, "safetyHubEmergencyCallDataSender");
        this.f = hvnVar;
        this.b = hwjVar;
        this.g = hvoVar;
        this.d = qbeVar;
        this.e = pqmVar;
        this.h = aossVar;
        this.i = afplVar;
        this.c = iokVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.hvb hvbVar;
        if (aolnVar instanceof defpackage.hvb) {
            hvbVar = (defpackage.hvb) aolnVar;
            int i = hvbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hvbVar.c = i - Integer.MIN_VALUE;
            } else {
                hvbVar = new defpackage.hvb(this, aolnVar);
            }
        } else {
            hvbVar = new defpackage.hvb(this, aolnVar);
        }
        java.lang.Object objD = hvbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hvbVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.i.X();
            hvbVar.c = 1;
            objD = aosv.D(ajcqVarX, hvbVar);
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
        aooc.af(objD);
        ajcq ajcqVarAe = ((defpackage.hva) aooc.ar(objD, defpackage.hva.class)).ae();
        hvbVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAe, hvbVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public final void b() {
        a.b().l("com/android/dialer/assistedemergencydialing/impl/service/AssistedEmergencyDialingController", "onMessageOperatorButtonPressed", 84, "AssistedEmergencyDialingController.kt").v("enter");
        aimz aimzVar = zih.a;
        aoov.al(this.h, zih.b.plus(aols.a), 1, new defpackage.dqx((aoln) null, this, 6));
    }

    public final void c(defpackage.hux huxVar) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/assistedemergencydialing/impl/service/AssistedEmergencyDialingController", "onVoiceAssistButtonPressed", 48, "AssistedEmergencyDialingController.kt").v("enter");
        defpackage.hvo hvoVar = this.g;
        agsm.i(83, ahvr.E(new defpackage.gra(hvoVar, huxVar, 11), hvoVar.c), "Failed communicating with thunderbird api", new java.lang.Object[0]);
        this.f.a = huxVar;
        int iOrdinal = huxVar.ordinal();
        if (iOrdinal == 0) {
            aimzVar.c().m(aioa.b).l("com/android/dialer/assistedemergencydialing/impl/service/AssistedEmergencyDialingController", "onVoiceAssistButtonPressed", 73, "AssistedEmergencyDialingController.kt").v("Unspecified emergency type given to AssistedEmergencyDialingController.");
        } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            this.d.a(qbc.gZ);
        } else if (iOrdinal == 4) {
            this.d.a(qbc.hd);
        } else {
            if (iOrdinal != 5) {
                throw new aois();
            }
            this.d.a(qbc.he);
        }
        this.b.d(defpackage.hwa.a);
    }
}
