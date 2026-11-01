package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class acas extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akif akifVar = (defpackage.akif) obj;
        int iOrdinal = akifVar.ordinal();
        if (iOrdinal == 0) {
            return akvn.a;
        }
        if (iOrdinal == 1) {
            return akvn.b;
        }
        if (iOrdinal == 2) {
            return akvn.c;
        }
        if (iOrdinal == 3) {
            return akvn.d;
        }
        if (iOrdinal == 4) {
            return akvn.e;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akifVar.toString()));
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        akvn akvnVar = (akvn) obj;
        int iOrdinal = akvnVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.akif.ACTION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return defpackage.akif.ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return defpackage.akif.ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return defpackage.akif.ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return defpackage.akif.ACTION_ACKNOWLEDGE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akvnVar.toString()));
    }
}
