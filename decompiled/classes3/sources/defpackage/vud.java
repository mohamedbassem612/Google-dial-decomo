package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vud {
    private static final aimz b = aimz.i("com/android/dialer/voicemail/tab/impl/dataservice/impl/DefaultVoicemailMessageCreator");
    public final android.content.Context a;
    private final defpackage.vvb c;
    private final rlv d;

    public vud(android.content.Context context, defpackage.vvb vvbVar, rlv rlvVar) {
        this.a = context;
        this.c = vvbVar;
        this.d = rlvVar;
    }

    private static boolean b(vzi vziVar) {
        if (vziVar.j != 0 || vziVar.i != 0) {
            return true;
        }
        int i = vziVar.h;
        return (i == 0 || i == 3) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x021d  */
    /* JADX WARN: Code duplicated, block: B:42:0x022a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0232  */
    /* JADX WARN: Code duplicated, block: B:47:0x0249  */
    /* JADX WARN: Code duplicated, block: B:50:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0316  */
    /* JADX WARN: Code duplicated, block: B:57:0x0319  */
    /* JADX WARN: Code duplicated, block: B:58:0x0399 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x039b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0432  */
    /* JADX WARN: Code duplicated, block: B:63:0x0439  */
    /* JADX WARN: Code duplicated, block: B:64:0x04cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x0561 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0563  */
    /* JADX WARN: Code duplicated, block: B:68:0x05f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0691 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0693  */
    /* JADX WARN: Code duplicated, block: B:72:0x0729  */
    /* JADX WARN: Code duplicated, block: B:74:0x072c  */
    /* JADX WARN: Code duplicated, block: B:75:0x07c2  */
    public final j$.util.Optional a(vzi vziVar) {
        int i;
        vzi vziVar2;
        j$.util.Optional optionalEmpty;
        java.util.ArrayList arrayList;
        android.content.Context context;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        akzx akzxVarM;
        int i2;
        android.content.Context context2;
        int i3;
        int i4 = vziVar.h;
        if (i4 != 0) {
            if (i4 != 3 && vziVar.i == 0 && vziVar.j == 0) {
                akzx akzxVarM2 = defpackage.vtx.a.m();
                akzxVarM2.u();
                defpackage.vtx vtxVar = (defpackage.vtx) akzxVarM2.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar.c = vziVar;
                vtxVar.b |= 1;
                android.content.Context context3 = this.a;
                java.lang.String string4 = context3.getString(2132020887);
                akzxVarM2.u();
                defpackage.vtx vtxVar2 = (defpackage.vtx) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string4);
                vtxVar2.b |= 2;
                vtxVar2.d = string4;
                java.lang.String string5 = context3.getString(2132020886);
                akzxVarM2.u();
                defpackage.vtx vtxVar3 = (defpackage.vtx) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string5);
                vtxVar3.b |= 4;
                vtxVar3.e = string5;
                boolean zB = b(vziVar);
                akzxVarM2.u();
                defpackage.vtx vtxVar4 = (defpackage.vtx) akzxVarM2.b;
                vtxVar4.b |= 32;
                vtxVar4.h = zB;
                defpackage.vtw vtwVarA = this.c.a();
                akzxVarM2.u();
                defpackage.vtx vtxVar5 = (defpackage.vtx) akzxVarM2.b;
                j$.util.Objects.requireNonNull(vtwVarA);
                vtxVar5.f = vtwVarA;
                vtxVar5.b |= 8;
                optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
            } else if (vziVar.j == 1) {
                arrayList = new java.util.ArrayList();
                if (vziVar.h == 0) {
                    i2 = vziVar.i;
                    context2 = this.a;
                    if (i2 == 2) {
                        string3 = context2.getString(2132020913);
                        string2 = context2.getString(2132020911);
                    } else {
                        string3 = context2.getString(2132020913);
                        if (vziVar.n) {
                            string2 = context2.getString(2132020910);
                        } else {
                            string2 = context2.getString(2132020912);
                        }
                        defpackage.vvb vvbVar = this.c;
                        akzx akzxVarM3 = defpackage.vtw.a.m();
                        akzxVarM3.u();
                        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM3.b;
                        vtwVar.c = 4;
                        vtwVar.b |= 1;
                        java.lang.String string6 = vvbVar.b.getString(2132020845);
                        akzxVarM3.u();
                        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM3.b;
                        j$.util.Objects.requireNonNull(string6);
                        vtwVar2.b |= 2;
                        vtwVar2.d = string6;
                        arrayList.add((defpackage.vtw) akzxVarM3.p());
                    }
                } else {
                    context = this.a;
                    java.lang.String string7 = context.getString(2132020917);
                    if (vziVar.n) {
                        string = context.getString(2132020915);
                    } else {
                        string = context.getString(2132020916);
                        arrayList.add(this.c.b());
                    }
                    string2 = string;
                    string3 = string7;
                }
                if (vziVar.n) {
                    defpackage.vvb vvbVar2 = this.c;
                    akzx akzxVarM4 = defpackage.vtw.a.m();
                    akzxVarM4.u();
                    defpackage.vtw vtwVar3 = (defpackage.vtw) akzxVarM4.b;
                    vtwVar3.c = 1;
                    vtwVar3.b |= 1;
                    java.lang.String string8 = vvbVar2.b.getString(2132020847);
                    akzxVarM4.u();
                    defpackage.vtw vtwVar4 = (defpackage.vtw) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(string8);
                    vtwVar4.b |= 2;
                    vtwVar4.d = string8;
                    arrayList.add((defpackage.vtw) akzxVarM4.p());
                }
                akzxVarM = defpackage.vtx.a.m();
                akzxVarM.u();
                defpackage.vtx vtxVar6 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar6.c = vziVar;
                vtxVar6.b |= 1;
                akzxVarM.u();
                defpackage.vtx vtxVar7 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(string3);
                vtxVar7.b |= 2;
                vtxVar7.d = string3;
                akzxVarM.u();
                defpackage.vtx vtxVar8 = (defpackage.vtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                vtxVar8.b |= 4;
                vtxVar8.e = string2;
                boolean zB2 = b(vziVar);
                akzxVarM.u();
                defpackage.vtx vtxVar9 = (defpackage.vtx) akzxVarM.b;
                vtxVar9.b |= 32;
                vtxVar9.h = zB2;
                if (arrayList.size() > 0) {
                    defpackage.vtw vtwVar5 = (defpackage.vtw) arrayList.get(0);
                    akzxVarM.u();
                    defpackage.vtx vtxVar10 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(vtwVar5);
                    vtxVar10.f = vtwVar5;
                    vtxVar10.b |= 8;
                }
                if (arrayList.size() >= 2) {
                    defpackage.vtw vtwVar6 = (defpackage.vtw) arrayList.get(1);
                    akzxVarM.u();
                    defpackage.vtx vtxVar11 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(vtwVar6);
                    vtxVar11.g = vtwVar6;
                    vtxVar11.b |= 16;
                }
                optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
            } else if (i4 == 5) {
                akzx akzxVarM5 = defpackage.vtx.a.m();
                akzxVarM5.u();
                defpackage.vtx vtxVar12 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar12.c = vziVar;
                vtxVar12.b |= 1;
                android.content.Context context4 = this.a;
                java.lang.String string9 = context4.getString(2132020889);
                akzxVarM5.u();
                defpackage.vtx vtxVar13 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string9);
                vtxVar13.b |= 2;
                vtxVar13.d = string9;
                java.lang.String string10 = context4.getString(2132020888);
                akzxVarM5.u();
                defpackage.vtx vtxVar14 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string10);
                vtxVar14.b |= 4;
                vtxVar14.e = string10;
                boolean zB3 = b(vziVar);
                akzxVarM5.u();
                defpackage.vtx vtxVar15 = (defpackage.vtx) akzxVarM5.b;
                vtxVar15.b |= 32;
                vtxVar15.h = zB3;
                defpackage.vtw vtwVarA2 = this.c.a();
                akzxVarM5.u();
                defpackage.vtx vtxVar16 = (defpackage.vtx) akzxVarM5.b;
                j$.util.Objects.requireNonNull(vtwVarA2);
                vtxVar16.f = vtwVarA2;
                vtxVar16.b |= 8;
                optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM5.p());
            } else if (i4 == 4) {
                akzx akzxVarM6 = defpackage.vtx.a.m();
                akzxVarM6.u();
                defpackage.vtx vtxVar17 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vziVar);
                vtxVar17.c = vziVar;
                vtxVar17.b |= 1;
                android.content.Context context5 = this.a;
                java.lang.String string11 = context5.getString(2132020891);
                akzxVarM6.u();
                defpackage.vtx vtxVar18 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(string11);
                vtxVar18.b |= 2;
                vtxVar18.d = string11;
                java.lang.String string12 = context5.getString(2132020890);
                akzxVarM6.u();
                defpackage.vtx vtxVar19 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(string12);
                vtxVar19.b |= 4;
                vtxVar19.e = string12;
                boolean zB4 = b(vziVar);
                akzxVarM6.u();
                defpackage.vtx vtxVar20 = (defpackage.vtx) akzxVarM6.b;
                vtxVar20.b |= 32;
                vtxVar20.h = zB4;
                defpackage.vvb vvbVar3 = this.c;
                defpackage.vtw vtwVarA3 = vvbVar3.a();
                akzxVarM6.u();
                defpackage.vtx vtxVar21 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vtwVarA3);
                vtxVar21.f = vtwVarA3;
                vtxVar21.b |= 8;
                defpackage.vtw vtwVarB = vvbVar3.b();
                akzxVarM6.u();
                defpackage.vtx vtxVar22 = (defpackage.vtx) akzxVarM6.b;
                j$.util.Objects.requireNonNull(vtwVarB);
                vtxVar22.g = vtwVarB;
                vtxVar22.b |= 16;
                optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM6.p());
            } else {
                i = vziVar.i;
                if (i == 1) {
                    akzx akzxVarM7 = defpackage.vtx.a.m();
                    akzxVarM7.u();
                    defpackage.vtx vtxVar23 = (defpackage.vtx) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar23.c = vziVar;
                    vtxVar23.b |= 1;
                    android.content.Context context6 = this.a;
                    java.lang.String string13 = context6.getString(2132020909);
                    akzxVarM7.u();
                    defpackage.vtx vtxVar24 = (defpackage.vtx) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(string13);
                    vtxVar24.b |= 2;
                    vtxVar24.d = string13;
                    java.lang.String string14 = context6.getString(2132020908);
                    akzxVarM7.u();
                    defpackage.vtx vtxVar25 = (defpackage.vtx) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(string14);
                    vtxVar25.b |= 4;
                    vtxVar25.e = string14;
                    boolean zB5 = b(vziVar);
                    akzxVarM7.u();
                    defpackage.vtx vtxVar26 = (defpackage.vtx) akzxVarM7.b;
                    vtxVar26.b |= 32;
                    vtxVar26.h = zB5;
                    defpackage.vvb vvbVar4 = this.c;
                    defpackage.vtw vtwVarA4 = vvbVar4.a();
                    akzxVarM7.u();
                    defpackage.vtx vtxVar27 = (defpackage.vtx) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(vtwVarA4);
                    vtxVar27.f = vtwVarA4;
                    vtxVar27.b |= 8;
                    defpackage.vtw vtwVarB2 = vvbVar4.b();
                    akzxVarM7.u();
                    defpackage.vtx vtxVar28 = (defpackage.vtx) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(vtwVarB2);
                    vtxVar28.g = vtwVarB2;
                    vtxVar28.b |= 16;
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM7.p());
                } else if (i == 2) {
                    akzx akzxVarM8 = defpackage.vtx.a.m();
                    akzxVarM8.u();
                    defpackage.vtx vtxVar29 = (defpackage.vtx) akzxVarM8.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar29.c = vziVar;
                    vtxVar29.b |= 1;
                    android.content.Context context7 = this.a;
                    java.lang.String string15 = context7.getString(2132020909);
                    akzxVarM8.u();
                    defpackage.vtx vtxVar30 = (defpackage.vtx) akzxVarM8.b;
                    j$.util.Objects.requireNonNull(string15);
                    vtxVar30.b |= 2;
                    vtxVar30.d = string15;
                    java.lang.String string16 = context7.getString(2132020907);
                    akzxVarM8.u();
                    defpackage.vtx vtxVar31 = (defpackage.vtx) akzxVarM8.b;
                    j$.util.Objects.requireNonNull(string16);
                    vtxVar31.b |= 4;
                    vtxVar31.e = string16;
                    boolean zB6 = b(vziVar);
                    akzxVarM8.u();
                    defpackage.vtx vtxVar32 = (defpackage.vtx) akzxVarM8.b;
                    vtxVar32.b |= 32;
                    vtxVar32.h = zB6;
                    defpackage.vvb vvbVar5 = this.c;
                    defpackage.vtw vtwVarA5 = vvbVar5.a();
                    akzxVarM8.u();
                    defpackage.vtx vtxVar33 = (defpackage.vtx) akzxVarM8.b;
                    j$.util.Objects.requireNonNull(vtwVarA5);
                    vtxVar33.f = vtwVarA5;
                    vtxVar33.b |= 8;
                    defpackage.vtw vtwVarB3 = vvbVar5.b();
                    akzxVarM8.u();
                    defpackage.vtx vtxVar34 = (defpackage.vtx) akzxVarM8.b;
                    j$.util.Objects.requireNonNull(vtwVarB3);
                    vtxVar34.g = vtwVarB3;
                    vtxVar34.b |= 16;
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM8.p());
                } else if (i == 3) {
                    akzx akzxVarM9 = defpackage.vtx.a.m();
                    akzxVarM9.u();
                    defpackage.vtx vtxVar35 = (defpackage.vtx) akzxVarM9.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar35.c = vziVar;
                    vtxVar35.b |= 1;
                    android.content.Context context8 = this.a;
                    java.lang.String string17 = context8.getString(2132020893);
                    akzxVarM9.u();
                    defpackage.vtx vtxVar36 = (defpackage.vtx) akzxVarM9.b;
                    j$.util.Objects.requireNonNull(string17);
                    vtxVar36.b |= 2;
                    vtxVar36.d = string17;
                    java.lang.String string18 = context8.getString(2132020892);
                    akzxVarM9.u();
                    defpackage.vtx vtxVar37 = (defpackage.vtx) akzxVarM9.b;
                    j$.util.Objects.requireNonNull(string18);
                    vtxVar37.b |= 4;
                    vtxVar37.e = string18;
                    boolean zB7 = b(vziVar);
                    akzxVarM9.u();
                    defpackage.vtx vtxVar38 = (defpackage.vtx) akzxVarM9.b;
                    vtxVar38.b |= 32;
                    vtxVar38.h = zB7;
                    defpackage.vvb vvbVar6 = this.c;
                    defpackage.vtw vtwVarA6 = vvbVar6.a();
                    akzxVarM9.u();
                    defpackage.vtx vtxVar39 = (defpackage.vtx) akzxVarM9.b;
                    j$.util.Objects.requireNonNull(vtwVarA6);
                    vtxVar39.f = vtwVarA6;
                    vtxVar39.b |= 8;
                    defpackage.vtw vtwVarB4 = vvbVar6.b();
                    akzxVarM9.u();
                    defpackage.vtx vtxVar40 = (defpackage.vtx) akzxVarM9.b;
                    j$.util.Objects.requireNonNull(vtwVarB4);
                    vtxVar40.g = vtwVarB4;
                    vtxVar40.b |= 16;
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM9.p());
                } else if (i == 4) {
                    akzx akzxVarM10 = defpackage.vtx.a.m();
                    akzxVarM10.u();
                    defpackage.vtx vtxVar41 = (defpackage.vtx) akzxVarM10.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar41.c = vziVar;
                    vtxVar41.b |= 1;
                    android.content.Context context9 = this.a;
                    java.lang.String string19 = context9.getString(2132020896);
                    akzxVarM10.u();
                    defpackage.vtx vtxVar42 = (defpackage.vtx) akzxVarM10.b;
                    j$.util.Objects.requireNonNull(string19);
                    vtxVar42.b |= 2;
                    vtxVar42.d = string19;
                    java.lang.String string20 = context9.getString(2132020895);
                    akzxVarM10.u();
                    defpackage.vtx vtxVar43 = (defpackage.vtx) akzxVarM10.b;
                    j$.util.Objects.requireNonNull(string20);
                    vtxVar43.b |= 4;
                    vtxVar43.e = string20;
                    boolean zB8 = b(vziVar);
                    akzxVarM10.u();
                    defpackage.vtx vtxVar44 = (defpackage.vtx) akzxVarM10.b;
                    vtxVar44.b |= 32;
                    vtxVar44.h = zB8;
                    defpackage.vvb vvbVar7 = this.c;
                    defpackage.vtw vtwVarA7 = vvbVar7.a();
                    akzxVarM10.u();
                    defpackage.vtx vtxVar45 = (defpackage.vtx) akzxVarM10.b;
                    j$.util.Objects.requireNonNull(vtwVarA7);
                    vtxVar45.f = vtwVarA7;
                    vtxVar45.b |= 8;
                    defpackage.vtw vtwVarB5 = vvbVar7.b();
                    akzxVarM10.u();
                    defpackage.vtx vtxVar46 = (defpackage.vtx) akzxVarM10.b;
                    j$.util.Objects.requireNonNull(vtwVarB5);
                    vtxVar46.g = vtwVarB5;
                    vtxVar46.b |= 16;
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM10.p());
                } else if (i == 5) {
                    akzx akzxVarM11 = defpackage.vtx.a.m();
                    akzxVarM11.u();
                    defpackage.vtx vtxVar47 = (defpackage.vtx) akzxVarM11.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar47.c = vziVar;
                    vtxVar47.b |= 1;
                    android.content.Context context10 = this.a;
                    java.lang.String string21 = context10.getString(2132020925);
                    akzxVarM11.u();
                    defpackage.vtx vtxVar48 = (defpackage.vtx) akzxVarM11.b;
                    j$.util.Objects.requireNonNull(string21);
                    vtxVar48.b |= 2;
                    vtxVar48.d = string21;
                    java.lang.String string22 = context10.getString(2132020924);
                    akzxVarM11.u();
                    defpackage.vtx vtxVar49 = (defpackage.vtx) akzxVarM11.b;
                    j$.util.Objects.requireNonNull(string22);
                    vtxVar49.b |= 4;
                    vtxVar49.e = string22;
                    boolean zB9 = b(vziVar);
                    akzxVarM11.u();
                    defpackage.vtx vtxVar50 = (defpackage.vtx) akzxVarM11.b;
                    vtxVar50.b |= 32;
                    vtxVar50.h = zB9;
                    defpackage.vvb vvbVar8 = this.c;
                    defpackage.vtw vtwVarA8 = vvbVar8.a();
                    akzxVarM11.u();
                    defpackage.vtx vtxVar51 = (defpackage.vtx) akzxVarM11.b;
                    j$.util.Objects.requireNonNull(vtwVarA8);
                    vtxVar51.f = vtwVarA8;
                    vtxVar51.b |= 8;
                    defpackage.vtw vtwVarB6 = vvbVar8.b();
                    akzxVarM11.u();
                    defpackage.vtx vtxVar52 = (defpackage.vtx) akzxVarM11.b;
                    j$.util.Objects.requireNonNull(vtwVarB6);
                    vtxVar52.g = vtwVarB6;
                    vtxVar52.b |= 16;
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM11.p());
                } else if (i == 6) {
                    akzx akzxVarM12 = defpackage.vtx.a.m();
                    akzxVarM12.u();
                    defpackage.vtx vtxVar53 = (defpackage.vtx) akzxVarM12.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar53.c = vziVar;
                    vtxVar53.b |= 1;
                    android.content.Context context11 = this.a;
                    java.lang.String string23 = context11.getString(2132020923);
                    akzxVarM12.u();
                    defpackage.vtx vtxVar54 = (defpackage.vtx) akzxVarM12.b;
                    j$.util.Objects.requireNonNull(string23);
                    vtxVar54.b |= 2;
                    vtxVar54.d = string23;
                    java.lang.String string24 = context11.getString(2132020922);
                    akzxVarM12.u();
                    defpackage.vtx vtxVar55 = (defpackage.vtx) akzxVarM12.b;
                    j$.util.Objects.requireNonNull(string24);
                    vtxVar55.b |= 4;
                    vtxVar55.e = string24;
                    boolean zB10 = b(vziVar);
                    akzxVarM12.u();
                    defpackage.vtx vtxVar56 = (defpackage.vtx) akzxVarM12.b;
                    vtxVar56.b |= 32;
                    vtxVar56.h = zB10;
                    defpackage.vvb vvbVar9 = this.c;
                    defpackage.vtw vtwVarA9 = vvbVar9.a();
                    akzxVarM12.u();
                    defpackage.vtx vtxVar57 = (defpackage.vtx) akzxVarM12.b;
                    j$.util.Objects.requireNonNull(vtwVarA9);
                    vtxVar57.f = vtwVarA9;
                    vtxVar57.b |= 8;
                    defpackage.vtw vtwVarB7 = vvbVar9.b();
                    akzxVarM12.u();
                    defpackage.vtx vtxVar58 = (defpackage.vtx) akzxVarM12.b;
                    j$.util.Objects.requireNonNull(vtwVarB7);
                    vtxVar58.g = vtwVarB7;
                    vtxVar58.b |= 16;
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM12.p());
                } else {
                    vziVar2 = vziVar;
                    a.bt(b.c().m(aioa.b), "Unhandled status: %s", vziVar2, "com/android/dialer/voicemail/tab/impl/dataservice/impl/DefaultVoicemailMessageCreator", "createInternal", (char) 209, "DefaultVoicemailMessageCreator.java", zct.b);
                    optionalEmpty = j$.util.Optional.empty();
                }
            }
            vziVar2 = vziVar;
        } else {
            if (vziVar.i == 0 && vziVar.j == 0) {
                int i5 = vziVar.k;
                if (i5 == -1 || (i3 = vziVar.l) == -1) {
                    this.d.n(rmw.bg);
                    optionalEmpty = j$.util.Optional.empty();
                } else {
                    double d = ((double) i5) / ((double) i3);
                    if (d < 0.9d) {
                        optionalEmpty = j$.util.Optional.empty();
                    } else {
                        rlv rlvVar = this.d;
                        if (d >= 0.99d) {
                            rlvVar.n(rmw.ao);
                            akzx akzxVarM13 = defpackage.vtx.a.m();
                            akzxVarM13.u();
                            defpackage.vtx vtxVar59 = (defpackage.vtx) akzxVarM13.b;
                            j$.util.Objects.requireNonNull(vziVar);
                            vtxVar59.c = vziVar;
                            vtxVar59.b |= 1;
                            android.content.Context context12 = this.a;
                            java.lang.String string25 = context12.getString(2132020902);
                            akzxVarM13.u();
                            defpackage.vtx vtxVar60 = (defpackage.vtx) akzxVarM13.b;
                            j$.util.Objects.requireNonNull(string25);
                            vtxVar60.b |= 2;
                            vtxVar60.d = string25;
                            java.lang.String string26 = context12.getString(2132020901);
                            akzxVarM13.u();
                            defpackage.vtx vtxVar61 = (defpackage.vtx) akzxVarM13.b;
                            j$.util.Objects.requireNonNull(string26);
                            vtxVar61.b |= 4;
                            vtxVar61.e = string26;
                            boolean zB11 = b(vziVar);
                            akzxVarM13.u();
                            defpackage.vtx vtxVar62 = (defpackage.vtx) akzxVarM13.b;
                            vtxVar62.b |= 32;
                            vtxVar62.h = zB11;
                            optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM13.p());
                        } else {
                            rlvVar.n(rmw.an);
                            akzx akzxVarM14 = defpackage.vtx.a.m();
                            akzxVarM14.u();
                            defpackage.vtx vtxVar63 = (defpackage.vtx) akzxVarM14.b;
                            j$.util.Objects.requireNonNull(vziVar);
                            vtxVar63.c = vziVar;
                            vtxVar63.b |= 1;
                            android.content.Context context13 = this.a;
                            java.lang.String string27 = context13.getString(2132020906);
                            akzxVarM14.u();
                            defpackage.vtx vtxVar64 = (defpackage.vtx) akzxVarM14.b;
                            j$.util.Objects.requireNonNull(string27);
                            vtxVar64.b |= 2;
                            vtxVar64.d = string27;
                            java.lang.String string28 = context13.getString(2132020905);
                            akzxVarM14.u();
                            defpackage.vtx vtxVar65 = (defpackage.vtx) akzxVarM14.b;
                            j$.util.Objects.requireNonNull(string28);
                            vtxVar65.b |= 4;
                            vtxVar65.e = string28;
                            boolean zB12 = b(vziVar);
                            akzxVarM14.u();
                            defpackage.vtx vtxVar66 = (defpackage.vtx) akzxVarM14.b;
                            vtxVar66.b |= 32;
                            vtxVar66.h = zB12;
                            optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM14.p());
                        }
                    }
                }
            } else {
                i4 = 0;
                if (i4 != 3) {
                    if (vziVar.j == 1) {
                        arrayList = new java.util.ArrayList();
                        if (vziVar.h == 0) {
                            i2 = vziVar.i;
                            context2 = this.a;
                            if (i2 == 2) {
                                string3 = context2.getString(2132020913);
                                string2 = context2.getString(2132020911);
                            } else {
                                string3 = context2.getString(2132020913);
                                if (vziVar.n) {
                                    string2 = context2.getString(2132020910);
                                } else {
                                    string2 = context2.getString(2132020912);
                                }
                                defpackage.vvb vvbVar10 = this.c;
                                akzx akzxVarM15 = defpackage.vtw.a.m();
                                akzxVarM15.u();
                                defpackage.vtw vtwVar7 = (defpackage.vtw) akzxVarM15.b;
                                vtwVar7.c = 4;
                                vtwVar7.b |= 1;
                                java.lang.String string29 = vvbVar10.b.getString(2132020845);
                                akzxVarM15.u();
                                defpackage.vtw vtwVar8 = (defpackage.vtw) akzxVarM15.b;
                                j$.util.Objects.requireNonNull(string29);
                                vtwVar8.b |= 2;
                                vtwVar8.d = string29;
                                arrayList.add((defpackage.vtw) akzxVarM15.p());
                            }
                        } else {
                            context = this.a;
                            java.lang.String string30 = context.getString(2132020917);
                            if (vziVar.n) {
                                string = context.getString(2132020915);
                            } else {
                                string = context.getString(2132020916);
                                arrayList.add(this.c.b());
                            }
                            string2 = string;
                            string3 = string30;
                        }
                        if (vziVar.n) {
                            defpackage.vvb vvbVar11 = this.c;
                            akzx akzxVarM16 = defpackage.vtw.a.m();
                            akzxVarM16.u();
                            defpackage.vtw vtwVar9 = (defpackage.vtw) akzxVarM16.b;
                            vtwVar9.c = 1;
                            vtwVar9.b |= 1;
                            java.lang.String string31 = vvbVar11.b.getString(2132020847);
                            akzxVarM16.u();
                            defpackage.vtw vtwVar10 = (defpackage.vtw) akzxVarM16.b;
                            j$.util.Objects.requireNonNull(string31);
                            vtwVar10.b |= 2;
                            vtwVar10.d = string31;
                            arrayList.add((defpackage.vtw) akzxVarM16.p());
                        }
                        akzxVarM = defpackage.vtx.a.m();
                        akzxVarM.u();
                        defpackage.vtx vtxVar67 = (defpackage.vtx) akzxVarM.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar67.c = vziVar;
                        vtxVar67.b |= 1;
                        akzxVarM.u();
                        defpackage.vtx vtxVar68 = (defpackage.vtx) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string3);
                        vtxVar68.b |= 2;
                        vtxVar68.d = string3;
                        akzxVarM.u();
                        defpackage.vtx vtxVar69 = (defpackage.vtx) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string2);
                        vtxVar69.b |= 4;
                        vtxVar69.e = string2;
                        boolean zB13 = b(vziVar);
                        akzxVarM.u();
                        defpackage.vtx vtxVar70 = (defpackage.vtx) akzxVarM.b;
                        vtxVar70.b |= 32;
                        vtxVar70.h = zB13;
                        if (arrayList.size() > 0) {
                            defpackage.vtw vtwVar11 = (defpackage.vtw) arrayList.get(0);
                            akzxVarM.u();
                            defpackage.vtx vtxVar110 = (defpackage.vtx) akzxVarM.b;
                            j$.util.Objects.requireNonNull(vtwVar11);
                            vtxVar110.f = vtwVar11;
                            vtxVar110.b |= 8;
                        }
                        if (arrayList.size() >= 2) {
                            defpackage.vtw vtwVar12 = (defpackage.vtw) arrayList.get(1);
                            akzxVarM.u();
                            defpackage.vtx vtxVar111 = (defpackage.vtx) akzxVarM.b;
                            j$.util.Objects.requireNonNull(vtwVar12);
                            vtxVar111.g = vtwVar12;
                            vtxVar111.b |= 16;
                        }
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
                    } else if (i4 == 5) {
                        akzx akzxVarM17 = defpackage.vtx.a.m();
                        akzxVarM17.u();
                        defpackage.vtx vtxVar112 = (defpackage.vtx) akzxVarM17.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar112.c = vziVar;
                        vtxVar112.b |= 1;
                        android.content.Context context14 = this.a;
                        java.lang.String string32 = context14.getString(2132020889);
                        akzxVarM17.u();
                        defpackage.vtx vtxVar113 = (defpackage.vtx) akzxVarM17.b;
                        j$.util.Objects.requireNonNull(string32);
                        vtxVar113.b |= 2;
                        vtxVar113.d = string32;
                        java.lang.String string110 = context14.getString(2132020888);
                        akzxVarM17.u();
                        defpackage.vtx vtxVar114 = (defpackage.vtx) akzxVarM17.b;
                        j$.util.Objects.requireNonNull(string110);
                        vtxVar114.b |= 4;
                        vtxVar114.e = string110;
                        boolean zB14 = b(vziVar);
                        akzxVarM17.u();
                        defpackage.vtx vtxVar115 = (defpackage.vtx) akzxVarM17.b;
                        vtxVar115.b |= 32;
                        vtxVar115.h = zB14;
                        defpackage.vtw vtwVarA10 = this.c.a();
                        akzxVarM17.u();
                        defpackage.vtx vtxVar116 = (defpackage.vtx) akzxVarM17.b;
                        j$.util.Objects.requireNonNull(vtwVarA10);
                        vtxVar116.f = vtwVarA10;
                        vtxVar116.b |= 8;
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM17.p());
                    } else if (i4 == 4) {
                        akzx akzxVarM18 = defpackage.vtx.a.m();
                        akzxVarM18.u();
                        defpackage.vtx vtxVar117 = (defpackage.vtx) akzxVarM18.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar117.c = vziVar;
                        vtxVar117.b |= 1;
                        android.content.Context context15 = this.a;
                        java.lang.String string111 = context15.getString(2132020891);
                        akzxVarM18.u();
                        defpackage.vtx vtxVar118 = (defpackage.vtx) akzxVarM18.b;
                        j$.util.Objects.requireNonNull(string111);
                        vtxVar118.b |= 2;
                        vtxVar118.d = string111;
                        java.lang.String string112 = context15.getString(2132020890);
                        akzxVarM18.u();
                        defpackage.vtx vtxVar119 = (defpackage.vtx) akzxVarM18.b;
                        j$.util.Objects.requireNonNull(string112);
                        vtxVar119.b |= 4;
                        vtxVar119.e = string112;
                        boolean zB15 = b(vziVar);
                        akzxVarM18.u();
                        defpackage.vtx vtxVar210 = (defpackage.vtx) akzxVarM18.b;
                        vtxVar210.b |= 32;
                        vtxVar210.h = zB15;
                        defpackage.vvb vvbVar12 = this.c;
                        defpackage.vtw vtwVarA11 = vvbVar12.a();
                        akzxVarM18.u();
                        defpackage.vtx vtxVar211 = (defpackage.vtx) akzxVarM18.b;
                        j$.util.Objects.requireNonNull(vtwVarA11);
                        vtxVar211.f = vtwVarA11;
                        vtxVar211.b |= 8;
                        defpackage.vtw vtwVarB8 = vvbVar12.b();
                        akzxVarM18.u();
                        defpackage.vtx vtxVar212 = (defpackage.vtx) akzxVarM18.b;
                        j$.util.Objects.requireNonNull(vtwVarB8);
                        vtxVar212.g = vtwVarB8;
                        vtxVar212.b |= 16;
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM18.p());
                    } else {
                        i = vziVar.i;
                        if (i == 1) {
                            akzx akzxVarM19 = defpackage.vtx.a.m();
                            akzxVarM19.u();
                            defpackage.vtx vtxVar213 = (defpackage.vtx) akzxVarM19.b;
                            j$.util.Objects.requireNonNull(vziVar);
                            vtxVar213.c = vziVar;
                            vtxVar213.b |= 1;
                            android.content.Context context16 = this.a;
                            java.lang.String string113 = context16.getString(2132020909);
                            akzxVarM19.u();
                            defpackage.vtx vtxVar214 = (defpackage.vtx) akzxVarM19.b;
                            j$.util.Objects.requireNonNull(string113);
                            vtxVar214.b |= 2;
                            vtxVar214.d = string113;
                            java.lang.String string114 = context16.getString(2132020908);
                            akzxVarM19.u();
                            defpackage.vtx vtxVar215 = (defpackage.vtx) akzxVarM19.b;
                            j$.util.Objects.requireNonNull(string114);
                            vtxVar215.b |= 4;
                            vtxVar215.e = string114;
                            boolean zB16 = b(vziVar);
                            akzxVarM19.u();
                            defpackage.vtx vtxVar216 = (defpackage.vtx) akzxVarM19.b;
                            vtxVar216.b |= 32;
                            vtxVar216.h = zB16;
                            defpackage.vvb vvbVar13 = this.c;
                            defpackage.vtw vtwVarA12 = vvbVar13.a();
                            akzxVarM19.u();
                            defpackage.vtx vtxVar217 = (defpackage.vtx) akzxVarM19.b;
                            j$.util.Objects.requireNonNull(vtwVarA12);
                            vtxVar217.f = vtwVarA12;
                            vtxVar217.b |= 8;
                            defpackage.vtw vtwVarB9 = vvbVar13.b();
                            akzxVarM19.u();
                            defpackage.vtx vtxVar218 = (defpackage.vtx) akzxVarM19.b;
                            j$.util.Objects.requireNonNull(vtwVarB9);
                            vtxVar218.g = vtwVarB9;
                            vtxVar218.b |= 16;
                            optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM19.p());
                        } else if (i == 2) {
                            akzx akzxVarM20 = defpackage.vtx.a.m();
                            akzxVarM20.u();
                            defpackage.vtx vtxVar219 = (defpackage.vtx) akzxVarM20.b;
                            j$.util.Objects.requireNonNull(vziVar);
                            vtxVar219.c = vziVar;
                            vtxVar219.b |= 1;
                            android.content.Context context17 = this.a;
                            java.lang.String string115 = context17.getString(2132020909);
                            akzxVarM20.u();
                            defpackage.vtx vtxVar310 = (defpackage.vtx) akzxVarM20.b;
                            j$.util.Objects.requireNonNull(string115);
                            vtxVar310.b |= 2;
                            vtxVar310.d = string115;
                            java.lang.String string116 = context17.getString(2132020907);
                            akzxVarM20.u();
                            defpackage.vtx vtxVar311 = (defpackage.vtx) akzxVarM20.b;
                            j$.util.Objects.requireNonNull(string116);
                            vtxVar311.b |= 4;
                            vtxVar311.e = string116;
                            boolean zB17 = b(vziVar);
                            akzxVarM20.u();
                            defpackage.vtx vtxVar312 = (defpackage.vtx) akzxVarM20.b;
                            vtxVar312.b |= 32;
                            vtxVar312.h = zB17;
                            defpackage.vvb vvbVar14 = this.c;
                            defpackage.vtw vtwVarA13 = vvbVar14.a();
                            akzxVarM20.u();
                            defpackage.vtx vtxVar313 = (defpackage.vtx) akzxVarM20.b;
                            j$.util.Objects.requireNonNull(vtwVarA13);
                            vtxVar313.f = vtwVarA13;
                            vtxVar313.b |= 8;
                            defpackage.vtw vtwVarB10 = vvbVar14.b();
                            akzxVarM20.u();
                            defpackage.vtx vtxVar314 = (defpackage.vtx) akzxVarM20.b;
                            j$.util.Objects.requireNonNull(vtwVarB10);
                            vtxVar314.g = vtwVarB10;
                            vtxVar314.b |= 16;
                            optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM20.p());
                        } else if (i == 3) {
                            akzx akzxVarM21 = defpackage.vtx.a.m();
                            akzxVarM21.u();
                            defpackage.vtx vtxVar315 = (defpackage.vtx) akzxVarM21.b;
                            j$.util.Objects.requireNonNull(vziVar);
                            vtxVar315.c = vziVar;
                            vtxVar315.b |= 1;
                            android.content.Context context18 = this.a;
                            java.lang.String string117 = context18.getString(2132020893);
                            akzxVarM21.u();
                            defpackage.vtx vtxVar316 = (defpackage.vtx) akzxVarM21.b;
                            j$.util.Objects.requireNonNull(string117);
                            vtxVar316.b |= 2;
                            vtxVar316.d = string117;
                            java.lang.String string118 = context18.getString(2132020892);
                            akzxVarM21.u();
                            defpackage.vtx vtxVar317 = (defpackage.vtx) akzxVarM21.b;
                            j$.util.Objects.requireNonNull(string118);
                            vtxVar317.b |= 4;
                            vtxVar317.e = string118;
                            boolean zB18 = b(vziVar);
                            akzxVarM21.u();
                            defpackage.vtx vtxVar318 = (defpackage.vtx) akzxVarM21.b;
                            vtxVar318.b |= 32;
                            vtxVar318.h = zB18;
                            defpackage.vvb vvbVar15 = this.c;
                            defpackage.vtw vtwVarA14 = vvbVar15.a();
                            akzxVarM21.u();
                            defpackage.vtx vtxVar319 = (defpackage.vtx) akzxVarM21.b;
                            j$.util.Objects.requireNonNull(vtwVarA14);
                            vtxVar319.f = vtwVarA14;
                            vtxVar319.b |= 8;
                            defpackage.vtw vtwVarB11 = vvbVar15.b();
                            akzxVarM21.u();
                            defpackage.vtx vtxVar410 = (defpackage.vtx) akzxVarM21.b;
                            j$.util.Objects.requireNonNull(vtwVarB11);
                            vtxVar410.g = vtwVarB11;
                            vtxVar410.b |= 16;
                            optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM21.p());
                        } else if (i == 4) {
                            akzx akzxVarM110 = defpackage.vtx.a.m();
                            akzxVarM110.u();
                            defpackage.vtx vtxVar411 = (defpackage.vtx) akzxVarM110.b;
                            j$.util.Objects.requireNonNull(vziVar);
                            vtxVar411.c = vziVar;
                            vtxVar411.b |= 1;
                            android.content.Context context19 = this.a;
                            java.lang.String string119 = context19.getString(2132020896);
                            akzxVarM110.u();
                            defpackage.vtx vtxVar412 = (defpackage.vtx) akzxVarM110.b;
                            j$.util.Objects.requireNonNull(string119);
                            vtxVar412.b |= 2;
                            vtxVar412.d = string119;
                            java.lang.String string210 = context19.getString(2132020895);
                            akzxVarM110.u();
                            defpackage.vtx vtxVar413 = (defpackage.vtx) akzxVarM110.b;
                            j$.util.Objects.requireNonNull(string210);
                            vtxVar413.b |= 4;
                            vtxVar413.e = string210;
                            boolean zB19 = b(vziVar);
                            akzxVarM110.u();
                            defpackage.vtx vtxVar414 = (defpackage.vtx) akzxVarM110.b;
                            vtxVar414.b |= 32;
                            vtxVar414.h = zB19;
                            defpackage.vvb vvbVar16 = this.c;
                            defpackage.vtw vtwVarA15 = vvbVar16.a();
                            akzxVarM110.u();
                            defpackage.vtx vtxVar415 = (defpackage.vtx) akzxVarM110.b;
                            j$.util.Objects.requireNonNull(vtwVarA15);
                            vtxVar415.f = vtwVarA15;
                            vtxVar415.b |= 8;
                            defpackage.vtw vtwVarB12 = vvbVar16.b();
                            akzxVarM110.u();
                            defpackage.vtx vtxVar416 = (defpackage.vtx) akzxVarM110.b;
                            j$.util.Objects.requireNonNull(vtwVarB12);
                            vtxVar416.g = vtwVarB12;
                            vtxVar416.b |= 16;
                            optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM110.p());
                        } else if (i == 5) {
                            akzx akzxVarM111 = defpackage.vtx.a.m();
                            akzxVarM111.u();
                            defpackage.vtx vtxVar417 = (defpackage.vtx) akzxVarM111.b;
                            j$.util.Objects.requireNonNull(vziVar);
                            vtxVar417.c = vziVar;
                            vtxVar417.b |= 1;
                            android.content.Context context110 = this.a;
                            java.lang.String string211 = context110.getString(2132020925);
                            akzxVarM111.u();
                            defpackage.vtx vtxVar418 = (defpackage.vtx) akzxVarM111.b;
                            j$.util.Objects.requireNonNull(string211);
                            vtxVar418.b |= 2;
                            vtxVar418.d = string211;
                            java.lang.String string212 = context110.getString(2132020924);
                            akzxVarM111.u();
                            defpackage.vtx vtxVar419 = (defpackage.vtx) akzxVarM111.b;
                            j$.util.Objects.requireNonNull(string212);
                            vtxVar419.b |= 4;
                            vtxVar419.e = string212;
                            boolean zB20 = b(vziVar);
                            akzxVarM111.u();
                            defpackage.vtx vtxVar510 = (defpackage.vtx) akzxVarM111.b;
                            vtxVar510.b |= 32;
                            vtxVar510.h = zB20;
                            defpackage.vvb vvbVar17 = this.c;
                            defpackage.vtw vtwVarA16 = vvbVar17.a();
                            akzxVarM111.u();
                            defpackage.vtx vtxVar511 = (defpackage.vtx) akzxVarM111.b;
                            j$.util.Objects.requireNonNull(vtwVarA16);
                            vtxVar511.f = vtwVarA16;
                            vtxVar511.b |= 8;
                            defpackage.vtw vtwVarB13 = vvbVar17.b();
                            akzxVarM111.u();
                            defpackage.vtx vtxVar512 = (defpackage.vtx) akzxVarM111.b;
                            j$.util.Objects.requireNonNull(vtwVarB13);
                            vtxVar512.g = vtwVarB13;
                            vtxVar512.b |= 16;
                            optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM111.p());
                        } else if (i == 6) {
                            akzx akzxVarM112 = defpackage.vtx.a.m();
                            akzxVarM112.u();
                            defpackage.vtx vtxVar513 = (defpackage.vtx) akzxVarM112.b;
                            j$.util.Objects.requireNonNull(vziVar);
                            vtxVar513.c = vziVar;
                            vtxVar513.b |= 1;
                            android.content.Context context111 = this.a;
                            java.lang.String string213 = context111.getString(2132020923);
                            akzxVarM112.u();
                            defpackage.vtx vtxVar514 = (defpackage.vtx) akzxVarM112.b;
                            j$.util.Objects.requireNonNull(string213);
                            vtxVar514.b |= 2;
                            vtxVar514.d = string213;
                            java.lang.String string214 = context111.getString(2132020922);
                            akzxVarM112.u();
                            defpackage.vtx vtxVar515 = (defpackage.vtx) akzxVarM112.b;
                            j$.util.Objects.requireNonNull(string214);
                            vtxVar515.b |= 4;
                            vtxVar515.e = string214;
                            boolean zB110 = b(vziVar);
                            akzxVarM112.u();
                            defpackage.vtx vtxVar516 = (defpackage.vtx) akzxVarM112.b;
                            vtxVar516.b |= 32;
                            vtxVar516.h = zB110;
                            defpackage.vvb vvbVar18 = this.c;
                            defpackage.vtw vtwVarA17 = vvbVar18.a();
                            akzxVarM112.u();
                            defpackage.vtx vtxVar517 = (defpackage.vtx) akzxVarM112.b;
                            j$.util.Objects.requireNonNull(vtwVarA17);
                            vtxVar517.f = vtwVarA17;
                            vtxVar517.b |= 8;
                            defpackage.vtw vtwVarB14 = vvbVar18.b();
                            akzxVarM112.u();
                            defpackage.vtx vtxVar518 = (defpackage.vtx) akzxVarM112.b;
                            j$.util.Objects.requireNonNull(vtwVarB14);
                            vtxVar518.g = vtwVarB14;
                            vtxVar518.b |= 16;
                            optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM112.p());
                        } else {
                            vziVar2 = vziVar;
                            a.bt(b.c().m(aioa.b), "Unhandled status: %s", vziVar2, "com/android/dialer/voicemail/tab/impl/dataservice/impl/DefaultVoicemailMessageCreator", "createInternal", (char) 209, "DefaultVoicemailMessageCreator.java", zct.b);
                            optionalEmpty = j$.util.Optional.empty();
                        }
                    }
                } else if (vziVar.j == 1) {
                    arrayList = new java.util.ArrayList();
                    if (vziVar.h == 0) {
                        i2 = vziVar.i;
                        context2 = this.a;
                        if (i2 == 2) {
                            string3 = context2.getString(2132020913);
                            string2 = context2.getString(2132020911);
                        } else {
                            string3 = context2.getString(2132020913);
                            if (vziVar.n) {
                                string2 = context2.getString(2132020910);
                            } else {
                                string2 = context2.getString(2132020912);
                            }
                            defpackage.vvb vvbVar19 = this.c;
                            akzx akzxVarM113 = defpackage.vtw.a.m();
                            akzxVarM113.u();
                            defpackage.vtw vtwVar13 = (defpackage.vtw) akzxVarM113.b;
                            vtwVar13.c = 4;
                            vtwVar13.b |= 1;
                            java.lang.String string215 = vvbVar19.b.getString(2132020845);
                            akzxVarM113.u();
                            defpackage.vtw vtwVar14 = (defpackage.vtw) akzxVarM113.b;
                            j$.util.Objects.requireNonNull(string215);
                            vtwVar14.b |= 2;
                            vtwVar14.d = string215;
                            arrayList.add((defpackage.vtw) akzxVarM113.p());
                        }
                    } else {
                        context = this.a;
                        java.lang.String string33 = context.getString(2132020917);
                        if (vziVar.n) {
                            string = context.getString(2132020915);
                        } else {
                            string = context.getString(2132020916);
                            arrayList.add(this.c.b());
                        }
                        string2 = string;
                        string3 = string33;
                    }
                    if (vziVar.n) {
                        defpackage.vvb vvbVar110 = this.c;
                        akzx akzxVarM114 = defpackage.vtw.a.m();
                        akzxVarM114.u();
                        defpackage.vtw vtwVar15 = (defpackage.vtw) akzxVarM114.b;
                        vtwVar15.c = 1;
                        vtwVar15.b |= 1;
                        java.lang.String string34 = vvbVar110.b.getString(2132020847);
                        akzxVarM114.u();
                        defpackage.vtw vtwVar16 = (defpackage.vtw) akzxVarM114.b;
                        j$.util.Objects.requireNonNull(string34);
                        vtwVar16.b |= 2;
                        vtwVar16.d = string34;
                        arrayList.add((defpackage.vtw) akzxVarM114.p());
                    }
                    akzxVarM = defpackage.vtx.a.m();
                    akzxVarM.u();
                    defpackage.vtx vtxVar610 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar610.c = vziVar;
                    vtxVar610.b |= 1;
                    akzxVarM.u();
                    defpackage.vtx vtxVar611 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(string3);
                    vtxVar611.b |= 2;
                    vtxVar611.d = string3;
                    akzxVarM.u();
                    defpackage.vtx vtxVar612 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(string2);
                    vtxVar612.b |= 4;
                    vtxVar612.e = string2;
                    boolean zB111 = b(vziVar);
                    akzxVarM.u();
                    defpackage.vtx vtxVar71 = (defpackage.vtx) akzxVarM.b;
                    vtxVar71.b |= 32;
                    vtxVar71.h = zB111;
                    if (arrayList.size() > 0) {
                        defpackage.vtw vtwVar17 = (defpackage.vtw) arrayList.get(0);
                        akzxVarM.u();
                        defpackage.vtx vtxVar1110 = (defpackage.vtx) akzxVarM.b;
                        j$.util.Objects.requireNonNull(vtwVar17);
                        vtxVar1110.f = vtwVar17;
                        vtxVar1110.b |= 8;
                    }
                    if (arrayList.size() >= 2) {
                        defpackage.vtw vtwVar18 = (defpackage.vtw) arrayList.get(1);
                        akzxVarM.u();
                        defpackage.vtx vtxVar1111 = (defpackage.vtx) akzxVarM.b;
                        j$.util.Objects.requireNonNull(vtwVar18);
                        vtxVar1111.g = vtwVar18;
                        vtxVar1111.b |= 16;
                    }
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
                } else if (i4 == 5) {
                    akzx akzxVarM115 = defpackage.vtx.a.m();
                    akzxVarM115.u();
                    defpackage.vtx vtxVar1112 = (defpackage.vtx) akzxVarM115.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar1112.c = vziVar;
                    vtxVar1112.b |= 1;
                    android.content.Context context112 = this.a;
                    java.lang.String string35 = context112.getString(2132020889);
                    akzxVarM115.u();
                    defpackage.vtx vtxVar1113 = (defpackage.vtx) akzxVarM115.b;
                    j$.util.Objects.requireNonNull(string35);
                    vtxVar1113.b |= 2;
                    vtxVar1113.d = string35;
                    java.lang.String string1110 = context112.getString(2132020888);
                    akzxVarM115.u();
                    defpackage.vtx vtxVar1114 = (defpackage.vtx) akzxVarM115.b;
                    j$.util.Objects.requireNonNull(string1110);
                    vtxVar1114.b |= 4;
                    vtxVar1114.e = string1110;
                    boolean zB112 = b(vziVar);
                    akzxVarM115.u();
                    defpackage.vtx vtxVar1115 = (defpackage.vtx) akzxVarM115.b;
                    vtxVar1115.b |= 32;
                    vtxVar1115.h = zB112;
                    defpackage.vtw vtwVarA18 = this.c.a();
                    akzxVarM115.u();
                    defpackage.vtx vtxVar1116 = (defpackage.vtx) akzxVarM115.b;
                    j$.util.Objects.requireNonNull(vtwVarA18);
                    vtxVar1116.f = vtwVarA18;
                    vtxVar1116.b |= 8;
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM115.p());
                } else if (i4 == 4) {
                    akzx akzxVarM116 = defpackage.vtx.a.m();
                    akzxVarM116.u();
                    defpackage.vtx vtxVar1117 = (defpackage.vtx) akzxVarM116.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar1117.c = vziVar;
                    vtxVar1117.b |= 1;
                    android.content.Context context113 = this.a;
                    java.lang.String string1111 = context113.getString(2132020891);
                    akzxVarM116.u();
                    defpackage.vtx vtxVar1118 = (defpackage.vtx) akzxVarM116.b;
                    j$.util.Objects.requireNonNull(string1111);
                    vtxVar1118.b |= 2;
                    vtxVar1118.d = string1111;
                    java.lang.String string1112 = context113.getString(2132020890);
                    akzxVarM116.u();
                    defpackage.vtx vtxVar1119 = (defpackage.vtx) akzxVarM116.b;
                    j$.util.Objects.requireNonNull(string1112);
                    vtxVar1119.b |= 4;
                    vtxVar1119.e = string1112;
                    boolean zB113 = b(vziVar);
                    akzxVarM116.u();
                    defpackage.vtx vtxVar2110 = (defpackage.vtx) akzxVarM116.b;
                    vtxVar2110.b |= 32;
                    vtxVar2110.h = zB113;
                    defpackage.vvb vvbVar111 = this.c;
                    defpackage.vtw vtwVarA19 = vvbVar111.a();
                    akzxVarM116.u();
                    defpackage.vtx vtxVar2111 = (defpackage.vtx) akzxVarM116.b;
                    j$.util.Objects.requireNonNull(vtwVarA19);
                    vtxVar2111.f = vtwVarA19;
                    vtxVar2111.b |= 8;
                    defpackage.vtw vtwVarB15 = vvbVar111.b();
                    akzxVarM116.u();
                    defpackage.vtx vtxVar2112 = (defpackage.vtx) akzxVarM116.b;
                    j$.util.Objects.requireNonNull(vtwVarB15);
                    vtxVar2112.g = vtwVarB15;
                    vtxVar2112.b |= 16;
                    optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM116.p());
                } else {
                    i = vziVar.i;
                    if (i == 1) {
                        akzx akzxVarM117 = defpackage.vtx.a.m();
                        akzxVarM117.u();
                        defpackage.vtx vtxVar2113 = (defpackage.vtx) akzxVarM117.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar2113.c = vziVar;
                        vtxVar2113.b |= 1;
                        android.content.Context context114 = this.a;
                        java.lang.String string1113 = context114.getString(2132020909);
                        akzxVarM117.u();
                        defpackage.vtx vtxVar2114 = (defpackage.vtx) akzxVarM117.b;
                        j$.util.Objects.requireNonNull(string1113);
                        vtxVar2114.b |= 2;
                        vtxVar2114.d = string1113;
                        java.lang.String string1114 = context114.getString(2132020908);
                        akzxVarM117.u();
                        defpackage.vtx vtxVar2115 = (defpackage.vtx) akzxVarM117.b;
                        j$.util.Objects.requireNonNull(string1114);
                        vtxVar2115.b |= 4;
                        vtxVar2115.e = string1114;
                        boolean zB114 = b(vziVar);
                        akzxVarM117.u();
                        defpackage.vtx vtxVar2116 = (defpackage.vtx) akzxVarM117.b;
                        vtxVar2116.b |= 32;
                        vtxVar2116.h = zB114;
                        defpackage.vvb vvbVar112 = this.c;
                        defpackage.vtw vtwVarA110 = vvbVar112.a();
                        akzxVarM117.u();
                        defpackage.vtx vtxVar2117 = (defpackage.vtx) akzxVarM117.b;
                        j$.util.Objects.requireNonNull(vtwVarA110);
                        vtxVar2117.f = vtwVarA110;
                        vtxVar2117.b |= 8;
                        defpackage.vtw vtwVarB16 = vvbVar112.b();
                        akzxVarM117.u();
                        defpackage.vtx vtxVar2118 = (defpackage.vtx) akzxVarM117.b;
                        j$.util.Objects.requireNonNull(vtwVarB16);
                        vtxVar2118.g = vtwVarB16;
                        vtxVar2118.b |= 16;
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM117.p());
                    } else if (i == 2) {
                        akzx akzxVarM22 = defpackage.vtx.a.m();
                        akzxVarM22.u();
                        defpackage.vtx vtxVar2119 = (defpackage.vtx) akzxVarM22.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar2119.c = vziVar;
                        vtxVar2119.b |= 1;
                        android.content.Context context115 = this.a;
                        java.lang.String string1115 = context115.getString(2132020909);
                        akzxVarM22.u();
                        defpackage.vtx vtxVar3110 = (defpackage.vtx) akzxVarM22.b;
                        j$.util.Objects.requireNonNull(string1115);
                        vtxVar3110.b |= 2;
                        vtxVar3110.d = string1115;
                        java.lang.String string1116 = context115.getString(2132020907);
                        akzxVarM22.u();
                        defpackage.vtx vtxVar3111 = (defpackage.vtx) akzxVarM22.b;
                        j$.util.Objects.requireNonNull(string1116);
                        vtxVar3111.b |= 4;
                        vtxVar3111.e = string1116;
                        boolean zB115 = b(vziVar);
                        akzxVarM22.u();
                        defpackage.vtx vtxVar3112 = (defpackage.vtx) akzxVarM22.b;
                        vtxVar3112.b |= 32;
                        vtxVar3112.h = zB115;
                        defpackage.vvb vvbVar113 = this.c;
                        defpackage.vtw vtwVarA111 = vvbVar113.a();
                        akzxVarM22.u();
                        defpackage.vtx vtxVar3113 = (defpackage.vtx) akzxVarM22.b;
                        j$.util.Objects.requireNonNull(vtwVarA111);
                        vtxVar3113.f = vtwVarA111;
                        vtxVar3113.b |= 8;
                        defpackage.vtw vtwVarB17 = vvbVar113.b();
                        akzxVarM22.u();
                        defpackage.vtx vtxVar3114 = (defpackage.vtx) akzxVarM22.b;
                        j$.util.Objects.requireNonNull(vtwVarB17);
                        vtxVar3114.g = vtwVarB17;
                        vtxVar3114.b |= 16;
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM22.p());
                    } else if (i == 3) {
                        akzx akzxVarM23 = defpackage.vtx.a.m();
                        akzxVarM23.u();
                        defpackage.vtx vtxVar3115 = (defpackage.vtx) akzxVarM23.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar3115.c = vziVar;
                        vtxVar3115.b |= 1;
                        android.content.Context context116 = this.a;
                        java.lang.String string1117 = context116.getString(2132020893);
                        akzxVarM23.u();
                        defpackage.vtx vtxVar3116 = (defpackage.vtx) akzxVarM23.b;
                        j$.util.Objects.requireNonNull(string1117);
                        vtxVar3116.b |= 2;
                        vtxVar3116.d = string1117;
                        java.lang.String string1118 = context116.getString(2132020892);
                        akzxVarM23.u();
                        defpackage.vtx vtxVar3117 = (defpackage.vtx) akzxVarM23.b;
                        j$.util.Objects.requireNonNull(string1118);
                        vtxVar3117.b |= 4;
                        vtxVar3117.e = string1118;
                        boolean zB116 = b(vziVar);
                        akzxVarM23.u();
                        defpackage.vtx vtxVar3118 = (defpackage.vtx) akzxVarM23.b;
                        vtxVar3118.b |= 32;
                        vtxVar3118.h = zB116;
                        defpackage.vvb vvbVar114 = this.c;
                        defpackage.vtw vtwVarA112 = vvbVar114.a();
                        akzxVarM23.u();
                        defpackage.vtx vtxVar3119 = (defpackage.vtx) akzxVarM23.b;
                        j$.util.Objects.requireNonNull(vtwVarA112);
                        vtxVar3119.f = vtwVarA112;
                        vtxVar3119.b |= 8;
                        defpackage.vtw vtwVarB18 = vvbVar114.b();
                        akzxVarM23.u();
                        defpackage.vtx vtxVar4110 = (defpackage.vtx) akzxVarM23.b;
                        j$.util.Objects.requireNonNull(vtwVarB18);
                        vtxVar4110.g = vtwVarB18;
                        vtxVar4110.b |= 16;
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM23.p());
                    } else if (i == 4) {
                        akzx akzxVarM118 = defpackage.vtx.a.m();
                        akzxVarM118.u();
                        defpackage.vtx vtxVar4111 = (defpackage.vtx) akzxVarM118.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar4111.c = vziVar;
                        vtxVar4111.b |= 1;
                        android.content.Context context117 = this.a;
                        java.lang.String string1119 = context117.getString(2132020896);
                        akzxVarM118.u();
                        defpackage.vtx vtxVar4112 = (defpackage.vtx) akzxVarM118.b;
                        j$.util.Objects.requireNonNull(string1119);
                        vtxVar4112.b |= 2;
                        vtxVar4112.d = string1119;
                        java.lang.String string216 = context117.getString(2132020895);
                        akzxVarM118.u();
                        defpackage.vtx vtxVar4113 = (defpackage.vtx) akzxVarM118.b;
                        j$.util.Objects.requireNonNull(string216);
                        vtxVar4113.b |= 4;
                        vtxVar4113.e = string216;
                        boolean zB117 = b(vziVar);
                        akzxVarM118.u();
                        defpackage.vtx vtxVar4114 = (defpackage.vtx) akzxVarM118.b;
                        vtxVar4114.b |= 32;
                        vtxVar4114.h = zB117;
                        defpackage.vvb vvbVar115 = this.c;
                        defpackage.vtw vtwVarA113 = vvbVar115.a();
                        akzxVarM118.u();
                        defpackage.vtx vtxVar4115 = (defpackage.vtx) akzxVarM118.b;
                        j$.util.Objects.requireNonNull(vtwVarA113);
                        vtxVar4115.f = vtwVarA113;
                        vtxVar4115.b |= 8;
                        defpackage.vtw vtwVarB19 = vvbVar115.b();
                        akzxVarM118.u();
                        defpackage.vtx vtxVar4116 = (defpackage.vtx) akzxVarM118.b;
                        j$.util.Objects.requireNonNull(vtwVarB19);
                        vtxVar4116.g = vtwVarB19;
                        vtxVar4116.b |= 16;
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM118.p());
                    } else if (i == 5) {
                        akzx akzxVarM119 = defpackage.vtx.a.m();
                        akzxVarM119.u();
                        defpackage.vtx vtxVar4117 = (defpackage.vtx) akzxVarM119.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar4117.c = vziVar;
                        vtxVar4117.b |= 1;
                        android.content.Context context118 = this.a;
                        java.lang.String string217 = context118.getString(2132020925);
                        akzxVarM119.u();
                        defpackage.vtx vtxVar4118 = (defpackage.vtx) akzxVarM119.b;
                        j$.util.Objects.requireNonNull(string217);
                        vtxVar4118.b |= 2;
                        vtxVar4118.d = string217;
                        java.lang.String string218 = context118.getString(2132020924);
                        akzxVarM119.u();
                        defpackage.vtx vtxVar4119 = (defpackage.vtx) akzxVarM119.b;
                        j$.util.Objects.requireNonNull(string218);
                        vtxVar4119.b |= 4;
                        vtxVar4119.e = string218;
                        boolean zB21 = b(vziVar);
                        akzxVarM119.u();
                        defpackage.vtx vtxVar519 = (defpackage.vtx) akzxVarM119.b;
                        vtxVar519.b |= 32;
                        vtxVar519.h = zB21;
                        defpackage.vvb vvbVar116 = this.c;
                        defpackage.vtw vtwVarA114 = vvbVar116.a();
                        akzxVarM119.u();
                        defpackage.vtx vtxVar5110 = (defpackage.vtx) akzxVarM119.b;
                        j$.util.Objects.requireNonNull(vtwVarA114);
                        vtxVar5110.f = vtwVarA114;
                        vtxVar5110.b |= 8;
                        defpackage.vtw vtwVarB110 = vvbVar116.b();
                        akzxVarM119.u();
                        defpackage.vtx vtxVar5111 = (defpackage.vtx) akzxVarM119.b;
                        j$.util.Objects.requireNonNull(vtwVarB110);
                        vtxVar5111.g = vtwVarB110;
                        vtxVar5111.b |= 16;
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM119.p());
                    } else if (i == 6) {
                        akzx akzxVarM1110 = defpackage.vtx.a.m();
                        akzxVarM1110.u();
                        defpackage.vtx vtxVar5112 = (defpackage.vtx) akzxVarM1110.b;
                        j$.util.Objects.requireNonNull(vziVar);
                        vtxVar5112.c = vziVar;
                        vtxVar5112.b |= 1;
                        android.content.Context context119 = this.a;
                        java.lang.String string219 = context119.getString(2132020923);
                        akzxVarM1110.u();
                        defpackage.vtx vtxVar5113 = (defpackage.vtx) akzxVarM1110.b;
                        j$.util.Objects.requireNonNull(string219);
                        vtxVar5113.b |= 2;
                        vtxVar5113.d = string219;
                        java.lang.String string2110 = context119.getString(2132020922);
                        akzxVarM1110.u();
                        defpackage.vtx vtxVar5114 = (defpackage.vtx) akzxVarM1110.b;
                        j$.util.Objects.requireNonNull(string2110);
                        vtxVar5114.b |= 4;
                        vtxVar5114.e = string2110;
                        boolean zB118 = b(vziVar);
                        akzxVarM1110.u();
                        defpackage.vtx vtxVar5115 = (defpackage.vtx) akzxVarM1110.b;
                        vtxVar5115.b |= 32;
                        vtxVar5115.h = zB118;
                        defpackage.vvb vvbVar117 = this.c;
                        defpackage.vtw vtwVarA115 = vvbVar117.a();
                        akzxVarM1110.u();
                        defpackage.vtx vtxVar5116 = (defpackage.vtx) akzxVarM1110.b;
                        j$.util.Objects.requireNonNull(vtwVarA115);
                        vtxVar5116.f = vtwVarA115;
                        vtxVar5116.b |= 8;
                        defpackage.vtw vtwVarB111 = vvbVar117.b();
                        akzxVarM1110.u();
                        defpackage.vtx vtxVar5117 = (defpackage.vtx) akzxVarM1110.b;
                        j$.util.Objects.requireNonNull(vtwVarB111);
                        vtxVar5117.g = vtwVarB111;
                        vtxVar5117.b |= 16;
                        optionalEmpty = j$.util.Optional.of((defpackage.vtx) akzxVarM1110.p());
                    } else {
                        vziVar2 = vziVar;
                        a.bt(b.c().m(aioa.b), "Unhandled status: %s", vziVar2, "com/android/dialer/voicemail/tab/impl/dataservice/impl/DefaultVoicemailMessageCreator", "createInternal", (char) 209, "DefaultVoicemailMessageCreator.java", zct.b);
                        optionalEmpty = j$.util.Optional.empty();
                    }
                }
            }
            vziVar2 = vziVar;
        }
        return optionalEmpty.or(new defpackage.vfs(this, vziVar2, 14));
    }
}
