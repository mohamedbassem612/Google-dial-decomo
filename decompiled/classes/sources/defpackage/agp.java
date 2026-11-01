package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agp {
    public static final defpackage.agp a;
    public static final defpackage.agp b;
    public static final defpackage.agp c;
    public static final defpackage.agp d;
    public static final defpackage.agp e;
    private static final /* synthetic */ defpackage.agp[] f;

    static {
        defpackage.agp agpVar = new defpackage.agp("Idle", 0);
        a = agpVar;
        defpackage.agp agpVar2 = new defpackage.agp("MutatingPendingCatchUp", 1);
        b = agpVar2;
        defpackage.agp agpVar3 = new defpackage.agp("MutatingCatchingUp", 2);
        c = agpVar3;
        defpackage.agp agpVar4 = new defpackage.agp("Mutating", 3);
        d = agpVar4;
        defpackage.agp agpVar5 = new defpackage.agp("Handoff", 4);
        e = agpVar5;
        defpackage.agp[] agpVarArr = {agpVar, agpVar2, agpVar3, agpVar4, agpVar5};
        f = agpVarArr;
        defpackage.ajsz.am(agpVarArr);
    }

    public static defpackage.agp[] values() {
        return (defpackage.agp[]) f.clone();
    }
}
