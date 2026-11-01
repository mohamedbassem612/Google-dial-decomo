package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rub {
    public static final defpackage.rub a;
    public static final defpackage.rub b;
    public static final defpackage.rub c;
    public static final defpackage.rub d;
    private static final /* synthetic */ defpackage.rub[] e;

    static {
        defpackage.rub rubVar = new defpackage.rub("UNKNOWN", 0);
        a = rubVar;
        defpackage.rub rubVar2 = new defpackage.rub("SUCCESS", 1);
        b = rubVar2;
        defpackage.rub rubVar3 = new defpackage.rub("ERROR", 2);
        c = rubVar3;
        defpackage.rub rubVar4 = new defpackage.rub("CANCEL", 3);
        d = rubVar4;
        e = new defpackage.rub[]{rubVar, rubVar2, rubVar3, rubVar4};
    }

    public static defpackage.rub[] values() {
        return (defpackage.rub[]) e.clone();
    }
}
