package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbe {
    public static final defpackage.wbe a;
    public static final defpackage.wbe b;
    public static final defpackage.wbe c;
    public static final defpackage.wbe d;
    public static final defpackage.wbe e;
    public static final defpackage.wbe f;
    private static final /* synthetic */ defpackage.wbe[] g;

    static {
        defpackage.wbe wbeVar = new defpackage.wbe("NOTIFYING_PHONE_IS_ELIGIBLE_FOR_ECHO", 0);
        a = wbeVar;
        defpackage.wbe wbeVar2 = new defpackage.wbe("WEAR_INITIATED_ECHO", 1);
        b = wbeVar2;
        defpackage.wbe wbeVar3 = new defpackage.wbe("NOTIFYING_ECHO_RINGING_STARTED", 2);
        c = wbeVar3;
        defpackage.wbe wbeVar4 = new defpackage.wbe("NOTIFYING_ECHO_RINGING_STOPPED", 3);
        d = wbeVar4;
        defpackage.wbe wbeVar5 = new defpackage.wbe("NOTIFYING_ECHO_RINGING_FAILED", 4);
        e = wbeVar5;
        defpackage.wbe wbeVar6 = new defpackage.wbe("WEAR_INITIATED_STOP_ECHO", 5);
        f = wbeVar6;
        defpackage.wbe[] wbeVarArr = {wbeVar, wbeVar2, wbeVar3, wbeVar4, wbeVar5, wbeVar6};
        g = wbeVarArr;
        ajsz.am(wbeVarArr);
    }

    public static defpackage.wbe[] values() {
        return (defpackage.wbe[]) g.clone();
    }
}
