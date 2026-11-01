package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoyz {
    public static final defpackage.aoyz a;
    public static final defpackage.aoyz b;
    public static final defpackage.aoyz c;
    private static final /* synthetic */ defpackage.aoyz[] d;

    static {
        defpackage.aoyz aoyzVar = new defpackage.aoyz("START", 0);
        a = aoyzVar;
        defpackage.aoyz aoyzVar2 = new defpackage.aoyz("STOP", 1);
        b = aoyzVar2;
        defpackage.aoyz aoyzVar3 = new defpackage.aoyz("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = aoyzVar3;
        defpackage.aoyz[] aoyzVarArr = {aoyzVar, aoyzVar2, aoyzVar3};
        d = aoyzVarArr;
        defpackage.ajsz.am(aoyzVarArr);
    }

    public static defpackage.aoyz[] values() {
        return (defpackage.aoyz[]) d.clone();
    }
}
