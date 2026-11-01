package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apsa implements defpackage.apru {
    private final /* synthetic */ int $cid;

    public apsa(int i) {
        this.$cid = i;
    }

    @Override // defpackage.apru
    public final /* synthetic */ defpackage.aprx a(defpackage.aptm aptmVar, defpackage.aprr aprrVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.apsb(aptmVar);
            case 1:
                return new defpackage.aprz(aptmVar);
            case 2:
                return new defpackage.apsc(aptmVar);
            case 3:
                return new defpackage.apsd(aptmVar);
            case 4:
                return new defpackage.apse(aptmVar);
            case 5:
                return new defpackage.apsf(aptmVar);
            case 6:
                return new defpackage.apsg(aptmVar);
            case 7:
                return new defpackage.apsh(aptmVar);
            case 8:
                return new defpackage.apsi(aptmVar);
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return new defpackage.apsj(aptmVar);
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return new defpackage.apsk(aptmVar);
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return new defpackage.apsn(aptmVar);
            case 12:
                return new defpackage.apso(aptmVar);
            case 13:
                return new defpackage.apsp(aptmVar);
            default:
                return new defpackage.apsq(aptmVar);
        }
    }
}
