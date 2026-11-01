package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agvi {
    public static final defpackage.agvi a;
    public static final defpackage.agvi b;
    public static final defpackage.agvi c;
    private static final /* synthetic */ defpackage.agvi[] d;

    static {
        defpackage.agvi agviVar = new defpackage.agvi("NONE", 0);
        a = agviVar;
        defpackage.agvi agviVar2 = new defpackage.agvi("WARN_AT_STARTUP", 1);
        b = agviVar2;
        defpackage.agvi agviVar3 = new defpackage.agvi("CRASH_AT_STARTUP", 2);
        c = agviVar3;
        d = new defpackage.agvi[]{agviVar, agviVar2, agviVar3};
    }

    public static defpackage.agvi[] values() {
        return (defpackage.agvi[]) d.clone();
    }
}
