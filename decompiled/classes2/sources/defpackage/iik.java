package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class iik extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.iin c;
    final /* synthetic */ ifv d;
    final /* synthetic */ ifx e;
    final /* synthetic */ aonj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iik(defpackage.iin iinVar, ifv ifvVar, ifx ifxVar, aonj aonjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = iinVar;
        this.d = ifvVar;
        this.e = ifxVar;
        this.f = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x021b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, java.util.Set] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        int i;
        int i2;
        java.util.List listBd;
        defpackage.iir iirVar;
        defpackage.iir iirVar2;
        aosy aosyVar;
        java.lang.Object objA;
        aosy aosyVar2;
        defpackage.iin iinVar;
        java.lang.Object objA2;
        java.lang.Object obj2;
        aosy aosyVar3;
        defpackage.hzb hzbVar;
        aolu aoluVar = aolu.a;
        int i3 = this.b;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 != 1) {
                java.lang.Object obj3 = this.a;
                aooc.af(obj);
                objA2 = obj;
                obj2 = obj3;
            } else {
                aooc.af(obj);
                objA = obj;
                i2 = 0;
            }
            hzbVar = (defpackage.hzb) objA2;
            if (hzbVar == null) {
                defpackage.iin.a.c().m(aioa.b).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 206, "AudioPrismCallAudioReaderImpl.kt").v("call uplink audio absent");
                return defpackage.iga.RESULT_FAILURE_AUDIO_FRAMEWORK_ERROR;
            }
            defpackage.iin iinVar2 = this.c;
            iinVar2.h = true;
            aosy aosyVarAm = aoov.am(iinVar2.c, 0, new huk(iinVar2, hzbVar, (aoln) null, 13, (byte[]) null), 3);
            iinVar2.f = aosyVarAm;
            aosyVar3 = obj2;
            aosyVar2 = aosyVarAm;
            defpackage.iin iinVar3 = this.c;
            defpackage.iij iijVar = new defpackage.iij(aosyVar3, aosyVar2, null);
            aoss aossVar = iinVar3.c;
            aosy aosyVarAm2 = aoov.am(aossVar, 0, iijVar, 3);
            ifv ifvVar = this.d;
            aonj aonjVar = this.f;
            aimz aimzVar = zih.a;
            aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.ikv((aoln) null, aosyVarAm2, iinVar3, ifvVar, aonjVar, 1));
            return defpackage.iga.RESULT_SUCCESS;
        }
        aooc.af(obj);
        aimz aimzVar2 = defpackage.iin.a;
        aimzVar2.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 165, "AudioPrismCallAudioReaderImpl.kt").v("starting with multi session support");
        defpackage.iin iinVar4 = this.c;
        ifv ifvVar2 = this.d;
        ifx ifxVar = this.e;
        int iOrdinal = ifxVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                defpackage.kvt kvtVar = iinVar4.k;
                aoin aoinVar = (aoin) ((zzx) kvtVar.b).k().get(ifvVar2);
                if (aoinVar != null) {
                    defpackage.igc igcVar = (defpackage.igc) aoinVar.a();
                    if (igcVar == null) {
                        i = 1;
                        listBd = null;
                        i2 = 0;
                    } else {
                        java.util.Set setAI = ajsz.aI((java.util.Set) kvtVar.a, ajsz.aG(igcVar));
                        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(setAI, 10));
                        java.util.Iterator it = setAI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new defpackage.kvt(defpackage.igd.AUDIO_SOURCE_DOWNLINK, (defpackage.igc) it.next()));
                            i4 = i4;
                        }
                        i = i4;
                        i2 = 0;
                        java.util.Set setCf = ajsz.cf(arrayList);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(setAI, 10));
                        java.util.Iterator it2 = setAI.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new defpackage.kvt(defpackage.igd.AUDIO_SOURCE_UPLINK, (defpackage.igc) it2.next()));
                        }
                        java.util.Set setCf2 = ajsz.cf(arrayList2);
                        defpackage.iir[] iirVarArr = new defpackage.iir[2];
                        iirVarArr[0] = new defpackage.iio(setCf);
                        iirVarArr[i] = new defpackage.iip(setCf2);
                        listBd = ajsz.bd(iirVarArr);
                    }
                } else {
                    i = 1;
                    i2 = 0;
                    listBd = null;
                }
                if (listBd != null) {
                    java.util.Iterator it3 = listBd.iterator();
                    int i5 = i2;
                    java.lang.Object obj4 = null;
                    while (true) {
                        if (!it3.hasNext()) {
                            if (i5 != 0) {
                                break;
                            }
                            break;
                        }
                        java.lang.Object next = it3.next();
                        if (((defpackage.iir) next) instanceof defpackage.iio) {
                            if (i5 == 0) {
                                obj4 = next;
                                i5 = i;
                            }
                        }
                        obj4 = null;
                        break;
                    }
                    iirVar = (defpackage.iir) obj4;
                } else {
                    iirVar = null;
                }
                if (listBd != null) {
                    java.util.Iterator it4 = listBd.iterator();
                    int i6 = i2;
                    java.lang.Object obj5 = null;
                    while (true) {
                        if (!it4.hasNext()) {
                            if (i6 != 0) {
                                break;
                            }
                            break;
                        }
                        java.lang.Object next2 = it4.next();
                        if (((defpackage.iir) next2) instanceof defpackage.iip) {
                            if (i6 == 0) {
                                obj5 = next2;
                                i6 = i;
                            }
                        }
                        obj5 = null;
                        break;
                    }
                    iirVar2 = (defpackage.iir) obj5;
                } else {
                    iirVar2 = null;
                }
                defpackage.hgu.m(ifxVar);
                int i7 = (defpackage.hgu.l(ifxVar) && iirVar2 == null) ? i : i2;
                if (iirVar == null || i7 != 0) {
                    aimzVar2.c().m(aioa.b).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 176, "AudioPrismCallAudioReaderImpl.kt").v("running feature has not provided a channel audio listener for audio data");
                    return defpackage.iga.RESULT_FAILURE_NO_LISTENER_PROVIDED;
                }
                defpackage.hgu.m(ifxVar);
                if (iinVar4.g) {
                    aimzVar2.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 197, "AudioPrismCallAudioReaderImpl.kt").v("Not starting listening to new downlink stream");
                    aosyVar = null;
                } else {
                    aimzVar2.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 182, "AudioPrismCallAudioReaderImpl.kt").v("starting listening to new downlink audio tee");
                    defpackage.igd igdVar = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                    this.b = i;
                    objA = iinVar4.a(igdVar, this);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                }
                if (defpackage.hgu.l(this.e)) {
                    iinVar = this.c;
                    if (!iinVar.h) {
                        defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 203, "AudioPrismCallAudioReaderImpl.kt").v("starting listening to new uplink audio tee");
                        defpackage.igd igdVar2 = defpackage.igd.AUDIO_SOURCE_UPLINK;
                        this.a = aosyVar;
                        this.b = 2;
                        objA2 = iinVar.a(igdVar2, this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aosyVar;
                        hzbVar = (defpackage.hzb) objA2;
                        if (hzbVar == null) {
                            defpackage.iin.a.c().m(aioa.b).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 206, "AudioPrismCallAudioReaderImpl.kt").v("call uplink audio absent");
                            return defpackage.iga.RESULT_FAILURE_AUDIO_FRAMEWORK_ERROR;
                        }
                        defpackage.iin iinVar5 = this.c;
                        iinVar5.h = true;
                        aosy aosyVarAm3 = aoov.am(iinVar5.c, 0, new huk(iinVar5, hzbVar, (aoln) null, 13, (byte[]) null), 3);
                        iinVar5.f = aosyVarAm3;
                        aosyVar3 = obj2;
                        aosyVar2 = aosyVarAm3;
                    }
                    defpackage.iin iinVar6 = this.c;
                    defpackage.iij iijVar2 = new defpackage.iij(aosyVar3, aosyVar2, null);
                    aoss aossVar2 = iinVar6.c;
                    aosy aosyVarAm4 = aoov.am(aossVar2, 0, iijVar2, 3);
                    ifv ifvVar3 = this.d;
                    aonj aonjVar2 = this.f;
                    aimz aimzVar3 = zih.a;
                    aoov.al(aossVar2, zih.b.plus(aols.a), 1, new defpackage.ikv((aoln) null, aosyVarAm4, iinVar6, ifvVar3, aonjVar2, 1));
                    return defpackage.iga.RESULT_SUCCESS;
                }
                defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 219, "AudioPrismCallAudioReaderImpl.kt").v("Not starting listening to new uplink stream");
                aosyVar2 = null;
                aosyVar3 = aosyVar;
                defpackage.iin iinVar7 = this.c;
                defpackage.iij iijVar3 = new defpackage.iij(aosyVar3, aosyVar2, null);
                aoss aossVar3 = iinVar7.c;
                aosy aosyVarAm5 = aoov.am(aossVar3, 0, iijVar3, 3);
                ifv ifvVar4 = this.d;
                aonj aonjVar3 = this.f;
                aimz aimzVar4 = zih.a;
                aoov.al(aossVar3, zih.b.plus(aols.a), 1, new defpackage.ikv((aoln) null, aosyVarAm5, iinVar7, ifvVar4, aonjVar3, 1));
                return defpackage.iga.RESULT_SUCCESS;
            }
            if (iOrdinal != 3) {
                throw new aois();
            }
        }
        throw new java.lang.IllegalArgumentException("Unrecognized streaming type");
        defpackage.hzb hzbVar2 = (defpackage.hzb) objA;
        if (hzbVar2 == null) {
            defpackage.iin.a.c().m(aioa.b).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 185, "AudioPrismCallAudioReaderImpl.kt").v("call downlink audio absent");
            return defpackage.iga.RESULT_FAILURE_AUDIO_FRAMEWORK_ERROR;
        }
        defpackage.iin iinVar8 = this.c;
        iinVar8.g = true;
        aosy aosyVarAm6 = aoov.am(iinVar8.c, i2, new huk(iinVar8, hzbVar2, (aoln) null, 12), 3);
        iinVar8.e = aosyVarAm6;
        aosyVar = aosyVarAm6;
        if (defpackage.hgu.l(this.e)) {
            iinVar = this.c;
            if (!iinVar.h) {
                defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 203, "AudioPrismCallAudioReaderImpl.kt").v("starting listening to new uplink audio tee");
                defpackage.igd igdVar3 = defpackage.igd.AUDIO_SOURCE_UPLINK;
                this.a = aosyVar;
                this.b = 2;
                objA2 = iinVar.a(igdVar3, this);
                if (objA2 != aoluVar) {
                    return aoluVar;
                }
                obj2 = aosyVar;
                hzbVar = (defpackage.hzb) objA2;
                if (hzbVar == null) {
                    defpackage.iin.a.c().m(aioa.b).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 206, "AudioPrismCallAudioReaderImpl.kt").v("call uplink audio absent");
                    return defpackage.iga.RESULT_FAILURE_AUDIO_FRAMEWORK_ERROR;
                }
                defpackage.iin iinVar9 = this.c;
                iinVar9.h = true;
                aosy aosyVarAm7 = aoov.am(iinVar9.c, 0, new huk(iinVar9, hzbVar, (aoln) null, 13, (byte[]) null), 3);
                iinVar9.f = aosyVarAm7;
                aosyVar3 = obj2;
                aosyVar2 = aosyVarAm7;
            }
            defpackage.iin iinVar10 = this.c;
            defpackage.iij iijVar4 = new defpackage.iij(aosyVar3, aosyVar2, null);
            aoss aossVar4 = iinVar10.c;
            aosy aosyVarAm8 = aoov.am(aossVar4, 0, iijVar4, 3);
            ifv ifvVar5 = this.d;
            aonj aonjVar4 = this.f;
            aimz aimzVar5 = zih.a;
            aoov.al(aossVar4, zih.b.plus(aols.a), 1, new defpackage.ikv((aoln) null, aosyVarAm8, iinVar10, ifvVar5, aonjVar4, 1));
            return defpackage.iga.RESULT_SUCCESS;
        }
        defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "startWithMultiSessionSupport$<anonymous>", 219, "AudioPrismCallAudioReaderImpl.kt").v("Not starting listening to new uplink stream");
        aosyVar2 = null;
        aosyVar3 = aosyVar;
        defpackage.iin iinVar11 = this.c;
        defpackage.iij iijVar5 = new defpackage.iij(aosyVar3, aosyVar2, null);
        aoss aossVar5 = iinVar11.c;
        aosy aosyVarAm9 = aoov.am(aossVar5, 0, iijVar5, 3);
        ifv ifvVar6 = this.d;
        aonj aonjVar5 = this.f;
        aimz aimzVar6 = zih.a;
        aoov.al(aossVar5, zih.b.plus(aols.a), 1, new defpackage.ikv((aoln) null, aosyVarAm9, iinVar11, ifvVar6, aonjVar5, 1));
        return defpackage.iga.RESULT_SUCCESS;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.iik(this.c, this.d, this.e, this.f, aolnVar);
    }
}
