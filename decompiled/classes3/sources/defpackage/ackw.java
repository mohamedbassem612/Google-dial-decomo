package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackw {
    public static final defpackage.ackw a;
    public static final defpackage.ackw b;
    public static final defpackage.ackw c;
    public static final defpackage.ackw d;
    public static final defpackage.ackw e;
    private static final /* synthetic */ defpackage.ackw[] f;

    static {
        defpackage.ackw ackwVar = new defpackage.ackw("ACTION_UNKNOWN", 0);
        a = ackwVar;
        defpackage.ackw ackwVar2 = new defpackage.ackw("ACTION_POSITIVE", 1);
        b = ackwVar2;
        defpackage.ackw ackwVar3 = new defpackage.ackw("ACTION_NEGATIVE", 2);
        c = ackwVar3;
        defpackage.ackw ackwVar4 = new defpackage.ackw("ACTION_DISMISS", 3);
        d = ackwVar4;
        defpackage.ackw ackwVar5 = new defpackage.ackw("ACTION_ACKNOWLEDGE", 4);
        e = ackwVar5;
        defpackage.ackw[] ackwVarArr = {ackwVar, ackwVar2, ackwVar3, ackwVar4, ackwVar5};
        f = ackwVarArr;
        ajsz.am(ackwVarArr);
    }

    public static defpackage.ackw[] values() {
        return (defpackage.ackw[]) f.clone();
    }
}
