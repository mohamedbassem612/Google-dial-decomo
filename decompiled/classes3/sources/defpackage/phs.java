package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class phs implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ phs(j$.util.Optional optional, aify aifyVar, aify aifyVar2, int i) {
        this.$cid = i;
        this.b = optional;
        this.a = aifyVar;
        this.c = aifyVar2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
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
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r9v109, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.amdx amdxVar = (defpackage.amdx) obj;
                android.content.Context context = (android.content.Context) this.a;
                java.lang.String string = context.getString(2132020648);
                amdxVar.a = "Unknown";
                java.lang.Object obj2 = this.b;
                if (obj2 == defpackage.zna.RESTRICTED) {
                    java.lang.String strB = ((ssq) this.c).b();
                    amdxVar.a = "Restricted";
                    return strB;
                }
                if (obj2 != defpackage.zna.PAYPHONE) {
                    return string;
                }
                java.lang.String string2 = context.getString(2132019752);
                amdxVar.a = "Payphone";
                return string2;
            case 1:
                defpackage.spd spdVar = (defpackage.spd) obj;
                java.lang.String str = (java.lang.String) this.b.getKey();
                java.lang.String str2 = spdVar.c;
                java.lang.String str3 = spdVar.d;
                kwc kwcVar = (kwc) this.a;
                java.lang.String strC = kwcVar.h.c(str2, str3);
                java.lang.String strG = kwcVar.f.g(str, (java.lang.String) this.c);
                akzx akzxVarM = lao.a.m();
                akzxVarM.u();
                lao laoVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(strG);
                laoVar.b |= 1;
                laoVar.c = strG;
                akzxVarM.u();
                lao laoVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(strC);
                laoVar2.b |= 2;
                laoVar2.d = strC;
                akzx akzxVarM2 = defpackage.abwd.a.m();
                akzxVarM2.u();
                defpackage.abwd abwdVar = (defpackage.abwd) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strC);
                abwdVar.b |= 1;
                abwdVar.c = strC;
                akzxVarM2.u();
                defpackage.abwd abwdVar2 = (defpackage.abwd) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strG);
                abwdVar2.b |= 2;
                abwdVar2.d = strG;
                java.lang.String str4 = spdVar.f;
                akzxVarM2.u();
                defpackage.abwd abwdVar3 = (defpackage.abwd) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                abwdVar3.b |= 4;
                abwdVar3.e = str4;
                long j = spdVar.g;
                akzxVarM2.u();
                defpackage.abwd abwdVar4 = (defpackage.abwd) akzxVarM2.b;
                abwdVar4.b |= 8;
                abwdVar4.f = j;
                java.lang.String str5 = spdVar.k;
                akzxVarM2.u();
                defpackage.abwd abwdVar5 = (defpackage.abwd) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str5);
                abwdVar5.b |= 16;
                abwdVar5.g = str5;
                defpackage.abwd abwdVar6 = (defpackage.abwd) akzxVarM2.p();
                akzxVarM.u();
                lao laoVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(abwdVar6);
                laoVar3.f = abwdVar6;
                laoVar3.b |= 8;
                java.lang.String str6 = spdVar.h;
                akzxVarM.u();
                lao laoVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str6);
                laoVar4.b |= 4;
                laoVar4.e = str6;
                akzxVarM.u();
                lao laoVar5 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                laoVar5.b |= 16;
                laoVar5.g = str;
                return akzxVarM.p();
            case 2:
                defpackage.amdx amdxVar2 = (defpackage.amdx) obj;
                defpackage.abvz abvzVar = (defpackage.abvz) ((j$.util.Optional) this.c).orElse((java.lang.Object) null);
                if (abvzVar == null || (abvzVar.b & 1) == 0) {
                    java.lang.Object obj3 = this.b;
                    if (((j$.util.Optional) obj3).isPresent()) {
                        amdxVar2.a = "PhoneLookupInfoName";
                        return obj3;
                    }
                    amdxVar2.a = "Empty";
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj4 = this.a;
                java.lang.String str7 = abvzVar.c;
                defpackage.spn spnVar = (defpackage.spn) obj4;
                if ((spnVar.b & 2048) != 0) {
                    defpackage.spa spaVar = spnVar.n;
                    if (spaVar == null) {
                        spaVar = defpackage.spa.a;
                    }
                    if ((spaVar.c == 1 ? (defpackage.sox) spaVar.d : defpackage.sox.a).b.contains(str7)) {
                        amdxVar2.a = "CalleeIdBad";
                        return j$.util.Optional.empty();
                    }
                }
                amdxVar2.a = "CalleeId";
                return j$.util.Optional.of(str7);
            case 3:
                return ((sso) this.a).a((java.lang.String) this.c, (java.lang.String) this.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((sso) this.a).a((java.lang.String) this.c, (java.lang.String) this.b);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.upt uptVar = (defpackage.upt) obj;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(uptVar.l);
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.c;
                java.lang.Object obj7 = this.a;
                aify aifyVar = (aify) stream.map(new defpackage.phs(obj7, obj6, obj5, 6, (char[]) null)).collect(aido.a);
                if ((uptVar.b & 4) == 0) {
                    akzx akzxVarP = uptVar.p();
                    akzxVarP.u();
                    ((defpackage.upt) akzxVarP.b).l = albq.a;
                    akzxVarP.Q(aifyVar);
                    return (defpackage.upt) akzxVarP.p();
                }
                defpackage.upl uplVar = uptVar.m;
                if (uplVar == null) {
                    uplVar = defpackage.upl.a;
                }
                akzx akzxVarP2 = uplVar.p();
                boolean zJ = uqc.j((nwv) obj7, (nwx) ((aigf) obj6).getOrDefault(((aigf) obj5).get(uplVar.c), nwx.a));
                akzxVarP2.u();
                ((defpackage.upl) akzxVarP2.b).g = zJ;
                defpackage.upl uplVar2 = (defpackage.upl) akzxVarP2.p();
                akzx akzxVarP3 = uptVar.p();
                akzxVarP3.u();
                ((defpackage.upt) akzxVarP3.b).l = albq.a;
                akzxVarP3.Q(aifyVar);
                akzxVarP3.u();
                defpackage.upt uptVar2 = (defpackage.upt) akzxVarP3.b;
                uptVar2.m = null;
                uptVar2.b &= -5;
                akzxVarP3.u();
                defpackage.upt uptVar3 = (defpackage.upt) akzxVarP3.b;
                j$.util.Objects.requireNonNull(uplVar2);
                uptVar3.m = uplVar2;
                uptVar3.b |= 4;
                return (defpackage.upt) akzxVarP3.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.upl uplVar3 = (defpackage.upl) obj;
                akzx akzxVarP4 = uplVar3.p();
                boolean zJ2 = uqc.j((nwv) this.a, (nwx) ((aigf) this.c).getOrDefault(((aigf) this.b).get(uplVar3.c), nwx.a));
                akzxVarP4.u();
                ((defpackage.upl) akzxVarP4.b).g = zJ2;
                return (defpackage.upl) akzxVarP4.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.vdg vdgVar = (defpackage.vdg) obj;
                java.lang.Object obj8 = this.a;
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.c;
                vgg vggVar = (vgg) obj10;
                return ahrv.g(vggVar.g((defpackage.vgs) obj9, (android.telecom.PhoneAccountHandle) obj8, vdgVar)).i(new defpackage.ved(obj10, obj8, vdgVar, 20, (byte[]) null), vggVar.e);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.String str8 = (java.lang.String) obj;
                defpackage.vgw vgwVar = new defpackage.vgw();
                vgwVar.g(str8);
                vgwVar.d("");
                vgwVar.b(0L);
                vgwVar.c(0L);
                vgwVar.f((android.telecom.PhoneAccountHandle) this.a);
                vgwVar.e(((aihd) this.b).contains(str8));
                vgwVar.h(((vgg) this.c).d.getPackageName());
                return vgwVar.a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.vdg vdgVar2 = (defpackage.vdg) obj;
                if (vdgVar2.h) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                return ((vgg) this.c).g((defpackage.vgs) this.b, (android.telecom.PhoneAccountHandle) this.a, vdgVar2);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.vmf vmfVar = (defpackage.vmf) obj;
                boolean zBooleanValue = ((java.lang.Boolean) this.b).booleanValue();
                defpackage.vdk vdkVar = new defpackage.vdk();
                vdkVar.b(vmfVar.c);
                vdkVar.g(vmfVar.b);
                vdkVar.c(vmfVar.d);
                vmc vmcVar = (vmc) this.c;
                vdkVar.h(vmcVar.d.getPackageName());
                vdkVar.f(vmfVar.a);
                vdkVar.d(vmfVar.e);
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.a;
                vdkVar.e(phoneAccountHandle);
                return ahvr.I(vmcVar.f.d(vdkVar.a()), new jsf(vmcVar, zBooleanValue, vmfVar, phoneAccountHandle, 2), vmcVar.i);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vpk vpkVar = (vpk) obj;
                alat alatVar = vpkVar.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) this.a;
                defpackage.vpj vpjVar = (defpackage.vpj) j$.util.Collection.-EL.stream(alatVar).filter(new lvq(phoneAccountHandle2.getComponentName().flattenToString(), phoneAccountHandle2.getId(), 5)).findAny().orElseThrow(new defpackage.vjq(12));
                defpackage.vpi vpiVar = vpjVar.f;
                if (vpiVar == null) {
                    vpiVar = defpackage.vpi.a;
                }
                java.lang.Object obj11 = this.b;
                java.lang.Object obj12 = this.c;
                if (!vpiVar.c.equals(obj12)) {
                    defpackage.vph vphVar = (defpackage.vph) j$.util.Collection.-EL.stream(vpjVar.g).filter(new vpl(obj12, 3)).findFirst().orElseThrow(new defpackage.vjq(13));
                    int iIndexOf = vpjVar.g.indexOf(vphVar);
                    akzx akzxVarP5 = vpkVar.p();
                    int iIndexOf2 = vpkVar.b.indexOf(vpjVar);
                    akzx akzxVarP6 = vpjVar.p();
                    akzx akzxVarP7 = vphVar.p();
                    akzxVarP7.u();
                    defpackage.vph vphVar2 = (defpackage.vph) akzxVarP7.b;
                    j$.util.Objects.requireNonNull(obj11);
                    vphVar2.b |= 1;
                    vphVar2.d = (java.lang.String) obj11;
                    akzxVarP6.u();
                    defpackage.vpj vpjVar2 = (defpackage.vpj) akzxVarP6.b;
                    defpackage.vph vphVar3 = (defpackage.vph) akzxVarP7.p();
                    j$.util.Objects.requireNonNull(vphVar3);
                    vpjVar2.b();
                    vpjVar2.g.set(iIndexOf, vphVar3);
                    akzxVarP5.ax(iIndexOf2, akzxVarP6);
                    return akzxVarP5.p();
                }
                defpackage.vpi vpiVar2 = vpjVar.f;
                if (vpiVar2 == null) {
                    vpiVar2 = defpackage.vpi.a;
                }
                akzx akzxVarP8 = vpiVar2.p();
                akzxVarP8.u();
                defpackage.vpi vpiVar3 = (defpackage.vpi) akzxVarP8.b;
                j$.util.Objects.requireNonNull(obj11);
                vpiVar3.b |= 1;
                vpiVar3.d = (java.lang.String) obj11;
                defpackage.vpi vpiVar4 = (defpackage.vpi) akzxVarP8.p();
                akzx akzxVarP9 = vpkVar.p();
                int iIndexOf3 = vpkVar.b.indexOf(vpjVar);
                akzx akzxVarP10 = vpjVar.p();
                akzxVarP10.u();
                defpackage.vpj vpjVar3 = (defpackage.vpj) akzxVarP10.b;
                j$.util.Objects.requireNonNull(vpiVar4);
                vpjVar3.f = vpiVar4;
                vpjVar3.b |= 2;
                akzxVarP9.ax(iIndexOf3, akzxVarP10);
                return akzxVarP9.p();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.String upperCase = (java.lang.String) ((oko) this.a).z().orElse((java.lang.Object) null);
                if (true == lnr.a(((defpackage.zmn) this.c).b((j$.util.Optional) this.b))) {
                    upperCase = "US";
                }
                if (!android.text.TextUtils.isEmpty(upperCase)) {
                    upperCase = upperCase.toUpperCase(java.util.Locale.US);
                }
                return j$.util.Optional.ofNullable(upperCase);
            default:
                alig aligVar = (alig) obj;
                akzx akzxVarM3 = amfz.a.m();
                java.lang.String strR = amev.r(aligVar.a);
                akzxVarM3.u();
                amfz amfzVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull(strR);
                amfzVar.b |= 1;
                amfzVar.c = strR;
                java.lang.Object objOfNullable = this.b;
                j$.util.Optional optional = (j$.util.Optional) objOfNullable;
                if (true == optional.isPresent()) {
                    java.lang.Object obj13 = optional.get();
                    objOfNullable = j$.util.Optional.ofNullable((java.lang.String) amev.l((java.lang.String) obj13).orElse(obj13));
                }
                j$.util.Objects.requireNonNull(akzxVarM3);
                amdj amdjVar = new amdj(akzxVarM3, 1);
                j$.util.Optional optional2 = (j$.util.Optional) objOfNullable;
                if (true == optional2.isPresent()) {
                    java.lang.String str9 = (java.lang.String) optional2.get();
                    akzx akzxVar = (akzx) amdjVar.a;
                    akzxVar.u();
                    amfz amfzVar2 = akzxVar.b;
                    j$.util.Objects.requireNonNull(str9);
                    amfzVar2.b |= 4;
                    amfzVar2.e = str9;
                }
                aify aifyVar2 = (aify) this.c;
                int iIndexOf4 = aifyVar2.indexOf(aligVar);
                aify aifyVar3 = (aify) j$.util.Collection.-EL.stream((java.util.Collection) this.a).filter(new amcc(aligVar, 15)).filter(new defpackage.sst(iIndexOf4 > 0 ? ((alig) aifyVar2.get(iIndexOf4 - 1)).b.b : -1, 7)).collect(aido.a);
                j$.util.Optional optionalA = amew.a(aifyVar3.isEmpty() ? j$.util.Optional.empty() : j$.util.Optional.of(((alig) aifyVar3.get(0)).a.replaceAll("([-]?)digit\\w*", "").trim()));
                j$.util.Objects.requireNonNull(akzxVarM3);
                amdj amdjVar2 = new amdj(akzxVarM3, 0);
                if (true == optionalA.isPresent()) {
                    java.lang.Object obj14 = optionalA.get();
                    java.lang.Object obj15 = amdjVar2.a;
                    int iIntValue = ((java.lang.Integer) obj14).intValue();
                    akzx akzxVar2 = (akzx) obj15;
                    akzxVar2.u();
                    amfz amfzVar3 = akzxVar2.b;
                    amfzVar3.b |= 2;
                    amfzVar3.d = iIntValue;
                }
                return akzxVarM3.p();
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
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
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ phs(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ phs(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ phs(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ phs(vgg vggVar, defpackage.vgs vgsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.c = vggVar;
        this.b = vgsVar;
        this.a = phoneAccountHandle;
    }
}
