package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vfi implements defpackage.vch {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/GeneralErrorModelBuilder");
    private final android.content.Context b;

    public vfi(android.content.Context context) {
        this.b = context;
    }

    @Override // defpackage.vch
    public final j$.util.Optional a(vzi vziVar) {
        defpackage.vbs vbsVarB;
        defpackage.vbs vbsVarB2;
        defpackage.vbs vbsVarB3;
        aimw aimwVarL = a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/GeneralErrorModelBuilder", "create", 41, "GeneralErrorModelBuilder.java");
        vcp vcpVar = vziVar.g;
        if (vcpVar == null) {
            vcpVar = vcp.a;
        }
        if (vcpVar.b == 1) {
            vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar.c).intValue());
            if (vbsVarB == null) {
                vbsVarB = defpackage.vbs.UNRECOGNIZED;
            }
        } else {
            vbsVarB = defpackage.vbs.UNSPECIFIED;
        }
        aimwVarL.w("VVM general failure reason: %d", vbsVarB.a());
        vcp vcpVar2 = vziVar.g;
        if (vcpVar2 == null) {
            vcpVar2 = vcp.a;
        }
        if (vcpVar2.b == 1) {
            vbsVarB2 = defpackage.vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
            if (vbsVarB2 == null) {
                vbsVarB2 = defpackage.vbs.UNRECOGNIZED;
            }
        } else {
            vbsVarB2 = defpackage.vbs.UNSPECIFIED;
        }
        switch (vbsVarB2.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
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
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                akzx akzxVarM = defpackage.vtx.a.m();
                akzxVarM.u();
                defpackage.vtx vtxVar = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar.c = vziVar;
                vtxVar.b |= 1;
                android.content.Context context = this.b;
                java.lang.String string = context.getString(2132020919);
                akzxVarM.u();
                defpackage.vtx vtxVar2 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                vtxVar2.b |= 2;
                vtxVar2.d = string;
                java.lang.String string2 = context.getString(2132020918);
                akzxVarM.u();
                defpackage.vtx vtxVar3 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                vtxVar3.b |= 4;
                vtxVar3.e = string2;
                defpackage.vtw vtwVarC = c();
                akzxVarM.u();
                defpackage.vtx vtxVar4 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(vtwVarC);
                vtxVar4.f = vtwVarC;
                vtxVar4.b |= 8;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    akzx akzxVarM2 = defpackage.vtw.a.m();
                    akzxVarM2.u();
                    defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM2.b;
                    vtwVar.c = 12;
                    vtwVar.b |= 1;
                    java.lang.String string3 = context.getString(2132020844);
                    akzxVarM2.u();
                    defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string3);
                    vtwVar2.b |= 2;
                    vtwVar2.d = string3;
                    defpackage.vtw vtwVar3 = (defpackage.vtw) akzxVarM2.p();
                    akzxVarM.u();
                    defpackage.vtx vtxVar5 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(vtwVar3);
                    vtxVar5.g = vtwVar3;
                    vtxVar5.b |= 16;
                }
                return j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                akzx akzxVarM3 = defpackage.vtx.a.m();
                akzxVarM3.u();
                defpackage.vtx vtxVar6 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar6.c = vziVar;
                vtxVar6.b |= 1;
                android.content.Context context2 = this.b;
                java.lang.String string4 = context2.getString(2132020909);
                akzxVarM3.u();
                defpackage.vtx vtxVar7 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string4);
                vtxVar7.b |= 2;
                vtxVar7.d = string4;
                java.lang.String string5 = context2.getString(2132020907);
                akzxVarM3.u();
                defpackage.vtx vtxVar8 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string5);
                vtxVar8.b |= 4;
                vtxVar8.e = string5;
                defpackage.vtw vtwVarC2 = c();
                akzxVarM3.u();
                defpackage.vtx vtxVar9 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarC2);
                vtxVar9.f = vtwVarC2;
                vtxVar9.b |= 8;
                defpackage.vtw vtwVarD = d();
                akzxVarM3.u();
                defpackage.vtx vtxVar10 = (defpackage.vtx) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vtwVarD);
                vtxVar10.g = vtwVarD;
                vtxVar10.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
            case 21:
            case 25:
                akzx akzxVarM4 = defpackage.vtx.a.m();
                akzxVarM4.u();
                defpackage.vtx vtxVar11 = (defpackage.vtx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar11.c = vziVar;
                vtxVar11.b |= 1;
                android.content.Context context3 = this.b;
                java.lang.String string6 = context3.getString(2132020889);
                akzxVarM4.u();
                defpackage.vtx vtxVar12 = (defpackage.vtx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(string6);
                vtxVar12.b |= 2;
                vtxVar12.d = string6;
                java.lang.String string7 = context3.getString(2132020888);
                akzxVarM4.u();
                defpackage.vtx vtxVar13 = (defpackage.vtx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(string7);
                vtxVar13.b |= 4;
                vtxVar13.e = string7;
                defpackage.vtw vtwVarC3 = c();
                akzxVarM4.u();
                defpackage.vtx vtxVar14 = (defpackage.vtx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(vtwVarC3);
                vtxVar14.f = vtwVarC3;
                vtxVar14.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM4.p());
            case 22:
                akzx akzxVarM5 = defpackage.vtx.a.m();
                akzxVarM5.u();
                defpackage.vtx vtxVar15 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar15.c = vziVar;
                vtxVar15.b |= 1;
                android.content.Context context4 = this.b;
                java.lang.String string8 = context4.getString(2132020891);
                akzxVarM5.u();
                defpackage.vtx vtxVar16 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string8);
                vtxVar16.b |= 2;
                vtxVar16.d = string8;
                java.lang.String string9 = context4.getString(2132020890);
                akzxVarM5.u();
                defpackage.vtx vtxVar17 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string9);
                vtxVar17.b |= 4;
                vtxVar17.e = string9;
                defpackage.vtw vtwVarC4 = c();
                akzxVarM5.u();
                defpackage.vtx vtxVar18 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(vtwVarC4);
                vtxVar18.f = vtwVarC4;
                vtxVar18.b |= 8;
                defpackage.vtw vtwVarD2 = d();
                akzxVarM5.u();
                defpackage.vtx vtxVar19 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(vtwVarD2);
                vtxVar19.g = vtwVarD2;
                vtxVar19.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM5.p());
            case 23:
            case 24:
                vcp vcpVar3 = vziVar.g;
                if (vcpVar3 == null) {
                    vcpVar3 = vcp.a;
                }
                if (vcpVar3.b == 1) {
                    vbsVarB3 = defpackage.vbs.b(((java.lang.Integer) vcpVar3.c).intValue());
                    if (vbsVarB3 == null) {
                        vbsVarB3 = defpackage.vbs.UNRECOGNIZED;
                    }
                } else {
                    vbsVarB3 = defpackage.vbs.UNSPECIFIED;
                }
                int i = vbsVarB3 == defpackage.vbs.ACTIVATE_PROVISIONING_STATE_BLOCKED ? 2132017993 : 2132019815;
                akzx akzxVarM6 = defpackage.vtx.a.m();
                akzxVarM6.u();
                defpackage.vtx vtxVar20 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar20.c = vziVar;
                vtxVar20.b |= 1;
                android.content.Context context5 = this.b;
                java.lang.String string10 = context5.getString(2132020891);
                akzxVarM6.u();
                defpackage.vtx vtxVar21 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(string10);
                vtxVar21.b |= 2;
                vtxVar21.d = string10;
                java.lang.String string11 = context5.getString(i);
                akzxVarM6.u();
                defpackage.vtx vtxVar22 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(string11);
                vtxVar22.b |= 4;
                vtxVar22.e = string11;
                defpackage.vtw vtwVarC5 = c();
                akzxVarM6.u();
                defpackage.vtx vtxVar23 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vtwVarC5);
                vtxVar23.f = vtwVarC5;
                vtxVar23.b |= 8;
                defpackage.vtw vtwVarD3 = d();
                akzxVarM6.u();
                defpackage.vtx vtxVar24 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vtwVarD3);
                vtxVar24.g = vtwVarD3;
                vtxVar24.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM6.p());
            case 28:
                akzx akzxVarM7 = defpackage.vtx.a.m();
                akzxVarM7.u();
                defpackage.vtx vtxVar25 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar25.c = vziVar;
                vtxVar25.b |= 1;
                android.content.Context context6 = this.b;
                java.lang.String string12 = context6.getString(2132020909);
                akzxVarM7.u();
                defpackage.vtx vtxVar26 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(string12);
                vtxVar26.b |= 2;
                vtxVar26.d = string12;
                java.lang.String string13 = context6.getString(2132020908);
                akzxVarM7.u();
                defpackage.vtx vtxVar27 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(string13);
                vtxVar27.b |= 4;
                vtxVar27.e = string13;
                defpackage.vtw vtwVarC6 = c();
                akzxVarM7.u();
                defpackage.vtx vtxVar28 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(vtwVarC6);
                vtxVar28.f = vtwVarC6;
                vtxVar28.b |= 8;
                defpackage.vtw vtwVarD4 = d();
                akzxVarM7.u();
                defpackage.vtx vtxVar29 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(vtwVarD4);
                vtxVar29.g = vtwVarD4;
                vtxVar29.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM7.p());
            case 29:
                akzx akzxVarM8 = defpackage.vtx.a.m();
                akzxVarM8.u();
                defpackage.vtx vtxVar30 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar30.c = vziVar;
                vtxVar30.b |= 1;
                android.content.Context context7 = this.b;
                java.lang.String string14 = context7.getString(2132020893);
                akzxVarM8.u();
                defpackage.vtx vtxVar31 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(string14);
                vtxVar31.b |= 2;
                vtxVar31.d = string14;
                java.lang.String string15 = context7.getString(2132020892);
                akzxVarM8.u();
                defpackage.vtx vtxVar32 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(string15);
                vtxVar32.b |= 4;
                vtxVar32.e = string15;
                defpackage.vtw vtwVarC7 = c();
                akzxVarM8.u();
                defpackage.vtx vtxVar33 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(vtwVarC7);
                vtxVar33.f = vtwVarC7;
                vtxVar33.b |= 8;
                defpackage.vtw vtwVarD5 = d();
                akzxVarM8.u();
                defpackage.vtx vtxVar34 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(vtwVarD5);
                vtxVar34.g = vtwVarD5;
                vtxVar34.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM8.p());
            default:
                throw new java.lang.IllegalStateException("exhaustive switch");
        }
    }

    @Override // defpackage.vch
    public final j$.util.Optional b(vzi vziVar) {
        throw new java.lang.UnsupportedOperationException("general builder doesn't support requesting permission");
    }

    final defpackage.vtw c() {
        akzx akzxVarM = defpackage.vtw.a.m();
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        vtwVar.c = 3;
        vtwVar.b |= 1;
        java.lang.String string = this.b.getString(2132020839);
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar2.b |= 2;
        vtwVar2.d = string;
        return (defpackage.vtw) akzxVarM.p();
    }

    final defpackage.vtw d() {
        akzx akzxVarM = defpackage.vtw.a.m();
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        vtwVar.c = 5;
        vtwVar.b |= 1;
        java.lang.String string = this.b.getString(2132020841);
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar2.b |= 2;
        vtwVar2.d = string;
        return (defpackage.vtw) akzxVarM.p();
    }
}
