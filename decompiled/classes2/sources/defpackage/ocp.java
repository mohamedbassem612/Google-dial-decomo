package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ocp extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.ocq b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ android.os.Bundle d;
    java.lang.Object e;
    java.lang.Object f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocp(aoln aolnVar, defpackage.ocq ocqVar, java.lang.String str, android.os.Bundle bundle) {
        super(2, aolnVar);
        this.b = ocqVar;
        this.c = str;
        this.d = bundle;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143 A[Catch: all -> 0x01bd, TryCatch #4 {all -> 0x01bd, blocks: (B:54:0x012c, B:56:0x0143, B:58:0x015c, B:59:0x0162, B:51:0x010f, B:27:0x005f, B:29:0x0065, B:30:0x0082, B:34:0x0094, B:37:0x00ba, B:39:0x00c4, B:45:0x00eb, B:48:0x00f9, B:70:0x01a6, B:43:0x00e6, B:44:0x00e9, B:35:0x009a), top: B:90:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x015c A[Catch: all -> 0x01bd, TryCatch #4 {all -> 0x01bd, blocks: (B:54:0x012c, B:56:0x0143, B:58:0x015c, B:59:0x0162, B:51:0x010f, B:27:0x005f, B:29:0x0065, B:30:0x0082, B:34:0x0094, B:37:0x00ba, B:39:0x00c4, B:45:0x00eb, B:48:0x00f9, B:70:0x01a6, B:43:0x00e6, B:44:0x00e9, B:35:0x009a), top: B:90:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0162 A[Catch: all -> 0x01bd, TRY_LEAVE, TryCatch #4 {all -> 0x01bd, blocks: (B:54:0x012c, B:56:0x0143, B:58:0x015c, B:59:0x0162, B:51:0x010f, B:27:0x005f, B:29:0x0065, B:30:0x0082, B:34:0x0094, B:37:0x00ba, B:39:0x00c4, B:45:0x00eb, B:48:0x00f9, B:70:0x01a6, B:43:0x00e6, B:44:0x00e9, B:35:0x009a), top: B:90:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:9:0x001c, B:62:0x0173, B:64:0x017b, B:66:0x0186), top: B:83:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        apdp apdpVar;
        apdp apdpVar2;
        defpackage.oco ocoVar;
        defpackage.oce oceVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.odl odlVar;
        defpackage.odi odiVar;
        java.lang.Object obj4;
        defpackage.ocq ocqVar;
        defpackage.mba mbaVar;
        j$.util.Optional optionalE;
        java.lang.Object objO;
        aolu aoluVar = aolu.a;
        int i = this.a;
        try {
            try {
                if (i == 0) {
                    aooc.af(obj);
                    apdpVar = this.b.j;
                    this.g = apdpVar;
                    this.a = 1;
                    if (apdpVar.b(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            obj4 = this.e;
                            if (i != 3) {
                                apdpVar2 = (apdp) this.g;
                                try {
                                    aooc.af(obj);
                                    if (((java.lang.Number) obj).intValue() != 2) {
                                        this.b.c.b(mce.aF);
                                    }
                                    defpackage.ocq.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 139, "DisplayEmergencyMessageEventListener.kt").y("pending intent: %s", obj4);
                                    this.b.i.a(ajcm.a);
                                    apdpVar = apdpVar2;
                                    apdpVar.d();
                                    return aojh.a;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                }
                            } else {
                                apdp apdpVar3 = (apdp) this.g;
                                try {
                                    aooc.af(obj);
                                    apdpVar = apdpVar3;
                                    ocqVar = this.b;
                                    mbaVar = ocqVar.c;
                                    mbaVar.b(mce.eY);
                                    if (((java.lang.Boolean) ocqVar.f.a()).booleanValue()) {
                                        optionalE = ocqVar.k.e();
                                        aooh.e(optionalE, "getIsInCallUiShowing(...)");
                                        if (!((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue()) {
                                            tkl tklVar = ocqVar.l;
                                            this.g = apdpVar;
                                            this.e = obj4;
                                            this.a = 4;
                                            objO = tklVar.o(this);
                                            if (objO == aoluVar) {
                                                return aoluVar;
                                            }
                                            apdpVar2 = apdpVar;
                                            obj = objO;
                                            if (((java.lang.Number) obj).intValue() != 2) {
                                                this.b.c.b(mce.aF);
                                            }
                                            defpackage.ocq.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 139, "DisplayEmergencyMessageEventListener.kt").y("pending intent: %s", obj4);
                                            this.b.i.a(ajcm.a);
                                            apdpVar = apdpVar2;
                                            apdpVar.d();
                                            return aojh.a;
                                        }
                                        mbaVar.b(mce.aa);
                                    }
                                    apdpVar2 = apdpVar;
                                    defpackage.ocq.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 139, "DisplayEmergencyMessageEventListener.kt").y("pending intent: %s", obj4);
                                    this.b.i.a(ajcm.a);
                                    apdpVar = apdpVar2;
                                    apdpVar.d();
                                    return aojh.a;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    apdpVar2 = apdpVar3;
                                }
                            }
                        } else {
                            obj3 = this.f;
                            obj2 = this.e;
                            apdp apdpVar4 = (apdp) this.g;
                            try {
                                aooc.af(obj);
                                apdpVar = apdpVar4;
                                odlVar = this.b.d;
                                odiVar = new defpackage.odi((android.app.PendingIntent) obj2, (defpackage.oce) obj3);
                                this.g = apdpVar;
                                this.e = obj2;
                                this.f = null;
                                this.a = 3;
                                if (odlVar.b(odiVar, this) != aoluVar) {
                                    return aoluVar;
                                }
                                obj4 = obj2;
                                ocqVar = this.b;
                                mbaVar = ocqVar.c;
                                mbaVar.b(mce.eY);
                                if (((java.lang.Boolean) ocqVar.f.a()).booleanValue()) {
                                    optionalE = ocqVar.k.e();
                                    aooh.e(optionalE, "getIsInCallUiShowing(...)");
                                    if (!((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue()) {
                                        tkl tklVar2 = ocqVar.l;
                                        this.g = apdpVar;
                                        this.e = obj4;
                                        this.a = 4;
                                        objO = tklVar2.o(this);
                                        if (objO == aoluVar) {
                                            return aoluVar;
                                        }
                                        apdpVar2 = apdpVar;
                                        obj = objO;
                                        if (((java.lang.Number) obj).intValue() != 2) {
                                            this.b.c.b(mce.aF);
                                        }
                                        defpackage.ocq.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 139, "DisplayEmergencyMessageEventListener.kt").y("pending intent: %s", obj4);
                                        this.b.i.a(ajcm.a);
                                        apdpVar = apdpVar2;
                                        apdpVar.d();
                                        return aojh.a;
                                    }
                                    mbaVar.b(mce.aa);
                                }
                                apdpVar2 = apdpVar;
                                defpackage.ocq.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 139, "DisplayEmergencyMessageEventListener.kt").y("pending intent: %s", obj4);
                                this.b.i.a(ajcm.a);
                                apdpVar = apdpVar2;
                                apdpVar.d();
                                return aojh.a;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                apdpVar2 = apdpVar4;
                            }
                        }
                        apdpVar2.d();
                        throw th;
                    }
                    apdp apdpVar5 = (apdp) this.g;
                    aooc.af(obj);
                    apdpVar = apdpVar5;
                }
                if (android.os.Build.VERSION.SDK_INT < 34) {
                    defpackage.ocq.a.c().m(aioa.b).l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 90, "DisplayEmergencyMessageEventListener.kt").v("Unexpected pre-U invocation of SOS message listener");
                } else {
                    java.lang.String strAy = pez.ay();
                    java.lang.String strAz = pez.az();
                    java.lang.String strAA = pez.aA();
                    if (strAA == null || strAz == null || strAy == null) {
                        defpackage.ocq.a.c().m(aioa.b).l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "getSatelliteTelephonyConstants", 159, "DisplayEmergencyMessageEventListener.kt").v("Dialer failed to handle DISPLAY_EMERGENCY_MESSAGE due to missing Telephony constants");
                        ocoVar = null;
                    } else {
                        ocoVar = new defpackage.oco(strAA, strAy, strAz);
                    }
                    if (ocoVar != null && aooh.n(this.c, ocoVar.a)) {
                        android.os.Bundle bundle = this.d;
                        int i2 = bundle.getInt(ocoVar.b, -1);
                        aimz aimzVar = defpackage.ocq.a;
                        aimzVar.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 102, "DisplayEmergencyMessageEventListener.kt").w("Received handover type: %d", i2);
                        if (i2 != 1) {
                            oceVar = i2 != 2 ? null : defpackage.oce.b;
                        } else {
                            oceVar = defpackage.oce.a;
                        }
                        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) ae$.ExternalSyntheticApiModelOutline0.m(bundle, ocoVar.c, android.app.PendingIntent.class);
                        if (oceVar == null || pendingIntent == null) {
                            aimzVar.d().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 117, "DisplayEmergencyMessageEventListener.kt").v("Arguments are null. DISPLAY_EMERGENCY_MESSAGE ConnectionEvent was malformed.");
                        } else {
                            defpackage.ocq ocqVar2 = this.b;
                            ocqVar2.g = true;
                            defpackage.ocu ocuVar = ocqVar2.e;
                            this.g = apdpVar;
                            this.e = pendingIntent;
                            this.f = oceVar;
                            this.a = 2;
                            if (ocuVar.b(this) == aoluVar) {
                                return aoluVar;
                            }
                            obj2 = pendingIntent;
                            obj3 = oceVar;
                            odlVar = this.b.d;
                            odiVar = new defpackage.odi((android.app.PendingIntent) obj2, (defpackage.oce) obj3);
                            this.g = apdpVar;
                            this.e = obj2;
                            this.f = null;
                            this.a = 3;
                            if (odlVar.b(odiVar, this) != aoluVar) {
                                return aoluVar;
                            }
                            obj4 = obj2;
                            ocqVar = this.b;
                            mbaVar = ocqVar.c;
                            mbaVar.b(mce.eY);
                            if (((java.lang.Boolean) ocqVar.f.a()).booleanValue()) {
                                optionalE = ocqVar.k.e();
                                aooh.e(optionalE, "getIsInCallUiShowing(...)");
                                if (!((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue()) {
                                    mbaVar.b(mce.aa);
                                } else {
                                    tkl tklVar3 = ocqVar.l;
                                    this.g = apdpVar;
                                    this.e = obj4;
                                    this.a = 4;
                                    objO = tklVar3.o(this);
                                    if (objO == aoluVar) {
                                        return aoluVar;
                                    }
                                    apdpVar2 = apdpVar;
                                    obj = objO;
                                    if (((java.lang.Number) obj).intValue() != 2) {
                                        this.b.c.b(mce.aF);
                                    }
                                    defpackage.ocq.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 139, "DisplayEmergencyMessageEventListener.kt").y("pending intent: %s", obj4);
                                    this.b.i.a(ajcm.a);
                                    apdpVar = apdpVar2;
                                }
                            }
                            apdpVar2 = apdpVar;
                            defpackage.ocq.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived$<anonymous>$<anonymous>", 139, "DisplayEmergencyMessageEventListener.kt").y("pending intent: %s", obj4);
                            this.b.i.a(ajcm.a);
                            apdpVar = apdpVar2;
                        }
                    }
                }
                apdpVar.d();
                return aojh.a;
            } catch (java.lang.Throwable th4) {
                th = th4;
                apdpVar2 = apdpVar;
            }
        } catch (java.lang.Exception e) {
            if (!(e instanceof java.util.concurrent.CancellationException)) {
                aimz aimzVar2 = zih.a;
                zih.a.c().k(e).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
            }
            throw e;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ocp ocpVar = new defpackage.ocp(aolnVar, this.b, this.c, this.d);
        ocpVar.g = obj;
        return ocpVar;
    }
}
