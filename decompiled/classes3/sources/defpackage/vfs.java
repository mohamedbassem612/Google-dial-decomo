package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vfs implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vfs(java.lang.Object obj, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = phoneAccountHandle;
    }

    /* JADX WARN: Type inference failed for: r6v72, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v76, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = 19;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.b;
                java.lang.Object obj2 = this.a;
                vfu vfuVar = (vfu) obj2;
                return ahvr.H(vfuVar.v((android.telecom.PhoneAccountHandle) obj), new defpackage.veb(obj2, 20), vfuVar.b);
            case 1:
                java.lang.Object obj3 = this.b;
                vfu vfuVar2 = (vfu) this.a;
                return ahvr.H(vfuVar2.v((android.telecom.PhoneAccountHandle) obj3), new defpackage.vef(19), vfuVar2.b);
            case 2:
                j$.util.Optional optionalW = ((vfu) this.a).w((android.telecom.PhoneAccountHandle) this.b);
                if (true == optionalW.isPresent()) {
                    optionalW = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((vbu) optionalW.get()).i));
                }
                return (java.lang.Boolean) optionalW.orElse(java.lang.Boolean.FALSE);
            case 3:
                java.lang.Object obj4 = this.b;
                vfu vfuVar3 = (vfu) this.a;
                return ahvr.H(vfuVar3.v((android.telecom.PhoneAccountHandle) obj4), new defpackage.vft(2), vfuVar3.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj5 = this.a;
                j$.util.Optional optionalW2 = ((vfu) obj5).w((android.telecom.PhoneAccountHandle) this.b);
                defpackage.vdj vdjVar = new defpackage.vdj(obj5, 6);
                if (true == optionalW2.isPresent()) {
                    optionalW2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((vfu) vdjVar.a).y((vbu) optionalW2.get())));
                }
                return (java.lang.Boolean) optionalW2.orElse(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj6 = this.b;
                vfu vfuVar4 = (vfu) this.a;
                return ahvr.H(vfuVar4.v((android.telecom.PhoneAccountHandle) obj6), new defpackage.vef(12), vfuVar4.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                j$.util.Optional optionalW3 = ((vfu) this.a).w((android.telecom.PhoneAccountHandle) this.b);
                if (true == optionalW3.isPresent()) {
                    optionalW3 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((vbu) optionalW3.get()).z));
                }
                return (java.lang.Boolean) optionalW3.orElse(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj7 = this.b;
                vfu vfuVar5 = (vfu) this.a;
                return ahvr.H(vfuVar5.v((android.telecom.PhoneAccountHandle) obj7), new defpackage.vef(16), vfuVar5.b);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj8 = this.b;
                vfu vfuVar6 = (vfu) this.a;
                return ahvr.H(vfuVar6.v((android.telecom.PhoneAccountHandle) obj8), new defpackage.vef(20), vfuVar6.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                vln vlnVar = (vln) this.a;
                vth vthVar = vlnVar.a;
                return ahvr.H(ahvr.H(vthVar.e.c(), new defpackage.vmb(this.b, 20), vthVar.d), new defpackage.vlk(2), vlnVar.b);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj9 = ((ahbv) this.a).f;
                java.lang.Object obj10 = this.b;
                j$.util.Optional optionalS = zjm.s((zjm) obj9, (android.telecom.PhoneAccountHandle) obj10);
                defpackage.vdj vdjVar2 = new defpackage.vdj(obj10, 16);
                if (true == optionalS.isPresent()) {
                    optionalS = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((vcg) optionalS.get()).u((android.telecom.PhoneAccountHandle) vdjVar2.a)));
                }
                return (java.lang.Boolean) optionalS.orElse(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj11 = this.b;
                ahbv ahbvVar = (ahbv) this.a;
                return ahvr.I(((zjm) ahbvVar.c).k((android.telecom.PhoneAccountHandle) obj11), new defpackage.vmq(obj11, i2), (java.util.concurrent.Executor) ahbvVar.b);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj12 = this.b;
                ahbv ahbvVar2 = (ahbv) this.a;
                return ahvr.I(((zjm) ahbvVar2.c).k((android.telecom.PhoneAccountHandle) obj12), new defpackage.vge(obj12, i), (java.util.concurrent.Executor) ahbvVar2.e);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj13 = ((ahbv) this.a).f;
                java.lang.Object obj14 = this.b;
                j$.util.Optional optionalR = zjm.r((zjm) obj13, (android.telecom.PhoneAccountHandle) obj14);
                defpackage.vdj vdjVar3 = new defpackage.vdj(obj14, 18);
                if (true == optionalR.isPresent()) {
                    optionalR = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((vcc) optionalR.get()).l((android.telecom.PhoneAccountHandle) vdjVar3.a)));
                }
                return (java.lang.Boolean) optionalR.orElse(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj15 = this.a;
                vzi vziVar = (vzi) obj15;
                if (!vziVar.o) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj16 = this.b;
                akzx akzxVarM = defpackage.vtx.a.m();
                akzxVarM.u();
                defpackage.vtx vtxVar = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(obj15);
                vtxVar.c = vziVar;
                vtxVar.b |= 1;
                android.content.Context context = ((defpackage.vud) obj16).a;
                java.lang.String string = context.getString(2132020921);
                akzxVarM.u();
                defpackage.vtx vtxVar2 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                vtxVar2.b |= 2;
                vtxVar2.d = string;
                java.lang.String string2 = context.getString(2132020920);
                akzxVarM.u();
                defpackage.vtx vtxVar3 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                vtxVar3.b |= 4;
                vtxVar3.e = string2;
                akzxVarM.u();
                defpackage.vtx vtxVar4 = (defpackage.vtx) akzxVarM.b;
                vtxVar4.b |= 32;
                vtxVar4.h = false;
                akzx akzxVarM2 = defpackage.vtw.a.m();
                akzxVarM2.u();
                defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM2.b;
                vtwVar.c = 2;
                vtwVar.b |= 1;
                java.lang.String string3 = context.getString(2132020843);
                akzxVarM2.u();
                defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string3);
                vtwVar2.b |= 2;
                vtwVar2.d = string3;
                defpackage.vtw vtwVar3 = (defpackage.vtw) akzxVarM2.p();
                akzxVarM.u();
                defpackage.vtx vtxVar5 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(vtwVar3);
                vtxVar5.f = vtwVar3;
                vtxVar5.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
            default:
                alto altoVar = new alto();
                altp altpVar = (altp) this.b;
                int i3 = altpVar.a;
                altp altpVar2 = (altp) this.a;
                altoVar.c(java.lang.Math.max(i3, altpVar2.a));
                altoVar.b(java.lang.Math.min(altpVar.b, altpVar2.b));
                return altoVar.a();
        }
    }

    public /* synthetic */ vfs(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
