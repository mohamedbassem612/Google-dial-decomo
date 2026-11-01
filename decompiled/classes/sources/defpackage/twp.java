package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class twp {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sodatranscription/impl/SodaAvailabilityImpl");
    private static final java.lang.String k;
    public final defpackage.aoss b;
    public final defpackage.ecx c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final android.content.pm.PackageManager g;
    public final defpackage.aoin h;
    public final defpackage.txi i;
    public final defpackage.txy j;
    private final defpackage.aolr l;
    private final defpackage.aolr m;
    private final defpackage.txh n;
    private final defpackage.tyd o;
    private final defpackage.txw p;
    private final defpackage.txc q;

    static {
        k = "market://details?id=".concat(android.os.Build.VERSION.SDK_INT >= 31 ? "com.google.android.tts" : "com.google.android.googlequicksearchbox");
    }

    public twp(defpackage.ajct ajctVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.ecx ecxVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, android.content.pm.PackageManager packageManager, defpackage.aoin aoinVar4, defpackage.txh txhVar, defpackage.txi txiVar, defpackage.txy txyVar, defpackage.tyd tydVar, defpackage.txw txwVar, defpackage.txc txcVar) {
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (ecxVar == null) {
            defpackage.aooh.i("persistedLanguagePackInfoDataStore");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("persistedLanguagePackInfoRefreshFrequencyHours");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("persistedLanguagePackInfoRefreshInitialDelayHours");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("skipSodaAvailabilityCheck");
        }
        if (packageManager == null) {
            defpackage.aooh.i("packageManager");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("dialerTikTokWorkManagerProvider");
        }
        if (txiVar == null) {
            defpackage.aooh.i("sodaAndroidSpeechModelDownloaderFactory");
        }
        if (txcVar == null) {
            defpackage.aooh.i("sodaSpeechTranscriber");
        }
        this.b = aossVar;
        this.l = aolrVar;
        this.m = aolrVar2;
        this.c = ecxVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.f = aoinVar3;
        this.g = packageManager;
        this.h = aoinVar4;
        this.n = txhVar;
        this.i = txiVar;
        this.j = txyVar;
        this.o = tydVar;
        this.p = txwVar;
        this.q = txcVar;
    }

    public final android.content.Intent a() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri uri = android.net.Uri.parse(k);
        defpackage.aooh.e(uri, "parse(...)");
        intent.setData(uri);
        return intent;
    }

    public final defpackage.ajcq b(defpackage.akff akffVar) {
        return defpackage.aosv.F(this.b, 0, new tkz(this, akffVar, (defpackage.aoln) null, 15, (byte[]) null), 3);
    }

    public final defpackage.ajcq c(defpackage.akff akffVar) {
        defpackage.aooh.f(akffVar, "languageCode");
        return defpackage.aosv.F(this.b, 0, new tkz(this, akffVar, (defpackage.aoln) null, 16, (char[]) null), 3);
    }

    public final defpackage.ajcq d(defpackage.oj ojVar, twa twaVar) {
        defpackage.aooh.f(ojVar, "activityResultCaller");
        return defpackage.aosv.C(m(ojVar, twaVar));
    }

    public final defpackage.ajcq e() {
        return defpackage.aosv.F(this.b, 0, new tpd(this, (defpackage.aoln) null, 18, (byte[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(int i, defpackage.aoln aolnVar) {
        twm twmVar;
        if (aolnVar instanceof twm) {
            twmVar = (twm) aolnVar;
            int i2 = twmVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                twmVar.d = i2 - Integer.MIN_VALUE;
            } else {
                twmVar = new twm(this, aolnVar);
            }
        } else {
            twmVar = new twm(this, aolnVar);
        }
        java.lang.Object objB = twmVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = twmVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(objB);
            ((defpackage.aimw) a.b().l("com/android/dialer/sodatranscription/impl/SodaAvailabilityImpl", "getAicoreFeatureStatus", 328, "SodaAvailabilityImpl.kt")).w("getAicoreFeatureStatus for %d", i);
            defpackage.tyd tydVar = this.o;
            twmVar.a = i;
            twmVar.d = 1;
            objB = tydVar.b(i, twmVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = twmVar.a;
            defpackage.aooc.af(objB);
        }
        tvw tvwVar = (tvw) objB;
        ((defpackage.aimw) a.b().l("com/android/dialer/sodatranscription/impl/SodaAvailabilityImpl", "getAicoreFeatureStatus", 330, "SodaAvailabilityImpl.kt")).B("getAicoreFeatureStatus for %d, result:%s", i, tvwVar);
        return tvwVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(twc twcVar, defpackage.aoln aolnVar) {
        twn twnVar;
        long j;
        twc twcVar2;
        boolean z;
        long jLongValue;
        boolean z2;
        long j2;
        int iIntValue;
        int iOrdinal;
        if (aolnVar instanceof twn) {
            twnVar = (twn) aolnVar;
            int i = twnVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                twnVar.e = i - Integer.MIN_VALUE;
            } else {
                twnVar = new twn(this, aolnVar);
            }
        } else {
            twnVar = new twn(this, aolnVar);
        }
        java.lang.Object objB = twnVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = twnVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                twcVar = twnVar.f;
                defpackage.aooc.af(objB);
            } else if (i2 == 2) {
                z = twnVar.a;
                twcVar2 = twnVar.f;
                defpackage.aooc.af(objB);
                jLongValue = ((java.lang.Number) objB).longValue();
                defpackage.txc txcVar = this.q;
                twnVar.f = twcVar2;
                twnVar.a = z;
                twnVar.b = jLongValue;
                twnVar.e = 4;
                objB = defpackage.ahvr.ag(txcVar.b, txcVar.g, new tlv(txcVar, (defpackage.aoln) null, 9)).a(twnVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                z2 = z;
                j2 = jLongValue;
            } else if (i2 == 3) {
                j = twnVar.b;
                z = twnVar.a;
                twcVar2 = twnVar.f;
                defpackage.aooc.af(objB);
                jLongValue = j - ((java.lang.Number) objB).longValue();
                defpackage.txc txcVar2 = this.q;
                twnVar.f = twcVar2;
                twnVar.a = z;
                twnVar.b = jLongValue;
                twnVar.e = 4;
                objB = defpackage.ahvr.ag(txcVar2.b, txcVar2.g, new tlv(txcVar2, (defpackage.aoln) null, 9)).a(twnVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                z2 = z;
                j2 = jLongValue;
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = twnVar.b;
                z2 = twnVar.a;
                twc twcVar3 = twnVar.f;
                defpackage.aooc.af(objB);
                twcVar2 = twcVar3;
            }
            iIntValue = ((java.lang.Number) objB).intValue();
            ((defpackage.aimw) a.b().l("com/android/dialer/sodatranscription/impl/SodaAvailabilityImpl", "getAvailableSessionCount", 302, "SodaAvailabilityImpl.kt")).N("getAvailableSessionCount for %s with isSodaOnDeviceGrpcAvailable %b, availableSessionCount %d, runningLowPrioritySessionCount %d", twcVar2, java.lang.Boolean.valueOf(z2), new java.lang.Long(j2), new java.lang.Integer(iIntValue));
            iOrdinal = twcVar2.ordinal();
            if (iOrdinal == 0) {
                throw new java.lang.IllegalArgumentException("Transcription behavior must be specified");
            }
            if (iOrdinal == 1) {
                j2 += (long) iIntValue;
            } else if (iOrdinal != 2) {
                throw new defpackage.aois();
            }
            return new java.lang.Long(j2);
        }
        defpackage.aooc.af(objB);
        defpackage.txy txyVar = this.j;
        twnVar.f = twcVar;
        twnVar.e = 1;
        objB = txyVar.b(twnVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objB).booleanValue();
        if (zBooleanValue) {
            defpackage.txy txyVar2 = this.j;
            twnVar.f = twcVar;
            twnVar.a = true;
            twnVar.e = 2;
            java.lang.Object objA = txyVar2.a(twnVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            twcVar2 = twcVar;
            z = zBooleanValue;
            objB = objA;
            jLongValue = ((java.lang.Number) objB).longValue();
            defpackage.txc txcVar3 = this.q;
            twnVar.f = twcVar2;
            twnVar.a = z;
            twnVar.b = jLongValue;
            twnVar.e = 4;
            objB = defpackage.ahvr.ag(txcVar3.b, txcVar3.g, new tlv(txcVar3, (defpackage.aoln) null, 9)).a(twnVar);
            if (objB != aoluVar) {
                return aoluVar;
            }
            z2 = z;
            j2 = jLongValue;
            iIntValue = ((java.lang.Number) objB).intValue();
            ((defpackage.aimw) a.b().l("com/android/dialer/sodatranscription/impl/SodaAvailabilityImpl", "getAvailableSessionCount", 302, "SodaAvailabilityImpl.kt")).N("getAvailableSessionCount for %s with isSodaOnDeviceGrpcAvailable %b, availableSessionCount %d, runningLowPrioritySessionCount %d", twcVar2, java.lang.Boolean.valueOf(z2), new java.lang.Long(j2), new java.lang.Integer(iIntValue));
            iOrdinal = twcVar2.ordinal();
            if (iOrdinal == 0) {
                throw new java.lang.IllegalArgumentException("Transcription behavior must be specified");
            }
            if (iOrdinal == 1) {
                j2 += (long) iIntValue;
            } else if (iOrdinal != 2) {
                throw new defpackage.aois();
            }
            return new java.lang.Long(j2);
        }
        defpackage.txc txcVar4 = this.q;
        twnVar.f = twcVar;
        twnVar.a = false;
        j = 1;
        twnVar.b = 1L;
        twnVar.e = 3;
        java.lang.Object objA2 = defpackage.ahvr.ag(txcVar4.b, txcVar4.g, new tlv(txcVar4, (defpackage.aoln) null, 10, (byte[]) null)).a(twnVar);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        twcVar2 = twcVar;
        z = zBooleanValue;
        objB = objA2;
        jLongValue = j - ((java.lang.Number) objB).longValue();
        defpackage.txc txcVar5 = this.q;
        twnVar.f = twcVar2;
        twnVar.a = z;
        twnVar.b = jLongValue;
        twnVar.e = 4;
        objB = defpackage.ahvr.ag(txcVar5.b, txcVar5.g, new tlv(txcVar5, (defpackage.aoln) null, 9)).a(twnVar);
        if (objB != aoluVar) {
            return aoluVar;
        }
        z2 = z;
        j2 = jLongValue;
        iIntValue = ((java.lang.Number) objB).intValue();
        ((defpackage.aimw) a.b().l("com/android/dialer/sodatranscription/impl/SodaAvailabilityImpl", "getAvailableSessionCount", 302, "SodaAvailabilityImpl.kt")).N("getAvailableSessionCount for %s with isSodaOnDeviceGrpcAvailable %b, availableSessionCount %d, runningLowPrioritySessionCount %d", twcVar2, java.lang.Boolean.valueOf(z2), new java.lang.Long(j2), new java.lang.Integer(iIntValue));
        iOrdinal = twcVar2.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalArgumentException("Transcription behavior must be specified");
        }
        if (iOrdinal == 1) {
            j2 += (long) iIntValue;
        } else if (iOrdinal != 2) {
            throw new defpackage.aois();
        }
        return new java.lang.Long(j2);
    }

    public final java.lang.Object h(defpackage.akff akffVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.l, new tkz(this, akffVar, (defpackage.aoln) null, 14), aolnVar);
    }

    public final java.lang.Object i(defpackage.akff akffVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.l, new rir(akffVar, this, (defpackage.aoln) null, 7), aolnVar);
    }

    public final java.lang.Object j(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.m, new tpd(this, (defpackage.aoln) null, 17), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.aoln aolnVar) {
        two twoVar;
        if (aolnVar instanceof two) {
            twoVar = (two) aolnVar;
            int i = twoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                twoVar.c = i - Integer.MIN_VALUE;
            } else {
                twoVar = new two(this, aolnVar);
            }
        } else {
            twoVar = new two(this, aolnVar);
        }
        java.lang.Object objB = twoVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = twoVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            defpackage.txy txyVar = this.j;
            twoVar.c = 1;
            objB = txyVar.b(twoVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        return ((java.lang.Boolean) objB).booleanValue() ? this.o : this.n;
    }

    public final java.lang.Object l(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.l, new tpd(this, (defpackage.aoln) null, 19, (char[]) null), aolnVar);
    }

    public final defpackage.aosy m(defpackage.oj ojVar, twa twaVar) {
        defpackage.aooh.f(ojVar, "activityResultCaller");
        return defpackage.aoov.am(this.b, 0, new defpackage.hcn(this, ojVar.O(this.p, new kse(twaVar, 20)), twaVar, (defpackage.aoln) null, 16), 3);
    }
}
