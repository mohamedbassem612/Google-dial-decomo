package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anmm {
    public static final defpackage.anmm a;
    public static final defpackage.anmm b;
    public static final defpackage.anmm c;
    public static final defpackage.anmm d;
    public static final defpackage.anmm e;
    private static final /* synthetic */ defpackage.anmm[] f;

    static {
        defpackage.anmm anmmVar = new defpackage.anmm("CONNECTING", 0);
        a = anmmVar;
        defpackage.anmm anmmVar2 = new defpackage.anmm("READY", 1);
        b = anmmVar2;
        defpackage.anmm anmmVar3 = new defpackage.anmm("TRANSIENT_FAILURE", 2);
        c = anmmVar3;
        defpackage.anmm anmmVar4 = new defpackage.anmm("IDLE", 3);
        d = anmmVar4;
        defpackage.anmm anmmVar5 = new defpackage.anmm("SHUTDOWN", 4);
        e = anmmVar5;
        f = new defpackage.anmm[]{anmmVar, anmmVar2, anmmVar3, anmmVar4, anmmVar5};
    }

    public static defpackage.anmm[] values() {
        return (defpackage.anmm[]) f.clone();
    }
}
