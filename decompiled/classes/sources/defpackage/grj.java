package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class grj {
    public static final defpackage.grj a;
    public static final defpackage.grj b;
    private static final /* synthetic */ defpackage.grj[] c;

    static {
        defpackage.grj grjVar = new defpackage.grj("EXPONENTIAL", 0);
        a = grjVar;
        defpackage.grj grjVar2 = new defpackage.grj("LINEAR", 1);
        b = grjVar2;
        defpackage.grj[] grjVarArr = {grjVar, grjVar2};
        c = grjVarArr;
        defpackage.ajsz.am(grjVarArr);
    }

    public static defpackage.grj[] values() {
        return (defpackage.grj[]) c.clone();
    }
}
