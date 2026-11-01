package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abas {
    private static final aimz a = aimz.i("com/google/android/libraries/abuse/hades/moirai/logging/LoggingHelper");

    public static final int a(defpackage.ykh ykhVar) {
        aooh.f(ykhVar, "protectionDownload");
        if ((ykhVar.b & 4) == 0) {
            return 0;
        }
        defpackage.yjv yjvVar = ykhVar.e;
        if (yjvVar == null) {
            yjvVar = defpackage.yjv.a;
        }
        return !yjvVar.b ? 2 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035 A[PHI: r5
      0x0035: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:7:0x002c, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:4:0x0015, B:6:0x0025, B:14:0x003c, B:16:0x0048, B:20:0x005d, B:23:0x006d, B:25:0x007b, B:26:0x007f, B:28:0x0086, B:29:0x0089, B:30:0x00a9), top: B:34:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0048 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:4:0x0015, B:6:0x0025, B:14:0x003c, B:16:0x0048, B:20:0x005d, B:23:0x006d, B:25:0x007b, B:26:0x007f, B:28:0x0086, B:29:0x0089, B:30:0x00a9), top: B:34:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d A[Catch: NumberFormatException -> 0x00aa, PHI: r8
      0x006d: PHI (r8v2 long) = (r8v1 long), (r8v3 long) binds: [B:17:0x0057, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:4:0x0015, B:6:0x0025, B:14:0x003c, B:16:0x0048, B:20:0x005d, B:23:0x006d, B:25:0x007b, B:26:0x007f, B:28:0x0086, B:29:0x0089, B:30:0x00a9), top: B:34:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: NumberFormatException -> 0x00aa, LOOP:0: B:13:0x003a->B:25:0x007b, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:4:0x0015, B:6:0x0025, B:14:0x003c, B:16:0x0048, B:20:0x005d, B:23:0x006d, B:25:0x007b, B:26:0x007f, B:28:0x0086, B:29:0x0089, B:30:0x00a9), top: B:34:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[EDGE_INSN: B:36:0x0084->B:27:0x0084 BREAK  A[LOOP:0: B:13:0x003a->B:25:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[EDGE_INSN: B:39:0x0084->B:27:0x0084 BREAK  A[LOOP:0: B:13:0x003a->B:25:0x007b], SYNTHETIC] */
    public static final long b(aazd aazdVar) {
        long j;
        int iDigit;
        long j2;
        long j3;
        long j4;
        aooh.f(aazdVar, "clientId");
        java.lang.String str = aazdVar.b;
        long j5 = 0;
        if (aooh.n(str, "")) {
            return 0L;
        }
        try {
            aooh.f(str, "<this>");
            aooh.f(str, "<this>");
            aooh.f(str, "<this>");
            int length = str.length();
            aojc aojcVar = null;
            if (length != 0) {
                int i = 0;
                char cCharAt = str.charAt(0);
                if (cCharAt >= '0') {
                    j = 512409557603043100L;
                    while (true) {
                        if (i >= length) {
                            iDigit = java.lang.Character.digit((int) str.charAt(i), 10);
                            if (iDigit >= 0) {
                                break;
                                break;
                            }
                            j2 = j5 ^ Long.MIN_VALUE;
                            if (java.lang.Long.compare(j2, j ^ Long.MIN_VALUE) <= 0) {
                                if (j == 512409557603043100L) {
                                    break;
                                }
                                break;
                                break;
                            }
                            j3 = j5 * 10;
                            j4 = ((long) iDigit) + j3;
                            if (java.lang.Long.compare(j4 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) < 0) {
                                break;
                                break;
                            }
                            i++;
                            j5 = j4;
                        } else {
                            aojcVar = new aojc(j5);
                            break;
                        }
                    }
                } else {
                    i = 1;
                    if (length != 1 && cCharAt == '+') {
                        j = 512409557603043100L;
                        while (true) {
                            if (i >= length) {
                                iDigit = java.lang.Character.digit((int) str.charAt(i), 10);
                                if (iDigit >= 0) {
                                    break;
                                }
                                j2 = j5 ^ Long.MIN_VALUE;
                                if (java.lang.Long.compare(j2, j ^ Long.MIN_VALUE) <= 0) {
                                    if (j == 512409557603043100L && java.lang.Long.compare(j2, -7378697629483820647L) <= 0) {
                                        j = 1844674407370955161L;
                                        j3 = j5 * 10;
                                        j4 = ((long) iDigit) + j3;
                                        if (java.lang.Long.compare(j4 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) < 0) {
                                            break;
                                            break;
                                        }
                                        i++;
                                        j5 = j4;
                                    } else {
                                        break;
                                    }
                                } else {
                                    j3 = j5 * 10;
                                    j4 = ((long) iDigit) + j3;
                                    if (java.lang.Long.compare(j4 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) < 0) {
                                        break;
                                    }
                                    i++;
                                    j5 = j4;
                                }
                            } else {
                                aojcVar = new aojc(j5);
                                break;
                            }
                        }
                    }
                }
            }
            if (aojcVar != null) {
                return aojcVar.a;
            }
            aooh.f(str, "input");
            throw new java.lang.NumberFormatException("Invalid number format: '" + str + '\'');
        } catch (java.lang.NumberFormatException e) {
            a.d().k(e).l("com/google/android/libraries/abuse/hades/moirai/logging/LoggingHelper", "clientRoleForLogging", 90, "LoggingHelper.kt").v("ClientId.role is not a number.");
            return -1L;
        }
    }

    public static final int c(defpackage.abay abayVar) {
        aooh.f(abayVar, "classificationBackend");
        int iOrdinal = abayVar.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 1 : 4;
        }
        return 3;
    }
}
