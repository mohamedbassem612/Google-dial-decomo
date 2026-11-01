package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfm extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akje akjeVar = (defpackage.akje) obj;
        int iOrdinal = akjeVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akub.BUTTONS_LAYOUT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.akub.STACKED;
        }
        if (iOrdinal == 2) {
            return defpackage.akub.SIDE_BY_SIDE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akjeVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akub akubVar = (defpackage.akub) obj;
        int iOrdinal = akubVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akje.UNKNOWN_LAYOUT;
        }
        if (iOrdinal == 1) {
            return defpackage.akje.VERTICAL;
        }
        if (iOrdinal == 2) {
            return defpackage.akje.HORIZONTAL;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akubVar.toString()));
    }
}
