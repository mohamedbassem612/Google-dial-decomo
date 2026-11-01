package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vlm implements defpackage.vfj {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmCarrierService");
    public final android.content.Context b;
    public final defpackage.vmc c;
    public final defpackage.vmg d;
    public final defpackage.vmi e;
    public final defpackage.vlf f;
    public final defpackage.vlc g;
    public final defpackage.rlv h;
    public final defpackage.okj i;
    public final defpackage.oko j;
    public final defpackage.zjm k;
    public final defpackage.gpd l;
    public final defpackage.ahbv m;
    private final defpackage.ajct n;
    private final defpackage.ajct o;
    private final defpackage.aoin p;
    private final defpackage.vze q;

    public vlm(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.vmc vmcVar, defpackage.vmg vmgVar, defpackage.vmi vmiVar, defpackage.ahbv ahbvVar, defpackage.vlf vlfVar, defpackage.zjm zjmVar, defpackage.vlc vlcVar, defpackage.vze vzeVar, defpackage.rlv rlvVar, defpackage.okj okjVar, defpackage.oko okoVar, defpackage.gpd gpdVar, defpackage.aoin aoinVar) {
        this.b = context;
        this.n = ajctVar;
        this.o = ajctVar2;
        this.c = vmcVar;
        this.d = vmgVar;
        this.e = vmiVar;
        this.m = ahbvVar;
        this.f = vlfVar;
        this.k = zjmVar;
        this.g = vlcVar;
        this.q = vzeVar;
        this.h = rlvVar;
        this.i = okjVar;
        this.j = okoVar;
        this.l = gpdVar;
        this.p = aoinVar;
    }

    private final defpackage.ajcq m(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ajcq ajcqVarH;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            vdp vdpVar = new vdp(this, 14);
            defpackage.ajct ajctVar = this.o;
            defpackage.ahrv ahrvVarH = defpackage.ahrv.g(defpackage.ahvr.F(vdpVar, ajctVar)).h(new vlk(0), ajctVar);
            vfp vfpVar = new vfp(this, phoneAccountHandle, 8);
            defpackage.ajct ajctVar2 = this.n;
            ajcqVarH = ahrvVarH.h(vfpVar, ajctVar2).h(new vfw(this, 16), ajctVar2);
        } else {
            ajcqVarH = defpackage.ahvr.H(defpackage.ahvr.F(new vdp(this, 15), this.o), new vfp(this, phoneAccountHandle, 12), this.n);
        }
        return defpackage.ahvr.H(ajcqVarH, new vfw(this, 17), this.o);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        defpackage.zjm zjmVar = this.k;
        defpackage.ajcq ajcqVarM = m(phoneAccountHandle);
        if (!zjmVar.g().isPresent()) {
            throw new java.lang.IllegalStateException("VvmServiceProvider must be present. Should never get here");
        }
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajcqVarM);
        vll vllVar = new vll(this, phoneAccountHandle, z, 0);
        defpackage.ajct ajctVar = this.o;
        return ahrvVarG.i(vllVar, ajctVar).h(new vfp(this, phoneAccountHandle, 11), ajctVar).f(java.lang.Exception.class, new vge(this, 14), ajctVar);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, java.lang.String str2) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmCarrierService", "changePin", 181, "RestVvmCarrierService.java")).v("changePin");
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(m(phoneAccountHandle));
        vjx vjxVar = new vjx(this, str, str2, 7);
        defpackage.ajct ajctVar = this.o;
        return ahrvVarG.i(vjxVar, ajctVar).h(new vfp(this, phoneAccountHandle, 10), ajctVar);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahrv.g(m(phoneAccountHandle)).i(new vkn(this, phoneAccountHandle, 7), this.o);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        throw new java.lang.UnsupportedOperationException("Operation not supported yet");
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(m(phoneAccountHandle), new vkn(this, phoneAccountHandle, 8), this.o);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle, vcm vcmVar, boolean z) {
        if (z) {
            throw new java.lang.UnsupportedOperationException("Retry on empty payload is not supported for REST");
        }
        return defpackage.ahvr.I(m(phoneAccountHandle), new vjx(this, phoneAccountHandle, vcmVar, 6, (char[]) null), this.o);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle, veo veoVar) {
        throw new java.lang.UnsupportedOperationException("InsertStatus is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r7 != vbx.b) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (r7 != vbs.g) goto L48;
     */
    @Override // defpackage.vfj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajcq h(android.telecom.PhoneAccountHandle r6, vce r7, defpackage.vcr r8) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlm.h(android.telecom.PhoneAccountHandle, vce, vcr):ajcq");
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq i(android.telecom.PhoneAccountHandle phoneAccountHandle, vcn vcnVar, boolean z) {
        return l(phoneAccountHandle);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq j(android.telecom.PhoneAccountHandle phoneAccountHandle, vci vciVar) {
        adrp adrpVarA = voy.a();
        adrpVarA.l(new android.telecom.PhoneAccountHandle(android.content.ComponentName.unflattenFromString(vciVar.b), vciVar.c));
        adrpVarA.k(vciVar.d);
        adrpVarA.b = defpackage.aify.n(ajee.m(vciVar.e.D()));
        return defpackage.ahvr.I(m(phoneAccountHandle), new vlj(this, adrpVarA), this.o);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq k(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(m(phoneAccountHandle));
        vkn vknVar = new vkn(this, phoneAccountHandle, 6);
        defpackage.ajct ajctVar = this.o;
        return ahrvVarG.i(vknVar, ajctVar).h(new vfp(this, phoneAccountHandle, 9), ajctVar);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahrv.g(m(phoneAccountHandle)).i(new vkn(this, phoneAccountHandle, 5), this.o);
    }
}
