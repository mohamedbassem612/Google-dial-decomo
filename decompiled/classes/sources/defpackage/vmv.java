package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vmv implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vmv(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v50, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        int i;
        defpackage.ajcq ajcqVarH;
        int i2 = 15;
        int i3 = 9;
        int i4 = 13;
        int i5 = 2;
        byte[] bArr = null;
        int i6 = 1;
        switch (this.$cid) {
            case 0:
                vmx vmxVar = (vmx) this.a;
                defpackage.zjm zjmVar = vmxVar.d;
                java.lang.Object obj2 = this.b;
                return defpackage.ahrv.g(zjmVar.m((android.telecom.PhoneAccountHandle) obj2)).i(new vmq(obj2, 8), vmxVar.b);
            case 1:
                return defpackage.aiql.v((java.lang.Iterable) j$.util.Collection.-EL.stream((java.util.Collection) this.a).map(new pgq(this.b, (java.lang.Integer) obj, 14, (byte[]) null)).collect(defpackage.aido.a));
            case 2:
                return defpackage.aiql.v((java.lang.Iterable) j$.util.Collection.-EL.stream((java.util.List) obj).map(new pgq(this.b, this.a, 13, (byte[]) null)).collect(defpackage.aido.a));
            case 3:
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.a);
                java.lang.Object obj3 = this.b;
                return ahrvVarG.i(new defpackage.vmv(obj3, (java.lang.Integer) obj, i5, bArr), ((vmx) obj3).b);
            case 4:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj4 = this.b;
                vnd vndVar = (vnd) this.a;
                return defpackage.ahvr.I(vndVar.b.m((android.telecom.PhoneAccountHandle) obj4), new vmq(obj4, 9), vndVar.a);
            case 5:
                defpackage.aify aifyVar = (defpackage.aify) obj;
                defpackage.aift aiftVar = new defpackage.aift(4);
                int i7 = 0;
                while (true) {
                    java.lang.Object obj5 = this.a;
                    java.lang.Object obj6 = this.b;
                    defpackage.aify aifyVar2 = (defpackage.aify) obj5;
                    if (i7 >= aifyVar2.size()) {
                        defpackage.aify aifyVarG = aiftVar.g();
                        return defpackage.ahvr.aj(aifyVarG).o(new vug(aifyVarG, 0), ((vuk) obj6).b.d);
                    }
                    boolean zBooleanValue = ((java.lang.Boolean) aifyVar.get(i7)).booleanValue();
                    j$.util.Optional optional = (j$.util.Optional) aifyVar2.get(i7);
                    vui vuiVar = new vui((vuk) obj6, aiftVar, zBooleanValue, 0);
                    if (i6 == optional.isPresent()) {
                        java.lang.Object obj7 = optional.get();
                        java.lang.Object obj8 = vuiVar.b;
                        java.lang.Object obj9 = vuiVar.c;
                        boolean z = vuiVar.a;
                        vtt vttVar = (vtt) obj7;
                        defpackage.akzx akzxVarM = vtu.a.m();
                        akzxVarM.u();
                        vtu vtuVar = akzxVarM.b;
                        vtuVar.b |= 2;
                        vtuVar.d = z;
                        akzxVarM.u();
                        vtu vtuVar2 = akzxVarM.b;
                        j$.util.Objects.requireNonNull(vttVar);
                        vtuVar2.c = vttVar;
                        vtuVar2.b |= i6;
                        j$.util.Optional optionalOf = j$.util.Optional.of(vttVar);
                        vuk vukVar = (vuk) obj8;
                        vul vulVar = vukVar.b;
                        defpackage.ajcq ajcqVarB = vulVar.c.b(optionalOf, false);
                        defpackage.ajcq ajcqVarD = vulVar.l.d(vttVar);
                        vvk vvkVar = vulVar.n;
                        i = i6;
                        defpackage.ajcq ajcqVarF = defpackage.aosv.F(vvkVar.d, 0, new vvg(vttVar, vvkVar, vukVar.a, (defpackage.aoln) null), 3);
                        defpackage.ajcq[] ajcqVarArr = new defpackage.ajcq[3];
                        ajcqVarArr[0] = ajcqVarB;
                        ajcqVarArr[i] = ajcqVarD;
                        ajcqVarArr[2] = ajcqVarF;
                        ((defpackage.aift) obj9).i(defpackage.ahvr.af(ajcqVarArr).e(new defpackage.joq(akzxVarM, ajcqVarB, ajcqVarD, ajcqVarF, 18), vulVar.d));
                    } else {
                        i = i6;
                    }
                    i7++;
                    i6 = i;
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.a;
                return defpackage.aiql.G(defpackage.dff.m(new vus(obj11, obj10, (java.lang.String) obj, 0)), 20000L, java.util.concurrent.TimeUnit.MILLISECONDS, ((defpackage.vva) obj11).g);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.a;
                defpackage.vva vvaVar = (defpackage.vva) obj13;
                vvaVar.p.i(null).b(defpackage.mce.VOICEMAIL_AUDIO_DOWNLOAD_STARTED);
                defpackage.ajbg ajbgVarD = vvaVar.d.d((android.net.Uri) obj12, new java.lang.String[]{"source_package"}, null, null, null);
                defpackage.ajbc ajbcVarE = defpackage.ahqx.e(new vur(2));
                defpackage.ajcu ajcuVar = vvaVar.g;
                return defpackage.ahvr.I(ajbgVarD.c(ajbcVarE, ajcuVar).h(), new defpackage.vmv(obj13, obj12, 6), ajcuVar);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.vva) this.a).f((android.net.Uri) this.b);
            case 9:
                uzo uzoVar = (uzo) this.b;
                uzn uznVar = uzoVar.c;
                if (uznVar == null) {
                    uznVar = uzn.a;
                }
                java.lang.Object obj14 = this.a;
                android.net.Uri uri = android.net.Uri.parse(uznVar.f);
                defpackage.vva vvaVar2 = (defpackage.vva) obj14;
                return vvaVar2.d.d(uri, new java.lang.String[]{"number", "date", "mime_type", "transcription"}, null, null, null).c(defpackage.ahqx.e(new vuq(vvaVar2, uzoVar, uri, 0)), vvaVar2.g).h();
            case 10:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.aiql.z(defpackage.aike.a);
                }
                ?? r1 = this.a;
                java.lang.Object obj15 = this.b;
                defpackage.aify aifyVar3 = (defpackage.aify) j$.util.Collection.-EL.stream((java.util.Collection) r1).map(new vxb(obj15, 1)).collect(defpackage.aido.a);
                return defpackage.ahvr.aj(aifyVar3).o(new vug(aifyVar3, 2), ((defpackage.vva) obj15).g);
            case 11:
                return ((defpackage.vva) this.a).h((android.net.Uri) this.b);
            case 12:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.aiql.z(0);
                }
                ?? r2 = this.a;
                java.lang.Object obj16 = this.b;
                return defpackage.ahrv.g(r2).i(new defpackage.vuu(obj16, i6), ((defpackage.vva) obj16).g);
            case 13:
                defpackage.rsr rsrVar = (defpackage.rsr) obj;
                java.lang.Object obj17 = rsrVar.b;
                java.lang.Object obj18 = rsrVar.a;
                defpackage.vva vvaVar3 = (defpackage.vva) this.a;
                return vvaVar3.d.d((android.net.Uri) this.b, defpackage.vva.k(), (java.lang.String) obj17, (java.lang.String[]) obj18, null).c(defpackage.ahqx.e(new vur(1)), vvaVar3.g).h();
            case 14:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj19 = this.b;
                defpackage.vvl vvlVar = (defpackage.vvl) this.a;
                return vvlVar.e.x(vvlVar.b, (android.telecom.PhoneAccountHandle) obj19, true);
            case 15:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj20 = this.a;
                if (!zBooleanValue2) {
                    return ((defpackage.vvl) this.b).c((defpackage.vzi) obj20);
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vvl.a.b()).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "shouldShowTos", 508, "VoicemailFullscreenPromoDataServiceImpl.java")).y("carrier app installed for %s, skipping TOS", ((defpackage.vzi) obj20).f);
                return defpackage.aiql.z(java.lang.Boolean.FALSE);
            case 16:
                boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj21 = this.a;
                if (zBooleanValue3) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.vvl.a.b()).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "shouldShowTos", 499, "VoicemailFullscreenPromoDataServiceImpl.java")).y("already accepted TOS for %s", ((defpackage.vzi) obj21).f);
                    return defpackage.aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj22 = this.b;
                defpackage.vvl vvlVar2 = (defpackage.vvl) obj22;
                return ((java.lang.Boolean) vvlVar2.d.a()).booleanValue() ? defpackage.ahvr.I(vvlVar2.f((defpackage.vzi) obj21), new defpackage.vmv(obj22, obj21, i2, bArr), vvlVar2.c) : vvlVar2.c((defpackage.vzi) obj21);
            case 17:
                boolean zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj23 = this.a;
                if (!zBooleanValue4) {
                    return ((defpackage.vvl) this.b).b((defpackage.vzi) obj23);
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vvl.a.b()).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "shouldShowPromo", 554, "VoicemailFullscreenPromoDataServiceImpl.java")).y("carrier app installed for %s, skipping promo", ((defpackage.vzi) obj23).f);
                return defpackage.aiql.z(java.lang.Boolean.FALSE);
            case 18:
                defpackage.aigf aigfVar = (defpackage.aigf) obj;
                boolean zIsEmpty = aigfVar.isEmpty();
                ?? r3 = this.a;
                if (zIsEmpty) {
                    return defpackage.aiql.z(defpackage.wgl.b(r3, defpackage.wgi.a));
                }
                if (aigfVar.size() == 1) {
                    return defpackage.aiql.z(defpackage.wgl.b(r3, (defpackage.wgi) aigfVar.values().iterator().next()));
                }
                java.lang.Object obj24 = this.b;
                java.util.Set setKeySet = aigfVar.keySet();
                defpackage.wgl wglVar = (defpackage.wgl) obj24;
                defpackage.suf sufVar = wglVar.e;
                return defpackage.ahvr.H(defpackage.ahvr.I(sufVar.d.b(), new sue(sufVar, (java.util.Set) r3, setKeySet, 1), sufVar.c), new defpackage.vuj(aigfVar, 19), wglVar.b);
            case 19:
                java.lang.Object obj25 = this.a;
                defpackage.whj whjVar = (defpackage.whj) obj25;
                defpackage.ahrv ahrvVarG2 = defpackage.ahrv.g(whjVar.f.bk());
                defpackage.vuu vuuVar = new defpackage.vuu(obj25, i3);
                defpackage.ajct ajctVar = whjVar.b;
                return defpackage.ahvr.H(ahrvVarG2.i(vuuVar, ajctVar).i(new defpackage.vuu(obj25, 10), ajctVar), new vfp(obj25, this.b, 17), ajctVar);
            default:
                java.util.Set set = ((defpackage.kfk) this.b).c;
                if (set.isEmpty()) {
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj26 = this.a;
                ((defpackage.aimw) ((defpackage.aimw) defpackage.whj.a.b()).l("com/android/dialer/xatu/impl/calllog/XatuCallLogDataSource", "handleDeletes", 225, "XatuCallLogDataSource.java")).v("handle deletes");
                if (set.isEmpty()) {
                    ajcqVarH = defpackage.aiql.z(defpackage.aike.a);
                } else {
                    defpackage.whj whjVar2 = (defpackage.whj) obj26;
                    ajcqVarH = defpackage.ahvr.H(whjVar2.e.ab(set), new defpackage.vrx(i4), whjVar2.b);
                }
                defpackage.whj whjVar3 = (defpackage.whj) obj26;
                defpackage.wqr wqrVar = whjVar3.c;
                defpackage.ahrv ahrvVarG3 = defpackage.ahrv.g(ajcqVarH);
                j$.util.Objects.requireNonNull(wqrVar);
                defpackage.vuu vuuVar2 = new defpackage.vuu(wqrVar, 12);
                defpackage.ajct ajctVar2 = whjVar3.b;
                return ahrvVarG3.i(vuuVar2, ajctVar2).h(new defpackage.vrx(i2), ajctVar2);
        }
    }

    public /* synthetic */ vmv(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
