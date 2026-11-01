package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfn extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akjq akjqVar = (defpackage.akjq) obj;
        int iOrdinal = akjqVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akvi.CLIENT_VALUE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akvi.CLIENT_VALUE_ACCOUNT_NAME;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akjqVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akvi akviVar = (defpackage.akvi) obj;
        int iOrdinal = akviVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akjq.CLIENT_VALUE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akjq.CLIENT_VALUE_ACCOUNT_NAME;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akviVar.toString()));
    }
}
