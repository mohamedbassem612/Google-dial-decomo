package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vus implements dsf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vus(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a(dsd dsdVar) {
        int i = this.$cid;
        int i2 = 19;
        int i3 = 1;
        byte[] bArr = null;
        if (i == 0) {
            java.lang.Object obj = this.a;
            vva vvaVar = (vva) obj;
            ajcu ajcuVar = vvaVar.g;
            defpackage.vux vuxVar = new defpackage.vux(vvaVar, vvaVar.h, ajcuVar, dsdVar);
            dsdVar.a(new defpackage.rqy(obj, vuxVar, i2, bArr), ajcuVar);
            ojo ojoVar = vvaVar.d;
            android.net.Uri uri = (android.net.Uri) this.b;
            ojoVar.l(uri, false, vuxVar);
            android.content.Intent intent = new android.content.Intent("android.intent.action.FETCH_VOICEMAIL");
            java.lang.Object obj2 = this.c;
            intent.setPackage((java.lang.String) obj2);
            intent.addFlags(1);
            intent.setDataAndType(uri, "vnd.android.cursor.item/voicemail");
            vva.b.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "sendFetchRequest", 873, "VoicemailDataServiceImpl.java").y("sending ACTION_FETCH_VOICEMAIL to %s", obj2);
            vvaVar.e.sendBroadcast(intent);
            return "fetch_content";
        }
        if (i == 1) {
            j$.util.Optional optionalOf = j$.util.Optional.of(dsdVar);
            defpackage.qvx qvxVar = (defpackage.qvx) this.a;
            qvxVar.g = optionalOf;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", this.b);
            qvxVar.i.u(android.net.Uri.fromParts("tel", (java.lang.String) this.c, null), bundle);
            return "placeSwapCall";
        }
        if (i != 2) {
            ?? r1 = this.c;
            dsdVar.a(new defpackage.yne((java.lang.Object) r1, i3), ajbm.a);
            defpackage.wdm wdmVar = new defpackage.wdm(dsdVar, this.a, 9);
            java.lang.Object obj3 = this.b;
            defpackage.ydy ydyVar = (defpackage.ydy) obj3;
            synchronized (ydyVar.c) {
                if (((defpackage.ydy) obj3).a) {
                    wdmVar.run();
                } else {
                    ((defpackage.ydy) obj3).b.add(wdmVar);
                }
            }
            aiql.I((ajcq) r1, new defpackage.ynd(ydyVar, dsdVar, (java.lang.Runnable) wdmVar, 0), ajbm.a);
            return "FailureSignal.propagate";
        }
        java.lang.Object obj4 = this.a;
        java.lang.Object obj5 = this.b;
        java.lang.Object obj6 = this.c;
        try {
            dsdVar.a(new defpackage.vet(((defpackage.ymr) obj4).c(((defpackage.ymq) obj5).a, obj6, new defpackage.ymp((defpackage.ymr) obj4, dsdVar)), i2), ((defpackage.ymr) obj4).d);
            return "runInferenceFuture";
        } catch (android.os.RemoteException e) {
            android.util.Log.e(defpackage.ymr.a, "Failed to run inference.", e);
            dsdVar.d(new defpackage.ymi(2, 6, "Failed to run inference.", e));
            return null;
        } catch (java.lang.RuntimeException e2) {
            android.util.Log.e(defpackage.ymr.a, "Failed to run inference.", e2);
            dsdVar.d(new defpackage.ymi(2, 0, "Failed to run inference.", e2));
            return null;
        }
    }

    public /* synthetic */ vus(defpackage.ydy ydyVar, ajcq ajcqVar, ahzi ahziVar, int i) {
        this.$cid = i;
        this.b = ydyVar;
        this.c = ajcqVar;
        this.a = ahziVar;
    }
}
