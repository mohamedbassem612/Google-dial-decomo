package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xqc {
    public static final defpackage.xqc a;
    public static final defpackage.xqc b;
    private static final /* synthetic */ defpackage.xqc[] c;

    static {
        defpackage.xqc xqcVar = new defpackage.xqc("SINGLE_COMPONENT", 0);
        a = xqcVar;
        defpackage.xqc xqcVar2 = new defpackage.xqc("MULTI_COMPONENT", 1);
        b = xqcVar2;
        defpackage.xqc[] xqcVarArr = {xqcVar, xqcVar2};
        c = xqcVarArr;
        ajsz.am(xqcVarArr);
    }

    public static defpackage.xqc[] values() {
        return (defpackage.xqc[]) c.clone();
    }
}
