package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agwm {
    private static defpackage.agwm a;

    public agwm(java.lang.Throwable th) {
        aooh.f(th, "throwable");
    }

    public static /* synthetic */ int a(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 7);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.agws) {
            return 0;
        }
        if (obj instanceof defpackage.agwr) {
            return 1;
        }
        if (obj instanceof defpackage.agwu) {
            return 2;
        }
        if (obj instanceof defpackage.agwt) {
            return 3;
        }
        if (obj instanceof defpackage.agww) {
            return 4;
        }
        return obj instanceof defpackage.agwv ? 5 : -2;
    }

    public static /* synthetic */ ahlc b(aoin aoinVar) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        bool.booleanValue();
        ahkv ahkvVar = new ahkv();
        ahkvVar.c(14L, java.util.concurrent.TimeUnit.DAYS);
        ahkx ahkxVar = new ahkx();
        ahkxVar.a = ahkz.a;
        ahkxVar.b(7L, java.util.concurrent.TimeUnit.DAYS);
        ahkvVar.b(ahkxVar.a());
        bool.booleanValue();
        return agab.aB(ahkvVar.a(), aoinVar);
    }

    public static boolean c(java.lang.String str, java.lang.String str2, java.util.Set set) {
        if (str.endsWith("-wal") || str.endsWith("-shm")) {
            str = str.substring(0, str.length() - 4);
        } else if (str.endsWith("-journal")) {
            str = str.substring(0, str.length() - 8);
        }
        if (!str.startsWith("SqliteKeyValueCache:") || !str.endsWith(str2)) {
            return false;
        }
        str.substring(20, str.length() - str2.length());
        return !set.contains(str);
    }

    public static ajcq d(java.util.List list, ahyp ahypVar, java.util.concurrent.Executor executor) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ajcq ajcqVarA = ((ajas) it.next()).a();
                if (ajcqVarA.isDone()) {
                    try {
                        java.lang.Object objH = aiql.H(ajcqVarA);
                        if (ajcqVarA.isCancelled() || ahypVar.a(objH)) {
                            if (!arrayList.isEmpty()) {
                                arrayList.add(ajcqVarA);
                                break;
                            }
                            return ajcqVarA;
                        }
                    } catch (java.util.concurrent.ExecutionException unused) {
                        if (arrayList.isEmpty()) {
                            return ajcqVarA;
                        }
                        arrayList.add(ajcqVarA);
                    }
                } else {
                    arrayList.add(ajcqVarA);
                }
            } catch (java.lang.Exception e) {
                ajcq ajcqVarY = aiql.y(e);
                if (arrayList.isEmpty()) {
                    return ajcqVarY;
                }
                arrayList.add(ajcqVarY);
            }
        }
        defpackage.agoj agojVar = new defpackage.agoj(arrayList, ahypVar, executor);
        ahvr.bY(agojVar.d == -1);
        ajcq ajcqVarB = agojVar.b();
        ajcqVarB.c(new defpackage.agdr(agojVar, 4), agojVar.c);
        return ajcqVarB;
    }

    public static bo e(amwv amwvVar) {
        int iD = amwvVar.d() - 1;
        if (iD == 0) {
            return amwvVar.a().a();
        }
        if (iD == 1) {
            return amwvVar.e().a();
        }
        bo boVarI = amwvVar.b().I();
        aooh.e(boVarI, "getChildFragmentManager(...)");
        return boVarI;
    }

    public static defpackage.wsk g(ahhp ahhpVar, aw awVar, defpackage.aehm aehmVar) {
        j$.util.Objects.requireNonNull(ahhpVar);
        return new defpackage.wsk(new defpackage.aprf(ahhpVar), awVar.z(), aehmVar);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    public static int h(java.lang.CharSequence charSequence, defpackage.akfv akfvVar) {
        int i;
        int iD;
        if ((akfvVar.b & 2) == 0) {
            return 2;
        }
        byte[] bArrD = akfvVar.c.D();
        if (bArrD.length == 0) {
            throw new java.lang.IllegalArgumentException("matcher data cannot be empty");
        }
        defpackage.akgi akgiVar = new defpackage.akgi(bArrD);
        defpackage.aogy aogyVar = new defpackage.aogy(charSequence);
        defpackage.akgh akghVar = new defpackage.akgh(akgiVar);
        do {
            int iOrdinal = defpackage.akgj.g[akghVar.a(0) >>> 5].ordinal();
            i = 4;
            if (iOrdinal == 0) {
                int iB = akghVar.b();
                int iB2 = iB & 15;
                if ((iB & 16) != 0) {
                    iB2 = (iB2 << 8) + akghVar.b();
                }
                iD = akghVar.d(iB2);
            } else if (iOrdinal == 1) {
                int iB3 = akghVar.b();
                if (aogyVar.g()) {
                    if ((iB3 & 15) == aogyVar.f()) {
                        iD = 1;
                    } else {
                        iD = 3;
                    }
                } else if ((iB3 & 16) != 0) {
                    iD = 2;
                } else {
                    iD = 4;
                }
            } else if (iOrdinal == 2) {
                int iB4 = akghVar.b();
                int i2 = iB4 & 15;
                int i3 = iB4 & 16;
                int i4 = i2 + 1;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0) {
                        iD = 1;
                    } else if (aogyVar.g()) {
                        aogyVar.f();
                        i4 = i5;
                    } else if (i3 != 0) {
                        iD = 2;
                    } else {
                        iD = 4;
                    }
                }
            } else if (iOrdinal == 3) {
                int iC = akghVar.c();
                if (aogyVar.g()) {
                    int iF = aogyVar.f();
                    if ((iC & 2048) != 0) {
                        iD = akghVar.e(((~iC) >>> iF) & 1);
                    } else if ((iC & (1 << iF)) != 0) {
                        iD = 1;
                    } else {
                        iD = 3;
                    }
                } else if ((iC & 4096) != 0) {
                    iD = 2;
                } else {
                    iD = 4;
                }
            } else if (iOrdinal == 4) {
                iD = defpackage.akgj.a(akghVar, aogyVar, 4);
            } else {
                if (iOrdinal != 5) {
                    throw null;
                }
                iD = defpackage.akgj.a(akghVar, aogyVar, 2);
            }
        } while (iD == 1);
        int i6 = iD - 1;
        if (i6 != 1) {
            i = i6 != 3 ? 2 : 3;
        } else if (true != aogyVar.g()) {
            i = 1;
        }
        if (i != 3) {
            return i;
        }
        return 2;
    }

    public static java.lang.String i(java.lang.CharSequence charSequence) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int iDigit = java.lang.Character.digit(charSequence.charAt(i), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akeg */
    public static defpackage.akec j(akex akexVar) throws akeg {
        boolean z;
        try {
            try {
                akexVar.b();
                z = false;
                try {
                    int iB = akexVar.b();
                    defpackage.akec akecVarZ = defpackage.akeu.z(akexVar, iB);
                    if (akecVarZ == null) {
                        return defpackage.akeu.y(akexVar, iB);
                    }
                    java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                    while (true) {
                        if (akexVar.s()) {
                            java.lang.String strI = akecVarZ instanceof defpackage.akef ? akexVar.i() : null;
                            int iB2 = akexVar.b();
                            defpackage.akec akecVarZ2 = defpackage.akeu.z(akexVar, iB2);
                            defpackage.akec akecVarY = akecVarZ2 == null ? defpackage.akeu.y(akexVar, iB2) : akecVarZ2;
                            if (akecVarZ instanceof defpackage.akeb) {
                                ((defpackage.akeb) akecVarZ).b(akecVarY);
                            } else {
                                ((defpackage.akef) akecVarZ).a.put(strI, akecVarY);
                            }
                            if (akecVarZ2 != null) {
                                arrayDeque.addLast(akecVarZ);
                                akecVarZ = akecVarY;
                            }
                        } else {
                            if (akecVarZ instanceof defpackage.akeb) {
                                akexVar.o();
                            } else {
                                akexVar.p();
                            }
                            if (arrayDeque.isEmpty()) {
                                return akecVarZ;
                            }
                            akecVarZ = (defpackage.akec) arrayDeque.removeLast();
                        }
                    }
                } catch (java.io.EOFException e) {
                    e = e;
                    if (z) {
                        return defpackage.akee.a;
                    }
                    throw new defpackage.akei(e);
                }
            } catch (java.io.EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (java.io.IOException e3) {
            throw new defpackage.aked(e3);
        } catch (java.lang.NumberFormatException e4) {
            throw new defpackage.akei(e4);
        } catch (akez e5) {
            throw new defpackage.akei((java.lang.Throwable) e5);
        }
    }

    public static java.math.BigDecimal k(java.lang.String str) {
        l(str);
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str);
        if (java.lang.Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new java.lang.NumberFormatException("Number has unsupported scale: ".concat(java.lang.String.valueOf(str)));
    }

    public static void l(java.lang.String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new java.lang.NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static defpackage.akec m(akex akexVar) {
        akej akejVar = akexVar.b;
        if (akejVar == akej.b) {
            akexVar.r(akej.a);
        }
        try {
            try {
                defpackage.akec akecVarJ = j(akexVar);
                akexVar.r(akejVar);
                return akecVarJ;
            } catch (java.lang.Throwable th) {
                akexVar.r(akejVar);
                throw th;
            }
        } catch (java.lang.OutOfMemoryError | java.lang.StackOverflowError e) {
            throw new akeg(a.bJ(akexVar, "Failed parsing JSON source: ", " to Json"), e);
        }
    }

    public static defpackage.akcm o(java.lang.String str, android.os.Parcelable.Creator creator) {
        java.lang.String strConcat = str.concat("-bin");
        anpc anpcVarW = anty.w(strConcat, creator);
        java.util.logging.Logger logger = anmv.c;
        return new defpackage.akcm(anpcVarW, new anms("REQ-".concat(strConcat), (java.lang.Object) null), new anms("RESH-".concat(strConcat), (java.lang.Object) null), new anms("REST-".concat(strConcat), (java.lang.Object) null));
    }

    public static defpackage.akcm p(java.lang.String str) {
        android.os.Parcelable.Creator creator = android.os.ParcelFileDescriptor.CREATOR;
        aooh.e(creator, "CREATOR");
        return o(str, creator);
    }

    public static aohh q(aohh aohhVar, defpackage.akcm akcmVar, android.os.Parcelable parcelable) {
        aooh.f(akcmVar, "keys");
        aooh.f(parcelable, "value");
        anph anphVar = new anph();
        aooh.f(akcmVar, "keys");
        aooh.f(parcelable, "value");
        anphVar.h(akcmVar.a, parcelable);
        return aohhVar.j(new anme[]{new aohs(anphVar)});
    }

    public static void r(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (java.lang.IndexOutOfBoundsException unused) {
            }
        }
        if (i == length) {
            byteBuffer.position(iPosition + i);
            return;
        }
        iPosition += i;
        while (i < length) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i2 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i2;
                } catch (java.lang.IndexOutOfBoundsException unused2) {
                    iPosition = i2;
                }
            } else {
                if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                    int i3 = i + 1;
                    if (i3 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i3);
                            if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                int i4 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    int i5 = iPosition + 2;
                                    try {
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i = i3;
                                    } catch (java.lang.IndexOutOfBoundsException unused3) {
                                        i = i3;
                                        iPosition = i5;
                                    }
                                } catch (java.lang.IndexOutOfBoundsException unused4) {
                                    iPosition = i4;
                                    i = i3;
                                }
                            } else {
                                i = i3;
                            }
                        } catch (java.lang.IndexOutOfBoundsException unused5) {
                        }
                        i = i3;
                        int iPosition2 = byteBuffer.position() + java.lang.Math.max(i, (iPosition - byteBuffer.position()) + 1);
                        throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + iPosition2);
                    }
                    throw new defpackage.ajyv(i, length);
                }
                int i6 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            iPosition++;
            i++;
        }
        byteBuffer.position(iPosition);
    }

    public static void s() {
        if (a == null) {
            a = new defpackage.agwm((byte[]) null);
        }
    }

    public static anty t(anmv anmvVar, anmb anmbVar, anty antyVar) {
        return ((akaw) anmbVar.f(defpackage.akax.a)).i() ? new defpackage.akcp(anmvVar, antyVar) : antyVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Set] */
    public static ajyk u(defpackage.ulw ulwVar, java.util.Set set) {
        java.lang.String string;
        ahoq ahoqVarW = ahvr.W(1498, "CronetConfigurationModule#getCronetEngine");
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            try {
                try {
                    java.lang.Object obj = ulwVar.a;
                    ?? r7 = ulwVar.c;
                    org.chromium.net.ExperimentalCronetEngine.Builder builder = new org.chromium.net.ExperimentalCronetEngine.Builder((android.content.Context) obj);
                    java.util.Iterator it = r7.iterator();
                    while (it.hasNext()) {
                        builder.addQuicHint(((defpackage.akas) it.next()).a, 443, 443);
                    }
                    android.os.StrictMode.ThreadPolicy threadPolicy2 = android.os.StrictMode.getThreadPolicy();
                    try {
                        android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
                        builder.enableQuic(true);
                        akaw akawVar = ((defpackage.akau) ulwVar.b).b;
                        boolean zK = akawVar.k();
                        boolean zN = akawVar.n();
                        boolean zO = akawVar.o();
                        if (akawVar.k()) {
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                if (!jSONObject.has("QUIC")) {
                                    jSONObject.put("QUIC", new org.json.JSONObject());
                                }
                                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("QUIC");
                                aooh.e(jSONObject2, "getJSONObject(...)");
                                if (!jSONObject2.has("migrate_sessions_on_network_change_v2")) {
                                    jSONObject2.put("migrate_sessions_on_network_change_v2", zK);
                                }
                                if (!jSONObject2.has("migrate_sessions_early_v2")) {
                                    jSONObject2.put("migrate_sessions_early_v2", zN);
                                }
                                if (!jSONObject2.has("retry_on_alternate_network_before_handshake")) {
                                    jSONObject2.put("retry_on_alternate_network_before_handshake", zO);
                                }
                                string = jSONObject.toString();
                            } catch (org.json.JSONException e) {
                                defpackage.akau.a.d().l("com/google/frameworks/client/data/android/cronet/ExperimentalOptionMerger", "mergeOptions", 52, "ExperimentalOptionMerger.kt").u(e);
                                string = null;
                            }
                        } else {
                            string = null;
                        }
                        builder.setExperimentalOptions(string);
                        android.os.StrictMode.setThreadPolicy(threadPolicy2);
                        android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
                        org.chromium.net.ExperimentalCronetEngine experimentalCronetEngineBuild = builder.build();
                        java.lang.Boolean.FALSE.booleanValue();
                        builder.getDefaultUserAgent();
                        ajyk ajykVar = new ajyk(experimentalCronetEngineBuild, (byte[]) null);
                        android.os.StrictMode.setThreadPolicy(threadPolicy);
                        ahoqVarW.close();
                        java.lang.Object obj2 = ajykVar.b;
                        java.util.Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            ((org.chromium.net.CronetEngine) obj2).addRequestFinishedListener((org.chromium.net.RequestFinishedInfo.Listener) it2.next());
                        }
                        return ajykVar;
                    } catch (java.lang.Throwable th) {
                        android.os.StrictMode.setThreadPolicy(threadPolicy2);
                        throw th;
                    }
                } catch (java.lang.IllegalStateException e2) {
                    throw e2;
                }
            } catch (java.lang.Throwable th2) {
                android.os.StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ defpackage.uzx v(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.uzx(akzxVar);
    }

    public static ajsz w(anmv anmvVar, anmc anmcVar, anpk anpkVar, anmb anmbVar) {
        if (!((akaw) anmbVar.f(defpackage.akax.a)).i()) {
            return anmcVar.b(anpkVar, anmbVar);
        }
        anmv anmvVarA = anmvVar.a();
        try {
            return anmcVar.b(anpkVar, anmbVar);
        } finally {
            anmvVar.f(anmvVarA);
        }
    }

    public final void f(bo boVar) {
        try {
            boVar.al((java.lang.String) null, 1);
            java.util.List<amyp> listK = boVar.k();
            aooh.e(listK, "getFragments(...)");
            if (listK.isEmpty()) {
                return;
            }
            u uVar = new u(boVar);
            for (amyp amypVar : listK) {
                if (amypVar instanceof amyp) {
                    java.lang.Object objB = amypVar.B();
                    aooh.e(objB, "generatedComponent(...)");
                    if (objB instanceof defpackage.agnz) {
                        uVar.k(amypVar);
                    }
                }
                bo boVarI = amypVar.I();
                aooh.e(boVarI, "getChildFragmentManager(...)");
                boVarI.af();
                f(boVarI);
            }
            if (uVar.h()) {
                return;
            }
            uVar.s();
            uVar.c();
        } catch (java.lang.IllegalStateException e) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            boVar.G("fm_state", (java.io.FileDescriptor) null, new java.io.PrintWriter(stringWriter), new java.lang.String[0]);
            defpackage.agoa.a.c().k(e).l("com/google/apps/tiktok/account/api/controller/ActivityAccountState$Companion", "clearFragments", 319, "ActivityAccountState.kt").y("popBackStackImmediate failure, fragment state %s", new akct(akcs.a, stringWriter.toString()));
            throw e;
        }
    }

    public ahyn n(aiom aiomVar) {
        java.lang.String str = (java.lang.String) defpackage.akcw.a(aiomVar, defpackage.akcy.a);
        return str == null ? ahwt.a : ahyn.h(aiql.z(str));
    }

    public agwm() {
    }

    public agwm(byte[] bArr) {
    }

    public agwm(byte[] bArr, byte[] bArr2) {
        this();
    }

    public agwm(java.lang.Object obj, byte[] bArr) {
        ahvr.cj(obj, "Request message cannot be null");
    }

    public agwm(anph anphVar) {
        ahvr.ci(anphVar);
    }

    public agwm(java.lang.Object obj) {
        ahvr.cj(obj, "Response message cannot be null");
    }
}
