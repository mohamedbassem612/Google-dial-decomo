package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aerh {
    public final java.io.File a;
    public int b = 0;
    public boolean c = false;
    private final java.lang.String d;
    private java.io.File e;

    public aerh(java.io.File file, java.lang.String str) {
        this.a = file;
        this.d = str;
    }

    public final int a() {
        if (c()) {
            return this.b;
        }
        return 0;
    }

    public final java.io.File b() {
        java.io.File file = this.e;
        if (file != null) {
            return file;
        }
        java.io.File file2 = new java.io.File(this.a, this.d.concat("_crash_counter_storage.pb"));
        this.e = file2;
        return file2;
    }

    public final boolean c() {
        if (this.c) {
            return true;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(b());
            try {
                this.b = ((defpackage.aerk) alad.A(defpackage.aerk.a, fileInputStream, akzq.a())).c;
                fileInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (java.io.FileNotFoundException unused) {
            this.b = 0;
        } catch (java.io.IOException e) {
            a.by(defpackage.aenr.a.d(), "failed to read counter from disk.", "com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 'f', "CrashCounter.java", e);
            return false;
        }
        this.c = true;
        return true;
    }
}
