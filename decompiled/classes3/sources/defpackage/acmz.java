package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acmz {
    public final aclt a;
    public final defpackage.acmq b;
    public final adae f;
    public final defpackage.aprf g = new defpackage.aprf(this);
    public int d = 0;
    public java.lang.Runnable e = null;
    public final defpackage.acnb c = new defpackage.acnb();

    public acmz(aclt acltVar, defpackage.acmq acmqVar, adae adaeVar) {
        this.a = acltVar;
        this.b = acmqVar;
        this.f = adaeVar;
    }

    public final void a() {
        this.e = null;
        defpackage.acnb acnbVar = this.c;
        if (acnbVar.d.isEmpty() && acnbVar.a.isEmpty() && acnbVar.b.isEmpty() && acnbVar.f.isEmpty()) {
            return;
        }
        ahoq ahoqVarW = ahvr.W(1249, "GIL:AutoProcessBatch");
        try {
            this.a.b(new acls() { // from class: acmy
                public final java.util.List a() {
                    defpackage.acnb acnbVar2 = this.a.c;
                    if (android.util.Log.isLoggable("GIL", 2)) {
                        android.util.Log.v("GIL", java.lang.String.format(java.util.Locale.US, "AutoGIL Batch: inserts=%d; visibility=%d; removes=%d", java.lang.Integer.valueOf(acnbVar2.a.size()), java.lang.Integer.valueOf(acnbVar2.b.size()), java.lang.Integer.valueOf(acnbVar2.f.size())));
                    }
                    ahoq ahoqVarW2 = ahvr.W(1252, "GIL:CreateInsertGrafts");
                    try {
                        java.util.Set<defpackage.acmd> set = acnbVar2.a;
                        for (defpackage.acmd acmdVar : set) {
                            if (acmdVar.b == -1) {
                                acnbVar2.b(acmdVar);
                            }
                        }
                        set.clear();
                        java.util.List list = acnbVar2.e;
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((defpackage.acmd) it.next()).b = -1;
                        }
                        list.clear();
                        ahoqVarW2.close();
                        ahoq ahoqVarW3 = ahvr.W(1253, "GIL:CreateVisibilityGrafts");
                        try {
                            java.util.Set<defpackage.acmd> set2 = acnbVar2.b;
                            for (defpackage.acmd acmdVar2 : set2) {
                                ahvr.cc(acmdVar2.c(), "Not impressed: %s", acmdVar2);
                                int iD = acmdVar2.d();
                                akzz akzzVar = acmdVar2.c;
                                int iAS = a.aS(akzzVar.b.e);
                                if (iAS == 0) {
                                    iAS = 1;
                                }
                                if (iAS != iD) {
                                    int iAS2 = a.aS(akzzVar.b.e);
                                    if (iAS2 == 0) {
                                        iAS2 = 1;
                                    }
                                    int i = iAS2 - 1;
                                    if (i == 2 || i == 4) {
                                        if (iD == 2) {
                                            continue;
                                        } else {
                                            ahvr.bZ(iD != 1, "Repressed VE was visible.");
                                        }
                                    }
                                    akzzVar.u();
                                    acmi acmiVar = akzzVar.b;
                                    int i2 = iD - 1;
                                    if (iD == 0) {
                                        throw null;
                                    }
                                    acmiVar.e = i2;
                                    acmiVar.b |= 2;
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    aaoo.ay(acmdVar2, arrayList);
                                    defpackage.acna acnaVarA = acnbVar2.a(arrayList, 0);
                                    int iAS3 = a.aS(((acmi) arrayList.get(0)).e);
                                    if (iAS3 == 0 || iAS3 == 1) {
                                        acnaVarA.b(new defpackage.acnj(2, arrayList, acnaVarA.e.size()));
                                        defpackage.akgh akghVar = new defpackage.akgh(acnaVarA);
                                        aiwc aiwcVar = akzzVar.b.d;
                                        if (aiwcVar == null) {
                                            aiwcVar = aiwc.a;
                                        }
                                        aiwd aiwdVar = aiwcVar.e;
                                        if (aiwdVar == null) {
                                            aiwdVar = aiwd.a;
                                        }
                                        if ((aiwdVar.b & 2) != 0) {
                                            akghVar.f(acmdVar2);
                                        }
                                    } else {
                                        acnaVarA.b(new defpackage.acnj(3, arrayList, -1));
                                    }
                                }
                            }
                            set2.clear();
                            ahoqVarW3.close();
                            java.util.Map map = acnbVar2.f;
                            if (!map.isEmpty()) {
                                ahoq ahoqVarW4 = ahvr.W(1254, "GIL:CreateRemoveGrafts");
                                try {
                                    for (java.util.Map.Entry entry : map.entrySet()) {
                                        java.util.Collection<acmi> collection = (java.util.Collection) entry.getValue();
                                        for (acmi acmiVar2 : collection) {
                                            defpackage.acmd acmdVar3 = (defpackage.acmd) entry.getKey();
                                            int iAS4 = a.aS(acmiVar2.e);
                                            if (iAS4 == 0) {
                                                iAS4 = 1;
                                            }
                                            if (iAS4 == 1) {
                                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                akzz akzzVarP = acmiVar2.p();
                                                akzzVarP.u();
                                                acmi acmiVar3 = akzzVarP.b;
                                                acmiVar3.e = 1;
                                                acmiVar3.b |= 2;
                                                arrayList2.add(akzzVarP.p());
                                                if (acmdVar3 != null) {
                                                    aaoo.ay(acmdVar3, arrayList2);
                                                }
                                                acnbVar2.a(arrayList2, 0).b(new defpackage.acnj(3, arrayList2, -1));
                                            }
                                        }
                                        collection.clear();
                                        acnbVar2.g = collection;
                                    }
                                    ahoqVarW4.close();
                                    acnbVar2.f.clear();
                                } catch (java.lang.Throwable th) {
                                    try {
                                        ahoqVarW4.close();
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            boolean z = acnbVar2.i;
                            ahoq ahoqVarW5 = ahvr.W(1251, "GIL:LogBatch");
                            try {
                                java.util.List<defpackage.acna> list2 = acnbVar2.d;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
                                for (defpackage.acna acnaVar : list2) {
                                    arrayList3.add(new acnk(acnaVar.a, acnaVar.b, acnaVar.c, acnaVar.d, acnaVar.e, acnaVar.f));
                                }
                                list2.clear();
                                acnbVar2.c.clear();
                                ahoqVarW5.close();
                                return arrayList3;
                            } catch (java.lang.Throwable th3) {
                                try {
                                    ahoqVarW5.close();
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (java.lang.Throwable th5) {
                            try {
                                ahoqVarW3.close();
                                throw th5;
                            } catch (java.lang.Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        try {
                            ahoqVarW2.close();
                            throw th7;
                        } catch (java.lang.Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
            });
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.e == null) {
            java.lang.Runnable runnableA = this.b.a(new defpackage.absj(this, 5));
            this.e = runnableA;
            int i = this.d;
            if (i > 0) {
                afec.d(runnableA, i);
            } else {
                afec.e(runnableA);
            }
        }
    }
}
