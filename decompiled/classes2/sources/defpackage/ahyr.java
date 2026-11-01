package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ahyr implements ahyp {
    public static final defpackage.ahyr a;
    public static final defpackage.ahyr b;
    public static final defpackage.ahyr c;
    public static final defpackage.ahyr d;
    private static final /* synthetic */ defpackage.ahyr[] e;

    static {
        defpackage.ahyr ahyrVar = new defpackage.ahyr("ALWAYS_TRUE", 0);
        a = ahyrVar;
        defpackage.ahyr ahyrVar2 = new defpackage.ahyr("ALWAYS_FALSE", 1);
        b = ahyrVar2;
        defpackage.ahyr ahyrVar3 = new defpackage.ahyr("IS_NULL", 2);
        c = ahyrVar3;
        defpackage.ahyr ahyrVar4 = new defpackage.ahyr("NOT_NULL", 3);
        d = ahyrVar4;
        e = new defpackage.ahyr[]{ahyrVar, ahyrVar2, ahyrVar3, ahyrVar4};
    }

    public static defpackage.ahyr[] values() {
        return (defpackage.ahyr[]) e.clone();
    }

    public final /* synthetic */ boolean a(java.lang.Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw null;
                }
                if (obj != null) {
                    return true;
                }
            } else if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ java.lang.String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Predicates.alwaysTrue()";
        }
        if (iOrdinal == 1) {
            return "Predicates.alwaysFalse()";
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? super.toString() : "Predicates.notNull()";
        }
        return "Predicates.isNull()";
    }
}
