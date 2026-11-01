package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class inm extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(ahau ahauVar, defpackage.mfc mfcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ahauVar;
        this.d = mfcVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0343  */
    /* JADX WARN: Code duplicated, block: B:143:0x034f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0357  */
    /* JADX WARN: Code duplicated, block: B:148:0x035d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:? A[LOOP:0: B:94:0x0216->B:231:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0212  */
    /* JADX WARN: Code duplicated, block: B:96:0x021c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [aoln, inm] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v46, types: [aoln, inm] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        ?? r14;
        java.lang.Object obj2;
        java.lang.String[] list;
        int i;
        java.lang.Object objG;
        java.lang.Object obj3;
        defpackage.ihw ihwVar;
        defpackage.ihv ihvVarB;
        java.lang.Object obj4;
        java.lang.Object obj5;
        alat alatVar;
        java.util.Iterator it;
        java.lang.Object obj6;
        java.lang.Object obj7;
        akff akffVarA;
        java.lang.Object obj8;
        java.lang.String strValueOf;
        java.lang.Object obj9;
        java.lang.Object obj10;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                aolu aoluVar = aolu.a;
                if (this.b != 0) {
                    r14 = this.a;
                    try {
                        aooc.af(obj);
                        r14 = r14;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            ajsz.ak((java.io.Closeable) r14, th);
                            throw th3;
                        }
                    }
                } else {
                    aooc.af(obj);
                    java.lang.Object obj11 = this.c;
                    java.lang.Object obj12 = this.d;
                    if (!ahvr.R(u())) {
                        throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                    }
                    ahoq ahoqVarZ = ahvr.Z(127, "AudioPrismSessionImpl_reserveSession(config)");
                    try {
                        this.a = ahoqVarZ;
                        this.b = 1;
                        obj = ((defpackage.inu) obj11).h((igf) obj12, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        r14 = ahoqVarZ;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        r14 = ahoqVarZ;
                        throw th;
                    }
                }
                defpackage.ihq ihqVar = (defpackage.ihq) obj;
                ajsz.ak((java.io.Closeable) r14, (java.lang.Throwable) null);
                return ihqVar;
            case 1:
                aolu aoluVar2 = aolu.a;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        aooc.af(obj);
                    } else {
                        obj2 = this.a;
                        aooc.af(obj);
                    }
                    return new defpackage.iks((java.lang.String) obj);
                }
                aooc.af(obj);
                java.lang.Object obj13 = this.d;
                java.lang.Object obj14 = this.c;
                defpackage.ili iliVar = (defpackage.ili) obj13;
                android.content.Context context = iliVar.c;
                acux acuxVar = (acux) obj14;
                new java.io.File(context.getFilesDir(), acuxVar.c);
                java.io.File file = new java.io.File(context.getFilesDir(), acuxVar.c + '/' + acuxVar.e);
                if (file.isDirectory() && (list = file.list()) != null) {
                    int i4 = 0;
                    for (java.lang.String str : list) {
                        if (str.equals("succeeded") || str.equals("verified")) {
                            i4++;
                        }
                    }
                    if (i4 == 2) {
                        java.lang.String absolutePath = file.getAbsolutePath();
                        aooh.e(absolutePath, "getAbsolutePath(...)");
                        return new defpackage.iks(absolutePath);
                    }
                }
                java.lang.String str2 = acuxVar.c;
                aooh.e(str2, "getGroupName(...)");
                java.io.File file2 = new java.io.File(context.getFilesDir(), str2);
                if (file2.exists()) {
                    ajsz.aj(file2);
                }
                file2.mkdirs();
                acvm acvmVarA = acvn.a();
                acvmVarA.b(acuxVar.c);
                acvn acvnVarA = acvmVarA.a();
                rsr rsrVar = iliVar.n;
                this.a = file;
                this.b = 1;
                obj = rsrVar.J(acvnVarA, (aoln) this);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
                obj2 = file;
                acui acuiVar = (acui) obj;
                if (acuiVar == null) {
                    i = 6;
                } else {
                    alat alatVar2 = acuiVar.h;
                    aooh.e(alatVar2, "getFileList(...)");
                    acuh acuhVar = (acuh) ajsz.bG(alatVar2);
                    if (acuhVar != null) {
                        aimw aimwVarL = defpackage.ili.b.b().l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "unzipOnDemand$<anonymous>$<anonymous>", 496, "AudioPrismDuplexModelRunner.kt");
                        int i5 = acuiVar.f;
                        acux acuxVar2 = (acux) this.c;
                        aimwVarL.z("unzipping local model version [%d], request version [%d]", i5, acuxVar2.e);
                        java.lang.Object obj15 = this.d;
                        boolean z = acuiVar.f == acuxVar2.e;
                        this.a = null;
                        this.b = 2;
                        obj = ((defpackage.ili) obj15).j(acuhVar, (java.io.File) obj2, z, this);
                        if (obj == aoluVar2) {
                            return aoluVar2;
                        }
                        return new defpackage.iks((java.lang.String) obj);
                    }
                    i = 7;
                }
                return new defpackage.ikr(i);
            case 2:
                aolu aoluVar3 = aolu.a;
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        obj3 = this.a;
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                    }
                    ihwVar = (defpackage.ihw) obj3;
                    if (!ihwVar.c) {
                        ihvVarB = defpackage.ihv.b(ihwVar.d);
                        if (ihvVarB == null) {
                            ihvVarB = defpackage.ihv.UNRECOGNIZED;
                        }
                        if (ihvVarB != defpackage.ihv.FAILURE_NO_ONGOING_SESSION_FOR_FEATURE) {
                            defpackage.inu.a.d().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "startThermalThresholdMonitoring$<anonymous>$<anonymous>", 425, "AudioPrismSessionImpl.kt").y("Unexpected session stop result in thermal status exceeded callback: %s", obj3);
                        }
                    }
                    return aojh.a;
                }
                aooc.af(obj);
                java.lang.Object obj16 = this.c;
                ifv ifvVarB = ifv.b(((igf) this.d).c);
                if (ifvVarB == null) {
                    ifvVarB = ifv.j;
                }
                this.b = 1;
                obj = ((defpackage.inu) obj16).d(ifvVarB, this);
                if (obj == aoluVar3) {
                    return aoluVar3;
                }
                java.lang.Object obj17 = this.c;
                defpackage.ihw ihwVar2 = (defpackage.ihw) obj;
                ifv ifvVarB2 = ifv.b(((igf) this.d).c);
                if (ifvVarB2 == null) {
                    ifvVarB2 = ifv.j;
                }
                this.a = ihwVar2;
                this.b = 2;
                aoin aoinVar = (aoin) ((defpackage.inu) obj17).p.k().get(ifvVarB2);
                tnr tnrVar = aoinVar != null ? (tnr) aoinVar.a() : null;
                if (tnrVar != null) {
                    akzx akzxVarM = defpackage.ihs.a.m();
                    aooh.f(akzxVarM, "builder");
                    akzx akzxVarM2 = defpackage.ihx.a.m();
                    aooh.f(akzxVarM2, "builder");
                    akzxVarM2.u();
                    ((defpackage.ihx) akzxVarM2.b).b = a.T(4);
                    alad aladVarP = akzxVarM2.p();
                    aooh.e(aladVarP, "build(...)");
                    defpackage.ihx ihxVar = (defpackage.ihx) aladVarP;
                    aooh.f(ihxVar, "value");
                    akzxVarM.u();
                    defpackage.ihs ihsVar = (defpackage.ihs) akzxVarM.b;
                    j$.util.Objects.requireNonNull(ihxVar);
                    ihsVar.c = ihxVar;
                    ihsVar.b = 1;
                    alad aladVarP2 = akzxVarM.p();
                    aooh.e(aladVarP2, "build(...)");
                    toj tojVar = tnrVar.a;
                    objG = tojVar.g(new nhv((defpackage.ihs) aladVarP2, tojVar, (aoln) null, 5), (aoln) this);
                    if (objG != aoluVar3) {
                        objG = aojh.a;
                    }
                    if (objG != aoluVar3) {
                        objG = aojh.a;
                    }
                    if (objG != aoluVar3) {
                        objG = aojh.a;
                    }
                } else {
                    objG = aojh.a;
                }
                if (objG == aoluVar3) {
                    return aoluVar3;
                }
                obj3 = ihwVar2;
                ihwVar = (defpackage.ihw) obj3;
                if (!ihwVar.c) {
                    ihvVarB = defpackage.ihv.b(ihwVar.d);
                    if (ihvVarB == null) {
                        ihvVarB = defpackage.ihv.UNRECOGNIZED;
                    }
                    if (ihvVarB != defpackage.ihv.FAILURE_NO_ONGOING_SESSION_FOR_FEATURE) {
                        defpackage.inu.a.d().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "startThermalThresholdMonitoring$<anonymous>$<anonymous>", 425, "AudioPrismSessionImpl.kt").y("Unexpected session stop result in thermal status exceeded callback: %s", obj3);
                    }
                }
                return aojh.a;
            case 3:
                aolu aoluVar4 = aolu.a;
                if (this.b != 0) {
                    obj4 = this.a;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    aify aifyVar = ((ahau) this.c).a;
                    ahap ahapVar = ahap.a;
                    if (!aifyVar.contains(ahapVar)) {
                        ahar aharVar = ahas.d;
                        aooh.e(aharVar, "NO_DATA");
                        return aharVar;
                    }
                    ahaq ahaqVarA = ahar.a();
                    ahaqVarA.b(false);
                    ahaqVarA.a = ahapVar;
                    java.lang.Object obj18 = this.d;
                    this.a = ahaqVarA;
                    this.b = 1;
                    java.lang.Object objB = ((defpackage.mfc) obj18).b(this);
                    if (objB == aoluVar4) {
                        return aoluVar4;
                    }
                    obj = objB;
                    obj4 = ahaqVarA;
                }
                ahaq ahaqVar = (ahaq) obj4;
                ahaqVar.c(akzc.v(java.lang.String.valueOf(((java.lang.Boolean) obj).booleanValue()), java.nio.charset.StandardCharsets.UTF_8));
                return ahaqVar.a();
            case 4:
                aolu aoluVar5 = aolu.a;
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        aooc.af(obj);
                    } else {
                        obj5 = this.a;
                        aooc.af(obj);
                    }
                    alatVar = ((defpackage.igp) obj).b;
                    aooh.e(alatVar, "getIndividualModelAvaila…lityCheckResultsList(...)");
                    if ((alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                        it = alatVar.iterator();
                        while (it.hasNext()) {
                            if (!((defpackage.igo) it.next()).e) {
                            }
                        }
                        i2 = 1;
                    } else {
                        i2 = 1;
                    }
                    return abxl.L("DOBBY_MODELS_AVAILABLE", i2);
                }
                aooc.af(obj);
                obj5 = this.d;
                java.lang.Object obj19 = this.c;
                this.a = obj5;
                this.b = 1;
                obj = ((mns) obj19).a((aoln) this);
                if (obj == aoluVar5) {
                    return aoluVar5;
                }
                igs igsVar = ((igf) obj).f;
                if (igsVar == null) {
                    igsVar = igs.a;
                }
                aooh.e(igsVar, "getCompositeModelConfig(...)");
                this.a = null;
                this.b = 2;
                obj = ((ils) obj5).c(igsVar, (aoln) this);
                if (obj == aoluVar5) {
                    return aoluVar5;
                }
                alatVar = ((defpackage.igp) obj).b;
                aooh.e(alatVar, "getIndividualModelAvaila…lityCheckResultsList(...)");
                if (alatVar instanceof java.util.Collection) {
                    it = alatVar.iterator();
                    while (it.hasNext()) {
                        if (!((defpackage.igo) it.next()).e) {
                        }
                    }
                    i2 = 1;
                } else {
                    it = alatVar.iterator();
                    while (it.hasNext()) {
                        if (!((defpackage.igo) it.next()).e) {
                        }
                    }
                    i2 = 1;
                }
                return abxl.L("DOBBY_MODELS_AVAILABLE", i2);
            case 5:
                aolu aoluVar6 = aolu.a;
                if (this.b != 0) {
                    obj6 = this.a;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    aify aifyVar2 = ((ahau) this.c).a;
                    ahap ahapVar2 = ahap.a;
                    if (!aifyVar2.contains(ahapVar2)) {
                        ahar aharVar2 = ahas.d;
                        aooh.e(aharVar2, "NO_DATA");
                        return aharVar2;
                    }
                    ahaq ahaqVarA2 = ahar.a();
                    ahaqVarA2.b(false);
                    ahaqVarA2.a = ahapVar2;
                    java.lang.Object obj20 = this.d;
                    this.a = ahaqVarA2;
                    this.b = 1;
                    java.lang.Object objB2 = ((nnx) ((defpackage.mzi) obj20).a).b((aoln) this);
                    if (objB2 == aoluVar6) {
                        return aoluVar6;
                    }
                    obj = objB2;
                    obj6 = ahaqVarA2;
                }
                defpackage.noh nohVarB = defpackage.noh.b(((nok) obj).c);
                if (nohVarB == null) {
                    nohVarB = defpackage.noh.UNRECOGNIZED;
                }
                ahaq ahaqVar2 = (ahaq) obj6;
                ahaqVar2.c(akzc.v(nohVarB.name(), java.nio.charset.StandardCharsets.UTF_8));
                return ahaqVar2.a();
            case 6:
                aolu aoluVar7 = aolu.a;
                if (this.b != 0) {
                    obj7 = this.a;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    aify aifyVar3 = ((ahau) this.c).a;
                    ahap ahapVar3 = ahap.a;
                    if (!aifyVar3.contains(ahapVar3)) {
                        ahar aharVar3 = ahas.d;
                        aooh.e(aharVar3, "NO_DATA");
                        return aharVar3;
                    }
                    ahaq ahaqVarA3 = ahar.a();
                    ahaqVarA3.b(false);
                    ahaqVarA3.a = ahapVar3;
                    java.lang.Object obj21 = this.d;
                    this.a = ahaqVarA3;
                    this.b = 1;
                    java.lang.Object objB3 = ((nnx) ((defpackage.mzi) obj21).a).b((aoln) this);
                    if (objB3 == aoluVar7) {
                        return aoluVar7;
                    }
                    obj = objB3;
                    obj7 = ahaqVarA3;
                }
                defpackage.noi noiVarB = defpackage.noi.b(((nok) obj).d);
                if (noiVarB == null) {
                    noiVarB = defpackage.noi.UNRECOGNIZED;
                }
                ahaq ahaqVar3 = (ahaq) obj7;
                ahaqVar3.c(akzc.v(noiVarB.name(), java.nio.charset.StandardCharsets.UTF_8));
                return ahaqVar3.a();
            case 7:
                aolu aoluVar8 = aolu.a;
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 != 1) {
                        aooc.af(obj);
                    } else {
                        java.lang.Object obj22 = this.a;
                        aooc.af(obj);
                        obj8 = obj22;
                    }
                    strValueOf = java.lang.String.valueOf(((tvz) obj).d);
                    ahaq ahaqVarA4 = ahar.a();
                    ahaqVarA4.b(false);
                    ahaqVarA4.a = ahap.a;
                    ahaqVarA4.c(akzc.v(strValueOf, java.nio.charset.StandardCharsets.UTF_8));
                    return ahaqVarA4.a();
                }
                aooc.af(obj);
                if (!((ahau) this.c).a.contains(ahap.a)) {
                    ahar aharVar4 = ahas.d;
                    aooh.e(aharVar4, "NO_DATA");
                    return aharVar4;
                }
                defpackage.mzj mzjVar = (defpackage.mzj) this.d;
                akffVarA = akff.a((java.lang.String) mzjVar.a.j.a());
                this.a = akffVarA;
                this.b = 1;
                obj = mzjVar.b.h(akffVarA, (aoln) this);
                if (obj == aoluVar8) {
                    obj8 = akffVarA;
                    return aoluVar8;
                }
                obj8 = akffVarA;
                if ((((tvz) obj).b & 2) != 0) {
                    java.lang.Object obj23 = this.d;
                    aooh.c(obj8);
                    this.a = null;
                    this.b = 2;
                    obj = ((defpackage.mzj) obj23).b.h((akff) obj8, (aoln) this);
                    if (obj == aoluVar8) {
                        return aoluVar8;
                    }
                    strValueOf = java.lang.String.valueOf(((tvz) obj).d);
                } else {
                    strValueOf = "not-set";
                }
                ahaq ahaqVarA5 = ahar.a();
                ahaqVarA5.b(false);
                ahaqVarA5.a = ahap.a;
                ahaqVarA5.c(akzc.v(strValueOf, java.nio.charset.StandardCharsets.UTF_8));
                return ahaqVarA5.a();
            case 8:
                aolu aoluVar9 = aolu.a;
                int i9 = this.b;
                try {
                    if (i9 != 0) {
                        if (i9 == 1) {
                            aooc.af(obj);
                        } else {
                            if (i9 != 2) {
                                obj9 = this.a;
                                aooc.af(obj);
                                throw ((java.lang.Throwable) obj9);
                            }
                            aooc.af(obj);
                        }
                        return aojh.a;
                    }
                    aooc.af(obj);
                    java.lang.Object obj24 = this.d;
                    java.lang.Object obj25 = this.c;
                    this.b = 1;
                    if (((defpackage.ntb) obj24).e((uwt) obj25, this) == aoluVar9) {
                        return aoluVar9;
                    }
                    java.lang.Object obj26 = this.d;
                    aour aourVar = aour.a;
                    defpackage.mhq mhqVar = new defpackage.mhq((defpackage.ntb) obj26, (aoln) null, 16, (byte[]) null);
                    this.b = 2;
                    this = aoov.aj(aourVar, mhqVar, (aoln) this);
                    if (this == aoluVar9) {
                        return aoluVar9;
                    }
                    return aojh.a;
                } catch (java.lang.Throwable th5) {
                    java.lang.Object obj27 = this.d;
                    aour aourVar2 = aour.a;
                    defpackage.mhq mhqVar2 = new defpackage.mhq((defpackage.ntb) obj27, (aoln) null, 16, (byte[]) null);
                    this.a = th5;
                    this.b = 3;
                    if (aoov.aj(aourVar2, mhqVar2, (aoln) this) == aoluVar9) {
                        return aoluVar9;
                    }
                    obj9 = th5;
                }
                break;
            default:
                aolu aoluVar10 = aolu.a;
                if (this.b != 0) {
                    obj10 = this.a;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    java.lang.Object obj28 = this.c;
                    java.lang.Object obj29 = this.d;
                    akzx akzxVarP = ((alad) obj28).p();
                    this.a = akzxVarP;
                    this.b = 1;
                    java.lang.Object objA = ((defpackage.oew) obj29).a.a(this);
                    if (objA == aoluVar10) {
                        return aoluVar10;
                    }
                    obj = objA;
                    obj10 = akzxVarP;
                }
                amtt amttVar = (amtt) obj;
                akzx akzxVar = (akzx) obj10;
                akzxVar.u();
                amtp amtpVar = akzxVar.b;
                amtp amtpVar2 = amtp.a;
                j$.util.Objects.requireNonNull(amttVar);
                amtpVar.d = amttVar;
                amtpVar.b |= 2;
                alad aladVarP3 = akzxVar.p();
                aooh.e(aladVarP3, "build(...)");
                return aladVarP3;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.inm((defpackage.inu) this.c, (igf) this.d, aolnVar, 0);
            case 1:
                return new defpackage.inm((defpackage.ili) this.d, (acux) this.c, aolnVar, 1);
            case 2:
                return new defpackage.inm((defpackage.inu) this.c, (igf) this.d, aolnVar, 2, (byte[]) null);
            case 3:
                return new defpackage.inm((ahau) this.c, (defpackage.mfc) this.d, aolnVar, 3);
            case 4:
                return new defpackage.inm((ils) this.d, (mns) this.c, aolnVar, 4);
            case 5:
                return new defpackage.inm((ahau) this.c, (defpackage.mzi) this.d, aolnVar, 5);
            case 6:
                return new defpackage.inm((ahau) this.c, (defpackage.mzi) this.d, aolnVar, 6, (byte[]) null);
            case 7:
                return new defpackage.inm((ahau) this.c, (defpackage.mzj) this.d, aolnVar, 7);
            case 8:
                return new defpackage.inm((defpackage.ntb) this.d, (uwt) this.c, aolnVar, 8);
            default:
                return new defpackage.inm((amtp) this.c, (defpackage.oew) this.d, aolnVar, 9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(ahau ahauVar, defpackage.mzi mziVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ahauVar;
        this.d = mziVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(ahau ahauVar, defpackage.mzi mziVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ahauVar;
        this.d = mziVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(ahau ahauVar, defpackage.mzj mzjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ahauVar;
        this.d = mzjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(amtp amtpVar, defpackage.oew oewVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = amtpVar;
        this.d = oewVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(defpackage.ili iliVar, acux acuxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = iliVar;
        this.c = acuxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(ils ilsVar, mns mnsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = ilsVar;
        this.c = mnsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(defpackage.inu inuVar, igf igfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = inuVar;
        this.d = igfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(defpackage.inu inuVar, igf igfVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = inuVar;
        this.d = igfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(defpackage.ntb ntbVar, uwt uwtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = ntbVar;
        this.c = uwtVar;
    }
}
