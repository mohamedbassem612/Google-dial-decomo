package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vgf implements ajba {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vgf(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v36, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v39, types: [ajat, java.lang.Object] */
    public final ajbg a(ajyk ajykVar, java.lang.Object obj) {
        ajbg ajbgVar;
        int i = 2;
        int i2 = 13;
        switch (this.$cid) {
            case 0:
                defpackage.vgs vgsVar = (defpackage.vgs) obj;
                ajck ajckVarH = vgsVar.c("1:* NOT DELETED").h();
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                defpackage.ved vedVar = new defpackage.ved(obj3, vgsVar, obj2, 10);
                vgg vggVar = (vgg) obj3;
                ajct ajctVar = vggVar.e;
                ajcq ajcqVarI = ahvr.I(ajckVarH, vedVar, ajctVar);
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj2;
                ajcq ajcqVarE = vggVar.h.e(phoneAccountHandle);
                ajbgVar = new ajbg(ahvr.af(new ajcq[]{ajcqVarE, ajcqVarI}).f(new uej(vggVar, ajcqVarE, ajcqVarI, vgsVar, phoneAccountHandle, 3), ajctVar));
                break;
            case 1:
                return ((defpackage.vgs) obj).b((java.lang.String) this.b, (java.lang.String) this.a);
            case 2:
                vgu vguVar = (vgu) this.a;
                vguVar.j = (defpackage.vgi) obj;
                return vguVar.i.b((android.telecom.PhoneAccountHandle) this.b, vguVar.j).a;
            case 3:
                defpackage.vgs vgsVar2 = (defpackage.vgs) obj;
                ajbg ajbgVarF = vgsVar2.f(new defpackage.vdp(vgsVar2, i2));
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                return ajbgVarF.d(new defpackage.vgc(obj5, vgsVar2, obj4, i), ((defpackage.vjy) obj5).a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj6 = this.a;
                boolean zIsEmpty = ((aihd) obj6).isEmpty();
                java.lang.Object obj7 = this.b;
                return zIsEmpty ? ((defpackage.vgs) obj7).f(new onq(19)) : ((defpackage.vgs) obj7).f(new defpackage.vez(obj7, obj6, i2, null));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                idc idcVar = new idc(this.b, this.a, 17);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(new ajbg(((vcc) optionalOfNullable.get()).g((android.telecom.PhoneAccountHandle) idcVar.a, (j$.util.Optional) idcVar.b)));
                }
                return (ajbg) optionalOfNullable.orElse(new ajbg(ajcm.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ajbgVar = new ajbg(((defpackage.vka) this.a).g.k((android.telecom.PhoneAccountHandle) this.b));
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ajbgVar = new ajbg(((defpackage.vkj) this.a).g.a((android.telecom.PhoneAccountHandle) this.b));
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.vkj) this.a).h.b((android.telecom.PhoneAccountHandle) this.b, (defpackage.vgi) obj).a;
            default:
                agxh agxhVar = (agxh) obj;
                agxh agxhVar2 = agxh.a;
                ajbgVar = new ajbg(agxhVar == agxhVar2 ? aiql.z(agxhVar2) : ajan.f(this.b.a(agxhVar.d()), new defpackage.agnw(agxhVar, i2), (java.util.concurrent.Executor) this.a));
                break;
        }
        return ajbgVar;
    }

    public /* synthetic */ vgf(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
