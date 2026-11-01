package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xqu {
    public static final defpackage.xqu a;
    public static final defpackage.xqu b;
    public static final defpackage.xqu c;
    public static final defpackage.xqu d;
    private static final /* synthetic */ defpackage.xqu[] e;

    static {
        defpackage.xqu xquVar = new defpackage.xqu("UNKNOWN", 0);
        a = xquVar;
        defpackage.xqu xquVar2 = new defpackage.xqu("PACKAGE_INSTALLED", 1);
        b = xquVar2;
        defpackage.xqu xquVar3 = new defpackage.xqu("PACKAGE_REMOVED", 2);
        c = xquVar3;
        defpackage.xqu xquVar4 = new defpackage.xqu("PACKAGE_CHANGED", 3);
        d = xquVar4;
        e = new defpackage.xqu[]{xquVar, xquVar2, xquVar3, xquVar4};
    }

    public static defpackage.xqu[] values() {
        return (defpackage.xqu[]) e.clone();
    }
}
