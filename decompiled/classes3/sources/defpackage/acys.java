package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acys {
    public static final defpackage.acys a;
    public static final defpackage.acys b;
    public static final defpackage.acys c;
    public static final defpackage.acys d;
    public static final defpackage.acys e;
    private static final /* synthetic */ defpackage.acys[] f;

    static {
        defpackage.acys acysVar = new defpackage.acys("UNSPECIFIED", 0);
        a = acysVar;
        defpackage.acys acysVar2 = new defpackage.acys("FILE_ALREADY_SHARED", 1);
        b = acysVar2;
        defpackage.acys acysVar3 = new defpackage.acys("FILE_SHARING_CHECKSUM_NOT_PROVIDED", 2);
        c = acysVar3;
        defpackage.acys acysVar4 = new defpackage.acys("FILE_ALREADY_EXISTS_IN_ANDROID_SHARED_STORAGE", 3);
        d = acysVar4;
        defpackage.acys acysVar5 = new defpackage.acys("FILE_NOT_SHARED_IN_ANDROID_SHARED_STORAGE", 4);
        e = acysVar5;
        f = new defpackage.acys[]{acysVar, acysVar2, acysVar3, acysVar4, acysVar5};
    }

    public static defpackage.acys[] values() {
        return (defpackage.acys[]) f.clone();
    }
}
