package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rlb implements defpackage.rlc {
    public static final defpackage.rlb a;
    public static final defpackage.rlb b;
    public static final defpackage.rlb c;
    public static final defpackage.rlb d;
    public static final defpackage.rlb e;
    private static final /* synthetic */ defpackage.rlb[] f;

    static {
        defpackage.rlb rlbVar = new defpackage.rlb("EQUALS", 0);
        a = rlbVar;
        defpackage.rlb rlbVar2 = new defpackage.rlb("AT_LEAST", 1);
        b = rlbVar2;
        defpackage.rlb rlbVar3 = new defpackage.rlb("AT_MOST", 2);
        c = rlbVar3;
        defpackage.rlb rlbVar4 = new defpackage.rlb("LESS_THAN", 3);
        d = rlbVar4;
        defpackage.rlb rlbVar5 = new defpackage.rlb("GREATER_THAN", 4);
        e = rlbVar5;
        defpackage.rlb[] rlbVarArr = {rlbVar, rlbVar2, rlbVar3, rlbVar4, rlbVar5};
        f = rlbVarArr;
        defpackage.ajsz.am(rlbVarArr);
    }

    public static defpackage.rlb[] values() {
        return (defpackage.rlb[]) f.clone();
    }

    @Override // defpackage.rlc
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.lang.Object obj2) {
        int iIntValue = ((java.lang.Number) obj).intValue();
        int iIntValue2 = ((java.lang.Number) obj2).intValue();
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new defpackage.aois();
                        }
                        if (iIntValue > iIntValue2) {
                            return true;
                        }
                    } else if (iIntValue < iIntValue2) {
                        return true;
                    }
                } else if (iIntValue <= iIntValue2) {
                    return true;
                }
            } else if (iIntValue >= iIntValue2) {
                return true;
            }
        } else if (iIntValue == iIntValue2) {
            return true;
        }
        return false;
    }
}
