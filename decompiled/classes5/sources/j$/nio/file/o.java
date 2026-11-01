package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class o {
    public static final j$.nio.file.o END_DIRECTORY;
    public static final j$.nio.file.o ENTRY;
    public static final j$.nio.file.o START_DIRECTORY;
    public static final /* synthetic */ j$.nio.file.o[] a;

    static {
        j$.nio.file.o oVar = new j$.nio.file.o("START_DIRECTORY", 0);
        START_DIRECTORY = oVar;
        j$.nio.file.o oVar2 = new j$.nio.file.o("END_DIRECTORY", 1);
        END_DIRECTORY = oVar2;
        j$.nio.file.o oVar3 = new j$.nio.file.o("ENTRY", 2);
        ENTRY = oVar3;
        a = new j$.nio.file.o[]{oVar, oVar2, oVar3};
    }

    public static j$.nio.file.o valueOf(java.lang.String str) {
        return (j$.nio.file.o) java.lang.Enum.valueOf(j$.nio.file.o.class, str);
    }

    public static j$.nio.file.o[] values() {
        return (j$.nio.file.o[]) a.clone();
    }
}
