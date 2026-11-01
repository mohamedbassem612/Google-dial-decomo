package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class aefg extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akqj akqjVar = (defpackage.akqj) obj;
        int iOrdinal = akqjVar.ordinal();
        if (iOrdinal == 0) {
            return akrp.a;
        }
        if (iOrdinal == 1) {
            return akrp.b;
        }
        if (iOrdinal == 2) {
            return akrp.c;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akqjVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        akrp akrpVar = (akrp) obj;
        int iOrdinal = akrpVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akqj.APP_BLOCK_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akqj.ALLOWED;
        }
        if (iOrdinal == 2) {
            return defpackage.akqj.BANNED;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akrpVar.toString()));
    }
}
