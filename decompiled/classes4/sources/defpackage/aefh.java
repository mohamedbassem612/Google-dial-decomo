package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class aefh extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akpm akpmVar = (defpackage.akpm) obj;
        int iOrdinal = akpmVar.ordinal();
        if (iOrdinal == 0) {
            return akrq.a;
        }
        if (iOrdinal == 1) {
            return akrq.b;
        }
        if (iOrdinal == 2) {
            return akrq.c;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akpmVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        akrq akrqVar = (akrq) obj;
        int iOrdinal = akrqVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akpm.UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.akpm.TRUE;
        }
        if (iOrdinal == 2) {
            return defpackage.akpm.FALSE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akrqVar.toString()));
    }
}
