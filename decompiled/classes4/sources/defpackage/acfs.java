package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfs extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akkm akkmVar = (defpackage.akkm) obj;
        int iOrdinal = akkmVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.aktv.ACTION_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.aktv.DISPLAYED;
        }
        if (iOrdinal == 2) {
            return defpackage.aktv.TAPPED;
        }
        if (iOrdinal == 3) {
            return defpackage.aktv.AUTOMATED;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akkmVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.aktv aktvVar = (defpackage.aktv) obj;
        int iOrdinal = aktvVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akkm.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akkm.DISPLAYED;
        }
        if (iOrdinal == 2) {
            return defpackage.akkm.TAPPED;
        }
        if (iOrdinal == 3) {
            return defpackage.akkm.AUTOMATED;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(aktvVar.toString()));
    }
}
