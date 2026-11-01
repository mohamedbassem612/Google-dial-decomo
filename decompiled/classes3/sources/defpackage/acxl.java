package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxl {
    public static final defpackage.acxl a;
    public static final defpackage.acxl b;
    public static final defpackage.acxl c;
    public static final defpackage.acxl d;
    public static final defpackage.acxl e;
    private static final /* synthetic */ defpackage.acxl[] f;

    static {
        defpackage.acxl acxlVar = new defpackage.acxl("ANY", 0);
        a = acxlVar;
        defpackage.acxl acxlVar2 = new defpackage.acxl("BLUETOOTH", 1);
        b = acxlVar2;
        defpackage.acxl acxlVar3 = new defpackage.acxl("ETHERNET", 2);
        c = acxlVar3;
        defpackage.acxl acxlVar4 = new defpackage.acxl("CELLULAR", 3);
        d = acxlVar4;
        defpackage.acxl acxlVar5 = new defpackage.acxl("WIFI", 4);
        e = acxlVar5;
        f = new defpackage.acxl[]{acxlVar, acxlVar2, acxlVar3, acxlVar4, acxlVar5};
    }

    public static defpackage.acxl[] values() {
        return (defpackage.acxl[]) f.clone();
    }
}
