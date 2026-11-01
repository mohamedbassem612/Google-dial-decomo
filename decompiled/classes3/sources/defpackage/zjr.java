package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zjr extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(defpackage.abgq abgqVar, cer cerVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abgqVar;
        this.b = cerVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v16, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [cer, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                return ((zjs) this.a).j((android.telecom.PhoneAccountHandle) this.b);
            case 1:
                aooc.af(obj);
                return aooh.q(((zjs) this.a).j((android.telecom.PhoneAccountHandle) this.b));
            case 2:
                aooc.af(obj);
                boolean zY = a.y((cer) this.b);
                java.lang.Object obj2 = this.a;
                if (zY) {
                    defpackage.abgq abgqVar = (defpackage.abgq) obj2;
                    aoov.an(abgqVar.a, (aolr) null, 0, new nut(abgqVar, (aoln) null, 7), 3);
                } else {
                    defpackage.abgq abgqVar2 = (defpackage.abgq) obj2;
                    aoov.an(abgqVar2.a, (aolr) null, 0, new nut(abgqVar2, (aoln) null, 8, (byte[]) null), 3);
                }
                return aojh.a;
            case 3:
                aooc.af(obj);
                java.lang.Object obj3 = this.b;
                defpackage.abgq abgqVar3 = (defpackage.abgq) obj3;
                aoov.an(abgqVar3.a, (aolr) null, 0, new defpackage.uke(abgqVar3, (aoln) null, 16), 3).p(new abgj(obj3, 0));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooc.af(obj);
                ((abgx) this.a).g.a(new java.lang.Float(((defpackage.abgq) this.b).a()));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(obj);
                android.content.Intent intent = new android.content.Intent();
                intent.setData(aehj.w((defpackage.akmc) this.a));
                com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity = (com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity) this.b;
                googlePhotosBottomSheetActivity.setResult(-1, intent);
                googlePhotosBottomSheetActivity.finish();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(obj);
                ?? r7 = this.b;
                ((defpackage.afow) this.a).a(defpackage.afny.d(r7));
                return aojh.a;
            default:
                aooc.af(obj);
                ?? r8 = this.b;
                ((defpackage.afow) this.a).a(defpackage.afny.d(r8));
                return aojh.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [cer, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.zjr((zjs) this.a, (android.telecom.PhoneAccountHandle) this.b, aolnVar, 0);
            case 1:
                return new defpackage.zjr((zjs) this.a, (android.telecom.PhoneAccountHandle) this.b, aolnVar, 1, (byte[]) null);
            case 2:
                return new defpackage.zjr((defpackage.abgq) this.a, (cer) this.b, aolnVar, 2);
            case 3:
                return new defpackage.zjr((abgx) this.a, (defpackage.abgq) this.b, aolnVar, 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.zjr((abgx) this.a, (defpackage.abgq) this.b, aolnVar, 4, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.zjr((com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity) this.b, (defpackage.akmc) this.a, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.zjr((defpackage.afow) this.a, (cer) this.b, aolnVar, 6);
            default:
                return new defpackage.zjr((defpackage.afow) this.a, (cer) this.b, aolnVar, 7, (byte[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(abgx abgxVar, defpackage.abgq abgqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abgxVar;
        this.b = abgqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(abgx abgxVar, defpackage.abgq abgqVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abgxVar;
        this.b = abgqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(defpackage.afow afowVar, cer cerVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = afowVar;
        this.b = cerVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(defpackage.afow afowVar, cer cerVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = afowVar;
        this.b = cerVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity, defpackage.akmc akmcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = googlePhotosBottomSheetActivity;
        this.a = akmcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(zjs zjsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
        this.b = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(zjs zjsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
        this.b = phoneAccountHandle;
    }
}
