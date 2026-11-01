package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ree implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ree(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                return ((aifo) this.a).contains((defpackage.reb) obj);
            case 1:
                defpackage.ref refVar = (defpackage.ref) obj;
                int i2 = refVar.b - 1;
                java.lang.Object obj2 = this.a;
                aify aifyVar = defpackage.reh.a;
                if (i2 != 0) {
                    j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(refVar.a);
                    j$.util.Objects.requireNonNull(obj2);
                    return stream.noneMatch(new defpackage.ree(obj2, i));
                }
                j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream(refVar.a);
                j$.util.Objects.requireNonNull(obj2);
                return stream2.anyMatch(new defpackage.ree(obj2, i));
            case 2:
                java.lang.String str = (java.lang.String) obj;
                java.lang.Object obj3 = this.a;
                if (android.text.TextUtils.equals(str, rwu.a((java.lang.String) obj3)) || android.text.TextUtils.equals(str, rwu.a(java.lang.String.valueOf(obj3).concat("F")))) {
                    return true;
                }
                break;
            case 3:
                ?? r5 = this.a;
                defpackage.scx[] scxVarArr = defpackage.she.a;
                return a.w((aonj) r5, obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.stg) ((aoin) ((java.util.Map.Entry) obj).getValue()).a()).b((ste) this.a).booleanValue();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.tin tinVar = (defpackage.tin) obj;
                if (snl.as(tinVar) && ((j$.util.Optional) ((aigf) this.a).get(tinVar)).isPresent()) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((java.lang.String) this.a).equals(((defpackage.acuh) obj).c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((java.lang.String) this.a).startsWith((java.lang.String) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.adrp adrpVar = new defpackage.adrp((defpackage.upo) obj);
                adrpVar.c = null;
                return adrpVar.m().equals(this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (((defpackage.upt) obj).f == ((defpackage.uqb) this.a).a.f) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((aify) this.a).contains((java.lang.String) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (!((android.os.Bundle) this.a).containsKey((java.lang.String) obj)) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                if (!((aihd) this.a).contains(((defpackage.vfe) obj).a())) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (!this.a.containsKey(((defpackage.vdg) obj).c)) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                vzi vziVar = (vzi) obj;
                java.lang.String str2 = vziVar.e;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.a;
                if (str2.equals(phoneAccountHandle.getComponentName().flattenToString()) && vziVar.f.equals(phoneAccountHandle.getId())) {
                    return true;
                }
                break;
            case 15:
                return ((aigf) this.a).containsKey((vdd) obj);
            case 16:
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                java.lang.String strFlattenToString = phoneAccountHandle2.getComponentName().flattenToString();
                defpackage.vek vekVar = (defpackage.vek) this.a;
                if (android.text.TextUtils.equals(strFlattenToString, vekVar.d) && android.text.TextUtils.equals(phoneAccountHandle2.getId(), vekVar.e)) {
                    return true;
                }
                break;
            case 17:
                defpackage.vek vekVar2 = (defpackage.vek) obj;
                aimz aimzVar = vku.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) this.a;
                if (android.text.TextUtils.equals(phoneAccountHandle3.getComponentName().flattenToString(), vekVar2.d) && android.text.TextUtils.equals(phoneAccountHandle3.getId(), vekVar2.e) && vekVar2.b == 1) {
                    return true;
                }
                break;
            case 18:
                aimz aimzVar2 = vmc.a;
                return ((aihd) this.a).contains(((defpackage.vdg) obj).c);
            case 19:
                return ((vmk) obj).c.equals(this.a);
            default:
                if (!((defpackage.vps) this.a).a.contains(((defpackage.vph) obj).c)) {
                    return true;
                }
                break;
        }
        return false;
    }
}
