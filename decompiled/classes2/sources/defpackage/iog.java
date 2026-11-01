package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iog {
    private static final aimz c = aimz.i("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener");
    public final aoss a;
    public final defpackage.znb b;
    private final defpackage.iok d;
    private final defpackage.ioh e;
    private final pqm f;
    private final afpl g;

    public iog(aoss aossVar, aolr aolrVar, afpl afplVar, defpackage.iok iokVar, pqm pqmVar, defpackage.ioh iohVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(iokVar, "safetyhubEmergencyCallDataSender");
        aooh.f(pqmVar, "callController");
        this.a = aossVar;
        this.g = afplVar;
        this.d = iokVar;
        this.f = pqmVar;
        this.e = iohVar;
        this.b = new defpackage.ocn(this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, android.os.Bundle bundle, aoln aolnVar) {
        defpackage.ioe ioeVar;
        defpackage.iod iodVar;
        if (aolnVar instanceof defpackage.ioe) {
            ioeVar = (defpackage.ioe) aolnVar;
            int i = ioeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ioeVar.c = i - Integer.MIN_VALUE;
            } else {
                ioeVar = new defpackage.ioe(this, aolnVar);
            }
        } else {
            ioeVar = new defpackage.ioe(this, aolnVar);
        }
        java.lang.Object objB = ioeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ioeVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            if (android.os.Build.VERSION.SDK_INT < 34) {
                c.c().m(aioa.b).l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "handleConnectionEvent", 70, "EmergencyMessageEventListener.kt").v("Unexpected pre-V invocation of emergency message listener");
                return aojh.a;
            }
            java.lang.String strAy = pez.ay();
            java.lang.String strAz = pez.az();
            java.lang.String strAA = pez.aA();
            if (strAA == null || strAz == null || strAy == null) {
                c.c().m(aioa.b).l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "getSatelliteTelephonyConstants", 114, "EmergencyMessageEventListener.kt").v("Dialer failed to handle emergency message event due to missing Telephony constants");
                iodVar = null;
            } else {
                iodVar = new defpackage.iod(strAA, strAy, strAz);
            }
            if (iodVar != null && aooh.n(str, iodVar.a)) {
                if (bundle == null) {
                    c.d().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "handleConnectionEvent", 81, "EmergencyMessageEventListener.kt").v("extras are null for emergency message event.");
                    return aojh.a;
                }
                int i3 = bundle.getInt(iodVar.b, -1);
                int i4 = 2;
                if (i3 != 1) {
                    i4 = i3 != 2 ? 0 : 3;
                }
                if (i4 == 0) {
                    c.d().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "handleConnectionEvent", 94, "EmergencyMessageEventListener.kt").v("Handover type is null for emergency message event.");
                    return aojh.a;
                }
                ioeVar.c = 1;
                objB = b(i4, ioeVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objB);
        if (((java.lang.Boolean) objB).booleanValue()) {
            c.b().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "handleConnectionEvent", 99, "EmergencyMessageEventListener.kt").v("SMS handover to safety hub triggered");
            agsm.i(132, this.f.f(), "failed to disconnect call", new java.lang.Object[0]);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(int i, aoln aolnVar) {
        defpackage.iof iofVar;
        if (aolnVar instanceof defpackage.iof) {
            iofVar = (defpackage.iof) aolnVar;
            int i2 = iofVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iofVar.c = i2 - Integer.MIN_VALUE;
            } else {
                iofVar = new defpackage.iof(this, aolnVar);
            }
        } else {
            iofVar = new defpackage.iof(this, aolnVar);
        }
        java.lang.Object objD = iofVar.a;
        aolu aoluVar = aolu.a;
        int i3 = iofVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                aooc.af(objD);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            defpackage.hux huxVar = (defpackage.hux) objD;
            c.b().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "shouldTriggerSmsHandoverToSafetyHub", 149, "EmergencyMessageEventListener.kt").y("voiceAssistEmergencyType: %s", huxVar.name());
            return java.lang.Boolean.valueOf(huxVar == defpackage.hux.CAR_CRASH);
        }
        aooc.af(objD);
        if (!this.e.a()) {
            c.b().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "shouldTriggerSmsHandoverToSafetyHub", 134, "EmergencyMessageEventListener.kt").v("SMS handover to safety hub is disabled.");
            return java.lang.Boolean.FALSE;
        }
        this.d.h = i;
        if (i != 3) {
            c.b().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "shouldTriggerSmsHandoverToSafetyHub", 139, "EmergencyMessageEventListener.kt").v("SMS handover to safety hub is not supported for handover type.");
            return java.lang.Boolean.FALSE;
        }
        ajcq ajcqVarX = this.g.X();
        iofVar.c = 1;
        objD = aosv.D(ajcqVarX, iofVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarI = ((defpackage.ioc) aooc.ar(objD, defpackage.ioc.class)).i();
        iofVar.c = 2;
        objD = aosv.D(ajcqVarI, iofVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        defpackage.hux huxVar2 = (defpackage.hux) objD;
        c.b().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/EmergencyMessageEventListener", "shouldTriggerSmsHandoverToSafetyHub", 149, "EmergencyMessageEventListener.kt").y("voiceAssistEmergencyType: %s", huxVar2.name());
        return java.lang.Boolean.valueOf(huxVar2 == defpackage.hux.CAR_CRASH);
    }
}
