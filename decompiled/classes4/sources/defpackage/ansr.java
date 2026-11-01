package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ansr {
    public static final defpackage.ansr a;
    public static final defpackage.ansr b;
    public static final defpackage.ansr c;
    public static final defpackage.ansr d;
    public static final defpackage.ansr e;
    public static final defpackage.ansr f;
    private static final /* synthetic */ defpackage.ansr[] g;

    static {
        defpackage.ansr ansrVar = new defpackage.ansr("UNINITIALIZED", 0);
        a = ansrVar;
        defpackage.ansr ansrVar2 = new defpackage.ansr("INITIALIZED", 1);
        b = ansrVar2;
        defpackage.ansr ansrVar3 = new defpackage.ansr("PREFIX_DELIVERED", 2);
        c = ansrVar3;
        defpackage.ansr ansrVar4 = new defpackage.ansr("ALL_MESSAGES_DELIVERED", 3);
        d = ansrVar4;
        defpackage.ansr ansrVar5 = new defpackage.ansr("SUFFIX_DELIVERED", 4);
        e = ansrVar5;
        defpackage.ansr ansrVar6 = new defpackage.ansr("CLOSED", 5);
        f = ansrVar6;
        g = new defpackage.ansr[]{ansrVar, ansrVar2, ansrVar3, ansrVar4, ansrVar5, ansrVar6};
    }

    public static defpackage.ansr[] values() {
        return (defpackage.ansr[]) g.clone();
    }
}
