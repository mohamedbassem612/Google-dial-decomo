package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class StandardOpenOption implements j$.nio.file.OpenOption {
    public static final j$.nio.file.StandardOpenOption APPEND;
    public static final j$.nio.file.StandardOpenOption CREATE;
    public static final j$.nio.file.StandardOpenOption CREATE_NEW;
    public static final j$.nio.file.StandardOpenOption DELETE_ON_CLOSE;
    public static final j$.nio.file.StandardOpenOption DSYNC;
    public static final j$.nio.file.StandardOpenOption READ;
    public static final j$.nio.file.StandardOpenOption SPARSE;
    public static final j$.nio.file.StandardOpenOption SYNC;
    public static final j$.nio.file.StandardOpenOption TRUNCATE_EXISTING;
    public static final j$.nio.file.StandardOpenOption WRITE;
    public static final /* synthetic */ j$.nio.file.StandardOpenOption[] a;

    static {
        j$.nio.file.StandardOpenOption standardOpenOption = new j$.nio.file.StandardOpenOption("READ", 0);
        READ = standardOpenOption;
        j$.nio.file.StandardOpenOption standardOpenOption2 = new j$.nio.file.StandardOpenOption("WRITE", 1);
        WRITE = standardOpenOption2;
        j$.nio.file.StandardOpenOption standardOpenOption3 = new j$.nio.file.StandardOpenOption("APPEND", 2);
        APPEND = standardOpenOption3;
        j$.nio.file.StandardOpenOption standardOpenOption4 = new j$.nio.file.StandardOpenOption("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = standardOpenOption4;
        j$.nio.file.StandardOpenOption standardOpenOption5 = new j$.nio.file.StandardOpenOption("CREATE", 4);
        CREATE = standardOpenOption5;
        j$.nio.file.StandardOpenOption standardOpenOption6 = new j$.nio.file.StandardOpenOption("CREATE_NEW", 5);
        CREATE_NEW = standardOpenOption6;
        j$.nio.file.StandardOpenOption standardOpenOption7 = new j$.nio.file.StandardOpenOption("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = standardOpenOption7;
        j$.nio.file.StandardOpenOption standardOpenOption8 = new j$.nio.file.StandardOpenOption("SPARSE", 7);
        SPARSE = standardOpenOption8;
        j$.nio.file.StandardOpenOption standardOpenOption9 = new j$.nio.file.StandardOpenOption("SYNC", 8);
        SYNC = standardOpenOption9;
        j$.nio.file.StandardOpenOption standardOpenOption10 = new j$.nio.file.StandardOpenOption("DSYNC", 9);
        DSYNC = standardOpenOption10;
        a = new j$.nio.file.StandardOpenOption[]{standardOpenOption, standardOpenOption2, standardOpenOption3, standardOpenOption4, standardOpenOption5, standardOpenOption6, standardOpenOption7, standardOpenOption8, standardOpenOption9, standardOpenOption10};
    }

    public static j$.nio.file.StandardOpenOption valueOf(java.lang.String str) {
        return (j$.nio.file.StandardOpenOption) java.lang.Enum.valueOf(j$.nio.file.StandardOpenOption.class, str);
    }

    public static j$.nio.file.StandardOpenOption[] values() {
        return (j$.nio.file.StandardOpenOption[]) a.clone();
    }
}
