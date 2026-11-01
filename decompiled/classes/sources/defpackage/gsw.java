package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gsw {
    public static final defpackage.gsw a;
    public static final defpackage.gsw b;
    public static final defpackage.gsw c;
    public static final defpackage.gsw d;
    public static final defpackage.gsw e;
    public static final defpackage.gsw f;
    private static final /* synthetic */ defpackage.gsw[] g;

    static {
        defpackage.gsw gswVar = new defpackage.gsw("ENQUEUED", 0);
        a = gswVar;
        defpackage.gsw gswVar2 = new defpackage.gsw("RUNNING", 1);
        b = gswVar2;
        defpackage.gsw gswVar3 = new defpackage.gsw("SUCCEEDED", 2);
        c = gswVar3;
        defpackage.gsw gswVar4 = new defpackage.gsw("FAILED", 3);
        d = gswVar4;
        defpackage.gsw gswVar5 = new defpackage.gsw("BLOCKED", 4);
        e = gswVar5;
        defpackage.gsw gswVar6 = new defpackage.gsw("CANCELLED", 5);
        f = gswVar6;
        defpackage.gsw[] gswVarArr = {gswVar, gswVar2, gswVar3, gswVar4, gswVar5, gswVar6};
        g = gswVarArr;
        defpackage.ajsz.am(gswVarArr);
    }

    public static defpackage.gsw[] values() {
        return (defpackage.gsw[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
