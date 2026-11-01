package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dja {
    public static final defpackage.dja a;
    public static final defpackage.dja b;
    public static final defpackage.dja c;
    private static final /* synthetic */ defpackage.dja[] d;

    static {
        defpackage.dja djaVar = new defpackage.dja("On", 0);
        a = djaVar;
        defpackage.dja djaVar2 = new defpackage.dja("Off", 1);
        b = djaVar2;
        defpackage.dja djaVar3 = new defpackage.dja("Indeterminate", 2);
        c = djaVar3;
        defpackage.dja[] djaVarArr = {djaVar, djaVar2, djaVar3};
        d = djaVarArr;
        defpackage.ajsz.am(djaVarArr);
    }

    public static defpackage.dja[] values() {
        return (defpackage.dja[]) d.clone();
    }
}
