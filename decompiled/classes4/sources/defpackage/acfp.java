package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfp extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akjg akjgVar = (defpackage.akjg) obj;
        int iOrdinal = akjgVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akug.FONT_SIZE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.akug.SMALL;
        }
        if (iOrdinal == 2) {
            return defpackage.akug.LARGE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akjgVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akug akugVar = (defpackage.akug) obj;
        int iOrdinal = akugVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akjg.TEXT_SIZE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akjg.MATERIAL_SUBHEAD_1;
        }
        if (iOrdinal == 2) {
            return defpackage.akjg.MATERIAL_HEADLINE_5;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akugVar.toString()));
    }
}
