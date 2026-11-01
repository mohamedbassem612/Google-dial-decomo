package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class imh {
    private static final aimz a = aimz.i("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaLanguagePackChecker");
    private final aoin b;
    private final aoin c;
    private final twp d;

    public imh(twp twpVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aoinVar, "lpMinVersionList");
        aooh.f(aoinVar2, "enforcePolicyAiCoreReady");
        this.d = twpVar;
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.ihm ihmVar, java.lang.String str, boolean z, defpackage.igw igwVar, aoln aolnVar) throws aois {
        defpackage.ime imeVar;
        uzx uzxVarCq;
        uzx uzxVar;
        java.lang.Object obj;
        uzx uzxVar2;
        defpackage.ihj ihjVarB;
        int iOrdinal;
        if (aolnVar instanceof defpackage.ime) {
            imeVar = (defpackage.ime) aolnVar;
            int i = imeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imeVar.c = i - Integer.MIN_VALUE;
            } else {
                imeVar = new defpackage.ime(this, aolnVar);
            }
        } else {
            imeVar = new defpackage.ime(this, aolnVar);
        }
        java.lang.Object obj2 = imeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = imeVar.c;
        int i3 = 2;
        if (i2 == 0) {
            aooc.af(obj2);
            uzxVarCq = wsc.cq(twd.a.m());
            uzxVarCq.J(twc.b);
            uzxVarCq.I(16000);
            akzx akzxVar = (akzx) uzxVarCq.a;
            akzxVar.u();
            twd twdVar = akzxVar.b;
            twdVar.b |= 4;
            twdVar.e = true;
            aooh.f(str, "value");
            akzxVar.u();
            twd twdVar2 = akzxVar.b;
            j$.util.Objects.requireNonNull(str);
            twdVar2.b |= 16;
            twdVar2.g = str;
            akzxVar.u();
            twd twdVar3 = akzxVar.b;
            twdVar3.b |= 32;
            twdVar3.h = z;
            akzxVar.u();
            twd twdVar4 = akzxVar.b;
            twdVar4.j = 2;
            twdVar4.b |= 128;
            if ((ihmVar.b & 16) != 0) {
                if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                    defpackage.ihj ihjVarB2 = defpackage.ihj.b(ihmVar.g);
                    if (ihjVarB2 == null) {
                        ihjVarB2 = defpackage.ihj.UNRECOGNIZED;
                    }
                    imeVar.d = ihmVar;
                    imeVar.e = igwVar;
                    imeVar.f = uzxVarCq;
                    imeVar.g = uzxVarCq;
                    imeVar.c = 1;
                    java.lang.Object objC = c(ihjVarB2, imeVar);
                    if (objC == aoluVar) {
                        return aoluVar;
                    }
                    obj = objC;
                    uzxVar2 = uzxVarCq;
                } else {
                    uzxVar = uzxVarCq;
                }
                ihjVarB = defpackage.ihj.b(ihmVar.g);
                if (ihjVarB == null) {
                    ihjVarB = defpackage.ihj.UNRECOGNIZED;
                }
                iOrdinal = ihjVarB.ordinal();
                if (iOrdinal == 0) {
                    i3 = 1;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        i3 = 3;
                    } else if (iOrdinal != 3) {
                        i3 = 5;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                throw new aois();
                            }
                            i3 = 1;
                        }
                    } else {
                        i3 = 4;
                    }
                }
                akzx akzxVar2 = (akzx) uzxVarCq.a;
                akzxVar2.u();
                twd twdVar5 = akzxVar2.b;
                twd twdVar6 = twd.a;
                twdVar5.k = i3 - 1;
                twdVar5.b |= 256;
                uzxVarCq = uzxVar;
            }
            return new defpackage.imd(uzxVarCq.G(), igwVar);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uzxVar2 = imeVar.g;
        uzx uzxVar3 = imeVar.f;
        igwVar = imeVar.e;
        defpackage.ihm ihmVar2 = imeVar.d;
        aooc.af(obj2);
        uzxVarCq = uzxVar3;
        ihmVar = ihmVar2;
        obj = obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            uzx uzxVar4 = uzxVarCq;
            uzxVarCq = uzxVar2;
            uzxVar = uzxVar4;
            ihjVarB = defpackage.ihj.b(ihmVar.g);
            if (ihjVarB == null) {
                ihjVarB = defpackage.ihj.UNRECOGNIZED;
            }
            iOrdinal = ihjVarB.ordinal();
            if (iOrdinal == 0) {
                i3 = 1;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i3 = 3;
                } else if (iOrdinal != 3) {
                    i3 = 5;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            throw new aois();
                        }
                        i3 = 1;
                    }
                } else {
                    i3 = 4;
                }
            }
            akzx akzxVar3 = (akzx) uzxVarCq.a;
            akzxVar3.u();
            twd twdVar7 = akzxVar3.b;
            twd twdVar8 = twd.a;
            twdVar7.k = i3 - 1;
            twdVar7.b |= 256;
            uzxVarCq = uzxVar;
        }
        return new defpackage.imd(uzxVarCq.G(), igwVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x021e A[EDGE_INSN: B:84:0x021e->B:85:0x0220 BREAK  A[LOOP:0: B:76:0x01bf->B:101:0x01bf]] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [igr, ihm, java.lang.String] */
    public final java.lang.Object b(defpackage.igr igrVar, java.lang.String str, aoln aolnVar) throws aois {
        defpackage.imf imfVar;
        defpackage.ihm ihmVar;
        java.lang.Object objH;
        int i;
        ?? r0;
        boolean z;
        defpackage.igr igrVar2 = igrVar;
        java.lang.String str2 = str;
        if (aolnVar instanceof defpackage.imf) {
            imfVar = (defpackage.imf) aolnVar;
            int i2 = imfVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imfVar.c = i2 - Integer.MIN_VALUE;
            } else {
                imfVar = new defpackage.imf(this, aolnVar);
            }
        } else {
            imfVar = new defpackage.imf(this, aolnVar);
        }
        defpackage.imf imfVar2 = imfVar;
        java.lang.Object obj = imfVar2.a;
        aolu aoluVar = aolu.a;
        int i3 = imfVar2.c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    defpackage.ihm ihmVar2 = imfVar2.f;
                    str2 = imfVar2.e;
                    defpackage.igr igrVar3 = imfVar2.d;
                    aooc.af(obj);
                    ihmVar = ihmVar2;
                    igrVar2 = igrVar3;
                    objH = obj;
                } else if (i3 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            aooc.af(obj);
            return obj;
        }
        aooc.af(obj);
        ihmVar = igrVar2.b == 4 ? (defpackage.ihm) igrVar2.c : defpackage.ihm.a;
        aooh.e(ihmVar, "getSodaConfig(...)");
        int i4 = ihmVar.b;
        if ((i4 & 1) != 0) {
            throw new java.lang.IllegalArgumentException("use_raw_soda_event isn't configurable; it's set to true all the time.");
        }
        if ((i4 & 2) != 0) {
            throw new java.lang.IllegalArgumentException("enable_language_detection_if_supported isn't configurable; it's set to true all the time.");
        }
        if ((i4 & 4) != 0) {
            throw new java.lang.IllegalArgumentException("diarization_config isn't configurable; diarization is not available.");
        }
        if ((i4 & 8) != 0) {
            throw new java.lang.IllegalArgumentException("formatting_mode isn't configurable; it's used only on T+, and set to OPTIMIZE_LATENCY.");
        }
        if (aooh.n(str2, "mul")) {
            imfVar2.c = 1;
            java.lang.Object objA = a(ihmVar, str2, false, null, imfVar2);
            if (objA != aoluVar) {
                return objA;
            }
        } else {
            twp twpVar = this.d;
            akff akffVarA = akff.a(str2);
            imfVar2.d = igrVar2;
            imfVar2.e = str2;
            imfVar2.f = ihmVar;
            imfVar2.c = 2;
            objH = twpVar.h(akffVarA, imfVar2);
            if (objH != aoluVar) {
            }
        }
        return aoluVar;
        tvz tvzVar = (tvz) objH;
        akzx akzxVarM = defpackage.igw.a.m();
        aooh.f(akzxVarM, "builder");
        int i5 = tvzVar.d;
        akzxVarM.u();
        defpackage.igw igwVar = (defpackage.igw) akzxVarM.b;
        igwVar.b |= 1;
        igwVar.c = i5;
        java.lang.String str3 = tvzVar.e;
        aooh.e(str3, "getLanguageCode(...)");
        aooh.f(str3, "value");
        akzxVarM.u();
        defpackage.igw igwVar2 = (defpackage.igw) akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        igwVar2.b |= 2;
        igwVar2.d = str3;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.igw igwVar3 = (defpackage.igw) aladVarP;
        tvy tvyVarB = tvy.b(tvzVar.c);
        if (tvyVarB == null) {
            tvyVarB = tvy.a;
        }
        if (tvyVarB != tvy.b) {
            return new defpackage.imc(6, null);
        }
        alat alatVar = (igrVar2.b == 4 ? (defpackage.ihm) igrVar2.c : defpackage.ihm.a).c;
        aooh.e(alatVar, "getLanguagePackConstraintsList(...)");
        if (alatVar.isEmpty()) {
            i = 0;
        } else {
            if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                java.util.Iterator it = alatVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        defpackage.ihl ihlVar = (defpackage.ihl) it.next();
                        aooh.c(ihlVar);
                        int i6 = tvzVar.d;
                        int i7 = ihlVar.b;
                        if ((i7 & 1) != 0 && i6 < ihlVar.c) {
                            a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaLanguagePackChecker", "matchesVersion", 210, "AudioPrismSodaLanguagePackChecker.kt").z("version %d does not meet min version %d", i6, ihlVar.c);
                        } else if ((i7 & 2) == 0 || i6 <= ihlVar.d) {
                            a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaLanguagePackChecker", "matchesVersion", 217, "AudioPrismSodaLanguagePackChecker.kt").M("version %d meets version range [%d,%d]", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(ihlVar.c), java.lang.Integer.valueOf(ihlVar.d));
                            i = 0;
                        } else {
                            a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaLanguagePackChecker", "matchesVersion", 214, "AudioPrismSodaLanguagePackChecker.kt").z("version %d does not meet max version %d", i6, ihlVar.d);
                        }
                    }
                }
            }
            i = 9;
        }
        if (i != 0) {
            return new defpackage.imc(i, igwVar3);
        }
        if (android.os.Build.VERSION.SDK_INT < 31) {
            r0 = 0;
            z = false;
            break;
        }
        int i8 = tvzVar.d;
        java.lang.String str4 = tvzVar.e;
        aooh.e(str4, "getLanguageCode(...)");
        if (!aooh.n(str4, "en-US")) {
            r0 = 0;
            z = false;
            break;
        }
        java.util.Iterator it2 = ((alfa) this.b.a()).b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaLanguagePackChecker", "doesLpSupportLangId", 201, "AudioPrismSodaLanguagePackChecker.kt").w("given LP (%d) does not support lang-id processing", i8);
                r0 = 0;
                z = false;
                break;
            }
            java.lang.Integer num = (java.lang.Integer) it2.next();
            int iIntValue = num.intValue() / 1000;
            if (i8 / 1000 == iIntValue) {
                aimz aimzVar = a;
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaLanguagePackChecker", "doesLpSupportLangId", 193, "AudioPrismSodaLanguagePackChecker.kt");
                aooh.c(num);
                aimwVarL.z("lang-id processing minVersion for (%d)XXX series is (%d)", iIntValue, num.intValue());
                if (i8 >= num.intValue()) {
                    aimzVar.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaLanguagePackChecker", "doesLpSupportLangId", 195, "AudioPrismSodaLanguagePackChecker.kt").w("given LP (%d) supports lang-id processing", i8);
                    r0 = 0;
                    z = true;
                    break;
                }
            }
        }
        imfVar2.d = r0;
        imfVar2.e = r0;
        imfVar2.f = r0;
        imfVar2.c = 3;
        java.lang.Object objA2 = a(ihmVar, str2, z, igwVar3, imfVar2);
        if (objA2 != aoluVar) {
            return objA2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.ihj ihjVar, aoln aolnVar) {
        defpackage.img imgVar;
        java.lang.Integer num;
        if (aolnVar instanceof defpackage.img) {
            imgVar = (defpackage.img) aolnVar;
            int i = imgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imgVar.c = i - Integer.MIN_VALUE;
            } else {
                imgVar = new defpackage.img(this, aolnVar);
            }
        } else {
            imgVar = new defpackage.img(this, aolnVar);
        }
        java.lang.Object objF = imgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = imgVar.c;
        boolean z = false;
        try {
            if (i2 == 0) {
                aooc.af(objF);
                int iOrdinal = ihjVar.ordinal();
                if (iOrdinal != 3) {
                    num = iOrdinal != 4 ? null : new java.lang.Integer(255);
                } else {
                    num = new java.lang.Integer(267);
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    twp twpVar = this.d;
                    imgVar.c = 1;
                    objF = twpVar.f(iIntValue, imgVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
            if (objF == tvw.d) {
                z = true;
            }
        } catch (java.lang.Exception e) {
            a.d().k(e).l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaLanguagePackChecker", "isAicoreModelReady", 67, "AudioPrismSodaLanguagePackChecker.kt").v("Failed to check AiCore model availability");
        }
        return java.lang.Boolean.valueOf(z);
    }
}
