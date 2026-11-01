package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aetr extends defpackage.aetq implements defpackage.aepj, defpackage.aeqv {
    public final android.content.Context a;
    public final defpackage.amwu b;
    public final defpackage.amwu d;
    public final defpackage.aoin e;
    public final defpackage.adao h;
    private final defpackage.aequ i;
    private final defpackage.ajcu j;
    public final java.lang.Object c = new java.lang.Object();
    public java.util.ArrayList f = new java.util.ArrayList(0);
    public final java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger();

    public aetr(defpackage.gou gouVar, android.content.Context context, defpackage.aepm aepmVar, defpackage.ajcu ajcuVar, defpackage.amwu amwuVar, defpackage.amwu amwuVar2, defpackage.aoin aoinVar, java.util.concurrent.Executor executor, defpackage.adao adaoVar) {
        this.h = adaoVar;
        this.i = gouVar.D(executor, amwuVar, aoinVar);
        this.a = context;
        this.j = ajcuVar;
        this.b = amwuVar;
        this.d = amwuVar2;
        this.e = aoinVar;
        aepmVar.a(this);
    }

    @Override // defpackage.aetq
    public final void a(aeto aetoVar) {
        java.lang.String strGroup;
        java.lang.String str;
        int i;
        if (aetoVar.b <= 0 && aetoVar.c <= 0 && aetoVar.d <= 0 && aetoVar.e <= 0 && (i = aetoVar.v) != 3 && i != 4 && aetoVar.p <= 0) {
            ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).v("skip logging NetworkEvent due to empty bandwidth/latency data");
            defpackage.ajcq ajcqVar = defpackage.ajcm.a;
            return;
        }
        defpackage.aequ aequVar = this.i;
        java.lang.String str2 = aetoVar.g;
        if (str2 == null || !aetoVar.h) {
            strGroup = aetoVar.f;
        } else {
            strGroup = str2 + '/' + aetoVar.f;
        }
        java.lang.String str3 = aetoVar.k;
        java.util.regex.Pattern pattern = defpackage.aetp.a;
        if (defpackage.ahvr.cp(strGroup)) {
            strGroup = "";
        } else {
            java.util.regex.Matcher matcher = defpackage.aetp.a.matcher(strGroup);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                java.util.regex.Matcher matcher2 = defpackage.aetp.c.matcher(strGroup);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                } else {
                    java.util.regex.Matcher matcher3 = defpackage.aetp.b.matcher(strGroup);
                    if (matcher3.find() && str3 != null && !str3.startsWith("application/")) {
                        strGroup = matcher3.group(1);
                    }
                }
            }
        }
        int i2 = aetoVar.s;
        if (i2 != 0) {
            switch (i2) {
                case 1:
                    str = "NONE";
                    break;
                case 2:
                    str = "MOBILE";
                    break;
                case 3:
                    str = "WIFI";
                    break;
                case 4:
                    str = "MOBILE_MMS";
                    break;
                case 5:
                    str = "MOBILE_SUPL";
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "MOBILE_DUN";
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "MOBILE_HIPRI";
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    str = "WIMAX";
                    break;
                case 9:
                    str = "BLUETOOTH";
                    break;
                case 10:
                    str = "DUMMY";
                    break;
                case 11:
                    str = "ETHERNET";
                    break;
                case 12:
                    str = "MOBILE_FOTA";
                    break;
                case 13:
                    str = "MOBILE_IMS";
                    break;
                case 14:
                    str = "MOBILE_CBS";
                    break;
                case 15:
                    str = "WIFI_P2P";
                    break;
                case 16:
                    str = "MOBILE_IA";
                    break;
                case 17:
                    str = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str = "PROXY";
                    break;
                default:
                    str = "VPN";
                    break;
            }
        } else {
            str = null;
        }
        defpackage.ahyj ahyjVar = new defpackage.ahyj(":");
        defpackage.aevn aevnVarE = aequVar.e(new ahyg(ahyjVar, ahyjVar).f(strGroup, aetoVar.k, str, aetoVar.i));
        if (aevnVarE.g()) {
            defpackage.ajcq ajcqVar2 = defpackage.ajcm.a;
        } else {
            this.g.incrementAndGet();
            defpackage.aiql.E(new defpackage.vto(this, aetoVar, aevnVarE, 9), this.j);
        }
    }

    public final defpackage.ajcq b(defpackage.apgu apguVar) {
        try {
            defpackage.ahyn ahynVar = ((defpackage.aetn) this.b.a()).c;
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 192, "NetworkMetricServiceImpl.java")).v("Exception while getting network metric extension!");
        }
        defpackage.aequ aequVar = this.i;
        defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
        aeqqVarA.f(apguVar);
        aeqqVarA.b = null;
        return aequVar.a(aeqqVarA.a());
    }

    public final defpackage.ajcq c() {
        defpackage.ajcq ajcqVarE;
        if (this.g.get() > 0) {
            return defpackage.aiql.B(new adbi(this, 5), 1L, java.util.concurrent.TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                ajcqVarE = defpackage.ajcm.a;
            } else {
                java.util.ArrayList arrayList = this.f;
                this.f = new java.util.ArrayList(0);
                ajcqVarE = defpackage.aiql.E(new adck(this, arrayList, 4, (byte[]) null), this.j);
            }
        }
        return ajcqVarE;
    }

    @Override // defpackage.aepj
    public final void g(defpackage.aenj aenjVar) {
        c();
    }

    @Override // defpackage.aeqv
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.aepj
    public final /* synthetic */ void j(defpackage.aenj aenjVar) {
    }
}
