package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggc {
    public static final defpackage.aggc a;
    public static final defpackage.aggc b;
    public static final defpackage.aggc c;
    public static final defpackage.aggc d;
    public static final defpackage.aggc e;
    public static final defpackage.aggc f;
    private static final /* synthetic */ defpackage.aggc[] g;

    static {
        defpackage.aggc aggcVar = new defpackage.aggc("UNKNOWN", 0);
        a = aggcVar;
        defpackage.aggc aggcVar2 = new defpackage.aggc("DEFAULT_SOLID", 1);
        b = aggcVar2;
        defpackage.aggc aggcVar3 = new defpackage.aggc("DEFAULT_GRADIENT", 2);
        c = aggcVar3;
        defpackage.aggc aggcVar4 = new defpackage.aggc("ACTIONABLE_GRADIENT", 3);
        d = aggcVar4;
        defpackage.aggc aggcVar5 = new defpackage.aggc("ERROR_SOLID", 4);
        e = aggcVar5;
        defpackage.aggc aggcVar6 = new defpackage.aggc("NONE", 5);
        f = aggcVar6;
        defpackage.aggc[] aggcVarArr = {aggcVar, aggcVar2, aggcVar3, aggcVar4, aggcVar5, aggcVar6};
        g = aggcVarArr;
        ajsz.am(aggcVarArr);
    }

    public static defpackage.aggc[] values() {
        return (defpackage.aggc[]) g.clone();
    }
}
