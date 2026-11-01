package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ymu implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ymu(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        int i;
        boolean zB = true;
        switch (this.$cid) {
            case 0:
                return ((defpackage.ymc) obj).a;
            case 1:
                com.android.voicemail.impl.DialerVisualVoicemailService.a.d().k((java.lang.Throwable) obj).l("com/android/voicemail/impl/DialerVisualVoicemailService", "removeAccount", 390, "DialerVisualVoicemailService.java").v("Failed to remove VvmAccountState on SIM removal");
                return null;
            case 2:
                return agxh.a(obj, j$.time.Instant.now());
            case 3:
                defpackage.zrx zrxVar = (defpackage.zrx) obj;
                akzx akzxVarM = defpackage.zsr.a.m();
                akzxVarM.u();
                defpackage.zsr zsrVar = (defpackage.zsr) akzxVarM.b;
                j$.util.Objects.requireNonNull(zrxVar);
                zsrVar.d = zrxVar;
                zsrVar.b |= 2;
                defpackage.zsz zszVar = defpackage.zsz.DECISION_CONTINUE;
                akzxVarM.u();
                defpackage.zsr zsrVar2 = (defpackage.zsr) akzxVarM.b;
                zsrVar2.c = zszVar.g;
                zsrVar2.b |= 1;
                return (defpackage.zsr) akzxVarM.p();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.afpl) obj).b;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return defpackage.afpl.ag(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((albh) obj).i();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                double d = 1.0d;
                for (zzt zztVar : (java.util.List) obj) {
                    zB &= zztVar.b();
                    d *= zztVar.f;
                }
                return zzt.a(zB, d);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                boolean z = ((com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable) obj).a;
                java.util.WeakHashMap weakHashMap = defpackage.aaar.b;
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.abdm) obj).b;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.abdq) obj).b;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return android.os.Bundle.EMPTY;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return android.os.Bundle.EMPTY;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                throw new java.lang.UnsupportedOperationException("Do not call attach()");
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.acmd acmdVar = (defpackage.acmd) obj;
                defpackage.acox acoxVar = new defpackage.acox(acmdVar);
                acmdVar.a = acoxVar;
                int iAS = a.aS(acoxVar.a.a().e);
                acoxVar.b = iAS != 0 ? iAS : 1;
                return acmdVar;
            case 15:
                return new acun();
            case 16:
                return new defpackage.acxx((defpackage.acui) obj);
            case 17:
                defpackage.acxb acxbVar = (defpackage.acxb) obj;
                akzx akzxVarM2 = aixe.a.m();
                long j = acxbVar.a;
                akzxVarM2.u();
                aixe aixeVar = akzxVarM2.b;
                aixeVar.b |= 1;
                aixeVar.c = j;
                int i2 = acxbVar.e;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    i = 2;
                } else if (i3 == 1) {
                    i = 3;
                } else {
                    if (i3 != 2) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    i = 4;
                }
                akzxVarM2.u();
                aixe aixeVar2 = akzxVarM2.b;
                aixeVar2.d = i - 1;
                aixeVar2.b |= 2;
                boolean z2 = acxbVar.b;
                akzxVarM2.u();
                aixe aixeVar3 = akzxVarM2.b;
                aixeVar3.b |= 4;
                aixeVar3.e = z2;
                boolean z3 = acxbVar.c;
                akzxVarM2.u();
                aixe aixeVar4 = akzxVarM2.b;
                aixeVar4.b |= 8;
                aixeVar4.f = z3;
                boolean z4 = acxbVar.d;
                akzxVarM2.u();
                aixe aixeVar5 = akzxVarM2.b;
                aixeVar5.b |= 16;
                aixeVar5.g = z4;
                int i4 = acxbVar.f;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                int i6 = i5 != 1 ? 1 : 2;
                akzxVarM2.u();
                aixe aixeVar6 = akzxVarM2.b;
                aixeVar6.h = i6 - 1;
                aixeVar6.b |= 32;
                return akzxVarM2.p();
            case 18:
                return null;
            case 19:
                defpackage.acui acuiVar = (defpackage.acui) obj;
                ahvr.ci(acuiVar);
                return acuiVar;
            default:
                return ((java.lang.Boolean) obj).booleanValue() ? defpackage.acys.d : defpackage.acys.e;
        }
    }
}
