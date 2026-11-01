package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aetl {
    public static final /* synthetic */ int f = 0;
    public final defpackage.aoin a;
    public final android.content.Context b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    public final defpackage.adao e;

    static {
        defpackage.ahvr.bI(new defpackage.tzo(8));
    }

    public aetl(defpackage.aoin aoinVar, android.content.Context context, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.adao adaoVar) {
        this.e = adaoVar;
        j$.util.Objects.requireNonNull(aoinVar);
        this.a = new defpackage.aeti(aoinVar3, defpackage.ahvr.bI(new defpackage.aeex(aoinVar, 9)), aoinVar, 0);
        this.b = context;
        this.c = aoinVar2;
        this.d = aoinVar4;
    }

    public static /* synthetic */ defpackage.ahyn a() {
        try {
            return defpackage.ahyn.h(android.os.Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", java.lang.Integer.TYPE));
        } catch (java.lang.Error e) {
            e = e;
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", (char) 144, "MemoryUsageCapture.java")).v("MemoryInfo.getOtherPss(which) failure");
            return defpackage.ahwt.a;
        } catch (java.lang.NoSuchMethodException unused) {
            return defpackage.ahwt.a;
        } catch (java.lang.Exception e2) {
            e = e2;
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", (char) 144, "MemoryUsageCapture.java")).v("MemoryInfo.getOtherPss(which) failure");
            return defpackage.ahwt.a;
        }
    }

    public static java.lang.Long b(java.lang.String str) {
        if (defpackage.ahvr.cp(str)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str.trim()));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public static java.lang.Long c(java.util.regex.Pattern pattern, java.lang.String str) throws ahzr {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            java.lang.String strGroup = matcher.group(1);
            defpackage.ahvr.bG(strGroup, new java.lang.Object[0]);
            return java.lang.Long.valueOf(java.lang.Long.parseLong(strGroup));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public final java.lang.String d(java.lang.String str, java.lang.String str2, boolean z) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        java.lang.String str3 = null;
        try {
            try {
                java.io.File file = new java.io.File(java.lang.String.format("/proc/%s/%s", str, str2));
                java.nio.charset.Charset charsetDefaultCharset = java.nio.charset.Charset.defaultCharset();
                defpackage.aisp aispVar = new defpackage.aisp(file);
                j$.util.Objects.requireNonNull(aispVar);
                if (charsetDefaultCharset == null) {
                    throw null;
                }
                str3 = new java.lang.String(aispVar.h(), charsetDefaultCharset);
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return str3;
            } catch (java.io.IOException e) {
                if (!z) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "readProcFileToString", 353, "MemoryUsageCapture.java")).y("Error reading proc %s", new defpackage.aepg(str2));
                } else if (!(e instanceof java.io.FileNotFoundException)) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).g(1, java.util.concurrent.TimeUnit.MINUTES)).k(e)).l("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "readProcFileToString", 349, "MemoryUsageCapture.java")).y("Error reading dmabuf proc %s", new defpackage.aepg(str2));
                }
            }
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
