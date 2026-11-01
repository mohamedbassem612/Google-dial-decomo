package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vvk {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorDataServiceImpl");
    public final android.content.Context b;
    public final vth c;
    public final aoss d;
    public final zrw e;
    public final zjs f;
    public final rlv g;
    public final aoin h;
    public final zjm i;
    private final aoin j;
    private final aoin k;
    private final aoin l;
    private final aoin m;
    private final aoin n;
    private final aolr o;
    private final vaf p;
    private final oko q;
    private final vze r;

    public vvk(android.content.Context context, vze vzeVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, vth vthVar, aoss aossVar, aolr aolrVar, aolr aolrVar2, zjm zjmVar, zrw zrwVar, zjs zjsVar, rlv rlvVar, vaf vafVar, aoin aoinVar6, oko okoVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar6, "enableCarrierVvmPackageOverrideFix");
        this.b = context;
        this.r = vzeVar;
        this.j = aoinVar;
        this.k = aoinVar2;
        this.l = aoinVar3;
        this.m = aoinVar4;
        this.n = aoinVar5;
        this.c = vthVar;
        this.d = aossVar;
        this.o = aolrVar2;
        this.i = zjmVar;
        this.e = zrwVar;
        this.f = zjsVar;
        this.g = rlvVar;
        this.p = vafVar;
        this.h = aoinVar6;
        this.q = okoVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0485  */
    /* JADX WARN: Code duplicated, block: B:70:0x032b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.Object a(vzi vziVar, boolean z, aoln aolnVar) {
        defpackage.vve vveVar;
        j$.util.Optional optionalA;
        defpackage.vtw vtwVar;
        if (aolnVar instanceof defpackage.vve) {
            vveVar = (defpackage.vve) aolnVar;
            int i = vveVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vveVar.d = i - Integer.MIN_VALUE;
            } else {
                vveVar = new defpackage.vve(this, aolnVar);
            }
        } else {
            vveVar = new defpackage.vve(this, aolnVar);
        }
        java.lang.Object objD = vveVar.b;
        aolu aoluVar = aolu.a;
        int i2 = vveVar.d;
        if (i2 == 0) {
            aooc.af(objD);
            android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(vziVar.e);
            if (componentNameUnflattenFromString == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            android.telecom.PhoneAccountHandle phoneAccountHandle = new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, vziVar.f);
            zjm zjmVar = this.i;
            zjm zjmVar2 = (zjm) zjmVar.a;
            ajcq ajcqVarZ = !zjmVar2.g().isPresent() ? aiql.z(j$.util.Optional.empty()) : ahvr.H(((vda) zjmVar2.g().orElseThrow()).a(phoneAccountHandle), new vak(6), (java.util.concurrent.Executor) zjmVar.b);
            vveVar.e = vziVar;
            vveVar.a = z;
            vveVar.d = 1;
            objD = aosv.D(ajcqVarZ, vveVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = vveVar.a;
            vziVar = vveVar.e;
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        defpackage.vch vchVar = (defpackage.vch) aooh.q((j$.util.Optional) objD);
        if (vchVar != null) {
            if (z) {
                j$.util.Optional optionalB = vchVar.b(vziVar);
                aooh.e(optionalB, "createWithRequestPermissionRationale(...)");
                return (defpackage.vtx) aooh.q(optionalB);
            }
            j$.util.Optional optionalA2 = vchVar.a(vziVar);
            aooh.e(optionalA2, "create(...)");
            return (defpackage.vtx) aooh.q(optionalA2);
        }
        switch (vziVar.d) {
            case "vvm_type_rest":
                defpackage.vqy vqyVar = (defpackage.vqy) this.n.a();
                if (vziVar.h != -100) {
                    optionalA = ((defpackage.vud) vqyVar.b).a(vziVar);
                } else {
                    akzx akzxVarM = defpackage.vtx.a.m();
                    akzxVarM.u();
                    defpackage.vtx vtxVar = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar.c = vziVar;
                    vtxVar.b |= 1;
                    android.content.Context context = (android.content.Context) vqyVar.c;
                    java.lang.String string = context.getString(2132020921);
                    akzxVarM.u();
                    defpackage.vtx vtxVar2 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(string);
                    vtxVar2.b |= 2;
                    vtxVar2.d = string;
                    java.lang.String string2 = context.getString(2132020920);
                    akzxVarM.u();
                    defpackage.vtx vtxVar3 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(string2);
                    vtxVar3.b |= 4;
                    vtxVar3.e = string2;
                    akzxVarM.u();
                    defpackage.vtx vtxVar4 = (defpackage.vtx) akzxVarM.b;
                    vtxVar4.b |= 32;
                    vtxVar4.h = false;
                    defpackage.vtw vtwVarC = ((defpackage.vvb) vqyVar.a).c();
                    akzxVarM.u();
                    defpackage.vtx vtxVar5 = (defpackage.vtx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(vtwVarC);
                    vtxVar5.f = vtwVarC;
                    vtxVar5.b |= 8;
                    optionalA = j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
                }
                break;
            case "vvm_type_vvm3":
                optionalA = ((defpackage.zlr) this.k.a()).i(vziVar);
                break;
            case "vvm_type_vvm3_mvno":
                defpackage.zlr zlrVar = (defpackage.zlr) this.l.a();
                if (vziVar.h != -100) {
                    akzx akzxVarP = vziVar.p();
                    int i3 = vziVar.h;
                    if (i3 != -9998 && i3 != -9008 && i3 != -301 && i3 != -99 && i3 != -1 && i3 != -9006 && i3 != -9005 && i3 != -9003 && i3 != -9002) {
                        switch (i3) {
                            default:
                                switch (i3) {
                                    case -103:
                                    case -102:
                                    case -101:
                                        break;
                                    default:
                                        akzxVarP.u();
                                        vzi vziVar2 = akzxVarP.b;
                                        vziVar2.b |= 32;
                                        vziVar2.h = i3;
                                        break;
                                }
                            case -9996:
                            case -9995:
                            case -9994:
                            case -9993:
                            case -9992:
                            case -9991:
                            case -9990:
                                akzxVarP.u();
                                vzi vziVar3 = akzxVarP.b;
                                vziVar3.b |= 32;
                                vziVar3.h = 4;
                                break;
                        }
                    } else {
                        akzxVarP.u();
                        vzi vziVar4 = akzxVarP.b;
                        vziVar4.b |= 32;
                        vziVar4.h = 4;
                    }
                    int i4 = vziVar.j;
                    if (i4 != -9009) {
                        akzxVarP.u();
                        vzi vziVar5 = akzxVarP.b;
                        vziVar5.b |= 128;
                        vziVar5.j = i4;
                    } else {
                        akzxVarP.u();
                        vzi vziVar6 = akzxVarP.b;
                        vziVar6.b |= 128;
                        vziVar6.j = 1;
                    }
                    int i5 = vziVar.i;
                    if (i5 == -9999 || i5 == -9997 || i5 == -9989) {
                        akzxVarP.u();
                        vzi vziVar7 = akzxVarP.b;
                        vziVar7.b |= 64;
                        vziVar7.i = 5;
                    } else if (i5 == -9007) {
                        akzxVarP.u();
                        vzi vziVar8 = akzxVarP.b;
                        vziVar8.b |= 64;
                        vziVar8.i = 6;
                    } else if (i5 == -9004) {
                        akzxVarP.u();
                        vzi vziVar9 = akzxVarP.b;
                        vziVar9.b |= 64;
                        vziVar9.i = 2;
                    } else if (i5 != -9001) {
                        akzxVarP.u();
                        vzi vziVar10 = akzxVarP.b;
                        vziVar10.b |= 64;
                        vziVar10.i = i5;
                    } else {
                        akzxVarP.u();
                        vzi vziVar11 = akzxVarP.b;
                        vziVar11.b |= 64;
                        vziVar11.i = 4;
                    }
                    optionalA = ((defpackage.vud) zlrVar.c).a(akzxVarP.p());
                } else {
                    zlrVar.b.n(rmw.T);
                    akzx akzxVarM2 = defpackage.vtx.a.m();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar6 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar6.c = vziVar;
                    vtxVar6.b |= 1;
                    android.content.Context context2 = (android.content.Context) zlrVar.d;
                    java.lang.String string3 = context2.getString(2132020921);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar7 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string3);
                    vtxVar7.b |= 2;
                    vtxVar7.d = string3;
                    java.lang.String string4 = context2.getString(2132020920);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar8 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string4);
                    vtxVar8.b |= 4;
                    vtxVar8.e = string4;
                    boolean zJ = defpackage.zlr.j(vziVar);
                    akzxVarM2.u();
                    defpackage.vtx vtxVar9 = (defpackage.vtx) akzxVarM2.b;
                    vtxVar9.b |= 32;
                    vtxVar9.h = zJ;
                    defpackage.vtw vtwVarC2 = ((defpackage.vvb) zlrVar.a).c();
                    akzxVarM2.u();
                    defpackage.vtx vtxVar10 = (defpackage.vtx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vtwVarC2);
                    vtxVar10.f = vtwVarC2;
                    vtxVar10.b |= 8;
                    optionalA = j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
                }
                break;
            case "vvm_type_advvm":
                defpackage.vqy vqyVar2 = (defpackage.vqy) this.j.a();
                int i6 = vziVar.h;
                if (i6 == -7001) {
                    akzx akzxVarM3 = defpackage.vtx.a.m();
                    akzxVarM3.u();
                    defpackage.vtx vtxVar11 = (defpackage.vtx) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar11.c = vziVar;
                    vtxVar11.b |= 1;
                    android.content.Context context3 = (android.content.Context) vqyVar2.a;
                    java.lang.String string5 = context3.getString(2132017301);
                    akzxVarM3.u();
                    defpackage.vtx vtxVar12 = (defpackage.vtx) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(string5);
                    vtxVar12.b |= 2;
                    vtxVar12.d = string5;
                    akzxVarM3.u();
                    defpackage.vtx vtxVar13 = (defpackage.vtx) akzxVarM3.b;
                    vtxVar13.b |= 32;
                    vtxVar13.h = true;
                    java.lang.String string6 = context3.getString(2132017299);
                    akzxVarM3.u();
                    defpackage.vtx vtxVar14 = (defpackage.vtx) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(string6);
                    vtxVar14.b |= 4;
                    vtxVar14.e = string6;
                    java.lang.Object obj = vqyVar2.c;
                    if (z) {
                        akzx akzxVarM4 = defpackage.vtw.a.m();
                        akzxVarM4.u();
                        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM4.b;
                        vtwVar2.c = 6;
                        vtwVar2.b |= 1;
                        java.lang.String string7 = ((defpackage.vvb) obj).b.getString(2132017298);
                        akzxVarM4.u();
                        defpackage.vtw vtwVar3 = (defpackage.vtw) akzxVarM4.b;
                        j$.util.Objects.requireNonNull(string7);
                        vtwVar3.b |= 2;
                        vtwVar3.d = string7;
                        vtwVar = (defpackage.vtw) akzxVarM4.p();
                    } else {
                        akzx akzxVarM5 = defpackage.vtw.a.m();
                        akzxVarM5.u();
                        defpackage.vtw vtwVar4 = (defpackage.vtw) akzxVarM5.b;
                        vtwVar4.c = 7;
                        vtwVar4.b |= 1;
                        java.lang.String string8 = ((defpackage.vvb) obj).b.getString(2132017300);
                        akzxVarM5.u();
                        defpackage.vtw vtwVar5 = (defpackage.vtw) akzxVarM5.b;
                        j$.util.Objects.requireNonNull(string8);
                        vtwVar5.b |= 2;
                        vtwVar5.d = string8;
                        vtwVar = (defpackage.vtw) akzxVarM5.p();
                    }
                    akzxVarM3.u();
                    defpackage.vtx vtxVar15 = (defpackage.vtx) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(vtwVar);
                    vtxVar15.f = vtwVar;
                    vtxVar15.b |= 8;
                    optionalA = j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
                } else if (i6 != -100) {
                    optionalA = ((defpackage.vud) vqyVar2.b).a(vziVar);
                } else {
                    akzx akzxVarM6 = defpackage.vtx.a.m();
                    akzxVarM6.u();
                    defpackage.vtx vtxVar16 = (defpackage.vtx) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(vziVar);
                    vtxVar16.c = vziVar;
                    vtxVar16.b |= 1;
                    android.content.Context context4 = (android.content.Context) vqyVar2.a;
                    java.lang.String string9 = context4.getString(2132020921);
                    akzxVarM6.u();
                    defpackage.vtx vtxVar17 = (defpackage.vtx) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(string9);
                    vtxVar17.b |= 2;
                    vtxVar17.d = string9;
                    java.lang.String string10 = context4.getString(2132020920);
                    akzxVarM6.u();
                    defpackage.vtx vtxVar18 = (defpackage.vtx) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(string10);
                    vtxVar18.b |= 4;
                    vtxVar18.e = string10;
                    akzxVarM6.u();
                    defpackage.vtx vtxVar19 = (defpackage.vtx) akzxVarM6.b;
                    vtxVar19.b |= 32;
                    vtxVar19.h = false;
                    defpackage.vtw vtwVarC3 = ((defpackage.vvb) vqyVar2.c).c();
                    akzxVarM6.u();
                    defpackage.vtx vtxVar20 = (defpackage.vtx) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(vtwVarC3);
                    vtxVar20.f = vtwVarC3;
                    vtxVar20.b |= 8;
                    optionalA = j$.util.Optional.of((defpackage.vtx) akzxVarM6.p());
                }
                break;
            default:
                optionalA = ((defpackage.vud) this.m.a()).a(vziVar);
                break;
        }
        aooh.c(optionalA);
        return (defpackage.vtx) aooh.q(optionalA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, aoln aolnVar) {
        defpackage.vvh vvhVar;
        if (aolnVar instanceof defpackage.vvh) {
            vvhVar = (defpackage.vvh) aolnVar;
            int i = vvhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvhVar.d = i - Integer.MIN_VALUE;
            } else {
                vvhVar = new defpackage.vvh(this, aolnVar);
            }
        } else {
            vvhVar = new defpackage.vvh(this, aolnVar);
        }
        java.lang.Object objD = vvhVar.b;
        aolu aoluVar = aolu.a;
        int i2 = vvhVar.d;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarB = this.r.b(phoneAccountHandle);
            vvhVar.a = z;
            vvhVar.d = 1;
            objD = aosv.D(ajcqVarB, vvhVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        z = vvhVar.a;
        aooc.af(objD);
        aooh.e(objD, "await(...)");
        vzi vziVar = (vzi) aooh.q((j$.util.Optional) objD);
        if (vziVar == null) {
            return null;
        }
        vvhVar.d = 2;
        java.lang.Object objA = a(vziVar, z, vvhVar);
        if (objA != aoluVar) {
            return objA;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(vcg vcgVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.vvi vviVar;
        vcg vcgVar2;
        android.telecom.PhoneAccountHandle phoneAccountHandle2;
        if (aolnVar instanceof defpackage.vvi) {
            vviVar = (defpackage.vvi) aolnVar;
            int i = vviVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vviVar.d = i - Integer.MIN_VALUE;
            } else {
                vviVar = new defpackage.vvi(this, aolnVar);
            }
        } else {
            vviVar = new defpackage.vvi(this, aolnVar);
        }
        java.lang.Object objD = vviVar.b;
        aolu aoluVar = aolu.a;
        int i2 = vviVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = vviVar.e;
                vcgVar = (vcg) vviVar.a;
                aooc.af(objD);
            } else {
                if (i2 == 2) {
                    phoneAccountHandle2 = vviVar.e;
                    vcgVar2 = (vcg) vviVar.a;
                    aooc.af(objD);
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        return defpackage.vvd.b;
                    }
                    ajcq ajcqVarN = vcgVar2.n(phoneAccountHandle2);
                    aooh.e(ajcqVarN, "requiresDefaultDataSim(...)");
                    vviVar.a = phoneAccountHandle2;
                    vviVar.e = null;
                    vviVar.d = 3;
                    objD = aosv.D(ajcqVarN, vviVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        vaf vafVar = this.p;
                        vviVar.a = null;
                        vviVar.d = 4;
                        objD = vafVar.b(phoneAccountHandle2, vviVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return null;
                }
                if (i2 == 3) {
                    phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) vviVar.a;
                    aooc.af(objD);
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        vaf vafVar2 = this.p;
                        vviVar.a = null;
                        vviVar.d = 4;
                        objD = vafVar2.b(phoneAccountHandle2, vviVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return null;
                }
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            if (!((java.lang.Boolean) objD).booleanValue()) {
                return defpackage.vvd.c;
            }
            return null;
        }
        aooc.af(objD);
        ajcq ajcqVarH = vcgVar.h(phoneAccountHandle);
        aooh.e(ajcqVarH, "isCarrierAppInstalled(...)");
        vviVar.a = vcgVar;
        vviVar.e = phoneAccountHandle;
        vviVar.d = 1;
        objD = aosv.D(ajcqVarH, vviVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objD).booleanValue()) {
            return defpackage.vvd.a;
        }
        aolr aolrVar = this.o;
        defpackage.tyf tyfVar = new defpackage.tyf(this, phoneAccountHandle, (aoln) null, 5);
        vviVar.a = vcgVar;
        vviVar.e = phoneAccountHandle;
        vviVar.d = 2;
        objD = aoov.aj(aolrVar, tyfVar, vviVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        android.telecom.PhoneAccountHandle phoneAccountHandle3 = phoneAccountHandle;
        vcgVar2 = vcgVar;
        phoneAccountHandle2 = phoneAccountHandle3;
        if (((java.lang.Boolean) objD).booleanValue()) {
            return defpackage.vvd.b;
        }
        ajcq ajcqVarN2 = vcgVar2.n(phoneAccountHandle2);
        aooh.e(ajcqVarN2, "requiresDefaultDataSim(...)");
        vviVar.a = phoneAccountHandle2;
        vviVar.e = null;
        vviVar.d = 3;
        objD = aosv.D(ajcqVarN2, vviVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objD).booleanValue()) {
            vaf vafVar3 = this.p;
            vviVar.a = null;
            vviVar.d = 4;
            objD = vafVar3.b(phoneAccountHandle2, vviVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            if (!((java.lang.Boolean) objD).booleanValue()) {
                return defpackage.vvd.c;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.vvj vvjVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.vvj) {
            vvjVar = (defpackage.vvj) aolnVar;
            int i = vvjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvjVar.c = i - Integer.MIN_VALUE;
            } else {
                vvjVar = new defpackage.vvj(this, aolnVar);
            }
        } else {
            vvjVar = new defpackage.vvj(this, aolnVar);
        }
        java.lang.Object objO = vvjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vvjVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objO);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objO);
            }
            str = (java.lang.String) objO;
            if (str != null && str.length() != 0 && !aooh.n(str, this.b.getPackageName())) {
                return defpackage.vvd.a;
            }
            return null;
        }
        aooc.af(objO);
        oko okoVar = this.q;
        vvjVar.c = 1;
        objO = okoVar.O(phoneAccountHandle, vvjVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        oko okoVar2 = (oko) objO;
        if (okoVar2 != null) {
            vvjVar.c = 2;
            objO = aoov.aj(okoVar2.e, new okl(okoVar2, (aoln) null, 9, (short[][]) null), vvjVar);
            if (objO == aoluVar) {
                return aoluVar;
            }
            str = (java.lang.String) objO;
            if (str != null) {
                return defpackage.vvd.a;
            }
        }
        return null;
    }
}
