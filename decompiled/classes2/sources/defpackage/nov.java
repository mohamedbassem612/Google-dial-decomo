package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nov {
    public static final defpackage.nov a;
    public static final defpackage.nov b;
    public static final defpackage.nov c;
    public static final defpackage.nov d;
    private static final /* synthetic */ defpackage.nov[] e;

    static {
        defpackage.nov novVar = new defpackage.nov("NOT_STARTED", 0);
        a = novVar;
        defpackage.nov novVar2 = new defpackage.nov("PENDING", 1);
        b = novVar2;
        defpackage.nov novVar3 = new defpackage.nov("SUCCEEDED", 2);
        c = novVar3;
        defpackage.nov novVar4 = new defpackage.nov("FAILED", 3);
        d = novVar4;
        defpackage.nov[] novVarArr = {novVar, novVar2, novVar3, novVar4};
        e = novVarArr;
        ajsz.am(novVarArr);
    }

    public static defpackage.nov[] values() {
        return (defpackage.nov[]) e.clone();
    }
}
