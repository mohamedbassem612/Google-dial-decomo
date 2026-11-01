package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lgq {
    public static final defpackage.lgq a;
    public static final defpackage.lgq b;
    public static final defpackage.lgq c;
    public static final defpackage.lgq d;
    public static final defpackage.lgq e;
    public static final defpackage.lgq f;
    private static final /* synthetic */ defpackage.lgq[] g;

    static {
        defpackage.lgq lgqVar = new defpackage.lgq("CALLER_DISCONNECT", 0);
        a = lgqVar;
        defpackage.lgq lgqVar2 = new defpackage.lgq("USER_DISCONNECT", 1);
        b = lgqVar2;
        defpackage.lgq lgqVar3 = new defpackage.lgq("USER_SILENT_DISCONNECT", 2);
        c = lgqVar3;
        defpackage.lgq lgqVar4 = new defpackage.lgq("DISCONNECT_AS_MISSED_CALL", 3);
        d = lgqVar4;
        defpackage.lgq lgqVar5 = new defpackage.lgq("UNKNOWN_CALL_DISCONNECT", 4);
        e = lgqVar5;
        defpackage.lgq lgqVar6 = new defpackage.lgq("REJECT_AS_SPAM", 5);
        f = lgqVar6;
        g = new defpackage.lgq[]{lgqVar, lgqVar2, lgqVar3, lgqVar4, lgqVar5, lgqVar6};
    }

    public static defpackage.lgq[] values() {
        return (defpackage.lgq[]) g.clone();
    }
}
