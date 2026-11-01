package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class accl {
    public static final defpackage.accl a;
    public static final defpackage.accl b;
    public static final defpackage.accl c;
    private static final /* synthetic */ defpackage.accl[] d;

    static {
        defpackage.accl acclVar = new defpackage.accl("NOT_ATTEMPTED", 0);
        a = acclVar;
        defpackage.accl acclVar2 = new defpackage.accl("SUCCESS", 1);
        b = acclVar2;
        defpackage.accl acclVar3 = new defpackage.accl("FAILURE", 2);
        c = acclVar3;
        defpackage.accl[] acclVarArr = {acclVar, acclVar2, acclVar3};
        d = acclVarArr;
        defpackage.ajsz.am(acclVarArr);
    }

    public static defpackage.accl[] values() {
        return (defpackage.accl[]) d.clone();
    }
}
