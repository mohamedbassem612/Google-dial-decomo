package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgc {
    public static final defpackage.kgc a;
    public static final defpackage.kgc b;
    public static final defpackage.kgc c;
    public static final defpackage.kgc d;
    public static final defpackage.kgc e;
    public static final defpackage.kgc f;
    public static final defpackage.kgc g;
    private static final /* synthetic */ defpackage.kgc[] h;

    static {
        defpackage.kgc kgcVar = new defpackage.kgc("ALL", 0);
        a = kgcVar;
        defpackage.kgc kgcVar2 = new defpackage.kgc("MISSED", 1);
        b = kgcVar2;
        defpackage.kgc kgcVar3 = new defpackage.kgc("CONTACTS", 2);
        c = kgcVar3;
        defpackage.kgc kgcVar4 = new defpackage.kgc("NON_SPAM", 3);
        d = kgcVar4;
        defpackage.kgc kgcVar5 = new defpackage.kgc("SPAM", 4);
        e = kgcVar5;
        defpackage.kgc kgcVar6 = new defpackage.kgc("CALL_RECORDING", 5);
        f = kgcVar6;
        defpackage.kgc kgcVar7 = new defpackage.kgc("CALL_NOTES", 6);
        g = kgcVar7;
        defpackage.kgc[] kgcVarArr = {kgcVar, kgcVar2, kgcVar3, kgcVar4, kgcVar5, kgcVar6, kgcVar7};
        h = kgcVarArr;
        defpackage.ajsz.am(kgcVarArr);
    }

    public static defpackage.kgc[] values() {
        return (defpackage.kgc[]) h.clone();
    }
}
