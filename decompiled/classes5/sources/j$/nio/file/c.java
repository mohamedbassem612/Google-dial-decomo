package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class c implements j$.nio.file.CopyOption {
    public final /* synthetic */ java.nio.file.CopyOption a;

    public /* synthetic */ c(java.nio.file.CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v5, types: [j$.nio.file.CopyOption, java.nio.file.LinkOption] */
    public static /* synthetic */ j$.nio.file.CopyOption a(java.nio.file.CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof j$.nio.file.d) {
            return ((j$.nio.file.d) copyOption).a;
        }
        if (copyOption instanceof j$.nio.file.LinkOption) {
            return j$.nio.file.a.c((j$.nio.file.LinkOption) copyOption);
        }
        return copyOption instanceof j$.nio.file.StandardCopyOption ? j$.nio.file.a.d((j$.nio.file.StandardCopyOption) copyOption) : new j$.nio.file.c(copyOption);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.CopyOption copyOption = this.a;
        if (obj instanceof j$.nio.file.c) {
            obj = ((j$.nio.file.c) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
