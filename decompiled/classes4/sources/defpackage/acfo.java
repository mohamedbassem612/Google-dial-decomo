package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfo extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akki akkiVar = (defpackage.akki) obj;
        int iOrdinal = akkiVar.ordinal();
        if (iOrdinal == 0) {
            return akto.a;
        }
        if (iOrdinal == 1) {
            return akto.b;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akkiVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        akto aktoVar = (akto) obj;
        int iOrdinal = aktoVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akki.DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akki.BLOCK_WHEN_DASHER_ON_DEVICE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(aktoVar.toString()));
    }
}
