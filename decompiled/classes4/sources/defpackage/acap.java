package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acap extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akhz akhzVar = (defpackage.akhz) obj;
        int iOrdinal = akhzVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akvf.THEME_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akvf.THEME_LIGHT;
        }
        if (iOrdinal == 2) {
            return defpackage.akvf.THEME_DARK;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akhzVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akvf akvfVar = (defpackage.akvf) obj;
        int iOrdinal = akvfVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akhz.THEME_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akhz.THEME_LIGHT;
        }
        if (iOrdinal == 2) {
            return defpackage.akhz.THEME_DARK;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akvfVar.toString()));
    }
}
