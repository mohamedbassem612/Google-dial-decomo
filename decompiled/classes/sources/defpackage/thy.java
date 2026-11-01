package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class thy implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ thy(int i) {
        this.$cid = i;
        this.a = "4-9";
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
            case 4:
                break;
            case 5:
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        vhu vhuVar;
        defpackage.ajcq ajcqVarH;
        int i = 4;
        int i2 = 9;
        int i3 = 2;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                tin tinVar = (tin) obj;
                defpackage.aimz aimzVar = tia.a;
                til tilVar = new til(tinVar);
                tilVar.f((nwx) ((defpackage.aigf) this.a).getOrDefault(tinVar.e.orElse((java.lang.Object) null), nwx.a));
                return tilVar.a();
            case 1:
                tin tinVar2 = (tin) obj;
                defpackage.aimz aimzVar2 = tia.a;
                til tilVar2 = new til(tinVar2);
                tilVar2.k((defpackage.wgi) ((defpackage.aigf) this.a).get(java.lang.String.valueOf(tinVar2.a)));
                return tilVar2.a();
            case 2:
                defpackage.aimz aimzVar3 = tib.a;
                return (defpackage.aify) j$.util.Collection.-EL.stream((defpackage.aify) ((java.util.Map.Entry) obj).getValue()).map(new defpackage.thy(this.a, 3)).collect(defpackage.aido.a);
            case 3:
                ?? r10 = this.a;
                tin tinVar3 = (tin) obj;
                defpackage.aimz aimzVar4 = tib.a;
                til tilVar3 = new til(tinVar3);
                tilVar3.f((nwx) j$.util.Map.-EL.getOrDefault((java.util.Map) r10, tinVar3.e.orElse((java.lang.Object) null), nwx.a));
                return tilVar3.a();
            case 4:
                adrp adrpVar = new adrp((upo) obj);
                adrpVar.c = this.a;
                return adrpVar.m();
            case 5:
                return ((hkd) ((defpackage.aigf) this.a).get(((java.util.Map.Entry) obj).getKey())).c;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((utx) ((defpackage.aoin) ((uvk) this.a).d.k().get((uty) obj)).a()).k();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.vav) this.a).d.d((java.lang.String) obj, 1);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                java.lang.Object obj2 = this.a;
                defpackage.zth zthVar = (defpackage.zth) obj2;
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(((defpackage.zjm) zthVar.c).k(phoneAccountHandle));
                vcu vcuVar = new vcu(obj2, phoneAccountHandle, 1);
                ?? r0 = zthVar.d;
                return ahrvVarG.i(vcuVar, r0).h(new van(phoneAccountHandle, 10), r0).i(new vct(obj2, 0), r0);
            case 9:
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                java.lang.Object obj3 = this.a;
                defpackage.zth zthVar2 = (defpackage.zth) obj3;
                defpackage.ahrv ahrvVarG2 = defpackage.ahrv.g(((defpackage.zjm) zthVar2.c).k(phoneAccountHandle2));
                defpackage.uhj uhjVar = new defpackage.uhj(obj3, phoneAccountHandle2, 20, bArr);
                ?? r1 = zthVar2.d;
                return ahrvVarG2.i(uhjVar, r1).h(new van(phoneAccountHandle2, 9), r1).i(new vct(obj3, 1), r1);
            case 10:
                vgx vgxVar = (vgx) obj;
                boolean zIsPresent = vgxVar.h.isPresent();
                java.lang.Object obj4 = this.a;
                if (zIsPresent) {
                    ((defpackage.vgg) obj4).i.n(defpackage.rmw.VVM_TRANSCRIPTION_DOWNLOADED);
                }
                return ((defpackage.vgg) obj4).f(vgxVar);
            case 11:
                defpackage.akzx akzxVarL = ((defpackage.vbu) ((defpackage.aigf) this.a).get((defpackage.vdd) obj)).L();
                akzxVarL.u();
                defpackage.vbu vbuVar = (defpackage.vbu) akzxVarL.b;
                vbuVar.t = defpackage.a.T(4);
                vbuVar.b |= 65536;
                return (defpackage.vbu) akzxVarL.r();
            case 12:
                vhuVar = new vhu(((vgs) this.a).c);
                ((vhi) vhuVar).a = (java.lang.String) obj;
                break;
            case 13:
                vhuVar = new vhu(((vgs) this.a).c);
                ((vhi) vhuVar).a = (java.lang.String) obj;
                break;
            case 14:
                return defpackage.gus.aw((java.lang.String) this.a);
            case 15:
                defpackage.vmk vmkVar = (defpackage.vmk) obj;
                if (!vmkVar.c.equals(this.a)) {
                    return vmkVar;
                }
                defpackage.akzx akzxVarL2 = vmkVar.L();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                akzxVarL2.u();
                defpackage.vmk vmkVar2 = (defpackage.vmk) akzxVarL2.b;
                vmkVar2.b |= 2;
                vmkVar2.e = jElapsedRealtime;
                return (defpackage.vmk) akzxVarL2.r();
            case 16:
                return ((vmx) this.a).b((android.telecom.PhoneAccountHandle) obj);
            case 17:
                java.lang.Object obj5 = this.a;
                vnd vndVar = (vnd) obj5;
                defpackage.zjm zjmVar = vndVar.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) obj;
                defpackage.ajcq ajcqVarK = zjmVar.k(phoneAccountHandle3);
                vmq vmqVar = new vmq(phoneAccountHandle3, 11);
                defpackage.ajct ajctVar = vndVar.a;
                defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarK, vmqVar, ajctVar);
                defpackage.ajcq ajcqVarH2 = defpackage.ahvr.H(zjmVar.l(phoneAccountHandle3), new vmj(12), ajctVar);
                return defpackage.ahvr.af(ajcqVarI, ajcqVarH2).e(new defpackage.vms(ajcqVarI, ajcqVarH2, i3, bArr), ajctVar).i(new defpackage.vmv(obj5, phoneAccountHandle3, i), ajctVar);
            case 18:
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt(((vph) obj).g.substring(((java.lang.String) this.a).length()).trim()));
            case 19:
                vph vphVar = (vph) obj;
                java.lang.String str = vphVar.c;
                vps vpsVar = (vps) this.a;
                if (vpsVar.c.contains(str)) {
                    defpackage.akzx akzxVarL3 = vphVar.L();
                    akzxVarL3.u();
                    akzxVarL3.b.h = true;
                    return akzxVarL3.r();
                }
                if (!vpsVar.d.contains(vphVar.c)) {
                    return vphVar;
                }
                defpackage.akzx akzxVarL4 = vphVar.L();
                akzxVarL4.u();
                akzxVarL4.b.h = false;
                return akzxVarL4.r();
            default:
                defpackage.vzi vziVar = (defpackage.vzi) obj;
                defpackage.ajcq ajcqVarZ = defpackage.aiql.z(java.lang.Boolean.valueOf(vziVar.c.equals("com.google.android.apps.tycho")));
                android.telecom.PhoneAccountHandle phoneAccountHandleK = defpackage.ttj.k(vziVar);
                java.lang.Object obj6 = this.a;
                if (phoneAccountHandleK == null) {
                    ajcqVarH = defpackage.aiql.z(java.lang.Boolean.FALSE);
                } else {
                    defpackage.vda vdaVar = (defpackage.vda) ((defpackage.vtp) obj6).c.g().orElseThrow(new vjq(14));
                    ajcqVarH = defpackage.ahrv.g(vdaVar.b(phoneAccountHandleK)).h(new defpackage.vak(i2), vdaVar.b);
                }
                return defpackage.ahvr.ak(ajcqVarZ, ajcqVarH).o(new defpackage.vms(ajcqVarZ, ajcqVarH, i2, bArr), ((defpackage.vtp) obj6).b);
        }
        return vhuVar;
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
            case 4:
                break;
            case 5:
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ thy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
