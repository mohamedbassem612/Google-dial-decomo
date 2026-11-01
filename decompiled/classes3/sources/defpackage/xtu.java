package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xtu implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ xtu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfa] */
    /* JADX WARN: Type inference failed for: r0v10, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [abeq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v28, types: [aciu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [aciu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v32, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v35, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v37, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v39, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, xhu] */
    /* JADX WARN: Type inference failed for: r10v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [cxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.content.ServiceConnection, java.lang.Object] */
    public final java.lang.Object a() {
        emx xlpVar;
        int i = 3;
        switch (this.$cid) {
            case 0:
                ((defpackage.xsx) this.a).h(this.b);
                return aojh.a;
            case 1:
                xlpVar = new defpackage.xlp(this.a, java.lang.System.identityHashCode(this.b));
                break;
            case 2:
                ((defpackage.ytm) this.b).a.unregisterReceiver((android.content.BroadcastReceiver) this.a);
                return aojh.a;
            case 3:
                int i2 = defpackage.abew.a;
                aonj aonjVarE = this.b.e();
                if (aonjVarE != null) {
                    ?? r10 = this.a;
                }
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.b.a();
                defpackage.abgi abgiVar = ((defpackage.abgq) this.a).u;
                aoss aossVar = abgiVar.e;
                aii aiiVarA = aij.a(0.0f);
                aii aiiVarA2 = aij.a(1.0f);
                aoov.an(aossVar, (aolr) null, 0, new defpackage.zqs(aiiVarA, (aoln) null, 17, (byte[]) null), 3);
                aoov.an(aossVar, (aolr) null, 0, new defpackage.zqs(aiiVarA2, (aoln) null, 18, (char[]) null), 3);
                java.util.List listAY = ajsz.aY(new defpackage.abhf(new defpackage.abgd(aiiVarA, 2), new defpackage.abgd(aiiVarA2, i), true));
                aii aiiVarA3 = aij.a(0.0f);
                aoov.an(aossVar, (aolr) null, 0, new defpackage.zqs(aiiVarA3, (aoln) null, 19, (short[]) null), 3);
                abgiVar.b(ajsz.bT(defpackage.abgi.c(abgiVar.a()), ajsz.bT(listAY, ajsz.bb(new defpackage.abhg[]{new defpackage.abhe(new defpackage.abgd(aiiVarA3, 4), 6), new defpackage.abhd(new defpackage.abgd(aiiVarA3, 5), 6)}))));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.b.a();
                ((agii) this.a).f();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.b.a();
                ((agii) this.a).f();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj = this.a;
                com.google.android.libraries.communications.ux.views.captionsview.CaptionsView captionsView = (com.google.android.libraries.communications.ux.views.captionsview.CaptionsView) this.b;
                android.view.View view = (android.view.View) obj;
                captionsView.removeView(view);
                captionsView.addView(view);
                captionsView.setTranslationY(0.0f);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.b.a(this.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                this.a.d((java.lang.String) this.b, defpackage.acir.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.a.c((java.lang.String) this.b);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return aosv.p((aoss) this.b, ((defpackage.acsl) this.a).e());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.util.List list = ((qq) this.a).f;
                aooh.e(list, "getJoinedResults(...)");
                xlpVar = new java.util.ArrayList(ajsz.bl(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    xlpVar.add(new defpackage.adds((defpackage.addo) this.b, (qq) it.next()));
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.util.List list2 = ((qq) this.a).f;
                aooh.e(list2, "getJoinedResults(...)");
                xlpVar = new java.util.ArrayList(ajsz.bl(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    xlpVar.add(new defpackage.adds((defpackage.adei) this.b, (qq) it2.next()));
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.afpl) this.a).c(acmf.a());
                this.b.a();
                return aojh.a;
            case 15:
                aimz aimzVar = defpackage.afny.a;
                this.b.a(((defpackage.afou) this.a).a);
                return aojh.a;
            case 16:
                aimz aimzVar2 = defpackage.afny.a;
                java.lang.String str = ((defpackage.aklp) this.a).c;
                aooh.e(str, "getClusterId(...)");
                this.b.a(str);
                return aojh.a;
            case 17:
                aimz aimzVar3 = defpackage.afny.a;
                this.b.a(this.a);
                return aojh.a;
            case 18:
                ?? r0 = this.a;
                java.lang.Object obj2 = this.b;
                try {
                    defpackage.aghd.d.x("Unregistering AIDL callback");
                    android.os.Parcel parcelEP = ((ylb) obj2).eP();
                    yld.f(parcelEP, (android.os.IInterface) r0);
                    ((ylb) obj2).eS(3, parcelEP);
                    break;
                } catch (android.os.RemoteException e) {
                    defpackage.aghd.d.B("Failed to unregister AIDL callback: ".concat(java.lang.String.valueOf(e.getMessage())));
                }
                return aojh.a;
            case 19:
                defpackage.aghd.d.x("Unbinding from RestoreProgressService");
                ?? r1 = this.a;
                java.lang.Object obj3 = this.b;
                try {
                    try {
                        ((defpackage.aghd) obj3).a.unbindService(r1);
                    } finally {
                        ((defpackage.aghd) obj3).b.set(null);
                    }
                    break;
                } catch (java.lang.IllegalArgumentException e2) {
                    defpackage.aghd.d.B("Error while unbinding: " + e2.getMessage());
                }
                obj3 = aojh.a;
                return obj3;
            default:
                ?? r2 = this.b;
                aoov.f((java.lang.Object) r2, 0);
                float[] fArr = (float[]) r2.a();
                java.util.ArrayList arrayList = new java.util.ArrayList(fArr.length);
                for (float f : fArr) {
                    arrayList.add(java.lang.Float.valueOf(f * ((defpackage.alln) this.a).h()));
                }
                return ajsz.cl(arrayList);
        }
        return xlpVar;
    }

    public /* synthetic */ xtu(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
