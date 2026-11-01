package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaar extends defpackage.zyz {
    public static final java.util.WeakHashMap b = new java.util.WeakHashMap();
    public final com.google.android.gms.clearcut.sampler.SamplerConfigParcelable c;
    private final defpackage.aaau d;

    public aaar(int i, defpackage.zzf zzfVar, defpackage.aaau aaauVar) {
        int i2 = zzfVar.d;
        int i3 = i2 <= 0 ? 35 : i2;
        int i4 = zzfVar.e;
        this.c = new com.google.android.gms.clearcut.sampler.SamplerConfigParcelable(i - 2, zzfVar.c, i3, i4 <= 0 ? i3 : i4, zzfVar.f);
        this.d = aaauVar;
    }

    @Override // defpackage.zyz
    public final ajcq a(defpackage.zzs zzsVar) {
        com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable samplerDecisionParcelable;
        ajcq ajcqVarF;
        com.google.android.gms.clearcut.sampler.SamplerConfigParcelable samplerConfigParcelable = this.c;
        if (samplerConfigParcelable.b <= 0.0d) {
            return aiql.z(zzt.a);
        }
        j$.time.Instant instant = zzsVar.a;
        java.util.WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            samplerDecisionParcelable = (com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable) weakHashMap.get(java.lang.Integer.valueOf(samplerConfigParcelable.hashCode()));
        }
        int i = 6;
        if (samplerDecisionParcelable == null || !instant.isBefore(samplerDecisionParcelable.a())) {
            ajcq ajcqVarE = aazc.e(this.d.a(this.c));
            defpackage.uwo uwoVar = new defpackage.uwo(this, 6);
            ajbm ajbmVar = ajbm.a;
            aiql.I(ajcqVarE, uwoVar, ajbmVar);
            ajcqVarF = ajan.f(ajcqVarE, new defpackage.ymu(8), ajbmVar);
        } else {
            ajcqVarF = aiql.z(java.lang.Boolean.valueOf(samplerDecisionParcelable.a));
        }
        return ajan.f(ajcqVarF, new defpackage.zqi(this, i), ajbm.a);
    }

    @Override // defpackage.zyz
    public final amtz b() {
        com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable samplerDecisionParcelable;
        akzx akzxVarM = defpackage.amtx.a.m();
        akzxVarM.u();
        defpackage.amtx amtxVar = (defpackage.amtx) akzxVarM.b;
        amtxVar.b |= 1;
        com.google.android.gms.clearcut.sampler.SamplerConfigParcelable samplerConfigParcelable = this.c;
        amtxVar.c = (float) samplerConfigParcelable.b;
        akzxVarM.u();
        defpackage.amtx amtxVar2 = (defpackage.amtx) akzxVarM.b;
        amtxVar2.b |= 2;
        amtxVar2.d = samplerConfigParcelable.c;
        akzxVarM.u();
        defpackage.amtx amtxVar3 = (defpackage.amtx) akzxVarM.b;
        int i = 8;
        amtxVar3.b |= 8;
        amtxVar3.f = samplerConfigParcelable.d;
        java.util.WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            samplerDecisionParcelable = (com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable) weakHashMap.get(java.lang.Integer.valueOf(samplerConfigParcelable.hashCode()));
        }
        if (samplerDecisionParcelable != null) {
            int iT = aiql.T(j$.time.temporal.ChronoUnit.DAYS.between(samplerDecisionParcelable.a().minus(j$.time.Duration.ofDays(this.c.c)), j$.time.Instant.now()));
            akzxVarM.u();
            defpackage.amtx amtxVar4 = (defpackage.amtx) akzxVarM.b;
            amtxVar4.b |= 4;
            amtxVar4.e = iT;
        }
        int i2 = this.c.a;
        if (i2 != 0) {
            switch (i2) {
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    i = 6;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    i = 7;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    i = 9;
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    i = 10;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    i = 11;
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    i = 12;
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    i = 13;
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    i = 14;
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    i = 15;
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    i = 16;
                    break;
                case 15:
                    i = 17;
                    break;
                case 16:
                    i = 18;
                    break;
                case 17:
                    i = 19;
                    break;
                case 18:
                    i = 20;
                    break;
                case 19:
                    i = 21;
                    break;
                case 20:
                    i = 22;
                    break;
                default:
                    switch (i2) {
                        case 100000:
                            i = 100002;
                            break;
                        case 100001:
                            i = 100003;
                            break;
                        case 100002:
                            i = 100004;
                            break;
                        case 100003:
                            i = 100005;
                            break;
                        case 100004:
                            i = 100006;
                            break;
                        case 100005:
                            i = 100007;
                            break;
                        case 100006:
                            i = 100008;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    break;
            }
        } else {
            i = 2;
        }
        int i3 = i != 0 ? i : 0;
        if (i3 == 0) {
            i3 = 2;
        }
        akzx akzxVarM2 = amtz.a.m();
        akzxVarM2.u();
        amtz amtzVar = akzxVarM2.b;
        amtzVar.c = anar.Q(i3);
        amtzVar.b |= 1;
        akzxVarM2.u();
        amtz amtzVar2 = akzxVarM2.b;
        defpackage.amtx amtxVar5 = (defpackage.amtx) akzxVarM.p();
        j$.util.Objects.requireNonNull(amtxVar5);
        amtzVar2.d = amtxVar5;
        amtzVar2.b |= 2;
        return akzxVarM2.p();
    }
}
