package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zdp {
    public static final defpackage.zdp a;
    public static final defpackage.zdp b;
    private static final /* synthetic */ defpackage.zdp[] c;

    static {
        defpackage.zdp zdpVar = new defpackage.zdp("NOT_DOWNLOADED", 0);
        a = zdpVar;
        defpackage.zdp zdpVar2 = new defpackage.zdp("DOWNLOADED", 1);
        b = zdpVar2;
        defpackage.zdp[] zdpVarArr = {zdpVar, zdpVar2};
        c = zdpVarArr;
        ajsz.am(zdpVarArr);
    }

    public static defpackage.zdp[] values() {
        return (defpackage.zdp[]) c.clone();
    }
}
