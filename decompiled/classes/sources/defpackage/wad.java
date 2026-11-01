package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wad implements defpackage.zmt, defpackage.znu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/wear/audiotransfer/wearaudiotransferlistener/WearAudioTransferListener");
    public final defpackage.zmq b;
    public final defpackage.aoin c;
    public android.telecom.CallAudioState d;
    public final defpackage.zpm e;
    public final defpackage.apdp f;
    private final defpackage.aoss g;
    private final defpackage.oud h;
    private final defpackage.gpd i;
    private final defpackage.apni j;

    public wad(defpackage.oud oudVar, defpackage.aoss aossVar, defpackage.apni apniVar, defpackage.zmq zmqVar, defpackage.zpm zpmVar, defpackage.gpd gpdVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(oudVar, "inCallUiMinimizer");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(apniVar, "androidJobs");
        defpackage.aooh.f(zpmVar, "callScopes");
        defpackage.aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        defpackage.aooh.f(aoinVar, "enableEmergencyCallFilterForInCallUiMinimization");
        this.h = oudVar;
        this.g = aossVar;
        this.j = apniVar;
        this.b = zmqVar;
        this.e = zpmVar;
        this.i = gpdVar;
        this.c = aoinVar;
        this.f = new defpackage.apdp();
    }

    public final defpackage.zas a() {
        return this.i.i(null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bf -> B:29:0x00c2). Please report as a decompilation issue!!! */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        vzz vzzVar;
        java.lang.Object it;
        vzy vzyVar;
        java.lang.Object obj;
        boolean zBooleanValue;
        java.lang.Object objD;
        boolean z;
        vzy vzyVar2;
        java.lang.Object objD2;
        defpackage.ailj ailjVar;
        if (aolnVar instanceof vzz) {
            vzzVar = (vzz) aolnVar;
            int i = vzzVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzzVar.f = i - Integer.MIN_VALUE;
            } else {
                vzzVar = new vzz(this, aolnVar);
            }
        } else {
            vzzVar = new vzz(this, aolnVar);
        }
        java.lang.Object objD3 = vzzVar.d;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vzzVar.f;
        if (i2 == 0) {
            defpackage.aooc.af(objD3);
            it = this.e.a().iterator();
            defpackage.aooh.e(it, "iterator(...)");
            ailjVar = (defpackage.ailj) it;
            if (ailjVar.hasNext()) {
                return java.lang.Boolean.FALSE;
            }
            defpackage.ajcq ajcqVarX = ((vzx) ((apqr) ailjVar.next()).a(vzx.class)).lD().X();
            vzzVar.a = it;
            vzzVar.f = 1;
            objD3 = defpackage.aosv.D(ajcqVarX, vzzVar);
            if (objD3 == aoluVar) {
                return aoluVar;
            }
            java.lang.Object objAr = defpackage.aooc.ar((hkl) objD3, vzy.class);
            defpackage.aooh.e(objAr, "get(...)");
            vzyVar2 = (vzy) objAr;
            defpackage.ajcq ajcqVarAG = vzyVar2.aG();
            vzzVar.a = it;
            vzzVar.b = vzyVar2;
            vzzVar.f = 2;
            objD2 = defpackage.aosv.D(ajcqVarAG, vzzVar);
            if (objD2 == aoluVar) {
                return aoluVar;
            }
            obj = it;
            vzyVar = vzyVar2;
            objD3 = objD2;
            zBooleanValue = ((java.lang.Boolean) objD3).booleanValue();
            defpackage.ajcq ajcqVarAH = vzyVar.aH();
            vzzVar.a = obj;
            vzzVar.b = null;
            vzzVar.c = zBooleanValue;
            vzzVar.f = 3;
            objD = defpackage.aosv.D(ajcqVarAH, vzzVar);
            if (objD != aoluVar) {
                return aoluVar;
            }
            objD3 = objD;
            z = zBooleanValue;
        } else if (i2 == 1) {
            it = vzzVar.a;
            defpackage.aooc.af(objD3);
            java.lang.Object objAr2 = defpackage.aooc.ar((hkl) objD3, vzy.class);
            defpackage.aooh.e(objAr2, "get(...)");
            vzyVar2 = (vzy) objAr2;
            defpackage.ajcq ajcqVarAG2 = vzyVar2.aG();
            vzzVar.a = it;
            vzzVar.b = vzyVar2;
            vzzVar.f = 2;
            objD2 = defpackage.aosv.D(ajcqVarAG2, vzzVar);
            if (objD2 == aoluVar) {
                return aoluVar;
            }
            obj = it;
            vzyVar = vzyVar2;
            objD3 = objD2;
            zBooleanValue = ((java.lang.Boolean) objD3).booleanValue();
            defpackage.ajcq ajcqVarAH2 = vzyVar.aH();
            vzzVar.a = obj;
            vzzVar.b = null;
            vzzVar.c = zBooleanValue;
            vzzVar.f = 3;
            objD = defpackage.aosv.D(ajcqVarAH2, vzzVar);
            if (objD != aoluVar) {
                return aoluVar;
            }
            objD3 = objD;
            z = zBooleanValue;
        } else if (i2 == 2) {
            java.lang.Object obj2 = vzzVar.b;
            obj = vzzVar.a;
            defpackage.aooc.af(objD3);
            vzyVar = obj2;
            zBooleanValue = ((java.lang.Boolean) objD3).booleanValue();
            defpackage.ajcq ajcqVarAH3 = vzyVar.aH();
            vzzVar.a = obj;
            vzzVar.b = null;
            vzzVar.c = zBooleanValue;
            vzzVar.f = 3;
            objD = defpackage.aosv.D(ajcqVarAH3, vzzVar);
            if (objD != aoluVar) {
                return aoluVar;
            }
            objD3 = objD;
            z = zBooleanValue;
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = vzzVar.c;
            obj = vzzVar.a;
            defpackage.aooc.af(objD3);
        }
        boolean zBooleanValue2 = ((java.lang.Boolean) objD3).booleanValue();
        if (!z || zBooleanValue2) {
            return java.lang.Boolean.TRUE;
        }
        it = obj;
        ailjVar = (defpackage.ailj) it;
        if (ailjVar.hasNext()) {
            return java.lang.Boolean.FALSE;
        }
        defpackage.ajcq ajcqVarX2 = ((vzx) ((apqr) ailjVar.next()).a(vzx.class)).lD().X();
        vzzVar.a = it;
        vzzVar.f = 1;
        objD3 = defpackage.aosv.D(ajcqVarX2, vzzVar);
        if (objD3 == aoluVar) {
            return aoluVar;
        }
        java.lang.Object objAr3 = defpackage.aooc.ar((hkl) objD3, vzy.class);
        defpackage.aooh.e(objAr3, "get(...)");
        vzyVar2 = (vzy) objAr3;
        defpackage.ajcq ajcqVarAG3 = vzyVar2.aG();
        vzzVar.a = it;
        vzzVar.b = vzyVar2;
        vzzVar.f = 2;
        objD2 = defpackage.aosv.D(ajcqVarAG3, vzzVar);
        if (objD2 == aoluVar) {
            return aoluVar;
        }
        obj = it;
        vzyVar = vzyVar2;
        objD3 = objD2;
        zBooleanValue = ((java.lang.Boolean) objD3).booleanValue();
        defpackage.ajcq ajcqVarAH4 = vzyVar.aH();
        vzzVar.a = obj;
        vzzVar.b = null;
        vzzVar.c = zBooleanValue;
        vzzVar.f = 3;
        objD = defpackage.aosv.D(ajcqVarAH4, vzzVar);
        if (objD != aoluVar) {
            return aoluVar;
        }
        objD3 = objD;
        z = zBooleanValue;
        boolean zBooleanValue3 = ((java.lang.Boolean) objD3).booleanValue();
        if (z) {
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // defpackage.znu
    public final defpackage.ajcq c() {
        return defpackage.aosv.F(this.g, 0, new defpackage.ung(this, (defpackage.aoln) null, 17), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) throws java.lang.Throwable {
        wac wacVar;
        if (aolnVar instanceof wac) {
            wacVar = (wac) aolnVar;
            int i = wacVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wacVar.c = i - Integer.MIN_VALUE;
            } else {
                wacVar = new wac(this, aolnVar);
            }
        } else {
            wacVar = new wac(this, aolnVar);
        }
        java.lang.Object objD = wacVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = wacVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarA = this.h.a();
            wacVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarA, wacVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objD;
        bool.booleanValue();
        ((defpackage.aimw) a.b().l("com/android/dialer/wear/audiotransfer/wearaudiotransferlistener/WearAudioTransferListener", "requestInCallUiMinimization", 136, "WearAudioTransferListener.kt")).y("In-call audio transferred from speaker/earpiece to wear, requested minimizing in-call UI (is request processed: %b).", bool);
        return defpackage.aojh.a;
    }

    public final void e(defpackage.aonj aonjVar) {
        this.j.i(defpackage.aoov.an(this.g, null, 0, new defpackage.ung(aonjVar, (defpackage.aoln) null, 16, (byte[]) null), 3));
    }

    @Override // defpackage.zmt
    public final void f(android.telecom.CallAudioState callAudioState, android.telecom.CallAudioState callAudioState2) {
        defpackage.aooh.f(callAudioState, "previousCallAudioState");
        defpackage.aooh.f(callAudioState2, "newCallAudioState");
        e(new waa(this, callAudioState2, callAudioState, (defpackage.aoln) null));
    }

    public final boolean g(android.telecom.CallAudioState callAudioState) {
        vzx vzxVar;
        if (callAudioState.getRoute() == 2 && uyg$.ExternalSyntheticApiModelOutline2.m(callAudioState) != null) {
            j$.util.Optional optionalH = this.e.h();
            defpackage.aooh.e(optionalH, "getPrimaryCallScope(...)");
            apqr apqrVar = (apqr) defpackage.aooh.q(optionalH);
            vzo vzoVarAM = null;
            if (apqrVar != null && (vzxVar = (vzx) apqrVar.a(vzx.class)) != null) {
                vzoVarAM = vzxVar.aM();
            }
            if (vzoVarAM != null) {
                android.bluetooth.BluetoothDevice bluetoothDeviceM = uyg$.ExternalSyntheticApiModelOutline2.m(callAudioState);
                defpackage.aooh.e(bluetoothDeviceM, "getActiveBluetoothDevice(...)");
                if (vzoVarAM.a(bluetoothDeviceM)) {
                    return true;
                }
            }
        }
        return false;
    }
}
