package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vjs implements defpackage.vch {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/OmtpErrorModelBuilder");
    private final android.content.Context b;
    private final defpackage.vfi c;
    private final aoin d;

    public vjs(android.content.Context context, defpackage.vfi vfiVar, aoin aoinVar) {
        this.b = context;
        this.c = vfiVar;
        this.d = aoinVar;
    }

    private final defpackage.vtw f() {
        akzx akzxVarM = defpackage.vtw.a.m();
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        vtwVar.c = 2;
        vtwVar.b |= 1;
        java.lang.String string = this.b.getString(2132020843);
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar2.b |= 2;
        vtwVar2.d = string;
        return (defpackage.vtw) akzxVarM.p();
    }

    @Override // defpackage.vch
    public final j$.util.Optional a(vzi vziVar) {
        return e(vziVar, false);
    }

    @Override // defpackage.vch
    public final j$.util.Optional b(vzi vziVar) {
        return e(vziVar, true);
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

    public final j$.util.Optional e(vzi vziVar, boolean z) {
        defpackage.vbw vbwVarB;
        defpackage.vbw vbwVarB2;
        defpackage.vtw vtwVar;
        if (vziVar.h == 3) {
            akzx akzxVarM = defpackage.vtx.a.m();
            akzxVarM.u();
            defpackage.vtx vtxVar = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar.c = vziVar;
            vtxVar.b |= 1;
            android.content.Context context = this.b;
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
            defpackage.vtw vtwVarC = c();
            akzxVarM.u();
            defpackage.vtx vtxVar4 = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(vtwVarC);
            vtxVar4.f = vtwVarC;
            vtxVar4.b |= 8;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
        }
        if ((vziVar.b & 16) == 0) {
            if (vziVar.o) {
                akzx akzxVarM2 = defpackage.vtx.a.m();
                akzxVarM2.u();
                defpackage.vtx vtxVar5 = (defpackage.vtx) akzxVarM2.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar5.c = vziVar;
                vtxVar5.b |= 1;
                android.content.Context context2 = this.b;
                java.lang.String string3 = context2.getString(2132020921);
                akzxVarM2.u();
                defpackage.vtx vtxVar6 = (defpackage.vtx) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string3);
                vtxVar6.b |= 2;
                vtxVar6.d = string3;
                java.lang.String string4 = context2.getString(2132020920);
                akzxVarM2.u();
                defpackage.vtx vtxVar7 = (defpackage.vtx) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string4);
                vtxVar7.b |= 4;
                vtxVar7.e = string4;
                akzxVarM2.u();
                defpackage.vtx vtxVar8 = (defpackage.vtx) akzxVarM2.b;
                vtxVar8.b |= 32;
                vtxVar8.h = false;
                defpackage.vtw vtwVarF = f();
                akzxVarM2.u();
                defpackage.vtx vtxVar9 = (defpackage.vtx) akzxVarM2.b;
                j$.util.Objects.requireNonNull(vtwVarF);
                vtxVar9.f = vtwVarF;
                vtxVar9.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
            }
            if (!((java.lang.Boolean) this.d.a()).booleanValue() || vziVar.i != 4) {
                return j$.util.Optional.empty();
            }
            akzx akzxVarM3 = defpackage.vtx.a.m();
            akzxVarM3.u();
            defpackage.vtx vtxVar10 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar10.c = vziVar;
            vtxVar10.b |= 1;
            android.content.Context context3 = this.b;
            java.lang.String string5 = context3.getString(2132020896);
            akzxVarM3.u();
            defpackage.vtx vtxVar11 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(string5);
            vtxVar11.b |= 2;
            vtxVar11.d = string5;
            java.lang.String string6 = context3.getString(2132020895);
            akzxVarM3.u();
            defpackage.vtx vtxVar12 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(string6);
            vtxVar12.b |= 4;
            vtxVar12.e = string6;
            defpackage.vtw vtwVarC2 = c();
            akzxVarM3.u();
            defpackage.vtx vtxVar13 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(vtwVarC2);
            vtxVar13.f = vtwVarC2;
            vtxVar13.b |= 8;
            defpackage.vtw vtwVarD = d();
            akzxVarM3.u();
            defpackage.vtx vtxVar14 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(vtwVarD);
            vtxVar14.g = vtwVarD;
            vtxVar14.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
        }
        vcp vcpVar = vziVar.g;
        if (vcpVar == null) {
            vcpVar = vcp.a;
        }
        if (vcpVar.b == 1) {
            return this.c.a(vziVar);
        }
        aimw aimwVarL = a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/OmtpErrorModelBuilder", "createInternal", 93, "OmtpErrorModelBuilder.java");
        vcp vcpVar2 = vziVar.g;
        if (vcpVar2 == null) {
            vcpVar2 = vcp.a;
        }
        if (vcpVar2.b == 3) {
            vbwVarB = defpackage.vbw.b(((java.lang.Integer) vcpVar2.c).intValue());
            if (vbwVarB == null) {
                vbwVarB = defpackage.vbw.UNRECOGNIZED;
            }
        } else {
            vbwVarB = defpackage.vbw.OMTP_UNSPECIFIED;
        }
        aimwVarL.w("VVM OMTP failure reason: %d", vbwVarB.a());
        vcp vcpVar3 = vziVar.g;
        if (vcpVar3 == null) {
            vcpVar3 = vcp.a;
        }
        if (vcpVar3.b == 3) {
            vbwVarB2 = defpackage.vbw.b(((java.lang.Integer) vcpVar3.c).intValue());
            if (vbwVarB2 == null) {
                vbwVarB2 = defpackage.vbw.UNRECOGNIZED;
            }
        } else {
            vbwVarB2 = defpackage.vbw.OMTP_UNSPECIFIED;
        }
        switch (vbwVarB2.ordinal()) {
            case 0:
            case 53:
                if (!vziVar.o) {
                    return j$.util.Optional.empty();
                }
                akzx akzxVarM4 = defpackage.vtx.a.m();
                akzxVarM4.u();
                defpackage.vtx vtxVar15 = (defpackage.vtx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar15.c = vziVar;
                vtxVar15.b |= 1;
                android.content.Context context4 = this.b;
                java.lang.String string7 = context4.getString(2132020921);
                akzxVarM4.u();
                defpackage.vtx vtxVar16 = (defpackage.vtx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(string7);
                vtxVar16.b |= 2;
                vtxVar16.d = string7;
                java.lang.String string8 = context4.getString(2132020920);
                akzxVarM4.u();
                defpackage.vtx vtxVar17 = (defpackage.vtx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(string8);
                vtxVar17.b |= 4;
                vtxVar17.e = string8;
                akzxVarM4.u();
                defpackage.vtx vtxVar18 = (defpackage.vtx) akzxVarM4.b;
                vtxVar18.b |= 32;
                vtxVar18.h = false;
                defpackage.vtw vtwVarF2 = f();
                akzxVarM4.u();
                defpackage.vtx vtxVar19 = (defpackage.vtx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(vtwVarF2);
                vtxVar19.f = vtwVarF2;
                vtxVar19.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM4.p());
            case 1:
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
            case 47:
            case 48:
            case 49:
                akzx akzxVarM5 = defpackage.vtx.a.m();
                akzxVarM5.u();
                defpackage.vtx vtxVar20 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar20.c = vziVar;
                vtxVar20.b |= 1;
                android.content.Context context5 = this.b;
                java.lang.String string9 = context5.getString(2132020891);
                akzxVarM5.u();
                defpackage.vtx vtxVar21 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string9);
                vtxVar21.b |= 2;
                vtxVar21.d = string9;
                java.lang.String string10 = context5.getString(2132020890);
                akzxVarM5.u();
                defpackage.vtx vtxVar22 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string10);
                vtxVar22.b |= 4;
                vtxVar22.e = string10;
                defpackage.vtw vtwVarC3 = c();
                akzxVarM5.u();
                defpackage.vtx vtxVar23 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(vtwVarC3);
                vtxVar23.f = vtwVarC3;
                vtxVar23.b |= 8;
                defpackage.vtw vtwVarD2 = d();
                akzxVarM5.u();
                defpackage.vtx vtxVar24 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(vtwVarD2);
                vtxVar24.g = vtwVarD2;
                vtxVar24.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM5.p());
            case 19:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                akzx akzxVarM6 = defpackage.vtx.a.m();
                akzxVarM6.u();
                defpackage.vtx vtxVar25 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar25.c = vziVar;
                vtxVar25.b |= 1;
                android.content.Context context6 = this.b;
                java.lang.String string11 = context6.getString(2132020893);
                akzxVarM6.u();
                defpackage.vtx vtxVar26 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(string11);
                vtxVar26.b |= 2;
                vtxVar26.d = string11;
                java.lang.String string12 = context6.getString(2132020892);
                akzxVarM6.u();
                defpackage.vtx vtxVar27 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(string12);
                vtxVar27.b |= 4;
                vtxVar27.e = string12;
                defpackage.vtw vtwVarC4 = c();
                akzxVarM6.u();
                defpackage.vtx vtxVar28 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vtwVarC4);
                vtxVar28.f = vtwVarC4;
                vtxVar28.b |= 8;
                defpackage.vtw vtwVarD3 = d();
                akzxVarM6.u();
                defpackage.vtx vtxVar29 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vtwVarD3);
                vtxVar29.g = vtwVarD3;
                vtxVar29.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM6.p());
            case 20:
                akzx akzxVarM7 = defpackage.vtx.a.m();
                akzxVarM7.u();
                defpackage.vtx vtxVar30 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar30.c = vziVar;
                vtxVar30.b |= 1;
                android.content.Context context7 = this.b;
                java.lang.String string13 = context7.getString(2132020909);
                akzxVarM7.u();
                defpackage.vtx vtxVar31 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(string13);
                vtxVar31.b |= 2;
                vtxVar31.d = string13;
                java.lang.String string14 = context7.getString(2132020907);
                akzxVarM7.u();
                defpackage.vtx vtxVar32 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(string14);
                vtxVar32.b |= 4;
                vtxVar32.e = string14;
                defpackage.vtw vtwVarC5 = c();
                akzxVarM7.u();
                defpackage.vtx vtxVar33 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(vtwVarC5);
                vtxVar33.f = vtwVarC5;
                vtxVar33.b |= 8;
                defpackage.vtw vtwVarD4 = d();
                akzxVarM7.u();
                defpackage.vtx vtxVar34 = (defpackage.vtx) akzxVarM7.b;
                j$.util.Objects.requireNonNull(vtwVarD4);
                vtxVar34.g = vtwVarD4;
                vtxVar34.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM7.p());
            case 21:
                akzx akzxVarM8 = defpackage.vtx.a.m();
                akzxVarM8.u();
                defpackage.vtx vtxVar35 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar35.c = vziVar;
                vtxVar35.b |= 1;
                android.content.Context context8 = this.b;
                java.lang.String string15 = context8.getString(2132020909);
                akzxVarM8.u();
                defpackage.vtx vtxVar36 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(string15);
                vtxVar36.b |= 2;
                vtxVar36.d = string15;
                java.lang.String string16 = context8.getString(2132020908);
                akzxVarM8.u();
                defpackage.vtx vtxVar37 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(string16);
                vtxVar37.b |= 4;
                vtxVar37.e = string16;
                defpackage.vtw vtwVarC6 = c();
                akzxVarM8.u();
                defpackage.vtx vtxVar38 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(vtwVarC6);
                vtxVar38.f = vtwVarC6;
                vtxVar38.b |= 8;
                defpackage.vtw vtwVarD5 = d();
                akzxVarM8.u();
                defpackage.vtx vtxVar39 = (defpackage.vtx) akzxVarM8.b;
                j$.util.Objects.requireNonNull(vtwVarD5);
                vtxVar39.g = vtwVarD5;
                vtxVar39.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM8.p());
            case 22:
                akzx akzxVarM9 = defpackage.vtx.a.m();
                akzxVarM9.u();
                defpackage.vtx vtxVar40 = (defpackage.vtx) akzxVarM9.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar40.c = vziVar;
                vtxVar40.b |= 1;
                android.content.Context context9 = this.b;
                java.lang.String string17 = context9.getString(2132020923);
                akzxVarM9.u();
                defpackage.vtx vtxVar41 = (defpackage.vtx) akzxVarM9.b;
                j$.util.Objects.requireNonNull(string17);
                vtxVar41.b |= 2;
                vtxVar41.d = string17;
                java.lang.String string18 = context9.getString(2132020922);
                akzxVarM9.u();
                defpackage.vtx vtxVar42 = (defpackage.vtx) akzxVarM9.b;
                j$.util.Objects.requireNonNull(string18);
                vtxVar42.b |= 4;
                vtxVar42.e = string18;
                defpackage.vtw vtwVarC7 = c();
                akzxVarM9.u();
                defpackage.vtx vtxVar43 = (defpackage.vtx) akzxVarM9.b;
                j$.util.Objects.requireNonNull(vtwVarC7);
                vtxVar43.f = vtwVarC7;
                vtxVar43.b |= 8;
                defpackage.vtw vtwVarD6 = d();
                akzxVarM9.u();
                defpackage.vtx vtxVar44 = (defpackage.vtx) akzxVarM9.b;
                j$.util.Objects.requireNonNull(vtwVarD6);
                vtxVar44.g = vtwVarD6;
                vtxVar44.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM9.p());
            case 23:
            case 33:
            case 34:
            case 36:
            case 38:
            case 39:
            case 52:
                akzx akzxVarM10 = defpackage.vtx.a.m();
                akzxVarM10.u();
                defpackage.vtx vtxVar45 = (defpackage.vtx) akzxVarM10.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar45.c = vziVar;
                vtxVar45.b |= 1;
                android.content.Context context10 = this.b;
                java.lang.String string19 = context10.getString(2132020925);
                akzxVarM10.u();
                defpackage.vtx vtxVar46 = (defpackage.vtx) akzxVarM10.b;
                j$.util.Objects.requireNonNull(string19);
                vtxVar46.b |= 2;
                vtxVar46.d = string19;
                java.lang.String string20 = context10.getString(2132020924);
                akzxVarM10.u();
                defpackage.vtx vtxVar47 = (defpackage.vtx) akzxVarM10.b;
                j$.util.Objects.requireNonNull(string20);
                vtxVar47.b |= 4;
                vtxVar47.e = string20;
                defpackage.vtw vtwVarC8 = c();
                akzxVarM10.u();
                defpackage.vtx vtxVar48 = (defpackage.vtx) akzxVarM10.b;
                j$.util.Objects.requireNonNull(vtwVarC8);
                vtxVar48.f = vtwVarC8;
                vtxVar48.b |= 8;
                defpackage.vtw vtwVarD7 = d();
                akzxVarM10.u();
                defpackage.vtx vtxVar49 = (defpackage.vtx) akzxVarM10.b;
                j$.util.Objects.requireNonNull(vtwVarD7);
                vtxVar49.g = vtwVarD7;
                vtxVar49.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM10.p());
            case 24:
            case 25:
            case 35:
            case 37:
                akzx akzxVarM11 = defpackage.vtx.a.m();
                akzxVarM11.u();
                defpackage.vtx vtxVar50 = (defpackage.vtx) akzxVarM11.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar50.c = vziVar;
                vtxVar50.b |= 1;
                android.content.Context context11 = this.b;
                java.lang.String string21 = context11.getString(2132020896);
                akzxVarM11.u();
                defpackage.vtx vtxVar51 = (defpackage.vtx) akzxVarM11.b;
                j$.util.Objects.requireNonNull(string21);
                vtxVar51.b |= 2;
                vtxVar51.d = string21;
                java.lang.String string22 = context11.getString(2132020895);
                akzxVarM11.u();
                defpackage.vtx vtxVar52 = (defpackage.vtx) akzxVarM11.b;
                j$.util.Objects.requireNonNull(string22);
                vtxVar52.b |= 4;
                vtxVar52.e = string22;
                defpackage.vtw vtwVarC9 = c();
                akzxVarM11.u();
                defpackage.vtx vtxVar53 = (defpackage.vtx) akzxVarM11.b;
                j$.util.Objects.requireNonNull(vtwVarC9);
                vtxVar53.f = vtwVarC9;
                vtxVar53.b |= 8;
                defpackage.vtw vtwVarD8 = d();
                akzxVarM11.u();
                defpackage.vtx vtxVar54 = (defpackage.vtx) akzxVarM11.b;
                j$.util.Objects.requireNonNull(vtwVarD8);
                vtxVar54.g = vtwVarD8;
                vtxVar54.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM11.p());
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                akzx akzxVarM12 = defpackage.vtx.a.m();
                akzxVarM12.u();
                defpackage.vtx vtxVar55 = (defpackage.vtx) akzxVarM12.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar55.c = vziVar;
                vtxVar55.b |= 1;
                android.content.Context context12 = this.b;
                java.lang.String string23 = context12.getString(2132020891);
                akzxVarM12.u();
                defpackage.vtx vtxVar56 = (defpackage.vtx) akzxVarM12.b;
                j$.util.Objects.requireNonNull(string23);
                vtxVar56.b |= 2;
                vtxVar56.d = string23;
                java.lang.String string24 = context12.getString(2132019815);
                akzxVarM12.u();
                defpackage.vtx vtxVar57 = (defpackage.vtx) akzxVarM12.b;
                j$.util.Objects.requireNonNull(string24);
                vtxVar57.b |= 4;
                vtxVar57.e = string24;
                defpackage.vtw vtwVarC10 = c();
                akzxVarM12.u();
                defpackage.vtx vtxVar58 = (defpackage.vtx) akzxVarM12.b;
                j$.util.Objects.requireNonNull(vtwVarC10);
                vtxVar58.f = vtwVarC10;
                vtxVar58.b |= 8;
                defpackage.vtw vtwVarD9 = d();
                akzxVarM12.u();
                defpackage.vtx vtxVar59 = (defpackage.vtx) akzxVarM12.b;
                j$.util.Objects.requireNonNull(vtwVarD9);
                vtxVar59.g = vtwVarD9;
                vtxVar59.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM12.p());
            case 45:
                akzx akzxVarM13 = defpackage.vtx.a.m();
                akzxVarM13.u();
                defpackage.vtx vtxVar60 = (defpackage.vtx) akzxVarM13.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar60.c = vziVar;
                vtxVar60.b |= 1;
                android.content.Context context13 = this.b;
                java.lang.String string25 = context13.getString(2132020902);
                akzxVarM13.u();
                defpackage.vtx vtxVar61 = (defpackage.vtx) akzxVarM13.b;
                j$.util.Objects.requireNonNull(string25);
                vtxVar61.b |= 2;
                vtxVar61.d = string25;
                java.lang.String string26 = context13.getString(2132020901);
                akzxVarM13.u();
                defpackage.vtx vtxVar62 = (defpackage.vtx) akzxVarM13.b;
                j$.util.Objects.requireNonNull(string26);
                vtxVar62.b |= 4;
                vtxVar62.e = string26;
                defpackage.vtw vtwVarC11 = c();
                akzxVarM13.u();
                defpackage.vtx vtxVar63 = (defpackage.vtx) akzxVarM13.b;
                j$.util.Objects.requireNonNull(vtwVarC11);
                vtxVar63.f = vtwVarC11;
                vtxVar63.b |= 8;
                defpackage.vtw vtwVarD10 = d();
                akzxVarM13.u();
                defpackage.vtx vtxVar64 = (defpackage.vtx) akzxVarM13.b;
                j$.util.Objects.requireNonNull(vtwVarD10);
                vtxVar64.g = vtwVarD10;
                vtxVar64.b |= 16;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM13.p());
            case 46:
                akzx akzxVarM14 = defpackage.vtx.a.m();
                akzxVarM14.u();
                defpackage.vtx vtxVar65 = (defpackage.vtx) akzxVarM14.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar65.c = vziVar;
                vtxVar65.b |= 1;
                android.content.Context context14 = this.b;
                java.lang.String string27 = context14.getString(2132020906);
                akzxVarM14.u();
                defpackage.vtx vtxVar66 = (defpackage.vtx) akzxVarM14.b;
                j$.util.Objects.requireNonNull(string27);
                vtxVar66.b |= 2;
                vtxVar66.d = string27;
                java.lang.String string28 = context14.getString(2132020905);
                akzxVarM14.u();
                defpackage.vtx vtxVar67 = (defpackage.vtx) akzxVarM14.b;
                j$.util.Objects.requireNonNull(string28);
                vtxVar67.b |= 4;
                vtxVar67.e = string28;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM14.p());
            case 50:
                akzx akzxVarM15 = defpackage.vtx.a.m();
                akzxVarM15.u();
                defpackage.vtx vtxVar68 = (defpackage.vtx) akzxVarM15.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar68.c = vziVar;
                vtxVar68.b |= 1;
                android.content.Context context15 = this.b;
                java.lang.String string29 = context15.getString(2132020921);
                akzxVarM15.u();
                defpackage.vtx vtxVar69 = (defpackage.vtx) akzxVarM15.b;
                j$.util.Objects.requireNonNull(string29);
                vtxVar69.b |= 2;
                vtxVar69.d = string29;
                java.lang.String string30 = context15.getString(2132020920);
                akzxVarM15.u();
                defpackage.vtx vtxVar70 = (defpackage.vtx) akzxVarM15.b;
                j$.util.Objects.requireNonNull(string30);
                vtxVar70.b |= 4;
                vtxVar70.e = string30;
                akzxVarM15.u();
                defpackage.vtx vtxVar71 = (defpackage.vtx) akzxVarM15.b;
                vtxVar71.b |= 32;
                vtxVar71.h = false;
                defpackage.vtw vtwVarF3 = f();
                akzxVarM15.u();
                defpackage.vtx vtxVar72 = (defpackage.vtx) akzxVarM15.b;
                j$.util.Objects.requireNonNull(vtwVarF3);
                vtxVar72.f = vtwVarF3;
                vtxVar72.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM15.p());
            case 51:
                akzx akzxVarM16 = defpackage.vtx.a.m();
                akzxVarM16.u();
                defpackage.vtx vtxVar73 = (defpackage.vtx) akzxVarM16.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar73.c = vziVar;
                vtxVar73.b |= 1;
                android.content.Context context16 = this.b;
                java.lang.String string31 = context16.getString(2132017301);
                akzxVarM16.u();
                defpackage.vtx vtxVar74 = (defpackage.vtx) akzxVarM16.b;
                j$.util.Objects.requireNonNull(string31);
                vtxVar74.b |= 2;
                vtxVar74.d = string31;
                akzxVarM16.u();
                defpackage.vtx vtxVar75 = (defpackage.vtx) akzxVarM16.b;
                vtxVar75.b |= 32;
                vtxVar75.h = true;
                java.lang.String string32 = context16.getString(2132017299);
                akzxVarM16.u();
                defpackage.vtx vtxVar76 = (defpackage.vtx) akzxVarM16.b;
                j$.util.Objects.requireNonNull(string32);
                vtxVar76.b |= 4;
                vtxVar76.e = string32;
                if (z) {
                    akzx akzxVarM17 = defpackage.vtw.a.m();
                    akzxVarM17.u();
                    defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM17.b;
                    vtwVar2.c = 6;
                    vtwVar2.b |= 1;
                    java.lang.String string33 = context16.getString(2132017298);
                    akzxVarM17.u();
                    defpackage.vtw vtwVar3 = (defpackage.vtw) akzxVarM17.b;
                    j$.util.Objects.requireNonNull(string33);
                    vtwVar3.b |= 2;
                    vtwVar3.d = string33;
                    vtwVar = (defpackage.vtw) akzxVarM17.p();
                } else {
                    akzx akzxVarM18 = defpackage.vtw.a.m();
                    akzxVarM18.u();
                    defpackage.vtw vtwVar4 = (defpackage.vtw) akzxVarM18.b;
                    vtwVar4.c = 7;
                    vtwVar4.b |= 1;
                    java.lang.String string34 = context16.getString(2132017300);
                    akzxVarM18.u();
                    defpackage.vtw vtwVar5 = (defpackage.vtw) akzxVarM18.b;
                    j$.util.Objects.requireNonNull(string34);
                    vtwVar5.b |= 2;
                    vtwVar5.d = string34;
                    vtwVar = (defpackage.vtw) akzxVarM18.p();
                }
                akzxVarM16.u();
                defpackage.vtx vtxVar77 = (defpackage.vtx) akzxVarM16.b;
                j$.util.Objects.requireNonNull(vtwVar);
                vtxVar77.f = vtwVar;
                vtxVar77.b |= 8;
                return j$.util.Optional.of((defpackage.vtx) akzxVarM16.p());
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }
}
