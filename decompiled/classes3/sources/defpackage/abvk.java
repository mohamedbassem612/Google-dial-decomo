package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abvk extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvk(abvp abvpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abvpVar;
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
                return c((defpackage.afoe) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((defpackage.afoe) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((defpackage.afoe) obj, (aoln) obj2).b(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        adub adtwVar;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((abvp) this.a).h());
            case 1:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((abvp) this.a).f());
            case 2:
                aooc.af(obj);
                acig acigVar = (acig) this.a;
                return acigVar.h.a(acigVar.b);
            case 3:
                aooc.af(obj);
                adty adtyVar = adty.b;
                try {
                    adtwVar = new adub((java.lang.Object) null);
                    break;
                } catch (java.lang.Exception e) {
                    aooc.Y(u());
                    adtwVar = new defpackage.adtw(e, adtyVar);
                }
                if (adtwVar instanceof adtv) {
                    hgb.b(defpackage.adws.a.d(), "Failed refreshing notifications", ((adtv) adtwVar).b());
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooc.af(obj);
                defpackage.afov afovVar = (defpackage.afov) this.a;
                aoov.an(afovVar.a, (aolr) null, 0, new defpackage.adzb(afovVar, (aoln) null, 10, (byte[]) null), 3);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.afoo) this.a).e);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.afoo) this.a).e);
            default:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.afoo) this.a).e);
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.abvk((abvp) this.a, aolnVar, 0);
            case 1:
                return new defpackage.abvk((abvp) this.a, aolnVar, 1, (byte[]) null);
            case 2:
                return new defpackage.abvk((acig) this.a, aolnVar, 2);
            case 3:
                return new defpackage.abvk((defpackage.adws) this.a, aolnVar, 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.abvk((defpackage.afov) this.a, aolnVar, 4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.abvk((defpackage.afoo) this.a, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.abvk((defpackage.afoo) this.a, aolnVar, 6, (byte[]) null);
            default:
                return new defpackage.abvk((defpackage.afoo) this.a, aolnVar, 7, (char[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvk(abvp abvpVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abvpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvk(acig acigVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = acigVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvk(defpackage.adws adwsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = adwsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvk(defpackage.afoo afooVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = afooVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvk(defpackage.afoo afooVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = afooVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvk(defpackage.afoo afooVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = afooVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvk(defpackage.afov afovVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = afovVar;
    }
}
