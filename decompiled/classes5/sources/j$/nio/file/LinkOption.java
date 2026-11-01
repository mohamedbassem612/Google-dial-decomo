package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class LinkOption implements j$.nio.file.OpenOption, j$.nio.file.CopyOption {
    public static final j$.nio.file.LinkOption NOFOLLOW_LINKS;
    public static final /* synthetic */ j$.nio.file.LinkOption[] a;

    static {
        j$.nio.file.LinkOption linkOption = new j$.nio.file.LinkOption("NOFOLLOW_LINKS", 0);
        NOFOLLOW_LINKS = linkOption;
        a = new j$.nio.file.LinkOption[]{linkOption};
    }

    public static j$.nio.file.LinkOption valueOf(java.lang.String str) {
        return (j$.nio.file.LinkOption) java.lang.Enum.valueOf(j$.nio.file.LinkOption.class, str);
    }

    public static j$.nio.file.LinkOption[] values() {
        return (j$.nio.file.LinkOption[]) a.clone();
    }
}
