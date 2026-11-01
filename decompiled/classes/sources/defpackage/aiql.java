package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aiql {
    public aiql() {
    }

    public static defpackage.ajcq A(defpackage.ajcq ajcqVar) {
        if (ajcqVar.isDone()) {
            return ajcqVar;
        }
        defpackage.ajcg ajcgVar = new defpackage.ajcg(ajcqVar);
        ajcqVar.c(ajcgVar, defpackage.ajbm.INSTANCE);
        return ajcgVar;
    }

    public static defpackage.ajcq B(defpackage.ajas ajasVar, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(ajasVar);
        ajdkVar.c(new ahts(scheduledExecutorService.schedule(ajdkVar, j, timeUnit), 6), defpackage.ajbm.INSTANCE);
        return ajdkVar;
    }

    public static defpackage.ajcq C(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(runnable, null));
        executor.execute(ajdkVar);
        return ajdkVar;
    }

    public static defpackage.ajcq D(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(callable);
        executor.execute(ajdkVar);
        return ajdkVar;
    }

    public static defpackage.ajcq E(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(ajasVar);
        executor.execute(ajdkVar);
        return ajdkVar;
    }

    public static defpackage.ajcq F(java.lang.Iterable iterable) {
        return new defpackage.ajbh(defpackage.aify.j(iterable), false);
    }

    public static defpackage.ajcq G(defpackage.ajcq ajcqVar, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        timeUnit.getClass();
        scheduledExecutorService.getClass();
        if (ajcqVar.isDone()) {
            return ajcqVar;
        }
        defpackage.ajdh ajdhVar = new defpackage.ajdh(ajcqVar);
        defpackage.ajdf ajdfVar = new defpackage.ajdf(ajdhVar);
        ajdhVar.b = scheduledExecutorService.schedule(ajdfVar, j, timeUnit);
        ajcqVar.c(ajdfVar, defpackage.ajbm.INSTANCE);
        return ajdhVar;
    }

    public static java.lang.Object H(java.util.concurrent.Future future) {
        defpackage.ahvr.cc(future.isDone(), "Future was expected to be done: %s", future);
        return defpackage.a.h(future);
    }

    public static void I(defpackage.ajcq ajcqVar, defpackage.ajcb ajcbVar, java.util.concurrent.Executor executor) {
        ajcqVar.c(new defpackage.ajcc(ajcqVar, ajcbVar), executor);
    }

    public static void J(defpackage.ajcq ajcqVar, java.util.concurrent.Future future) {
        if (ajcqVar instanceof defpackage.ajac) {
            ((defpackage.ajac) ajcqVar).m(future);
        } else {
            if (ajcqVar == null || !ajcqVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(defpackage.ajcq ajcqVar, java.util.concurrent.Future future) {
        ajcqVar.getClass();
        if (future.isDone()) {
            return;
        }
        if (ajcqVar.isDone()) {
            J(ajcqVar, future);
            return;
        }
        defpackage.ajcd ajcdVar = new defpackage.ajcd(ajcqVar, future, 0);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        ajcqVar.c(ajcdVar, ajbmVar);
        if (future instanceof defpackage.ajcq) {
            future.c(ajcdVar, ajbmVar);
        }
    }

    public static void L(int i, java.lang.Object obj) {
        if (i - 1 == 0 && defpackage.ajbg.b) {
            ft$.ExternalSyntheticApiModelOutline0.m(obj);
        }
    }

    public static j$.time.Duration M(long j) {
        j$.time.Duration durationOf = j$.time.Duration.of(j, j$.time.temporal.ChronoUnit.MICROS);
        defpackage.aooh.e(durationOf, "of(...)");
        return durationOf;
    }

    public static j$.time.Duration N(long j) {
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(j);
        defpackage.aooh.e(durationOfMillis, "ofMillis(...)");
        return durationOfMillis;
    }

    public static j$.time.Duration O(int i) {
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(i);
        defpackage.aooh.e(durationOfSeconds, "ofSeconds(...)");
        return durationOfSeconds;
    }

    public static int P(long j) {
        int i = (int) j;
        defpackage.ahvr.bQ(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int Q(int i, int i2, int i3) {
        defpackage.ahvr.bT(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return java.lang.Math.min(java.lang.Math.max(i, i2), i3);
    }

    public static int R(byte[] bArr) {
        int length = bArr.length;
        defpackage.ahvr.bT(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    public static int S(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int T(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static java.util.List U(int... iArr) {
        int length = iArr.length;
        return length == 0 ? java.util.Collections.EMPTY_LIST : new aizj(iArr, 0, length);
    }

    public static byte[] V(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int[] W(java.util.Collection collection) {
        if (collection instanceof aizj) {
            aizj aizjVar = (aizj) collection;
            return java.util.Arrays.copyOfRange(aizjVar.a, aizjVar.b, aizjVar.c);
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = array[i];
            defpackage.ahvr.ci(obj);
            iArr[i] = ((java.lang.Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[EDGE_INSN: B:29:0x0068->B:30:0x0069 BREAK  A[LOOP:0: B:14:0x002c->B:23:0x0054]] */
    public static java.lang.Integer X(java.lang.String str) {
        java.lang.Long lValueOf;
        defpackage.ahvr.ci(str);
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i = cCharAt == '-' ? 1 : 0;
            if (i == str.length()) {
                lValueOf = null;
                break;
            }
            int i2 = i + 1;
            int iA = aizk.a(str.charAt(i));
            if (iA >= 0 && iA < 10) {
                long j = -iA;
                while (true) {
                    if (i2 >= str.length()) {
                        if (cCharAt != '-') {
                            if (j != Long.MIN_VALUE) {
                                lValueOf = java.lang.Long.valueOf(-j);
                                break;
                            }
                        } else {
                            lValueOf = java.lang.Long.valueOf(j);
                            break;
                        }
                    } else {
                        int i3 = i2 + 1;
                        int iA2 = aizk.a(str.charAt(i2));
                        if (iA2 >= 0 && iA2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = iA2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                    }
                    lValueOf = null;
                    break;
                }
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return java.lang.Integer.valueOf(lValueOf.intValue());
    }

    public static defpackage.anpu Y(java.lang.Iterable iterable) {
        return new defpackage.anpu(false, defpackage.aify.j(iterable));
    }

    @java.lang.SafeVarargs
    public static defpackage.anpu Z(defpackage.ajcq... ajcqVarArr) {
        return new defpackage.anpu(false, defpackage.aify.o(ajcqVarArr));
    }

    public static defpackage.anpu aa(java.lang.Iterable iterable) {
        return new defpackage.anpu(true, defpackage.aify.j(iterable));
    }

    @java.lang.SafeVarargs
    public static defpackage.anpu ab(defpackage.ajcq... ajcqVarArr) {
        return new defpackage.anpu(true, defpackage.aify.o(ajcqVarArr));
    }

    public static void ad(boolean z) {
        if (!z) {
            throw new java.lang.ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void ae(java.lang.String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static int af(long j, int i) {
        long j2 = i;
        long j3 = j % j2;
        if (j3 == 0) {
            j3 = 0;
        } else if ((((j ^ j2) >> 63) | 1) <= 0) {
            j3 += j2;
        }
        return (int) j3;
    }

    public static long ag(long j, long j2, java.math.RoundingMode roundingMode) {
        defpackage.ahvr.ci(roundingMode);
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (aiyw.a[roundingMode.ordinal()]) {
            case 1:
                ad(false);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                long jAbs = java.lang.Math.abs(j4);
                long jAbs2 = jAbs - (java.lang.Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != java.math.RoundingMode.HALF_UP && (roundingMode != java.math.RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
            default:
                throw new java.lang.AssertionError();
        }
        return j3 + ((long) i);
    }

    public static long ah(long j, long j2) {
        ae("a", j);
        ae("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            jNumberOfTrailingZeros = j6 >> java.lang.Long.numberOfTrailingZeros(j6);
            j3 += j5;
        }
        return jNumberOfTrailingZeros << java.lang.Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long ai(long j, long j2) {
        int i = ((j ^ j2) > 0L ? 1 : ((j ^ j2) == 0L ? 0 : -1));
        long j3 = j2 + j;
        return (i | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) >= 0 ? ((j3 >>> 63) ^ 1) + Long.MAX_VALUE : j3;
    }

    public static long aj(long j, long j2) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) + java.lang.Long.numberOfLeadingZeros(~j) + java.lang.Long.numberOfLeadingZeros(j2) + java.lang.Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (((iNumberOfLeadingZeros < 64 ? 1 : 0) | ((i >>> 31) & (j2 != Long.MIN_VALUE ? 0 : 1))) == 0) {
            long j4 = j * j2;
            if (i == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static int ak(int i, int i2, java.math.RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new java.lang.ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (defpackage.aiyv.a[roundingMode.ordinal()]) {
            case 1:
                throw new java.lang.ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                int iAbs = java.lang.Math.abs(i4);
                int iAbs2 = iAbs - (java.lang.Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != java.math.RoundingMode.HALF_UP) {
                        if (((roundingMode != java.math.RoundingMode.HALF_EVEN ? 0 : 1) & i3 & 1) == 0) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
            default:
                throw new java.lang.AssertionError();
        }
        return i3 + i5;
    }

    public static int al(int i, int i2) {
        return T(((long) i) + ((long) i2));
    }

    public static int am(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
            case 43:
            case 44:
            default:
                return 0;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
        }
    }

    public static /* synthetic */ java.lang.String an(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "VISIBILITY_HIDDEN";
        }
        return "VISIBILITY_VISIBLE";
    }

    public static /* synthetic */ defpackage.ahda ao(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ahda(akzxVar, (byte[]) null);
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        if (str.length() + str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        return str.concat(java.lang.String.valueOf(str2));
    }

    public static int e(java.util.logging.Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= java.util.logging.Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= java.util.logging.Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= java.util.logging.Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= java.util.logging.Level.FINE.intValue() ? 3 : 2;
    }

    public static /* synthetic */ boolean f(int i, defpackage.ainh ainhVar, java.lang.StringBuilder sb) {
        if (i - 1 != 0 || ainhVar == defpackage.ainh.a) {
            return false;
        }
        sb.append(ainhVar.b());
        sb.append('.');
        sb.append(ainhVar.d());
        sb.append(':');
        sb.append(ainhVar.a());
        return true;
    }

    public static java.lang.Iterable g(java.lang.Object obj) {
        java.io.File[] fileArrListFiles;
        java.io.File file = (java.io.File) obj;
        return (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) ? defpackage.aike.a : j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList(fileArrListFiles));
    }

    public static java.io.FileOutputStream i(java.io.File file, defpackage.aihd aihdVar) {
        return new java.io.FileOutputStream(file, aihdVar.contains(defpackage.aiso.APPEND));
    }

    public static void j(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static boolean k(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static void l(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str.concat(" must not be null"));
        }
    }

    public static void n(java.util.concurrent.BlockingQueue blockingQueue, java.lang.Object obj) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(obj);
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static void o() {
        java.lang.Thread.currentThread().interrupt();
    }

    public static void p(java.lang.Throwable th) {
        if (th instanceof java.lang.InterruptedException) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static void q(java.lang.Throwable th) {
        if ((th instanceof java.lang.Error) && !(th instanceof java.lang.StackOverflowError)) {
            throw ((java.lang.Error) th);
        }
    }

    public static defpackage.ajct r(java.util.concurrent.ExecutorService executorService) {
        if (executorService instanceof defpackage.ajct) {
            return (defpackage.ajct) executorService;
        }
        return executorService instanceof java.util.concurrent.ScheduledExecutorService ? new defpackage.ajcz((java.util.concurrent.ScheduledExecutorService) executorService) : new defpackage.ajcw(executorService);
    }

    public static defpackage.ajcu s(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof defpackage.ajcu ? (defpackage.ajcu) scheduledExecutorService : new defpackage.ajcz(scheduledExecutorService);
    }

    public static java.util.concurrent.Executor t(final java.util.concurrent.Executor executor, final defpackage.ajac ajacVar) {
        executor.getClass();
        return executor != defpackage.ajbm.INSTANCE ? new java.util.concurrent.Executor() { // from class: ajcv
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                defpackage.aiql.u(executor, ajacVar, runnable);
            }
        } : executor;
    }

    public static /* synthetic */ void u(java.util.concurrent.Executor executor, defpackage.ajac ajacVar, java.lang.Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            ajacVar.p(e);
        }
    }

    public static defpackage.ajcq v(java.lang.Iterable iterable) {
        return new defpackage.ajbh(defpackage.aify.j(iterable), true);
    }

    @java.lang.SafeVarargs
    public static defpackage.ajcq w(defpackage.ajcq... ajcqVarArr) {
        return new defpackage.ajbh(defpackage.aify.o(ajcqVarArr), true);
    }

    public static defpackage.ajcq x() {
        defpackage.ajcl ajclVar = defpackage.ajcl.a;
        return ajclVar == null ? new defpackage.ajcl() : ajclVar;
    }

    public static defpackage.ajcq y(java.lang.Throwable th) {
        th.getClass();
        return new defpackage.ajdd(th);
    }

    public static defpackage.ajcq z(java.lang.Object obj) {
        return obj == null ? defpackage.ajcm.a : new defpackage.ajcm(obj);
    }

    public /* bridge */ /* synthetic */ defpackage.ajsz ac() {
        throw null;
    }

    public defpackage.aiqs b() {
        return defpackage.aiqs.b;
    }

    public defpackage.aior fs() {
        return defpackage.aioq.a;
    }

    public byte[] h() {
        throw null;
    }

    public java.lang.Integer m() {
        return null;
    }

    public aiql(byte[] bArr, char[] cArr) {
        this();
    }

    public /* synthetic */ aiql(char[] cArr) {
    }

    public void c(java.lang.String str, java.util.logging.Level level, boolean z) {
    }
}
