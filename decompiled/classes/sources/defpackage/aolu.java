package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolu {
    public static final defpackage.aolu a;
    public static final defpackage.aolu b;
    public static final defpackage.aolu c;
    private static final /* synthetic */ defpackage.aolu[] d;

    static {
        defpackage.aolu aoluVar = new defpackage.aolu("COROUTINE_SUSPENDED", 0);
        a = aoluVar;
        defpackage.aolu aoluVar2 = new defpackage.aolu("UNDECIDED", 1);
        b = aoluVar2;
        defpackage.aolu aoluVar3 = new defpackage.aolu("RESUMED", 2);
        c = aoluVar3;
        defpackage.aolu[] aoluVarArr = {aoluVar, aoluVar2, aoluVar3};
        d = aoluVarArr;
        defpackage.ajsz.am(aoluVarArr);
    }

    public static defpackage.aolu[] values() {
        return (defpackage.aolu[]) d.clone();
    }
}
