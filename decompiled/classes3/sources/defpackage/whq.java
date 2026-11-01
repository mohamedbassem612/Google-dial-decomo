package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class whq implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ whq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((defpackage.whs) this.a).h.f((java.lang.String) this.b, new defpackage.vel((java.lang.String) obj, 12));
                break;
            case 1:
                java.lang.Object obj2 = ((ucm) obj).b;
                boolean zIsPresent = ((defpackage.vzm) this.a).a.isPresent();
                akzx akzxVar = (akzx) this.b;
                akzxVar.u();
                jxb jxbVar = akzxVar.b;
                alal alalVar = jxb.a;
                jxbVar.c |= 262144;
                jxbVar.t = zIsPresent;
                defpackage.abtr abtrVar = (defpackage.abtr) obj2;
                boolean zR = abtrVar.r();
                akzxVar.u();
                jxb jxbVar2 = akzxVar.b;
                jxbVar2.c |= 524288;
                jxbVar2.u = zR;
                if (abtrVar.r()) {
                    int iS = abtrVar.s(2);
                    akzxVar.u();
                    jxb jxbVar3 = akzxVar.b;
                    jxbVar3.c |= 1048576;
                    jxbVar3.v = iS;
                    int iS2 = abtrVar.s(3);
                    akzxVar.u();
                    jxb jxbVar4 = akzxVar.b;
                    jxbVar4.c |= 2097152;
                    jxbVar4.w = iS2;
                    int iS3 = abtrVar.s(4);
                    akzxVar.u();
                    jxb jxbVar5 = akzxVar.b;
                    jxbVar5.c |= 4194304;
                    jxbVar5.x = iS3;
                }
                break;
            case 2:
                defpackage.wky wkyVar = (defpackage.wky) obj;
                char cA = ((defpackage.pys) this.a).a();
                defpackage.wit witVar = wkyVar.e;
                agsm.i(1059, ahvr.E(new defpackage.wis(witVar, cA), witVar.a), "failed to log dialpad click event", new java.lang.Object[0]);
                defpackage.wjo wjoVar = wkyVar.p;
                aazc aazcVar = wkyVar.A;
                defpackage.zoe zoeVarN = defpackage.zoe.N(aosv.F(wjoVar.c, 0, new defpackage.wjm(wjoVar, cA, j$.time.Instant.now().toEpochMilli(), null), 3));
                defpackage.wtk wtkVar = (defpackage.wtk) this.b;
                wtkVar.d.i(zoeVarN, wtkVar.v);
                break;
            case 3:
                defpackage.wky wkyVar2 = (defpackage.wky) obj;
                defpackage.whe wheVarB = defpackage.whe.b(((defpackage.wlc) this.a).g);
                if (wheVarB == null) {
                    wheVarB = defpackage.whe.BOTTOM_SHEET_KEY_UNSPECIFIED;
                }
                java.lang.Object obj3 = this.b;
                aoin aoinVar = (aoin) wkyVar2.C.k().get(wheVarB);
                ahvr.cc(aoinVar != null, "XatuBottomSheetFragmentProvider for %s is not bound", wheVarB.name());
                aw awVarA = ((defpackage.whd) aoinVar.a()).a();
                defpackage.wtk wtkVar2 = (defpackage.wtk) obj3;
                defpackage.wsx wsxVar = wtkVar2.e;
                u uVar = new u(wsxVar.I());
                uVar.q(2131427591, awVarA, "bottom_sheet_tag");
                uVar.c();
                wsxVar.N().findViewById(2131427590).setVisibility(0);
                j$.util.Optional optionalC = wtkVar2.c();
                if (true == optionalC.isPresent()) {
                    ((com.google.android.material.bottomsheet.BottomSheetBehavior) optionalC.get()).t(3);
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((alkk) this.a).j((almy) this.b, (almi) obj);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((alkk) this.b).k((akzx) this.a, (almz) obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((alkk) this.a).i((almy) this.b, (almi) obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                akzz akzzVarM = almz.a.m();
                alnb alnbVar = alnb.E;
                akzzVarM.u();
                almz almzVar = akzzVarM.b;
                almzVar.c = alnbVar.aN;
                almzVar.b |= 1;
                ((alkr) this.a).c.a(akzzVarM.p(), (almy) this.b);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj4 = this.a;
                java.lang.Object obj5 = this.b;
                ((ajcu) obj).b(new akbr(obj5, obj4, 18), ((aluk) obj5).g.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((alvv) this.b).b.f((akzx) this.a, obj);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                alxy alxyVar = (alxy) obj;
                almz almzVarA = alvv.a(alxyVar);
                almy almyVar = ((alvu) this.a).b;
                alvv alvvVar = (alvv) this.b;
                alvvVar.a.a(almzVarA, almyVar);
                alvvVar.d = j$.util.Optional.of(alxyVar);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                alws alwsVar = (alws) obj;
                alwq alwqVarB = alwq.b(alwsVar.b);
                if (alwqVarB == null) {
                    alwqVarB = alwq.a;
                }
                ((aigb) this.a).i(alwqVarB, ((alza) this.b).c(alwsVar.c));
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((alzd) this.b).i((almy) this.a, (alxu) obj);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((alzd) this.b).j((almy) this.a, (alxu) obj);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((alzd) this.b).h((aigf) this.a, (alxu) obj);
                break;
            case 15:
                ((alzd) this.b).k((almy) this.a, (almy) obj);
                break;
            case 16:
                alnr alnrVar = (alnr) obj;
                akzz akzzVarM2 = almz.a.m();
                alnb alnbVar2 = alnb.Z;
                akzzVarM2.u();
                almz almzVar2 = akzzVarM2.b;
                almzVar2.c = alnbVar2.aN;
                almzVar2.b |= 1;
                apdi apdiVar = aloq.d;
                akzx akzxVarM = aloq.a.m();
                akzxVarM.u();
                aloq aloqVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(alnrVar);
                aloqVar.c = alnrVar;
                aloqVar.b |= 1;
                akzzVarM2.bV(apdiVar, akzxVarM.p());
                ((alzf) this.b).a.a(akzzVarM2.p(), (almy) this.a);
                break;
            case 17:
                defpackage.alif alifVar = (defpackage.alif) obj;
                ((aift) this.a).i(new alig(((java.lang.String) this.b).substring(alifVar.a, alifVar.b), alifVar));
                break;
            default:
                defpackage.alif alifVar2 = (defpackage.alif) obj;
                ((aift) this.a).i(new alig(((java.lang.String) this.b).substring(alifVar2.a, alifVar2.b), alifVar2));
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ whq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
