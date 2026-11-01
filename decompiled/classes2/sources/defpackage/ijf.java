package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijf {
    private static final aimz a = aimz.i("com/android/dialer/audioprism/internal/duolinks/impl/AudioPrismDuolinksAvailabilityImpl");
    private final ruc b;
    private final qbe c;
    private final defpackage.idh d;
    private final twp e;
    private final defpackage.ijq f;

    public ijf(qbe qbeVar, ruc rucVar, defpackage.idh idhVar, twp twpVar, defpackage.ijq ijqVar) {
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(rucVar, "metrics");
        aooh.f(idhVar, "tidepodsCallAudio");
        aooh.f(ijqVar, "audioPrismRunningFeatures");
        this.c = qbeVar;
        this.b = rucVar;
        this.d = idhVar;
        this.e = twpVar;
        this.f = ijqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(igf igfVar, aoln aolnVar) {
        defpackage.ijc ijcVar;
        aeun aeunVar;
        if (aolnVar instanceof defpackage.ijc) {
            ijcVar = (defpackage.ijc) aolnVar;
            int i = ijcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijcVar.c = i - Integer.MIN_VALUE;
            } else {
                ijcVar = new defpackage.ijc(this, aolnVar);
            }
        } else {
            ijcVar = new defpackage.ijc(this, aolnVar);
        }
        java.lang.Object obj = ijcVar.a;
        defpackage.igg iggVar = aolu.a;
        int i2 = ijcVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalA = this.b.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar2 = (aeun) aooh.q(optionalA);
            ijcVar.d = aeunVar2;
            ijcVar.c = 1;
            java.lang.Object objB = b(igfVar, ijcVar);
            if (objB != iggVar) {
                obj = objB;
                aeunVar = aeunVar2;
            }
            return iggVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aeunVar = ijcVar.d;
        aooc.af(obj);
        iggVar = (defpackage.igg) obj;
        if (aeunVar != null) {
            this.b.p(aeunVar, ruc.bO);
        }
        return iggVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object b(igf igfVar, aoln aolnVar) {
        defpackage.ije ijeVar;
        igf igfVar2;
        long jLongValue;
        long j;
        long jLongValue2;
        aimz aimzVar;
        if (aolnVar instanceof defpackage.ije) {
            ijeVar = (defpackage.ije) aolnVar;
            int i = ijeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijeVar.d = i - Integer.MIN_VALUE;
            } else {
                ijeVar = new defpackage.ije(this, aolnVar);
            }
        } else {
            ijeVar = new defpackage.ije(this, aolnVar);
        }
        java.lang.Object objD = ijeVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ijeVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                igfVar2 = ijeVar.e;
                aooc.af(objD);
            } else if (i2 == 2) {
                aooc.af(objD);
                jLongValue = ((java.lang.Number) objD).longValue();
                defpackage.ijq ijqVar = this.f;
                ijeVar.a = jLongValue;
                ijeVar.d = 3;
                objD = c(ijqVar, ijeVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                j = jLongValue;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = ijeVar.a;
                aooc.af(objD);
            }
            jLongValue2 = j + ((java.lang.Number) objD).longValue();
            aimzVar = a;
            if (jLongValue2 < 2) {
                aimzVar.b().l("com/android/dialer/audioprism/internal/duolinks/impl/AudioPrismDuolinksAvailabilityImpl", "getDuolinksStatus", 70, "AudioPrismDuolinksAvailabilityImpl.kt").v("concurrent transcriptions unavailable");
                this.c.a(qbc.jt);
                return defpackage.igg.DUOLINKS_STATUS_CONCURRENT_TRANSCRIPTION_UNAVAILABLE;
            }
            aimzVar.b().l("com/android/dialer/audioprism/internal/duolinks/impl/AudioPrismDuolinksAvailabilityImpl", "getDuolinksStatus", 75, "AudioPrismDuolinksAvailabilityImpl.kt").v("DuoLinks available");
            this.c.a(qbc.ju);
            return defpackage.igg.DUOLINKS_STATUS_AVAILABLE;
        }
        aooc.af(objD);
        ajcq ajcqVarZ = ((java.lang.Boolean) this.d.b.a()).booleanValue() ? aiql.z(new aile(defpackage.hxc.CONCURRENT_AUDIO_TEES_MIXED_AUDIO_SOURCE_TYPES)) : aiql.z(aikn.a);
        igfVar2 = igfVar;
        ijeVar.e = igfVar2;
        ijeVar.d = 1;
        objD = aosv.D(ajcqVarZ, ijeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (!((aihd) objD).contains(defpackage.hxc.CONCURRENT_AUDIO_TEES_MIXED_AUDIO_SOURCE_TYPES)) {
            a.b().l("com/android/dialer/audioprism/internal/duolinks/impl/AudioPrismDuolinksAvailabilityImpl", "getDuolinksStatus", 51, "AudioPrismDuolinksAvailabilityImpl.kt").v("concurrent audio tees for mixed audio source types unavailable");
            this.c.a(qbc.js);
            return defpackage.igg.DUOLINKS_STATUS_CONCURRENT_AUDIO_CAPTURING_UNAVAILABLE;
        }
        igs igsVar = igfVar2.f;
        if (igsVar == null) {
            igsVar = igs.a;
        }
        alat alatVar = igsVar.c;
        aooh.e(alatVar, "getModelConfigList(...)");
        java.util.Iterator it = alatVar.iterator();
        boolean z = false;
        java.lang.Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            java.lang.Object next = it.next();
            if (igq.a(((defpackage.igr) next).b) == igq.d) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        if (((defpackage.igr) obj) == null) {
            a.b().l("com/android/dialer/audioprism/internal/duolinks/impl/AudioPrismDuolinksAvailabilityImpl", "getDuolinksStatus", 59, "AudioPrismDuolinksAvailabilityImpl.kt").v("only need concurrent audio capturing, DuoLinks available");
            this.c.a(qbc.ju);
            return defpackage.igg.DUOLINKS_STATUS_AVAILABLE;
        }
        twp twpVar = this.e;
        twc twcVar = twc.b;
        ijeVar.e = null;
        ijeVar.d = 2;
        objD = twpVar.g(twcVar, ijeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        jLongValue = ((java.lang.Number) objD).longValue();
        defpackage.ijq ijqVar2 = this.f;
        ijeVar.a = jLongValue;
        ijeVar.d = 3;
        objD = c(ijqVar2, ijeVar);
        if (objD != aoluVar) {
            return aoluVar;
        }
        j = jLongValue;
        jLongValue2 = j + ((java.lang.Number) objD).longValue();
        aimzVar = a;
        if (jLongValue2 < 2) {
            aimzVar.b().l("com/android/dialer/audioprism/internal/duolinks/impl/AudioPrismDuolinksAvailabilityImpl", "getDuolinksStatus", 70, "AudioPrismDuolinksAvailabilityImpl.kt").v("concurrent transcriptions unavailable");
            this.c.a(qbc.jt);
            return defpackage.igg.DUOLINKS_STATUS_CONCURRENT_TRANSCRIPTION_UNAVAILABLE;
        }
        aimzVar.b().l("com/android/dialer/audioprism/internal/duolinks/impl/AudioPrismDuolinksAvailabilityImpl", "getDuolinksStatus", 75, "AudioPrismDuolinksAvailabilityImpl.kt").v("DuoLinks available");
        this.c.a(qbc.ju);
        return defpackage.igg.DUOLINKS_STATUS_AVAILABLE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.ijq ijqVar, aoln aolnVar) {
        defpackage.ijd ijdVar;
        if (aolnVar instanceof defpackage.ijd) {
            ijdVar = (defpackage.ijd) aolnVar;
            int i = ijdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijdVar.c = i - Integer.MIN_VALUE;
            } else {
                ijdVar = new defpackage.ijd(this, aolnVar);
            }
        } else {
            ijdVar = new defpackage.ijd(this, aolnVar);
        }
        java.lang.Object objA = ijdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ijdVar.c;
        int i3 = 1;
        if (i2 == 0) {
            aooc.af(objA);
            ijdVar.c = 1;
            objA = ijqVar.a(ijdVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        java.util.Collection collectionValues = ((java.util.Map) objA).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            ifz ifzVar = ((igf) obj).e;
            if (ifzVar == null) {
                ifzVar = ifz.a;
            }
            ify ifyVar = ifzVar.c;
            if (ifyVar == null) {
                ifyVar = ify.a;
            }
            ifx ifxVarB = ifx.b(ifyVar.b);
            if (ifxVarB == null) {
                ifxVarB = ifx.d;
            }
            if (ifxVarB == ifx.c) {
                arrayList.add(obj);
            }
        }
        boolean zCi = ajsz.ci(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : collectionValues) {
            ifz ifzVar2 = ((igf) obj2).e;
            if (ifzVar2 == null) {
                ifzVar2 = ifz.a;
            }
            ify ifyVar2 = ifzVar2.c;
            if (ifyVar2 == null) {
                ifyVar2 = ify.a;
            }
            ifx ifxVarB2 = ifx.b(ifyVar2.b);
            if (ifxVarB2 == null) {
                ifxVarB2 = ifx.d;
            }
            if (ifxVarB2 == ifx.b) {
                arrayList2.add(obj2);
            }
        }
        boolean zCi2 = ajsz.ci(arrayList2);
        if (zCi) {
            i3 = 2;
        } else if (!zCi2) {
            i3 = 0;
        }
        return new java.lang.Integer(i3);
    }
}
