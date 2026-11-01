package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xpf implements aonn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xpf(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        boolean z = true;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                java.lang.String str2 = (java.lang.String) obj2;
                aooh.f(str, "key");
                aooh.f(str2, "error");
                defpackage.xox.g("PersistableIntent", "Found non-persistable extra with key " + str + ": " + str2);
                return aojh.a;
            case 1:
                cav cavVar = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    abrz.k(dfa.f(2132018670, cavVar), (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar, 0, 0, 262142);
                } else {
                    cavVar.s();
                }
                return aojh.a;
            case 2:
                java.lang.String str3 = ((aenj) obj).a;
                java.lang.String str4 = ((aenj) obj2).a;
                aooh.e(str4, "toString(...)");
                return java.lang.Integer.valueOf(str3.compareTo(str4));
            case 3:
                defpackage.apqr apqrVar = (defpackage.apqr) obj;
                defpackage.apqr apqrVar2 = (defpackage.apqr) obj2;
                aooh.c(apqrVar);
                int iC = zph.c(apqrVar);
                aooh.c(apqrVar2);
                return java.lang.Integer.valueOf(iC - zph.c(apqrVar2));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return anar.p(obj, obj2);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((java.lang.Float) obj).floatValue();
                ((java.lang.Float) obj2).floatValue();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                cav cavVar2 = (cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    aehj.bl(den.ba(den.aZ(azm.d(cmw.c, 1.0f), 0.0f, 16.0f), 16.0f, 0.0f, 0.0f, 0.0f), cfo.j(-859640288, new defpackage.abiq(z ? 1 : 0), cavVar2), cavVar2, 54, 0);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                cav cavVar3 = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    aehj.bl(den.ba(den.aZ(azm.d(cmw.c, 1.0f), 0.0f, 16.0f), 16.0f, 0.0f, 0.0f, 0.0f), cfo.j(257590471, new bmq(20), cavVar3), cavVar3, 54, 0);
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return anar.p(obj, obj2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return anar.q(obj, obj2);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.abmf abmfVar = (defpackage.abmf) obj;
                abjp abjpVar = (abjp) obj2;
                aooh.f(abmfVar, "item");
                aooh.f(abjpVar, "shape");
                return new defpackage.ablh(abmfVar, abjpVar);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                cav cavVar4 = (cav) obj;
                ((java.lang.Integer) obj2).intValue();
                aonn aonnVar = abny.a;
                cavVar4.u(-1139324632);
                boolean zBg = den.bg(cavVar4);
                cavVar4.o();
                return java.lang.Boolean.valueOf(zBg);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((java.lang.Integer) obj).intValue();
                aooh.f((java.lang.String) obj2, "<unused var>");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return anar.p(obj, obj2);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                cav cavVar5 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    defpackage.acpk.a.a(null, 0.0f, 0.0f, null, 0L, cavVar5, 196608);
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case 15:
                return anar.p(obj, obj2);
            case 16:
                return anar.p(obj, obj2);
            case 17:
                return anar.p(obj, obj2);
            case 18:
                return anar.p(obj, obj2);
            case 19:
                cav cavVar6 = (cav) obj;
                ((java.lang.Integer) obj2).intValue();
                cavVar6.u(2123156111);
                ayn aynVar = new ayn(uu.i(cavVar6), 48);
                cavVar6.o();
                return aynVar;
            default:
                cav cavVar7 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    aaoo.V(wv.k(2131231303, cavVar7, 0), dfa.f(2132019643, cavVar7), (cmw) null, 0L, cavVar7, 8, 12);
                } else {
                    cavVar7.s();
                }
                return aojh.a;
        }
    }
}
