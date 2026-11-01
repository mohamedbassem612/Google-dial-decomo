package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class sst implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ sst(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
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
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
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
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
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
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aimz aimzVar = defpackage.ssu.a;
                if (((android.media.AudioDeviceInfo) obj).getType() != this.a) {
                    return false;
                }
                break;
            case 1:
                aimz aimzVar2 = defpackage.ssu.a;
                if (((android.media.AudioDeviceInfo) obj).getType() != this.a) {
                    return false;
                }
                break;
            case 2:
                if (((vdd) obj).aE != this.a) {
                    return false;
                }
                break;
            case 3:
                if (((vdd) obj).aE != this.a) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (this.a < ((defpackage.yqd) obj).b) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int i = alvx.b;
                int iAQ = a.aQ(((alyj) obj).c);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                if (iAQ != this.a) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aimz aimzVar3 = amcx.a;
                if (((amdz) obj).a().a >= this.a) {
                    return false;
                }
                break;
            default:
                if (((alig) obj).b.a <= this.a) {
                    return false;
                }
                break;
        }
        return true;
    }
}
