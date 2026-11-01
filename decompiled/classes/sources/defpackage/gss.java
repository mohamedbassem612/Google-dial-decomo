package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gss {
    public static final defpackage.gss a;
    public static final defpackage.gss b;
    private static final /* synthetic */ defpackage.gss[] c;

    static {
        defpackage.gss gssVar = new defpackage.gss("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = gssVar;
        defpackage.gss gssVar2 = new defpackage.gss("DROP_WORK_REQUEST", 1);
        b = gssVar2;
        defpackage.gss[] gssVarArr = {gssVar, gssVar2};
        c = gssVarArr;
        defpackage.ajsz.am(gssVarArr);
    }

    public static defpackage.gss[] values() {
        return (defpackage.gss[]) c.clone();
    }
}
