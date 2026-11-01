package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rlj implements defpackage.rlc {
    public static final defpackage.rlj a;
    public static final defpackage.rlj b;
    private static final /* synthetic */ defpackage.rlj[] c;

    static {
        defpackage.rlj rljVar = new defpackage.rlj("HASH_EQUALS", 0);
        a = rljVar;
        defpackage.rlj rljVar2 = new defpackage.rlj("LOWERCASE_HASH_EQUALS", 1);
        b = rljVar2;
        defpackage.rlj[] rljVarArr = {rljVar, rljVar2};
        c = rljVarArr;
        defpackage.ajsz.am(rljVarArr);
    }

    public static defpackage.rlj[] values() {
        return (defpackage.rlj[]) c.clone();
    }

    @Override // defpackage.rlc
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        int iIntValue = ((java.lang.Number) obj2).intValue();
        if (str == null) {
            defpackage.aooh.i("value");
        }
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new defpackage.aois();
            }
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase, "toLowerCase(...)");
            if (lowerCase.hashCode() == iIntValue) {
                return true;
            }
        } else if (str.hashCode() == iIntValue) {
            return true;
        }
        return false;
    }
}
