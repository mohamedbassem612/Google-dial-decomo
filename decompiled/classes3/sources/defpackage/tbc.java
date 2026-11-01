package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tbc implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ tbc(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.tbe.SILENTLY_DECLINE;
                }
                return this.a + (-1) != 0 ? defpackage.tbe.AUTOMATICALLY_SCREEN : defpackage.tbe.RING_PHONE;
            case 1:
                aify aifyVar = (aify) obj;
                return aifyVar.b(0, java.lang.Math.min(aifyVar.size(), this.a));
            case 2:
                tbo.a.c().i(zct.b).k((java.lang.Throwable) obj).l("com/android/dialer/revelio/impl/tidepods/impl/transcriptdatabase/RevelioTranscriptDatabaseUpdater", "updateCallType", 49, "RevelioTranscriptDatabaseUpdater.java").w("Failed to mark automatically screened call as call type %d", this.a);
                return null;
            case 3:
                defpackage.acui acuiVar = (defpackage.acui) obj;
                if (acuiVar == null) {
                    tzq.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sonic/impl/mdd/SonicMddRepository", "areResourcesDownloadedInternal", 179, "SonicMddRepository.java").y("no ClientFileGroup for %s", defpackage.tzm.a.c);
                    return java.lang.Boolean.FALSE;
                }
                int i = this.a;
                int i2 = acuiVar.f;
                if (i2 >= i) {
                    return java.lang.Boolean.TRUE;
                }
                tzq.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sonic/impl/mdd/SonicMddRepository", "areResourcesDownloadedInternal", 186, "SonicMddRepository.java").z("Sonic MDD file group version: %s does not meet minimum file group version: %s", i2, i);
                return java.lang.Boolean.FALSE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aify aifyVar2 = (aify) obj;
                int i3 = this.a;
                aimz aimzVar = defpackage.uqp.a;
                return aifyVar2.b(0, java.lang.Math.min(aifyVar2.size(), i3));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                for (defpackage.vck vckVar : ((vcl) obj).b) {
                    int i4 = this.a;
                    if (vckVar.c == i4) {
                        return j$.util.Optional.of(vckVar);
                    }
                }
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                vyu.a.c().i(zct.b).k((java.lang.Throwable) obj).l("com/android/dialer/voicemail/wear/WearVoicemailNotificationSender", "attachDismissalIdAndSendVoicemailNotificationToWear", 83, "WearVoicemailNotificationSender.java").w("Failed to sync notification to wear for %s", this.a - 1);
                return null;
            default:
                dc.m(this.a);
                return null;
        }
    }
}
