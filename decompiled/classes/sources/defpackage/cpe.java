package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpe {
    public static final defpackage.cpe a;
    public static final defpackage.cpe b;
    public static final defpackage.cpe c;
    public static final defpackage.cpe d;
    private static final /* synthetic */ defpackage.cpe[] e;

    static {
        defpackage.cpe cpeVar = new defpackage.cpe("Active", 0);
        a = cpeVar;
        defpackage.cpe cpeVar2 = new defpackage.cpe("ActiveParent", 1);
        b = cpeVar2;
        defpackage.cpe cpeVar3 = new defpackage.cpe("Captured", 2);
        c = cpeVar3;
        defpackage.cpe cpeVar4 = new defpackage.cpe("Inactive", 3);
        d = cpeVar4;
        defpackage.cpe[] cpeVarArr = {cpeVar, cpeVar2, cpeVar3, cpeVar4};
        e = cpeVarArr;
        defpackage.ajsz.am(cpeVarArr);
    }

    public static defpackage.cpe[] values() {
        return (defpackage.cpe[]) e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new defpackage.aois();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                throw new defpackage.aois();
            }
        }
        return false;
    }
}
