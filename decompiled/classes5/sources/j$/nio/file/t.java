package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class t implements j$.nio.file.OpenOption {
    public final /* synthetic */ java.nio.file.OpenOption a;

    public /* synthetic */ t(java.nio.file.OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.nio.file.OpenOption, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v5, types: [j$.nio.file.OpenOption, java.nio.file.LinkOption] */
    public static /* synthetic */ j$.nio.file.OpenOption a(java.nio.file.OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof j$.nio.file.u) {
            return ((j$.nio.file.u) openOption).a;
        }
        if (openOption instanceof j$.nio.file.LinkOption) {
            return j$.nio.file.a.c((j$.nio.file.LinkOption) openOption);
        }
        return openOption instanceof j$.nio.file.StandardOpenOption ? j$.nio.file.a.e((j$.nio.file.StandardOpenOption) openOption) : new j$.nio.file.t(openOption);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.OpenOption openOption = this.a;
        if (obj instanceof j$.nio.file.t) {
            obj = ((j$.nio.file.t) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
