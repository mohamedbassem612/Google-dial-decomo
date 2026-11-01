package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pvi {
    public static final defpackage.pvi a;
    public static final defpackage.pvi b;
    private static final /* synthetic */ defpackage.pvi[] c;

    static {
        defpackage.pvi pviVar = new defpackage.pvi("REMOTE_DOWNGRADE", 0);
        a = pviVar;
        defpackage.pvi pviVar2 = new defpackage.pvi("LOW_NETWORK_QUALITY", 1);
        b = pviVar2;
        c = new defpackage.pvi[]{pviVar, pviVar2};
    }

    public static defpackage.pvi[] values() {
        return (defpackage.pvi[]) c.clone();
    }
}
