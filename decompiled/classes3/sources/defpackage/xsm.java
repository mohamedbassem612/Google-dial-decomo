package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xsm {
    public static final defpackage.xsm a;
    public static final defpackage.xsm b;
    public static final defpackage.xsm c;
    public static final defpackage.xsm d;
    private static final /* synthetic */ defpackage.xsm[] e;

    static {
        defpackage.xsm xsmVar = new defpackage.xsm("IMMEDIATE", 0);
        a = xsmVar;
        defpackage.xsm xsmVar2 = new defpackage.xsm("HIGH", 1);
        b = xsmVar2;
        defpackage.xsm xsmVar3 = new defpackage.xsm("NORMAL", 2);
        c = xsmVar3;
        defpackage.xsm xsmVar4 = new defpackage.xsm("LOW", 3);
        d = xsmVar4;
        e = new defpackage.xsm[]{xsmVar, xsmVar2, xsmVar3, xsmVar4};
    }

    public static defpackage.xsm[] values() {
        return (defpackage.xsm[]) e.clone();
    }
}
