package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijb {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/devicethermalthreshold/AudioPrismDeviceThermalThresholdChecker");
    public final aolr b;
    public final tkl c;
    private final java.util.Map d;
    private final apdp e;

    public ijb(tkl tklVar, aolr aolrVar) {
        aooh.f(tklVar, "powerManager");
        aooh.f(aolrVar, "lightweightContext");
        this.c = tklVar;
        this.b = aolrVar;
        this.d = new java.util.LinkedHashMap();
        this.e = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r9v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object a(ifv ifvVar, final int i, final aomy aomyVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.iiz iizVar;
        apdp apdpVar;
        apdp apdpVar2;
        ifv ifvVar2;
        android.os.PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListenerM;
        if (aolnVar instanceof defpackage.iiz) {
            iizVar = (defpackage.iiz) aolnVar;
            int i2 = iizVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iizVar.f = i2 - Integer.MIN_VALUE;
            } else {
                iizVar = new defpackage.iiz(this, aolnVar);
            }
        } else {
            iizVar = new defpackage.iiz(this, aolnVar);
        }
        java.lang.Object obj = iizVar.d;
        aolu aoluVar = aolu.a;
        int i3 = iizVar.f;
        try {
            if (i3 == 0) {
                aooc.af(obj);
                apdpVar = this.e;
                iizVar.g = ifvVar;
                iizVar.a = aomyVar;
                iizVar.b = apdpVar;
                iizVar.c = i;
                iizVar.f = 1;
                if (apdpVar.b(iizVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    powerManager$OnThermalStatusChangedListenerM = fn$.ExternalSyntheticApiModelOutline0.m(iizVar.b);
                    apdpVar2 = (apdp) iizVar.a;
                    ifvVar2 = iizVar.g;
                    try {
                        aooc.af(obj);
                        this.d.put(ifvVar2, powerManager$OnThermalStatusChangedListenerM);
                        apdpVar2.d();
                        return aojh.a;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        apdpVar2.d();
                        throw th;
                    }
                }
                i = iizVar.c;
                apdp apdpVar3 = (apdp) iizVar.b;
                aomyVar = (aomy) iizVar.a;
                ifv ifvVar3 = iizVar.g;
                aooc.af(obj);
                apdpVar = apdpVar3;
                ifvVar = ifvVar3;
            }
            if (this.d.containsKey(ifvVar)) {
                a.b().l("com/android/dialer/audioprism/internal/devicethermalthreshold/AudioPrismDeviceThermalThresholdChecker", "startMonitoring$<anonymous>", 71, "AudioPrismDeviceThermalThresholdChecker.kt").y("Not starting thermal monitoring, already running for feature: %s", ifvVar);
                aojh aojhVar = aojh.a;
                apdpVar.d();
                return aojhVar;
            }
            android.os.PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = new android.os.PowerManager$OnThermalStatusChangedListener() { // from class: iiy
                public final void onThermalStatusChanged(int i4) {
                    if (i4 >= i) {
                        aomyVar.a();
                    }
                }
            };
            tkl tklVar = this.c;
            iizVar.g = ifvVar;
            iizVar.a = apdpVar;
            iizVar.b = powerManager$OnThermalStatusChangedListener;
            iizVar.f = 2;
            java.lang.Object objAj = aoov.aj((aolr) tklVar.d, new defpackage.oka(tklVar, powerManager$OnThermalStatusChangedListener, null), iizVar);
            if (objAj != aoluVar) {
                objAj = aojh.a;
            }
            if (objAj == aoluVar) {
                return aoluVar;
            }
            ifvVar2 = ifvVar;
            apdpVar2 = apdpVar;
            powerManager$OnThermalStatusChangedListenerM = powerManager$OnThermalStatusChangedListener;
            this.d.put(ifvVar2, powerManager$OnThermalStatusChangedListenerM);
            apdpVar2.d();
            return aojh.a;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(ifv ifvVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.ija ijaVar;
        ifv ifvVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.ija) {
            ijaVar = (defpackage.ija) aolnVar;
            int i = ijaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijaVar.d = i - Integer.MIN_VALUE;
            } else {
                ijaVar = new defpackage.ija(this, aolnVar);
            }
        } else {
            ijaVar = new defpackage.ija(this, aolnVar);
        }
        java.lang.Object obj = ijaVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ijaVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                ijaVar.a = ifvVar;
                ijaVar.e = apdpVar3;
                ijaVar.d = 1;
                if (apdpVar3.b(ijaVar) == aoluVar) {
                    return aoluVar;
                }
                ifvVar2 = ifvVar;
                apdpVar = apdpVar3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = (apdp) ijaVar.a;
                    try {
                        aooc.af(obj);
                        apdpVar2.d();
                        return aojh.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdpVar = ijaVar.e;
                ifvVar2 = (ifv) ijaVar.a;
                aooc.af(obj);
            }
            android.os.PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListenerM = fn$.ExternalSyntheticApiModelOutline0.m(this.d.remove(ifvVar2));
            if (powerManager$OnThermalStatusChangedListenerM != null) {
                tkl tklVar = this.c;
                ijaVar.a = apdpVar;
                ijaVar.e = null;
                ijaVar.d = 2;
                java.lang.Object objAj = aoov.aj((aolr) tklVar.d, new defpackage.okb(tklVar, powerManager$OnThermalStatusChangedListenerM, null), ijaVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            }
            apdpVar2 = apdpVar;
            apdpVar2.d();
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }
}
