package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kxq {
    public static final defpackage.kxq a;
    public static final defpackage.kxq b;
    public static final defpackage.kxq c;
    public static final defpackage.kxq d;
    private static final /* synthetic */ defpackage.kxq[] e;

    static {
        defpackage.kxq kxqVar = new defpackage.kxq("IDLE", 0);
        a = kxqVar;
        defpackage.kxq kxqVar2 = new defpackage.kxq("PLAYING_STARTING_AUDIO", 1);
        b = kxqVar2;
        defpackage.kxq kxqVar3 = new defpackage.kxq("RECORDING", 2);
        c = kxqVar3;
        defpackage.kxq kxqVar4 = new defpackage.kxq("PLAYING_ENDING_AUDIO", 3);
        d = kxqVar4;
        e = new defpackage.kxq[]{kxqVar, kxqVar2, kxqVar3, kxqVar4};
    }

    public static defpackage.kxq[] values() {
        return (defpackage.kxq[]) e.clone();
    }
}
