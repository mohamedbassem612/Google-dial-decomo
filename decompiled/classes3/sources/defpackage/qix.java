package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qix {
    public static final defpackage.qix a;
    public static final defpackage.qix b;
    public static final defpackage.qix c;
    public static final defpackage.qix d;
    public static final defpackage.qix e;
    private static final /* synthetic */ defpackage.qix[] f;

    static {
        defpackage.qix qixVar = new defpackage.qix("NONE", 0);
        a = qixVar;
        defpackage.qix qixVar2 = new defpackage.qix("ONGOING_CALL", 1);
        b = qixVar2;
        defpackage.qix qixVar3 = new defpackage.qix("INCOMING_CALL", 2);
        c = qixVar3;
        defpackage.qix qixVar4 = new defpackage.qix("INCOMING_CALL_QUIET", 3);
        d = qixVar4;
        defpackage.qix qixVar5 = new defpackage.qix("SCREENING_CALL", 4);
        e = qixVar5;
        f = new defpackage.qix[]{qixVar, qixVar2, qixVar3, qixVar4, qixVar5};
    }

    public static defpackage.qix[] values() {
        return (defpackage.qix[]) f.clone();
    }
}
