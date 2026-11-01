package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbd {
    public static final defpackage.wbd a;
    public static final defpackage.wbd b;
    public static final defpackage.wbd c;
    public static final defpackage.wbd d;
    public static final defpackage.wbd e;
    private static final /* synthetic */ defpackage.wbd[] f;

    static {
        defpackage.wbd wbdVar = new defpackage.wbd("ECHO_INELIGIBLE", 0);
        a = wbdVar;
        defpackage.wbd wbdVar2 = new defpackage.wbd("ECHO_ELIGIBLE", 1);
        b = wbdVar2;
        defpackage.wbd wbdVar3 = new defpackage.wbd("ECHO_RINGING", 2);
        c = wbdVar3;
        defpackage.wbd wbdVar4 = new defpackage.wbd("ECHO_COMPLETE", 3);
        d = wbdVar4;
        defpackage.wbd wbdVar5 = new defpackage.wbd("ECHO_FAILED", 4);
        e = wbdVar5;
        defpackage.wbd[] wbdVarArr = {wbdVar, wbdVar2, wbdVar3, wbdVar4, wbdVar5};
        f = wbdVarArr;
        ajsz.am(wbdVarArr);
    }

    public static defpackage.wbd[] values() {
        return (defpackage.wbd[]) f.clone();
    }
}
