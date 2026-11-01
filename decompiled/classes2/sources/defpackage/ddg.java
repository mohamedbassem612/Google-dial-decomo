package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ddg {
    public static final defpackage.ddg a;
    public static final defpackage.ddg b;
    public static final defpackage.ddg c;
    private static final /* synthetic */ defpackage.ddg[] d;

    static {
        defpackage.ddg ddgVar = new defpackage.ddg("ContinueTraversal", 0);
        a = ddgVar;
        defpackage.ddg ddgVar2 = new defpackage.ddg("SkipSubtreeAndContinueTraversal", 1);
        b = ddgVar2;
        defpackage.ddg ddgVar3 = new defpackage.ddg("CancelTraversal", 2);
        c = ddgVar3;
        defpackage.ddg[] ddgVarArr = {ddgVar, ddgVar2, ddgVar3};
        d = ddgVarArr;
        ajsz.am(ddgVarArr);
    }

    public static defpackage.ddg[] values() {
        return (defpackage.ddg[]) d.clone();
    }
}
