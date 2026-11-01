package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxi {
    public static final defpackage.sxi a;
    public static final defpackage.sxi b;
    public static final defpackage.sxi c;
    public static final defpackage.sxi d;
    public static final defpackage.sxi e;
    private static final /* synthetic */ defpackage.sxi[] f;

    static {
        defpackage.sxi sxiVar = new defpackage.sxi("REVELIO_ALREADY_RUNNING", 0);
        a = sxiVar;
        defpackage.sxi sxiVar2 = new defpackage.sxi("SPAM_CALL", 1);
        b = sxiVar2;
        defpackage.sxi sxiVar3 = new defpackage.sxi("SHOULD_SILENCE", 2);
        c = sxiVar3;
        defpackage.sxi sxiVar4 = new defpackage.sxi("CONTACT_CALL", 3);
        d = sxiVar4;
        defpackage.sxi sxiVar5 = new defpackage.sxi("OTHER", 4);
        e = sxiVar5;
        defpackage.sxi[] sxiVarArr = {sxiVar, sxiVar2, sxiVar3, sxiVar4, sxiVar5};
        f = sxiVarArr;
        ajsz.am(sxiVarArr);
    }

    public static defpackage.sxi[] values() {
        return (defpackage.sxi[]) f.clone();
    }
}
