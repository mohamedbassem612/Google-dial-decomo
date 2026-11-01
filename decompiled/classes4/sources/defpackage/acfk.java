package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfk extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akjb akjbVar = (defpackage.akjb) obj;
        int iOrdinal = akjbVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akty.USER_ACTION_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.akty.USER_ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return defpackage.akty.USER_ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return defpackage.akty.USER_ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return defpackage.akty.USER_ACTION_ACKNOWLEDGE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akjbVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akty aktyVar = (defpackage.akty) obj;
        int iOrdinal = aktyVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akjb.ACTION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akjb.ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return defpackage.akjb.ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return defpackage.akjb.ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return defpackage.akjb.ACTION_ACKNOWLEDGE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(aktyVar.toString()));
    }
}
