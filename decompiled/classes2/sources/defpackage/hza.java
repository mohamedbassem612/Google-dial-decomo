package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hza {
    public static final defpackage.hza a;
    public static final defpackage.hza b;
    public static final defpackage.hza c;
    public static final defpackage.hza d;
    private static final /* synthetic */ defpackage.hza[] e;

    static {
        defpackage.hza hzaVar = new defpackage.hza("UNINITIALIZED", 0);
        a = hzaVar;
        defpackage.hza hzaVar2 = new defpackage.hza("INITIALIZED", 1);
        b = hzaVar2;
        defpackage.hza hzaVar3 = new defpackage.hza("STARTED", 2);
        c = hzaVar3;
        defpackage.hza hzaVar4 = new defpackage.hza("STOPPED", 3);
        d = hzaVar4;
        e = new defpackage.hza[]{hzaVar, hzaVar2, hzaVar3, hzaVar4};
    }

    public static defpackage.hza[] values() {
        return (defpackage.hza[]) e.clone();
    }
}
