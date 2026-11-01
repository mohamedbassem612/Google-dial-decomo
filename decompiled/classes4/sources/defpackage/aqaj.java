package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aqaj {
    public static final defpackage.aqaj a;
    public static final defpackage.aqaj b;
    public static final defpackage.aqaj c;
    public static final defpackage.aqaj d;
    public static final defpackage.aqaj e;
    public static final defpackage.aqaj f;
    public static final defpackage.aqaj g;
    public static final defpackage.aqaj h;
    private static final /* synthetic */ defpackage.aqaj[] i;

    static {
        defpackage.aqaj aqajVar = new defpackage.aqaj("FLOAT32", 0);
        a = aqajVar;
        defpackage.aqaj aqajVar2 = new defpackage.aqaj("INT32", 1);
        b = aqajVar2;
        defpackage.aqaj aqajVar3 = new defpackage.aqaj("UINT8", 2);
        c = aqajVar3;
        defpackage.aqaj aqajVar4 = new defpackage.aqaj("INT64", 3);
        d = aqajVar4;
        defpackage.aqaj aqajVar5 = new defpackage.aqaj("STRING", 4);
        e = aqajVar5;
        defpackage.aqaj aqajVar6 = new defpackage.aqaj("BOOL", 5);
        f = aqajVar6;
        defpackage.aqaj aqajVar7 = new defpackage.aqaj("INT16", 6);
        g = aqajVar7;
        defpackage.aqaj aqajVar8 = new defpackage.aqaj("INT8", 7);
        h = aqajVar8;
        i = new defpackage.aqaj[]{aqajVar, aqajVar2, aqajVar3, aqajVar4, aqajVar5, aqajVar6, aqajVar7, aqajVar8};
    }

    public static defpackage.aqaj[] values() {
        return (defpackage.aqaj[]) i.clone();
    }

    public final int a() {
        switch (ordinal()) {
            case 0:
            case 1:
                return 4;
            case 2:
            case 7:
                return 1;
            case 3:
                return 8;
            case 4:
            case 5:
                return -1;
            case 6:
                return 2;
            default:
                throw new java.lang.IllegalArgumentException(a.bJ(this, "DataType error: DataType ", " is not supported yet"));
        }
    }
}
