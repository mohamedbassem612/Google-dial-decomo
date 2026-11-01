package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gct {
    public static final defpackage.gct a;
    public static final defpackage.gct b;
    private static final /* synthetic */ defpackage.gct[] c;

    static {
        defpackage.gct gctVar = new defpackage.gct("LAUNCH_INITIAL_REFRESH", 0);
        a = gctVar;
        defpackage.gct gctVar2 = new defpackage.gct("SKIP_INITIAL_REFRESH", 1);
        b = gctVar2;
        defpackage.gct[] gctVarArr = {gctVar, gctVar2};
        c = gctVarArr;
        defpackage.ajsz.am(gctVarArr);
    }

    public static defpackage.gct[] values() {
        return (defpackage.gct[]) c.clone();
    }
}
