package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vkk implements defpackage.vch {
    private final android.content.Context a;
    private final defpackage.vjs b;
    private final defpackage.vfi c;

    public vkk(android.content.Context context, defpackage.vjs vjsVar, defpackage.vfi vfiVar) {
        this.a = context;
        this.b = vjsVar;
        this.c = vfiVar;
    }

    private final defpackage.vtw c() {
        akzx akzxVarM = defpackage.vtw.a.m();
        java.lang.String string = this.a.getString(2132020838);
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar.b |= 2;
        vtwVar.d = string;
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        vtwVar2.c = 8;
        vtwVar2.b |= 1;
        return (defpackage.vtw) akzxVarM.p();
    }

    private final defpackage.vtw d() {
        akzx akzxVarM = defpackage.vtw.a.m();
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        vtwVar.c = 3;
        vtwVar.b |= 1;
        java.lang.String string = this.a.getString(2132020839);
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar2.b |= 2;
        vtwVar2.d = string;
        return (defpackage.vtw) akzxVarM.p();
    }

    private final defpackage.vtw e() {
        akzx akzxVarM = defpackage.vtw.a.m();
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        vtwVar.c = 5;
        vtwVar.b |= 1;
        java.lang.String string = this.a.getString(2132020841);
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar2.b |= 2;
        vtwVar2.d = string;
        return (defpackage.vtw) akzxVarM.p();
    }

    private final java.lang.CharSequence f(int i) {
        android.content.Context context = this.a;
        return pez.aq(context, context.getString(i, context.getString(2132020702)));
    }

    private static boolean g(vzi vziVar) {
        if (vziVar.j != 0 || vziVar.i != 0) {
            return true;
        }
        int i = vziVar.h;
        return (i == -100 || i == 0 || i == 3) ? false : true;
    }

    @Override // defpackage.vch
    public final j$.util.Optional a(vzi vziVar) {
        defpackage.vbs vbsVarB;
        defpackage.vbw vbwVarB;
        if (vziVar.h == 3) {
            akzx akzxVarM = defpackage.vtx.a.m();
            akzxVarM.u();
            defpackage.vtx vtxVar = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar.c = vziVar;
            vtxVar.b |= 1;
            android.content.Context context = this.a;
            java.lang.String string = context.getString(2132020887);
            akzxVarM.u();
            defpackage.vtx vtxVar2 = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            vtxVar2.b |= 2;
            vtxVar2.d = string;
            java.lang.String string2 = context.getString(2132020886);
            akzxVarM.u();
            defpackage.vtx vtxVar3 = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(string2);
            vtxVar3.b |= 4;
            vtxVar3.e = string2;
            defpackage.vtw vtwVarD = d();
            akzxVarM.u();
            defpackage.vtx vtxVar4 = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(vtwVarD);
            vtxVar4.f = vtwVarD;
            vtxVar4.b |= 8;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
        }
        vcp vcpVar = vziVar.g;
        if (vcpVar == null) {
            vcpVar = vcp.a;
        }
        int iX = a.X(vcpVar.b);
        if (iX == 0) {
            throw null;
        }
        int i = iX - 1;
        if (i == 0) {
            vcp vcpVar2 = vziVar.g;
            if (vcpVar2 == null) {
                vcpVar2 = vcp.a;
            }
            if (vcpVar2.b == 1) {
                vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
                if (vbsVarB == null) {
                    vbsVarB = defpackage.vbs.UNRECOGNIZED;
                }
            } else {
                vbsVarB = defpackage.vbs.UNSPECIFIED;
            }
            akzx akzxVarM2 = defpackage.vtx.a.m();
            akzxVarM2.u();
            defpackage.vtx vtxVar5 = (defpackage.vtx) akzxVarM2.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar5.c = vziVar;
            vtxVar5.b |= 1;
            boolean zG = g(vziVar);
            akzxVarM2.u();
            defpackage.vtx vtxVar6 = (defpackage.vtx) akzxVarM2.b;
            vtxVar6.b |= 32;
            vtxVar6.h = zG;
            switch (vbsVarB.ordinal()) {
                case 0:
                case 2:
                case 3:
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 25:
                case 26:
                case 27:
                case 30:
                case 31:
                case 32:
                case 33:
                    return this.c.a(vziVar);
                case 1:
                    java.lang.String string3 = this.a.getString(2132020980);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar7 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string3);
                    vtxVar7.b |= 2;
                    vtxVar7.d = string3;
                    java.lang.String string4 = f(2132020979).toString();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar8 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string4);
                    vtxVar8.b |= 4;
                    vtxVar8.e = string4;
                    defpackage.vtw vtwVarD2 = d();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar9 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarD2);
                    vtxVar9.f = vtwVarD2;
                    vtxVar9.b |= 8;
                    defpackage.vtw vtwVarC = c();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar10 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarC);
                    vtxVar10.g = vtwVarC;
                    vtxVar10.b |= 16;
                    return j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                case 28:
                    java.lang.String string5 = this.a.getString(2132021018);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar11 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string5);
                    vtxVar11.b |= 2;
                    vtxVar11.d = string5;
                    java.lang.String string6 = f(2132021017).toString();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar12 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string6);
                    vtxVar12.b |= 4;
                    vtxVar12.e = string6;
                    defpackage.vtw vtwVarE = e();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar13 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarE);
                    vtxVar13.f = vtwVarE;
                    vtxVar13.b |= 8;
                    defpackage.vtw vtwVarC2 = c();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar14 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarC2);
                    vtxVar14.g = vtwVarC2;
                    vtxVar14.b |= 16;
                    return j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
                case 23:
                    android.content.Context context2 = this.a;
                    java.lang.String string7 = context2.getString(2132020891);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar15 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string7);
                    vtxVar15.b |= 2;
                    vtxVar15.d = string7;
                    java.lang.String string8 = context2.getString(2132019815);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar16 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string8);
                    vtxVar16.b |= 4;
                    vtxVar16.e = string8;
                    defpackage.vtw vtwVarD3 = d();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar17 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarD3);
                    vtxVar17.f = vtwVarD3;
                    vtxVar17.b |= 8;
                    defpackage.vtw vtwVarE2 = e();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar18 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarE2);
                    vtxVar18.g = vtwVarE2;
                    vtxVar18.b |= 16;
                    return j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
                case 24:
                    android.content.Context context3 = this.a;
                    java.lang.String string9 = context3.getString(2132020891);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar19 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string9);
                    vtxVar19.b |= 2;
                    vtxVar19.d = string9;
                    java.lang.String string10 = context3.getString(2132017993);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar20 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string10);
                    vtxVar20.b |= 4;
                    vtxVar20.e = string10;
                    defpackage.vtw vtwVarD4 = d();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar21 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarD4);
                    vtxVar21.f = vtwVarD4;
                    vtxVar21.b |= 8;
                    defpackage.vtw vtwVarE3 = e();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar22 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarE3);
                    vtxVar22.g = vtwVarE3;
                    vtxVar22.b |= 16;
                    return j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
                case 29:
                    java.lang.String string11 = this.a.getString(2132021006);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar23 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string11);
                    vtxVar23.b |= 2;
                    vtxVar23.d = string11;
                    java.lang.String string12 = f(2132021005).toString();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar24 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string12);
                    vtxVar24.b |= 4;
                    vtxVar24.e = string12;
                    defpackage.vtw vtwVarD5 = d();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar25 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarD5);
                    vtxVar25.f = vtwVarD5;
                    vtxVar25.b |= 8;
                    defpackage.vtw vtwVarC3 = c();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar26 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarC3);
                    vtxVar26.g = vtwVarC3;
                    vtxVar26.b |= 16;
                    return j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
                default:
                    throw new java.lang.RuntimeException(null, null);
            }
        }
        if (i == 1) {
            throw new java.lang.IllegalStateException("Rest failure reason is not expected to be handled");
        }
        if (i != 2) {
            if (i == 3) {
                return j$.util.Optional.empty();
            }
            throw new java.lang.RuntimeException(null, null);
        }
        vcp vcpVar3 = vziVar.g;
        if (vcpVar3 == null) {
            vcpVar3 = vcp.a;
        }
        if (vcpVar3.b == 3) {
            vbwVarB = defpackage.vbw.b(((java.lang.Integer) vcpVar3.c).intValue());
            if (vbwVarB == null) {
                vbwVarB = defpackage.vbw.UNRECOGNIZED;
            }
        } else {
            vbwVarB = defpackage.vbw.OMTP_UNSPECIFIED;
        }
        akzx akzxVarM3 = defpackage.vtx.a.m();
        akzxVarM3.u();
        defpackage.vtx vtxVar27 = (defpackage.vtx) akzxVarM3.b;
        j$.util.Objects.requireNonNull(vziVar);
        vtxVar27.c = vziVar;
        vtxVar27.b |= 1;
        boolean zG2 = g(vziVar);
        akzxVarM3.u();
        defpackage.vtx vtxVar28 = (defpackage.vtx) akzxVarM3.b;
        vtxVar28.b |= 32;
        vtxVar28.h = zG2;
        switch (vbwVarB.ordinal()) {
            case 0:
            case 2:
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 37:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                return this.b.e(vziVar, false);
            case 1:
                java.lang.String string13 = this.a.getString(2132020998);
                akzxVarM3.u();
                defpackage.vtx vtxVar29 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string13);
                vtxVar29.b |= 2;
                vtxVar29.d = string13;
                java.lang.String string14 = f(2132020997).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar30 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string14);
                vtxVar30.b |= 4;
                vtxVar30.e = string14;
                defpackage.vtw vtwVarE4 = e();
                akzxVarM3.u();
                defpackage.vtx vtxVar31 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarE4);
                vtxVar31.f = vtwVarE4;
                vtxVar31.b |= 8;
                defpackage.vtw vtwVarC4 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar32 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC4);
                vtxVar32.g = vtwVarC4;
                vtxVar32.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 20:
            case 21:
            case 23:
            case 34:
            case 36:
            case 39:
                java.lang.String string15 = this.a.getString(2132021018);
                akzxVarM3.u();
                defpackage.vtx vtxVar33 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string15);
                vtxVar33.b |= 2;
                vtxVar33.d = string15;
                java.lang.String string16 = f(2132021017).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar34 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string16);
                vtxVar34.b |= 4;
                vtxVar34.e = string16;
                defpackage.vtw vtwVarE5 = e();
                akzxVarM3.u();
                defpackage.vtx vtxVar35 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarE5);
                vtxVar35.f = vtwVarE5;
                vtxVar35.b |= 8;
                defpackage.vtw vtwVarC5 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar36 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC5);
                vtxVar36.g = vtwVarC5;
                vtxVar36.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 22:
                java.lang.String string17 = this.a.getString(2132021016);
                akzxVarM3.u();
                defpackage.vtx vtxVar37 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string17);
                vtxVar37.b |= 2;
                vtxVar37.d = string17;
                java.lang.String string18 = f(2132021015).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar38 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string18);
                vtxVar38.b |= 4;
                vtxVar38.e = string18;
                defpackage.vtw vtwVarE6 = e();
                akzxVarM3.u();
                defpackage.vtx vtxVar39 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarE6);
                vtxVar39.f = vtwVarE6;
                vtxVar39.b |= 8;
                defpackage.vtw vtwVarC6 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar40 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC6);
                vtxVar40.g = vtwVarC6;
                vtxVar40.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 24:
            case 25:
            case 35:
                java.lang.String string19 = this.a.getString(2132021020);
                akzxVarM3.u();
                defpackage.vtx vtxVar41 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string19);
                vtxVar41.b |= 2;
                vtxVar41.d = string19;
                java.lang.String string20 = f(2132021019).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar42 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string20);
                vtxVar42.b |= 4;
                vtxVar42.e = string20;
                defpackage.vtw vtwVarE7 = e();
                akzxVarM3.u();
                defpackage.vtx vtxVar43 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarE7);
                vtxVar43.f = vtwVarE7;
                vtxVar43.b |= 8;
                defpackage.vtw vtwVarC7 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar44 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC7);
                vtxVar44.g = vtwVarC7;
                vtxVar44.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 26:
            case 33:
            case 38:
                java.lang.String string21 = this.a.getString(2132020980);
                akzxVarM3.u();
                defpackage.vtx vtxVar45 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string21);
                vtxVar45.b |= 2;
                vtxVar45.d = string21;
                java.lang.String string22 = f(2132020979).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar46 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string22);
                vtxVar46.b |= 4;
                vtxVar46.e = string22;
                defpackage.vtw vtwVarD6 = d();
                akzxVarM3.u();
                defpackage.vtx vtxVar47 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarD6);
                vtxVar47.f = vtwVarD6;
                vtxVar47.b |= 8;
                defpackage.vtw vtwVarC8 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar48 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC8);
                vtxVar48.g = vtwVarC8;
                vtxVar48.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 27:
                java.lang.String string23 = this.a.getString(2132021004);
                akzxVarM3.u();
                defpackage.vtx vtxVar49 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string23);
                vtxVar49.b |= 2;
                vtxVar49.d = string23;
                java.lang.String string24 = f(2132021003).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar50 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string24);
                vtxVar50.b |= 4;
                vtxVar50.e = string24;
                defpackage.vtw vtwVarD7 = d();
                akzxVarM3.u();
                defpackage.vtx vtxVar51 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarD7);
                vtxVar51.f = vtwVarD7;
                vtxVar51.b |= 8;
                defpackage.vtw vtwVarC9 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar52 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC9);
                vtxVar52.g = vtwVarC9;
                vtxVar52.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 28:
                java.lang.String string25 = this.a.getString(2132020986);
                akzxVarM3.u();
                defpackage.vtx vtxVar53 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string25);
                vtxVar53.b |= 2;
                vtxVar53.d = string25;
                java.lang.String string26 = f(2132020985).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar54 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string26);
                vtxVar54.b |= 4;
                vtxVar54.e = string26;
                defpackage.vtw vtwVarD8 = d();
                akzxVarM3.u();
                defpackage.vtx vtxVar55 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarD8);
                vtxVar55.f = vtwVarD8;
                vtxVar55.b |= 8;
                defpackage.vtw vtwVarC10 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar56 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC10);
                vtxVar56.g = vtwVarC10;
                vtxVar56.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 29:
                java.lang.String string27 = this.a.getString(2132020988);
                akzxVarM3.u();
                defpackage.vtx vtxVar57 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string27);
                vtxVar57.b |= 2;
                vtxVar57.d = string27;
                java.lang.String string28 = f(2132020987).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar58 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string28);
                vtxVar58.b |= 4;
                vtxVar58.e = string28;
                defpackage.vtw vtwVarC11 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar59 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC11);
                vtxVar59.f = vtwVarC11;
                vtxVar59.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 30:
                java.lang.String string29 = this.a.getString(2132020992);
                akzxVarM3.u();
                defpackage.vtx vtxVar60 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string29);
                vtxVar60.b |= 2;
                vtxVar60.d = string29;
                java.lang.String string30 = f(2132020991).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar61 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string30);
                vtxVar61.b |= 4;
                vtxVar61.e = string30;
                defpackage.vtw vtwVarC12 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar62 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC12);
                vtxVar62.f = vtwVarC12;
                vtxVar62.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 31:
                java.lang.String string31 = this.a.getString(2132020990);
                akzxVarM3.u();
                defpackage.vtx vtxVar63 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string31);
                vtxVar63.b |= 2;
                vtxVar63.d = string31;
                java.lang.String string32 = f(2132020989).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar64 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string32);
                vtxVar64.b |= 4;
                vtxVar64.e = string32;
                defpackage.vtw vtwVarC13 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar65 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC13);
                vtxVar65.f = vtwVarC13;
                vtxVar65.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 32:
                java.lang.String string33 = this.a.getString(2132021008);
                akzxVarM3.u();
                defpackage.vtx vtxVar66 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string33);
                vtxVar66.b |= 2;
                vtxVar66.d = string33;
                java.lang.String string34 = f(2132021007).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar67 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string34);
                vtxVar67.b |= 4;
                vtxVar67.e = string34;
                defpackage.vtw vtwVarC14 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar68 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC14);
                vtxVar68.f = vtwVarC14;
                vtxVar68.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 47:
                java.lang.String string35 = this.a.getString(2132021012);
                akzxVarM3.u();
                defpackage.vtx vtxVar69 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string35);
                vtxVar69.b |= 2;
                vtxVar69.d = string35;
                java.lang.String string36 = f(2132021011).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar70 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string36);
                vtxVar70.b |= 4;
                vtxVar70.e = string36;
                defpackage.vtw vtwVarE8 = e();
                akzxVarM3.u();
                defpackage.vtx vtxVar71 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarE8);
                vtxVar71.f = vtwVarE8;
                vtxVar71.b |= 8;
                defpackage.vtw vtwVarC15 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar72 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC15);
                vtxVar72.g = vtwVarC15;
                vtxVar72.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 48:
                java.lang.String string37 = this.a.getString(2132020996);
                akzxVarM3.u();
                defpackage.vtx vtxVar73 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string37);
                vtxVar73.b |= 2;
                vtxVar73.d = string37;
                java.lang.String string38 = f(2132020995).toString();
                akzxVarM3.u();
                defpackage.vtx vtxVar74 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string38);
                vtxVar74.b |= 4;
                vtxVar74.e = string38;
                defpackage.vtw vtwVarE9 = e();
                akzxVarM3.u();
                defpackage.vtx vtxVar75 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarE9);
                vtxVar75.f = vtwVarE9;
                vtxVar75.b |= 8;
                defpackage.vtw vtwVarC16 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar76 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC16);
                vtxVar76.g = vtwVarC16;
                vtxVar76.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    @Override // defpackage.vch
    public final j$.util.Optional b(vzi vziVar) {
        return a(vziVar);
    }
}
