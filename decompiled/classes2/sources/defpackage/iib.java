package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class iib extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.iif f;
    final /* synthetic */ ifw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iib(defpackage.iif iifVar, ifw ifwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = iifVar;
        this.g = ifwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00be  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:29:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Boolean bool;
        java.lang.Object objD;
        java.lang.Object obj2;
        ifw ifwVar;
        defpackage.iif iifVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        ajcq ajcqVarH;
        ifw ifwVar2;
        java.lang.Object obj7;
        java.lang.Object obj8;
        ajcq ajcqVarG;
        aolu aoluVar = aolu.a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
            } else if (i == 2) {
                aooc.af(obj);
                bool = (java.lang.Boolean) obj;
                ajcq ajcqVarB = this.f.d.b();
                this.a = bool;
                this.e = 3;
                objD = aosv.D(ajcqVarB, this);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                obj2 = bool;
                obj = objD;
                ifwVar = this.g;
                iifVar = this.f;
                obj3 = (java.lang.Boolean) obj;
                if ((ifwVar.b & 1) != 0) {
                    defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>$<anonymous>", 62, "AudioPrismAudioStateConfigApplierImpl.kt").y("applyUplinkMuteState: %b", java.lang.Boolean.valueOf(ifwVar.c));
                    ajcqVarH = iifVar.e.h(ifwVar.c);
                    this.a = obj2;
                    this.b = obj3;
                    this.c = iifVar;
                    this.d = ifwVar;
                    this.e = 4;
                    if (aosv.D(ajcqVarH, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj4 = obj2;
                obj5 = ifwVar;
                obj6 = iifVar;
                ifwVar2 = (ifw) obj5;
                if ((ifwVar2.b & 2) != 0) {
                    defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>$<anonymous>", 66, "AudioPrismAudioStateConfigApplierImpl.kt").y("applyDownlinkMuteState: %b", java.lang.Boolean.valueOf(ifwVar2.d));
                    ajcqVarG = ((defpackage.iif) obj6).e.g(ifwVar2.d);
                    this.a = obj4;
                    this.b = obj3;
                    this.c = null;
                    this.d = null;
                    this.e = 5;
                    if (aosv.D(ajcqVarG, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj7 = obj3;
                obj8 = obj4;
            } else if (i == 3) {
                obj2 = this.a;
                aooc.af(obj);
                ifwVar = this.g;
                iifVar = this.f;
                obj3 = (java.lang.Boolean) obj;
                if ((ifwVar.b & 1) != 0) {
                    defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>$<anonymous>", 62, "AudioPrismAudioStateConfigApplierImpl.kt").y("applyUplinkMuteState: %b", java.lang.Boolean.valueOf(ifwVar.c));
                    ajcqVarH = iifVar.e.h(ifwVar.c);
                    this.a = obj2;
                    this.b = obj3;
                    this.c = iifVar;
                    this.d = ifwVar;
                    this.e = 4;
                    if (aosv.D(ajcqVarH, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj4 = obj2;
                obj5 = ifwVar;
                obj6 = iifVar;
                ifwVar2 = (ifw) obj5;
                if ((ifwVar2.b & 2) != 0) {
                    defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>$<anonymous>", 66, "AudioPrismAudioStateConfigApplierImpl.kt").y("applyDownlinkMuteState: %b", java.lang.Boolean.valueOf(ifwVar2.d));
                    ajcqVarG = ((defpackage.iif) obj6).e.g(ifwVar2.d);
                    this.a = obj4;
                    this.b = obj3;
                    this.c = null;
                    this.d = null;
                    this.e = 5;
                    if (aosv.D(ajcqVarG, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj7 = obj3;
                obj8 = obj4;
            } else if (i != 4) {
                obj7 = this.b;
                obj8 = this.a;
                aooc.af(obj);
            } else {
                obj5 = this.d;
                obj6 = this.c;
                java.lang.Object obj9 = this.b;
                obj4 = this.a;
                aooc.af(obj);
                obj3 = obj9;
                ifwVar2 = (ifw) obj5;
                if ((ifwVar2.b & 2) != 0) {
                    defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>$<anonymous>", 66, "AudioPrismAudioStateConfigApplierImpl.kt").y("applyDownlinkMuteState: %b", java.lang.Boolean.valueOf(ifwVar2.d));
                    ajcqVarG = ((defpackage.iif) obj6).e.g(ifwVar2.d);
                    this.a = obj4;
                    this.b = obj3;
                    this.c = null;
                    this.d = null;
                    this.e = 5;
                    if (aosv.D(ajcqVarG, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj7 = obj3;
                obj8 = obj4;
            }
            defpackage.iif iifVar2 = this.f;
            aooh.c(obj8);
            boolean zBooleanValue = ((java.lang.Boolean) obj8).booleanValue();
            aooh.c(obj7);
            iifVar2.c = new defpackage.ihz(new defpackage.ihy(zBooleanValue, ((java.lang.Boolean) obj7).booleanValue()), this.g);
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>", 45, "AudioPrismAudioStateConfigApplierImpl.kt").v("starting to get next active call audio");
        defpackage.iif iifVar3 = this.f;
        java.lang.Object objA = iifVar3.b.a();
        aooh.e(objA, "get(...)");
        ajcq ajcqVarA = iifVar3.d.a(((java.lang.Number) objA).longValue());
        this.e = 1;
        obj = aosv.D(ajcqVarA, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        j$.util.Optional optional = (j$.util.Optional) obj;
        defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>", 48, "AudioPrismAudioStateConfigApplierImpl.kt").y("next call audio result: %b", java.lang.Boolean.valueOf(optional.isPresent()));
        if (!optional.isPresent()) {
            throw new java.lang.IllegalStateException("AudioProcessingStarted assumed ready but no call audio available.");
        }
        ajcq ajcqVarC = this.f.d.c();
        this.e = 2;
        obj = aosv.D(ajcqVarC, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        bool = (java.lang.Boolean) obj;
        ajcq ajcqVarB2 = this.f.d.b();
        this.a = bool;
        this.e = 3;
        objD = aosv.D(ajcqVarB2, this);
        if (objD != aoluVar) {
            return aoluVar;
        }
        obj2 = bool;
        obj = objD;
        ifwVar = this.g;
        iifVar = this.f;
        obj3 = (java.lang.Boolean) obj;
        if ((ifwVar.b & 1) != 0) {
            defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>$<anonymous>", 62, "AudioPrismAudioStateConfigApplierImpl.kt").y("applyUplinkMuteState: %b", java.lang.Boolean.valueOf(ifwVar.c));
            ajcqVarH = iifVar.e.h(ifwVar.c);
            this.a = obj2;
            this.b = obj3;
            this.c = iifVar;
            this.d = ifwVar;
            this.e = 4;
            if (aosv.D(ajcqVarH, this) == aoluVar) {
                return aoluVar;
            }
        }
        obj4 = obj2;
        obj5 = ifwVar;
        obj6 = iifVar;
        ifwVar2 = (ifw) obj5;
        if ((ifwVar2.b & 2) != 0) {
            defpackage.iif.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismAudioStateConfigApplierImpl", "apply$<anonymous>$<anonymous>$<anonymous>", 66, "AudioPrismAudioStateConfigApplierImpl.kt").y("applyDownlinkMuteState: %b", java.lang.Boolean.valueOf(ifwVar2.d));
            ajcqVarG = ((defpackage.iif) obj6).e.g(ifwVar2.d);
            this.a = obj4;
            this.b = obj3;
            this.c = null;
            this.d = null;
            this.e = 5;
            if (aosv.D(ajcqVarG, this) == aoluVar) {
                return aoluVar;
            }
        }
        obj7 = obj3;
        obj8 = obj4;
        defpackage.iif iifVar4 = this.f;
        aooh.c(obj8);
        boolean zBooleanValue2 = ((java.lang.Boolean) obj8).booleanValue();
        aooh.c(obj7);
        iifVar4.c = new defpackage.ihz(new defpackage.ihy(zBooleanValue2, ((java.lang.Boolean) obj7).booleanValue()), this.g);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.iib(this.f, this.g, aolnVar);
    }
}
