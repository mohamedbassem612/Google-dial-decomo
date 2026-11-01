package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vxc implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vxc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i;
        switch (this.$cid) {
            case 0:
                defpackage.uzo uzoVar = (defpackage.uzo) obj;
                kiu kiuVar = uzoVar.d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                if (!kiuVar.j) {
                    java.lang.Object obj2 = this.a;
                    defpackage.uzn uznVar = uzoVar.c;
                    if (uznVar == null) {
                        uznVar = defpackage.uzn.a;
                    }
                    defpackage.vxq vxqVar = (defpackage.vxq) obj2;
                    vxqVar.i.j(defpackage.zoe.N(vxqVar.f.d(android.net.Uri.parse(uznVar.f))), new defpackage.zoe("failed to mark voicemail as read"), vxqVar.q);
                }
                break;
            case 1:
                android.net.Uri uri = android.net.Uri.parse((java.lang.String) obj);
                defpackage.vdm vdmVar = new defpackage.vdm();
                vdmVar.d(j$.util.Optional.of(defpackage.uzm.TRANSCRIPTION_AVAILABLE_AND_RATED));
                defpackage.vdn vdnVarA = vdmVar.a();
                defpackage.vxq vxqVar2 = (defpackage.vxq) this.a;
                vxqVar2.i.j(defpackage.zoe.N(vxqVar2.n.h(uri, vdnVarA)), new defpackage.zoe("Failed to mark transcription as rated."), vxqVar2.q);
                break;
            case 2:
                defpackage.vub vubVar = (defpackage.vub) obj;
                android.telecom.PhoneAccountHandle phoneAccountHandle = vubVar.f;
                java.lang.String str = vubVar.g;
                ((defpackage.vxq) this.a).W.r(phoneAccountHandle);
                break;
            case 3:
                defpackage.vtx vtxVar = (defpackage.vtx) obj;
                if ((vtxVar.b & 16) != 0) {
                    java.lang.Object obj3 = this.a;
                    defpackage.vtw vtwVar = vtxVar.g;
                    if (vtwVar == null) {
                        vtwVar = defpackage.vtw.a;
                    }
                    int iAd = a.ad(vtwVar.c);
                    i = iAd != 0 ? iAd : 1;
                    vzi vziVar = vtxVar.c;
                    if (vziVar == null) {
                        vziVar = vzi.a;
                    }
                    defpackage.vxq vxqVar3 = (defpackage.vxq) obj3;
                    vxqVar3.X.d(vxqVar3.d, i, vziVar);
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((android.os.Bundle) this.a).putString("KEY_PLAYER_STATE", (java.lang.String) obj);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((android.os.Bundle) this.a).putLong("KEY_EXPANDED_ROW_ID", ((defpackage.vxo) obj).a);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.uzo uzoVar2 = (defpackage.uzo) obj;
                defpackage.uzn uznVar2 = uzoVar2.c;
                if (uznVar2 == null) {
                    uznVar2 = defpackage.uzn.a;
                }
                java.lang.Object obj4 = this.a;
                if (!uznVar2.c) {
                    defpackage.vxq vxqVar4 = (defpackage.vxq) obj4;
                    vxqVar4.i(2132020929);
                    ajcq ajcqVarA = vxqVar4.f.a(defpackage.vxq.a(uzoVar2));
                    agtj agtjVar = vxqVar4.i;
                    defpackage.zoe zoeVarN = defpackage.zoe.N(ajcqVarA);
                    kiu kiuVar2 = uzoVar2.d;
                    if (kiuVar2 == null) {
                        kiuVar2 = kiu.a;
                    }
                    agtjVar.j(zoeVarN, new defpackage.zoe(java.lang.Long.valueOf(kiuVar2.d)), vxqVar4.u);
                } else {
                    defpackage.vxq vxqVar5 = (defpackage.vxq) obj4;
                    vxqVar5.j();
                    vxqVar5.m();
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.vtx vtxVar2 = (defpackage.vtx) obj;
                if ((vtxVar2.b & 8) != 0) {
                    java.lang.Object obj5 = this.a;
                    defpackage.vtw vtwVar2 = vtxVar2.f;
                    if (vtwVar2 == null) {
                        vtwVar2 = defpackage.vtw.a;
                    }
                    int iAd2 = a.ad(vtwVar2.c);
                    i = iAd2 != 0 ? iAd2 : 1;
                    vzi vziVar2 = vtxVar2.c;
                    if (vziVar2 == null) {
                        vziVar2 = vzi.a;
                    }
                    defpackage.vxq vxqVar6 = (defpackage.vxq) obj5;
                    vxqVar6.X.d(vxqVar6.d, i, vziVar2);
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.abtr abtrVar = (defpackage.abtr) ((ucm) obj).b;
                if (abtrVar.r()) {
                    akzx akzxVar = (akzx) this.a;
                    akzxVar.u();
                    jxb jxbVar = akzxVar.b;
                    alal alalVar = jxb.a;
                    jxbVar.c |= 524288;
                    jxbVar.u = true;
                    int iS = abtrVar.s(2);
                    akzxVar.u();
                    jxb jxbVar2 = akzxVar.b;
                    jxbVar2.c |= 1048576;
                    jxbVar2.v = iS;
                    int iS2 = abtrVar.s(3);
                    akzxVar.u();
                    jxb jxbVar3 = akzxVar.b;
                    jxbVar3.c |= 2097152;
                    jxbVar3.w = iS2;
                    int iS3 = abtrVar.s(4);
                    akzxVar.u();
                    jxb jxbVar4 = akzxVar.b;
                    jxbVar4.c |= 4194304;
                    jxbVar4.x = iS3;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVarM = defpackage.zud.a.m();
                akzxVarM.u();
                defpackage.zud zudVar = (defpackage.zud) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                zudVar.b |= 1;
                zudVar.c = str2;
                defpackage.zud zudVar2 = (defpackage.zud) akzxVarM.p();
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.zue zueVar = (defpackage.zue) akzxVar2.b;
                defpackage.zue zueVar2 = defpackage.zue.a;
                j$.util.Objects.requireNonNull(zudVar2);
                zueVar.d = zudVar2;
                zueVar.b |= 2;
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.amrn amrnVar = (defpackage.amrn) obj;
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                amow amowVar = akzxVar3.b;
                amow amowVar2 = amow.a;
                j$.util.Objects.requireNonNull(amrnVar);
                amowVar.ah = amrnVar;
                amowVar.c |= Integer.MIN_VALUE;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iOrdinal = ((defpackage.zul) obj).ordinal();
                java.lang.Object obj6 = this.a;
                if (iOrdinal == 0) {
                    akzx akzxVar4 = (akzx) obj6;
                    akzxVar4.u();
                    defpackage.amrn amrnVar2 = (defpackage.amrn) akzxVar4.b;
                    defpackage.amrn amrnVar3 = defpackage.amrn.a;
                    amrnVar2.d = 1;
                    amrnVar2.b |= 2;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            akzx akzxVar5 = (akzx) obj6;
                            akzxVar5.u();
                            defpackage.amrn amrnVar4 = (defpackage.amrn) akzxVar5.b;
                            defpackage.amrn amrnVar5 = defpackage.amrn.a;
                            amrnVar4.d = 3;
                            amrnVar4.b |= 2;
                            break;
                        } else if (iOrdinal == 3) {
                            akzx akzxVar6 = (akzx) obj6;
                            akzxVar6.u();
                            defpackage.amrn amrnVar6 = (defpackage.amrn) akzxVar6.b;
                            defpackage.amrn amrnVar7 = defpackage.amrn.a;
                            amrnVar6.d = 4;
                            amrnVar6.b |= 2;
                            break;
                        } else if (iOrdinal != 4) {
                        }
                    }
                    akzx akzxVar7 = (akzx) obj6;
                    akzxVar7.u();
                    defpackage.amrn amrnVar8 = (defpackage.amrn) akzxVar7.b;
                    defpackage.amrn amrnVar9 = defpackage.amrn.a;
                    amrnVar8.d = 2;
                    amrnVar8.b |= 2;
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((pff) obj).c(((defpackage.wdh) this.a).e);
                break;
            case 15:
                ((defpackage.wit) this.a).a(15);
                break;
            case 16:
                ((defpackage.wit) this.a).a(19);
                break;
            case 17:
                java.lang.String str3 = (java.lang.String) obj;
                akzx akzxVar8 = (akzx) this.a;
                akzxVar8.u();
                defpackage.wjd wjdVar = (defpackage.wjd) akzxVar8.b;
                defpackage.wjd wjdVar2 = defpackage.wjd.a;
                j$.util.Objects.requireNonNull(str3);
                wjdVar.d = str3;
                break;
            case 18:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzx akzxVar9 = (akzx) this.a;
                akzxVar9.u();
                defpackage.wje wjeVar = (defpackage.wje) akzxVar9.b;
                defpackage.wje wjeVar2 = defpackage.wje.a;
                wjeVar.g = iIntValue;
                break;
            case 19:
                amgo amgoVar = (amgo) obj;
                aooh.f(amgoVar, "transcriptionModeUpdate");
                defpackage.wle wleVar = (defpackage.wle) this.a;
                long j = wleVar.f;
                defpackage.wjb wjbVar = wleVar.h;
                agsm.i(1065, ahvr.F(new defpackage.wja(wjbVar, amgoVar, j, 1), wjbVar.a), "failed to track post transcription mode update", new java.lang.Object[0]);
                break;
            default:
                ((aift) this.a).i((defpackage.wlf) obj);
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
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
