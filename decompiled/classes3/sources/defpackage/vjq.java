package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vjq implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vjq(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.$cid) {
            case 0:
                return new java.lang.IllegalArgumentException("missing phone account");
            case 1:
                return new java.lang.NullPointerException();
            case 2:
                aimz aimzVar = defpackage.vko.a;
                return new java.lang.IllegalStateException("VvmCarrierName should be identified at this point but is not found.");
            case 3:
                vcr vcrVar = vlf.a;
                return new java.lang.IllegalStateException("Can't find content duration");
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                vcr vcrVar2 = vlf.a;
                defpackage.vbs vbsVar = defpackage.vbs.GREETING_SYNC_NO_GREETING;
                akzx akzxVarM = vcp.a.m();
                akzxVarM.u();
                vcp vcpVar = akzxVarM.b;
                vcpVar.c = java.lang.Integer.valueOf(vbsVar.a());
                vcpVar.b = 1;
                return new defpackage.vle(akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new java.lang.NullPointerException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return aiql.z(java.lang.Boolean.TRUE);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aimz aimzVar2 = vma.a;
                return new java.lang.IllegalStateException("Can't find date in attributes");
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aimz aimzVar3 = vma.a;
                return new java.lang.IllegalStateException("Can't find sender phone number in attributes");
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aimz aimzVar4 = vma.a;
                return new java.lang.IllegalStateException("Can't find content duration in attributes");
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new java.lang.NullPointerException();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new java.lang.IllegalStateException("No VoicemailGreetings instance found for the given phone account handle");
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new java.lang.IllegalStateException("phoneAccountHandle doesn't have VoicemailGreetings.");
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new java.lang.IllegalStateException("No custom greeting or voice signature instance found for the given greeting id");
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new java.util.NoSuchElementException();
            case 15:
                return new java.lang.IllegalStateException();
            case 16:
                return new java.lang.IllegalStateException("model not downloaded on device");
            case 17:
                return new java.util.ArrayList();
            case 18:
                return new java.lang.RuntimeException("audio file is not found");
            case 19:
                return new java.lang.IllegalStateException("audio tee absent");
            default:
                return j$.util.Optional.empty();
        }
    }
}
