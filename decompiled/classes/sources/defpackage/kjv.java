package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kjv {
    public static final defpackage.kjv a;
    public static final defpackage.kjv b;
    public static final defpackage.kjv c;
    public static final defpackage.kjv d;
    private static final /* synthetic */ defpackage.kjv[] e;

    static {
        defpackage.kjv kjvVar = new defpackage.kjv("NOT_DIRTY", 0);
        a = kjvVar;
        defpackage.kjv kjvVar2 = new defpackage.kjv("CONVERSATION_HISTORY_REFRESHED", 1);
        b = kjvVar2;
        defpackage.kjv kjvVar3 = new defpackage.kjv("REBUILT_BUT_NO_CHANGES_NEEDED", 2);
        c = kjvVar3;
        defpackage.kjv kjvVar4 = new defpackage.kjv("REBUILT_AND_CHANGES_NEEDED", 3);
        d = kjvVar4;
        e = new defpackage.kjv[]{kjvVar, kjvVar2, kjvVar3, kjvVar4};
    }

    public static defpackage.kjv[] values() {
        return (defpackage.kjv[]) e.clone();
    }
}
