package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hmb extends defpackage.aomh implements defpackage.aonn {
    int a;
    int b;
    final /* synthetic */ defpackage.hmd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmb(defpackage.hmd hmdVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.c = hmdVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.hmb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objAj;
        int i;
        java.lang.Object objAu;
        int i2;
        boolean z;
        boolean z2;
        java.lang.Object objAj2;
        boolean z3;
        defpackage.hmd hmdVar;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = this.b;
        char c = 2;
        if (i3 != 0) {
            if (i3 == 1) {
                defpackage.aooc.af(obj);
                objAj = obj;
            } else if (i3 == 2) {
                i = this.a;
                defpackage.aooc.af(obj);
                objAu = obj;
                i2 = ((defpackage.hme) objAu).b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        c = 3;
                    } else if (i2 != 2) {
                        c = 0;
                    } else {
                        c = 4;
                    }
                }
                if (c == 0) {
                    c = 1;
                }
                if (1 != i) {
                    z = false;
                } else {
                    z = true;
                }
                defpackage.aimz aimzVar = defpackage.hmd.a;
                defpackage.aimw aimwVar = (defpackage.aimw) aimzVar.b().l("com/android/dialer/androidauto/impl/carservice/DialerCarAppServiceStateUpdater", "updateCarAppServiceState$<anonymous>", 57, "DialerCarAppServiceStateUpdater.kt");
                if (c == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aimwVar.L("CarAppService enabled state: desiredValue: %s, protoStoreValue: %s", z, z2);
                if (i != 0 ? c != 4 : c != 3) {
                    defpackage.hmd hmdVar2 = this.c;
                    this.a = i;
                    this.b = 3;
                    objAj2 = defpackage.aoov.aj(hmdVar2.e, new jcm(hmdVar2, z, (defpackage.aoln) null, 1), this);
                    if (objAj2 != aoluVar) {
                        objAj2 = defpackage.aojh.a;
                    }
                    if (objAj2 == aoluVar) {
                        return aoluVar;
                    }
                    if (1 != i) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    hmdVar = this.c;
                    this.b = 4;
                    if (hmdVar.a(z3, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/androidauto/impl/carservice/DialerCarAppServiceStateUpdater", "updateCarAppServiceState$<anonymous>", 70, "DialerCarAppServiceStateUpdater.kt")).v("Skipping CarAppService PackageManager state update");
                }
            } else if (i3 != 3) {
                defpackage.aooc.af(obj);
            } else {
                i = this.a;
                defpackage.aooc.af(obj);
                if (1 != i) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                hmdVar = this.c;
                this.b = 4;
                if (hmdVar.a(z3, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            defpackage.hmd hmdVar3 = this.c;
            this.b = 1;
            objAj = defpackage.aoov.aj(hmdVar3.e, new defpackage.hma(hmdVar3, null), this);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            i = 0;
        }
        defpackage.hmd hmdVar4 = this.c;
        this.a = i;
        this.b = 2;
        objAu = defpackage.aoov.au(hmdVar4.g.b(), this);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        i2 = ((defpackage.hme) objAu).b;
        if (i2 != 0) {
            if (i2 == 1) {
                c = 3;
            } else if (i2 != 2) {
                c = 0;
            } else {
                c = 4;
            }
        }
        if (c == 0) {
            c = 1;
        }
        if (1 != i) {
            z = false;
        } else {
            z = true;
        }
        defpackage.aimz aimzVar2 = defpackage.hmd.a;
        defpackage.aimw aimwVar2 = (defpackage.aimw) aimzVar2.b().l("com/android/dialer/androidauto/impl/carservice/DialerCarAppServiceStateUpdater", "updateCarAppServiceState$<anonymous>", 57, "DialerCarAppServiceStateUpdater.kt");
        if (c == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        aimwVar2.L("CarAppService enabled state: desiredValue: %s, protoStoreValue: %s", z, z2);
        if (i != 0) {
            defpackage.hmd hmdVar5 = this.c;
            this.a = i;
            this.b = 3;
            objAj2 = defpackage.aoov.aj(hmdVar5.e, new jcm(hmdVar5, z, (defpackage.aoln) null, 1), this);
            if (objAj2 != aoluVar) {
                objAj2 = defpackage.aojh.a;
            }
            if (objAj2 == aoluVar) {
                return aoluVar;
            }
            if (1 != i) {
                z3 = false;
            } else {
                z3 = true;
            }
            hmdVar = this.c;
            this.b = 4;
            if (hmdVar.a(z3, this) == aoluVar) {
                return aoluVar;
            }
        } else {
            defpackage.hmd hmdVar6 = this.c;
            this.a = i;
            this.b = 3;
            objAj2 = defpackage.aoov.aj(hmdVar6.e, new jcm(hmdVar6, z, (defpackage.aoln) null, 1), this);
            if (objAj2 != aoluVar) {
                objAj2 = defpackage.aojh.a;
            }
            if (objAj2 == aoluVar) {
                return aoluVar;
            }
            if (1 != i) {
                z3 = false;
            } else {
                z3 = true;
            }
            hmdVar = this.c;
            this.b = 4;
            if (hmdVar.a(z3, this) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
        if (((java.lang.Boolean) objAj).booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        defpackage.hmd hmdVar7 = this.c;
        this.a = i;
        this.b = 2;
        objAu = defpackage.aoov.au(hmdVar7.g.b(), this);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        i2 = ((defpackage.hme) objAu).b;
        if (i2 != 0) {
            if (i2 == 1) {
                c = 3;
            } else if (i2 != 2) {
                c = 0;
            } else {
                c = 4;
            }
        }
        if (c == 0) {
            c = 1;
        }
        if (1 != i) {
            z = false;
        } else {
            z = true;
        }
        defpackage.aimz aimzVar3 = defpackage.hmd.a;
        defpackage.aimw aimwVar3 = (defpackage.aimw) aimzVar3.b().l("com/android/dialer/androidauto/impl/carservice/DialerCarAppServiceStateUpdater", "updateCarAppServiceState$<anonymous>", 57, "DialerCarAppServiceStateUpdater.kt");
        if (c == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        aimwVar3.L("CarAppService enabled state: desiredValue: %s, protoStoreValue: %s", z, z2);
        if (i != 0) {
            defpackage.hmd hmdVar8 = this.c;
            this.a = i;
            this.b = 3;
            objAj2 = defpackage.aoov.aj(hmdVar8.e, new jcm(hmdVar8, z, (defpackage.aoln) null, 1), this);
            if (objAj2 != aoluVar) {
                objAj2 = defpackage.aojh.a;
            }
            if (objAj2 == aoluVar) {
                return aoluVar;
            }
            if (1 != i) {
                z3 = false;
            } else {
                z3 = true;
            }
            hmdVar = this.c;
            this.b = 4;
            if (hmdVar.a(z3, this) == aoluVar) {
                return aoluVar;
            }
        } else {
            defpackage.hmd hmdVar9 = this.c;
            this.a = i;
            this.b = 3;
            objAj2 = defpackage.aoov.aj(hmdVar9.e, new jcm(hmdVar9, z, (defpackage.aoln) null, 1), this);
            if (objAj2 != aoluVar) {
                objAj2 = defpackage.aojh.a;
            }
            if (objAj2 == aoluVar) {
                return aoluVar;
            }
            if (1 != i) {
                z3 = false;
            } else {
                z3 = true;
            }
            hmdVar = this.c;
            this.b = 4;
            if (hmdVar.a(z3, this) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.hmb(this.c, aolnVar);
    }
}
