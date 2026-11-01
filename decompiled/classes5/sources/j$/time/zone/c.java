package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c {
    public static final j$.time.zone.c STANDARD;
    public static final j$.time.zone.c UTC;
    public static final j$.time.zone.c WALL;
    public static final /* synthetic */ j$.time.zone.c[] a;

    static {
        j$.time.zone.c cVar = new j$.time.zone.c("UTC", 0);
        UTC = cVar;
        j$.time.zone.c cVar2 = new j$.time.zone.c("WALL", 1);
        WALL = cVar2;
        j$.time.zone.c cVar3 = new j$.time.zone.c("STANDARD", 2);
        STANDARD = cVar3;
        a = new j$.time.zone.c[]{cVar, cVar2, cVar3};
    }

    public static j$.time.zone.c valueOf(java.lang.String str) {
        return (j$.time.zone.c) java.lang.Enum.valueOf(j$.time.zone.c.class, str);
    }

    public static j$.time.zone.c[] values() {
        return (j$.time.zone.c[]) a.clone();
    }
}
