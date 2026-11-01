package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rin {
    public static final defpackage.rin a;
    public static final defpackage.rin b;
    public static final defpackage.rin c;
    private static final /* synthetic */ defpackage.rin[] d;

    static {
        defpackage.rin rinVar = new defpackage.rin("OPT_IN", 0);
        a = rinVar;
        defpackage.rin rinVar2 = new defpackage.rin("OPT_OUT", 1);
        b = rinVar2;
        defpackage.rin rinVar3 = new defpackage.rin("NOT_DECIDED", 2);
        c = rinVar3;
        defpackage.rin[] rinVarArr = {rinVar, rinVar2, rinVar3};
        d = rinVarArr;
        ajsz.am(rinVarArr);
    }

    public static defpackage.rin[] values() {
        return (defpackage.rin[]) d.clone();
    }
}
