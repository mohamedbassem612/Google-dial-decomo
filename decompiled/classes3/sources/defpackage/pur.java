package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pur {
    public static final defpackage.pur a;
    public static final defpackage.pur b;
    public static final defpackage.pur c;
    private static final /* synthetic */ defpackage.pur[] d;

    static {
        defpackage.pur purVar = new defpackage.pur("UNKNOWN", 0);
        a = purVar;
        defpackage.pur purVar2 = new defpackage.pur("FRONT", 1);
        b = purVar2;
        defpackage.pur purVar3 = new defpackage.pur("BACK", 2);
        c = purVar3;
        d = new defpackage.pur[]{purVar, purVar2, purVar3};
    }

    public static defpackage.pur[] values() {
        return (defpackage.pur[]) d.clone();
    }
}
