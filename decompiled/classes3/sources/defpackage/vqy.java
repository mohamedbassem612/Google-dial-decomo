package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqy {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public vqy() {
        this.b = new aca();
        this.a = new aca();
        this.c = new defpackage.vaa((byte[]) null);
    }

    public static final java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + '$' + str2 + '/' + str3;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0164  */
    /* JADX WARN: Code duplicated, block: B:46:0x0172  */
    /* JADX WARN: Code duplicated, block: B:48:0x017c  */
    /* JADX WARN: Code duplicated, block: B:52:0x018a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0198  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[LOOP:5: B:55:0x019e->B:87:?, LOOP_END, SYNTHETIC] */
    public static ajcq e(acwi acwiVar, defpackage.acvd acvdVar, ahyn ahynVar, java.util.List list) {
        int i;
        java.util.Iterator it;
        acux acuxVar;
        java.util.Iterator it2;
        ajcq ajcqVarY;
        ajcq ajcqVarD;
        defpackage.acvd acvdVar2 = acvdVar;
        defpackage.vqy vqyVar = new defpackage.vqy(acwiVar, ahynVar, list);
        if ((acvdVar2.b & 1) == 0) {
            i = 0;
            it = acvdVar2.c.iterator();
            while (it.hasNext()) {
                acuxVar = ((acvb) it.next()).d;
                if (acuxVar == null) {
                    acuxVar = acux.a;
                }
                for (acuw acuwVar : acuxVar.h) {
                    if (!acuwVar.d.isEmpty()) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("DataFile %s url_to_download is missing.", acuwVar.c));
                    }
                    it2 = acuwVar.g.iterator();
                    while (it2.hasNext()) {
                        if (((acuy) it2.next()).c.isEmpty()) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("DeltaFile for file %s url_to_download is missing.", acuwVar.c));
                        }
                    }
                }
            }
        } else {
            defpackage.acvc acvcVar = acvdVar2.d;
            if (acvcVar == null) {
                acvcVar = defpackage.acvc.a;
            }
            if (acvcVar.b.isEmpty()) {
                i = 0;
                it = acvdVar2.c.iterator();
                while (it.hasNext()) {
                    acuxVar = ((acvb) it.next()).d;
                    if (acuxVar == null) {
                        acuxVar = acux.a;
                    }
                    while (r4.hasNext()) {
                        if (!acuwVar.d.isEmpty()) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("DataFile %s url_to_download is missing.", acuwVar.c));
                        }
                        it2 = acuwVar.g.iterator();
                        while (it2.hasNext()) {
                            if (((acuy) it2.next()).c.isEmpty()) {
                                throw new java.lang.IllegalArgumentException(java.lang.String.format("DeltaFile for file %s url_to_download is missing.", acuwVar.c));
                            }
                        }
                    }
                }
            } else {
                defpackage.acvc acvcVar2 = acvdVar2.d;
                if (acvcVar2 == null) {
                    acvcVar2 = defpackage.acvc.a;
                }
                java.lang.String str = acvcVar2.b;
                akzx akzxVarP = acvdVar2.p();
                akzxVarP.u();
                defpackage.acvd acvdVar3 = (defpackage.acvd) akzxVarP.b;
                albq albqVar = albq.a;
                acvdVar3.c = albqVar;
                for (acvb acvbVar : acvdVar2.c) {
                    acux acuxVar2 = acvbVar.d;
                    if (acuxVar2 == null) {
                        acuxVar2 = acux.a;
                    }
                    akzx akzxVarP2 = acuxVar2.p();
                    akzxVarP2.u();
                    akzxVarP2.b.h = albqVar;
                    acux acuxVar3 = acvbVar.d;
                    if (acuxVar3 == null) {
                        acuxVar3 = acux.a;
                    }
                    for (acuw acuwVar2 : acuxVar3.h) {
                        akzz akzzVarP = acuwVar2.p();
                        akzzVarP.u();
                        akzzVarP.b.g = albqVar;
                        if (acuwVar2.d.isEmpty()) {
                            java.lang.String strReplace = str.replace("{checksum}", acuwVar2.f);
                            akzzVarP.u();
                            acuw acuwVar3 = akzzVarP.b;
                            j$.util.Objects.requireNonNull(strReplace);
                            acuwVar3.b |= 2;
                            acuwVar3.d = strReplace;
                        }
                        for (acuy acuyVar : acuwVar2.g) {
                            if (acuyVar.c.isEmpty()) {
                                akzx akzxVarP3 = acuyVar.p();
                                java.lang.String strReplace2 = str.replace("{checksum}", acuyVar.d);
                                akzxVarP3.u();
                                acuy acuyVar2 = akzxVarP3.b;
                                j$.util.Objects.requireNonNull(strReplace2);
                                acuyVar2.b |= 1;
                                acuyVar2.c = strReplace2;
                                acuyVar = (acuy) akzxVarP3.p();
                            }
                            akzzVarP.u();
                            acuw acuwVar4 = akzzVarP.b;
                            j$.util.Objects.requireNonNull(acuyVar);
                            alat alatVar = acuwVar4.g;
                            if (!alatVar.c()) {
                                acuwVar4.g = alad.J(alatVar);
                            }
                            acuwVar4.g.add(acuyVar);
                        }
                        akzxVarP2.u();
                        acux acuxVar4 = akzxVarP2.b;
                        acuw acuwVarP = akzzVarP.p();
                        j$.util.Objects.requireNonNull(acuwVarP);
                        acuxVar4.b();
                        acuxVar4.h.add(acuwVarP);
                    }
                    akzx akzxVarP4 = acvbVar.p();
                    akzxVarP4.u();
                    acvb acvbVar2 = akzxVarP4.b;
                    acux acuxVarP = akzxVarP2.p();
                    j$.util.Objects.requireNonNull(acuxVarP);
                    acvbVar2.d = acuxVarP;
                    acvbVar2.b |= 2;
                    akzxVarP.u();
                    defpackage.acvd acvdVar4 = (defpackage.acvd) akzxVarP.b;
                    acvb acvbVarP = akzxVarP4.p();
                    j$.util.Objects.requireNonNull(acvbVarP);
                    alat alatVar2 = acvdVar4.c;
                    if (!alatVar2.c()) {
                        acvdVar4.c = alad.J(alatVar2);
                    }
                    acvdVar4.c.add(acvbVarP);
                }
                i = 0;
                acvdVar2 = (defpackage.acvd) akzxVarP.p();
            }
        }
        java.lang.Object obj = vqyVar.a;
        if (((ahyn) obj).f()) {
            try {
                ajcqVarY = ((adcj) ((ahyn) obj).b()).a(acvdVar2);
            } catch (java.lang.Throwable th) {
                ajcqVarY = aiql.y(th);
            }
            ajcqVarD = defpackage.adcs.e(ajcqVarY).d(java.lang.Throwable.class, new defpackage.acwn(14), ajbm.a);
        } else {
            ajcqVarD = aiql.z((java.util.List) j$.util.Collection.-EL.stream(acvdVar2.c).map(new defpackage.adci(i)).collect(j$.util.stream.Collectors.toCollection(new ahuq(1))));
        }
        defpackage.adcs adcsVarE = defpackage.adcs.e(ajcqVarD);
        j$.util.Objects.requireNonNull(vqyVar);
        defpackage.aczi acziVar = new defpackage.aczi(vqyVar, 18);
        ajbm ajbmVar = ajbm.a;
        return adcsVarE.g(acziVar, ajbmVar).d(acup.class, new defpackage.acwn(13), ajbmVar);
    }

    public static defpackage.vqy k(defpackage.alqd alqdVar, almb almbVar) {
        aloa aloaVar = aloa.a;
        if (!almbVar.c.isEmpty()) {
            aloaVar = (aloa) alqdVar.a(alad.M(aloa.class), almbVar.c);
        }
        return new defpackage.vqy(alqdVar, aloaVar, almbVar);
    }

    public final /* bridge */ /* synthetic */ java.lang.CharSequence a() {
        return ((android.content.Context) ((defpackage.vqf) this.c).a).getString(2132021064);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Map map;
        aooh.f(str, "packageName");
        aooh.f(str2, "databaseName");
        aooh.f(str3, "schemaType");
        java.util.Map map2 = (java.util.Map) this.b.get(str);
        if (map2 == null || (map = (java.util.Map) map2.get(str2)) == null) {
            return;
        }
    }

    public final void d(ajcq ajcqVar, java.lang.String str, ahyn ahynVar, ahyn ahynVar2) {
        ahvr.J(ajcqVar, new kxp(this, str, ahynVar, 12), ajbm.a);
    }

    public final void f(dbm dbmVar, cpx cpxVar, long j) {
        dbm dbmVar2;
        cpx cpxVar2;
        long j2;
        aooh.f(dbmVar, "contentDrawScope");
        if (anty.ah(j, cfd.S())) {
            dbmVar.D();
            dbmVar2 = dbmVar;
            cpxVar2 = cpxVar;
            j2 = j;
        } else {
            dbmVar2 = dbmVar;
            cpxVar2 = cpxVar;
            den.S(dbmVar2, cpxVar2, j, csl.a, 52);
            j2 = j;
        }
        cqf cqfVarB = dbmVar2.q().b();
        java.util.Iterator it = ((clg) this.c).d.iterator();
        while (it.hasNext()) {
            dbm dbmVar3 = dbmVar2;
            cpx cpxVar3 = cpxVar2;
            ((defpackage.acrh) it.next()).d(cqfVarB, cpxVar3, dbmVar2.o(), dbmVar3);
            cpxVar2 = cpxVar3;
            dbmVar2 = dbmVar3;
        }
        if (anty.ah(j2, cfd.S())) {
            return;
        }
        dbmVar2.D();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    public final void g() {
        this.b.clear();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    public final void h(java.lang.Object obj) {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.c).getAndSet(false)) {
            ((alpg) this.a).a();
        }
        aiql.n((java.util.concurrent.BlockingQueue) this.b, j$.util.Optional.of(obj));
    }

    public final aqan i(java.lang.String str, aqam aqamVar) throws java.io.IOException {
        byte[] bArrE = ((defpackage.alqd) this.c).e(str);
        java.nio.ByteBuffer byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(bArrE.length);
        byteBufferAllocateDirect.put(bArrE);
        return new aqan(byteBufferAllocateDirect, aqamVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aljs */
    /* JADX WARN: Type inference failed for: r0v6, types: [aiii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [alld, java.lang.Object] */
    public final void j(almy almyVar) throws aljs {
        almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = almz.a;
        }
        alnb alnbVarB = alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = alnb.a;
        }
        ?? r1 = this.a;
        aihd aihdVar = (aihd) r1;
        if (aihdVar.contains(alnbVarB)) {
            ?? r0 = this.b;
            r0.t(almyVar.f, almyVar);
            if (aihdVar.equals((aihd) j$.util.Collection.-EL.stream(r0.f(almyVar.f)).map(new ailg(17)).collect(aido.b))) {
                this.c.c(aitt.g(aify.n(r0.g(almyVar.f))).b(new ailg(19)).c(new ailg(20)).f());
                return;
            }
            return;
        }
        almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = almz.a;
        }
        alnb alnbVarB2 = alnb.b(almzVar2.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = alnb.a;
        }
        throw new aljs(java.lang.String.format("Event with unexpected type='%s', expected types='%s'", alnbVarB2, j$.util.Collection.-EL.stream((java.util.Collection) r1).map(new ailg(18)).collect(j$.util.stream.Collectors.joining(","))), aljr.h);
    }

    private vqy(defpackage.alqd alqdVar, aloa aloaVar, almb almbVar) {
        this.c = alqdVar;
        this.b = aloaVar;
        this.a = almbVar;
    }

    public vqy(amwu amwuVar, amwu amwuVar2, amwu amwuVar3) {
        aooh.f(amwuVar, "eventCountPredicate");
        aooh.f(amwuVar2, "appStatePredicate");
        aooh.f(amwuVar3, "permissionPredicate");
        this.a = amwuVar;
        this.c = amwuVar2;
        this.b = amwuVar3;
    }

    public vqy(android.content.Context context, defpackage.vud vudVar, defpackage.vvb vvbVar) {
        this.c = context;
        this.b = vudVar;
        this.a = vvbVar;
    }

    public vqy(anqw anqwVar, anvq anvqVar, anph anphVar) {
        this.b = anqwVar;
        this.c = anvqVar;
        this.a = anphVar;
    }

    public vqy(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public vqy(acwi acwiVar, ahyn ahynVar, java.util.List list) {
        this.c = acwiVar;
        this.a = ahynVar;
        this.b = list;
    }

    public vqy(alpg alpgVar) {
        this.b = new java.util.concurrent.LinkedBlockingQueue();
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.a = alpgVar;
    }

    public vqy(aoss aossVar) {
        this.b = aossVar;
        this.c = new clg();
        this.a = new java.util.LinkedHashMap();
    }

    public vqy(defpackage.vqw vqwVar, ucm ucmVar, java.lang.String str) {
        this.a = vqwVar;
        this.b = ucmVar.d();
        this.c = str;
    }

    public vqy(defpackage.alld alldVar, aihd aihdVar) {
        this.b = new aidf((byte[]) null);
        this.c = alldVar;
        this.a = aihdVar;
    }
}
