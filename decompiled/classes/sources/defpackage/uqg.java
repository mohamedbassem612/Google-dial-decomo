package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uqg {
    public static final defpackage.uqg a;
    public static final defpackage.uqg b;
    public static final defpackage.uqg c;
    private static final /* synthetic */ defpackage.uqg[] d;

    static {
        defpackage.uqg uqgVar = new defpackage.uqg("FOREGROUND", 0);
        a = uqgVar;
        defpackage.uqg uqgVar2 = new defpackage.uqg("BACKGROUND", 1);
        b = uqgVar2;
        defpackage.uqg uqgVar3 = new defpackage.uqg("UNKNOWN", 2);
        c = uqgVar3;
        defpackage.uqg[] uqgVarArr = {uqgVar, uqgVar2, uqgVar3};
        d = uqgVarArr;
        defpackage.ajsz.am(uqgVarArr);
    }

    public static defpackage.uqg[] values() {
        return (defpackage.uqg[]) d.clone();
    }
}
