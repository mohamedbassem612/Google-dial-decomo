package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdf {
    public static final defpackage.wdf a;
    public static final defpackage.wdf b;
    public static final defpackage.wdf c;
    public static final defpackage.wdf d;
    public static final defpackage.wdf e;
    public static final defpackage.wdf f;
    private static final /* synthetic */ defpackage.wdf[] g;

    static {
        defpackage.wdf wdfVar = new defpackage.wdf("ACTION_RETURN_TO_CALL", 0);
        a = wdfVar;
        defpackage.wdf wdfVar2 = new defpackage.wdf("ACTION_TOGGLE_SPEAKER", 1);
        b = wdfVar2;
        defpackage.wdf wdfVar3 = new defpackage.wdf("ACTION_SHOW_AUDIO_ROUTE_SELECTOR", 2);
        c = wdfVar3;
        defpackage.wdf wdfVar4 = new defpackage.wdf("ACTION_TOGGLE_MUTE", 3);
        d = wdfVar4;
        defpackage.wdf wdfVar5 = new defpackage.wdf("ACTION_END_CALL", 4);
        e = wdfVar5;
        defpackage.wdf wdfVar6 = new defpackage.wdf("ACTION_DISMISS", 5);
        f = wdfVar6;
        g = new defpackage.wdf[]{wdfVar, wdfVar2, wdfVar3, wdfVar4, wdfVar5, wdfVar6};
    }

    public static defpackage.wdf[] values() {
        return (defpackage.wdf[]) g.clone();
    }
}
