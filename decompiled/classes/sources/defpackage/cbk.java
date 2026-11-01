package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbk extends defpackage.cls implements defpackage.ckg {
    public final defpackage.aomy a;
    public defpackage.cbj b = new defpackage.cbj(defpackage.ckw.b().v());
    private final defpackage.cen c;

    public cbk(defpackage.aomy aomyVar, defpackage.cen cenVar) {
        this.a = aomyVar;
        this.c = cenVar;
    }

    @Override // defpackage.cer
    public final java.lang.Object a() {
        defpackage.aonj aonjVarI = defpackage.ckw.b().i();
        if (aonjVarI != null) {
            aonjVarI.a(this);
        }
        defpackage.cko ckoVarB = defpackage.ckw.b();
        return c((defpackage.cbj) defpackage.ckw.e(this.b, ckoVarB), ckoVarB, true, this.a).e;
    }

    @Override // defpackage.ckg
    public final boolean b(java.lang.Object obj) {
        defpackage.cen cenVar = this.c;
        if (cenVar == null) {
            cenVar = defpackage.cdu.c;
        }
        return !cenVar.a(f().e, obj);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0233 A[LOOP:7: B:131:0x0231->B:132:0x0233, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x009d A[EDGE_INSN: B:154:0x009d->B:30:0x009d BREAK  A[LOOP:1: B:15:0x0048->B:29:0x0098], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[Catch: all -> 0x00b2, LOOP:1: B:15:0x0048->B:29:0x0098, LOOP_END, TryCatch #3 {all -> 0x00b2, blocks: (B:9:0x0026, B:11:0x0032, B:12:0x003a, B:15:0x0048, B:17:0x005d, B:18:0x0060, B:20:0x0069, B:22:0x0073, B:24:0x0089, B:26:0x008f, B:29:0x0098, B:30:0x009d), top: B:139:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x019c A[LOOP:6: B:84:0x019a->B:85:0x019c, LOOP_END] */
    public final defpackage.cbj c(defpackage.cbj cbjVar, defpackage.cko ckoVar, boolean z, defpackage.aomy aomyVar) throws java.lang.Throwable {
        int i;
        java.lang.Object[] objArr;
        int i2;
        int i3;
        int i4;
        defpackage.cko clwVar;
        defpackage.cko ckoVarW;
        java.lang.Object objA;
        java.lang.Object[] objArr2;
        int i5;
        int i6;
        java.lang.Object obj;
        defpackage.cko ckoVarB;
        java.lang.Object obj2;
        defpackage.cbj cbjVar2;
        defpackage.cbj cbjVar3;
        defpackage.cjb cjbVar;
        defpackage.cen cenVar;
        int i7;
        int i8;
        int i9;
        char c;
        if (cbjVar.d(this, ckoVar)) {
            if (z) {
                defpackage.cfc cfcVarA = defpackage.ckh.a();
                java.lang.Object[] objArr3 = cfcVarA.a;
                int i10 = cfcVarA.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((defpackage.ckj) objArr3[i11]).b(this);
                }
                defpackage.cki ckiVar = defpackage.cki.a;
                try {
                    defpackage.ado adoVar = cbjVar.d;
                    defpackage.ajxw ajxwVar = defpackage.ceo.a;
                    defpackage.cjb cjbVar2 = (defpackage.cjb) ajxwVar.i();
                    if (cjbVar2 == null) {
                        cjbVar2 = new defpackage.cjb(null);
                        ajxwVar.j(cjbVar2);
                    }
                    int i12 = cjbVar2.a;
                    java.lang.Object[] objArr4 = adoVar.b;
                    int[] iArr = adoVar.c;
                    long[] jArr = adoVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j = jArr[i13];
                            java.lang.Object[] objArr5 = objArr4;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i13 != length) {
                                    break;
                                    break;
                                }
                                i13++;
                                objArr4 = objArr5;
                            } else {
                                int i14 = i13 - length;
                                int i15 = 0;
                                while (true) {
                                    i9 = 8 - ((~i14) >>> 31);
                                    if (i15 >= i9) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i16 = (i13 << 3) + i15;
                                        c = '\b';
                                        defpackage.clr clrVar = (defpackage.clr) objArr5[i16];
                                        cjbVar2.a = iArr[i16] + i12;
                                        defpackage.aonj aonjVarI = ckoVar.i();
                                        if (aonjVarI != null) {
                                            aonjVarI.a(clrVar);
                                        }
                                    } else {
                                        c = '\b';
                                    }
                                    j >>= c;
                                    i15++;
                                }
                                if (i9 != 8) {
                                    break;
                                }
                                if (i13 != length) {
                                    break;
                                }
                                i13++;
                                objArr4 = objArr5;
                            }
                        }
                    }
                    cjbVar2.a = i12;
                    defpackage.aojh aojhVar = defpackage.aojh.a;
                    java.lang.Object[] objArr6 = cfcVarA.a;
                    i7 = cfcVarA.b;
                    for (int i17 = 0; i8 < i7; i8++) {
                        ((defpackage.ckj) objArr6[i8]).a(this, aojhVar);
                    }
                } finally {
                    java.lang.Object[] objArr7 = cfcVarA.a;
                    i7 = cfcVarA.b;
                    for (i8 = 0; i8 < i7; i8++) {
                        ((defpackage.ckj) objArr7[i8]).a(this, ckiVar);
                    }
                }
            }
            return cbjVar;
        }
        defpackage.ado adoVar2 = new defpackage.ado(6);
        defpackage.ajxw ajxwVar2 = defpackage.ceo.a;
        defpackage.cjb cjbVar3 = (defpackage.cjb) ajxwVar2.i();
        if (cjbVar3 == null) {
            cjbVar3 = new defpackage.cjb(null);
            ajxwVar2.j(cjbVar3);
        }
        defpackage.cjb cjbVar4 = cjbVar3;
        int i18 = cjbVar4.a;
        defpackage.cfc cfcVarA2 = defpackage.ckh.a();
        java.lang.Object[] objArr8 = cfcVarA2.a;
        int i19 = cfcVarA2.b;
        for (int i20 = 0; i20 < i19; i20++) {
            ((defpackage.ckj) objArr8[i20]).b(this);
        }
        int i21 = i18 + 1;
        defpackage.cki ckiVar2 = defpackage.cki.a;
        try {
            cjbVar4.a = i21;
            defpackage.aonj cbiVar = new defpackage.cbi(this, cjbVar4, adoVar2, i18, 0);
            defpackage.cko ckoVar2 = (defpackage.cko) defpackage.ckw.i.i();
            try {
                try {
                    if (ckoVar2 instanceof defpackage.clw) {
                        defpackage.clw clwVar2 = (defpackage.clw) ckoVar2;
                        if (clwVar2.n == java.lang.Thread.currentThread().getId()) {
                            defpackage.aonj aonjVar = clwVar2.l;
                            defpackage.aonj aonjVar2 = clwVar2.m;
                            if (aonjVar != null && cbiVar != aonjVar) {
                                try {
                                    cbiVar = new defpackage.bet(cbiVar, aonjVar, 4);
                                } catch (java.lang.Throwable th) {
                                    defpackage.clw clwVar3 = (defpackage.clw) ckoVar2;
                                    clwVar3.l = aonjVar;
                                    clwVar3.m = aonjVar2;
                                    throw th;
                                }
                            }
                            clwVar2.l = cbiVar;
                            clwVar2.m = aonjVar2;
                            objA = aomyVar.a();
                            clwVar2.l = aonjVar;
                            clwVar2.m = aonjVar2;
                            i = 0;
                        }
                        cjbVar4.a = i18;
                        objArr2 = cfcVarA2.a;
                        i5 = cfcVarA2.b;
                        for (i6 = i; i6 < i5; i6++) {
                            ((defpackage.ckj) objArr2[i6]).a(this, objA);
                        }
                        obj = defpackage.ckw.b;
                        synchronized (obj) {
                            ckoVarB = defpackage.ckw.b();
                            obj2 = cbjVar.e;
                            if (obj2 == defpackage.cbj.a && (cenVar = this.c) != null && cenVar.a(objA, obj2)) {
                                cbjVar.d = adoVar2;
                                cbjVar.f = cbjVar.a(this, ckoVarB);
                                cbjVar3 = cbjVar;
                            } else {
                                cbjVar2 = this.b;
                                synchronized (obj) {
                                    defpackage.clt cltVarG = defpackage.ckw.g(cbjVar2, this);
                                    cltVarG.c(cbjVar2);
                                    cltVarG.g = ckoVarB.v();
                                    cbjVar3 = (defpackage.cbj) cltVarG;
                                    cbjVar3.d = adoVar2;
                                    cbjVar3.f = cbjVar3.a(this, ckoVarB);
                                    cbjVar3.e = objA;
                                }
                            }
                        }
                        cjbVar = (defpackage.cjb) defpackage.ceo.a.i();
                        if (cjbVar != null && cjbVar.a == 0) {
                            defpackage.ckw.b().e();
                            synchronized (defpackage.ckw.b) {
                                defpackage.cko ckoVarB2 = defpackage.ckw.b();
                                cbjVar3.b = ckoVarB2.v();
                                cbjVar3.c = ckoVarB2.h();
                            }
                        }
                        return cbjVar3;
                    }
                    java.lang.Object objA2 = aomyVar.a();
                    defpackage.ckw.i.j(ckoVarW);
                    clwVar.d();
                    objA = objA2;
                    cjbVar4.a = i18;
                    objArr2 = cfcVarA2.a;
                    i5 = cfcVarA2.b;
                    while (i6 < i5) {
                        ((defpackage.ckj) objArr2[i6]).a(this, objA);
                    }
                    obj = defpackage.ckw.b;
                    synchronized (obj) {
                        ckoVarB = defpackage.ckw.b();
                        obj2 = cbjVar.e;
                        if (obj2 == defpackage.cbj.a) {
                        }
                        cbjVar2 = this.b;
                        synchronized (obj) {
                            defpackage.clt cltVarG2 = defpackage.ckw.g(cbjVar2, this);
                            cltVarG2.c(cbjVar2);
                            cltVarG2.g = ckoVarB.v();
                            cbjVar3 = (defpackage.cbj) cltVarG2;
                            cbjVar3.d = adoVar2;
                            cbjVar3.f = cbjVar3.a(this, ckoVarB);
                            cbjVar3.e = objA;
                            cjbVar = (defpackage.cjb) defpackage.ceo.a.i();
                            if (cjbVar != null) {
                                defpackage.ckw.b().e();
                                synchronized (defpackage.ckw.b) {
                                    defpackage.cko ckoVarB3 = defpackage.ckw.b();
                                    cbjVar3.b = ckoVarB3.v();
                                    cbjVar3.c = ckoVarB3.h();
                                }
                            }
                            return cbjVar3;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    defpackage.ckw.i.j(ckoVarW);
                    throw th2;
                }
                ckoVarW = clwVar.w();
            } catch (java.lang.Throwable th3) {
                clwVar.d();
                throw th3;
            }
            if (ckoVar2 == null || (ckoVar2 instanceof defpackage.ckk)) {
                defpackage.clw clwVar4 = (defpackage.clw) defpackage.ckw.j.k();
                if (clwVar4 != null) {
                    try {
                        i4 = 0;
                        try {
                            clwVar4.D((defpackage.ckk) ckoVar2, cbiVar, true, false);
                            i = 0;
                            clwVar = clwVar4;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            i = i4;
                            objArr = cfcVarA2.a;
                            i2 = cfcVarA2.b;
                            for (i3 = i; i3 < i2; i3++) {
                                ((defpackage.ckj) objArr[i3]).a(this, ckiVar2);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        i4 = 0;
                    }
                } else {
                    i = 0;
                    try {
                        clwVar = new defpackage.clw((defpackage.ckk) ckoVar2, cbiVar, null, true, false);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        objArr = cfcVarA2.a;
                        i2 = cfcVarA2.b;
                        while (i3 < i2) {
                            ((defpackage.ckj) objArr[i3]).a(this, ckiVar2);
                        }
                        throw th;
                    }
                }
            } else {
                clwVar = ckoVar2.b(cbiVar);
                i = 0;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            i = 0;
            objArr = cfcVarA2.a;
            i2 = cfcVarA2.b;
            while (i3 < i2) {
                ((defpackage.ckj) objArr[i3]).a(this, ckiVar2);
            }
            throw th;
        }
    }

    @Override // defpackage.clr
    public final defpackage.clt d() {
        return this.b;
    }

    @Override // defpackage.clr
    public final void e(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        }
        this.b = (defpackage.cbj) cltVar;
    }

    public final defpackage.cbj f() {
        defpackage.cko ckoVarB = defpackage.ckw.b();
        return c((defpackage.cbj) defpackage.ckw.e(this.b, ckoVarB), ckoVarB, false, this.a);
    }

    public final java.lang.String toString() {
        defpackage.cbj cbjVar = (defpackage.cbj) defpackage.ckw.f(this.b, this);
        return "DerivedState(value=" + (cbjVar.d(this, defpackage.ckw.b()) ? java.lang.String.valueOf(cbjVar.e) : "<Not calculated>") + ")@" + hashCode();
    }
}
