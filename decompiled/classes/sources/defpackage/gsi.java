package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gsi {
    public static final defpackage.gsi a;
    public static final defpackage.gsi b;
    public static final defpackage.gsi c;
    public static final defpackage.gsi d;
    public static final defpackage.gsi e;
    public static final defpackage.gsi f;
    private static final /* synthetic */ defpackage.gsi[] g;

    static {
        defpackage.gsi gsiVar = new defpackage.gsi("NOT_REQUIRED", 0);
        a = gsiVar;
        defpackage.gsi gsiVar2 = new defpackage.gsi("CONNECTED", 1);
        b = gsiVar2;
        defpackage.gsi gsiVar3 = new defpackage.gsi("UNMETERED", 2);
        c = gsiVar3;
        defpackage.gsi gsiVar4 = new defpackage.gsi("NOT_ROAMING", 3);
        d = gsiVar4;
        defpackage.gsi gsiVar5 = new defpackage.gsi("METERED", 4);
        e = gsiVar5;
        defpackage.gsi gsiVar6 = new defpackage.gsi("TEMPORARILY_UNMETERED", 5);
        f = gsiVar6;
        defpackage.gsi[] gsiVarArr = {gsiVar, gsiVar2, gsiVar3, gsiVar4, gsiVar5, gsiVar6};
        g = gsiVarArr;
        defpackage.ajsz.am(gsiVarArr);
    }

    public static defpackage.gsi[] values() {
        return (defpackage.gsi[]) g.clone();
    }
}
