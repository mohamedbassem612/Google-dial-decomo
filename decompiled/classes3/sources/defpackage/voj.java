package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class voj {
    public static final defpackage.voj a;
    public static final defpackage.voj b;
    public static final defpackage.voj c;
    public static final defpackage.voj d;
    public static final defpackage.voj e;
    public static final defpackage.voj f;
    private static final /* synthetic */ defpackage.voj[] g;

    static {
        defpackage.voj vojVar = new defpackage.voj("INIT", 0);
        a = vojVar;
        defpackage.voj vojVar2 = new defpackage.voj("RECORDING", 1);
        b = vojVar2;
        defpackage.voj vojVar3 = new defpackage.voj("RECORDED", 2);
        c = vojVar3;
        defpackage.voj vojVar4 = new defpackage.voj("PLAYING_BACK", 3);
        d = vojVar4;
        defpackage.voj vojVar5 = new defpackage.voj("PLAYBACK_STOPPED", 4);
        e = vojVar5;
        defpackage.voj vojVar6 = new defpackage.voj("PLAYBACK_COMPLETED", 5);
        f = vojVar6;
        g = new defpackage.voj[]{vojVar, vojVar2, vojVar3, vojVar4, vojVar5, vojVar6};
    }

    public static defpackage.voj[] values() {
        return (defpackage.voj[]) g.clone();
    }
}
