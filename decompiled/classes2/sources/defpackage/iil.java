package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iil extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.iin b;
    final /* synthetic */ ifv c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iil(defpackage.iin iinVar, ifv ifvVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = iinVar;
        this.c = ifvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        aolu aoluVar;
        aokc<aoiu> aokcVarAY;
        aolu aoluVar2 = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aoss aossVar = (aoss) this.d;
            defpackage.iin iinVar = this.b;
            ifv ifvVar = this.c;
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = iinVar.i;
            ifz ifzVar = (ifz) concurrentHashMap.get(ifvVar);
            if (ifzVar == null) {
                defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 299, "AudioPrismCallAudioReaderImpl.kt").v("skip: not running");
                return aojh.a;
            }
            aosy aosyVar = iinVar.e;
            aosy aosyVar2 = iinVar.f;
            ify ifyVar = ifzVar.c;
            if (ifyVar == null) {
                ifyVar = ify.a;
            }
            ifx ifxVarB = ifx.b(ifyVar.b);
            if (ifxVarB == null) {
                ifxVarB = ifx.d;
            }
            int iOrdinal = ifxVarB.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    aoluVar = aoluVar2;
                    if (aosyVar == null) {
                        aokcVarAY = aokc.a;
                    } else if (iinVar.e(ifvVar)) {
                        defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 318, "AudioPrismCallAudioReaderImpl.kt").v("not stopping downlink audio tee because another feature is using it");
                        aokcVarAY = aokc.a;
                    } else {
                        defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 311, "AudioPrismCallAudioReaderImpl.kt").v("stopping downlink");
                        iinVar.g = false;
                        iinVar.e = null;
                        aokcVarAY = ajsz.aY(new aoiu(defpackage.igd.AUDIO_SOURCE_DOWNLINK, aosyVar));
                    }
                } else if (iOrdinal == 2) {
                    aokcVarAY = new java.util.ArrayList();
                    if (aosyVar2 != null) {
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (entry.getKey() != ifvVar) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                aoluVar2 = aoluVar2;
                            }
                        }
                        aoluVar = aoluVar2;
                        java.util.Collection collectionValues = linkedHashMap.values();
                        if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                            java.util.Iterator it = collectionValues.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ify ifyVar2 = ((ifz) it.next()).c;
                                    if (ifyVar2 == null) {
                                        ifyVar2 = ify.a;
                                    }
                                    ifx ifxVarB2 = ifx.b(ifyVar2.b);
                                    if (ifxVarB2 == null) {
                                        ifxVarB2 = ifx.d;
                                    }
                                    if (ifxVarB2 == ifx.c) {
                                    }
                                }
                            }
                        }
                        defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 329, "AudioPrismCallAudioReaderImpl.kt").v("stopping uplink");
                        iinVar.h = false;
                        iinVar.f = null;
                        aokcVarAY.add(new aoiu(defpackage.igd.AUDIO_SOURCE_UPLINK, aosyVar2));
                        if (aosyVar != null || iinVar.e(ifvVar)) {
                            defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 353, "AudioPrismCallAudioReaderImpl.kt").v("not stopping downlink audio tee because another feature is using it");
                        } else {
                            defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 344, "AudioPrismCallAudioReaderImpl.kt").v("stopping downlink");
                            iinVar.g = false;
                            iinVar.e = null;
                            aokcVarAY.add(new aoiu(defpackage.igd.AUDIO_SOURCE_DOWNLINK, aosyVar));
                        }
                    } else {
                        aoluVar = aoluVar2;
                    }
                    defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 338, "AudioPrismCallAudioReaderImpl.kt").v("not stopping uplink audio tee because another feature is using it");
                    if (aosyVar != null) {
                        defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 353, "AudioPrismCallAudioReaderImpl.kt").v("not stopping downlink audio tee because another feature is using it");
                    } else {
                        defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stop$<anonymous>$<anonymous>", 353, "AudioPrismCallAudioReaderImpl.kt").v("not stopping downlink audio tee because another feature is using it");
                    }
                } else if (iOrdinal != 3) {
                    throw new aois();
                }
                concurrentHashMap.remove(ifvVar);
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aokcVarAY, 10));
                for (aoiu aoiuVar : aokcVarAY) {
                    arrayList.add(aoov.am(aossVar, 0, new defpackage.hyq(iinVar, (aosy) aoiuVar.b, (defpackage.igd) aoiuVar.a, (aoln) null, 2), 3));
                }
                this.a = 1;
                java.lang.Object objV = aooh.v(arrayList, this);
                aolu aoluVar3 = aoluVar;
                if (objV == aoluVar3) {
                    return aoluVar3;
                }
            }
            throw new java.lang.IllegalStateException("invalid streaming type");
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.iil iilVar = new defpackage.iil(this.b, this.c, aolnVar);
        iilVar.d = obj;
        return iilVar;
    }
}
