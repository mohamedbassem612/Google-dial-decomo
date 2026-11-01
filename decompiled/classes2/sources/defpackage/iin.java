package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iin {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl");
    public final defpackage.mfz b;
    public final aoss c;
    public final aolr d;
    public aosy e;
    public aosy f;
    public boolean g;
    public boolean h;
    public final j$.util.concurrent.ConcurrentHashMap i;
    public final ahda j;
    public final defpackage.kvt k;
    private final ajct l;
    private final defpackage.inw m;
    private final defpackage.inw n;
    private final defpackage.idh o;

    public iin(defpackage.inw inwVar, defpackage.inw inwVar2, defpackage.idh idhVar, aazc aazcVar, defpackage.kvt kvtVar, defpackage.mfz mfzVar, aoss aossVar, ajct ajctVar, aolr aolrVar) {
        aooh.f(idhVar, "tidepodsCallAudio");
        aooh.f(aazcVar, "clock");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajctVar, "backgroundExecutor");
        aooh.f(aolrVar, "lightweightContext");
        this.m = inwVar;
        this.n = inwVar2;
        this.o = idhVar;
        this.k = kvtVar;
        this.b = mfzVar;
        this.c = aossVar;
        this.l = ajctVar;
        this.d = aolrVar;
        this.j = new ahda((byte[]) null);
        this.i = new j$.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [iin] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v5 */
    public final java.lang.Object a(defpackage.igd igdVar, aoln aolnVar) {
        defpackage.iih iihVar;
        ahoq ahoqVar;
        ahoq ahoqVar2;
        defpackage.hzb hzbVar;
        if (aolnVar instanceof defpackage.iih) {
            iihVar = (defpackage.iih) aolnVar;
            int i = iihVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iihVar.c = i - Integer.MIN_VALUE;
            } else {
                iihVar = new defpackage.iih(this, aolnVar);
            }
        } else {
            iihVar = new defpackage.iih(this, aolnVar);
        }
        java.lang.Object obj = iihVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iihVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                if (!ahvr.R(iihVar.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                ahoq ahoqVarZ = ahvr.Z(117, "AudioPrismCallAudioReaderDuolinksImpl_createAudioTee");
                try {
                    a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "createAudioTee$<anonymous>", 429, "AudioPrismCallAudioReaderImpl.kt").v("starting to get next active call audio");
                    int iOrdinal = igdVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            ajcq ajcqVarA = this.o.a(j$.time.Duration.ofSeconds(5L));
                            iihVar.d = ahoqVarZ;
                            iihVar.c = 1;
                            java.lang.Object objD = aosv.D(ajcqVarA, iihVar);
                            if (objD == aoluVar) {
                                return aoluVar;
                            }
                            obj = objD;
                            ahoqVar = ahoqVarZ;
                            aooh.e(obj, "await(...)");
                            hzbVar = (defpackage.hzb) aooh.q((j$.util.Optional) obj);
                            this = ahoqVar;
                        } else if (iOrdinal == 2) {
                            ajcq ajcqVarB = this.o.b(j$.time.Duration.ofSeconds(5L));
                            iihVar.d = ahoqVarZ;
                            iihVar.c = 2;
                            java.lang.Object objD2 = aosv.D(ajcqVarB, iihVar);
                            if (objD2 == aoluVar) {
                                return aoluVar;
                            }
                            obj = objD2;
                            ahoqVar2 = ahoqVarZ;
                            aooh.e(obj, "await(...)");
                            hzbVar = (defpackage.hzb) aooh.q((j$.util.Optional) obj);
                            this = ahoqVar2;
                        } else if (iOrdinal != 3) {
                            throw new aois();
                        }
                    }
                    throw new java.lang.IllegalArgumentException("Unspecified StreamingType");
                } catch (java.lang.Throwable th) {
                    th = th;
                    this = ahoqVarZ;
                }
            } else if (i2 == 1) {
                ahoq ahoqVar3 = iihVar.d;
                aooc.af(obj);
                ahoqVar = ahoqVar3;
                aooh.e(obj, "await(...)");
                hzbVar = (defpackage.hzb) aooh.q((j$.util.Optional) obj);
                this = ahoqVar;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ahoq ahoqVar4 = iihVar.d;
                aooc.af(obj);
                ahoqVar2 = ahoqVar4;
                aooh.e(obj, "await(...)");
                hzbVar = (defpackage.hzb) aooh.q((j$.util.Optional) obj);
                this = ahoqVar2;
            }
            defpackage.hzb hzbVar2 = hzbVar;
            if (hzbVar2 != null) {
                ajsz.ak((java.io.Closeable) this, (java.lang.Throwable) null);
                return hzbVar2;
            }
            a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "createAudioTee$<anonymous>", 452, "AudioPrismCallAudioReaderImpl.kt").v("could not create AudioTee");
            ajsz.ak((java.io.Closeable) this, (java.lang.Throwable) null);
            return null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            throw th;
        } catch (java.lang.Throwable th3) {
            ajsz.ak((java.io.Closeable) this, th);
            throw th3;
        }
    }

    public final java.lang.Object b(ifv ifvVar, ifz ifzVar, defpackage.igg iggVar, aoln aolnVar) {
        return ahvr.ag(this.c, this.j, new defpackage.blv(this, ifzVar, ifvVar, iggVar, (aoln) null, 7)).a(aolnVar);
    }

    public final java.lang.Object c(ifx ifxVar, ifv ifvVar, aonj aonjVar, aoln aolnVar) {
        return aoov.aj(this.d, new defpackage.iik(this, ifvVar, ifxVar, aonjVar, null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aosy aosyVar, defpackage.igd igdVar, aoln aolnVar) {
        defpackage.iim iimVar;
        if (aolnVar instanceof defpackage.iim) {
            iimVar = (defpackage.iim) aolnVar;
            int i = iimVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iimVar.c = i - Integer.MIN_VALUE;
            } else {
                iimVar = new defpackage.iim(this, aolnVar);
            }
        } else {
            iimVar = new defpackage.iim(this, aolnVar);
        }
        java.lang.Object objA = iimVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iimVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objA);
                iimVar.d = igdVar;
                iimVar.c = 1;
                objA = aosyVar.a(iimVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                igdVar = iimVar.d;
                aooc.af(objA);
            }
            a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stopReadingAudio", 420, "AudioPrismCallAudioReaderImpl.kt").I("stopped reading %s call audio with result: %s", igdVar.name(), ((defpackage.hxb) objA).name());
        } catch (java.lang.Throwable th) {
            a.b().k(th).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "stopReadingAudio", 422, "AudioPrismCallAudioReaderImpl.kt").v("stopped reading call audio due to an exception");
        }
        defpackage.inw inwVarF = f(igdVar);
        com.google.audio.hearing.common.resample.QResampler qResampler = inwVarF.a;
        if (qResampler != null) {
            qResampler.a();
        }
        inwVarF.a = null;
        return aojh.a;
    }

    public final boolean e(ifv ifvVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : this.i.entrySet()) {
            if (entry.getKey() != ifvVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Collection collectionValues = linkedHashMap.values();
        if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
            return false;
        }
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ify ifyVar = ((ifz) it.next()).c;
            if (ifyVar == null) {
                ifyVar = ify.a;
            }
            ifx ifxVarB = ifx.b(ifyVar.b);
            if (ifxVarB == null) {
                ifxVarB = ifx.d;
            }
            if (ifxVarB == ifx.b || ifxVarB == ifx.c) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.inw f(defpackage.igd igdVar) {
        int iOrdinal = igdVar.ordinal();
        return (iOrdinal == 1 || iOrdinal != 2) ? this.m : this.n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(final defpackage.igd igdVar, final defpackage.hzb hzbVar, aoln aolnVar) {
        defpackage.iii iiiVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.iii) {
            iiiVar = (defpackage.iii) aolnVar;
            int i = iiiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iiiVar.c = i - Integer.MIN_VALUE;
            } else {
                iiiVar = new defpackage.iii(this, aolnVar);
            }
        } else {
            iiiVar = new defpackage.iii(this, aolnVar);
        }
        java.lang.Object obj = iiiVar.a;
        defpackage.hxb hxbVar = aolu.a;
        int i2 = iiiVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(iiiVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(118, "AudioPrismCallAudioReaderDuolinksImpl_readAudioFromTee");
            try {
                ajcq ajcqVarB = hzbVar.b(4096, new defpackage.hxa() { // from class: iig
                    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Iterable, java.lang.Object] */
                    @Override // defpackage.hxa
                    public final defpackage.hwz a(akzc akzcVar, int i3) throws aois {
                        defpackage.iir iioVar;
                        defpackage.igd igdVar2 = igdVar;
                        aooh.f(igdVar2, "audioSource");
                        int iOrdinal = igdVar2.ordinal();
                        defpackage.iin iinVar = this.a;
                        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = iinVar.i;
                        defpackage.kvt kvtVar = iinVar.k;
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                java.lang.Object obj2 = kvtVar.b;
                                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                                    ify ifyVar = ((ifz) entry.getValue()).c;
                                    if (ifyVar == null) {
                                        ifyVar = ify.a;
                                    }
                                    ifx ifxVarB = ifx.b(ifyVar.b);
                                    if (ifxVarB == null) {
                                        ifxVarB = ifx.d;
                                    }
                                    if (ifxVarB == ifx.b) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
                                java.util.Iterator it = linkedHashMap.entrySet().iterator();
                                while (it.hasNext()) {
                                    arrayList.add((ifv) ((java.util.Map.Entry) it.next()).getKey());
                                }
                                zzx zzxVar = (zzx) obj2;
                                java.util.List listBT = ajsz.bT(ajsz.bT(defpackage.kvt.o(zzxVar, arrayList), defpackage.kvt.o(zzxVar, defpackage.kvt.g(concurrentHashMap))), (java.lang.Iterable) kvtVar.a);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(listBT, 10));
                                java.util.Iterator it2 = listBT.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new defpackage.kvt(defpackage.igd.AUDIO_SOURCE_DOWNLINK, (defpackage.igc) it2.next()));
                                }
                                iioVar = new defpackage.iio(ajsz.cf(arrayList2));
                            } else if (iOrdinal == 2) {
                                java.util.List listBT2 = ajsz.bT(defpackage.kvt.o((zzx) kvtVar.b, defpackage.kvt.g(concurrentHashMap)), (java.lang.Iterable) kvtVar.a);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(listBT2, 10));
                                java.util.Iterator it3 = listBT2.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(new defpackage.kvt(defpackage.igd.AUDIO_SOURCE_UPLINK, (defpackage.igc) it3.next()));
                                }
                                iioVar = new defpackage.iip(ajsz.cf(arrayList3));
                            } else if (iOrdinal != 3) {
                                throw new aois();
                            }
                            int iOrdinal2 = igdVar2.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    if (iOrdinal2 != 2) {
                                        if (iOrdinal2 != 3) {
                                            throw new aois();
                                        }
                                    } else if (!iinVar.h) {
                                        return defpackage.hwz.b;
                                    }
                                } else if (!iinVar.g) {
                                    return defpackage.hwz.b;
                                }
                                defpackage.hzb hzbVar2 = hzbVar;
                                defpackage.iin.a.b().g(10, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "readAudioFromTee$<anonymous>$<anonymous>", 496, "AudioPrismCallAudioReaderImpl.kt").z("resampling audio from %d, to %d", hzbVar2.b.getSampleRate(), 16000);
                                akzc akzcVarA = iinVar.f(igdVar2).a(akzcVar, hzbVar2.b.getSampleRate(), 16000);
                                defpackage.heq heqVarK = defpackage.hhb.k(defpackage.igb.a.m());
                                heqVarK.x(akzcVarA);
                                akzx akzxVar = (akzx) heqVarK.a;
                                akzxVar.u();
                                ((defpackage.igb) akzxVar.b).d = 16000;
                                int iM = fn$.ExternalSyntheticApiModelOutline0.m(hzbVar2.b);
                                akzxVar.u();
                                defpackage.igb igbVar = (defpackage.igb) akzxVar.b;
                                igbVar.b |= 2;
                                igbVar.e = iM;
                                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                akzxVar.u();
                                ((defpackage.igb) akzxVar.b).f = jElapsedRealtime;
                                defpackage.igb igbVarW = heqVarK.w();
                                aimz aimzVar = zih.a;
                                aoov.al(iinVar.c, zih.b.plus(aols.a), 1, new defpackage.blj((aoln) null, iioVar, igbVarW, 10));
                                return defpackage.hwz.a;
                            }
                            throw new java.lang.IllegalStateException("Invalid audio source");
                        }
                        throw new java.lang.IllegalStateException("Invalid audio source");
                    }
                }, this.l);
                aooh.e(ajcqVarB, "read(...)");
                iiiVar.d = ahoqVarZ;
                iiiVar.c = 1;
                java.lang.Object objD = aosv.D(ajcqVarB, iiiVar);
                if (objD != hxbVar) {
                    obj = objD;
                    ahoqVar = ahoqVarZ;
                }
                return hxbVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = iiiVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        hxbVar = (defpackage.hxb) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        aooh.e(hxbVar, "suspendableSpan(...)");
        return hxbVar;
    }
}
