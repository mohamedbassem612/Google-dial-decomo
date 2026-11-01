package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfb {
    public static final void A(android.text.Spannable spannable, defpackage.dnx dnxVar, int i, int i2) {
        if (dnxVar != null) {
            int i3 = dnxVar.c;
            java.util.Locale[] localeArr = new java.util.Locale[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                localeArr[i4] = dnxVar.a(i4).a;
            }
            spannable.setSpan(new android.text.style.LocaleSpan(new android.os.LocaleList(localeArr)), i, i2, 33);
        }
    }

    public static final void B() {
        long j = defpackage.dps.a[0].a;
    }

    public static final boolean a(android.view.View view) {
        return baa$.ExternalSyntheticApiModelOutline1.m(view);
    }

    public static final boolean b(java.lang.Object obj) {
        java.lang.Object objA;
        if (obj instanceof defpackage.clb) {
            defpackage.clb clbVar = (defpackage.clb) obj;
            defpackage.cen cenVarF = clbVar.f();
            if ((cenVarF == defpackage.cdu.b || cenVarF == defpackage.cdu.c || cenVarF == defpackage.cdu.a) && ((objA = clbVar.a()) == null || b(objA))) {
                return true;
            }
        } else if ((!(obj instanceof defpackage.aoio) || !(obj instanceof java.io.Serializable)) && ((obj instanceof android.os.Parcelable) || (obj instanceof java.io.Serializable) || (obj instanceof android.os.Binder) || (obj instanceof android.util.Size) || (obj instanceof android.util.SizeF) || (obj instanceof android.util.SparseArray))) {
            return true;
        }
        return false;
    }

    public static final void c(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.z, defpackage.aojh.a);
    }

    public static final void d(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.j, defpackage.aojh.a);
    }

    public static final void e(defpackage.diq diqVar, java.lang.String str, defpackage.aomy aomyVar) {
        diqVar.a(defpackage.did.u, new defpackage.dhr(str, aomyVar));
    }

    public static final void f(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.h, defpackage.aojh.a);
    }

    public static final void g(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.q, defpackage.aojh.a);
    }

    public static final void h(defpackage.diq diqVar, java.lang.String str, defpackage.aomy aomyVar) {
        diqVar.a(defpackage.did.b, new defpackage.dhr(str, aomyVar));
    }

    public static final void i(defpackage.diq diqVar, java.lang.String str, defpackage.aomy aomyVar) {
        diqVar.a(defpackage.did.c, new defpackage.dhr(str, aomyVar));
    }

    public static final void j(defpackage.diq diqVar, java.lang.String str) {
        defpackage.dip dipVar = defpackage.din.a;
        java.util.List listSingletonList = java.util.Collections.singletonList(str);
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        diqVar.a(dipVar, listSingletonList);
    }

    public static final void k(defpackage.diq diqVar, java.util.List list) {
        diqVar.a(defpackage.did.w, list);
    }

    public static final void l(defpackage.diq diqVar, int i) {
        diqVar.a(defpackage.din.k, new dhz(i));
    }

    public static final void m(defpackage.diq diqVar, java.lang.String str) {
        diqVar.a(defpackage.din.d, str);
    }

    public static final void n(defpackage.diq diqVar, dia diaVar) {
        diqVar.a(defpackage.din.c, diaVar);
    }

    public static final void o(defpackage.diq diqVar, int i) {
        diqVar.a(defpackage.din.A, new defpackage.dib(i));
    }

    public static final void p(defpackage.diq diqVar, boolean z) {
        diqVar.a(defpackage.din.K, java.lang.Boolean.valueOf(z));
    }

    public static final void q(defpackage.diq diqVar, java.lang.String str) {
        diqVar.a(defpackage.din.b, str);
    }

    public static final void r(defpackage.diq diqVar, float f) {
        diqVar.a(defpackage.din.u, java.lang.Float.valueOf(f));
    }

    public static final void s(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.n, java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062 A[LOOP:0: B:5:0x000d->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0065 A[EDGE_INSN: B:45:0x0065->B:36:0x0065 BREAK  A[LOOP:0: B:5:0x000d->B:35:0x0062], SYNTHETIC] */
    public static final defpackage.dij t(defpackage.dbk dbkVar, boolean z) {
        defpackage.dce dceVar = dbkVar.v;
        java.lang.Object obj = null;
        if ((dceVar.a() & 8) != 0) {
            loop0: for (defpackage.cmv cmvVar = dceVar.f; cmvVar != null; cmvVar = cmvVar.x) {
                if ((cmvVar.u & 8) == 0) {
                    if ((cmvVar.v & 8) != 0) {
                        break;
                        break;
                    }
                } else {
                    defpackage.cmv cmvVarX = cmvVar;
                    defpackage.cfc cfcVar = null;
                    while (cmvVarX != null) {
                        if (cmvVarX instanceof defpackage.ddc) {
                            obj = cmvVarX;
                            break loop0;
                        }
                        if ((cmvVarX.u & 8) != 0 && (cmvVarX instanceof defpackage.dap)) {
                            int i = 0;
                            for (defpackage.cmv cmvVar2 = ((defpackage.dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                if ((cmvVar2.u & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cmvVarX = cmvVar2;
                                    } else {
                                        if (cfcVar == null) {
                                            cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                        }
                                        if (cmvVarX != null) {
                                            cfcVar.n(cmvVarX);
                                        }
                                        cfcVar.n(cmvVar2);
                                        cmvVarX = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        cmvVarX = defpackage.cfo.x(cfcVar);
                    }
                    if ((cmvVar.v & 8) != 0) {
                        break;
                    }
                }
            }
        }
        if (obj == null) {
            defpackage.aooh.g();
        }
        defpackage.cmv cmvVarL = ((defpackage.ddc) obj).L();
        defpackage.die dieVarQ = dbkVar.q();
        if (dieVarQ == null) {
            dieVarQ = new defpackage.die();
        }
        return new defpackage.dij(cmvVarL, z, dbkVar, dieVarQ);
    }

    public static final boolean u(defpackage.dks dksVar) {
        return (dksVar.f == null && dksVar.d == null && dksVar.c == null) ? false : true;
    }

    public static final float v(long j, float f, defpackage.dpf dpfVar) {
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        long j2 = defpackage.dps.a[2].a;
        if (j2 == 4294967296L) {
            return dpfVar.dk(j);
        }
        if (j2 != 8589934592L) {
            return Float.NaN;
        }
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f;
    }

    public static final float w(long j, float f, defpackage.dpf dpfVar) {
        float fIntBitsToFloat;
        long j2 = defpackage.dps.a[(int) ((1095216660480L & j) >>> 32)].a;
        if (j2 == 4294967296L) {
            if (dpfVar.b() <= 1.05d) {
                return dpfVar.dk(j);
            }
            fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (dpfVar.dt(f) & 4294967295L));
        } else {
            if (j2 != 8589934592L) {
                return Float.NaN;
            }
            fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return fIntBitsToFloat * f;
    }

    public static final void x(android.text.Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            float[] fArr = defpackage.crp.a;
            spannable.setSpan(new android.text.style.BackgroundColorSpan((int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32)), i, i2, 33);
        }
    }

    public static final void y(android.text.Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            float[] fArr = defpackage.crp.a;
            spannable.setSpan(new android.text.style.ForegroundColorSpan((int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32)), i, i2, 33);
        }
    }

    public static final void z(android.text.Spannable spannable, long j, defpackage.dpf dpfVar, int i, int i2) {
        long j2 = defpackage.dps.a[(int) ((1095216660480L & j) >>> 32)].a;
        if (j2 == 4294967296L) {
            spannable.setSpan(new android.text.style.AbsoluteSizeSpan(defpackage.aopc.i(dpfVar.dk(j)), false), i, i2, 33);
        } else if (j2 == 8589934592L) {
            spannable.setSpan(new android.text.style.RelativeSizeSpan(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))), i, i2, 33);
        }
    }
}
