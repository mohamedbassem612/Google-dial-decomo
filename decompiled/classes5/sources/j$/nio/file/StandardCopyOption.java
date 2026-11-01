package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class StandardCopyOption implements j$.nio.file.CopyOption {
    public static final j$.nio.file.StandardCopyOption ATOMIC_MOVE;
    public static final j$.nio.file.StandardCopyOption COPY_ATTRIBUTES;
    public static final j$.nio.file.StandardCopyOption REPLACE_EXISTING;
    public static final /* synthetic */ j$.nio.file.StandardCopyOption[] a;

    static {
        j$.nio.file.StandardCopyOption standardCopyOption = new j$.nio.file.StandardCopyOption("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = standardCopyOption;
        j$.nio.file.StandardCopyOption standardCopyOption2 = new j$.nio.file.StandardCopyOption("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = standardCopyOption2;
        j$.nio.file.StandardCopyOption standardCopyOption3 = new j$.nio.file.StandardCopyOption("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = standardCopyOption3;
        a = new j$.nio.file.StandardCopyOption[]{standardCopyOption, standardCopyOption2, standardCopyOption3};
    }

    public static j$.nio.file.StandardCopyOption valueOf(java.lang.String str) {
        return (j$.nio.file.StandardCopyOption) java.lang.Enum.valueOf(j$.nio.file.StandardCopyOption.class, str);
    }

    public static j$.nio.file.StandardCopyOption[] values() {
        return (j$.nio.file.StandardCopyOption[]) a.clone();
    }
}
