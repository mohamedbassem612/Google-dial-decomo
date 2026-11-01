package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqo {
    public static final java.util.regex.Pattern a;
    public static final java.util.regex.Pattern b;
    public static final defpackage.jqo c;
    public static final defpackage.jqo d;
    public static final defpackage.jqo e;
    public static final defpackage.jqo f;
    private static final /* synthetic */ defpackage.jqo[] g;

    static {
        defpackage.jqo jqoVar = new defpackage.jqo("TN_VALIDATION_NONE", 0);
        c = jqoVar;
        defpackage.jqo jqoVar2 = new defpackage.jqo("TN_VALIDATION_PASS", 1);
        d = jqoVar2;
        defpackage.jqo jqoVar3 = new defpackage.jqo("TN_VALIDATION_FAIL", 2);
        e = jqoVar3;
        defpackage.jqo jqoVar4 = new defpackage.jqo("TN_VALIDATION_NULL", 3);
        f = jqoVar4;
        defpackage.jqo[] jqoVarArr = {jqoVar, jqoVar2, jqoVar3, jqoVar4};
        g = jqoVarArr;
        ajsz.am(jqoVarArr);
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("verstat=(\\D+)");
        aooh.e(patternCompile, "compile(...)");
        a = patternCompile;
        java.util.regex.Pattern patternCompile2 = java.util.regex.Pattern.compile("tn-validation-(\\w+)");
        aooh.e(patternCompile2, "compile(...)");
        b = patternCompile2;
    }

    public static defpackage.jqo[] values() {
        return (defpackage.jqo[]) g.clone();
    }
}
