package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akxm {
    private static java.lang.ref.SoftReference f;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public akxm(akxk akxkVar) {
        zzd zzdVar = akxkVar.a;
        android.content.Context context = null;
        if (zzdVar == null) {
            aooh.j("clearcutLogger");
            zzdVar = null;
        }
        this.a = zzdVar;
        java.lang.String str = akxkVar.c;
        if (str == null) {
            aooh.j("packageName");
            str = null;
        }
        this.b = str;
        this.c = akxkVar.d;
        this.d = akxkVar.e;
        android.content.Context context2 = akxkVar.b;
        if (context2 == null) {
            aooh.j("context");
        } else {
            context = context2;
        }
        this.e = abtl.b(context, new defpackage.alfe());
    }

    public static defpackage.akxm d(java.lang.String str, akzc akzcVar, ajfd ajfdVar, ajfe ajfeVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (num != null) {
            if (ajfeVar.equals(ajfe.d)) {
                throw new java.security.GeneralSecurityException("Cannot set idRequirement for OutputPrefixType RAW");
            }
        } else if (!ajfeVar.equals(ajfe.d)) {
            throw new java.security.GeneralSecurityException("Cannot have null idRequirement unless OutputPrefixType is RAW");
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new java.security.GeneralSecurityException(a.bu(i, str, "typeURL ", " contains non-ascii character at position "));
            }
        }
        return new defpackage.akxm(str, akzcVar, ajfdVar, ajfeVar, num);
    }

    public static final java.lang.String h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return str + '$' + str2 + '/' + str3 + '/' + str4;
    }

    public static synchronized defpackage.akxm j(android.content.Context context, defpackage.aajl aajlVar) {
        defpackage.akxm akxmVar;
        java.lang.ref.SoftReference softReference = f;
        if (softReference != null && (akxmVar = (defpackage.akxm) softReference.get()) != null) {
            return akxmVar;
        }
        defpackage.afpl afplVar = new defpackage.afpl(context, (char[]) null);
        if (defpackage.uzx.b == null) {
            defpackage.uzx.b = new defpackage.uzx((char[]) null);
        }
        defpackage.akxm akxmVar2 = new defpackage.akxm(context, afplVar, defpackage.uzx.b, (defpackage.aaje) new aajf(), aajlVar);
        f = new java.lang.ref.SoftReference(akxmVar2);
        return akxmVar2;
    }

    private final boolean l(java.io.File file) throws java.lang.Throwable {
        boolean z;
        android.util.Pair pairL;
        try {
            try {
                java.lang.Object obj = this.b;
                try {
                    java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file.getAbsolutePath(), "r");
                    if (randomAccessFile.length() < 22) {
                        pairL = null;
                    } else {
                        pairL = defpackage.xhp.l(randomAccessFile, 0);
                        if (pairL == null) {
                            pairL = defpackage.xhp.l(randomAccessFile, 65535);
                        }
                    }
                    try {
                        if (pairL == null) {
                            throw new xqp("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                        }
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) pairL.first;
                        long jLongValue = ((java.lang.Long) pairL.second).longValue();
                        long j = (-20) + jLongValue;
                        if (j >= 0) {
                            randomAccessFile.seek(j);
                            if (randomAccessFile.readInt() == 1347094023) {
                                throw new xqp("ZIP64 APK not supported");
                            }
                        }
                        afsq.bN(byteBuffer);
                        long jK = defpackage.xhp.k(byteBuffer, byteBuffer.position() + 16);
                        if (jK >= jLongValue) {
                            throw new xqp("ZIP Central Directory offset out of range: " + jK + ". ZIP End of Central Directory offset: " + jLongValue);
                        }
                        afsq.bN(byteBuffer);
                        if (jK + defpackage.xhp.k(byteBuffer, byteBuffer.position() + 12) != jLongValue) {
                            throw new xqp("ZIP Central Directory is not immediately followed by End of Central Directory");
                        }
                        if (jK < 32) {
                            throw new xqp(a.bz(jK, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                        }
                        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(24);
                        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(jK - ((long) byteBufferAllocate.capacity()));
                        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                            throw new xqp("No APK Signing Block before ZIP Central Directory");
                        }
                        long j2 = byteBufferAllocate.getLong(0);
                        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
                            throw new xqp(a.bz(j2, "APK Signing Block size out of range: "));
                        }
                        int i = (int) (8 + j2);
                        long j3 = jK - ((long) i);
                        if (j3 < 0) {
                            throw new xqp(a.bz(j3, "APK Signing Block offset out of range: "));
                        }
                        java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(i);
                        byteBufferAllocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(j3);
                        try {
                            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                            try {
                                long j4 = byteBufferAllocate2.getLong(0);
                                if (j4 != j2) {
                                    throw new xqp("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                                }
                                android.util.Pair pairCreate = android.util.Pair.create(byteBufferAllocate2, java.lang.Long.valueOf(j3));
                                java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) pairCreate.first;
                                long jLongValue2 = ((java.lang.Long) pairCreate.second).longValue();
                                afsq.bN(byteBuffer2);
                                int iCapacity = byteBuffer2.capacity() - 24;
                                if (iCapacity < 8) {
                                    throw new java.lang.IllegalArgumentException("end < start: " + iCapacity + " < 8");
                                }
                                int iCapacity2 = byteBuffer2.capacity();
                                if (iCapacity > byteBuffer2.capacity()) {
                                    throw new java.lang.IllegalArgumentException(a.bf(iCapacity2, iCapacity, "end > capacity: ", " > "));
                                }
                                int iLimit = byteBuffer2.limit();
                                int iPosition = byteBuffer2.position();
                                try {
                                    byteBuffer2.position(0);
                                    byteBuffer2.limit(iCapacity);
                                    byteBuffer2.position(8);
                                    java.nio.ByteBuffer byteBufferSlice = byteBuffer2.slice();
                                    byteBufferSlice.order(byteBuffer2.order());
                                    byteBuffer2.position(0);
                                    byteBuffer2.limit(iLimit);
                                    byteBuffer2.position(iPosition);
                                    int i2 = 0;
                                    while (byteBufferSlice.hasRemaining()) {
                                        i2++;
                                        if (byteBufferSlice.remaining() < 8) {
                                            throw new xqp(a.bj(i2, "Insufficient data to read size of APK Signing Block entry #"));
                                        }
                                        long j5 = byteBufferSlice.getLong();
                                        if (j5 < 4 || j5 > 2147483647L) {
                                            throw new xqp("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                                        }
                                        int i3 = (int) j5;
                                        int iPosition2 = byteBufferSlice.position() + i3;
                                        if (i3 > byteBufferSlice.remaining()) {
                                            throw new xqp("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                                        }
                                        if (byteBufferSlice.getInt() == 1896449818) {
                                            java.security.cert.X509Certificate[][] x509CertificateArrM = defpackage.xhp.m(j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), new defpackage.xqo(afsq.bO(byteBufferSlice, i3 - 4), jLongValue2, jK, jLongValue, byteBuffer));
                                            randomAccessFile.close();
                                            try {
                                                try {
                                                    randomAccessFile.close();
                                                } catch (java.security.GeneralSecurityException e) {
                                                    e = e;
                                                    z = false;
                                                    android.util.Log.e("DG", "APK at " + file.getAbsolutePath() + " failed signature verification", e);
                                                    return z;
                                                }
                                            } catch (xqp e2) {
                                                e = e2;
                                            } catch (java.io.IOException unused) {
                                            } catch (java.lang.RuntimeException e3) {
                                                e = e3;
                                                throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
                                            }
                                            if (x509CertificateArrM.length != 1) {
                                                throw new java.security.GeneralSecurityException("APK has more than one signature.");
                                            }
                                            byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA-256").digest(x509CertificateArrM[0][0].getEncoded());
                                            return java.util.Arrays.equals(((aajf) obj).d, bArrDigest) || (!"user".equals(android.os.Build.TYPE) && java.util.Arrays.equals(((aajf) obj).c, bArrDigest));
                                        }
                                        byteBufferSlice.position(iPosition2);
                                    }
                                    throw new xqp("No APK Signature Scheme v2 block in APK Signing Block");
                                } catch (java.lang.Throwable th) {
                                    byteBuffer2.position(0);
                                    byteBuffer2.limit(iLimit);
                                    byteBuffer2.position(iPosition);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                try {
                                    try {
                                        randomAccessFile.close();
                                    } catch (java.io.IOException unused2) {
                                    }
                                    try {
                                        throw th;
                                    } catch (java.io.IOException e4) {
                                        e = e4;
                                        throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
                                    }
                                } catch (java.lang.RuntimeException e5) {
                                    e = e5;
                                    throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
                                } catch (xqp e6) {
                                    e = e6;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        randomAccessFile.close();
                        throw th;
                    }
                } catch (java.lang.RuntimeException e7) {
                    e = e7;
                    throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
                } catch (xqp e8) {
                    e = e8;
                } catch (java.io.IOException e9) {
                    e = e9;
                    throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
                }
                throw new java.security.GeneralSecurityException("Package is not signed", e);
            } catch (java.security.GeneralSecurityException e10) {
                e = e10;
                z = false;
            }
        } catch (java.security.GeneralSecurityException e11) {
            e = e11;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, zzu] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r1v1, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void a(ahzi ahziVar, ahzi ahziVar2, akxy akxyVar, boolean z, int i, defpackage.akxf akxfVar) throws aois {
        ?? AY;
        aooh.f(akxyVar, "policy");
        java.lang.Object objEZ = this.c.eZ();
        aooh.e(objEZ, "get(...)");
        int iIntValue = ((java.lang.Number) objEZ).intValue();
        if (iIntValue <= 0 || ((java.util.Random) this.d).nextInt(iIntValue) != 0) {
            return;
        }
        ?? EZ = ahziVar.eZ();
        if (EZ.isEmpty()) {
            AY = EZ;
            AY = ajsz.aY(0);
        }
        AY = EZ;
        aooh.e((java.lang.Object) AY, "ifEmpty(...)");
        ?? EZ2 = ahziVar2.eZ();
        boolean zIsEmpty = EZ2.isEmpty();
        ?? AY2 = EZ2;
        if (zIsEmpty) {
            AY2 = ajsz.aY(0);
        }
        aooh.e((java.lang.Object) AY2, "ifEmpty(...)");
        akzx akzxVarM = defpackage.alff.a.m();
        aooh.f(akzxVarM, "builder");
        java.lang.Object obj = this.b;
        aooh.f(obj, "value");
        akzxVarM.u();
        defpackage.alff alffVar = (defpackage.alff) akzxVarM.b;
        j$.util.Objects.requireNonNull(obj);
        alffVar.b |= 1;
        alffVar.c = (java.lang.String) obj;
        long jIntValue = ((java.lang.Number) AY.get(0)).intValue();
        akzxVarM.u();
        defpackage.alff alffVar2 = (defpackage.alff) akzxVarM.b;
        int i2 = 2;
        alffVar2.b |= 2;
        alffVar2.d = jIntValue;
        long jIntValue2 = ((java.lang.Number) AY2.get(0)).intValue();
        akzxVarM.u();
        defpackage.alff alffVar3 = (defpackage.alff) akzxVarM.b;
        alffVar3.b |= 4;
        alffVar3.e = jIntValue2;
        aooh.f(akxyVar, "value");
        akzxVarM.u();
        defpackage.alff alffVar4 = (defpackage.alff) akzxVarM.b;
        alffVar4.f = akxyVar.a();
        alffVar4.b |= 8;
        int i3 = true != z ? 3 : 2;
        akzxVarM.u();
        defpackage.alff alffVar5 = (defpackage.alff) akzxVarM.b;
        alffVar5.h = i3 - 1;
        alffVar5.b |= 32;
        akzxVarM.u();
        defpackage.alff alffVar6 = (defpackage.alff) akzxVarM.b;
        alffVar6.j = 2;
        alffVar6.b |= 128;
        akzxVarM.u();
        defpackage.alff alffVar7 = (defpackage.alff) akzxVarM.b;
        alffVar7.b |= 256;
        alffVar7.k = iIntValue;
        akzxVarM.u();
        defpackage.alff alffVar8 = (defpackage.alff) akzxVarM.b;
        alffVar8.b |= 64;
        alffVar8.i = i;
        int iOrdinal = akxfVar.ordinal();
        if (iOrdinal == 0) {
            i2 = 3;
        } else if (iOrdinal != 1) {
            throw new aois();
        }
        akzxVarM.u();
        defpackage.alff alffVar9 = (defpackage.alff) akzxVarM.b;
        alffVar9.g = i2 - 1;
        alffVar9.b |= 16;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.alff alffVar10 = (defpackage.alff) aladVarP;
        akzx akzxVarM2 = defpackage.alfg.a.m();
        aooh.f(akzxVarM2, "builder");
        aooh.f(alffVar10, "value");
        akzxVarM2.u();
        defpackage.alfg alfgVar = (defpackage.alfg) akzxVarM2.b;
        j$.util.Objects.requireNonNull(alffVar10);
        alfgVar.c = alffVar10;
        alfgVar.b |= 1;
        alad aladVarP2 = akzxVarM2.p();
        aooh.e(aladVarP2, "build(...)");
        ((zzd) this.a).h((defpackage.alfg) aladVarP2, (zzu) this.e).d();
    }

    public final boolean b() {
        return ((java.lang.Boolean) this.b).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final void c(ajcq ajcqVar, j$.time.Duration duration, java.lang.String str) {
        java.lang.String str2;
        defpackage.ahiy ahiyVar = (defpackage.ahiy) this.d.a();
        try {
            aiql.H(ajcqVar);
            java.lang.Object obj = this.e;
            java.lang.Object obj2 = ((aogc) obj).b;
            ahiyVar.b((java.lang.String) obj2, ((aogc) obj).p(), str, "success");
            str2 = str;
            try {
                ahiyVar.c(duration.toMillis(), (java.lang.String) obj2, ((aogc) obj).p(), str2, "success");
            } catch (java.util.concurrent.CancellationException unused) {
                aogc aogcVar = (aogc) this.e;
                java.lang.String strP = aogcVar.p();
                java.lang.String str3 = (java.lang.String) aogcVar.b;
                ahiyVar.b(str3, strP, str2, "cancellation");
                ahiyVar.c(duration.toMillis(), str3, aogcVar.p(), str2, "cancellation");
            } catch (java.lang.Exception unused2) {
                aogc aogcVar2 = (aogc) this.e;
                java.lang.String strP2 = aogcVar2.p();
                java.lang.String str4 = (java.lang.String) aogcVar2.b;
                ahiyVar.b(str4, strP2, str2, "failure");
                ahiyVar.c(duration.toMillis(), str4, aogcVar2.p(), str2, "failure");
            }
        } catch (java.util.concurrent.CancellationException unused3) {
            str2 = str;
        } catch (java.lang.Exception unused4) {
            str2 = str;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) throws aois {
        adtn adtnVar;
        if (aolnVar instanceof adtn) {
            adtnVar = (adtn) aolnVar;
            int i = adtnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                adtnVar.b = i - Integer.MIN_VALUE;
            } else {
                adtnVar = new adtn(this, aolnVar);
            }
        } else {
            adtnVar = new adtn(this, aolnVar);
        }
        java.lang.Object objB = adtnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adtnVar.b;
        if (i2 == 0) {
            aooc.af(objB);
            java.lang.Object obj = this.b;
            adtnVar.b = 1;
            objB = ((adao) obj).b(adtnVar);
            if (objB != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
            return objB;
        }
        aooc.af(objB);
        if (((java.lang.CharSequence) objB).length() > 0) {
            java.lang.String strB = ango.a.b().b();
            if (aooh.n(strB, "CHIME")) {
                return adzu.a;
            }
            if (aooh.n(strB, "GNP")) {
                return adzu.b;
            }
        }
        if (((aduu) this.e).l == 0) {
            throw new aois();
        }
        java.lang.Object obj2 = this.b;
        adtnVar.b = 2;
        java.lang.Object objI = ((adao) obj2).i(adtnVar);
        if (objI != aoluVar) {
            return objI;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object f(akti aktiVar, aoln aolnVar) {
        adto adtoVar;
        if (aolnVar instanceof adto) {
            adtoVar = (adto) aolnVar;
            int i = adtoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                adtoVar.b = i - Integer.MIN_VALUE;
            } else {
                adtoVar = new adto(this, aolnVar);
            }
        } else {
            adtoVar = new adto(this, aolnVar);
        }
        java.lang.Object obj = adtoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adtoVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r8 = this.a;
            defpackage.acju acjuVar = new defpackage.acju(this, aktiVar, (aoln) null, 18);
            adtoVar.b = 1;
            if (aoov.aj((aolr) r8, acjuVar, adtoVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    public final void g(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo g3AttributionInfo) {
        java.util.Map map = (java.util.Map) this.a.get(str);
        java.util.Map map2 = map != null ? (java.util.Map) map.get(str2) : null;
        java.util.Set set = map2 != null ? (java.util.Set) map2.get(g3AttributionInfo) : null;
        if (set != null) {
            set.remove(str3);
            if (set.isEmpty()) {
                map2.remove(g3AttributionInfo);
            }
        }
        java.util.Map map3 = (java.util.Map) this.c.get(str);
        java.util.Set set2 = map3 != null ? (java.util.Set) map3.get(g3AttributionInfo) : null;
        if (set2 != null) {
            set2.remove(str3);
            if (set2.isEmpty()) {
                map3.remove(g3AttributionInfo);
            }
        }
        java.util.Map map4 = (java.util.Map) this.b.get(str2);
        java.util.Set set3 = map4 != null ? (java.util.Set) map4.get(g3AttributionInfo) : null;
        if (set3 != null) {
            set3.remove(str3);
            if (set3.isEmpty()) {
                map4.remove(g3AttributionInfo);
            }
        }
        ?? r3 = this.e;
        java.util.Set set4 = (java.util.Set) r3.get(g3AttributionInfo);
        if (set4 != null) {
            set4.remove(str3);
            if (set4.isEmpty()) {
                r3.remove(g3AttributionInfo);
            }
        }
    }

    public final synchronized boolean i(defpackage.aajh aajhVar) {
        try {
            if (((defpackage.uzx) this.a).K(aajhVar) != null || ((defpackage.afpl) this.d).Q(aajhVar) != null) {
                return true;
            }
        } catch (defpackage.aajc unused) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0230 A[Catch: ClassNotFoundException -> 0x024b, aajc -> 0x0254, all -> 0x025f, TryCatch #12 {aajc -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:140:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x023b A[Catch: ClassNotFoundException -> 0x024b, aajc -> 0x0254, all -> 0x025f, TryCatch #12 {aajc -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:140:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01a1 A[Catch: ClassNotFoundException -> 0x024b, aajc -> 0x0254, all -> 0x025f, TRY_ENTER, TryCatch #12 {aajc -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:140:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab A[Catch: ClassNotFoundException -> 0x024b, aajc -> 0x0254, all -> 0x025f, TryCatch #12 {aajc -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:140:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b1 A[Catch: ClassNotFoundException -> 0x024b, aajc -> 0x0254, all -> 0x025f, TryCatch #12 {aajc -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:140:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01be A[Catch: ClassNotFoundException -> 0x024b, aajc -> 0x0254, all -> 0x025f, TRY_LEAVE, TryCatch #12 {aajc -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:140:0x0189, outer: #15 }] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.List] */
    public final synchronized defpackage.uzx k(defpackage.aajh aajhVar, android.os.Parcelable parcelable, java.io.FileInputStream fileInputStream) {
        java.lang.Class clsK;
        defpackage.aajd aajdVarQ;
        java.io.File file;
        if (i(aajhVar)) {
            clsK = ((defpackage.uzx) this.a).K(aajhVar);
            if (clsK != null) {
                defpackage.afpl.V(((defpackage.afpl) this.d).P(aajhVar.a));
            } else {
                aajdVarQ = ((defpackage.afpl) this.d).Q(aajhVar);
                if (aajdVarQ != null) {
                    throw new aajg(a.bk(aajhVar.a, "VM key ", " not found in the cache"));
                }
                if (a.o()) {
                    aajdVarQ.a.setWritable(false, false);
                }
                file = aajdVarQ.a;
                if (l(file)) {
                    defpackage.afpl.U(aajdVarQ);
                    throw new java.lang.ClassNotFoundException("APK signature verification failed");
                }
                ((defpackage.aajl) this.c).c(7, defpackage.aajk.c);
                dalvik.system.DexClassLoader dexClassLoader = new dalvik.system.DexClassLoader(file.getAbsolutePath(), aajdVarQ.b.getAbsolutePath(), null, ((android.content.Context) this.e).getClassLoader());
                ((defpackage.aajl) this.c).c(8, defpackage.aajk.c);
                clsK = dexClassLoader.loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                ((defpackage.uzx) this.a).a.put(aajhVar, clsK);
            }
            ((defpackage.aajl) this.c).c(9, defpackage.aajk.c);
        } else {
            java.lang.Object obj = this.d;
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(java.util.UUID.randomUUID()));
            aaoo aaooVar = defpackage.aana.a;
            java.io.File fileR = ((defpackage.afpl) obj).R();
            int i = defpackage.aanc.a;
            java.io.File file2 = new java.io.File(aaoo.j(fileR, strValueOf.concat(".apk")));
            try {
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                    try {
                        java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                        try {
                            java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary2 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary2.transferFrom(fileChannelConvertMaybeLegacyFileChannelFromLibrary, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary2 != null) {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary2.close();
                                }
                                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                }
                                fileOutputStream.close();
                                ?? r4 = ((defpackage.afpl) obj).a;
                                synchronized (r4) {
                                    try {
                                        defpackage.aajd aajdVarO = ((defpackage.afpl) obj).O();
                                        r4.add(aajdVarO.a());
                                        java.io.File fileA = aajdVarO.a();
                                        if (fileA.exists() || fileA.mkdirs()) {
                                            java.io.File file3 = aajdVarO.b;
                                            if (file3.exists() || file3.mkdirs()) {
                                                try {
                                                    java.io.File file4 = aajdVarO.c;
                                                    if (file4.exists() || file4.createNewFile()) {
                                                        java.io.File file5 = aajdVarO.a;
                                                        defpackage.afpl.T(file2, file5);
                                                        defpackage.aajd aajdVarP = ((defpackage.afpl) obj).P(aajhVar.a);
                                                        if (aajdVarP.a().exists()) {
                                                            defpackage.aajd aajdVarO2 = ((defpackage.afpl) obj).O();
                                                            ((defpackage.afpl) obj).a.add(aajdVarO2.a());
                                                            defpackage.afpl.T(aajdVarP.a(), aajdVarO2.a());
                                                        }
                                                        defpackage.afpl.V(aajdVarO);
                                                        if (a.o()) {
                                                            file5.setWritable(false, false);
                                                        }
                                                        defpackage.afpl.T(aajdVarO.a(), aajdVarP.a());
                                                        java.lang.String[] list = ((defpackage.afpl) obj).R().list();
                                                        ahvr.bH(list);
                                                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                                                        for (java.lang.String str : list) {
                                                            defpackage.aajd aajdVarP2 = ((defpackage.afpl) obj).P(str);
                                                            if (aajdVarP2.b()) {
                                                                java.io.File file6 = aajdVarP2.c;
                                                                if (!file6.exists() || jCurrentTimeMillis >= file6.lastModified() + 1209600000) {
                                                                    defpackage.afpl.U(aajdVarP2);
                                                                }
                                                            }
                                                        }
                                                        ((defpackage.afpl) obj).S();
                                                    }
                                                } catch (java.io.IOException unused) {
                                                }
                                            }
                                        }
                                        throw new defpackage.aajc(a.bG((byte) 46, aajdVarO, "Failed to make directories for "));
                                    } catch (java.lang.Throwable th) {
                                        ((defpackage.afpl) obj).S();
                                        throw th;
                                    }
                                }
                                file2.delete();
                                ((defpackage.aajl) this.c).c(6, defpackage.aajk.c);
                                try {
                                    try {
                                        clsK = ((defpackage.uzx) this.a).K(aajhVar);
                                        if (clsK != null) {
                                            try {
                                                defpackage.afpl.V(((defpackage.afpl) this.d).P(aajhVar.a));
                                            } catch (defpackage.aajc unused2) {
                                            }
                                        } else {
                                            aajdVarQ = ((defpackage.afpl) this.d).Q(aajhVar);
                                            if (aajdVarQ != null) {
                                                throw new aajg(a.bk(aajhVar.a, "VM key ", " not found in the cache"));
                                            }
                                            if (a.o()) {
                                                aajdVarQ.a.setWritable(false, false);
                                            }
                                            file = aajdVarQ.a;
                                            if (l(file)) {
                                                defpackage.afpl.U(aajdVarQ);
                                                throw new java.lang.ClassNotFoundException("APK signature verification failed");
                                            }
                                            ((defpackage.aajl) this.c).c(7, defpackage.aajk.c);
                                            try {
                                                dalvik.system.DexClassLoader dexClassLoader2 = new dalvik.system.DexClassLoader(file.getAbsolutePath(), aajdVarQ.b.getAbsolutePath(), null, ((android.content.Context) this.e).getClassLoader());
                                                ((defpackage.aajl) this.c).c(8, defpackage.aajk.c);
                                                clsK = dexClassLoader2.loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                                                ((defpackage.uzx) this.a).a.put(aajhVar, clsK);
                                            } catch (java.lang.SecurityException e) {
                                                android.util.Log.w("DG", "Failed to load APK at ".concat(java.lang.String.valueOf(aajdVarQ.a.getAbsolutePath())), e);
                                                throw new java.lang.ClassNotFoundException("Failed to create ClassLoader", e);
                                            }
                                        }
                                        ((defpackage.aajl) this.c).c(9, defpackage.aajk.c);
                                    } catch (defpackage.aajc e2) {
                                        throw new aajg("Exception in VM cache lookup", e2);
                                    }
                                } catch (java.lang.ClassNotFoundException e3) {
                                    throw new aajg("Couldn't load VM class", e3);
                                }
                            } catch (java.lang.Throwable th2) {
                                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary2 == null) {
                                    throw th2;
                                }
                                try {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary2.close();
                                    throw th2;
                                } catch (java.lang.Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (java.lang.Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th5) {
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                                throw th5;
                            }
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                throw th5;
                            } catch (java.lang.Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        fileOutputStream.close();
                        throw th7;
                    }
                } catch (java.lang.Throwable th8) {
                    file2.delete();
                    throw th8;
                }
            } catch (java.lang.Exception e4) {
                throw new aaji(e4);
            }
        }
        throw th;
        return new defpackage.uzx(clsK, (android.content.Context) this.e, parcelable);
    }

    public akxm(android.content.Context context, defpackage.afpl afplVar, defpackage.uzx uzxVar, defpackage.aaje aajeVar, defpackage.aajl aajlVar) {
        this.e = context;
        this.d = afplVar;
        this.a = uzxVar;
        this.b = aajeVar;
        this.c = aajlVar;
    }

    public akxm(android.content.Context context, java.util.concurrent.Executor executor, aolr aolrVar, xtq xtqVar) {
        this.e = context;
        this.b = executor;
        this.d = aolrVar;
        this.a = xtqVar;
        this.c = null;
    }

    public akxm(aogc aogcVar, java.lang.Boolean bool, aoin aoinVar, ajct ajctVar, defpackage.ahid ahidVar) {
        this.e = aogcVar;
        this.b = bool;
        this.d = aoinVar;
        this.c = ajctVar;
        this.a = ahidVar;
    }

    private akxm(java.lang.String str, akzc akzcVar, ajfd ajfdVar, ajfe ajfeVar, java.lang.Integer num) {
        this.b = str;
        this.d = akzcVar;
        this.e = ajfdVar;
        this.c = ajfeVar;
        this.a = num;
    }

    public akxm(defpackage.abmm abmmVar, aomy aomyVar, aomy aomyVar2, bfy bfyVar, defpackage.abmk abmkVar) {
        aooh.f(abmmVar, "colors");
        aooh.f(bfyVar, "cornerSize");
        aooh.f(abmkVar, "layer");
        this.a = abmmVar;
        this.b = aomyVar;
        this.c = aomyVar2;
        this.e = bfyVar;
        this.d = abmkVar;
        aooh.f(abmmVar, "<this>");
        int i = abmmVar.a;
        int i2 = abmmVar.b;
        int i3 = abmmVar.c;
    }

    public akxm(adzz adzzVar, adao adaoVar, aolr aolrVar, aoin aoinVar, aduu aduuVar) {
        aooh.f(adzzVar, "gnpRegistrationHandler");
        aooh.f(adaoVar, "gnpRegistrationDataHelper");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aoinVar, "inappPushEnabledFlag");
        aooh.f(aduuVar, "gnpConfig");
        this.d = adzzVar;
        this.b = adaoVar;
        this.a = aolrVar;
        this.c = aoinVar;
        this.e = aduuVar;
    }

    public akxm(aogc aogcVar, ahyn ahynVar, ajct ajctVar, ahyn ahynVar2, ahyn ahynVar3) {
        this.e = aogcVar;
        this.b = (java.lang.Boolean) ((ahys) ahynVar).a;
        this.a = ajctVar;
        this.d = ahynVar2;
        this.c = ahynVar3;
    }

    public akxm() {
        this.d = new aca();
        this.a = new aca();
        this.c = new aca();
        this.b = new aca();
        this.e = new aca();
    }
}
