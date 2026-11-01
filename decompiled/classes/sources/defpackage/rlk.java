package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rlk implements defpackage.rlc {
    public static final defpackage.rlk a;
    public static final defpackage.rlk b;
    public static final defpackage.rlk c;
    public static final defpackage.rlk d;
    public static final defpackage.rlk e;
    private static final /* synthetic */ defpackage.rlk[] f;

    static {
        defpackage.rlk rlkVar = new defpackage.rlk("EQUALS", 0);
        a = rlkVar;
        defpackage.rlk rlkVar2 = new defpackage.rlk("EQUALS_IGNORE_CASE", 1);
        b = rlkVar2;
        defpackage.rlk rlkVar3 = new defpackage.rlk("CONTAINS", 2);
        c = rlkVar3;
        defpackage.rlk rlkVar4 = new defpackage.rlk("STARTS_WITH", 3);
        d = rlkVar4;
        defpackage.rlk rlkVar5 = new defpackage.rlk("ENDS_WITH", 4);
        e = rlkVar5;
        defpackage.rlk[] rlkVarArr = {rlkVar, rlkVar2, rlkVar3, rlkVar4, rlkVar5};
        f = rlkVarArr;
        defpackage.ajsz.am(rlkVarArr);
    }

    public static defpackage.rlk[] values() {
        return (defpackage.rlk[]) f.clone();
    }

    @Override // defpackage.rlc
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        if (str == null) {
            defpackage.aooh.i("value");
        }
        if (str2 == null) {
            defpackage.aooh.i("operand");
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return defpackage.aooh.n(str, str2);
        }
        if (iOrdinal == 1) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase, "toLowerCase(...)");
            java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase2, "toLowerCase(...)");
            return lowerCase.equals(lowerCase2);
        }
        if (iOrdinal == 2) {
            return defpackage.aoov.G(str, str2, false);
        }
        if (iOrdinal == 3) {
            return defpackage.aoov.ad(str, str2);
        }
        if (iOrdinal == 4) {
            return defpackage.aoov.r(str, str2, false);
        }
        throw new defpackage.aois();
    }
}
