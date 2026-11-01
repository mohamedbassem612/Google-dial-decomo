package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gac {
    public static final defpackage.gac a;
    public static final defpackage.gac b;
    public static final defpackage.gac c;
    private static final /* synthetic */ defpackage.gac[] d;

    static {
        defpackage.gac gacVar = new defpackage.gac("REFRESH", 0);
        a = gacVar;
        defpackage.gac gacVar2 = new defpackage.gac("PREPEND", 1);
        b = gacVar2;
        defpackage.gac gacVar3 = new defpackage.gac("APPEND", 2);
        c = gacVar3;
        defpackage.gac[] gacVarArr = {gacVar, gacVar2, gacVar3};
        d = gacVarArr;
        defpackage.ajsz.am(gacVarArr);
    }

    public static defpackage.gac[] values() {
        return (defpackage.gac[]) d.clone();
    }
}
