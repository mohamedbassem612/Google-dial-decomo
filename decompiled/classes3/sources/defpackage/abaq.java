package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abaq {
    private static final aimz a = aimz.i("com/google/android/libraries/abuse/hades/moirai/download/mdd/MddDownloadManager");
    private final aazd b;
    private final acwi c;
    private final aify d;
    private final abaj e;
    private final java.util.concurrent.atomic.AtomicLong f;
    private final ajda g;
    private final defpackage.afpl h;
    private final aogc i;

    public abaq(aazd aazdVar, acwi acwiVar, aify aifyVar, aogc aogcVar, abaj abajVar, defpackage.afpl afplVar) {
        aooh.f(acwiVar, "mdd");
        aooh.f(aifyVar, "fileGroupPopulators");
        aooh.f(aogcVar, "fileStorage");
        aooh.f(abajVar, "config");
        this.b = aazdVar;
        this.c = acwiVar;
        this.d = aifyVar;
        this.i = aogcVar;
        this.e = abajVar;
        this.h = afplVar;
        this.f = new java.util.concurrent.atomic.AtomicLong(0L);
        double seconds = abajVar.a.toSeconds();
        java.lang.Object obj = null;
        ajda ajdaVar = new ajda(new ajyi((byte[]) null));
        double d = 1.0d / seconds;
        ahvr.bN(d > 0.0d, "rate must be positive");
        synchronized (ajdaVar.a()) {
            ajdaVar.b(ajdaVar.e.q());
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            ajdaVar.c = 1000000.0d / d;
            double d2 = ajdaVar.b;
            ajdaVar.b = d;
            ajdaVar.a = d2 != Double.POSITIVE_INFINITY ? d2 == 0.0d ? 0.0d : (ajdaVar.a * d) / d2 : d;
        }
        this.g = ajdaVar;
        if (aazdVar.b.length() <= 0) {
            java.util.Objects.toString(aazdVar);
            throw new java.lang.IllegalArgumentException("Client role should be set for client ".concat(aazdVar.b()));
        }
        for (java.lang.Object obj2 : aifyVar) {
            aazs aazsVar = (acvk) obj2;
            if ((aazsVar instanceof aazs) && aooh.n(aazsVar.a.b(), this.b.b())) {
                obj = obj2;
                break;
            }
        }
        if (((acvk) obj) != null) {
            return;
        }
        aazd aazdVar2 = this.b;
        java.util.Objects.toString(aazdVar2);
        throw new java.lang.IllegalArgumentException("PersephoneFileGroupPopulator should be installed for client ".concat(aazdVar2.b()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abbe */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [aonj, java.lang.Object] */
    private final defpackage.abbk g(defpackage.acui acuiVar) throws abbe {
        akzc akzcVar;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        try {
            alat<defpackage.acuh> alatVar = acuiVar.h;
            aooh.e(alatVar, "getFileList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
            for (defpackage.acuh acuhVar : alatVar) {
                a.b().l("com/google/android/libraries/abuse/hades/moirai/download/mdd/MddDownloadManager", "extractProtections$<anonymous>", 158, "MddDownloadManager.kt").y("Processing filegroup: %s", acuhVar);
                aogc aogcVar = this.i;
                java.lang.String str = acuhVar.d;
                aooh.e(str, "getFileUri(...)");
                android.net.Uri uri = android.net.Uri.parse(str);
                aooh.e(uri, "parse(...)");
                defpackage.affp affpVar = new defpackage.affp();
                affpVar.b();
                java.lang.Object objM = aogcVar.M(uri, affpVar);
                aooh.e(objM, "open(...)");
                mkm mkmVar = new mkm(acuhVar, acuiVar, (java.io.File) objM, 10);
                defpackage.ajyt ajytVar = new defpackage.ajyt(1024, defpackage.ajys.a);
                tw twVar = new tw();
                mkmVar.a(twVar);
                ?? r7 = twVar.b;
                if (r7 != 0) {
                    ve veVar = new ve();
                    r7.a(veVar);
                    ?? r8 = veVar.a;
                    if (r8 != 0) {
                        ve veVar2 = new ve();
                        r8.a(veVar2);
                        ?? r9 = veVar2.a;
                        java.lang.Integer numValueOf3 = r9 != 0 ? java.lang.Integer.valueOf(ajytVar.a(r9)) : null;
                        ajytVar.l(3);
                        if (numValueOf3 != null) {
                            mni.bv(ajytVar, numValueOf3.intValue());
                        }
                        numValueOf2 = java.lang.Integer.valueOf(mni.bt(ajytVar));
                    } else {
                        numValueOf2 = null;
                    }
                    ajytVar.l(3);
                    if (numValueOf2 != null) {
                        mni.bu(ajytVar, numValueOf2.intValue());
                    }
                    numValueOf = java.lang.Integer.valueOf(mni.bt(ajytVar));
                } else {
                    numValueOf = null;
                }
                ajytVar.l(3);
                java.lang.Object obj = twVar.a;
                ajytVar.n(0, obj != null ? ((java.lang.Integer) obj).intValue() : 0);
                if (numValueOf != null) {
                    mni.bv(ajytVar, numValueOf.intValue());
                }
                ajytVar.p(mni.bt(ajytVar));
                java.nio.ByteBuffer byteBufferD = ajytVar.d();
                aooh.e(byteBufferD, "dataBuffer(...)");
                aooh.f(byteBufferD, "_bb");
                defpackage.ajyu ajyuVar = new defpackage.ajyu((char[]) null);
                aooh.f(byteBufferD, "_bb");
                byteBufferD.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                int i = byteBufferD.getInt(byteBufferD.position()) + byteBufferD.position();
                aooh.f(byteBufferD, "_bb");
                aooh.f(byteBufferD, "_bb");
                ajyuVar.l(i, byteBufferD);
                arrayList.add(ajyuVar);
            }
            akyp akypVar = acuiVar.m;
            if (akypVar == null) {
                akypVar = akyp.a;
            }
            if (akypVar == null || !aooh.n(akypVar.b, "type.googleapis.com/google.internal.abuse.ondevicesafety.v2.ProtectionMetadata")) {
                akzcVar = akzc.d;
                aooh.c(akzcVar);
            } else {
                akzcVar = ((defpackage.aklc) alad.z(defpackage.aklc.a, akypVar.c, akzq.a())).b;
                aooh.c(akzcVar);
            }
            akyp akypVar2 = acuiVar.m;
            if (akypVar2 == null) {
                akypVar2 = akyp.a;
            }
            long j = 0;
            if (akypVar2 != null && aooh.n(akypVar2.b, "type.googleapis.com/google.internal.abuse.ondevicesafety.v2.ProtectionMetadata")) {
                j = ((defpackage.aklc) alad.z(defpackage.aklc.a, akypVar2.c, akzq.a())).c;
            }
            defpackage.abbk abbkVar = new defpackage.abbk(akzcVar, j, arrayList);
            this.f.set(acuiVar.i);
            return abbkVar;
        } catch (java.lang.Exception e) {
            i(e);
            throw new abbe(alez.q, aley.C, (java.lang.String) null, e, (akzc) null, 0L, (defpackage.abay) null, 116);
        }
    }

    private final java.util.concurrent.CancellationException h(java.lang.Throwable th) {
        j$.util.Objects.checkIndex(0, 3);
        if (th == null) {
            return null;
        }
        if (th instanceof java.util.concurrent.CancellationException) {
            return (java.util.concurrent.CancellationException) th;
        }
        if (!(th instanceof acup)) {
            return h(th.getCause());
        }
        aify aifyVar = ((acup) th).a;
        aooh.e(aifyVar, "getFailures(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aifyVar, 10));
        ailk ailkVarY = aifyVar.y(0);
        while (ailkVarY.hasNext()) {
            arrayList.add(h((java.lang.Throwable) ailkVarY.next()));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((java.util.concurrent.CancellationException) it.next()) == null) {
                    return null;
                }
            }
        }
        return (java.util.concurrent.CancellationException) ajsz.bE(arrayList);
    }

    private final void i(java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationExceptionH = h(th);
        if (cancellationExceptionH != null) {
            throw cancellationExceptionH;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abbe */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object a(java.lang.String str, boolean z, aoln aolnVar) throws abbe {
        defpackage.abak abakVar;
        if (aolnVar instanceof defpackage.abak) {
            abakVar = (defpackage.abak) aolnVar;
            int i = abakVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                abakVar.d = i - Integer.MIN_VALUE;
            } else {
                abakVar = new defpackage.abak(this, aolnVar);
            }
        } else {
            abakVar = new defpackage.abak(this, aolnVar);
        }
        java.lang.Object objD = abakVar.b;
        aolu aoluVar = aolu.a;
        int i2 = abakVar.d;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        z = abakVar.a;
                        str = abakVar.e;
                        aooc.af(objD);
                    } else {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aooc.af(objD);
                    }
                    aooh.e(objD, "await(...)");
                    return objD;
                }
                aooc.af(objD);
                abakVar.e = str;
                abakVar.a = z;
                abakVar.d = 1;
                if (d(abakVar) == aoluVar) {
                    return aoluVar;
                }
                a.b().l("com/google/android/libraries/abuse/hades/moirai/download/mdd/MddDownloadManager", "downloadFileGroup", 207, "MddDownloadManager.kt").J("Downloading file group for: %s, relaxDownloadConstraints = %s", str, z);
                defpackage.acvi acviVarA = defpackage.acvj.a();
                acviVarA.c(str);
                if (z) {
                    acviVarA.b(defpackage.acut.a);
                }
                ajcq ajcqVarB = this.c.b(acviVarA.a());
                abakVar.e = null;
                abakVar.d = 2;
                objD = aosv.D(ajcqVarB, abakVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                aooh.e(objD, "await(...)");
                return objD;
            } catch (java.lang.Exception e) {
                i(e);
                throw new abbe(alez.s, aley.V, (java.lang.String) null, e, (akzc) null, 0L, (defpackage.abay) null, 116);
            }
        } catch (java.lang.Exception e2) {
            i(e2);
            throw new abbe(alez.s, aley.X, (java.lang.String) null, e2, (akzc) null, 0L, (defpackage.abay) null, 116);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.abam abamVar;
        long j;
        if (aolnVar instanceof defpackage.abam) {
            abamVar = (defpackage.abam) aolnVar;
            int i = abamVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abamVar.c = i - Integer.MIN_VALUE;
            } else {
                abamVar = new defpackage.abam(this, aolnVar);
            }
        } else {
            abamVar = new defpackage.abam(this, aolnVar);
        }
        java.lang.Object objD = abamVar.a;
        defpackage.abbh abbhVar = aolu.a;
        int i2 = abamVar.c;
        int i3 = 1;
        if (i2 == 0) {
            aooc.af(objD);
            acwi acwiVar = this.c;
            aazd aazdVar = this.b;
            defpackage.acvm acvmVarA = defpackage.acvn.a();
            acvmVarA.b(aazdVar.b);
            ajcq ajcqVarD = acwiVar.d(acvmVarA.a());
            aooh.e(ajcqVarD, "getFileGroup(...)");
            abamVar.c = 1;
            objD = aosv.D(ajcqVarD, abamVar);
            if (objD != abbhVar) {
            }
            return abbhVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        defpackage.acui acuiVar = (defpackage.acui) objD;
        if (acuiVar != null) {
            j = acuiVar.i;
            i3 = 2;
        } else {
            j = 0;
        }
        abbhVar = new defpackage.abbh(i3, j);
        return abbhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object c(aoln aolnVar) throws java.lang.Throwable {
        defpackage.aban abanVar;
        boolean z;
        if (aolnVar instanceof defpackage.aban) {
            abanVar = (defpackage.aban) aolnVar;
            int i = abanVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abanVar.c = i - Integer.MIN_VALUE;
            } else {
                abanVar = new defpackage.aban(this, aolnVar);
            }
        } else {
            abanVar = new defpackage.aban(this, aolnVar);
        }
        java.lang.Object objD = abanVar.a;
        aolu aoluVar = aolu.a;
        int i2 = abanVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajda ajdaVar = this.g;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
            ahvr.bP(true, "Requested permits (%s) must be positive", 1);
            synchronized (ajdaVar.a()) {
                long jQ = ajdaVar.e.q();
                if (ajdaVar.d <= jQ) {
                    ajdaVar.b(jQ);
                    long j = ajdaVar.d;
                    double dMin = java.lang.Math.min(1.0d, ajdaVar.a);
                    ajdaVar.d = aiql.ai(ajdaVar.d, (long) ((1.0d - dMin) * ajdaVar.c));
                    ajdaVar.a -= dMin;
                    long jMax = java.lang.Math.max(j - jQ, 0L);
                    if (jMax > 0) {
                        boolean z2 = false;
                        try {
                            long nanos = java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(jMax);
                            long jNanoTime = java.lang.System.nanoTime() + nanos;
                            while (true) {
                                try {
                                    try {
                                        java.util.concurrent.TimeUnit.NANOSECONDS.sleep(nanos);
                                        break;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        z = true;
                                        if (z) {
                                            java.lang.Thread.currentThread().interrupt();
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.InterruptedException unused) {
                                    nanos = jNanoTime - java.lang.System.nanoTime();
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                java.lang.Thread.currentThread().interrupt();
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            z = z2;
                        }
                    }
                    aazd aazdVar = this.b;
                    defpackage.acvm acvmVarA = defpackage.acvn.a();
                    acvmVarA.b(aazdVar.b);
                    ajcq ajcqVarD = this.c.d(acvmVarA.a());
                    aooh.e(ajcqVarD, "getFileGroup(...)");
                    abanVar.c = 1;
                    objD = aosv.D(ajcqVarD, abanVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                }
                return null;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        defpackage.acui acuiVar = (defpackage.acui) objD;
        if (acuiVar.i != this.f.get()) {
            a.b().l("com/google/android/libraries/abuse/hades/moirai/download/mdd/MddDownloadManager", "pollForFreshProtections", 116, "MddDownloadManager.kt").y("pollForFreshProtections found a new protection for client: %s", this.b.b);
            aooh.c(acuiVar);
            return g(acuiVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.abao abaoVar;
        java.lang.Object next;
        if (aolnVar instanceof defpackage.abao) {
            abaoVar = (defpackage.abao) aolnVar;
            int i = abaoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abaoVar.c = i - Integer.MIN_VALUE;
            } else {
                abaoVar = new defpackage.abao(this, aolnVar);
            }
        } else {
            abaoVar = new defpackage.abao(this, aolnVar);
        }
        java.lang.Object objD = abaoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = abaoVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            java.util.Iterator it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                aazs aazsVar = (acvk) next;
                if ((aazsVar instanceof aazs) && aooh.n(aazsVar.a.b(), this.b.b())) {
                    break;
                }
            }
            acvk acvkVar = (acvk) next;
            if (acvkVar == null) {
                return aojh.a;
            }
            ajcq ajcqVarA = acvkVar.a(this.c);
            aooh.e(ajcqVarA, "refreshFileGroups(...)");
            abaoVar.c = 1;
            objD = aosv.D(ajcqVarA, abaoVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        a.b().l("com/google/android/libraries/abuse/hades/moirai/download/mdd/MddDownloadManager", "refreshManifest", 266, "MddDownloadManager.kt").y("Refreshed manifest for client %s.", this.b.b());
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abbe */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object e(java.lang.String str, aoln aolnVar) throws abbe {
        defpackage.abal abalVar;
        java.lang.Object objA;
        if (aolnVar instanceof defpackage.abal) {
            abalVar = (defpackage.abal) aolnVar;
            int i = abalVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                abalVar.d = i - Integer.MIN_VALUE;
            } else {
                abalVar = new defpackage.abal(this, aolnVar);
            }
        } else {
            abalVar = new defpackage.abal(this, aolnVar);
        }
        java.lang.Object objD = abalVar.b;
        aolu aoluVar = aolu.a;
        int i2 = abalVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objD);
                acwi acwiVar = this.c;
                defpackage.acvm acvmVarA = defpackage.acvn.a();
                acvmVarA.b(str);
                ajcq ajcqVarD = acwiVar.d(acvmVarA.a());
                aooh.e(ajcqVarD, "getFileGroup(...)");
                abalVar.a = str;
                abalVar.d = 1;
                objD = aosv.D(ajcqVarD, abalVar);
                if (objD != aoluVar) {
                }
                return aoluVar;
            }
            if (i2 == 1) {
                str = (java.lang.String) abalVar.a;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objD);
                    return objD;
                }
                java.lang.String str2 = abalVar.e;
                defpackage.abaq abaqVar = (defpackage.abaq) abalVar.a;
                aooc.af(objD);
                str = str2;
                this = abaqVar;
            }
            boolean zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
            abalVar.a = null;
            abalVar.e = null;
            abalVar.d = 3;
            objA = this.a(str, zBooleanValue, abalVar);
            if (objA != aoluVar) {
                return objA;
            }
            return aoluVar;
            defpackage.acui acuiVar = (defpackage.acui) objD;
            if (acuiVar != null) {
                a.b().l("com/google/android/libraries/abuse/hades/moirai/download/mdd/MddDownloadManager", "getFileGroup", 128, "MddDownloadManager.kt").y("Returning local protection for client: %s ", str);
                return acuiVar;
            }
            abalVar.a = this;
            abalVar.e = str;
            abalVar.d = 2;
            defpackage.afpl afplVar = this.h;
            java.lang.String str3 = this.b.b;
            aooh.f(str3, "clientRole");
            aazf aazfVar = (aazf) afplVar.a.get(str3);
            if (aazfVar == null) {
                aoin aoinVar = (aoin) aooh.q((j$.util.Optional) afplVar.b);
                aazfVar = aoinVar != null ? (aazf) aoinVar.a() : null;
                if (aazfVar == null) {
                    aazfVar = aazf.a;
                }
            }
            aazh aazhVar = aazfVar.b.c;
            if (aazhVar == null) {
                aazhVar = aazh.a;
            }
            int iAQ = a.aQ(aazhVar.c);
            objD = java.lang.Boolean.valueOf(iAQ != 0 && iAQ == 3);
            if (objD != aoluVar) {
                boolean zBooleanValue2 = ((java.lang.Boolean) objD).booleanValue();
                abalVar.a = null;
                abalVar.e = null;
                abalVar.d = 3;
                objA = this.a(str, zBooleanValue2, abalVar);
                if (objA != aoluVar) {
                    return objA;
                }
            }
            return aoluVar;
        } catch (java.lang.Exception e) {
            i(e);
            throw new abbe(alez.p, aley.B, (java.lang.String) null, e, (akzc) null, 0L, (defpackage.abay) null, 116);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abbe */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(boolean z, aoln aolnVar) throws abbe {
        defpackage.abap abapVar;
        defpackage.acui acuiVar;
        if (aolnVar instanceof defpackage.abap) {
            abapVar = (defpackage.abap) aolnVar;
            int i = abapVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abapVar.c = i - Integer.MIN_VALUE;
            } else {
                abapVar = new defpackage.abap(this, aolnVar);
            }
        } else {
            abapVar = new defpackage.abap(this, aolnVar);
        }
        java.lang.Object objE = abapVar.a;
        aolu aoluVar = aolu.a;
        int i2 = abapVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            aazd aazdVar = this.b;
            if (z) {
                abapVar.c = 1;
                objE = a(aazdVar.b, false, abapVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                acuiVar = (defpackage.acui) objE;
            } else {
                abapVar.c = 2;
                objE = e(aazdVar.b, abapVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                acuiVar = (defpackage.acui) objE;
            }
        } else if (i2 == 1) {
            aooc.af(objE);
            acuiVar = (defpackage.acui) objE;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
            acuiVar = (defpackage.acui) objE;
        }
        defpackage.abbk abbkVarG = g(acuiVar);
        a.b().l("com/google/android/libraries/abuse/hades/moirai/download/mdd/MddDownloadManager", "sync$<anonymous>", 83, "MddDownloadManager.kt").M("Loaded protections for client %s with protection token: %s, release config id: %s", this.b, aish.g.f().k(abbkVarG.a.D()), new java.lang.Long(abbkVarG.b));
        return abbkVarG;
    }
}
