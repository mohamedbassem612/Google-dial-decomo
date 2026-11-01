package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class annl {
    public static final defpackage.annl a;
    public static final defpackage.annl b;
    public static final defpackage.annl c;
    public static final defpackage.annl d;
    private static final /* synthetic */ defpackage.annl[] e;

    static {
        defpackage.annl annlVar = new defpackage.annl("CT_UNKNOWN", 0);
        a = annlVar;
        defpackage.annl annlVar2 = new defpackage.annl("CT_INFO", 1);
        b = annlVar2;
        defpackage.annl annlVar3 = new defpackage.annl("CT_WARNING", 2);
        c = annlVar3;
        defpackage.annl annlVar4 = new defpackage.annl("CT_ERROR", 3);
        d = annlVar4;
        e = new defpackage.annl[]{annlVar, annlVar2, annlVar3, annlVar4};
    }

    public static defpackage.annl[] values() {
        return (defpackage.annl[]) e.clone();
    }
}
