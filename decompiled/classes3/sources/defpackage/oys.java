package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class oys implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ oys(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v73, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v74, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v75, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v76, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v77, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v78, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v79, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ahvr.i(pez.am((defpackage.own) obj), ((defpackage.oyu) this.a).c);
                break;
            case 1:
                defpackage.own ownVar = (defpackage.own) obj;
                zas zasVarI = ((defpackage.oyc) this.a).x.i(ownVar.a);
                if (ownVar.h) {
                    zasVarI.b(mce.aH);
                    break;
                } else if (ownVar.l) {
                    zasVarI.b(mce.aq);
                    break;
                } else if (!ownVar.i && !ownVar.f) {
                    zasVarI.b(mce.ap);
                    zasVarI.b(mce.ar);
                    break;
                }
                break;
            case 2:
                ahvr.i(pez.al((defpackage.own) obj), ((defpackage.oyu) this.a).c);
                break;
            case 3:
                ahvr.i(pez.an((defpackage.own) obj), ((defpackage.oyu) this.a).c);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.own ownVar2 = (defpackage.own) obj;
                zas zasVarI2 = ((defpackage.oyu) this.a).k.i(ownVar2.a);
                if (ownVar2.h) {
                    zasVarI2.b(mce.aH);
                    break;
                } else if (ownVar2.l) {
                    zasVarI2.b(mce.aq);
                    break;
                } else if (!ownVar2.i && !ownVar2.f) {
                    zasVarI2.b(mce.ap);
                    zasVarI2.b(mce.ar);
                    break;
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.own ownVar3 = (defpackage.own) obj;
                android.graphics.drawable.Drawable drawable = ownVar3.e;
                defpackage.oyu oyuVar = (defpackage.oyu) this.a;
                oyuVar.e().m(drawable);
                if (ownVar3.m) {
                    java.lang.String string = oyuVar.b.getString(2132017661);
                    oyuVar.b().setText(string);
                    oyuVar.e().setContentDescription(string);
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.String str = ((opc) obj).c;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                jxs jxsVar = akzxVar.b;
                jxs jxsVar2 = jxs.a;
                j$.util.Objects.requireNonNull(str);
                jxsVar.b |= 2;
                jxsVar.d = str;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                oad oadVar = (oad) obj;
                akzx akzxVarM = jxp.a.m();
                android.location.Location location = oadVar.a;
                double latitude = location.getLatitude();
                akzxVarM.u();
                jxp jxpVar = akzxVarM.b;
                jxpVar.b |= 1;
                jxpVar.c = latitude;
                double longitude = location.getLongitude();
                akzxVarM.u();
                jxp jxpVar2 = akzxVarM.b;
                jxpVar2.b |= 2;
                jxpVar2.d = longitude;
                jxp jxpVarP = akzxVarM.p();
                java.lang.Object obj2 = this.a;
                akzx akzxVar2 = (akzx) obj2;
                akzxVar2.u();
                jxs jxsVar3 = akzxVar2.b;
                jxs jxsVar4 = jxs.a;
                j$.util.Objects.requireNonNull(jxpVarP);
                jxsVar3.c = jxpVarP;
                jxsVar3.b |= 1;
                j$.util.Optional optional = oadVar.b;
                defpackage.oys oysVar = new defpackage.oys(obj2, 6);
                if (true == optional.isPresent()) {
                    java.lang.Object obj3 = optional.get();
                    java.lang.Object obj4 = oysVar.a;
                    java.lang.String str2 = ((opc) obj3).c;
                    akzx akzxVar3 = (akzx) obj4;
                    akzxVar3.u();
                    jxs jxsVar5 = akzxVar3.b;
                    j$.util.Objects.requireNonNull(str2);
                    jxsVar5.b |= 2;
                    jxsVar5.d = str2;
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.String str3 = (java.lang.String) obj;
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                defpackage.pat patVar = (defpackage.pat) akzxVar4.b;
                defpackage.pat patVar2 = defpackage.pat.a;
                j$.util.Objects.requireNonNull(str3);
                patVar.b |= 2;
                patVar.e = str3;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.pgf pgfVar = (defpackage.pgf) obj;
                aimw aimwVarL = pff.a.b().l("com/android/dialer/incall/bubble/dialerbubble/DialerBubbleController", "performAction", 207, "DialerBubbleController.java");
                java.lang.Object obj5 = this.a;
                aimwVarL.y("performing bubble action %s", obj5);
                int iOrdinal = ((defpackage.wdf) obj5).ordinal();
                if (iOrdinal == 0) {
                    pgfVar.c.n(rmw.kN);
                    ruc rucVar = pgfVar.d;
                    aenj aenjVar = ruc.O;
                    rucVar.j(aenjVar);
                    rucVar.k(aenjVar);
                    aenj aenjVar2 = ruc.P;
                    rucVar.j(aenjVar2);
                    rucVar.k(aenjVar2);
                    android.content.Context context = pgfVar.b;
                    ipc ipcVar = pgfVar.l;
                    defpackage.otc otcVarAo = pez.ao();
                    otcVarAo.e(false);
                    otcVarAo.d(false);
                    otcVarAo.b(false);
                    ahqx.l(context, ipcVar.bk(otcVarAo.a()));
                } else if (iOrdinal == 1) {
                    zmq zmqVar = pgfVar.f;
                    j$.util.Optional optionalA = zmqVar.a();
                    if (true == optionalA.isPresent()) {
                        optionalA = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.zmw) optionalA.get()).equals(defpackage.zmw.ROUTE_BLUETOOTH)));
                    }
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    if (((java.lang.Boolean) optionalA.orElse(bool)).booleanValue()) {
                        a.bI(defpackage.pgf.a.d(), "toggleSpeaker() called when bluetooth available. Probably should have shown audio route selector", "com/android/dialer/incall/bubble/service/DialerBubbleActionController", "toggleSpeaker", 'v', "DialerBubbleActionController.java", zct.b);
                    }
                    j$.util.Optional optionalA2 = zmqVar.a();
                    if (true == optionalA2.isPresent()) {
                        optionalA2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.zmw) optionalA2.get()).equals(defpackage.zmw.ROUTE_SPEAKER)));
                    }
                    if (!((java.lang.Boolean) optionalA2.orElse(bool)).booleanValue()) {
                        pgfVar.c.n(rmw.kO);
                        zmqVar.e(defpackage.zmw.ROUTE_SPEAKER);
                    } else {
                        pgfVar.c.n(rmw.kP);
                        zmqVar.e(defpackage.zmw.ROUTE_WIRED_OR_EARPIECE);
                    }
                } else if (iOrdinal == 2) {
                    pgfVar.c.n(rmw.kS);
                    defpackage.oyx oyxVar = pgfVar.k;
                    android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
                    intent.setClassName((android.content.Context) oyxVar.a, "com.android.dialer.incall.audioroute.ui.TidepodsAudioRouteSelectorActivity");
                    intent.setFlags(402653184);
                    intent.putExtra("STARTED_FROM_BUBBLE", true);
                    ahqx.l(pgfVar.b, intent);
                } else if (iOrdinal == 3) {
                    if (!pgfVar.e.g()) {
                        pgfVar.c.n(rmw.kQ);
                        pgfVar.f.c(true, true);
                    } else {
                        pgfVar.c.n(rmw.kR);
                        pgfVar.f.c(false, true);
                    }
                } else if (iOrdinal == 4) {
                    pgfVar.c.n(rmw.kM);
                    agsm.i(478, pgfVar.i.f(), "Failed to disconnect.", new java.lang.Object[0]);
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.ampo ampoVar = (defpackage.ampo) obj;
                akzx akzxVar5 = (akzx) this.a;
                akzxVar5.u();
                amow amowVar = akzxVar5.b;
                amow amowVar2 = amow.a;
                j$.util.Objects.requireNonNull(ampoVar);
                amowVar.aj = ampoVar;
                amowVar.d |= 2;
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.String str4 = (java.lang.String) obj;
                akzx akzxVar6 = (akzx) this.a;
                akzxVar6.u();
                defpackage.abwd abwdVar = (defpackage.abwd) akzxVar6.b;
                defpackage.abwd abwdVar2 = defpackage.abwd.a;
                j$.util.Objects.requireNonNull(str4);
                abwdVar.b |= 4;
                abwdVar.e = str4;
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.String str5 = (java.lang.String) obj;
                akzx akzxVar7 = (akzx) this.a;
                akzxVar7.u();
                defpackage.abwd abwdVar3 = (defpackage.abwd) akzxVar7.b;
                defpackage.abwd abwdVar4 = defpackage.abwd.a;
                j$.util.Objects.requireNonNull(str5);
                abwdVar3.b |= 16;
                abwdVar3.g = str5;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.String str6 = (java.lang.String) obj;
                akzx akzxVar8 = (akzx) this.a;
                akzxVar8.u();
                defpackage.abwd abwdVar5 = (defpackage.abwd) akzxVar8.b;
                defpackage.abwd abwdVar6 = defpackage.abwd.a;
                j$.util.Objects.requireNonNull(str6);
                abwdVar5.b |= 1;
                abwdVar5.c = str6;
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                this.a.a(obj);
                break;
            case 15:
                this.a.a(obj);
                break;
            case 16:
                this.a.a(obj);
                break;
            case 17:
                this.a.a(obj);
                break;
            case 18:
                this.a.a(obj);
                break;
            case 19:
                this.a.a(obj);
                break;
            default:
                this.a.a(obj);
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
