package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nrv {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/storage/DobbySessionWriter");
    public final defpackage.nqs b;
    public final long c;
    public final defpackage.kpb d;
    public final java.lang.String e;
    public final tvn f;
    public final zjm g;
    private final nri h;
    private final aolr i;
    private boolean j;
    private final apdp k;
    private final pgi l;

    public nrv(pgi pgiVar, defpackage.nqs nqsVar, nri nriVar, tvn tvnVar, aolr aolrVar, long j, defpackage.kpb kpbVar, java.lang.String str, zjm zjmVar, aazc aazcVar) {
        aooh.f(nqsVar, "dobbyAudioWaveFileWriter");
        aooh.f(nriVar, "dobbyDatabase");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(kpbVar, "callNotesTranscriptBuilder");
        aooh.f(str, "uniqueCallId");
        aooh.f(aazcVar, "clock");
        this.l = pgiVar;
        this.b = nqsVar;
        this.h = nriVar;
        this.f = tvnVar;
        this.i = aolrVar;
        this.c = j;
        this.d = kpbVar;
        this.e = str;
        this.g = zjmVar;
        this.k = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.nsg nsgVar, aoln aolnVar) {
        defpackage.nrm nrmVar;
        apdp apdpVar;
        java.lang.Object next;
        if (aolnVar instanceof defpackage.nrm) {
            nrmVar = (defpackage.nrm) aolnVar;
            int i = nrmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrmVar.c = i - Integer.MIN_VALUE;
            } else {
                nrmVar = new defpackage.nrm(this, aolnVar);
            }
        } else {
            nrmVar = new defpackage.nrm(this, aolnVar);
        }
        java.lang.Object obj = nrmVar.a;
        defpackage.nsg nsgVar2 = aolu.a;
        int i2 = nrmVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                nrmVar.d = nsgVar;
                nrmVar.e = apdpVar;
                nrmVar.c = 1;
                if (apdpVar.b(nrmVar) != nsgVar2) {
                }
                return nsgVar2;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = nrmVar.e;
            nsgVar = nrmVar.d;
            aooc.af(obj);
            defpackage.nwj nwjVarAo = mni.ao(nsgVar.a.p());
            java.util.Iterator it = nwjVarAo.k().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((defpackage.nsj) next).c != 4);
            defpackage.nsj nsjVar = (defpackage.nsj) next;
            nwjVarAo.k();
            java.lang.Object obj2 = nwjVarAo.a;
            ((akzx) obj2).u();
            ((defpackage.nst) ((akzx) obj2).b).b = albq.a;
            if (nsjVar != null) {
                nwjVarAo.k();
                nwjVarAo.l(nsjVar);
            }
            defpackage.nst nstVarJ = nwjVarAo.j();
            defpackage.nmz nmzVar = nsgVar.b;
            aooh.f(nstVarJ, "transcripts");
            aooh.f(nmzVar, "summary");
            nsgVar2 = new defpackage.nsg(nstVarJ, nmzVar);
            return nsgVar2;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [nrv] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [nrv] */
    public final java.lang.Object b(defpackage.nsn nsnVar, defpackage.nsg nsgVar, defpackage.nsm nsmVar, defpackage.aivr aivrVar, java.util.List list, aoln aolnVar) {
        defpackage.nrn nrnVar;
        defpackage.nsn nsnVar2;
        java.lang.Object obj;
        ?? r5;
        defpackage.aivr aivrVar2;
        ?? r6;
        defpackage.nsn nsnVar3;
        defpackage.aivr aivrVar3;
        defpackage.nsm nsmVar2;
        java.lang.Object obj2;
        java.lang.Object objAj;
        int iAN;
        boolean z;
        java.lang.Object objAj2;
        defpackage.nsm nsmVar3 = nsmVar;
        defpackage.aivr aivrVar4 = aivrVar;
        java.util.List list2 = list;
        if (aolnVar instanceof defpackage.nrn) {
            nrnVar = (defpackage.nrn) aolnVar;
            int i = nrnVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrnVar.f = i - Integer.MIN_VALUE;
            } else {
                nrnVar = new defpackage.nrn(this, aolnVar);
            }
        } else {
            nrnVar = new defpackage.nrn(this, aolnVar);
        }
        java.lang.Object objA = nrnVar.d;
        aolu aoluVar = aolu.a;
        switch (nrnVar.f) {
            case 0:
                aooc.af(objA);
                defpackage.nmp nmpVar = (defpackage.nmp) ajsz.bG(list2);
                if (nmpVar == null || !nmpVar.e) {
                    nrnVar.a = nsnVar;
                    nrnVar.b = nsmVar3;
                    nrnVar.g = aivrVar4;
                    nrnVar.c = list2;
                    nrnVar.h = this;
                    nrnVar.f = 2;
                    objA = a(nsgVar, nrnVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    nsnVar2 = nsnVar;
                    obj = list2;
                    r5 = this;
                    nrnVar.a = nsnVar2;
                    nrnVar.b = nsmVar3;
                    nrnVar.g = aivrVar4;
                    nrnVar.c = obj;
                    nrnVar.h = null;
                    nrnVar.f = 3;
                    if (r5.i((defpackage.nsg) objA, nrnVar) != aoluVar) {
                        return aoluVar;
                    }
                    obj2 = obj;
                } else {
                    nrnVar.a = nsnVar;
                    nrnVar.b = nsmVar3;
                    nrnVar.g = aivrVar4;
                    nrnVar.c = list2;
                    nrnVar.f = 1;
                    if (i(nsgVar, nrnVar) == aoluVar) {
                        return aoluVar;
                    }
                    nsnVar2 = nsnVar;
                    obj2 = list2;
                }
                aivrVar2 = aivrVar4;
                r6 = obj2;
                nrnVar.a = nsnVar2;
                nrnVar.b = nsmVar3;
                nrnVar.g = aivrVar2;
                nrnVar.c = null;
                nrnVar.f = 4;
                if (c(r6, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nsm nsmVar4 = nsmVar3;
                nsnVar3 = nsnVar2;
                aivrVar3 = aivrVar2;
                nsmVar2 = nsmVar4;
                nrnVar.a = nsmVar2;
                nrnVar.b = aivrVar3;
                nrnVar.g = null;
                nrnVar.f = 5;
                if (h(nsnVar3, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.b = null;
                nrnVar.f = 6;
                if (g(nsmVar2, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.f = 7;
                objAj = aoov.aj(this.i, new defpackage.kdr((defpackage.nrv) this, aivrVar3, (aoln) null, 18), nrnVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                long j = this.c;
                iAN = a.aN(aivrVar3.g);
                z = false;
                if (iAN != 0 && iAN == 2) {
                    z = true;
                }
                nrnVar.a = null;
                nrnVar.f = 8;
                objAj2 = aoov.aj(this.i, new defpackage.nrt(z, (defpackage.nrv) this, j, (aoln) null, 0), nrnVar);
                if (objAj2 != aoluVar) {
                    objAj2 = aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 1:
            case 3:
                java.lang.Object obj3 = nrnVar.c;
                aivrVar2 = nrnVar.g;
                nsmVar3 = (defpackage.nsm) nrnVar.b;
                defpackage.nsn nsnVar4 = (defpackage.nsn) nrnVar.a;
                aooc.af(objA);
                r6 = obj3;
                nsnVar2 = nsnVar4;
                nrnVar.a = nsnVar2;
                nrnVar.b = nsmVar3;
                nrnVar.g = aivrVar2;
                nrnVar.c = null;
                nrnVar.f = 4;
                if (c(r6, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nsm nsmVar5 = nsmVar3;
                nsnVar3 = nsnVar2;
                aivrVar3 = aivrVar2;
                nsmVar2 = nsmVar5;
                nrnVar.a = nsmVar2;
                nrnVar.b = aivrVar3;
                nrnVar.g = null;
                nrnVar.f = 5;
                if (h(nsnVar3, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.b = null;
                nrnVar.f = 6;
                if (g(nsmVar2, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.f = 7;
                objAj = aoov.aj(this.i, new defpackage.kdr((defpackage.nrv) this, aivrVar3, (aoln) null, 18), nrnVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                long j2 = this.c;
                iAN = a.aN(aivrVar3.g);
                z = false;
                if (iAN != 0) {
                    z = true;
                }
                nrnVar.a = null;
                nrnVar.f = 8;
                objAj2 = aoov.aj(this.i, new defpackage.nrt(z, (defpackage.nrv) this, j2, (aoln) null, 0), nrnVar);
                if (objAj2 != aoluVar) {
                    objAj2 = aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 2:
                defpackage.nrv nrvVar = nrnVar.h;
                java.lang.Object obj4 = nrnVar.c;
                defpackage.aivr aivrVar5 = nrnVar.g;
                defpackage.nsm nsmVar6 = (defpackage.nsm) nrnVar.b;
                defpackage.nsn nsnVar5 = (defpackage.nsn) nrnVar.a;
                aooc.af(objA);
                r5 = nrvVar;
                nsnVar2 = nsnVar5;
                aivrVar4 = aivrVar5;
                nsmVar3 = nsmVar6;
                obj = obj4;
                nrnVar.a = nsnVar2;
                nrnVar.b = nsmVar3;
                nrnVar.g = aivrVar4;
                nrnVar.c = obj;
                nrnVar.h = null;
                nrnVar.f = 3;
                if (r5.i((defpackage.nsg) objA, nrnVar) != aoluVar) {
                    return aoluVar;
                }
                obj2 = obj;
                aivrVar2 = aivrVar4;
                r6 = obj2;
                nrnVar.a = nsnVar2;
                nrnVar.b = nsmVar3;
                nrnVar.g = aivrVar2;
                nrnVar.c = null;
                nrnVar.f = 4;
                if (c(r6, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nsm nsmVar7 = nsmVar3;
                nsnVar3 = nsnVar2;
                aivrVar3 = aivrVar2;
                nsmVar2 = nsmVar7;
                nrnVar.a = nsmVar2;
                nrnVar.b = aivrVar3;
                nrnVar.g = null;
                nrnVar.f = 5;
                if (h(nsnVar3, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.b = null;
                nrnVar.f = 6;
                if (g(nsmVar2, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.f = 7;
                objAj = aoov.aj(this.i, new defpackage.kdr((defpackage.nrv) this, aivrVar3, (aoln) null, 18), nrnVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                long j3 = this.c;
                iAN = a.aN(aivrVar3.g);
                z = false;
                if (iAN != 0) {
                    z = true;
                }
                nrnVar.a = null;
                nrnVar.f = 8;
                objAj2 = aoov.aj(this.i, new defpackage.nrt(z, (defpackage.nrv) this, j3, (aoln) null, 0), nrnVar);
                if (objAj2 != aoluVar) {
                    objAj2 = aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 4:
                aivrVar3 = nrnVar.g;
                nsmVar2 = (defpackage.nsm) nrnVar.b;
                nsnVar3 = (defpackage.nsn) nrnVar.a;
                aooc.af(objA);
                nrnVar.a = nsmVar2;
                nrnVar.b = aivrVar3;
                nrnVar.g = null;
                nrnVar.f = 5;
                if (h(nsnVar3, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.b = null;
                nrnVar.f = 6;
                if (g(nsmVar2, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.f = 7;
                objAj = aoov.aj(this.i, new defpackage.kdr((defpackage.nrv) this, aivrVar3, (aoln) null, 18), nrnVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                long j4 = this.c;
                iAN = a.aN(aivrVar3.g);
                z = false;
                if (iAN != 0) {
                    z = true;
                }
                nrnVar.a = null;
                nrnVar.f = 8;
                objAj2 = aoov.aj(this.i, new defpackage.nrt(z, (defpackage.nrv) this, j4, (aoln) null, 0), nrnVar);
                if (objAj2 != aoluVar) {
                    objAj2 = aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 5:
                aivrVar3 = (defpackage.aivr) nrnVar.b;
                nsmVar2 = (defpackage.nsm) nrnVar.a;
                aooc.af(objA);
                nrnVar.a = aivrVar3;
                nrnVar.b = null;
                nrnVar.f = 6;
                if (g(nsmVar2, nrnVar) == aoluVar) {
                    return aoluVar;
                }
                nrnVar.a = aivrVar3;
                nrnVar.f = 7;
                objAj = aoov.aj(this.i, new defpackage.kdr((defpackage.nrv) this, aivrVar3, (aoln) null, 18), nrnVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                long j5 = this.c;
                iAN = a.aN(aivrVar3.g);
                z = false;
                if (iAN != 0) {
                    z = true;
                }
                nrnVar.a = null;
                nrnVar.f = 8;
                objAj2 = aoov.aj(this.i, new defpackage.nrt(z, (defpackage.nrv) this, j5, (aoln) null, 0), nrnVar);
                if (objAj2 != aoluVar) {
                    objAj2 = aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 6:
                aivrVar3 = (defpackage.aivr) nrnVar.a;
                aooc.af(objA);
                nrnVar.a = aivrVar3;
                nrnVar.f = 7;
                objAj = aoov.aj(this.i, new defpackage.kdr((defpackage.nrv) this, aivrVar3, (aoln) null, 18), nrnVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                long j6 = this.c;
                iAN = a.aN(aivrVar3.g);
                z = false;
                if (iAN != 0) {
                    z = true;
                }
                nrnVar.a = null;
                nrnVar.f = 8;
                objAj2 = aoov.aj(this.i, new defpackage.nrt(z, (defpackage.nrv) this, j6, (aoln) null, 0), nrnVar);
                if (objAj2 != aoluVar) {
                    objAj2 = aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 7:
                aivrVar3 = (defpackage.aivr) nrnVar.a;
                aooc.af(objA);
                long j7 = this.c;
                iAN = a.aN(aivrVar3.g);
                z = false;
                if (iAN != 0) {
                    z = true;
                }
                nrnVar.a = null;
                nrnVar.f = 8;
                objAj2 = aoov.aj(this.i, new defpackage.nrt(z, (defpackage.nrv) this, j7, (aoln) null, 0), nrnVar);
                if (objAj2 != aoluVar) {
                    objAj2 = aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 8:
                aooc.af(objA);
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d2 A[Catch: Exception -> 0x012a, all -> 0x0156, PHI: r13 r14
      0x00d2: PHI (r13v12 java.util.List) = (r13v11 java.util.List), (r13v18 java.util.List) binds: [B:39:0x00d0, B:20:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r14v12 java.lang.Object) = (r14v11 java.lang.Object), (r14v1 java.lang.Object) binds: [B:39:0x00d0, B:20:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x012a, blocks: (B:15:0x0036, B:45:0x0104, B:47:0x010c, B:20:0x0047, B:40:0x00d2, B:42:0x00d6, B:43:0x00f6, B:38:0x00c3), top: B:61:0x0028, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[Catch: Exception -> 0x012a, all -> 0x0156, TryCatch #1 {Exception -> 0x012a, blocks: (B:15:0x0036, B:45:0x0104, B:47:0x010c, B:20:0x0047, B:40:0x00d2, B:42:0x00d6, B:43:0x00f6, B:38:0x00c3), top: B:61:0x0028, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6 A[Catch: Exception -> 0x012a, all -> 0x0156, TryCatch #1 {Exception -> 0x012a, blocks: (B:15:0x0036, B:45:0x0104, B:47:0x010c, B:20:0x0047, B:40:0x00d2, B:42:0x00d6, B:43:0x00f6, B:38:0x00c3), top: B:61:0x0028, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (r2.a(r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        if (r14 != r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r13, aoln r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrv.c(java.util.List, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.nrp nrpVar;
        defpackage.nsk nskVar;
        if (aolnVar instanceof defpackage.nrp) {
            nrpVar = (defpackage.nrp) aolnVar;
            int i = nrpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrpVar.c = i - Integer.MIN_VALUE;
            } else {
                nrpVar = new defpackage.nrp(this, aolnVar);
            }
        } else {
            nrpVar = new defpackage.nrp(this, aolnVar);
        }
        java.lang.Object objD = nrpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nrpVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.nqs nqsVar = this.b;
            nrpVar.c = 1;
            objD = nqsVar.d(nrpVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        defpackage.nqj nqjVar = (defpackage.nqj) objD;
        long j = 0;
        if (nqjVar != null && (nskVar = nqjVar.d) != null) {
            j = (nqjVar.c * 1000) / ((long) nskVar.b);
        }
        return new java.lang.Long(j);
    }

    public final java.lang.Object e(int i, aoln aolnVar) {
        a.b().l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "updateCallType", 163, "DobbySessionWriter.kt").w("Updating call type to %s", i);
        defpackage.npw npwVarAw = mni.aw(defpackage.nsm.a.m());
        npwVarAw.v(i);
        java.lang.Object objG = g(npwVarAw.t(), aolnVar);
        return objG != aolu.a ? aojh.a : objG;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[Catch: Exception -> 0x00a5, all -> 0x00f8, TRY_LEAVE, TryCatch #2 {all -> 0x00f8, blocks: (B:14:0x0033, B:38:0x00b8, B:40:0x00c0, B:19:0x0046, B:29:0x007d, B:31:0x0085, B:36:0x00a9, B:46:0x00cf), top: B:52:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #2 {all -> 0x00f8, blocks: (B:14:0x0033, B:38:0x00b8, B:40:0x00c0, B:19:0x0046, B:29:0x007d, B:31:0x0085, B:36:0x00a9, B:46:0x00cf), top: B:52:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.igb igbVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.nrq nrqVar;
        defpackage.igb igbVar2;
        java.lang.Exception e;
        defpackage.igb igbVar3;
        defpackage.igb igbVar4;
        aojh aojhVar;
        if (aolnVar instanceof defpackage.nrq) {
            nrqVar = (defpackage.nrq) aolnVar;
            int i = nrqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrqVar.d = i - Integer.MIN_VALUE;
            } else {
                nrqVar = new defpackage.nrq(this, aolnVar);
            }
        } else {
            nrqVar = new defpackage.nrq(this, aolnVar);
        }
        java.lang.Object objG = nrqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nrqVar.d;
        try {
            try {
                if (i2 == 0) {
                    aooc.af(objG);
                    igbVar2 = this.k;
                    nrqVar.a = igbVar;
                    nrqVar.e = igbVar2;
                    nrqVar.d = 1;
                    if (igbVar2.b(nrqVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            igbVar3 = nrqVar.e;
                            igbVar4 = (defpackage.igb) nrqVar.a;
                            try {
                                aooc.af(objG);
                                if (!((java.lang.Boolean) objG).booleanValue()) {
                                    a.d().i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeAudioChunk$<anonymous>", 69, "DobbySessionWriter.kt").x("failed to createAudioFile, callCreationTime:%d", this.c);
                                    aojhVar = aojh.a;
                                    igbVar3.d();
                                    return aojhVar;
                                }
                                defpackage.nqs nqsVar = this.b;
                                nrqVar.a = igbVar3;
                                nrqVar.e = null;
                                nrqVar.d = 3;
                                objG = nqsVar.g(igbVar4, nrqVar);
                                if (objG == aoluVar) {
                                    return aoluVar;
                                }
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                a.c().i(zct.b).k(e).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeAudioChunk$<anonymous>", 77, "DobbySessionWriter.kt").x("Exception thrown in creating audio file, callCreationTime:%d", this.c);
                                aojhVar = aojh.a;
                            }
                        } else {
                            if (i2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            igbVar3 = (apdp) nrqVar.a;
                            aooc.af(objG);
                        }
                        if (((java.lang.Boolean) objG).booleanValue()) {
                            this.j = true;
                        }
                        igbVar3.d();
                        return aojh.a;
                    }
                    defpackage.igb igbVar5 = nrqVar.e;
                    defpackage.igb igbVar6 = (defpackage.igb) nrqVar.a;
                    aooc.af(objG);
                    igbVar2 = igbVar5;
                    igbVar = igbVar6;
                }
                if (this.j) {
                    igbVar4 = igbVar;
                    igbVar3 = igbVar2;
                } else {
                    defpackage.nqs nqsVar2 = this.b;
                    nrqVar.a = igbVar;
                    nrqVar.e = igbVar2;
                    nrqVar.d = 2;
                    java.lang.Object objB = nqsVar2.b(nrqVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    igbVar4 = igbVar;
                    igbVar3 = igbVar2;
                    objG = objB;
                    if (!((java.lang.Boolean) objG).booleanValue()) {
                        a.d().i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeAudioChunk$<anonymous>", 69, "DobbySessionWriter.kt").x("failed to createAudioFile, callCreationTime:%d", this.c);
                        aojhVar = aojh.a;
                        igbVar3.d();
                        return aojhVar;
                    }
                }
                defpackage.nqs nqsVar3 = this.b;
                nrqVar.a = igbVar3;
                nrqVar.e = null;
                nrqVar.d = 3;
                objG = nqsVar3.g(igbVar4, nrqVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    this.j = true;
                }
                igbVar3.d();
                return aojh.a;
            } catch (java.lang.Exception e3) {
                defpackage.igb igbVar7 = igbVar2;
                e = e3;
                igbVar3 = igbVar7;
                a.c().i(zct.b).k(e).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeAudioChunk$<anonymous>", 77, "DobbySessionWriter.kt").x("Exception thrown in creating audio file, callCreationTime:%d", this.c);
                aojhVar = aojh.a;
            } catch (java.lang.Throwable th) {
                th = th;
                igbVar = igbVar2;
                igbVar.d();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.nsm nsmVar, aoln aolnVar) {
        defpackage.nrr nrrVar;
        if (aolnVar instanceof defpackage.nrr) {
            nrrVar = (defpackage.nrr) aolnVar;
            int i = nrrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrrVar.c = i - Integer.MIN_VALUE;
            } else {
                nrrVar = new defpackage.nrr(this, aolnVar);
            }
        } else {
            nrrVar = new defpackage.nrr(this, aolnVar);
        }
        java.lang.Object objK = nrrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nrrVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objK);
                nri nriVar = this.h;
                long j = this.c;
                nrrVar.c = 1;
                objK = nriVar.k(j, nsmVar, nrrVar);
                if (objK == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objK);
            }
            if (!((java.lang.Boolean) objK).booleanValue()) {
                a.d().i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeExtraData", 300, "DobbySessionWriter.kt").x("failed to write extraData, callCreationTime:%d", this.c);
            }
        } catch (java.lang.Exception e) {
            a.c().i(zct.b).k(e).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeExtraData", 307, "DobbySessionWriter.kt").x("Exception thrown in writing extraData, callCreationTime:%d", this.c);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[Catch: Exception -> 0x008f, TRY_LEAVE, TryCatch #0 {Exception -> 0x008f, blocks: (B:12:0x0030, B:23:0x0069, B:25:0x0071, B:16:0x003c, B:21:0x005b, B:19:0x0043), top: B:31:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v6, types: [aolr, java.lang.Object] */
    public final java.lang.Object h(defpackage.nsn nsnVar, aoln aolnVar) {
        defpackage.nrs nrsVar;
        if (aolnVar instanceof defpackage.nrs) {
            nrsVar = (defpackage.nrs) aolnVar;
            int i = nrsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrsVar.c = i - Integer.MIN_VALUE;
            } else {
                nrsVar = new defpackage.nrs(this, aolnVar);
            }
        } else {
            nrsVar = new defpackage.nrs(this, aolnVar);
        }
        java.lang.Object objAj = nrsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nrsVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(objAj);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objAj);
                }
                if (!((java.lang.Boolean) objAj).booleanValue()) {
                    a.d().i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeScottyLogsForDuplex", 260, "DobbySessionWriter.kt").x("failed to write LogsInfo, callCreationTime:%d", this.c);
                }
                return aojh.a;
            }
            aooc.af(objAj);
            pgi pgiVar = this.l;
            long j = this.c;
            nrsVar.c = 1;
            objAj = aoov.aj((aolr) pgiVar.b, new defpackage.nrk(pgiVar, j, nsnVar, (aoln) null, 0), nrsVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            nri nriVar = this.h;
            long j2 = this.c;
            nrsVar.c = 2;
            objAj = nriVar.m(j2, (defpackage.nso) objAj, nrsVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            if (!((java.lang.Boolean) objAj).booleanValue()) {
                a.d().i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeScottyLogsForDuplex", 260, "DobbySessionWriter.kt").x("failed to write LogsInfo, callCreationTime:%d", this.c);
            }
        } catch (java.lang.Exception e) {
            a.c().i(zct.b).k(e).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeScottyLogsForDuplex", 267, "DobbySessionWriter.kt").x("Exception thrown in writing logs, callCreationTime:%d", this.c);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076 A[Catch: Exception -> 0x0094, TRY_LEAVE, TryCatch #0 {Exception -> 0x0094, blocks: (B:12:0x0032, B:23:0x006e, B:25:0x0076, B:16:0x003e, B:21:0x0060, B:19:0x0045), top: B:31:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v8, types: [aolr, java.lang.Object] */
    public final java.lang.Object i(defpackage.nsg nsgVar, aoln aolnVar) {
        defpackage.nru nruVar;
        if (aolnVar instanceof defpackage.nru) {
            nruVar = (defpackage.nru) aolnVar;
            int i = nruVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nruVar.c = i - Integer.MIN_VALUE;
            } else {
                nruVar = new defpackage.nru(this, aolnVar);
            }
        } else {
            nruVar = new defpackage.nru(this, aolnVar);
        }
        java.lang.Object objAj = nruVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nruVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(objAj);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objAj);
                }
                if (!((java.lang.Boolean) objAj).booleanValue()) {
                    a.d().i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeTranscriptsWithSummary", 283, "DobbySessionWriter.kt").x("failed to write TranscriptInfo, callCreationTime:%d", this.c);
                }
                return aojh.a;
            }
            aooc.af(objAj);
            pgi pgiVar = this.l;
            long j = this.c;
            defpackage.nst nstVar = nsgVar.a;
            defpackage.nmz nmzVar = nsgVar.b;
            nruVar.c = 1;
            objAj = aoov.aj((aolr) pgiVar.b, new defpackage.nrl(pgiVar, j, nstVar, nmzVar, null), nruVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            nri nriVar = this.h;
            long j2 = this.c;
            nruVar.c = 2;
            objAj = nriVar.n(j2, (defpackage.nss) objAj, nruVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            if (!((java.lang.Boolean) objAj).booleanValue()) {
                a.d().i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeTranscriptsWithSummary", 283, "DobbySessionWriter.kt").x("failed to write TranscriptInfo, callCreationTime:%d", this.c);
            }
        } catch (java.lang.Exception e) {
            a.c().i(zct.b).k(e).l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeTranscriptsWithSummary", 290, "DobbySessionWriter.kt").x("Exception thrown in writing transcript, callCreationTime:%d", this.c);
        }
        return aojh.a;
    }

    public final java.lang.Object j(aoln aolnVar) {
        defpackage.npw npwVarAw = mni.aw(defpackage.nsm.a.m());
        npwVarAw.x(true);
        java.lang.Object objG = g(npwVarAw.t(), aolnVar);
        return objG != aolu.a ? aojh.a : objG;
    }

    public final java.lang.Object k(int i, aoln aolnVar) {
        defpackage.npw npwVarAw = mni.aw(defpackage.nsm.a.m());
        npwVarAw.y(i);
        java.lang.Object objG = g(npwVarAw.t(), aolnVar);
        return objG != aolu.a ? aojh.a : objG;
    }
}
