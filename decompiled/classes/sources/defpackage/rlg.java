package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rlg implements defpackage.rll {
    public static final defpackage.rlg a;
    public static final defpackage.rlg b;
    private static final /* synthetic */ defpackage.rlg[] c;

    static {
        defpackage.rlg rlgVar = new defpackage.rlg("MCC_MNC", 0);
        a = rlgVar;
        defpackage.rlg rlgVar2 = new defpackage.rlg("COUNTRY_ISO", 1);
        b = rlgVar2;
        defpackage.rlg[] rlgVarArr = {rlgVar, rlgVar2};
        c = rlgVarArr;
        defpackage.ajsz.am(rlgVarArr);
    }

    public static defpackage.rlg[] values() {
        return (defpackage.rlg[]) c.clone();
    }

    @Override // defpackage.rld
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.String str;
        defpackage.rli rliVar = (defpackage.rli) obj;
        defpackage.aooh.f(rliVar, "state");
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            str = rliVar.e;
        } else {
            if (iOrdinal != 1) {
                throw new defpackage.aois();
            }
            str = rliVar.g;
        }
        defpackage.aooh.e(str, "with(...)");
        return str;
    }
}
