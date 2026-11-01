package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acxq implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ acxq(ahpz ahpzVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = ahpzVar;
        this.c = "AutoGIL";
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v65, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v34, types: [agxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [agye, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.c;
                ((adth) ((defpackage.abtr) this.a).f).d((java.io.File) this.b, (java.lang.String) obj);
                return;
            case 1:
                defpackage.aawl aawlVarA = ((defpackage.aawk) this.a).a("onRequestReceived");
                java.lang.Object obj2 = this.b;
                if (aawlVarA == null) {
                    defpackage.aawk.q((defpackage.aaxh) obj2, false, null);
                    return;
                }
                com.google.android.gms.wearable.internal.MessageEventParcelable messageEventParcelable = (com.google.android.gms.wearable.internal.MessageEventParcelable) this.c;
                java.lang.String str = messageEventParcelable.d;
                aawlVarA.e(messageEventParcelable.b, messageEventParcelable.c).m(new defpackage.aadq(obj2, 4));
                return;
            case 2:
                java.lang.Object obj3 = this.a;
                ((adax) this.b).b((java.lang.String) this.c, (android.net.Uri) obj3);
                return;
            case 3:
                ((com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc) this.b).o.g(this.c, (android.widget.ImageView) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.aekj) this.a).e((defpackage.aekp) this.b, this.c);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.aelo aeloVar = ((defpackage.aeln) this.b).c;
                aeloVar.a.i((android.view.View) this.a, this.c);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj4 = this.a;
                ((aevm) this.b).c((amwu) this.c, (ahbm) obj4);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj5 = this.a;
                ((afjq) this.b).j((anaj) this.c, (defpackage.ajxi) obj5);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj6 = this.b;
                ((afjq) this.a).h((amhk) this.c, (apdh) obj6);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj7 = this.a;
                ((defpackage.agfo) this.b).c((java.lang.String) this.c, (android.os.Bundle) obj7);
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ahok ahokVarF = ((ahpz) this.a).f(1314, (java.lang.String) this.c);
                try {
                    this.b.run();
                    ahokVarF.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahokVarF.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                agtn agtnVar = (agtn) this.a;
                boolean z = agtnVar.e;
                java.lang.Object obj8 = this.c;
                if (z) {
                    java.lang.Object obj9 = this.b;
                    if (agtnVar.c.remove(obj9)) {
                        agtk agtkVar = (agtk) agtnVar.b.b(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture) obj9).a);
                        ahoq ahoqVarX = ahvr.X(1318, "onSuccess FuturesMixin", ahot.a, true);
                        try {
                            agtkVar.c(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture) obj9).d, obj8);
                            ahoqVarX.close();
                            return;
                        } catch (java.lang.Throwable th3) {
                            try {
                                ahoqVarX.close();
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                agtn agtnVar2 = (agtn) this.a;
                boolean z2 = agtnVar2.e;
                java.lang.Object obj10 = this.c;
                if (z2) {
                    java.lang.Object obj11 = this.b;
                    if (agtnVar2.c.remove(obj11)) {
                        agtk agtkVar2 = (agtk) agtnVar2.b.b(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture) obj11).a);
                        ahoq ahoqVarX2 = ahvr.X(1316, "onFailure FuturesMixin", ahot.a, true);
                        try {
                            agtkVar2.a(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture) obj11).d, (java.lang.Throwable) obj10);
                            ahoqVarX2.close();
                            return;
                        } catch (java.lang.Throwable th5) {
                            try {
                                ahoqVarX2.close();
                                throw th5;
                            } catch (java.lang.Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    }
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj12 = ((ajwr) this.c).a;
                agyj agyjVar = (agyj) obj12;
                agyjVar.a((agxi) this.a, new agxm(), (agye) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj13 = this.a;
                java.lang.Object obj14 = this.b;
                agym agymVar = (agym) this.c;
                agymVar.a.execute(new defpackage.acxq(agymVar, (agyc) obj14, (defpackage.zoe) obj13, 15));
                return;
            case 15:
                java.lang.Object obj15 = this.c;
                agym agymVar2 = (agym) obj15;
                agtd agtdVar = agymVar2.h;
                java.lang.Object obj16 = this.a;
                java.lang.Object obj17 = this.b;
                if (agtdVar.c(obj16)) {
                    ?? r0 = ((defpackage.zoe) obj16).a;
                    if (r0.isCancelled()) {
                        return;
                    }
                    afec.c();
                    try {
                        try {
                            aiql.H((java.util.concurrent.Future) r0);
                            agxi agxiVar = ((agyc) obj17).a;
                            if (agxiVar.e() instanceof agxt) {
                                if (((agyc) obj17).b(((agym) obj15).e)) {
                                    ((agym) obj15).k.r(aiql.z((java.lang.Object) null), agxiVar.e(), agxx.a, ahwt.a, ((agym) obj15).a);
                                    return;
                                }
                            }
                            if (((agyc) obj17).b(((agym) obj15).e)) {
                                if (((agym) obj15).g.d && ((agym) obj15).i()) {
                                    ahvr.bZ(((agym) obj15).g.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                    agym.g(((agym) obj15).g.c);
                                    ((agym) obj15).g = ((agym) obj15).g.b(false);
                                    return;
                                }
                                return;
                            }
                            ((agym) obj15).e((agyc) obj17);
                            aogc aogcVar = ((agym) obj15).k;
                            ajcq ajcqVarZ = aiql.z((java.lang.Object) null);
                            java.lang.Object objE = agxiVar.e();
                            agxy agxyVar = ((agym) obj15).c;
                            aogcVar.r(ajcqVarZ, objE, agxx.a, ahyn.h(agxyVar), ((agym) obj15).a);
                            return;
                        } catch (java.util.concurrent.ExecutionException e) {
                            ((agym) obj15).h(e.getCause());
                            return;
                        }
                    } catch (java.lang.Throwable th7) {
                        agymVar2.b.execute(new defpackage.agdr(th7, 9));
                        return;
                    }
                }
                return;
            case 16:
                java.lang.Object obj18 = this.c;
                ((defpackage.ahkc) this.a).b((anty) this.b, (anph) obj18);
                return;
            case 17:
                ((ahlt) this.a).l((ahlv) this.b, (ajcq) this.c);
                return;
            case 18:
                ((ajuo) this.a).a.execute(new defpackage.agrz(this.c, this.b, 12, bArr));
                return;
            case 19:
                ((ajuo) this.a).a.execute(new defpackage.agrz(this.c, this.b, 10, bArr));
                return;
            default:
                ((ajuo) this.a).a.execute(new defpackage.agrz(this.c, this.b, 11, bArr));
                return;
        }
    }

    public /* synthetic */ acxq(agym agymVar, agyc agycVar, defpackage.zoe zoeVar, int i) {
        this.$cid = i;
        this.c = agymVar;
        this.b = agycVar;
        this.a = zoeVar;
    }

    public /* synthetic */ acxq(defpackage.aeln aelnVar, android.view.View view, java.lang.Object obj, int i) {
        this.$cid = i;
        this.b = aelnVar;
        this.a = view;
        this.c = obj;
    }

    public /* synthetic */ acxq(ajwr ajwrVar, agxi agxiVar, agye agyeVar, int i) {
        this.$cid = i;
        this.c = ajwrVar;
        this.a = agxiVar;
        this.b = agyeVar;
    }

    public /* synthetic */ acxq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ acxq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ acxq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
