package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amup implements defpackage.amur {
    @Override // defpackage.amur
    public final defpackage.amvb a(java.lang.String str, defpackage.amun amunVar, int i) {
        defpackage.amur amutVar;
        switch (amunVar.ordinal()) {
            case 0:
                amutVar = new defpackage.amut();
                break;
            case 1:
                amutVar = new defpackage.amvq();
                break;
            case 2:
                amutVar = new defpackage.amvu();
                break;
            case 3:
                amutVar = new defpackage.amvw();
                break;
            case 4:
                amutVar = new defpackage.amvs();
                break;
            case 5:
                amutVar = new defpackage.amvf();
                break;
            case 6:
                amutVar = new defpackage.amvz();
                break;
            case 7:
                amutVar = new defpackage.amvy();
                break;
            case 8:
                amutVar = new defpackage.amwa();
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
            case 12:
            case 13:
            default:
                throw new java.lang.IllegalArgumentException("No encoder available for format ".concat(amunVar.toString()));
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                amutVar = new defpackage.amwh();
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                amutVar = new defpackage.amwl();
                break;
            case 14:
                amutVar = new defpackage.amwc();
                break;
            case 15:
                amutVar = new defpackage.amwg();
                break;
        }
        return amutVar.a(str, amunVar, i);
    }
}
