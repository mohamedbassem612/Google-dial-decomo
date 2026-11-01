package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbf {
    public static final defpackage.ajbf a;
    public static final defpackage.ajbf b;
    public static final defpackage.ajbf c;
    public static final defpackage.ajbf d;
    public static final defpackage.ajbf e;
    public static final defpackage.ajbf f;
    private static final /* synthetic */ defpackage.ajbf[] g;

    static {
        defpackage.ajbf ajbfVar = new defpackage.ajbf("OPEN", 0);
        a = ajbfVar;
        defpackage.ajbf ajbfVar2 = new defpackage.ajbf("SUBSUMED", 1);
        b = ajbfVar2;
        defpackage.ajbf ajbfVar3 = new defpackage.ajbf("WILL_CLOSE", 2);
        c = ajbfVar3;
        defpackage.ajbf ajbfVar4 = new defpackage.ajbf("CLOSING", 3);
        d = ajbfVar4;
        defpackage.ajbf ajbfVar5 = new defpackage.ajbf("CLOSED", 4);
        e = ajbfVar5;
        defpackage.ajbf ajbfVar6 = new defpackage.ajbf("WILL_CREATE_VALUE_AND_CLOSER", 5);
        f = ajbfVar6;
        g = new defpackage.ajbf[]{ajbfVar, ajbfVar2, ajbfVar3, ajbfVar4, ajbfVar5, ajbfVar6};
    }

    public static defpackage.ajbf[] values() {
        return (defpackage.ajbf[]) g.clone();
    }
}
