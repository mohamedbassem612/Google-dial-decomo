package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gfp {
    public static final defpackage.gfp a;
    public static final defpackage.gfp b;
    public static final defpackage.gfp c;
    private static final /* synthetic */ defpackage.gfp[] d;

    static {
        defpackage.gfp gfpVar = new defpackage.gfp("NO_OP", 0);
        a = gfpVar;
        defpackage.gfp gfpVar2 = new defpackage.gfp("ADD", 1);
        b = gfpVar2;
        defpackage.gfp gfpVar3 = new defpackage.gfp("REMOVE", 2);
        c = gfpVar3;
        defpackage.gfp[] gfpVarArr = {gfpVar, gfpVar2, gfpVar3};
        d = gfpVarArr;
        defpackage.ajsz.am(gfpVarArr);
    }

    public static defpackage.gfp[] values() {
        return (defpackage.gfp[]) d.clone();
    }
}
