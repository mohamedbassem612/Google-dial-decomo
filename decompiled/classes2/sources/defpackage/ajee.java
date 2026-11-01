package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajee {
    public static volatile anpk a;
    public static volatile anpk b;

    private ajee() {
    }

    public static final /* synthetic */ zoe A(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new zoe(akzzVar);
    }

    public static final /* synthetic */ zoe B(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new zoe(akzzVar);
    }

    public static final /* synthetic */ vaa C(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static final /* synthetic */ zoe D(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static final /* synthetic */ ajyi E(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    public static final /* synthetic */ ajyi F(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    private static akzx G(java.lang.Throwable th, boolean z) {
        java.lang.StackTraceElement[] stackTrace;
        akzx akzxVarM = defpackage.aiwh.a.m();
        java.lang.String name = th.getClass().getName();
        akzxVarM.u();
        defpackage.aiwh aiwhVar = (defpackage.aiwh) akzxVarM.b;
        j$.util.Objects.requireNonNull(name);
        aiwhVar.b |= 1;
        aiwhVar.c = name;
        if (z && th.getMessage() != null) {
            java.lang.String message = th.getMessage();
            akzxVarM.u();
            defpackage.aiwh aiwhVar2 = (defpackage.aiwh) akzxVarM.b;
            j$.util.Objects.requireNonNull(message);
            aiwhVar2.b |= 2;
            aiwhVar2.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (java.lang.NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                akzx akzxVarM2 = defpackage.aiwg.a.m();
                if (stackTraceElement != null) {
                    java.lang.String className = stackTraceElement.getClassName();
                    akzxVarM2.u();
                    defpackage.aiwg aiwgVar = (defpackage.aiwg) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(className);
                    aiwgVar.b |= 1;
                    aiwgVar.c = className;
                    java.lang.String methodName = stackTraceElement.getMethodName();
                    akzxVarM2.u();
                    defpackage.aiwg aiwgVar2 = (defpackage.aiwg) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(methodName);
                    aiwgVar2.b |= 2;
                    aiwgVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    akzxVarM2.u();
                    defpackage.aiwg aiwgVar3 = (defpackage.aiwg) akzxVarM2.b;
                    aiwgVar3.b |= 8;
                    aiwgVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        java.lang.String fileName = stackTraceElement.getFileName();
                        akzxVarM2.u();
                        defpackage.aiwg aiwgVar4 = (defpackage.aiwg) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(fileName);
                        aiwgVar4.b |= 4;
                        aiwgVar4.e = fileName;
                    }
                }
                akzxVarM.u();
                defpackage.aiwh aiwhVar3 = (defpackage.aiwh) akzxVarM.b;
                defpackage.aiwg aiwgVar5 = (defpackage.aiwg) akzxVarM2.p();
                j$.util.Objects.requireNonNull(aiwgVar5);
                alat alatVar = aiwhVar3.f;
                if (!alatVar.c()) {
                    aiwhVar3.f = alad.J(alatVar);
                }
                aiwhVar3.f.add(aiwgVar5);
            }
        }
        return akzxVarM;
    }

    @java.lang.Deprecated
    public static void a(defpackage.ajex ajexVar, defpackage.ajey ajeyVar) throws java.io.IOException {
        try {
            if (((defpackage.ajlk) ajeyVar).a.putString(((defpackage.ajlk) ajeyVar).b, agmc.am(ajexVar.g(defpackage.ajfj.b).i())).commit()) {
            } else {
                throw new java.io.IOException("Failed to write to SharedPreferences");
            }
        } catch (java.security.GeneralSecurityException e) {
            throw new java.io.IOException("Cannot write keyset: key cannot be serialized", e);
        }
    }

    public static final j$.time.Duration b(j$.time.Instant instant, j$.time.Instant instant2) {
        aooh.f(instant, "<this>");
        aooh.f(instant2, "start");
        j$.time.Duration durationBetween = j$.time.Duration.between(instant2, instant);
        aooh.e(durationBetween, "between(...)");
        return durationBetween;
    }

    public static final java.lang.Object c(j$.time.Duration duration, aoln aolnVar) {
        java.lang.Object objK = aosv.k(aorh.j(aooh.B(duration.getSeconds(), aorj.d), aooh.A(duration.getNano(), aorj.a)), aolnVar);
        return objK != aolu.a ? aojh.a : objK;
    }

    public static long d(int i) {
        return ((long) i) & 4294967295L;
    }

    public static byte e(long j) {
        ahvr.bQ((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static ajsz f(byte[] bArr, ajel ajelVar) throws java.security.GeneralSecurityException {
        ajff ajffVar = (ajff) ajelVar.a(ajff.class);
        if (ajffVar == null) {
            throw new java.security.GeneralSecurityException("Provided configuration cannot be used to parse ProtoParametersFormat.");
        }
        try {
            defpackage.ajpz ajpzVar = (defpackage.ajpz) alad.B(defpackage.ajpz.a, bArr, akzq.a);
            java.lang.String str = ajpzVar.b;
            int iAa = a.aa(ajpzVar.d);
            if (iAa == 0) {
                iAa = 1;
            }
            return ajffVar.c(aogc.C(str, aftt.C(iAa), ajpzVar.c));
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] g(ajsz ajszVar, ajel ajelVar) throws java.security.GeneralSecurityException {
        ajff ajffVar = (ajff) ajelVar.a(ajff.class);
        if (ajffVar == null) {
            throw new java.security.GeneralSecurityException("Provided configuration cannot be used to serialize in ProtoParametersFormat.");
        }
        aogc aogcVarD = ajffVar.d(ajszVar);
        akzx akzxVarM = defpackage.ajpz.a.m();
        java.lang.Object obj = aogcVarD.b;
        akzxVarM.u();
        defpackage.ajpz ajpzVar = (defpackage.ajpz) akzxVarM.b;
        j$.util.Objects.requireNonNull(obj);
        ajpzVar.b = (java.lang.String) obj;
        java.lang.Object obj2 = aogcVarD.c;
        akzxVarM.u();
        defpackage.ajpz ajpzVar2 = (defpackage.ajpz) akzxVarM.b;
        j$.util.Objects.requireNonNull(obj2);
        ajpzVar2.c = (akzc) obj2;
        int iE = aftt.E((ajfe) aogcVarD.a);
        akzxVarM.u();
        ((defpackage.ajpz) akzxVarM.b).d = a.S(iE);
        return ((defpackage.ajpz) akzxVarM.p()).i();
    }

    public static int h(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static long[] i(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        ahvr.bQ(length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            java.lang.System.arraycopy(jArr4, 0, jArr3, i2, length2);
            i2 += length2;
        }
        return jArr3;
    }

    public static int j(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static java.util.List k(float... fArr) {
        int length = fArr.length;
        return length == 0 ? java.util.Collections.EMPTY_LIST : new defpackage.aizf(fArr, 0, length);
    }

    public static int l(byte[] bArr, byte b2, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static java.util.List m(byte... bArr) {
        int length = bArr.length;
        return length == 0 ? java.util.Collections.EMPTY_LIST : new defpackage.aizd(bArr, 0, length);
    }

    public static byte[] n(java.util.Collection collection) {
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = array[i];
            ahvr.ci(obj);
            bArr[i] = ((java.lang.Number) obj).byteValue();
        }
        return bArr;
    }

    public static /* synthetic */ int o(int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = java.lang.Integer.highestOneBit(i2 - 1) << 1;
        }
        return iHighestOneBit < 0 ? androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY : iHighestOneBit;
    }

    public static long p(double d) {
        ahvr.bN(q(d), "not a normal value");
        int exponent = java.lang.Math.getExponent(d);
        long jDoubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean q(double d) {
        return java.lang.Math.getExponent(d) <= 1023;
    }

    public static akzx r(java.lang.Throwable th, boolean z) {
        akzx akzxVarM = defpackage.aiwk.a.m();
        akzx akzxVarM2 = defpackage.aiwh.a.m();
        akzxVarM2.u();
        defpackage.aiwh aiwhVar = (defpackage.aiwh) akzxVarM2.b;
        j$.util.Objects.requireNonNull("");
        aiwhVar.b |= 1;
        aiwhVar.c = "";
        akzxVarM.u();
        defpackage.aiwk aiwkVar = (defpackage.aiwk) akzxVarM.b;
        defpackage.aiwh aiwhVar2 = (defpackage.aiwh) akzxVarM2.p();
        j$.util.Objects.requireNonNull(aiwhVar2);
        aiwkVar.e = aiwhVar2;
        aiwkVar.b |= 1;
        java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.add(th);
        identityHashMap.put(th, 0);
        arrayList.add(s(th, z));
        while (!arrayDeque.isEmpty()) {
            java.lang.Throwable th2 = (java.lang.Throwable) arrayDeque.remove();
            int iIntValue = ((java.lang.Integer) j$.util.Objects.requireNonNull((java.lang.Integer) identityHashMap.get(th2))).intValue();
            if (th2.getCause() != null) {
                java.lang.Throwable cause = th2.getCause();
                if (!identityHashMap.containsKey(cause)) {
                    identityHashMap.put(cause, java.lang.Integer.valueOf(identityHashMap.size()));
                    arrayList.add(s(cause, z));
                    arrayDeque.add(cause);
                }
                akzx akzxVar = (akzx) arrayList.get(iIntValue);
                int iIntValue2 = ((java.lang.Integer) identityHashMap.get(cause)).intValue();
                akzxVar.u();
                defpackage.aiwj aiwjVar = (defpackage.aiwj) akzxVar.b;
                defpackage.aiwj aiwjVar2 = defpackage.aiwj.a;
                aiwjVar.b |= 2;
                aiwjVar.d = iIntValue2;
            }
            for (java.lang.Throwable th3 : th2.getSuppressed()) {
                if (!identityHashMap.containsKey(th3)) {
                    identityHashMap.put(th3, java.lang.Integer.valueOf(identityHashMap.size()));
                    arrayList.add(s(th3, z));
                    arrayDeque.add(th3);
                }
                akzx akzxVar2 = (akzx) arrayList.get(iIntValue);
                int iIntValue3 = ((java.lang.Integer) identityHashMap.get(th3)).intValue();
                akzxVar2.u();
                defpackage.aiwj aiwjVar3 = (defpackage.aiwj) akzxVar2.b;
                defpackage.aiwj aiwjVar4 = defpackage.aiwj.a;
                alak alakVar = aiwjVar3.e;
                if (!alakVar.c()) {
                    aiwjVar3.e = alad.H(alakVar);
                }
                aiwjVar3.e.g(iIntValue3);
            }
        }
        akzx akzxVarM3 = defpackage.aiwi.a.m();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            akzx akzxVar3 = (akzx) arrayList.get(i);
            akzxVarM3.u();
            defpackage.aiwi aiwiVar = (defpackage.aiwi) akzxVarM3.b;
            defpackage.aiwj aiwjVar5 = (defpackage.aiwj) akzxVar3.p();
            j$.util.Objects.requireNonNull(aiwjVar5);
            aiwiVar.b();
            aiwiVar.b.add(aiwjVar5);
        }
        akzxVarM.u();
        defpackage.aiwk aiwkVar2 = (defpackage.aiwk) akzxVarM.b;
        defpackage.aiwi aiwiVar2 = (defpackage.aiwi) akzxVarM3.p();
        j$.util.Objects.requireNonNull(aiwiVar2);
        aiwkVar2.d = aiwiVar2;
        aiwkVar2.c = 4;
        return akzxVarM;
    }

    public static akzx s(java.lang.Throwable th, boolean z) {
        akzx akzxVarM = defpackage.aiwj.a.m();
        akzx akzxVarG = G(th, z);
        akzxVarM.u();
        defpackage.aiwj aiwjVar = (defpackage.aiwj) akzxVarM.b;
        defpackage.aiwh aiwhVar = (defpackage.aiwh) akzxVarG.p();
        j$.util.Objects.requireNonNull(aiwhVar);
        aiwjVar.c = aiwhVar;
        aiwjVar.b |= 1;
        return akzxVarM;
    }

    public static akzx t(java.lang.Throwable th) {
        akzx akzxVarM = defpackage.aiwk.a.m();
        akzx akzxVarG = G(th, false);
        akzxVarM.u();
        defpackage.aiwk aiwkVar = (defpackage.aiwk) akzxVarM.b;
        defpackage.aiwh aiwhVar = (defpackage.aiwh) akzxVarG.p();
        j$.util.Objects.requireNonNull(aiwhVar);
        aiwkVar.e = aiwhVar;
        aiwkVar.b |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return akzxVarM;
            }
            akzx akzxVarG2 = G(th, false);
            akzxVarM.u();
            defpackage.aiwk aiwkVar2 = (defpackage.aiwk) akzxVarM.b;
            defpackage.aiwh aiwhVar2 = (defpackage.aiwh) akzxVarG2.p();
            j$.util.Objects.requireNonNull(aiwhVar2);
            aiwkVar2.b();
            aiwkVar2.f.add(aiwhVar2);
        }
    }

    public static final /* synthetic */ ajyi u(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    public static final /* synthetic */ ajyi v(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    public static final amjn w(defpackage.amjq amjqVar) {
        aooh.f(amjqVar, "<this>");
        amjp amjpVar = (amjp) amjqVar;
        if ((amjpVar.b & 1) == 0) {
            return null;
        }
        amjn amjnVar = amjpVar.c;
        return amjnVar == null ? amjn.a : amjnVar;
    }

    public static final amjr x(defpackage.amjq amjqVar) {
        aooh.f(amjqVar, "<this>");
        amjp amjpVar = (amjp) amjqVar;
        if ((amjpVar.b & 2) == 0) {
            return null;
        }
        amjr amjrVar = amjpVar.d;
        return amjrVar == null ? amjr.a : amjrVar;
    }

    public static final amjs y(amjo amjoVar) {
        amjn amjnVar = (amjn) amjoVar;
        int i = amjnVar.b;
        if (i == 1) {
            return i == 1 ? (amjs) amjnVar.c : amjs.a;
        }
        return null;
    }

    public static final /* synthetic */ uzx z(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }
}
