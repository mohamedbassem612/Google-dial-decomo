package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aefk extends defpackage.ahxq {
    @Override // defpackage.ahxq
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akro akroVar = (defpackage.akro) obj;
        switch (akroVar.ordinal()) {
            case 0:
                return defpackage.aefd.a;
            case 1:
                return defpackage.aefd.b;
            case 2:
                return defpackage.aefd.c;
            case 3:
                return defpackage.aefd.d;
            case 4:
                return defpackage.aefd.e;
            case 5:
                return defpackage.aefd.f;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.aefd.g;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.aefd.h;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.aefd.i;
            default:
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akroVar.toString()));
        }
    }

    @Override // defpackage.ahxq
    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.aefd aefdVar = (defpackage.aefd) obj;
        switch (aefdVar.ordinal()) {
            case 0:
                return defpackage.akro.DEFAULT;
            case 1:
                return defpackage.akro.TV;
            case 2:
                return defpackage.akro.WEARABLE;
            case 3:
                return defpackage.akro.AUTOMOTIVE;
            case 4:
                return defpackage.akro.BATTLESTAR;
            case 5:
                return defpackage.akro.CHROME_OS;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.akro.DESKTOP_ANDROID;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.akro.XR;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.akro.XR_PERIPHERAL;
            default:
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(aefdVar.toString()));
        }
    }
}
