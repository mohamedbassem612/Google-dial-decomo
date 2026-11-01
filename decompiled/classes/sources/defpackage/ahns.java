package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahns {
    public static boolean a;
    public static final java.util.concurrent.atomic.AtomicReference b;
    public static final java.util.WeakHashMap c;
    public static final defpackage.ahnr d;
    public static final java.util.Deque e;
    public static final java.util.Deque f;
    public static final java.lang.Object g;
    public static final java.lang.Runnable h;
    public static int i;
    public static int j;
    public static defpackage.ahpj k;
    private static final defpackage.aihd l;
    private static defpackage.aihd m;

    static {
        defpackage.aihd aihdVarV = defpackage.aihd.v("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl", "com.google.apps.tiktok.tracing.contrib.mdd.MddTraceFlush", new java.lang.String[0]);
        l = aihdVarV;
        m = aihdVarV;
        a = true;
        b = new java.util.concurrent.atomic.AtomicReference(defpackage.aikn.a);
        c = new java.util.WeakHashMap();
        d = new defpackage.ahnr();
        e = new java.util.ArrayDeque();
        f = new java.util.ArrayDeque();
        g = new java.lang.Object();
        h = new defpackage.aafk(5);
        j = 0;
    }

    public static defpackage.ahpe a() {
        return (defpackage.ahpe) d.get();
    }

    public static defpackage.ahpj b() {
        return ((defpackage.ahpe) d.get()).c;
    }

    public static defpackage.ahpj c(boolean z) {
        defpackage.ahpe ahpeVar = (defpackage.ahpe) d.get();
        defpackage.ahpj ahpjVar = ahpeVar.c;
        return (ahpjVar == null || (ahpjVar == defpackage.ahoo.a && !z)) ? defpackage.ahob.m(ahpeVar) : ahpjVar;
    }

    public static defpackage.ahpj d(defpackage.ahpe ahpeVar, defpackage.ahpj ahpjVar) {
        return ahpeVar.e != null ? s(ahpeVar, ahpjVar, 2) : s(ahpeVar, ahpjVar, 4);
    }

    public static defpackage.ahpj e(defpackage.ahpe ahpeVar, defpackage.ahpj ahpjVar) {
        defpackage.ahpj ahpjVar2 = ahpeVar.d;
        ahpeVar.d = ahpjVar;
        return ahpjVar2;
    }

    public static defpackage.ahpm f() {
        m(false);
        return new defpackage.ahno(1);
    }

    public static defpackage.ahpm g() {
        defpackage.ahpe ahpeVar = (defpackage.ahpe) d.get();
        if (!ahpeVar.a) {
            return new ahnv(1);
        }
        java.io.Closeable closeableM = ahpeVar.c;
        if (closeableM == null) {
            closeableM = defpackage.ahob.m(ahpeVar);
        }
        e.add(closeableM);
        defpackage.afec.a().post(h);
        return new defpackage.ahno(0);
    }

    public static defpackage.ahpm h() {
        defpackage.ahpj ahpjVarB = b();
        u(defpackage.ahoo.a);
        return new defpackage.ahmv((java.lang.Object) ahpjVarB, 3);
    }

    public static java.lang.String i(java.lang.String str) {
        return str.length() > 127 ? str.substring(0, 127) : str;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x024e  */
    public static java.lang.String j(defpackage.ahpj ahpjVar) {
        ahoz ahozVar;
        int i2;
        int i3;
        ahoy ahoyVar;
        ahox ahoxVar;
        int i4;
        ahoy ahoyVar2;
        int i5 = 0;
        int length = 0;
        defpackage.ahpj ahpjVarB = ahpjVar;
        while (ahpjVarB != null) {
            i5++;
            length += ahpjVarB.d().length();
            ahpjVarB = ahpjVarB.b();
            if (ahpjVarB != null) {
                length += 4;
            }
        }
        if (i5 > 250) {
            java.lang.String[] strArr = new java.lang.String[i5];
            defpackage.ahpj ahpjVarB2 = ahpjVar;
            for (int i6 = i5 - 1; i6 >= 0; i6--) {
                strArr[i6] = ahpjVarB2.d();
                ahpjVarB2 = ahpjVarB2.b();
            }
            defpackage.aigb aigbVar = new defpackage.aigb(4);
            defpackage.ailj it = defpackage.aihd.p(strArr).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                aigbVar.i(it.next(), java.lang.Integer.valueOf(i7));
                i7++;
            }
            int i8 = 1;
            defpackage.aigf aigfVarE = aigbVar.e(true);
            int i9 = ((defpackage.aikj) aigfVarE).d;
            int i10 = i5 >> 2;
            if (i9 <= i10) {
                int i11 = i5 + 1;
                int[] iArr = new int[i11];
                for (int i12 = 0; i12 < i5; i12++) {
                    iArr[i12] = ((java.lang.Integer) aigfVarE.get(strArr[i12])).intValue();
                }
                iArr[i5] = i9;
                ahpa ahpaVar = new ahpa(iArr);
                int i13 = 0;
                while (true) {
                    int i14 = -1;
                    if (i13 >= i11) {
                        break;
                    }
                    ahpaVar.f += i8;
                    int[] iArr2 = ahpaVar.a;
                    int i15 = iArr2[i13];
                    while (true) {
                        ahoy ahoyVar3 = null;
                        while (true) {
                            if (ahpaVar.f <= 0) {
                                i4 = i8;
                                break;
                            }
                            int i16 = ahpaVar.e;
                            ahoyVar2 = ahpaVar.c;
                            i4 = i8;
                            if (i16 == 0) {
                                break;
                            }
                            int i17 = ((ahoy) ahoyVar2.d.get(java.lang.Integer.valueOf(iArr2[ahpaVar.d]))).a;
                            int i18 = ahpaVar.e;
                            if (iArr2[i17 + i18] == i15) {
                                if (ahoyVar3 != null) {
                                    ahoyVar3.c = ahpaVar.c;
                                }
                                ahpaVar.e = i18 + 1;
                                ahpaVar.b();
                                break;
                            }
                            ahoy ahoyVar4 = (ahoy) ahpaVar.c.d.get(java.lang.Integer.valueOf(iArr2[ahpaVar.d]));
                            int i19 = ahoyVar4.a;
                            int i20 = i14;
                            ahoy ahoyVar5 = new ahoy(i19, (ahpaVar.e + i19) - 1);
                            ahpaVar.c.d.put(java.lang.Integer.valueOf(iArr2[ahpaVar.d]), ahoyVar5);
                            java.util.Map map = ahoyVar5.d;
                            int i21 = ahoyVar5.b + 1;
                            map.put(java.lang.Integer.valueOf(iArr2[i21]), ahoyVar4);
                            ahoyVar4.a = i21;
                            if (ahoyVar3 != null) {
                                ahoyVar3.c = ahoyVar5;
                            }
                            map.put(java.lang.Integer.valueOf(i15), new ahoy(i13, 1073741824));
                            ahpaVar.f--;
                            ahpaVar.a();
                            ahoyVar3 = ahoyVar5;
                            i8 = i4;
                            i14 = i20;
                        }
                        java.util.Map map2 = ahoyVar2.d;
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i15);
                        if (map2.containsKey(numValueOf)) {
                            if (ahoyVar3 != null) {
                                ahoyVar3.c = ahpaVar.c;
                            }
                            ahpaVar.d = i13;
                            ahpaVar.e++;
                            ahpaVar.b();
                            break;
                        }
                        ahpaVar.c.d.put(numValueOf, new ahoy(i13, 1073741824));
                        if (ahoyVar3 != null) {
                            ahoyVar3.c = ahpaVar.c;
                        }
                        ahpaVar.f += i14;
                        ahpaVar.a();
                        i8 = i4;
                    }
                    i13++;
                    i8 = i4;
                }
                int i22 = i8;
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                ahoy ahoyVar6 = ahpaVar.b;
                ahox ahoxVar2 = new ahox(ahoyVar6, 0, -1, -1);
                arrayDeque.push(ahoxVar2);
                while (!arrayDeque.isEmpty()) {
                    ahox ahoxVar3 = (ahox) arrayDeque.pop();
                    for (ahoy ahoyVar7 : ((ahoy) ahoxVar3.d).d.values()) {
                        int i23 = ahoxVar3.b;
                        int i24 = ahoxVar3.c;
                        int i25 = ahoyVar7.a;
                        int i26 = ahoyVar7.b;
                        if (ahpaVar.c(i23, i24, i25, i26)) {
                            ahoyVar = ahoyVar6;
                        } else {
                            if (ahoyVar7.d.isEmpty()) {
                                int i27 = ahoyVar7.a;
                                ahoyVar = ahoyVar6;
                                if (ahpaVar.c(i23, i24, i27, (i27 + i24) - i23)) {
                                }
                                if (ahoxVar2.a < ahoxVar.a) {
                                    ahoxVar2 = ahoxVar;
                                }
                                arrayDeque.push(ahoxVar);
                                ahoyVar6 = ahoyVar;
                                i22 = 1;
                            } else {
                                ahoyVar = ahoyVar6;
                            }
                            ahoxVar = new ahox(ahoyVar7, i22, ahoyVar7.a, i26);
                            if (ahoxVar2.a < ahoxVar.a) {
                                ahoxVar2 = ahoxVar;
                            }
                            arrayDeque.push(ahoxVar);
                            ahoyVar6 = ahoyVar;
                            i22 = 1;
                        }
                        ahoxVar = new ahox(ahoyVar7, ahoxVar3.a + i22, i23, i24);
                        if (ahoxVar2.a < ahoxVar.a) {
                            ahoxVar2 = ahoxVar;
                        }
                        arrayDeque.push(ahoxVar);
                        ahoyVar6 = ahoyVar;
                        i22 = 1;
                    }
                    i22 = 1;
                }
                int[] iArr3 = ahpaVar.a;
                int iMin = java.lang.Math.min(iArr3.length, ahoxVar2.c + 1);
                ahoy ahoyVar8 = ahoyVar6;
                int i28 = 0;
                loop9: while (true) {
                    i2 = ahoxVar2.b;
                    i3 = iMin - i2;
                    ahoyVar8 = (ahoy) ahoyVar8.d.get(java.lang.Integer.valueOf(iArr3[(i28 % i3) + i2]));
                    if (ahoyVar8 == null) {
                        break;
                    }
                    for (int i29 = ahoyVar8.a; i29 < ahoyVar8.b + 1 && i29 < iArr3.length; i29++) {
                        if (iArr3[(i28 % i3) + i2] != iArr3[i29]) {
                            break loop9;
                        }
                        i28++;
                    }
                }
                ahoz ahozVar2 = new ahoz(i2, iMin, i28 / i3);
                if (ahozVar2.c * (ahozVar2.b - ahozVar2.a) < i10) {
                    ahozVar = null;
                } else {
                    ahozVar = ahozVar2;
                }
            } else {
                ahozVar = null;
            }
            java.lang.String str = "";
            if (ahozVar != null) {
                int i30 = ahozVar.a;
                java.lang.String strConcat = i30 > 0 ? java.lang.String.valueOf(android.text.TextUtils.join(" -> ", java.util.Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = ahozVar.b;
                int i32 = ahozVar.c;
                int i33 = ((i31 - i30) * i32) + i30;
                str = java.lang.String.format(java.util.Locale.US, "%s{%s}x%d%s", strConcat, android.text.TextUtils.join(" -> ", java.util.Arrays.copyOfRange(strArr, i30, i31)), java.lang.Integer.valueOf(i32), i33 < i5 ? " -> ".concat(java.lang.String.valueOf(android.text.TextUtils.join(" -> ", java.util.Arrays.copyOfRange(strArr, i33, i5)))) : "");
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[length];
        defpackage.ahpj ahpjVarB3 = ahpjVar;
        while (ahpjVarB3 != null) {
            java.lang.String strD = ahpjVarB3.d();
            length -= strD.length();
            strD.getChars(0, strD.length(), cArr, length);
            ahpjVarB3 = ahpjVarB3.b();
            if (ahpjVarB3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new java.lang.String(cArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahnp */
    /* JADX INFO: Thrown type has an unknown type hierarchy: ahnq */
    static void k(defpackage.ahpj ahpjVar) throws ahnp, ahnq {
        defpackage.ahpe ahpeVar = (defpackage.ahpe) d.get();
        defpackage.ahpj ahpjVar2 = ahpeVar.c;
        if (ahpjVar2 == null) {
            throw new ahnp("Tried to end [" + ahpjVar.d() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (ahpjVar == ahpjVar2) {
            d(ahpeVar, ahpjVar2.b());
            return;
        }
        throw new ahnq("Tried to end span " + ahpjVar.d() + ", but that span is not the current span. The current span is " + ahpjVar2.d() + '.');
    }

    public static void l() {
        int i2 = i;
        int i3 = i2 - 1;
        i = i3;
        if (i3 < 0) {
            throw new java.lang.IllegalStateException("More calls to pause than to resume");
        }
        if (j == i2) {
            defpackage.ahvr.bZ(!f.isEmpty(), "current async trace should not be null");
            d((defpackage.ahpe) d.get(), null);
            j = 0;
        }
    }

    public static void m(boolean z) {
        java.lang.IllegalStateException illegalStateExceptionW;
        defpackage.ahpk ahpkVar = defpackage.ahpl.a;
        defpackage.ahpk ahpkVar2 = defpackage.ahpk.b;
        i++;
        if (j == 0) {
            boolean z2 = z & (ahpkVar == ahpkVar2);
            defpackage.ahpe ahpeVar = (defpackage.ahpe) d.get();
            defpackage.ahpj ahpjVar = ahpeVar.c;
            if (ahpjVar != null) {
                if (z2 && (ahpjVar instanceof defpackage.ahnj) && !((defpackage.ahnj) ahpjVar).i()) {
                    java.lang.IllegalStateException illegalStateExceptionW2 = w(ahpjVar);
                    illegalStateExceptionW2.printStackTrace();
                    i--;
                    throw illegalStateExceptionW2;
                }
                return;
            }
            java.util.Deque deque = f;
            defpackage.ahpj ahpjVar2 = (defpackage.ahpj) deque.peek();
            if (!z2 || (illegalStateExceptionW = w(ahpjVar2)) == null) {
                if (ahpjVar2 != null) {
                    d(ahpeVar, ahpjVar2);
                    j = i;
                    return;
                }
                return;
            }
            if (!x(ahpjVar2, illegalStateExceptionW)) {
                illegalStateExceptionW.printStackTrace();
                i--;
                throw illegalStateExceptionW;
            }
            if (ahpjVar2 == null) {
                defpackage.ahnh ahnhVar = defpackage.ahob.a;
                java.util.UUID uuidB = defpackage.ahnt.a.b();
                java.lang.String strFo = defpackage.ahms.fo(uuidB);
                defpackage.ahob.s();
                defpackage.ahob ahobVar = new defpackage.ahob(uuidB, strFo, illegalStateExceptionW, true, ahpeVar);
                deque.push(ahobVar);
                d(ahpeVar, ahobVar);
            } else {
                d(ahpeVar, ahpjVar2);
            }
            j = i;
        }
    }

    public static void n() {
        defpackage.ahpj ahpjVar;
        i++;
        if (j == 0) {
            defpackage.ahpe ahpeVarA = a();
            if (ahpeVarA.c != null || (ahpjVar = (defpackage.ahpj) f.peek()) == null) {
                return;
            }
            d(ahpeVarA, ahpjVar);
            j = i;
        }
    }

    static void o(defpackage.aihd aihdVar) {
        defpackage.aihb aihbVar = new defpackage.aihb();
        aihbVar.k(aihdVar);
        aihbVar.k(l);
        m = aihbVar.g();
    }

    public static boolean p(java.lang.Throwable th) {
        if (m.isEmpty()) {
            return false;
        }
        for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
            java.lang.String string = stackTraceElement.toString();
            defpackage.ailj it = m.iterator();
            while (it.hasNext()) {
                if (string.startsWith((java.lang.String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean q() {
        defpackage.ahpj ahpjVar = ((defpackage.ahpe) d.get()).c;
        return (ahpjVar == null || ahpjVar == defpackage.ahoo.a) ? false : true;
    }

    public static boolean r() {
        defpackage.ahpj ahpjVar = (defpackage.ahpj) f.peek();
        if (ahpjVar == null || ((ahpjVar instanceof defpackage.ahnj) && !((defpackage.ahnj) ahpjVar).i())) {
            return false;
        }
        n();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d A[PHI: r8
      0x009d: PHI (r8v2 ahpj) = (r8v6 ahpj), (r8v0 ahpj) binds: [B:60:0x009b, B:55:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    static defpackage.ahpj s(defpackage.ahpe ahpeVar, defpackage.ahpj ahpjVar, int i2) {
        int i3;
        defpackage.ahpj ahpjVar2;
        defpackage.ahpj ahpjVar3;
        defpackage.ahpj ahpjVar4;
        defpackage.ahpj ahpjVar5 = ahpeVar.c;
        if (ahpjVar5 == ahpjVar && (i2 == 2 || i2 == 4 || ahpjVar5 == null)) {
            return ahpjVar;
        }
        if (ahpjVar5 == null) {
            ahpeVar.b = da$.ExternalSyntheticApiModelOutline0.m();
        }
        defpackage.ahne ahneVar = ahpeVar.e;
        if (ahpeVar.b) {
            if (ahneVar != null) {
                int i4 = i2 - 1;
                if (i4 == 0) {
                    ahpjVar3 = ahpjVar;
                    ahpjVar4 = null;
                } else if (i4 != 2) {
                    ahpjVar3 = ahpjVar;
                    ahpjVar4 = ahpjVar5;
                } else {
                    ahpjVar4 = ahpjVar5;
                    ahpjVar3 = null;
                }
                if (ahpjVar4 != null) {
                    if (ahpjVar3 != null) {
                        if (ahpjVar4.b() == ahpjVar3 && !ahneVar.d(ahpjVar4)) {
                            android.os.Trace.endSection();
                        } else if (ahpjVar4 == ahpjVar3.b() && !ahneVar.d(ahpjVar3)) {
                            defpackage.ahne.a(ahpjVar3);
                        }
                    }
                    ahneVar.c(ahpjVar4);
                    if (ahpjVar3 != null) {
                        ahneVar.b(ahpjVar3);
                    }
                } else if (ahpjVar3 != null) {
                    ahneVar.b(ahpjVar3);
                }
            } else {
                if (ahpjVar5 != null) {
                    if (ahpjVar == null) {
                        ahpjVar2 = null;
                    } else if (ahpjVar5.b() == ahpjVar && !defpackage.agab.aA(ahpjVar5)) {
                        android.os.Trace.endSection();
                    } else if (ahpjVar5 != ahpjVar.b() || defpackage.agab.aA(ahpjVar)) {
                        ahpjVar2 = ahpjVar;
                    } else {
                        defpackage.agab.ax(ahpjVar);
                    }
                    defpackage.agab.az(ahpjVar5);
                } else {
                    ahpjVar2 = ahpjVar;
                }
                if (ahpjVar2 != null) {
                    defpackage.agab.ay(ahpjVar2);
                }
            }
        }
        if (ahpjVar5 == ahpjVar) {
            return ahpjVar;
        }
        if (ahpjVar != null) {
            if (ahpjVar.q()) {
                int iCurrentThreadTimeMillis = (int) android.os.SystemClock.currentThreadTimeMillis();
                i3 = iCurrentThreadTimeMillis - ahpeVar.f;
                if (i3 > 0 && ahpjVar5 != null && ahpjVar5.q()) {
                    ahpjVar5.o(i3);
                }
                ahpeVar.f = iCurrentThreadTimeMillis;
            }
            ahpeVar.c = ahpjVar;
            if (i2 == 2) {
                if (ahneVar != null) {
                    throw new java.lang.NullPointerException("Coroutine is executing but trace storage is not being set.");
                }
                ahneVar.a = ahpjVar;
            }
            return ahpjVar5;
        }
        ahpjVar = null;
        if (ahpjVar5 != null && ahpjVar5.q()) {
            int iCurrentThreadTimeMillis2 = (int) android.os.SystemClock.currentThreadTimeMillis();
            i3 = iCurrentThreadTimeMillis2 - ahpeVar.f;
            if (i3 > 0) {
                ahpjVar5.o(i3);
            }
            ahpeVar.f = iCurrentThreadTimeMillis2;
        }
        ahpeVar.c = ahpjVar;
        if (i2 == 2) {
            if (ahneVar != null) {
                throw new java.lang.NullPointerException("Coroutine is executing but trace storage is not being set.");
            }
            ahneVar.a = ahpjVar;
        }
        return ahpjVar5;
    }

    public static void t(boolean z) {
        java.lang.IllegalStateException illegalStateException;
        if (defpackage.ahpl.a()) {
            defpackage.ahpj ahpjVar = ((defpackage.ahpe) d.get()).c;
            if (ahpjVar == null || (ahpjVar instanceof defpackage.ahoo)) {
                illegalStateException = new java.lang.IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.");
            } else {
                illegalStateException = ahpjVar instanceof defpackage.ahnj ? new java.lang.IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((defpackage.ahnj) ahpjVar).h()) : null;
            }
            if (illegalStateException == null || x(ahpjVar, illegalStateException)) {
                return;
            }
            if (!z && defpackage.ahpl.a != defpackage.ahpk.c) {
                throw illegalStateException;
            }
            android.util.Log.e("Tracer", "Missing trace", illegalStateException);
        }
    }

    public static void u(defpackage.ahpj ahpjVar) {
        d((defpackage.ahpe) d.get(), ahpjVar);
    }

    public static defpackage.ahor v(defpackage.ahpj ahpjVar, defpackage.agab agabVar) {
        defpackage.ahor ahorVarD = defpackage.ahor.d(2);
        while (ahpjVar != null) {
            ahorVarD = ahpjVar.k(agabVar);
            if (ahorVarD.c() - 1 == 0) {
                break;
            }
            ahpjVar = ahpjVar.b();
        }
        return ahorVarD;
    }

    private static java.lang.IllegalStateException w(defpackage.ahpj ahpjVar) {
        if (ahpjVar == null || (ahpjVar instanceof defpackage.ahoo)) {
            return new java.lang.IllegalStateException("Was supposed to have a trace - did you commit a FragmentManager transaction without one? Most fragment transactions should use commitNow(), as trace can be lost in async operations like commit(). If you have to use commit(), refer to http://go/tiktok-tracing/handling_missing_traces.md#fragment-transactions for more details.");
        }
        if (ahpjVar instanceof defpackage.ahnj) {
            return new java.lang.IllegalStateException("Was supposed to have a trace - did you commit a FragmentManager transaction without one? See this exception's cause for the last place a trace was missing. Note most fragment transactions should use commitNow(), as trace can be lost in async operations like commit(). If you have to use commit(), refer to http://go/tiktok-tracing/handling_missing_traces.md#fragment-transactions for more details.", ((defpackage.ahnj) ahpjVar).h());
        }
        return null;
    }

    private static boolean x(defpackage.ahpj ahpjVar, java.lang.IllegalStateException illegalStateException) {
        return ahpjVar instanceof defpackage.ahnj ? ((defpackage.ahnj) ahpjVar).i() : p(illegalStateException);
    }
}
