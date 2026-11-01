package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nqn extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.nqs d;
    final /* synthetic */ java.util.List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqn(defpackage.nqs nqsVar, java.util.List list, aoln aolnVar) {
        super(2, aolnVar);
        this.d = nqsVar;
        this.e = list;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:36:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0178  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.nqs nqsVar;
        defpackage.nqj nqjVar;
        java.lang.Object obj2;
        akzb akzbVar;
        java.lang.Object objAj;
        defpackage.nsk nskVar;
        int i;
        int i2;
        defpackage.nqj nqjVar2;
        int i3;
        defpackage.nsk nskVar2;
        int i4;
        java.lang.Object objD;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        ?? r2;
        defpackage.jif jifVar;
        long j;
        java.lang.Object obj6;
        ?? r3;
        java.lang.Object objF;
        java.lang.Object obj7;
        ?? r4;
        defpackage.nsl nslVar;
        aolu aoluVar = aolu.a;
        ?? r5 = this.c;
        ?? r8 = 2;
        try {
            try {
                if (r5 != 0) {
                    if (r5 == 1) {
                        java.lang.Object obj8 = this.b;
                        java.lang.Object obj9 = this.a;
                        aooc.af(obj);
                        objAj = obj;
                        obj5 = obj8;
                        obj4 = obj9;
                    } else if (r5 != 2) {
                        java.lang.Object obj10 = this.b;
                        if (r5 != 3) {
                            java.lang.Object obj11 = this.a;
                            aooc.af(obj);
                            r4 = obj11;
                            objF = obj;
                            obj7 = obj10;
                        } else {
                            java.lang.Object obj12 = this.a;
                            aooc.af(obj);
                            i2 = 4;
                            r3 = obj12;
                            obj6 = obj10;
                            defpackage.nqj nqjVar3 = (defpackage.nqj) obj6;
                            nqjVar3.e = true;
                            this.a = r3;
                            this.b = obj6;
                            this.c = i2;
                            objF = ((defpackage.nqs) r3).f(nqjVar3, this);
                            r4 = r3;
                            obj7 = obj6;
                            if (objF == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        java.lang.Object obj13 = this.b;
                        java.lang.Object obj14 = this.a;
                        aooc.af(obj);
                        objD = obj;
                        i2 = 4;
                        r2 = obj14;
                        obj3 = obj13;
                        defpackage.idv idvVar = (defpackage.idv) objD;
                        defpackage.nqs.a.b().l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "finalize$<anonymous>$<anonymous>$<anonymous>", 201, "DobbyAudioWaveFileWriter.kt").E("Audio file saved, length: %d, path:%s", idvVar.d, idvVar.c);
                        jifVar = ((defpackage.nqs) r2).e;
                        j = idvVar.d / 1024;
                        this.a = r2;
                        this.b = obj3;
                        this.c = 3;
                        r3 = r2;
                        obj6 = obj3;
                        if (jifVar.a(j, this) == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.nqj nqjVar4 = (defpackage.nqj) obj6;
                        nqjVar4.e = true;
                        this.a = r3;
                        this.b = obj6;
                        this.c = i2;
                        objF = ((defpackage.nqs) r3).f(nqjVar4, this);
                        r4 = r3;
                        obj7 = obj6;
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                    }
                    nslVar = (defpackage.nsl) objF;
                    if (!((java.lang.Boolean) ((defpackage.nqs) r4).f.a()).booleanValue()) {
                        return nslVar;
                    }
                    akzc akzcVar = akzc.d;
                    ((defpackage.nqj) obj7).a = new akzb(128);
                    return nslVar;
                }
                aooc.af(obj);
                nqsVar = this.d;
                nqjVar = nqsVar.g;
                if (nqjVar != null) {
                    java.util.List list = this.e;
                    if (!nqjVar.e) {
                        defpackage.nsk nskVar3 = nqjVar.d;
                        if (nskVar3 != null) {
                            defpackage.nsf nsfVar = nqsVar.d;
                            akzb akzbVar2 = nqjVar.a;
                            int i5 = nskVar3.b;
                            this.a = nqsVar;
                            this.b = nqjVar;
                            this.c = 1;
                            objAj = aoov.aj(nsfVar.c, new defpackage.nse(nsfVar, akzbVar2, i5, list, null), this);
                            if (objAj == aoluVar) {
                                obj5 = nqjVar;
                                obj4 = nqsVar;
                                return aoluVar;
                            }
                        } else {
                            obj2 = nqjVar;
                            r5 = nqsVar;
                            akzbVar = null;
                        }
                        if (akzbVar != null) {
                            defpackage.nqs.a.b().l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "finalize$<anonymous>$<anonymous>$<anonymous>", 188, "DobbyAudioWaveFileWriter.kt").v("audio merging succeeded, creating 2-channel WAV file");
                            defpackage.nqj nqjVar5 = (defpackage.nqj) obj2;
                            nqjVar5.f = 2;
                            nqjVar5.a = akzbVar;
                        }
                        akzx akzxVarM = defpackage.idt.a.m();
                        defpackage.nqj nqjVar6 = (defpackage.nqj) obj2;
                        java.lang.String str = nqjVar6.b;
                        akzxVarM.u();
                        defpackage.idt idtVar = (defpackage.idt) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        idtVar.b |= 1;
                        idtVar.e = str;
                        akzx akzxVarM2 = defpackage.ids.a.m();
                        nskVar = nqjVar6.d;
                        if (nskVar != null) {
                            i = nskVar.b;
                        } else {
                            i = 0;
                        }
                        akzxVarM2.u();
                        defpackage.ids idsVar = (defpackage.ids) akzxVarM2.b;
                        i2 = 4;
                        idsVar.b |= 1;
                        idsVar.c = i;
                        nqjVar2 = ((defpackage.nqs) r5).g;
                        if (nqjVar2 != null) {
                            i3 = nqjVar2.f;
                        } else {
                            i3 = 1;
                        }
                        akzxVarM2.u();
                        defpackage.ids idsVar2 = (defpackage.ids) akzxVarM2.b;
                        idsVar2.b |= 2;
                        idsVar2.d = i3;
                        nskVar2 = nqjVar6.d;
                        if (nskVar2 != null) {
                            i4 = nskVar2.c;
                        } else {
                            i4 = 1;
                        }
                        akzxVarM2.u();
                        defpackage.ids idsVar3 = (defpackage.ids) akzxVarM2.b;
                        idsVar3.b |= 4;
                        idsVar3.e = i4;
                        akzxVarM2.u();
                        defpackage.ids idsVar4 = (defpackage.ids) akzxVarM2.b;
                        idsVar4.b |= 8;
                        idsVar4.f = true;
                        defpackage.ids idsVar5 = (defpackage.ids) akzxVarM2.p();
                        akzxVarM.u();
                        defpackage.idt idtVar2 = (defpackage.idt) akzxVarM.b;
                        j$.util.Objects.requireNonNull(idsVar5);
                        idtVar2.d = idsVar5;
                        idtVar2.c = 3;
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        ajcq ajcqVarN = ((defpackage.nqs) r5).h.n((defpackage.idt) aladVarP, ((defpackage.nqj) obj2).a.b());
                        this.a = r5;
                        this.b = obj2;
                        this.c = 2;
                        objD = aosv.D(ajcqVarN, this);
                        if (objD != aoluVar) {
                            return aoluVar;
                        }
                        obj3 = obj2;
                        r2 = r5;
                        defpackage.idv idvVar2 = (defpackage.idv) objD;
                        defpackage.nqs.a.b().l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "finalize$<anonymous>$<anonymous>$<anonymous>", 201, "DobbyAudioWaveFileWriter.kt").E("Audio file saved, length: %d, path:%s", idvVar2.d, idvVar2.c);
                        jifVar = ((defpackage.nqs) r2).e;
                        j = idvVar2.d / 1024;
                        this.a = r2;
                        this.b = obj3;
                        this.c = 3;
                        r3 = r2;
                        obj6 = obj3;
                        if (jifVar.a(j, this) == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.nqj nqjVar7 = (defpackage.nqj) obj6;
                        nqjVar7.e = true;
                        this.a = r3;
                        this.b = obj6;
                        this.c = i2;
                        objF = ((defpackage.nqs) r3).f(nqjVar7, this);
                        r4 = r3;
                        obj7 = obj6;
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        nslVar = (defpackage.nsl) objF;
                        if (!((java.lang.Boolean) ((defpackage.nqs) r4).f.a()).booleanValue()) {
                            return nslVar;
                        }
                        akzc akzcVar2 = akzc.d;
                        ((defpackage.nqj) obj7).a = new akzb(128);
                        return nslVar;
                    }
                    defpackage.nqs.a.c().m(aioa.b).l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "finalize$<anonymous>$<anonymous>$<anonymous>", 175, "DobbyAudioWaveFileWriter.kt").x("Try to close a closed session, callCreationTime:%d", nqsVar.c);
                } else {
                    defpackage.nqs.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "finalize$<anonymous>$<anonymous>", 227, "DobbyAudioWaveFileWriter.kt").v("No output stream or file opened to close");
                }
                return null;
                ajcq ajcqVarN2 = ((defpackage.nqs) r5).h.n((defpackage.idt) aladVarP, ((defpackage.nqj) obj2).a.b());
                this.a = r5;
                this.b = obj2;
                this.c = 2;
                objD = aosv.D(ajcqVarN2, this);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                obj3 = obj2;
                r2 = r5;
                defpackage.idv idvVar3 = (defpackage.idv) objD;
                defpackage.nqs.a.b().l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "finalize$<anonymous>$<anonymous>$<anonymous>", 201, "DobbyAudioWaveFileWriter.kt").E("Audio file saved, length: %d, path:%s", idvVar3.d, idvVar3.c);
                jifVar = ((defpackage.nqs) r2).e;
                j = idvVar3.d / 1024;
                this.a = r2;
                this.b = obj3;
                this.c = 3;
                r3 = r2;
                obj6 = obj3;
                if (jifVar.a(j, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nqj nqjVar8 = (defpackage.nqj) obj6;
                nqjVar8.e = true;
                this.a = r3;
                this.b = obj6;
                this.c = i2;
                objF = ((defpackage.nqs) r3).f(nqjVar8, this);
                r4 = r3;
                obj7 = obj6;
                if (objF == aoluVar) {
                    return aoluVar;
                }
                nslVar = (defpackage.nsl) objF;
                if (!((java.lang.Boolean) ((defpackage.nqs) r4).f.a()).booleanValue()) {
                    return nslVar;
                }
                akzc akzcVar3 = akzc.d;
                ((defpackage.nqj) obj7).a = new akzb(128);
                return nslVar;
            } catch (java.io.IOException e) {
                e = e;
                r8 = obj2;
                defpackage.nqs.a.c().i(zct.b).k(e).l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "finalize$<anonymous>$<anonymous>$<anonymous>", 210, "DobbyAudioWaveFileWriter.kt").v("Flush and close file failed");
                if (((java.lang.Boolean) ((defpackage.nqs) r5).f.a()).booleanValue()) {
                    akzc akzcVar4 = akzc.d;
                    ((defpackage.nqj) r8).a = new akzb(128);
                }
                return null;
            }
            obj5 = nqjVar;
            obj4 = nqsVar;
            akzbVar = (akzb) objAj;
            java.lang.Object obj15 = obj4;
            obj2 = obj5;
            r5 = obj15;
            if (akzbVar != null) {
                defpackage.nqs.a.b().l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "finalize$<anonymous>$<anonymous>$<anonymous>", 188, "DobbyAudioWaveFileWriter.kt").v("audio merging succeeded, creating 2-channel WAV file");
                defpackage.nqj nqjVar9 = (defpackage.nqj) obj2;
                nqjVar9.f = 2;
                nqjVar9.a = akzbVar;
            }
            akzx akzxVarM3 = defpackage.idt.a.m();
            defpackage.nqj nqjVar10 = (defpackage.nqj) obj2;
            java.lang.String str2 = nqjVar10.b;
            akzxVarM3.u();
            defpackage.idt idtVar3 = (defpackage.idt) akzxVarM3.b;
            j$.util.Objects.requireNonNull(str2);
            idtVar3.b |= 1;
            idtVar3.e = str2;
            akzx akzxVarM4 = defpackage.ids.a.m();
            nskVar = nqjVar10.d;
            if (nskVar != null) {
                i = nskVar.b;
            } else {
                i = 0;
            }
            akzxVarM4.u();
            defpackage.ids idsVar6 = (defpackage.ids) akzxVarM4.b;
            i2 = 4;
            idsVar6.b |= 1;
            idsVar6.c = i;
            nqjVar2 = ((defpackage.nqs) r5).g;
            if (nqjVar2 != null) {
                i3 = nqjVar2.f;
            } else {
                i3 = 1;
            }
            akzxVarM4.u();
            defpackage.ids idsVar7 = (defpackage.ids) akzxVarM4.b;
            idsVar7.b |= 2;
            idsVar7.d = i3;
            nskVar2 = nqjVar10.d;
            if (nskVar2 != null) {
                i4 = nskVar2.c;
            } else {
                i4 = 1;
            }
            akzxVarM4.u();
            defpackage.ids idsVar8 = (defpackage.ids) akzxVarM4.b;
            idsVar8.b |= 4;
            idsVar8.e = i4;
            akzxVarM4.u();
            defpackage.ids idsVar9 = (defpackage.ids) akzxVarM4.b;
            idsVar9.b |= 8;
            idsVar9.f = true;
            defpackage.ids idsVar10 = (defpackage.ids) akzxVarM4.p();
            akzxVarM3.u();
            defpackage.idt idtVar4 = (defpackage.idt) akzxVarM3.b;
            j$.util.Objects.requireNonNull(idsVar10);
            idtVar4.d = idsVar10;
            idtVar4.c = 3;
            alad aladVarP2 = akzxVarM3.p();
            aooh.e(aladVarP2, "build(...)");
        } catch (java.io.IOException e2) {
            e = e2;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nqn(this.d, this.e, aolnVar);
    }
}
