package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cdm {
    public static final defpackage.cdm a;
    public static final defpackage.cdm b;
    public static final defpackage.cdm c;
    public static final defpackage.cdm d;
    public static final defpackage.cdm e;
    public static final defpackage.cdm f;
    private static final /* synthetic */ defpackage.cdm[] g;

    static {
        defpackage.cdm cdmVar = new defpackage.cdm("ShutDown", 0);
        a = cdmVar;
        defpackage.cdm cdmVar2 = new defpackage.cdm("ShuttingDown", 1);
        b = cdmVar2;
        defpackage.cdm cdmVar3 = new defpackage.cdm("Inactive", 2);
        c = cdmVar3;
        defpackage.cdm cdmVar4 = new defpackage.cdm("InactivePendingWork", 3);
        d = cdmVar4;
        defpackage.cdm cdmVar5 = new defpackage.cdm("Idle", 4);
        e = cdmVar5;
        defpackage.cdm cdmVar6 = new defpackage.cdm("PendingWork", 5);
        f = cdmVar6;
        defpackage.cdm[] cdmVarArr = {cdmVar, cdmVar2, cdmVar3, cdmVar4, cdmVar5, cdmVar6};
        g = cdmVarArr;
        defpackage.ajsz.am(cdmVarArr);
    }

    public static defpackage.cdm[] values() {
        return (defpackage.cdm[]) g.clone();
    }
}
