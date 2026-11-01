package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class tge implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tge(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v43, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v86, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v90, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v92, types: [emw, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) throws java.io.IOException {
        uhd taqVar = null;
        switch (this.$cid) {
            case 0:
                ((java.lang.Integer) obj).intValue();
                return this.a;
            case 1:
                return ((tgy) ((thc) this.a).b.get(((java.lang.Integer) obj).intValue())).a();
            case 2:
                android.content.Context context = (android.content.Context) obj;
                defpackage.aooh.f(context, "context");
                java.lang.String string = ((tlh) this.a).b.getString(2132020116);
                defpackage.aooh.e(string, "getString(...)");
                android.net.Uri uri = android.net.Uri.parse(string);
                defpackage.aooh.e(uri, "parse(...)");
                defpackage.aooh.f(uri, "<this>");
                defpackage.ahqx.l(context, new android.content.Intent("android.intent.action.VIEW", uri));
                return defpackage.aojh.a;
            case 3:
                ((defpackage.ubj) this.a.a()).b();
                return defpackage.ajcm.a;
            case 4:
                uaa uaaVar = (uaa) obj;
                defpackage.aooh.f(uaaVar, "it");
                ((ubw) this.a).i.b(uaaVar);
                return defpackage.aojh.a;
            case 5:
                defpackage.gin ginVarA = ((defpackage.gjh) obj).a("SELECT * FROM spamcall WHERE id = ?");
                java.lang.Object obj2 = this.a;
                try {
                    if (obj2 == null) {
                        ginVarA.i(1);
                    } else {
                        ginVarA.j(1, (java.lang.String) obj2);
                    }
                    int iS = defpackage.dzk.S(ginVarA, "id");
                    int iS2 = defpackage.dzk.S(ginVarA, "persistableSpamStatus");
                    taqVar = ginVarA.m() ? new taq(ginVarA.l(iS) ? null : ginVarA.e(iS), ucv.a(ginVarA.l(iS2) ? null : ginVarA.n(iS2))) : null;
                    ginVarA.close();
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.gin ginVarA2 = ((defpackage.gjh) obj).a("SELECT * FROM moirai_data WHERE client_role =?");
                try {
                    ginVarA2.j(1, (java.lang.String) this.a);
                    int iS3 = defpackage.dzk.S(ginVarA2, "client_role");
                    int iS4 = defpackage.dzk.S(ginVarA2, "protection_token");
                    if (ginVarA2.m()) {
                        java.lang.String strE = ginVarA2.e(iS3);
                        byte[] bArrN = ginVarA2.n(iS4);
                        defpackage.aooh.f(bArrN, "value");
                        defpackage.akzc akzcVarU = defpackage.akzc.u(bArrN);
                        defpackage.aooh.e(akzcVarU, "copyFrom(...)");
                        taqVar = new uhd(strE, akzcVarU);
                    }
                } finally {
                    ginVarA2.close();
                }
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.a.J((java.lang.String) this.a, (defpackage.diq) obj);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.diq diqVar = (defpackage.diq) obj;
                defpackage.aooh.f(diqVar, "$this$semantics");
                defpackage.dfb.o(diqVar, 0);
                defpackage.dfb.q(diqVar, (java.lang.String) this.a);
                return defpackage.aojh.a;
            case 9:
                this.a.a();
                return defpackage.aojh.a;
            case 10:
                com.android.dialer.timekeeper.histogram.HistogramView histogramView = (com.android.dialer.timekeeper.histogram.HistogramView) obj;
                defpackage.aooh.f(histogramView, "view");
                utp utpVar = (utp) this.a;
                j$.util.Optional optionalOf = j$.util.Optional.of(utpVar.a);
                defpackage.ucm ucmVar = utpVar.b;
                histogramView.m(optionalOf, (vqu) ucmVar.a, (abtr) ucmVar.b);
                return defpackage.aojh.a;
            case 11:
                java.lang.String str = (java.lang.String) obj;
                defpackage.aooh.f(str, "it");
                defpackage.aooh.f(str, "value");
                defpackage.akzx akzxVar = (defpackage.akzx) ((vqf) this.a).a;
                akzxVar.u();
                utu utuVar = akzxVar.b;
                utu utuVar2 = utu.a;
                j$.util.Objects.requireNonNull(str);
                utuVar.b |= 16;
                utuVar.g = str;
                return defpackage.aojh.a;
            case 12:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.aooh.f(str2, "it");
                defpackage.aooh.f(str2, "value");
                defpackage.akzx akzxVar2 = (defpackage.akzx) ((vqf) this.a).a;
                akzxVar2.u();
                utu utuVar3 = akzxVar2.b;
                utu utuVar4 = utu.a;
                j$.util.Objects.requireNonNull(str2);
                utuVar3.b |= 32;
                utuVar3.h = str2;
                return defpackage.aojh.a;
            case 13:
                ((vol) this.a).i(voj.f);
                return defpackage.aojh.a;
            case 14:
                vqb vqbVar = (vqb) this.a;
                vqbVar.i = true;
                vqbVar.g.n(defpackage.rmw.VM_GREETING_SAVED_RECORDING_PLAYED);
                vqbVar.a();
                return defpackage.aojh.a;
            case 15:
                defpackage.mnp mnpVar = (defpackage.mnp) obj;
                defpackage.aooh.f(mnpVar, "dobby");
                defpackage.aimz aimzVar = defpackage.zih.a;
                defpackage.aolr aolrVarPlus = defpackage.zih.b.plus(defpackage.aols.a);
                wcb wcbVar = (wcb) this.a;
                defpackage.aoov.al(wcbVar.a, aolrVarPlus, 1, new tgn((defpackage.aoln) null, mnpVar, wcbVar, 7));
                return defpackage.aojh.a;
            case 16:
                afpl afplVar = (afpl) obj;
                java.lang.Object obj3 = afplVar.a;
                wcg wcgVar = ((wce) this.a).b;
                wcgVar.a = (zul) obj3;
                defpackage.aimz aimzVar2 = wce.a;
                ((defpackage.aimw) aimzVar2.b().l("com/android/dialer/wear/siesta/impl/SiestaDataSender", "sendDataToDialerWear$<anonymous>", 65, "SiestaDataSender.kt")).y("SentStatus: %s", obj3);
                if (obj3 == zul.a) {
                    defpackage.aoop aoopVar = new defpackage.aoop();
                    java.lang.Object obj4 = afplVar.b;
                    vxc vxcVar = new vxc(new defpackage.tge(aoopVar, 17), 10);
                    j$.util.Optional optional = (j$.util.Optional) obj4;
                    if (true == optional.isPresent()) {
                        vxcVar.a.a(optional.get());
                    }
                    wcgVar.b = java.lang.Boolean.valueOf(aoopVar.a);
                    ((defpackage.aimw) aimzVar2.b().l("com/android/dialer/wear/siesta/impl/SiestaDataSender", "sendDataToDialerWear$<anonymous>", 76, "SiestaDataSender.kt")).y("isRequestSuccessfullyReceived: %b", java.lang.Boolean.valueOf(aoopVar.a));
                }
                return defpackage.aojh.a;
            case 17:
                zuk zukVar = (zuk) obj;
                defpackage.aooh.f(zukVar, "tetheredAutoCallScreenInfoResponse");
                ((defpackage.aoop) this.a).a = zukVar.b;
                return defpackage.aojh.a;
            case 18:
                wpu wpuVarB = wpu.b(((defpackage.wpy) obj).c);
                if (wpuVarB == null) {
                    wpuVarB = wpu.a;
                }
                return wpuVarB == wpu.b ? ((wjf) this.a.a()).a() : defpackage.ajcm.a;
            case 19:
                defpackage.emy emyVar = (defpackage.emy) obj;
                int i = xmh.b;
                defpackage.aooh.f(emyVar, "it");
                emyVar.c(this.a);
                return defpackage.aojh.a;
            default:
                defpackage.emy emyVar2 = (defpackage.emy) obj;
                int i2 = xmh.b;
                defpackage.aooh.f(emyVar2, "it");
                emyVar2.d(this.a);
                return defpackage.aojh.a;
        }
        return taqVar;
    }
}
