package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class who implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ who(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                akzx akzxVar = (akzx) obj;
                akzxVar.u();
                defpackage.amto amtoVar = (defpackage.amto) akzxVar.b;
                defpackage.amto amtoVar2 = defpackage.amto.a;
                amtoVar.i = ((defpackage.wpw) this.a).e;
                amtoVar.b |= 2;
                return;
            case 1:
                akzx akzxVar2 = (akzx) obj;
                akzxVar2.u();
                defpackage.amto amtoVar3 = (defpackage.amto) akzxVar2.b;
                defpackage.amto amtoVar4 = defpackage.amto.a;
                java.lang.Object obj2 = this.a;
                j$.util.Objects.requireNonNull(obj2);
                alat alatVar = amtoVar3.c;
                if (!alatVar.c()) {
                    amtoVar3.c = alad.J(alatVar);
                }
                amtoVar3.c.add(obj2);
                return;
            case 2:
                akzx akzxVar3 = (akzx) obj;
                akzxVar3.u();
                defpackage.amto amtoVar5 = (defpackage.amto) akzxVar3.b;
                defpackage.amto amtoVar6 = defpackage.amto.a;
                java.lang.Object obj3 = this.a;
                j$.util.Objects.requireNonNull(obj3);
                amtoVar5.b |= 8;
                amtoVar5.k = (java.lang.String) obj3;
                return;
            case 3:
                akzx akzxVar4 = (akzx) obj;
                akzxVar4.u();
                aiys aiysVar = akzxVar4.b;
                aiys aiysVar2 = aiys.a;
                java.lang.Object obj4 = this.a;
                j$.util.Objects.requireNonNull(obj4);
                alat alatVar2 = aiysVar.c;
                if (!alatVar2.c()) {
                    aiysVar.c = alad.J(alatVar2);
                }
                aiysVar.c.add(obj4);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                akzx akzxVar5 = (akzx) obj;
                akzxVar5.u();
                defpackage.whw whwVar = (defpackage.whw) akzxVar5.b;
                defpackage.whw whwVar2 = defpackage.whw.a;
                java.lang.Object obj5 = this.a;
                j$.util.Objects.requireNonNull(obj5);
                alat alatVar3 = whwVar.b;
                if (!alatVar3.c()) {
                    whwVar.b = alad.J(alatVar3);
                }
                whwVar.b.add(obj5);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                akzx akzxVar6 = (akzx) obj;
                aimz aimzVar = defpackage.wxm.a;
                akzxVar6.u();
                defpackage.amoc amocVar = (defpackage.amoc) akzxVar6.b;
                defpackage.amoc amocVar2 = defpackage.amoc.a;
                java.lang.Object obj6 = this.a;
                j$.util.Objects.requireNonNull(obj6);
                alat alatVar4 = amocVar.e;
                if (!alatVar4.c()) {
                    amocVar.e = alad.J(alatVar4);
                }
                amocVar.e.add(obj6);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                akzx akzxVarM = defpackage.amnz.a.m();
                akzxVarM.u();
                defpackage.amnz amnzVar = (defpackage.amnz) akzxVarM.b;
                amnzVar.c = ((defpackage.alex) this.a).aI;
                amnzVar.b |= 1;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                akzxVarM.u();
                defpackage.amnz amnzVar2 = (defpackage.amnz) akzxVarM.b;
                amnzVar2.b |= 2;
                amnzVar2.d = jElapsedRealtime;
                ((akzx) obj).bh((defpackage.amnz) akzxVarM.p());
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                akzx akzxVar7 = (akzx) obj;
                aimz aimzVar2 = defpackage.wxm.a;
                akzxVar7.u();
                defpackage.amoc amocVar3 = (defpackage.amoc) akzxVar7.b;
                defpackage.amoc amocVar4 = defpackage.amoc.a;
                amocVar3.g = ((defpackage.xap) this.a).e;
                amocVar3.b |= 65536;
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                akzx akzxVarM2 = defpackage.amnz.a.m();
                akzxVarM2.u();
                defpackage.amnz amnzVar3 = (defpackage.amnz) akzxVarM2.b;
                amnzVar3.c = ((defpackage.alex) this.a).aI;
                amnzVar3.b |= 1;
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                akzxVarM2.u();
                defpackage.amnz amnzVar4 = (defpackage.amnz) akzxVarM2.b;
                amnzVar4.b |= 2;
                amnzVar4.d = jElapsedRealtime2;
                ((akzx) obj).bh((defpackage.amnz) akzxVarM2.p());
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                akzx akzxVar8 = (akzx) obj;
                aimz aimzVar3 = defpackage.wxm.a;
                akzxVar8.u();
                defpackage.amoc amocVar5 = (defpackage.amoc) akzxVar8.b;
                defpackage.amoc amocVar6 = defpackage.amoc.a;
                java.lang.Object obj7 = this.a;
                j$.util.Objects.requireNonNull(obj7);
                amocVar5.b |= 32768;
                amocVar5.d = (java.lang.String) obj7;
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                akzx akzxVar9 = (akzx) obj;
                aimz aimzVar4 = defpackage.wxm.a;
                akzxVar9.u();
                defpackage.amoc amocVar7 = (defpackage.amoc) akzxVar9.b;
                defpackage.amoc amocVar8 = defpackage.amoc.a;
                alat alatVar5 = amocVar7.f;
                if (!alatVar5.c()) {
                    amocVar7.f = alad.J(alatVar5);
                }
                akyl.i((java.lang.Iterable) this.a, amocVar7.f);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((aihb) this.a).k(((defpackage.xab) obj).b);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.util.List list = (java.util.List) obj;
                defpackage.wyw wywVarX = ((com.android.incallui.atlas.ui.impl.database.AtlasDatabase) ((wzd) this.a).b.a()).x();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("DELETE FROM AtlasData WHERE callCreationTimeMillis IN (");
                dzk.P(sb, list == null ? 1 : list.size());
                sb.append(')');
                dez.m((gfy) wywVarX.a, false, true, new uph(sb.toString(), list, 9, (byte[]) null));
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.xbk.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "rejectRingingCall", 471, "HoldForMeModelEventListener.java").v("rejecting incoming call due to notifying user");
                this.a.add(((defpackage.xbj) ((defpackage.apqr) obj).a(defpackage.xbj.class)).cq().h());
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.xbt) obj).a((defpackage.wvg) this.a);
                return;
            case 15:
                aimz aimzVar5 = zms.a;
                j$.lang.Iterable.-EL.forEach(((defpackage.zmr) ((defpackage.apqr) obj).a(defpackage.zmr.class)).jX().e().g(), new defpackage.who(this.a, 16));
                return;
            case 16:
                aimz aimzVar6 = zms.a;
                ((defpackage.zmp) obj).el((android.telecom.CallAudioState) this.a);
                return;
            case 17:
                ((gpd) ((vk) obj).a).j((java.lang.String) this.a).b(mce.X);
                return;
            case 18:
                ((zog) obj).b(((android.telecom.Call) this.a).getDetails());
                return;
            case 19:
                byte[] bArr = ((com.google.android.gms.wearable.internal.MessageEventParcelable) this.a).c;
                defpackage.afpl afplVar = (defpackage.afpl) obj;
                try {
                    java.lang.Object obj8 = afplVar.b;
                    defpackage.zki zkiVar = (defpackage.zki) ((defpackage.ztu) afplVar.a).e.a(bArr, akzq.a());
                    aooh.f(zkiVar, "inCallSharedFeatureModel");
                    java.lang.Object obj9 = ((defpackage.zlr) obj8).d;
                    aimz aimzVar7 = zih.a;
                    ((apni) obj9).i(aoov.al((aoss) ((defpackage.zlr) obj8).a, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, zkiVar, (defpackage.zlr) obj8, 13)));
                    return;
                } catch (alaz e) {
                    throw new java.lang.IllegalArgumentException("unable to parse invalid protocol buffer", e);
                }
            default:
                ((com.google.android.gms.common.api.internal.BasePendingResult) this.a).l((com.google.android.gms.common.api.Status) obj);
                return;
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
