package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class msz {
    public static final defpackage.msz a;
    public static final defpackage.msz b;
    public static final defpackage.msz c;
    public static final defpackage.msz d;
    public static final defpackage.msz e;
    public static final defpackage.msz f;
    public static final defpackage.msz g;
    public static final defpackage.msz h;
    private static final /* synthetic */ defpackage.msz[] i;

    static {
        defpackage.msz mszVar = new defpackage.msz("ALREADY_SCREENING", 0);
        a = mszVar;
        defpackage.msz mszVar2 = new defpackage.msz("SPAM_CALL", 1);
        b = mszVar2;
        defpackage.msz mszVar3 = new defpackage.msz("ROAMING_AND_SPAM_CALL", 2);
        c = mszVar3;
        defpackage.msz mszVar4 = new defpackage.msz("ANOTHER_ACTIVE_CALL", 3);
        d = mszVar4;
        defpackage.msz mszVar5 = new defpackage.msz("IS_CONTACT", 4);
        e = mszVar5;
        defpackage.msz mszVar6 = new defpackage.msz("RECENT_OUTGOING_CALL", 5);
        f = mszVar6;
        defpackage.msz mszVar7 = new defpackage.msz("OTHER", 6);
        g = mszVar7;
        defpackage.msz mszVar8 = new defpackage.msz("CALLER_MARKED_DO_NOT_SCREEN", 7);
        h = mszVar8;
        defpackage.msz[] mszVarArr = {mszVar, mszVar2, mszVar3, mszVar4, mszVar5, mszVar6, mszVar7, mszVar8};
        i = mszVarArr;
        ajsz.am(mszVarArr);
    }

    public static defpackage.msz[] values() {
        return (defpackage.msz[]) i.clone();
    }
}
