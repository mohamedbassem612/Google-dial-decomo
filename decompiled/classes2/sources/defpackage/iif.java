package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iif {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl");
    public final aoin b;
    public defpackage.ihz c;
    public final defpackage.ibd d;
    public final defpackage.idh e;
    private final aolr f;
    private final apdp g;

    public iif(aolr aolrVar, defpackage.ibd ibdVar, defpackage.idh idhVar, aoin aoinVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ibdVar, "callAudioManager");
        aooh.f(idhVar, "tidepodsCallAudio");
        aooh.f(aoinVar, "getCallAudioTimeoutMillis");
        this.f = aolrVar;
        this.d = ibdVar;
        this.e = idhVar;
        this.b = aoinVar;
        this.g = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(ifw ifwVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.iia iiaVar;
        ifw ifwVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.iia) {
            iiaVar = (defpackage.iia) aolnVar;
            int i = iiaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iiaVar.d = i - Integer.MIN_VALUE;
            } else {
                iiaVar = new defpackage.iia(this, aolnVar);
            }
        } else {
            iiaVar = new defpackage.iia(this, aolnVar);
        }
        java.lang.Object obj = iiaVar.b;
        aolu aoluVar = aolu.a;
        int i2 = iiaVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.g;
                iiaVar.a = ifwVar;
                iiaVar.e = apdpVar3;
                iiaVar.d = 1;
                if (apdpVar3.b(iiaVar) == aoluVar) {
                    return aoluVar;
                }
                ifwVar2 = ifwVar;
                apdpVar = apdpVar3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = (apdp) iiaVar.a;
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
                apdpVar = iiaVar.e;
                ifwVar2 = (ifw) iiaVar.a;
                aooc.af(obj);
            }
            aolr aolrVar = this.f;
            defpackage.iib iibVar = new defpackage.iib(this, ifwVar2, null);
            iiaVar.a = apdpVar;
            iiaVar.e = null;
            iiaVar.d = 2;
            if (aoov.aj(aolrVar, iibVar, iiaVar) == aoluVar) {
                return aoluVar;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.ihy ihyVar, aoln aolnVar) {
        defpackage.iic iicVar;
        if (aolnVar instanceof defpackage.iic) {
            iicVar = (defpackage.iic) aolnVar;
            int i = iicVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iicVar.c = i - Integer.MIN_VALUE;
            } else {
                iicVar = new defpackage.iic(this, aolnVar);
            }
        } else {
            iicVar = new defpackage.iic(this, aolnVar);
        }
        java.lang.Object obj = iicVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iicVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                boolean z = ihyVar.b;
                a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "restoreDownlinkMuteState", 120, "AudioPrismAudioStateConfigApplierImpl.kt").y("restoring downlink: %s", true != z ? "unmuting" : "muting");
                ajcq ajcqVarG = this.e.g(z);
                iicVar.c = 1;
                if (aosv.D(ajcqVarG, iicVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
        } catch (defpackage.hxd e) {
            a.b().k(e).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "restoreDownlinkMuteState", 125, "AudioPrismAudioStateConfigApplierImpl.kt").v("failed to restore downlink mute state");
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) throws java.lang.Throwable {
        defpackage.iid iidVar;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.iid) {
            iidVar = (defpackage.iid) aolnVar;
            int i = iidVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iidVar.c = i - Integer.MIN_VALUE;
            } else {
                iidVar = new defpackage.iid(this, aolnVar);
            }
        } else {
            iidVar = new defpackage.iid(this, aolnVar);
        }
        java.lang.Object obj = iidVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iidVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.g;
                iidVar.d = apdpVar;
                iidVar.c = 1;
                if (apdpVar.b(iidVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = iidVar.d;
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
                apdp apdpVar3 = iidVar.d;
                aooc.af(obj);
                apdpVar = apdpVar3;
            }
            aolr aolrVar = this.f;
            defpackage.hnj hnjVar = new defpackage.hnj(this, (aoln) null, 3);
            iidVar.d = apdpVar;
            iidVar.c = 2;
            if (aoov.aj(aolrVar, hnjVar, iidVar) == aoluVar) {
                return aoluVar;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.ihy ihyVar, aoln aolnVar) {
        defpackage.iie iieVar;
        if (aolnVar instanceof defpackage.iie) {
            iieVar = (defpackage.iie) aolnVar;
            int i = iieVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iieVar.c = i - Integer.MIN_VALUE;
            } else {
                iieVar = new defpackage.iie(this, aolnVar);
            }
        } else {
            iieVar = new defpackage.iie(this, aolnVar);
        }
        java.lang.Object obj = iieVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iieVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                boolean z = ihyVar.a;
                a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "restoreUplinkMuteState", 108, "AudioPrismAudioStateConfigApplierImpl.kt").y("restoring uplink: %s", true != z ? "unmuting" : "muting");
                ajcq ajcqVarH = this.e.h(z);
                iieVar.c = 1;
                if (aosv.D(ajcqVarH, iieVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
        } catch (defpackage.hxd e) {
            a.b().k(e).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "restoreUplinkMuteState", 113, "AudioPrismAudioStateConfigApplierImpl.kt").v("failed to restore uplink mute state");
        }
        return aojh.a;
    }
}
