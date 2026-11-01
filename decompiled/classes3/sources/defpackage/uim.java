package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uim {
    public static final defpackage.uim a;
    public static final defpackage.uim b;
    public static final defpackage.uim c;
    public static final defpackage.uim d;
    public static final defpackage.uim e;
    private static final /* synthetic */ defpackage.uim[] f;

    static {
        defpackage.uim uimVar = new defpackage.uim("NOT_PARSABLE", 0);
        a = uimVar;
        defpackage.uim uimVar2 = new defpackage.uim("IMPOSSIBLE", 1);
        b = uimVar2;
        defpackage.uim uimVar3 = new defpackage.uim("INVALID", 2);
        c = uimVar3;
        defpackage.uim uimVar4 = new defpackage.uim("VALID", 3);
        d = uimVar4;
        defpackage.uim uimVar5 = new defpackage.uim("UNKNOWN", 4);
        e = uimVar5;
        defpackage.uim[] uimVarArr = {uimVar, uimVar2, uimVar3, uimVar4, uimVar5};
        f = uimVarArr;
        ajsz.am(uimVarArr);
    }

    public static defpackage.uim[] values() {
        return (defpackage.uim[]) f.clone();
    }

    public final boolean a() {
        return this == c;
    }
}
