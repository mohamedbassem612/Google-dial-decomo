package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afx implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ afx(defpackage.aoss aossVar, defpackage.ccp ccpVar, bwj bwjVar, int i) {
        this.$cid = i;
        this.a = aossVar;
        this.c = ccpVar;
        this.b = bwjVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: bxg */
    /* JADX WARN: Code duplicated, block: B:193:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:242:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0274 A[LOOP:0: B:81:0x022d->B:95:0x0274, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [arl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [cyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v52, types: [dat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [csj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [dao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v2, types: [bks, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object crgVar;
        defpackage.bxa bxaVar;
        float f;
        defpackage.djg djgVar;
        int i;
        defpackage.aomy aomyVar;
        float fC;
        java.lang.Object objA;
        defpackage.dbm dbmVar;
        java.lang.Object crgVar2 = null;
        boolean zBooleanValue = false;
        switch (this.$cid) {
            case 0:
                defpackage.aonj aonjVar = defpackage.aga.a;
                int iOrdinal = ((defpackage.afr) obj).ordinal();
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.c;
                if (iOrdinal == 0) {
                    defpackage.ags agsVar = ((defpackage.agf) this.b).b.d;
                    if (agsVar != null) {
                        crgVar2 = new defpackage.crg(agsVar.b);
                    } else {
                        defpackage.ags agsVar2 = ((defpackage.agg) obj3).b.d;
                        if (agsVar2 != null) {
                            crgVar2 = new defpackage.crg(agsVar2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    crgVar2 = obj2;
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.aois();
                    }
                    defpackage.ags agsVar3 = ((defpackage.agg) obj3).b.d;
                    crgVar2 = new defpackage.crg(agsVar3 != null ? agsVar3.b : defpackage.mni.bj(0.5f, 0.5f));
                }
                crgVar = new defpackage.crg(crgVar2 != null ? ((defpackage.crg) crgVar2).a : defpackage.mni.bj(0.5f, 0.5f));
                return crgVar;
            case 1:
                bxaVar = new defpackage.bxa((androidx.compose.runtime.snapshots.SnapshotStateList) this.c, this.a, (defpackage.aex) this.b, 1);
                return bxaVar;
            case 2:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                defpackage.aqi aqiVar = (defpackage.aqi) this.b;
                f = true == aqiVar.c ? 1.0f : -1.0f;
                defpackage.ato atoVar = aqiVar.b;
                float fB = f * atoVar.b(atoVar.d(((defpackage.apnt) this.c).w(atoVar.d(atoVar.f(f * fFloatValue)))));
                if (java.lang.Math.abs(fB) < java.lang.Math.abs(fFloatValue)) {
                    defpackage.aooc.X(this.a, "Scroll animation cancelled because scroll was not consumed (|" + fB + "| < |" + fFloatValue + "|)", null);
                }
                return defpackage.aojh.a;
            case 3:
                this.b.a(arp.a(defpackage.mni.bm(((aqu) obj).a, true != ((arq) this.c).j ? 1.0f : -1.0f), (defpackage.aso) this.a));
                return defpackage.aojh.a;
            case 4:
                defpackage.djg djgVar2 = (defpackage.djg) obj;
                defpackage.aoop aoopVar = (defpackage.aoop) this.a;
                boolean z = aoopVar.a;
                java.lang.Object obj4 = this.b;
                if (z && (djgVar2.a instanceof defpackage.dks)) {
                    int i2 = djgVar2.b;
                    defpackage.djg djgVar3 = (defpackage.djg) obj4;
                    if (i2 == djgVar3.b && (i = djgVar2.c) == djgVar3.c) {
                        java.lang.Object dksVar = this.c;
                        if (dksVar == null) {
                            dksVar = new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65535);
                        }
                        djgVar = new defpackage.djg(dksVar, i2, i, "");
                    } else {
                        djgVar = djgVar2;
                    }
                } else {
                    djgVar = djgVar2;
                }
                aoopVar.a = defpackage.aooh.n(obj4, djgVar2);
                return djgVar;
            case 5:
                defpackage.vx vxVar = (defpackage.vx) obj;
                int i3 = bhu.a;
                java.util.List list = ((bhe) this.c).b;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bhf bhfVar = (bhd) list.get(i4);
                    if (bhfVar instanceof bhf) {
                        vxVar.a.add(new defpackage.cja(-1789283891, true, new afnh(new defpackage.axo(bhfVar, 6), vxVar, defpackage.cmw.c, bhfVar.c == 0 ? null : new defpackage.cja(-1930700965, true, new bib(bhfVar, 1)), new ny(bhfVar, this.a, 12), 1)));
                    } else if (bhfVar instanceof bhj) {
                        java.lang.Object obj5 = this.b;
                        bhj bhjVar = (bhj) bhfVar;
                        if (obj5 != null) {
                            int i5 = bhjVar.c;
                            android.view.textclassifier.TextClassification textClassification = bhjVar.b;
                            android.graphics.drawable.Drawable drawable = bhjVar.d;
                            if (i5 < 0) {
                                vxVar.a.add(new defpackage.cja(-1789283891, true, new afnh(new bhx(textClassification), vxVar, defpackage.cmw.c, drawable != null ? new defpackage.cja(-1123224187, true, new bib(drawable, 0)) : null, new bhy((android.content.Context) obj5, textClassification), 1)));
                            } else {
                                android.app.RemoteAction remoteActionM = aa$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(textClassification).get(i5));
                                vxVar.a.add(new defpackage.cja(-1789283891, true, new afnh(new bhz(remoteActionM), vxVar, defpackage.cmw.c, drawable != null ? new defpackage.cja(1106162332, true, new bib(drawable, 2)) : null, new bia(remoteActionM), 1)));
                            }
                        }
                    } else if (bhfVar instanceof bhh) {
                        vxVar.a.add(aow.b);
                    }
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                cvm cvmVar = (cvm) obj;
                long j = cvmVar.c;
                bjj bjjVar = (bjj) this.b;
                defpackage.cxi cxiVar = (defpackage.cxi) bjjVar.c.a();
                if (cxiVar != null) {
                    blz blzVar = bjjVar.d;
                    if (cxiVar.u() && bjjVar.b()) {
                        if (blzVar.g(cxiVar, j, bjjVar.a, (bks) this.c, false)) {
                            bjjVar.a = j;
                        }
                        java.lang.Object obj6 = this.a;
                        cvmVar.b();
                        ((defpackage.aoop) obj6).a = true;
                    }
                } else {
                    java.lang.Object obj7 = this.a;
                    cvmVar.b();
                    ((defpackage.aoop) obj7).a = true;
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aonj aonjVar2 = (defpackage.aonj) this.c.a();
                bun bunVar = (bun) this.b;
                bunVar.h(0.0f, aonjVar2);
                if (!bunVar.l() && (aomyVar = (defpackage.aomy) this.a.a()) != null) {
                    aomyVar.a();
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.emw emrVar = new emr(this.a, 1, (byte[]) null);
                ?? r2 = this.b;
                r2.P().c(emrVar);
                bxaVar = new defpackage.bxa(this.c, (defpackage.emx) r2, emrVar, 0);
                return bxaVar;
            case 9:
                defpackage.aoov.an(this.a, null, 0, new amh((defpackage.cpe) obj, (defpackage.ccp) this.c, (bwj) this.b, (defpackage.aoln) null, 14), 3);
                return defpackage.aojh.a;
            case 10:
                defpackage.dfb.i((defpackage.diq) obj, (java.lang.String) this.c, new bxq(this.a, this.b, 0));
                return defpackage.aojh.a;
            case 11:
                defpackage.czb czbVar = (defpackage.czb) obj;
                ?? r3 = this.c;
                ?? r4 = this.b;
                if (r3.dw()) {
                    byi byiVar = (byi) r4;
                    fC = byiVar.a.p().c(byiVar.a.k());
                } else {
                    fC = ((byi) r4).a.c();
                }
                boolean zDw = r3.dw();
                if (java.lang.Float.isNaN(fC)) {
                    byi byiVar2 = (byi) r4;
                    throw new bxg(zDw, byiVar2.d, byiVar2.a.p(), byiVar2.a.k());
                }
                f = (defpackage.cfo.A(r4).s == defpackage.dpq.b && ((byi) r4).c == defpackage.aso.b) ? -1.0f : 1.0f;
                defpackage.aso asoVar = ((byi) r4).c;
                czbVar.x(new byh((defpackage.czc) this.a, asoVar == defpackage.aso.b ? f * fC : 0.0f, asoVar == defpackage.aso.a ? fC : 0.0f, 0));
                return defpackage.aojh.a;
            case 12:
                if (this.c.contains(obj) && (objA = ((cco) this.b).a.a(obj)) != null) {
                    java.lang.Object obj8 = this.a;
                    if (objA instanceof defpackage.ady) {
                        defpackage.ady adyVar = (defpackage.ady) objA;
                        java.lang.Object[] objArr = adyVar.b;
                        long[] jArr = adyVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j2 = jArr[i6];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = i6 - length;
                                    int i8 = 0;
                                    while (true) {
                                        int i9 = 8 - ((~i7) >>> 31);
                                        if (i8 < i9) {
                                            if ((255 & j2) < 128) {
                                                defpackage.aowv aowvVar = (defpackage.aowv) objArr[(i6 << 3) + i8];
                                                defpackage.aoot aootVar = (defpackage.aoot) obj8;
                                                if (aootVar.a == null) {
                                                    aootVar.a = new java.util.ArrayList();
                                                }
                                                ((java.util.List) aootVar.a).add(aowvVar);
                                            }
                                            j2 >>= 8;
                                            i8++;
                                        } else if (i9 == 8) {
                                            if (i6 != length) {
                                                i6++;
                                            }
                                        }
                                    }
                                } else if (i6 != length) {
                                    i6++;
                                }
                            }
                        }
                    } else {
                        defpackage.aowv aowvVar2 = (defpackage.aowv) objA;
                        defpackage.aoot aootVar2 = (defpackage.aoot) obj8;
                        if (aootVar2.a == null) {
                            aootVar2.a = new java.util.ArrayList();
                        }
                        ((java.util.List) aootVar2.a).add(aowvVar2);
                    }
                }
                return defpackage.aojh.a;
            case 13:
                defpackage.cpg cpgVar = (defpackage.cpg) obj;
                if (!defpackage.aooh.n(cpgVar, this.c)) {
                    if (defpackage.aooh.n(cpgVar, ((defpackage.cou) this.b).c)) {
                        throw new java.lang.IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((java.lang.Boolean) this.a.a(cpgVar)).booleanValue();
                }
                return java.lang.Boolean.valueOf(zBooleanValue);
            case 14:
                ?? r5 = this.b;
                ?? r6 = this.c;
                defpackage.csj csjVar = (defpackage.csj) obj;
                defpackage.dbm dbmVar2 = (defpackage.dbm) r6;
                defpackage.dat datVar = dbmVar2.a;
                dbmVar2.a = r5;
                ?? r0 = this.a;
                try {
                    defpackage.dpf dpfVarC = csjVar.q().c();
                    defpackage.dpq dpqVarD = csjVar.q().d();
                    defpackage.cqf cqfVarB = csjVar.q().b();
                    long jA = csjVar.q().a();
                    defpackage.cso csoVar = csjVar.q().a;
                    defpackage.dpf dpfVarC2 = r6.q().c();
                    defpackage.dpq dpqVarD2 = r6.q().d();
                    defpackage.cqf cqfVarB2 = r6.q().b();
                    long jA2 = r6.q().a();
                    defpackage.cso csoVar2 = r6.q().a;
                    try {
                        defpackage.csg csgVarQ = r6.q();
                        csgVarQ.f(dpfVarC);
                        csgVarQ.g(dpqVarD);
                        csgVarQ.e(cqfVarB);
                        csgVarQ.h(jA);
                        csgVarQ.a = csoVar;
                        cqfVarB.g();
                        try {
                            r0.a(r6);
                            cqfVarB.e();
                            defpackage.csg csgVarQ2 = r6.q();
                            csgVarQ2.f(dpfVarC2);
                            csgVarQ2.g(dpqVarD2);
                            csgVarQ2.e(cqfVarB2);
                            csgVarQ2.h(jA2);
                            csgVarQ2.a = csoVar2;
                            dbmVar2.a = datVar;
                            return defpackage.aojh.a;
                        } catch (java.lang.Throwable th) {
                            dbmVar = dbmVar2;
                            try {
                                cqfVarB.e();
                                defpackage.csg csgVarQ3 = r6.q();
                                csgVarQ3.f(dpfVarC2);
                                csgVarQ3.g(dpqVarD2);
                                csgVarQ3.e(cqfVarB2);
                                csgVarQ3.h(jA2);
                                csgVarQ3.a = csoVar2;
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                dbmVar.a = datVar;
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        dbmVar = dbmVar2;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    dbmVar = dbmVar2;
                }
                break;
            case 15:
                defpackage.cqf cqfVarB3 = ((defpackage.csj) obj).q().b();
                dqc dqcVar = (dqc) this.c;
                if (dqcVar.c.getVisibility() != 8) {
                    java.lang.Object obj9 = this.b;
                    dqcVar.w = true;
                    defpackage.dcv dcvVar = ((defpackage.dbk) obj9).k;
                    crgVar2 = true == (dcvVar instanceof defpackage.deg) ? dcvVar : null;
                    if (crgVar2 != null) {
                        android.graphics.Canvas canvasA = defpackage.cpr.a(cqfVarB3);
                        if (((defpackage.deg) crgVar2).v != null) {
                            ((dqc) this.a).draw(canvasA);
                        }
                    }
                    dqcVar.w = false;
                }
                return defpackage.aojh.a;
            case 16:
                int id = ((elh) this.c).b().getId();
                defpackage.bo boVar = (defpackage.bo) this.b;
                defpackage.aw awVarD = boVar.d(id);
                if (awVarD != null && !boVar.ac()) {
                    defpackage.emq emqVar = (defpackage.emq) this.a;
                    if (emqVar.a(defpackage.emq.c)) {
                        defpackage.u uVar = new defpackage.u(boVar);
                        uVar.s();
                        uVar.l(awVarD, emqVar);
                        uVar.c();
                    }
                }
                return new dqz(2);
            case 17:
                defpackage.aoot aootVar3 = new defpackage.aoot();
                eok eokVar = new eok((xfi) this.c, aootVar3, (defpackage.aonj) this.a);
                ?? r1 = this.b;
                r1.P().c(eokVar);
                crgVar = new defpackage.bxa((defpackage.emx) r1, (defpackage.emv) eokVar, aootVar3, 2);
                return crgVar;
            case 18:
                ?? r7 = this.c;
                java.lang.Object obj10 = this.b;
                ((androidx.compose.runtime.snapshots.SnapshotStateList) obj10).add(r7);
                bxaVar = new defpackage.bxa(this.a, (defpackage.emx) r7, obj10, 3);
                return bxaVar;
            case 19:
                defpackage.igf igfVar = (defpackage.igf) this.b;
                defpackage.ifv ifvVarB = defpackage.ifv.b(igfVar.c);
                if (ifvVarB == null) {
                    ifvVarB = defpackage.ifv.UNRECOGNIZED;
                }
                java.lang.Object obj11 = this.c;
                java.lang.Object obj12 = this.a;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = ((inu) obj11).j;
                if (defpackage.aooh.n(concurrentHashMap.get(ifvVarB), obj12)) {
                    defpackage.ifv ifvVarB2 = defpackage.ifv.b(igfVar.c);
                    if (ifvVarB2 == null) {
                        ifvVarB2 = defpackage.ifv.UNRECOGNIZED;
                    }
                    concurrentHashMap.remove(ifvVarB2);
                }
                return defpackage.aojh.a;
            default:
                jyh jyhVar = (jyh) obj;
                defpackage.aooh.f(jyhVar, "chipWithKey");
                defpackage.az azVarK = jlr.k((android.content.Context) this.b);
                if (azVarK != null) {
                    this.a.a(new kbp(jyhVar.b, new jyg(((kcu) this.c).b, jyhVar.a, azVarK)));
                }
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ afx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ afx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ afx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ afx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ afx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
