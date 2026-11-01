package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aev implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aev(long j, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = j;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:15:0x007c  */
    /* JADX WARN: Type inference failed for: r14v67, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v18, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj) throws aois {
        long jA;
        aonj aonjVar;
        aonj aonjVar2;
        int iOrdinal;
        int i = 10;
        long jA2 = 0;
        switch (this.$cid) {
            case 0:
                aew aewVar = (aew) this.b;
                if (aooh.n(obj, aewVar.b.b())) {
                    jA2 = aewVar.a(this.a);
                } else {
                    cer cerVar = (cer) aewVar.b.d.a(obj);
                    if (cerVar != null) {
                        jA2 = ((dpp) cerVar.a()).a;
                    }
                }
                return new dpp(jA2);
            case 1:
                alc alcVar = (alc) obj;
                java.lang.Object objB = alcVar.b();
                aew aewVar2 = (aew) this.b;
                if (aooh.n(objB, aewVar2.b.b())) {
                    jA = aewVar2.a(this.a);
                } else {
                    cer cerVar2 = (cer) aewVar2.b.d.a(alcVar.b());
                    jA = cerVar2 != null ? ((dpp) cerVar2.a()).a : 0L;
                }
                cer cerVar3 = (cer) aewVar2.b.d.a(alcVar.c());
                jA2 = cerVar3 != null ? ((dpp) cerVar3.a()).a : 0L;
                ahu ahuVar = (ahu) aewVar2.a.a();
                if (ahuVar != null) {
                    return ahuVar.b.a(new dpp(jA), new dpp(jA2));
                }
                ajl ajlVar = aen.a;
                return aen.a;
            case 2:
                int iOrdinal2 = ((afr) obj).ordinal();
                java.lang.Object obj2 = this.b;
                long j = this.a;
                if (iOrdinal2 == 0) {
                    afm afmVar = ((agd) obj2).b.b.c;
                    if (afmVar != null && (aonjVar = afmVar.b) != null) {
                        j = ((dpp) aonjVar.a(new dpp(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new aois();
                    }
                    afm afmVar2 = ((agd) obj2).c.b.c;
                    if (afmVar2 != null && (aonjVar2 = afmVar2.b) != null) {
                        j = ((dpp) aonjVar2.a(new dpp(j))).a;
                    }
                }
                return new dpp(j);
            case 3:
                afr afrVar = (afr) obj;
                agd agdVar = (agd) this.b;
                if (agdVar.f != null && agdVar.a() != null && !aooh.n(agdVar.f, agdVar.a()) && (iOrdinal = afrVar.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new aois();
                    }
                    afm afmVar3 = agdVar.c.b.c;
                    if (afmVar3 != null) {
                        long j2 = this.a;
                        long j3 = ((dpp) afmVar3.b.a(new dpp(j2))).a;
                        cmj cmjVarA = agdVar.a();
                        aooh.c(cmjVarA);
                        dpq dpqVar = dpq.a;
                        long jA3 = cmjVarA.a(j2, j3, dpqVar);
                        cmj cmjVar = agdVar.f;
                        aooh.c(cmjVar);
                        jA2 = dpn.c(jA3, cmjVar.a(j2, j3, dpqVar));
                    }
                }
                return new dpn(jA2);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                afr afrVar2 = (afr) obj;
                agd agdVar2 = (agd) this.b;
                defpackage.ahv ahvVar = agdVar2.b.b.b;
                long j4 = this.a;
                long j5 = ahvVar != null ? ((dpn) ahvVar.a.a(new dpp(j4))).a : 0L;
                defpackage.ahv ahvVar2 = agdVar2.c.b.b;
                long j6 = ahvVar2 != null ? ((dpn) ahvVar2.a.a(new dpp(j4))).a : 0L;
                int iOrdinal3 = afrVar2.ordinal();
                if (iOrdinal3 == 0) {
                    jA2 = j5;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new aois();
                    }
                    jA2 = j6;
                }
                return new dpn(jA2);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                long jC = dpn.c(((dpn) ((aii) obj).d()).a, this.a);
                bfe bfeVar = (bfe) this.b;
                bfeVar.n(jC);
                bfeVar.a.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                den.J((csj) obj, this.a, 0L, aooc.s(((java.lang.Number) this.b.a()).floatValue(), 0.0f, 1.0f), (cqh) null, 118);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.afpl afplVar = (defpackage.afpl) obj;
                aooh.f(afplVar, "$this$withItalic");
                afplVar.E(cfd.L(this.a), new lvd(this.b, 10));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                cra craVar = (cra) obj;
                aooh.f(craVar, "$this$graphicsLayer");
                craVar.B(this.a);
                craVar.v(((java.lang.Number) this.b.a()).floatValue());
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                akzx akzxVar = (akzx) obj;
                long j7 = this.a;
                aimz aimzVar = defpackage.sle.a;
                aooh.f(akzxVar, "it");
                defpackage.vqf vqfVarK = defpackage.abxl.K(defpackage.abxp.a.m());
                defpackage.vqf vqfVarI = defpackage.abxl.I(defpackage.abxs.a.m());
                java.lang.String string = ((android.net.Uri) this.b).toString();
                aooh.e(string, "toString(...)");
                vqfVarI.P(string);
                vqfVarI.R(1.0f);
                vqfVarI.S(0.0f);
                vqfVarI.T(0.0f);
                vqfVarK.ac(vqfVarI.O());
                defpackage.abxp abxpVarAb = vqfVarK.ab();
                akzxVar.u();
                defpackage.abxt abxtVar = (defpackage.abxt) akzxVar.b;
                defpackage.abxt abxtVar2 = defpackage.abxt.a;
                j$.util.Objects.requireNonNull(abxpVarAb);
                abxtVar.c = abxpVarAb;
                abxtVar.b |= 1;
                defpackage.vqf vqfVarJ = defpackage.abxl.J(defpackage.abxr.a.m());
                defpackage.vaa vaaVarC = ajee.C(defpackage.amml.a.m());
                akzx akzxVarM = akzv.a.m();
                akzxVarM.u();
                akzxVarM.b.b = cqg.a(j7);
                akzv akzvVar = (akzv) akzxVarM.p();
                aooh.e(akzvVar, "of(...)");
                vaaVarC.aq(akzvVar);
                vaaVarC.at(cqg.d(j7));
                vaaVarC.as(cqg.c(j7));
                vaaVarC.ar(cqg.b(j7));
                vqfVarJ.V(vaaVarC.ap());
                defpackage.abxr abxrVarU = vqfVarJ.U();
                akzxVar.u();
                defpackage.abxt abxtVar3 = (defpackage.abxt) akzxVar.b;
                j$.util.Objects.requireNonNull(abxrVarU);
                abxtVar3.d = abxrVarU;
                abxtVar3.b |= 2;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.afpl afplVar2 = (defpackage.afpl) obj;
                aooh.f(afplVar2, "$this$withItalic");
                afplVar2.E(cfd.L(this.a), new abgj(this.b, 19));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.afpl afplVar3 = (defpackage.afpl) obj;
                aooh.f(afplVar3, "$this$builder");
                java.lang.Object obj3 = this.b;
                abof abofVar = (abof) obj3;
                if (abofVar.b != null) {
                    afplVar3.F(new defpackage.aev(this.a, obj3, i));
                }
                java.lang.Integer num = abofVar.d;
                if (num != null) {
                    java.lang.String str = abofVar.c;
                    int length = str.length();
                    int iIntValue = num.intValue();
                    if (iIntValue < 0 || iIntValue >= length) {
                        afplVar3.C(abofVar.c);
                    } else {
                        java.lang.String strSubstring = str.substring(0, num.intValue());
                        aooh.e(strSubstring, "substring(...)");
                        afplVar3.C(strSubstring);
                        abgj abgjVar = new abgj(obj3, 20);
                        java.lang.StringBuilder sb = (java.lang.StringBuilder) afplVar3.a;
                        int length2 = sb.length();
                        abgjVar.a(afplVar3);
                        afplVar3.b.add(new defpackage.abff(length2, sb.length()));
                    }
                } else {
                    afplVar3.C(abofVar.c);
                }
                return aojh.a;
            default:
                ((acak) this.b).b(this.a, false);
                return aojh.a;
        }
    }

    public /* synthetic */ aev(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }
}
