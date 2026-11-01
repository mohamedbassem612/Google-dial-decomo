package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class aefj extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akpn akpnVar = (defpackage.akpn) obj;
        switch (akpnVar) {
            case IMPORTANCE_UNSPECIFIED:
                return akrr.a;
            case IMPORTANCE_NONE:
                return akrr.b;
            case IMPORTANCE_DEFAULT:
                return akrr.c;
            case IMPORTANCE_HIGH:
                return akrr.d;
            case IMPORTANCE_LOW:
                return akrr.e;
            case IMPORTANCE_MAX:
                return akrr.f;
            case IMPORTANCE_MIN:
                return akrr.g;
            default:
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akpnVar.toString()));
        }
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        akrr akrrVar = (akrr) obj;
        switch (akrrVar.ordinal()) {
            case 0:
                return defpackage.akpn.IMPORTANCE_UNSPECIFIED;
            case 1:
                return defpackage.akpn.IMPORTANCE_NONE;
            case 2:
                return defpackage.akpn.IMPORTANCE_DEFAULT;
            case 3:
                return defpackage.akpn.IMPORTANCE_HIGH;
            case 4:
                return defpackage.akpn.IMPORTANCE_LOW;
            case 5:
                return defpackage.akpn.IMPORTANCE_MAX;
            case 6:
                return defpackage.akpn.IMPORTANCE_MIN;
            default:
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akrrVar.toString()));
        }
    }
}
