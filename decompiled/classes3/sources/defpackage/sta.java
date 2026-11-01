package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sta {
    public static final defpackage.sta a;
    public static final defpackage.sta b;
    public static final defpackage.sta c;
    public static final defpackage.sta d;
    public static final defpackage.sta e;
    public static final defpackage.sta f;
    public static final defpackage.sta g;
    private static final /* synthetic */ defpackage.sta[] h;

    static {
        defpackage.sta staVar = new defpackage.sta("IDLE", 0);
        a = staVar;
        defpackage.sta staVar2 = new defpackage.sta("PREPARING", 1);
        b = staVar2;
        defpackage.sta staVar3 = new defpackage.sta("PREPARED", 2);
        c = staVar3;
        defpackage.sta staVar4 = new defpackage.sta("STARTED", 3);
        d = staVar4;
        defpackage.sta staVar5 = new defpackage.sta("STOPPED", 4);
        e = staVar5;
        defpackage.sta staVar6 = new defpackage.sta("PLAYBACK_COMPLETE", 5);
        f = staVar6;
        defpackage.sta staVar7 = new defpackage.sta("PAUSED", 6);
        g = staVar7;
        h = new defpackage.sta[]{staVar, staVar2, staVar3, staVar4, staVar5, staVar6, staVar7};
    }

    public static defpackage.sta[] values() {
        return (defpackage.sta[]) h.clone();
    }
}
