package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class u implements java.nio.file.OpenOption {
    public final /* synthetic */ j$.nio.file.OpenOption a;

    public /* synthetic */ u(j$.nio.file.OpenOption openOption) {
        this.a = openOption;
    }

    public static /* synthetic */ java.nio.file.OpenOption a(j$.nio.file.OpenOption openOption) {
        java.nio.file.OpenOption openOptionE;
        if (openOption == null) {
            return null;
        }
        if (openOption instanceof j$.nio.file.t) {
            openOptionE = ((j$.nio.file.t) openOption).a;
        } else if (openOption instanceof j$.nio.file.LinkOption) {
            openOptionE = j$.nio.file.a.c((j$.nio.file.LinkOption) openOption);
        } else {
            if (!(openOption instanceof j$.nio.file.StandardOpenOption)) {
                return new j$.nio.file.u(openOption);
            }
            openOptionE = j$.nio.file.a.e((j$.nio.file.StandardOpenOption) openOption);
        }
        return openOptionE;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.OpenOption openOption = this.a;
        if (obj instanceof j$.nio.file.u) {
            obj = ((j$.nio.file.u) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
