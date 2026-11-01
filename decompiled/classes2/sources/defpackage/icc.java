package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class icc {
    public static final defpackage.icc a;
    public static final defpackage.icc b;
    private static final /* synthetic */ defpackage.icc[] c;

    static {
        defpackage.icc iccVar = new defpackage.icc("DOWNLINK", 0);
        a = iccVar;
        defpackage.icc iccVar2 = new defpackage.icc("UPLINK", 1);
        b = iccVar2;
        defpackage.icc[] iccVarArr = {iccVar, iccVar2};
        c = iccVarArr;
        ajsz.am(iccVarArr);
    }

    public static defpackage.icc[] values() {
        return (defpackage.icc[]) c.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final defpackage.icc a() throws aois {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return b;
        }
        if (iOrdinal == 1) {
            return a;
        }
        throw new aois();
    }
}
