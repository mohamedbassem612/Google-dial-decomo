package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alqd {
    private static final aimz c = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidFileGetter");
    public final android.content.Context a;
    public j$.util.Optional b = j$.util.Optional.empty();

    public alqd(android.content.Context context) {
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [albh, java.lang.Object] */
    public final /* synthetic */ albh a(albn albnVar, java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStreamC = c(str);
        try {
            ?? I = albnVar.i(inputStreamC, akzq.a());
            if (inputStreamC != null) {
                inputStreamC.close();
            }
            return I;
        } catch (java.lang.Throwable th) {
            if (inputStreamC != null) {
                try {
                    inputStreamC.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final java.io.BufferedReader b(java.lang.String str) {
        return new java.io.BufferedReader(new java.io.InputStreamReader(c(str), java.nio.charset.StandardCharsets.UTF_8));
    }

    public final java.io.InputStream c(java.lang.String str) {
        if (!d()) {
            return this.a.getAssets().open(str);
        }
        return new java.io.FileInputStream(j$.nio.file.Path.-CC.of((java.lang.String) this.b.get(), new java.lang.String[]{str}).toString());
    }

    public final boolean d() {
        j$.util.Optional optionalEmpty = this.b;
        if (true == optionalEmpty.isPresent()) {
            optionalEmpty = j$.util.Optional.ofNullable(j$.nio.file.Paths.get((java.lang.String) optionalEmpty.get(), new java.lang.String[0]));
        }
        if (true == optionalEmpty.isPresent() && true != j$.nio.file.Files.exists((j$.nio.file.Path) optionalEmpty.get(), new j$.nio.file.LinkOption[0])) {
            optionalEmpty = j$.util.Optional.empty();
        }
        return optionalEmpty.isPresent();
    }

    public final byte[] e(java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStreamC = c(str);
        try {
            int iAvailable = inputStreamC.available();
            byte[] bArr = new byte[iAvailable];
            if (aisk.d(inputStreamC, bArr, iAvailable) != iAvailable) {
                c.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidFileGetter", "getFileByteArray", 114, "AndroidFileGetter.java").v("Didn't finish reading the asset.");
            }
            if (inputStreamC != null) {
                inputStreamC.close();
            }
            return bArr;
        } catch (java.lang.Throwable th) {
            if (inputStreamC != null) {
                try {
                    inputStreamC.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
