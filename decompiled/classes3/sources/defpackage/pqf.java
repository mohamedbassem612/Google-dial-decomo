package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqf implements aomy {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public pqf(alg algVar, int i) {
        this.$cid = i;
        this.a = algVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v50, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v56, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v62, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v64, types: [aomy, java.lang.Object] */
    public final java.lang.Object a() {
        defpackage.rdd rddVar;
        defpackage.qax qaxVarAh;
        ok okVar = null;
        switch (this.$cid) {
            case 0:
                return ((alg) this.a).h();
            case 1:
                return java.lang.Float.valueOf(a.G((cer) this.a));
            case 2:
                return ((defpackage.pzj) this.a).g.e();
            case 3:
                ahvr.i(new defpackage.rdu(), ((defpackage.quz) this.a).e);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.rdk rdkVar = (defpackage.rdk) this.a;
                rdkVar.J.i(rdkVar.e()).b(mce.aF);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli() - ((defpackage.pom) this.a).d.e);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj = this.a;
                ahok ahokVarF = ((defpackage.rdk) obj).h.f(694, "Clicked Voice End Call Button");
                try {
                    defpackage.rdk.a.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "onEndCallClick", 753, "VoiceFragmentPeer.kt").v("end call button clicked");
                    defpackage.rap rapVarB = ((defpackage.rdk) obj).b();
                    if (rapVarB != null && rapVarB.r.d().size() <= 1) {
                        rapVarB.g.b(mce.aO);
                    }
                    ((defpackage.rdk) obj).i(qbc.gh);
                    defpackage.rap rapVarB2 = ((defpackage.rdk) obj).b();
                    if (rapVarB2 != null) {
                        rapVarB2.b();
                    }
                    defpackage.rcc rccVarD = ((defpackage.rdk) obj).d();
                    if (rccVarD != null) {
                        j$.util.Optional optionalE = ((defpackage.rdk) obj).G.e(rccVarD.a);
                        aooh.e(optionalE, "get(...)");
                        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
                        if (apqrVar != null && (rddVar = (defpackage.rdd) apqrVar.a(defpackage.rdd.class)) != null && (qaxVarAh = rddVar.ah()) != null) {
                            qaxVarAh.u = qaxVarAh.e.a();
                        }
                        break;
                    }
                    ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahokVarF, th);
                        throw th2;
                    }
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj2 = this.a;
                defpackage.xhs xhsVar = defpackage.aehc.a;
                defpackage.pxs pxsVar = new defpackage.pxs(obj2, 7);
                java.util.Set setAF = ajsz.aF(new defpackage.pxs(obj2, 8));
                aooh.f(xhsVar, "component");
                aooh.f(setAF, "tasks");
                hwv hwvVar = (hwv) obj2;
                ?? r5 = hwvVar.d;
                aooh.f((java.lang.Object) r5, "context");
                aooh.f(setAF, "<this>");
                return new defpackage.aehh(xhsVar, pxsVar, new defpackage.xmf(setAF), com.android.dialer.joyball.impl.consenttransfer.JoyballConsentTransferService.class, r5, (defpackage.uzx) hwvVar.e);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return (android.app.MemoryBudgetManager) ((defpackage.rtw) this.a).a.getSystemService(android.app.MemoryBudgetManager.class);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.rxo.a.b().l("com/android/dialer/opsrecordaudioaccess/precall/OpsRecordAudioPrecallIntegrationDialogFragmentPeer", "onCreateDialog$<anonymous>", 96, "OpsRecordAudioPrecallIntegrationDialogFragmentPeer.kt").v("requesting permission");
                ok okVar2 = ((defpackage.rxo) this.a).g;
                if (okVar2 == null) {
                    aooh.j("permissionRequestLauncher");
                } else {
                    okVar = okVar2;
                }
                okVar.b("android.permission.RECORD_AUDIO");
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                a.E((ccp) this.a, false);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((defpackage.ryq) this.a).a.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ?? r8 = this.a;
                a.E((ccp) r8, !a.C((ccp) r8));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.rzf) this.a).a.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ?? r9 = this.a;
                if (r9 != 0) {
                    r9.a();
                }
                return aojh.a;
            case 15:
                ?? r10 = this.a;
                if (r10 != 0) {
                    r10.a();
                }
                return aojh.a;
            case 16:
                defpackage.sle sleVar = (defpackage.sle) this.a;
                sleVar.i.o(rmx.yx);
                ok okVar3 = sleVar.z;
                if (okVar3 == null) {
                    aooh.j("pickMediaLauncher");
                    okVar3 = null;
                }
                ou ouVar = ou.a;
                kj.q();
                os osVar = os.a;
                kj.q();
                tw twVar = new tw((byte[]) null);
                twVar.a = ouVar;
                twVar.b = osVar;
                okVar3.b(twVar);
                return aojh.a;
            case 17:
                defpackage.sle sleVar2 = (defpackage.sle) this.a;
                sleVar2.i.o(rmx.yw);
                if (((java.lang.Boolean) sleVar2.w.a()).booleanValue()) {
                    agtj agtjVar = sleVar2.r;
                    defpackage.uhp uhpVar = sleVar2.K;
                    agtjVar.i(new defpackage.zoe((java.lang.Object) aosv.F((aoss) uhpVar.f, 0, new defpackage.sge(uhpVar, (aoln) null, 11), 3)), sleVar2.F);
                } else {
                    aoov.an(sleVar2.g, (aolr) null, 0, new defpackage.sge(sleVar2, (aoln) null, 13, (byte[]) null), 3);
                }
                return aojh.a;
            case 18:
                ((defpackage.sle) this.a).K.z(new defpackage.sdi(4));
                return aojh.a;
            case 19:
                defpackage.uhp uhpVar2 = ((defpackage.sle) this.a).K;
                java.lang.String strJ = uhpVar2.j();
                if (strJ != null && !aoov.H(strJ)) {
                    uhpVar2.w(true);
                }
                return aojh.a;
            default:
                ((defpackage.sle) this.a).K.w(false);
                return aojh.a;
        }
    }

    public /* synthetic */ pqf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
