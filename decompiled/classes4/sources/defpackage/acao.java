package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acao extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akhy akhyVar = (defpackage.akhy) obj;
        int iOrdinal = akhyVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akve.ORIENTATION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akve.ORIENTATION_PORTRAIT;
        }
        if (iOrdinal == 2) {
            return defpackage.akve.ORIENTATION_LANDSCAPE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akhyVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akve akveVar = (defpackage.akve) obj;
        int iOrdinal = akveVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akhy.ORIENTATION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akhy.ORIENTATION_PORTRAIT;
        }
        if (iOrdinal == 2) {
            return defpackage.akhy.ORIENTATION_LANDSCAPE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akveVar.toString()));
    }
}
