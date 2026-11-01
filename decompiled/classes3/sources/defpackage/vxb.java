package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vxb implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vxb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Type inference failed for: r12v19, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v27, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v47, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v48, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v57, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vyi vyiVar;
        defpackage.zzf zzfVar;
        int i;
        double d;
        int i2;
        int i3;
        int i4 = 13;
        int i5 = 0;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                akzx akzxVarP = ((defpackage.uzo) obj).p();
                akzxVarP.u();
                defpackage.uzo uzoVar = (defpackage.uzo) akzxVarP.b;
                uzoVar.f = ((nwv) this.a).a();
                uzoVar.b |= 8;
                return (defpackage.uzo) akzxVarP.p();
            case 1:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj2 = this.a;
                vva vvaVar = (vva) obj2;
                return ahvr.I(vvaVar.e(optional), new vmv(obj2, android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL.buildUpon().appendQueryParameter("limit", "1").build(), 13), vvaVar.g);
            case 2:
                defpackage.uzo uzoVar2 = (defpackage.uzo) obj;
                kiu kiuVar = uzoVar2.d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                java.lang.Object obj3 = this.a;
                long j = kiuVar.d;
                defpackage.vxq vxqVar = (defpackage.vxq) obj3;
                j$.util.Optional optionalOf = vxqVar.J.isPresent() ? j$.util.Optional.of(java.lang.Boolean.valueOf(vxqVar.O.contains(java.lang.Long.valueOf(j)))) : j$.util.Optional.empty();
                defpackage.vyh vyhVarA = defpackage.vyj.a();
                vyhVarA.c(uzoVar2);
                if (vxqVar.L.isPresent()) {
                    defpackage.vxo vxoVar = (defpackage.vxo) vxqVar.L.orElseThrow();
                    vyiVar = vxoVar.a != j ? defpackage.vyi.a : vxoVar.b ? defpackage.vyi.b : defpackage.vyi.c;
                } else {
                    vyiVar = defpackage.vyi.a;
                }
                vyhVarA.c = vyiVar;
                vyhVarA.b(optionalOf);
                j$.util.Optional optional2 = vxqVar.M;
                if (optional2 == null) {
                    throw new java.lang.NullPointerException("Null callRecordingPlayerState");
                }
                vyhVarA.e = optional2;
                return vyhVarA.a();
            case 3:
                return ((defpackage.vxq) this.a).f(((java.lang.Long) obj).longValue());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return (defpackage.wqp) ((aigf) this.a).get(java.lang.Long.valueOf(((kdy) obj).b));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.wqp wqpVar = (defpackage.wqp) obj;
                defpackage.wqt wqtVar = wqpVar.e;
                if (wqtVar == null) {
                    wqtVar = defpackage.wqt.a;
                }
                defpackage.wqs wqsVar = wqtVar.c;
                if (wqsVar == null) {
                    wqsVar = defpackage.wqs.a;
                }
                java.lang.Object obj4 = this.a;
                wrp wrpVar = (wrp) obj4;
                defpackage.wrj wrjVar = wrpVar.e;
                defpackage.vfm vfmVar = new defpackage.vfm(wrjVar, wqsVar, 19);
                ajct ajctVar = wrjVar.c;
                return ahrv.g(ahvr.I(ahvr.G(vfmVar, ajctVar), new defpackage.whr(wrjVar, wqsVar, 12, bArr), ajctVar)).i(new defpackage.whr(obj4, wqpVar, i4, bArr), wrpVar.f);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return (defpackage.wyz) ((aigf) this.a).get(java.lang.Long.valueOf(((kdy) obj).b));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.wyz wyzVar = (defpackage.wyz) obj;
                defpackage.xac xacVar = wyzVar.d;
                java.lang.Object obj5 = this.a;
                wzh wzhVar = (wzh) obj5;
                defpackage.wze wzeVar = wzhVar.f;
                defpackage.wwg wwgVar = new defpackage.wwg(wzeVar, xacVar, 3, bArr);
                ajct ajctVar2 = wzeVar.c;
                ajcq ajcqVarG = ahvr.G(wwgVar, ajctVar2);
                return ahrv.g(ahvr.ak(new ajcq[]{ajcqVarG}).p(new vto(wzeVar, ajcqVarG, xacVar, 4, (char[]) null), ajctVar2)).i(new defpackage.wzg(obj5, wyzVar, i5), wzhVar.g);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return gus.az(new mhc[]{gus.ax(((j$.util.Optional) obj).isPresent()), aais.aE((android.telecom.PhoneAccountHandle) this.a)});
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                java.lang.Object obj6 = this.a;
                try {
                    return ((defpackage.zmn) obj6).l.i((android.telecom.PhoneAccountHandle) optional3.orElse((java.lang.Object) null));
                } catch (java.lang.SecurityException unused) {
                    return ((defpackage.zmn) obj6).l;
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.zmn) this.a).k.j((android.telecom.PhoneAccountHandle) ((j$.util.Optional) obj).orElseThrow());
            case 15:
                return rlt.a(((defpackage.zmn) this.a).j, (android.telecom.PhoneAccountHandle) null).toUpperCase(java.util.Locale.US);
            case 16:
                java.util.Map map = defpackage.aaat.a;
                java.lang.Object obj7 = this.a;
                java.util.List list = zzd.m;
                android.content.Context context = (android.content.Context) obj7;
                zza zzaVar = new zza(context, "CLIENT_LOGGING_PROD");
                ((zyw) zzaVar).e = (java.lang.String) obj;
                defpackage.zzh zzhVarA = andp.a.b().a(context);
                zzaVar.g = zzhVarA;
                zzaVar.h = 11;
                if ((zzhVarA.b & 2) != 0) {
                    defpackage.zzg zzgVar = zzhVarA.d;
                    if (zzgVar == null) {
                        zzgVar = defpackage.zzg.a;
                    }
                    if ((zzgVar.b & 1) != 0) {
                        double d2 = zzgVar.c;
                        if (d2 >= 0.0d && d2 <= 1.0d) {
                            if ((zzhVarA.b & 1) != 0) {
                                zzfVar = zzhVarA.c;
                                if (zzfVar == null) {
                                    zzfVar = defpackage.zzf.a;
                                }
                                i = zzfVar.b;
                                if ((i & 1) != 0) {
                                    d = zzfVar.c;
                                    if (d >= 0.0d) {
                                    }
                                }
                            }
                        }
                    }
                    akzx akzxVarP2 = zzhVarA.p();
                    akzx akzxVarM = defpackage.zzf.a.m();
                    akzxVarM.u();
                    defpackage.zzf zzfVar2 = (defpackage.zzf) akzxVarM.b;
                    zzfVar2.b |= 1;
                    zzfVar2.c = 0.0d;
                    akzxVarP2.u();
                    defpackage.zzh zzhVar = (defpackage.zzh) akzxVarP2.b;
                    defpackage.zzf zzfVar3 = (defpackage.zzf) akzxVarM.p();
                    j$.util.Objects.requireNonNull(zzfVar3);
                    zzhVar.c = zzfVar3;
                    zzhVar.b |= 1;
                    akzx akzxVarM2 = defpackage.zzg.a.m();
                    akzxVarM2.u();
                    defpackage.zzg zzgVar2 = (defpackage.zzg) akzxVarM2.b;
                    zzgVar2.b |= 1;
                    zzgVar2.c = 0.0d;
                    akzxVarP2.u();
                    defpackage.zzh zzhVar2 = (defpackage.zzh) akzxVarP2.b;
                    defpackage.zzg zzgVar3 = (defpackage.zzg) akzxVarM2.p();
                    j$.util.Objects.requireNonNull(zzgVar3);
                    zzhVar2.d = zzgVar3;
                    zzhVar2.b |= 2;
                    zzaVar.g = (defpackage.zzh) akzxVarP2.p();
                } else if ((zzhVarA.b & 1) != 0) {
                    zzfVar = zzhVarA.c;
                    if (zzfVar == null) {
                        zzfVar = defpackage.zzf.a;
                    }
                    i = zzfVar.b;
                    if ((i & 1) != 0) {
                        d = zzfVar.c;
                        if (d >= 0.0d || d > 1.0d || (i2 = zzfVar.d) <= 0 || ((i & 4) != 0 && ((i3 = zzfVar.e) <= 0 || i3 > i2))) {
                            akzx akzxVarP3 = zzhVarA.p();
                            akzx akzxVarM3 = defpackage.zzf.a.m();
                            akzxVarM3.u();
                            defpackage.zzf zzfVar4 = (defpackage.zzf) akzxVarM3.b;
                            zzfVar4.b |= 1;
                            zzfVar4.c = 0.0d;
                            akzxVarP3.u();
                            defpackage.zzh zzhVar3 = (defpackage.zzh) akzxVarP3.b;
                            defpackage.zzf zzfVar5 = (defpackage.zzf) akzxVarM3.p();
                            j$.util.Objects.requireNonNull(zzfVar5);
                            zzhVar3.c = zzfVar5;
                            zzhVar3.b |= 1;
                            akzx akzxVarM4 = defpackage.zzg.a.m();
                            akzxVarM4.u();
                            defpackage.zzg zzgVar4 = (defpackage.zzg) akzxVarM4.b;
                            zzgVar4.b |= 1;
                            zzgVar4.c = 0.0d;
                            akzxVarP3.u();
                            defpackage.zzh zzhVar4 = (defpackage.zzh) akzxVarP3.b;
                            defpackage.zzg zzgVar5 = (defpackage.zzg) akzxVarM4.p();
                            j$.util.Objects.requireNonNull(zzgVar5);
                            zzhVar4.d = zzgVar5;
                            zzhVar4.b |= 2;
                            zzaVar.g = (defpackage.zzh) akzxVarP3.p();
                        }
                    } else {
                        akzx akzxVarP4 = zzhVarA.p();
                        akzx akzxVarM5 = defpackage.zzf.a.m();
                        akzxVarM5.u();
                        defpackage.zzf zzfVar6 = (defpackage.zzf) akzxVarM5.b;
                        zzfVar6.b |= 1;
                        zzfVar6.c = 0.0d;
                        akzxVarP4.u();
                        defpackage.zzh zzhVar5 = (defpackage.zzh) akzxVarP4.b;
                        defpackage.zzf zzfVar7 = (defpackage.zzf) akzxVarM5.p();
                        j$.util.Objects.requireNonNull(zzfVar7);
                        zzhVar5.c = zzfVar7;
                        zzhVar5.b |= 1;
                        akzx akzxVarM6 = defpackage.zzg.a.m();
                        akzxVarM6.u();
                        defpackage.zzg zzgVar6 = (defpackage.zzg) akzxVarM6.b;
                        zzgVar6.b |= 1;
                        zzgVar6.c = 0.0d;
                        akzxVarP4.u();
                        defpackage.zzh zzhVar6 = (defpackage.zzh) akzxVarP4.b;
                        defpackage.zzg zzgVar7 = (defpackage.zzg) akzxVarM6.p();
                        j$.util.Objects.requireNonNull(zzgVar7);
                        zzhVar6.d = zzgVar7;
                        zzhVar6.b |= 2;
                        zzaVar.g = (defpackage.zzh) akzxVarP4.p();
                    }
                }
                return zzaVar.b();
            case 17:
                return this.a.remove((java.lang.String) obj);
            case 18:
                int i6 = defpackage.acjm.c;
                return this.a.a(obj);
            case 19:
                acuw acuwVar = (acuw) obj;
                for (defpackage.acvr acvrVar : ((defpackage.acvu) this.a).o) {
                    if (acvrVar.c.equals(acuwVar.c)) {
                        apdi apdiVar = defpackage.acvf.e;
                        acuwVar.c(apdiVar);
                        akzs akzsVar = ((alaa) acuwVar).n;
                        alac alacVar = (alac) apdiVar.a;
                        if (!akzsVar.l(alacVar)) {
                            return acvrVar;
                        }
                        acuwVar.c(apdiVar);
                        java.lang.Object objJ = ((alaa) acuwVar).n.j(alacVar);
                        if (objJ == null) {
                            objJ = apdiVar.b;
                        } else {
                            apdiVar.c(objJ);
                        }
                        defpackage.acvf acvfVar = (defpackage.acvf) objJ;
                        akzx akzxVarP5 = acvrVar.p();
                        long j2 = acvfVar.c;
                        akzxVarP5.u();
                        defpackage.acvr acvrVar2 = (defpackage.acvr) akzxVarP5.b;
                        acvrVar2.b |= 4;
                        acvrVar2.e = j2;
                        long j3 = acvfVar.d;
                        akzxVarP5.u();
                        defpackage.acvr acvrVar3 = (defpackage.acvr) akzxVarP5.b;
                        acvrVar3.b |= 128;
                        acvrVar3.j = j3;
                        return (defpackage.acvr) akzxVarP5.p();
                    }
                }
                throw new java.lang.IllegalArgumentException("DataFileGroupInternal does not contain DataFile with fileId: ".concat(java.lang.String.valueOf(acuwVar.c)));
            default:
                return this.a.a(obj);
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
