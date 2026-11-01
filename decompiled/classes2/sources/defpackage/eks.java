package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eks {
    public static final defpackage.eks a;
    public static final defpackage.eks b;
    public static final defpackage.eks c;
    public static final defpackage.eks d;
    public static final defpackage.eks e;
    public static final defpackage.eks f;
    public static final defpackage.eks g;
    public static final defpackage.eks h;
    public static final defpackage.eks i;
    private static final /* synthetic */ defpackage.eks[] j;

    static {
        defpackage.eks eksVar = new defpackage.eks("PENALTY_LOG", 0);
        a = eksVar;
        defpackage.eks eksVar2 = new defpackage.eks("PENALTY_DEATH", 1);
        b = eksVar2;
        defpackage.eks eksVar3 = new defpackage.eks("DETECT_FRAGMENT_REUSE", 2);
        c = eksVar3;
        defpackage.eks eksVar4 = new defpackage.eks("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = eksVar4;
        defpackage.eks eksVar5 = new defpackage.eks("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = eksVar5;
        defpackage.eks eksVar6 = new defpackage.eks("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = eksVar6;
        defpackage.eks eksVar7 = new defpackage.eks("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = eksVar7;
        defpackage.eks eksVar8 = new defpackage.eks("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = eksVar8;
        defpackage.eks eksVar9 = new defpackage.eks("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = eksVar9;
        defpackage.eks[] eksVarArr = {eksVar, eksVar2, eksVar3, eksVar4, eksVar5, eksVar6, eksVar7, eksVar8, eksVar9};
        j = eksVarArr;
        ajsz.am(eksVarArr);
    }

    public static defpackage.eks[] values() {
        return (defpackage.eks[]) j.clone();
    }
}
