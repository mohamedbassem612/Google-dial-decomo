package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vef implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vef(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vbs vbsVar;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return new gsd();
            case 1:
                return new gsd();
            case 2:
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                long j = jElapsedRealtime / 1000;
                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(jElapsedRealtime - java.util.concurrent.TimeUnit.SECONDS.toMillis(j));
                akzx akzxVarM = akzm.a.m();
                akzxVarM.u();
                akzxVarM.b.b = j;
                akzxVarM.u();
                akzxVarM.b.c = (int) nanos;
                akzm akzmVarP = akzxVarM.p();
                akzx akzxVarM2 = defpackage.vcj.a.m();
                akzxVarM2.u();
                defpackage.vcj vcjVar = (defpackage.vcj) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akzmVarP);
                vcjVar.c = akzmVarP;
                vcjVar.b |= 1;
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzxVarM2.u();
                ((defpackage.vcj) akzxVarM2.b).d = iIntValue;
                return (defpackage.vcj) akzxVarM2.p();
            case 3:
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return (defpackage.viy) ((j$.util.Optional) obj).orElseThrow(new defpackage.rqc(12));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num.intValue() == 0) {
                    akzx akzxVarM3 = vcr.a.m();
                    vcq vcqVar = vcq.a;
                    akzxVarM3.u();
                    vcr vcrVar = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(vcqVar);
                    vcrVar.c = vcqVar;
                    vcrVar.b = 1;
                    return akzxVarM3.p();
                }
                akzx akzxVarM4 = vcr.a.m();
                akzx akzxVarM5 = vcp.a.m();
                int iIntValue2 = num.intValue();
                if (iIntValue2 == 1) {
                    vbsVar = defpackage.vbs.PIN_CHANGE_TOO_SHORT;
                } else if (iIntValue2 == 2) {
                    vbsVar = defpackage.vbs.PIN_CHANGE_TOO_LONG;
                } else if (iIntValue2 == 3) {
                    vbsVar = defpackage.vbs.PIN_CHANGE_TOO_WEAK;
                } else if (iIntValue2 != 4) {
                    vbsVar = iIntValue2 != 5 ? defpackage.vbs.PIN_CHANGE_SYSTEM_ERROR : defpackage.vbs.PIN_CHANGE_INVALID_CHARACTER;
                } else {
                    vbsVar = defpackage.vbs.PIN_CHANGE_INCORRECT_OLD_PIN;
                }
                akzxVarM5.u();
                vcp vcpVar = akzxVarM5.b;
                vcpVar.c = java.lang.Integer.valueOf(vbsVar.a());
                vcpVar.b = 1;
                akzxVarM4.u();
                vcr vcrVar2 = akzxVarM4.b;
                vcp vcpVarP = akzxVarM5.p();
                j$.util.Objects.requireNonNull(vcpVarP);
                vcrVar2.c = vcpVarP;
                vcrVar2.b = 2;
                return akzxVarM4.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.vcx) obj).a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                akzx akzxVarM6 = vcr.a.m();
                vcq vcqVar2 = vcq.a;
                akzxVarM6.u();
                vcr vcrVar3 = akzxVarM6.b;
                j$.util.Objects.requireNonNull(vcqVar2);
                vcrVar3.c = vcqVar2;
                vcrVar3.b = 1;
                return akzxVarM6.p();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return java.lang.Boolean.valueOf(((j$.util.Optional) obj).isPresent());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return vfo.c;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aimz aimzVar = vfo.a;
                return anar.t(defpackage.vbw.PROVISION_NOT_REQUIRED);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aimz aimzVar2 = vfo.a;
                return anar.t(defpackage.vbw.PROVISION_NEED_TO_DISABLE_VVM);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                vbu vbuVar = (vbu) obj;
                if ((vbuVar.b & 2048) != 0 && vbuVar.o) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                defpackage.vok vokVar = new defpackage.vok();
                if (!optional.isPresent()) {
                    return vokVar;
                }
                java.util.List listJ = ahzf.b('-').j(((defpackage.vgm) optional.orElseThrow()).i);
                if (listJ.size() != 2) {
                    return vokVar;
                }
                try {
                    vokVar.b = java.lang.Integer.parseInt((java.lang.String) listJ.get(0));
                    vokVar.a = java.lang.Integer.parseInt((java.lang.String) listJ.get(1));
                    return vokVar;
                } catch (java.lang.NumberFormatException e) {
                    a.bq(vfu.a.c(), "failed to parse the tui password length.", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmConfiguration", "extractPinSpecification", (char) 292, "OmtpVvmConfiguration.java", e, zct.b);
                    return vokVar;
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                vbu vbuVar2 = (vbu) obj;
                return ((vbuVar2.b & 262144) == 0 || vbuVar2.v) ? defpackage.vcf.c : defpackage.vcf.a;
            case 15:
                return java.lang.Boolean.valueOf(((vbu) obj).e);
            case 16:
                return java.lang.Boolean.valueOf(((vbu) obj).i);
            case 17:
                return ((vbu) obj).y;
            case 18:
                return aihd.o(((vbu) obj).g);
            case 19:
                return java.lang.Boolean.valueOf(((vbu) obj).j);
            default:
                return java.lang.Boolean.valueOf(((vbu) obj).z);
        }
    }
}
