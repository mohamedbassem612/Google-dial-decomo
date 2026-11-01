package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfl extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akjd akjdVar = (defpackage.akjd) obj;
        int iOrdinal = akjdVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akue.ALIGNMENT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.akue.TRAILING;
        }
        if (iOrdinal == 2) {
            return defpackage.akue.CENTER;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akjdVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akue akueVar = (defpackage.akue) obj;
        int iOrdinal = akueVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akjd.UNKNOWN_ALIGNMENT;
        }
        if (iOrdinal == 1) {
            return defpackage.akjd.RIGHT;
        }
        if (iOrdinal == 2) {
            return defpackage.akjd.CENTER;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akueVar.toString()));
    }
}
