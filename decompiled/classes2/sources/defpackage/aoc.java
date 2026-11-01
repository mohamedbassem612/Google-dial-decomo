package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aoc {
    public static final defpackage.aoc a;
    public static final defpackage.aoc b;
    public static final defpackage.aoc c;
    private static final /* synthetic */ defpackage.aoc[] d;

    static {
        defpackage.aoc aocVar = new defpackage.aoc("Default", 0);
        a = aocVar;
        defpackage.aoc aocVar2 = new defpackage.aoc("UserInput", 1);
        b = aocVar2;
        defpackage.aoc aocVar3 = new defpackage.aoc("PreventUserInput", 2);
        c = aocVar3;
        defpackage.aoc[] aocVarArr = {aocVar, aocVar2, aocVar3};
        d = aocVarArr;
        ajsz.am(aocVarArr);
    }

    public static defpackage.aoc[] values() {
        return (defpackage.aoc[]) d.clone();
    }
}
