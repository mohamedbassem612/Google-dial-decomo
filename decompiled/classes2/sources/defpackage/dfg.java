package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dfg {
    public static final void a(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.dispatchOnScrollChanged();
    }

    public static final java.lang.String b(java.lang.Object obj) {
        java.lang.String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        java.lang.String str = java.lang.String.format("%07x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1));
        aooh.e(str, "format(...)");
        return name + '@' + str;
    }

    public static final java.lang.Object c(dao daoVar, aomy aomyVar, aoln aolnVar) {
        cmv cmvVar;
        cxi cxiVarY;
        java.lang.Object objD;
        dce dceVar;
        if (daoVar.L().D) {
            if (!daoVar.L().D) {
                cwh.d("visitAncestors called on an unattached node");
            }
            cmv cmvVar2 = daoVar.L().w;
            dbk dbkVarA = cfo.A(daoVar);
            loop0: while (true) {
                cmvVar = null;
                if (dbkVarA == null) {
                    break;
                }
                if ((dbkVarA.v.f.v & 524288) != 0) {
                    while (cmvVar2 != null) {
                        if ((cmvVar2.u & 524288) != 0) {
                            cmv cmvVarX = cmvVar2;
                            cfc cfcVar = null;
                            while (cmvVarX != null) {
                                if (cmvVarX instanceof dhd) {
                                    cmvVar = cmvVarX;
                                    break loop0;
                                }
                                if ((cmvVarX.u & 524288) != 0 && (cmvVarX instanceof dap)) {
                                    int i = 0;
                                    for (cmv cmvVar3 = ((dap) cmvVarX).F; cmvVar3 != null; cmvVar3 = cmvVar3.x) {
                                        if ((cmvVar3.u & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cmvVarX = cmvVar3;
                                            } else {
                                                if (cfcVar == null) {
                                                    cfcVar = new cfc(new cmv[16]);
                                                }
                                                if (cmvVarX != null) {
                                                    cfcVar.n(cmvVarX);
                                                }
                                                cfcVar.n(cmvVar3);
                                                cmvVarX = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cmvVarX = cfo.x(cfcVar);
                            }
                        }
                        cmvVar2 = cmvVar2.w;
                    }
                }
                dbkVarA = dbkVarA.k();
                cmvVar2 = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
            }
            dhd dhdVar = (dhd) cmvVar;
            if (dhdVar != null && (objD = dhdVar.d((cxiVarY = cfo.y(daoVar)), new defpackage.bxq(aomyVar, cxiVarY, 9), aolnVar)) == aolu.a) {
                return objD;
            }
        }
        return aojh.a;
    }

    public static final boolean d(java.util.List list) {
        aokc aokcVar;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            aokcVar = aokc.a;
        } else {
            aokc arrayList = new java.util.ArrayList();
            java.lang.Object obj = list.get(0);
            int size = list.size() - 1;
            int i = 0;
            while (i < size) {
                i++;
                java.lang.Object obj2 = list.get(i);
                dij dijVar = (dij) obj2;
                dij dijVar2 = (dij) obj;
                arrayList.add(new cpm((((long) java.lang.Float.floatToRawIntBits(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (dijVar2.b().b() >> 32)) - java.lang.Float.intBitsToFloat((int) (dijVar.b().b() >> 32))))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (dijVar2.b().b() & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (dijVar.b().b() & 4294967295L))))) & 4294967295L)));
                obj = obj2;
            }
            aokcVar = arrayList;
        }
        if (aokcVar.size() != 1) {
            if (aokcVar.isEmpty()) {
                dpy.b("Empty collection can't be reduced.");
            }
            if (aokcVar.isEmpty()) {
                throw new java.util.NoSuchElementException("List is empty.");
            }
            java.lang.Object cpmVar = aokcVar.get(0);
            int size2 = aokcVar.size() - 1;
            if (size2 > 0) {
                int i2 = 1;
                while (true) {
                    cpmVar = new cpm(mni.bl(((cpm) cpmVar).a, ((cpm) aokcVar.get(i2)).a));
                    if (i2 == size2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((cpm) cpmVar).a;
        } else {
            if (aokcVar.isEmpty()) {
                throw new java.util.NoSuchElementException("List is empty.");
            }
            j = ((cpm) aokcVar.get(0)).a;
        }
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) < java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean e(dij dijVar) {
        return (dijVar.h().g(din.f) == null && dijVar.h().g(din.e) == null) ? false : true;
    }
}
