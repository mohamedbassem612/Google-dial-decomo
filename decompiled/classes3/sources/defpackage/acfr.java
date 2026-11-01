package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class acfr extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akkg akkgVar = (defpackage.akkg) obj;
        int iOrdinal = akkgVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akuw.PLACEMENT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.akuw.ABOVE;
        }
        if (iOrdinal == 2) {
            return defpackage.akuw.BELOW;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akkgVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akuw akuwVar = (defpackage.akuw) obj;
        int iOrdinal = akuwVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akkg.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akkg.ABOVE;
        }
        if (iOrdinal == 2) {
            return defpackage.akkg.BELOW;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akuwVar.toString()));
    }
}
