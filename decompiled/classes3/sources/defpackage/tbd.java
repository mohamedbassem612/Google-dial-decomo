package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tbd implements dxx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tbd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                akzx akzxVarP = ((tbf) obj).p();
                akzxVarP.u();
                tbf tbfVar = akzxVarP.b;
                tbfVar.e = ((defpackage.tbe) this.a).e;
                tbfVar.b |= 4;
                return akzxVarP.p();
            case 1:
                akzx akzxVarP2 = ((tbf) obj).p();
                akzxVarP2.u();
                tbf tbfVar2 = akzxVarP2.b;
                tbfVar2.g = ((defpackage.tbe) this.a).e;
                tbfVar2.b |= 16;
                return akzxVarP2.p();
            case 2:
                akzx akzxVarP3 = ((tbf) obj).p();
                akzxVarP3.u();
                tbf tbfVar3 = akzxVarP3.b;
                tbfVar3.h = ((defpackage.tbe) this.a).e;
                tbfVar3.b |= 32;
                return akzxVarP3.p();
            case 3:
                akzx akzxVarP4 = ((tbf) obj).p();
                akzxVarP4.u();
                tbf tbfVar4 = akzxVarP4.b;
                tbfVar4.f = ((defpackage.tbe) this.a).e;
                tbfVar4.b |= 8;
                return akzxVarP4.p();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                vzj vzjVar = (vzj) obj;
                akzx akzxVarP5 = vzjVar.p();
                akzxVarP5.u();
                akzxVarP5.b.c = albq.a;
                for (vzi vziVar : vzjVar.c) {
                    java.lang.Object obj2 = this.a;
                    if (vze.i(vziVar, (android.telecom.PhoneAccountHandle) obj2)) {
                        akzx akzxVarP6 = vziVar.p();
                        akzxVarP6.u();
                        vzi vziVar2 = akzxVarP6.b;
                        vziVar2.b &= -16385;
                        vziVar2.o = false;
                        akzxVarP5.ay(akzxVarP6);
                    } else {
                        akzxVarP5.ae(vziVar);
                    }
                }
                return akzxVarP5.p();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                vzj vzjVar2 = (vzj) obj;
                akzx akzxVarP7 = vzjVar2.p();
                akzxVarP7.u();
                akzxVarP7.b.c = albq.a;
                akzxVarP7.ad((java.lang.Iterable) j$.util.Collection.-EL.stream(vzjVar2.c).filter(new vpl(this.a, 11)).collect(aido.a));
                return akzxVarP7.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                akzx akzxVarP8 = ((defpackage.whk) obj).p();
                long j = ((whj) this.a).d.get();
                akzxVarP8.u();
                defpackage.whk whkVar = (defpackage.whk) akzxVarP8.b;
                whkVar.b |= 1;
                whkVar.c = j;
                return (defpackage.whk) akzxVarP8.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                akzx akzxVarP9 = ((wpy) obj).p();
                akzxVarP9.u();
                wpy wpyVar = akzxVarP9.b;
                wpyVar.c = ((defpackage.wpu) this.a).e;
                wpyVar.b |= 1;
                return akzxVarP9.p();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                akzx akzxVarP10 = ((wpy) obj).p();
                akzxVarP10.u();
                wpy wpyVar2 = akzxVarP10.b;
                wpyVar2.g = ((defpackage.wpw) this.a).e;
                wpyVar2.b |= 16;
                return akzxVarP10.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                akzx akzxVarP11 = ((wpy) obj).p();
                akzxVarP11.u();
                wpy wpyVar3 = akzxVarP11.b;
                wpyVar3.h = ((defpackage.wpt) this.a).d;
                wpyVar3.b |= 32;
                return akzxVarP11.p();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                akzx akzxVarP12 = ((wyp) obj).p();
                long j2 = ((wyo) this.a).d.get();
                akzxVarP12.u();
                wyp wypVar = akzxVarP12.b;
                wypVar.b |= 1;
                wypVar.c = j2;
                return akzxVarP12.p();
            default:
                akzx akzxVarP13 = ((xar) obj).p();
                akzxVarP13.u();
                xar xarVar = akzxVarP13.b;
                xarVar.c = ((defpackage.xap) this.a).e;
                xarVar.b |= 1;
                return akzxVarP13.p();
        }
    }
}
