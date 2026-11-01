package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cxy implements defpackage.cap {
    public final defpackage.dbk a;
    public defpackage.caz b;
    public defpackage.czq c;
    public int d;
    public int e;
    public final defpackage.cxs f;
    public final defpackage.cxp g;
    public final defpackage.cfc h;
    public int i;
    public int j;
    public final java.lang.String k;
    public final defpackage.adw l;
    public final defpackage.adw m;
    public final defpackage.adw n;
    public final defpackage.adw o;
    private final defpackage.czp p;

    public cxy(defpackage.dbk dbkVar, defpackage.czq czqVar) {
        this.a = dbkVar;
        this.c = czqVar;
        long[] jArr = defpackage.adx.a;
        this.l = new defpackage.adw(6);
        this.m = new defpackage.adw(6);
        this.f = new defpackage.cxs(this);
        this.g = new defpackage.cxp(this);
        this.n = new defpackage.adw(6);
        defpackage.ads adsVar = defpackage.adt.a;
        this.p = new defpackage.czp(new defpackage.ads(6));
        this.o = new defpackage.adw(6);
        this.h = new defpackage.cfc(new java.lang.Object[16]);
        this.k = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final defpackage.dcs o() {
        return ((defpackage.deg) defpackage.dbn.a(this.a)).ac();
    }

    private final java.lang.Object p(java.util.List list, int i) {
        java.lang.Object objA = this.l.a((defpackage.dbk) list.get(i));
        if (objA == null) {
            defpackage.aooh.g();
        }
        return ((defpackage.cxq) objA).a;
    }

    private final void q(defpackage.cxq cxqVar, boolean z) {
        defpackage.cbb cbbVar;
        if (z || !cxqVar.f) {
            cxqVar.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
        } else {
            cxqVar.e.b(java.lang.Boolean.FALSE);
        }
        if (cxqVar.h != null) {
            r(cxqVar);
            return;
        }
        if (z) {
            defpackage.cbb cbbVar2 = cxqVar.g;
            if (cbbVar2 != null) {
                cbbVar2.m();
                return;
            }
            return;
        }
        defpackage.dcs dcsVarO = o();
        if (dcsVarO != null) {
            dcsVarO.m(new bup(cxqVar, 12));
        } else {
            if (cxqVar.f || (cbbVar = cxqVar.g) == null) {
                return;
            }
            cbbVar.m();
        }
    }

    private static final void r(defpackage.cxq cxqVar) {
        defpackage.ady adyVar;
        ccy ccyVar = cxqVar.h;
        if (ccyVar != null) {
            ccyVar.d.set(cdb.a);
            defpackage.cjh cjhVar = ccyVar.f;
            if (cjhVar.h.c()) {
                adyVar = cjhVar.h;
                defpackage.ady adyVar2 = defpackage.adz.a;
                cjhVar.h = new defpackage.ady(6);
                cjhVar.b.g();
            } else {
                adyVar = null;
            }
            cjhVar.b();
            ccyVar.a.q(adyVar);
            cxqVar.h = null;
            defpackage.cbb cbbVar = cxqVar.g;
            if (cbbVar != null) {
                cbbVar.d();
            }
            cxqVar.g = null;
        }
    }

    private static final void s(defpackage.dbk dbkVar) {
        dbkVar.n().G = 3;
        defpackage.dbv dbvVarM = dbkVar.m();
        if (dbvVarM != null) {
            dbvVarM.y = 3;
        }
    }

    public final czn a(java.lang.Object obj) {
        return !this.a.al() ? new cxv() : new cxw(this, obj);
    }

    @Override // defpackage.cap
    public final void b() {
        k(true);
    }

    @Override // defpackage.cap
    public final void c() {
        g();
    }

    public final defpackage.dbk d(int i) {
        defpackage.dbk dbkVar = new defpackage.dbk(true, 2, null);
        defpackage.dbk dbkVar2 = this.a;
        dbkVar2.n = true;
        dbkVar2.E(i, dbkVar);
        dbkVar2.n = false;
        return dbkVar;
    }

    public final defpackage.dbk e(java.lang.Object obj) {
        int i;
        defpackage.dbk dbkVar = null;
        if (this.i != 0) {
            java.util.List listV = this.a.v();
            int size = listV.size() - this.j;
            int i2 = size - this.i;
            int i3 = size - 1;
            int i4 = i3;
            while (true) {
                if (i4 < i2) {
                    i = -1;
                    break;
                }
                if (defpackage.aooh.n(p(listV, i4), obj)) {
                    i = i4;
                    break;
                }
                i4--;
            }
            if (i == -1) {
                while (true) {
                    if (i3 < i2) {
                        i4 = i3;
                        i = -1;
                        break;
                    }
                    java.lang.Object objA = this.l.a((defpackage.dbk) listV.get(i3));
                    if (objA == null) {
                        defpackage.aooh.g();
                    }
                    defpackage.cxq cxqVar = (defpackage.cxq) objA;
                    java.lang.Object obj2 = cxqVar.a;
                    if (obj2 == defpackage.czl.a || this.c.b(obj, obj2)) {
                        cxqVar.a = obj;
                        i4 = i3;
                        i = i4;
                        break;
                    }
                    i3--;
                }
            }
            if (i != -1) {
                if (i4 != i2) {
                    n(i4, i2);
                }
                this.i--;
                dbkVar = (defpackage.dbk) listV.get(i2);
                java.lang.Object objA2 = this.l.a(dbkVar);
                if (objA2 == null) {
                    defpackage.aooh.g();
                }
                defpackage.cxq cxqVar2 = (defpackage.cxq) objA2;
                cxqVar2.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, defpackage.cdu.c);
                cxqVar2.d = true;
                cxqVar2.c = true;
            }
        }
        return dbkVar;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02ca A[Catch: all -> 0x02d5, TryCatch #18 {all -> 0x02d5, blocks: (B:149:0x02b3, B:150:0x02b6, B:157:0x02c6, B:159:0x02ca, B:160:0x02d4, B:151:0x02b7, B:152:0x02c1), top: B:201:0x0032 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final void f(defpackage.cxq cxqVar, boolean z) throws java.lang.Throwable {
        defpackage.cko ckoVar;
        cdd cddVar;
        ?? r8;
        int i;
        java.lang.Throwable th;
        defpackage.cko ckoVar2;
        int i2;
        java.lang.Throwable th2;
        int i3;
        int i4;
        ccy ccyVar = cxqVar.h;
        if (ccyVar != null) {
            defpackage.cko ckoVar3 = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar3 != null ? ckoVar3.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar3);
            try {
                defpackage.dbk dbkVar = this.a;
                dbkVar.n = true;
                if (z == 0) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = ccyVar.d;
                    cddVar = (cdg) atomicReference.get();
                    i = ((cdg) cddVar).b;
                    if (i != ((cdg) cdc.a).b) {
                    }
                    throw new java.lang.IllegalStateException("The paused composition has not completed yet");
                }
                while (!ccyVar.a()) {
                    try {
                        ccyVar.b(new cxo());
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        ckoVar = ckoVarH;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                        }
                    }
                }
                try {
                    java.util.concurrent.atomic.AtomicReference atomicReference2 = ccyVar.d;
                    cddVar = (cdg) atomicReference2.get();
                    try {
                        i = ((cdg) cddVar).b;
                        try {
                            if (i != ((cdg) cdc.a).b || i == ((cdg) cde.a).b || i == ((cdg) cdf.a).b) {
                                throw new java.lang.IllegalStateException("The paused composition has not completed yet");
                            }
                            cda cdaVar = cda.a;
                            if (i == ((cdg) cdaVar).b) {
                                android.os.Trace.beginSection("PausedComposition:applyChanges");
                                try {
                                    synchronized (ccyVar.c) {
                                        try {
                                            cdt cdtVar = ccyVar.g;
                                            defpackage.cah cahVar = ccyVar.b;
                                            defpackage.cjh cjhVar = ccyVar.f;
                                            defpackage.acm acmVar = cdtVar.a;
                                            int i5 = acmVar.b;
                                            defpackage.adq adqVar = cdtVar.b;
                                            z = cddVar;
                                            try {
                                                defpackage.adq adqVar2 = new defpackage.adq(16);
                                                ckoVar2 = ckoVar3;
                                                int i6 = 0;
                                                int i7 = 0;
                                                int i8 = 0;
                                                while (i7 < i5) {
                                                    int i9 = i5;
                                                    int i10 = i7 + 1;
                                                    try {
                                                        try {
                                                            switch (acmVar.a(i7)) {
                                                                case 0:
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    i3 = i7;
                                                                    cahVar.h();
                                                                    i7 = i10;
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                                case 1:
                                                                    i3 = i7;
                                                                    i4 = i6 + 1;
                                                                    cahVar.d(adqVar.c(i6));
                                                                    i7 = i10;
                                                                    i6 = i4;
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                                case 2:
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    i3 = i7;
                                                                    cahVar.l(acmVar.a(i10), acmVar.a(i3 + 2));
                                                                    i7 = i3 + 3;
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                                case 3:
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    i3 = i7;
                                                                    i7 = i3 + 4;
                                                                    cahVar.k(acmVar.a(i10), acmVar.a(i3 + 2), acmVar.a(i3 + 3));
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                                case 4:
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    i3 = i7;
                                                                    cahVar.c();
                                                                    i7 = i10;
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                                case 5:
                                                                    i3 = i7;
                                                                    i7 = i3 + 2;
                                                                    i4 = i6 + 1;
                                                                    cahVar.i(acmVar.a(i10), adqVar.c(i6));
                                                                    i6 = i4;
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    i3 = i7;
                                                                    i7 = i3 + 2;
                                                                    acmVar.a(i10);
                                                                    int i11 = i6 + 1;
                                                                    i6 = i11;
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    i3 = i7;
                                                                    int i12 = i6 + 1;
                                                                    java.lang.Object objC = adqVar.c(i6);
                                                                    if (objC == null) {
                                                                        defpackage.aooh.h("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                                                                    }
                                                                    defpackage.aoov.f(objC, 2);
                                                                    i6 += 2;
                                                                    cahVar.b((defpackage.aonn) objC, adqVar.c(i12));
                                                                    i7 = i10;
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                                                    i3 = i7;
                                                                    try {
                                                                        java.lang.Object obj = ((defpackage.cag) cahVar).b;
                                                                        aonjVarI = aonjVarI;
                                                                        try {
                                                                            if (obj instanceof defpackage.cap) {
                                                                                defpackage.cap capVar = (defpackage.cap) obj;
                                                                                ckoVarH = ckoVarH;
                                                                                try {
                                                                                    try {
                                                                                        if (cjhVar.d.m(capVar)) {
                                                                                            capVar.b();
                                                                                        }
                                                                                    } catch (java.lang.Exception e) {
                                                                                        e = e;
                                                                                        i2 = i3;
                                                                                        try {
                                                                                            throw new car(adqVar, adqVar2, acmVar, i2, e);
                                                                                        } catch (java.lang.Throwable th5) {
                                                                                            th2 = th5;
                                                                                            try {
                                                                                                cahVar.f();
                                                                                                throw th2;
                                                                                            } catch (java.lang.Throwable th6) {
                                                                                                th = th6;
                                                                                                try {
                                                                                                    ccyVar.f.b();
                                                                                                    ccyVar.a.q(null);
                                                                                                    throw th;
                                                                                                } catch (java.lang.Throwable th7) {
                                                                                                    th = th7;
                                                                                                    try {
                                                                                                        throw th;
                                                                                                    } catch (java.lang.Throwable th8) {
                                                                                                        th = th8;
                                                                                                        android.os.Trace.endSection();
                                                                                                        throw th;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (java.lang.Throwable th9) {
                                                                                    th2 = th9;
                                                                                    cahVar.f();
                                                                                    throw th2;
                                                                                }
                                                                            } else {
                                                                                ckoVarH = ckoVarH;
                                                                            }
                                                                            adqVar2.q(obj);
                                                                            cahVar.g();
                                                                            i7 = i10;
                                                                            i5 = i9;
                                                                            i8 = i3;
                                                                            aonjVarI = aonjVarI;
                                                                            ckoVarH = ckoVarH;
                                                                        } catch (java.lang.Exception e2) {
                                                                            e = e2;
                                                                            ckoVarH = ckoVarH;
                                                                            i2 = i3;
                                                                            throw new car(adqVar, adqVar2, acmVar, i2, e);
                                                                        } catch (java.lang.Throwable th10) {
                                                                            th2 = th10;
                                                                            ckoVarH = ckoVarH;
                                                                            cahVar.f();
                                                                            throw th2;
                                                                        }
                                                                    } catch (java.lang.Exception e3) {
                                                                        e = e3;
                                                                        aonjVarI = aonjVarI;
                                                                    }
                                                                    break;
                                                                default:
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    i3 = i7;
                                                                    i7 = i10;
                                                                    i5 = i9;
                                                                    i8 = i3;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVarH = ckoVarH;
                                                                    break;
                                                            }
                                                        } catch (java.lang.Throwable th11) {
                                                            th2 = th11;
                                                            ckoVarH = ckoVarH;
                                                            cahVar.f();
                                                            throw th2;
                                                        }
                                                    } catch (java.lang.Exception e4) {
                                                        e = e4;
                                                        aonjVarI = aonjVarI;
                                                        ckoVarH = ckoVarH;
                                                        i3 = i7;
                                                    }
                                                }
                                                aonjVarI = aonjVarI;
                                                ckoVarH = ckoVarH;
                                                try {
                                                    if (i6 != adqVar.b) {
                                                        defpackage.cax.b("Applier operation size mismatch");
                                                    }
                                                    adqVar.l();
                                                    acmVar.b = 0;
                                                    try {
                                                        cahVar.f();
                                                        cjhVar.c();
                                                        cjhVar.d();
                                                        try {
                                                            cjhVar.b();
                                                            ccyVar.a.q(null);
                                                            try {
                                                                try {
                                                                    try {
                                                                        android.os.Trace.endSection();
                                                                        ccz cczVar = ccz.a;
                                                                        if (!defpackage.anty.Q(atomicReference2, cdaVar, cczVar)) {
                                                                            try {
                                                                                defpackage.cdh.b("Unexpected state change from: " + cdaVar + " to: " + cczVar + '.');
                                                                            } catch (java.lang.Exception e5) {
                                                                                e = e5;
                                                                                r8 = z;
                                                                                if (!(r8 instanceof cdd)) {
                                                                                    ccyVar.d.set(new cdd(e));
                                                                                }
                                                                                throw e;
                                                                            }
                                                                        }
                                                                    } catch (java.lang.Exception e6) {
                                                                        e = e6;
                                                                        r8 = z;
                                                                        if (!(r8 instanceof cdd)) {
                                                                            ccyVar.d.set(new cdd(e));
                                                                        }
                                                                        throw e;
                                                                    }
                                                                } catch (java.lang.Throwable th12) {
                                                                    th = th12;
                                                                    ckoVar3 = ckoVar2;
                                                                    aonjVarI = aonjVarI;
                                                                    ckoVar = ckoVarH;
                                                                    throw th;
                                                                }
                                                            } catch (java.lang.Throwable th13) {
                                                                th = th13;
                                                                android.os.Trace.endSection();
                                                                throw th;
                                                            }
                                                        } catch (java.lang.Throwable th14) {
                                                            th = th14;
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Throwable th15) {
                                                        th = th15;
                                                        ccyVar.f.b();
                                                        ccyVar.a.q(null);
                                                        throw th;
                                                    }
                                                } catch (java.lang.Exception e7) {
                                                    e = e7;
                                                    i2 = i8;
                                                    throw new car(adqVar, adqVar2, acmVar, i2, e);
                                                }
                                            } catch (java.lang.Throwable th16) {
                                                th = th16;
                                            }
                                        } catch (java.lang.Throwable th17) {
                                            th = th17;
                                        }
                                    }
                                } catch (java.lang.Throwable th18) {
                                    th = th18;
                                }
                            } else {
                                if (i == ((cdg) ccz.a).b) {
                                    throw new java.lang.IllegalStateException("The paused composition has already been applied");
                                }
                                if (i == ((cdg) cdb.a).b) {
                                    throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                                }
                                if (i == 0) {
                                    if (cddVar == null) {
                                        defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.PausedCompositionState.Invalid");
                                    }
                                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception", cddVar.a);
                                }
                                ckoVar2 = ckoVar3;
                                aonjVarI = aonjVarI;
                                ckoVarH = ckoVarH;
                            }
                            try {
                                cxqVar.h = null;
                                dbkVar.n = false;
                                defpackage.cfd.i(ckoVar2, ckoVarH, aonjVarI);
                                return;
                            } catch (java.lang.Throwable th19) {
                                th = th19;
                                ckoVar3 = ckoVar2;
                                aonjVarI = aonjVarI;
                                ckoVar = ckoVarH;
                            }
                        } catch (java.lang.Exception e8) {
                            e = e8;
                        }
                    } catch (java.lang.Exception e9) {
                        e = e9;
                        r8 = cddVar;
                    }
                } catch (java.lang.Throwable th20) {
                    th = th20;
                }
            } catch (java.lang.Throwable th21) {
                th = th21;
                ckoVar = ckoVarH;
            }
            defpackage.cfd.i(ckoVar3, ckoVar, aonjVarI);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f A[LOOP:0: B:5:0x0014->B:18:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[EDGE_INSN: B:22:0x0052->B:19:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:18:0x004f], SYNTHETIC] */
    public final void g() {
        int i;
        defpackage.cbb cbbVar;
        defpackage.dbk dbkVar = this.a;
        dbkVar.n = true;
        defpackage.adw adwVar = this.l;
        java.lang.Object[] objArr = adwVar.c;
        long[] jArr = adwVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128 && (cbbVar = ((defpackage.cxq) objArr[(i2 << 3) + i4]).g) != null) {
                            cbbVar.d();
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        dbkVar.Q();
        dbkVar.n = false;
        adwVar.k();
        this.m.k();
        this.j = 0;
        this.i = 0;
        this.n.k();
        j();
    }

    public final void h(int i) {
        this.i = 0;
        defpackage.dbk dbkVar = this.a;
        java.util.List listV = dbkVar.v();
        int size = (listV.size() - this.j) - 1;
        if (i <= size) {
            defpackage.czp czpVar = this.p;
            czpVar.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    czpVar.add(p(listV, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(czpVar);
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            boolean z = false;
            while (size >= i) {
                try {
                    defpackage.dbk dbkVar2 = (defpackage.dbk) listV.get(size);
                    defpackage.adw adwVar = this.l;
                    java.lang.Object objA = adwVar.a(dbkVar2);
                    if (objA == null) {
                        defpackage.aooh.g();
                    }
                    defpackage.cxq cxqVar = (defpackage.cxq) objA;
                    java.lang.Object obj = cxqVar.a;
                    if (czpVar.contains(obj)) {
                        this.i++;
                        if (cxqVar.a()) {
                            s(dbkVar2);
                            q(cxqVar, false);
                            if (cxqVar.f) {
                                z = true;
                            }
                        }
                    } else {
                        dbkVar.n = true;
                        adwVar.i(dbkVar2);
                        defpackage.cbb cbbVar = cxqVar.g;
                        if (cbbVar != null) {
                            cbbVar.d();
                        }
                        dbkVar.R(size, 1);
                        dbkVar.n = false;
                    }
                    this.m.i(obj);
                    size--;
                } catch (java.lang.Throwable th) {
                    defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                    throw th;
                }
            }
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            if (z) {
                defpackage.cfd.j();
            }
        }
        j();
    }

    public final void i(java.lang.Object obj) {
        j();
        defpackage.dbk dbkVar = (defpackage.dbk) this.n.i(obj);
        if (dbkVar != null) {
            if (this.j <= 0) {
                defpackage.cwh.d("No pre-composed items to dispose");
            }
            defpackage.dbk dbkVar2 = this.a;
            int iIndexOf = dbkVar2.v().indexOf(dbkVar);
            if (iIndexOf < dbkVar2.v().size() - this.j) {
                defpackage.cwh.d("Item is not in pre-composed item range");
            }
            this.i++;
            this.j--;
            defpackage.cxq cxqVar = (defpackage.cxq) this.l.a(dbkVar);
            if (cxqVar != null) {
                r(cxqVar);
            }
            int size = (dbkVar2.v().size() - this.j) - this.i;
            n(iIndexOf, size);
            h(size);
        }
        if (this.h.l(obj)) {
            this.a.W(true, true, true);
        }
    }

    public final void j() {
        int size = this.a.v().size();
        int i = this.l.e;
        if (i != size) {
            defpackage.cwh.c(defpackage.a.bA(size, i, "Inconsistency between the count of nodes tracked by the state (", ") and the children count on the SubcomposeLayout (", "). Are you trying to use the state of the disposed SubcomposeLayout?"));
        }
        int i2 = this.i;
        int i3 = this.j;
        if ((size - i2) - i3 < 0) {
            defpackage.cwh.c("Incorrect state. Total children " + size + ". Reusable children " + i2 + ". Precomposed children " + i3);
        }
        int i4 = this.n.e;
        int i5 = this.j;
        if (i4 != i5) {
            defpackage.cwh.c(defpackage.a.bf(i4, i5, "Incorrect state. Precomposed children ", ". Map size "));
        }
    }

    public final void k(boolean z) {
        this.j = 0;
        this.n.k();
        java.util.List listV = this.a.v();
        int size = listV.size();
        if (this.i != size) {
            this.i = size;
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            for (int i = 0; i < size; i++) {
                try {
                    defpackage.dbk dbkVar = (defpackage.dbk) listV.get(i);
                    defpackage.cxq cxqVar = (defpackage.cxq) this.l.a(dbkVar);
                    if (cxqVar != null && cxqVar.a()) {
                        s(dbkVar);
                        q(cxqVar, z);
                        cxqVar.a = defpackage.czl.a;
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                    throw th;
                }
            }
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            this.m.k();
        }
        j();
    }

    public final void l(java.lang.Object obj, defpackage.aonn aonnVar, boolean z) throws java.lang.Throwable {
        defpackage.dbk dbkVar = this.a;
        if (dbkVar.al()) {
            j();
            if (defpackage.adw.f(this.m, obj)) {
                return;
            }
            this.o.i(obj);
            defpackage.adw adwVar = this.n;
            java.lang.Object objA = adwVar.a(obj);
            if (objA == null) {
                objA = e(obj);
                if (objA != null) {
                    n(dbkVar.v().indexOf(objA), dbkVar.v().size());
                    this.j++;
                } else {
                    defpackage.dbk dbkVarD = d(dbkVar.v().size());
                    this.j++;
                    objA = dbkVarD;
                }
                adwVar.n(obj, objA);
            }
            m((defpackage.dbk) objA, obj, z, aonnVar);
        }
    }

    public final void m(defpackage.dbk dbkVar, java.lang.Object obj, boolean z, defpackage.aonn aonnVar) throws java.lang.Throwable {
        boolean z2;
        defpackage.cbb cbbVar;
        defpackage.adw adwVar = this.l;
        java.lang.Object objA = adwVar.a(dbkVar);
        if (objA == null) {
            objA = new defpackage.cxq(obj, defpackage.cwv.a);
            adwVar.n(dbkVar, objA);
        }
        defpackage.cxq cxqVar = (defpackage.cxq) objA;
        boolean z3 = cxqVar.b != aonnVar;
        if (cxqVar.h != null) {
            if (z3) {
                r(cxqVar);
            } else {
                if (z) {
                    return;
                }
                f(cxqVar, true);
                z = false;
            }
        }
        defpackage.cbb cbbVar2 = cxqVar.g;
        if (cbbVar2 != null) {
            synchronized (cbbVar2.c) {
                z2 = cbbVar2.q.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || cxqVar.c) {
            cxqVar.b = aonnVar;
            if (cxqVar.h != null) {
                defpackage.cwh.c("new subcompose call while paused composition is still active");
            }
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            try {
                defpackage.dbk dbkVar2 = this.a;
                dbkVar2.n = true;
                defpackage.cbb cbbVar3 = cxqVar.g;
                defpackage.caz cazVar = this.b;
                if (cazVar == null) {
                    defpackage.cwh.b("parent composition reference not set");
                    throw new defpackage.aoiq();
                }
                if (cbbVar3 == null || cbbVar3.v()) {
                    if (z) {
                        android.view.ViewGroup.LayoutParams layoutParams = defpackage.dhc.a;
                        cbbVar = new defpackage.cbb(cazVar, new defpackage.ddi(dbkVar));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams2 = defpackage.dhc.a;
                        cbbVar = new defpackage.cbb(cazVar, new defpackage.ddi(dbkVar));
                    }
                    cbbVar3 = cbbVar;
                }
                cxqVar.g = cbbVar3;
                defpackage.aonn cjaVar = cxqVar.b;
                if (o() != null) {
                    cxqVar.f = false;
                } else {
                    cxqVar.f = true;
                    cjaVar = new defpackage.cja(1524156494, true, new dqv(cxqVar, cjaVar, 1, (byte[]) null));
                }
                if (z) {
                    if (cxqVar.d) {
                        cbbVar3.t();
                        cbbVar3.p();
                        cxqVar.h = cbbVar3.w(true, cjaVar);
                    } else {
                        cxqVar.h = cbbVar3.w(cbbVar3.t(), cjaVar);
                    }
                } else if (cxqVar.d) {
                    cbbVar3.t();
                    cbbVar3.p();
                    cbbVar3.l(cjaVar);
                } else {
                    cbbVar3.e(cjaVar);
                }
                cxqVar.d = false;
                dbkVar2.n = false;
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                cxqVar.c = false;
            } catch (java.lang.Throwable th) {
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                throw th;
            }
        }
    }

    public final void n(int i, int i2) {
        defpackage.dbk dbkVar = this.a;
        dbkVar.n = true;
        dbkVar.N(i, i2, 1);
        dbkVar.n = false;
    }
}
