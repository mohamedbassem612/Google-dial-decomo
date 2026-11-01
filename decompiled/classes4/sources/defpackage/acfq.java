package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfq extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akij akijVar = (defpackage.akij) obj;
        int iOrdinal = akijVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akuz.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akuz.ACTIVITY;
        }
        if (iOrdinal == 2) {
            return defpackage.akuz.SERVICE;
        }
        if (iOrdinal == 3) {
            return defpackage.akuz.BROADCAST;
        }
        if (iOrdinal == 4) {
            return defpackage.akuz.ACTIVITY_WITH_RESULT;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akijVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akuz akuzVar = (defpackage.akuz) obj;
        int iOrdinal = akuzVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akij.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akij.ACTIVITY;
        }
        if (iOrdinal == 2) {
            return defpackage.akij.SERVICE;
        }
        if (iOrdinal == 3) {
            return defpackage.akij.BROADCAST;
        }
        if (iOrdinal == 4) {
            return defpackage.akij.ACTIVITY_WITH_RESULT;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akuzVar.toString()));
    }
}
