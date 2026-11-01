package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ggg {
    public static final defpackage.ggg a;
    public static final defpackage.ggg b;
    public static final defpackage.ggg c;
    private static final /* synthetic */ defpackage.ggg[] d;

    static {
        defpackage.ggg gggVar = new defpackage.ggg("DEFERRED", 0);
        a = gggVar;
        defpackage.ggg gggVar2 = new defpackage.ggg("IMMEDIATE", 1);
        b = gggVar2;
        defpackage.ggg gggVar3 = new defpackage.ggg("EXCLUSIVE", 2);
        c = gggVar3;
        defpackage.ggg[] gggVarArr = {gggVar, gggVar2, gggVar3};
        d = gggVarArr;
        defpackage.ajsz.am(gggVarArr);
    }

    public static defpackage.ggg[] values() {
        return (defpackage.ggg[]) d.clone();
    }
}
