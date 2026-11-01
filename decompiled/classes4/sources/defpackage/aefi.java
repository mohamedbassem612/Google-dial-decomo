package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class aefi extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akpk akpkVar = (defpackage.akpk) obj;
        int iOrdinal = akpkVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akrt.CHANNEL_GROUP_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akrt.ALLOWED;
        }
        if (iOrdinal == 2) {
            return defpackage.akrt.BANNED;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akpkVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akrt akrtVar = (defpackage.akrt) obj;
        int iOrdinal = akrtVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akpk.CHANNEL_GROUP_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akpk.ALLOWED;
        }
        if (iOrdinal == 2) {
            return defpackage.akpk.BANNED;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akrtVar.toString()));
    }
}
