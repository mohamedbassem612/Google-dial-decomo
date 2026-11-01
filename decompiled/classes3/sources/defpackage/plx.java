package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class plx implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ plx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v40, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v42, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, ruc] */
    /* JADX WARN: Type inference failed for: r8v50, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        int i = 12;
        int i2 = 17;
        int i3 = 13;
        int i4 = 1;
        switch (this.$cid) {
            case 0:
                return this.a.d();
            case 1:
                ((defpackage.pgi) this.a).b.f(ruc.e);
                return ajcm.a;
            case 2:
                java.lang.Object obj = this.a;
                return ahvr.F(new omj(obj, 14), (java.util.concurrent.Executor) ((hwv) obj).c);
            case 3:
                java.lang.Object obj2 = this.a;
                qdu qduVar = (qdu) obj2;
                j$.util.Optional optionalA = qduVar.j.a();
                if (true == optionalA.isPresent()) {
                    optionalA = j$.util.Optional.ofNullable(((defpackage.qdt) aooc.ar((hkl) optionalA.get(), defpackage.qdt.class)).at());
                }
                akzx akzxVarM = defpackage.qdv.a.m();
                akzxVarM.u();
                defpackage.qdv qdvVar = (defpackage.qdv) akzxVarM.b;
                qdvVar.b |= 1;
                qdvVar.c = false;
                akzxVarM.u();
                defpackage.qdv qdvVar2 = (defpackage.qdv) akzxVarM.b;
                qdvVar2.b |= 2;
                qdvVar2.d = true;
                akzxVarM.u();
                defpackage.qdv qdvVar3 = (defpackage.qdv) akzxVarM.b;
                qdvVar3.b |= 4;
                qdvVar3.e = false;
                return ahvr.I((ajcq) optionalA.orElse(aiql.z((defpackage.qdv) akzxVarM.p())), new ocj(obj2, 16), qduVar.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return this.a.d();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return this.a.d();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj3 = this.a;
                adnp adnpVar = (adnp) obj3;
                return ((j$.util.Optional) adnpVar.e).isPresent() ? aiql.z(adnpVar.e) : ahrv.g(((aogc) adnpVar.d).bk()).h(new defpackage.qgx(obj3, i2), (java.util.concurrent.Executor) adnpVar.c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((srr) this.a).d.a();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.sya.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/mdd/RevelioAudioDownloader", "download", 62, "RevelioAudioDownloader.java").v("entering executionSequencer and performing download");
                java.lang.Object obj4 = this.a;
                defpackage.sya syaVar = (defpackage.sya) obj4;
                acux acuxVar = syaVar.d;
                akzx akzxVarP = acuxVar.p();
                acuz acuzVar = acuxVar.g;
                if (acuzVar == null) {
                    acuzVar = acuz.a;
                }
                akzx akzxVarP2 = acuzVar.p();
                akzxVarP2.u();
                acuz acuzVar2 = akzxVarP2.b;
                acuzVar2.d = 0;
                acuzVar2.b |= 2;
                akzxVarP.u();
                acux acuxVar2 = akzxVarP.b;
                acuz acuzVarP = akzxVarP2.p();
                j$.util.Objects.requireNonNull(acuzVarP);
                acuxVar2.g = acuzVarP;
                acuxVar2.b |= 2048;
                acux acuxVarP = akzxVarP.p();
                rsr rsrVar = syaVar.f;
                defpackage.aliq aliqVar = new defpackage.aliq(null, null);
                aliqVar.o(acuxVarP);
                return ahvr.H(ahrv.g(rsrVar.E(aliqVar.n())).i(new defpackage.phd(obj4, acuxVarP, 19), syaVar.b), new defpackage.syf(i4), syaVar.c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj5 = this.a;
                defpackage.szs szsVar = (defpackage.szs) obj5;
                ahrv ahrvVarG = ahrv.g(szsVar.l.a());
                defpackage.srq srqVar = new defpackage.srq(obj5, i);
                ajcu ajcuVar = szsVar.e;
                return ahrvVarG.i(srqVar, ajcuVar).i(new defpackage.srq(obj5, i3), ajcuVar);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj6 = this.a;
                defpackage.szs szsVar2 = (defpackage.szs) obj6;
                if (!szsVar2.C) {
                    return ajcm.a;
                }
                defpackage.szr szrVar = (defpackage.szr) aooc.ar(szsVar2.I.Y(), defpackage.szr.class);
                ajcq ajcqVarBl = szrVar.bl();
                ajcq ajcqVarV = szrVar.v();
                return ahvr.ak(new ajcq[]{ajcqVarBl, ajcqVarV}).p(new jsr(obj6, ajcqVarBl, ajcqVarV, 17), szsVar2.e);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj7 = this.a;
                defpackage.rdp rdpVar = (defpackage.rdp) obj7;
                java.lang.Object obj8 = rdpVar.c;
                ajas ajasVarB = ahqx.b(new defpackage.plx(obj8, 8));
                defpackage.sya syaVar2 = (defpackage.sya) obj8;
                return ahvr.I(syaVar2.e.e(ajasVarB, syaVar2.c), new defpackage.tai(obj7, i2), (java.util.concurrent.Executor) rdpVar.d);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.util.Set set = defpackage.tna.a;
                return this.a.d();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.util.Set set2 = defpackage.tna.a;
                return this.a.d();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.acvm acvmVarA = defpackage.acvn.a();
                acvmVarA.b(defpackage.tzm.a.c);
                return ((rsr) this.a).G(acvmVarA.a());
            case 15:
                return ((ubj) this.a).a();
            case 16:
                return this.a.d();
            case 17:
                defpackage.usj usjVar = (defpackage.usj) this.a;
                return ahrv.g(usjVar.e.bk()).h(new defpackage.uqm(6), usjVar.c);
            case 18:
                return ((defpackage.usl) this.a).a.G(new defpackage.usk());
            case 19:
                return ((defpackage.utf) this.a).b();
            default:
                java.lang.Object obj9 = this.a;
                defpackage.utf utfVar = (defpackage.utf) obj9;
                return ahrv.g(utfVar.a()).i(new defpackage.udu(obj9, i), ajbm.a).i(new defpackage.udu(obj9, i3), utfVar.b).h(new defpackage.uqm(i3), utfVar.c);
        }
    }
}
