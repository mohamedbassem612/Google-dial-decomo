package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gcc extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.gcf b;
    final /* synthetic */ defpackage.kgl c;
    final /* synthetic */ defpackage.dzn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcc(defpackage.dzn dznVar, defpackage.gcf gcfVar, defpackage.kgl kglVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = dznVar;
        this.b = gcfVar;
        this.c = kglVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.gcc) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Type inference failed for: r2v5, types: [aozh, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.gcf gcfVar;
        defpackage.dzn dznVarJ;
        defpackage.gcf gcfVar2;
        defpackage.gag gagVar;
        defpackage.gab gabVar;
        boolean z;
        java.util.List list;
        java.util.Iterator it;
        defpackage.kaw kawVar;
        defpackage.gac gacVar;
        defpackage.gcf gcfVar3;
        defpackage.dzn dznVarJ2;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        boolean z2 = false;
        if (i == 0) {
            defpackage.aooc.af(obj);
            defpackage.dzn dznVar = this.d;
            if (dznVar instanceof defpackage.gai) {
                java.util.List list2 = ((defpackage.gai) dznVar).a;
                defpackage.aooh.e(java.util.Collections.singletonList(new defpackage.gdo(0, null)), "singletonList(...)");
                throw null;
            }
            if (dznVar instanceof defpackage.gag) {
                defpackage.gag gagVar2 = (defpackage.gag) dznVar;
                defpackage.gac gacVar2 = gagVar2.a;
                defpackage.gac gacVar3 = defpackage.gac.a;
                defpackage.gcf gcfVar4 = this.b;
                if (gacVar2 == gacVar3) {
                    java.util.List list3 = gagVar2.b;
                    int i2 = gagVar2.c;
                    int i3 = gagVar2.d;
                    defpackage.gab gabVar2 = gagVar2.e;
                    defpackage.gab gabVar3 = gagVar2.f;
                    java.lang.Object obj2 = this.c.d;
                    this.a = 2;
                    if (gcfVar4.g(list3, i2, i3, true, gabVar2, (defpackage.kaw) obj2, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (((java.lang.Boolean) gcfVar4.j.c()).booleanValue()) {
                        this.a = 3;
                        if (defpackage.aooh.J(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    gcfVar = this.b;
                    dznVarJ = gcfVar.d.j(this.d);
                    this.a = 4;
                    if (gcfVar.a(dznVarJ, this) == aoluVar) {
                        return aoluVar;
                    }
                    gcfVar2 = this.b;
                    gagVar = (defpackage.gag) this.d;
                    defpackage.gab gabVar4 = gagVar.e;
                    defpackage.gab gabVar5 = gagVar.f;
                    defpackage.aogc aogcVar = gcfVar2.l;
                    aogcVar.bj(gabVar4);
                    defpackage.fzd fzdVar = (defpackage.fzd) aogcVar.b.c();
                    if (fzdVar != null) {
                    }
                    if (gabVar != null) {
                        throw new java.lang.IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                    }
                    defpackage.gac gacVar4 = gagVar.a;
                    if (gacVar4 == defpackage.gac.b) {
                    }
                    list = gagVar.b;
                    if (!(list instanceof java.util.Collection)) {
                        it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                z2 = true;
                                break;
                            }
                        } while (((defpackage.gdo) it.next()).b.isEmpty());
                    } else {
                        it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                z2 = true;
                                break;
                            }
                        } while (((defpackage.gdo) it.next()).b.isEmpty());
                    }
                    if (!z) {
                        gcfVar2.f = false;
                    } else if (gcfVar2.f) {
                        if (z2) {
                            kawVar = gcfVar2.k;
                            if (kawVar != null) {
                                kawVar.ah(gcfVar2.d.g(gcfVar2.g));
                            }
                        } else {
                            kawVar = gcfVar2.k;
                            if (kawVar != null) {
                                kawVar.ah(gcfVar2.d.g(gcfVar2.g));
                            }
                        }
                    } else if (z2) {
                        kawVar = gcfVar2.k;
                        if (kawVar != null) {
                            kawVar.ah(gcfVar2.d.g(gcfVar2.g));
                        }
                    }
                }
            } else if (dznVar instanceof defpackage.gae) {
                if (((java.lang.Boolean) this.b.j.c()).booleanValue()) {
                    this.a = 5;
                    if (defpackage.aooh.J(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                gcfVar3 = this.b;
                dznVarJ2 = gcfVar3.d.j(this.d);
                this.a = 6;
                if (gcfVar3.a(dznVarJ2, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.gcf gcfVar5 = this.b;
                gacVar = ((defpackage.gae) this.d).a;
                defpackage.fzz fzzVar = defpackage.fzz.b;
                if (gacVar == null) {
                    defpackage.aooh.i("type");
                }
                gcfVar5.l.bi(new defpackage.dpz(gacVar, fzzVar, 12));
                gcfVar5.f = false;
            } else if (dznVar instanceof defpackage.gah) {
                defpackage.gcf gcfVar6 = this.b;
                defpackage.gah gahVar = (defpackage.gah) dznVar;
                defpackage.gab gabVar6 = gahVar.a;
                defpackage.gab gabVar7 = gahVar.b;
                gcfVar6.l.bj(gabVar6);
            }
        } else if (i == 1 || i == 2) {
            defpackage.aooc.af(obj);
        } else {
            defpackage.aooc.af(obj);
            if (i == 3) {
                gcfVar = this.b;
                dznVarJ = gcfVar.d.j(this.d);
                this.a = 4;
                if (gcfVar.a(dznVarJ, this) == aoluVar) {
                    return aoluVar;
                }
            } else if (i != 4) {
                if (i == 5) {
                    gcfVar3 = this.b;
                    dznVarJ2 = gcfVar3.d.j(this.d);
                    this.a = 6;
                    if (gcfVar3.a(dznVarJ2, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.gcf gcfVar7 = this.b;
                gacVar = ((defpackage.gae) this.d).a;
                defpackage.fzz fzzVar2 = defpackage.fzz.b;
                if (gacVar == null) {
                    defpackage.aooh.i("type");
                }
                gcfVar7.l.bi(new defpackage.dpz(gacVar, fzzVar2, 12));
                gcfVar7.f = false;
            }
            gcfVar2 = this.b;
            gagVar = (defpackage.gag) this.d;
            defpackage.gab gabVar8 = gagVar.e;
            defpackage.gab gabVar9 = gagVar.f;
            defpackage.aogc aogcVar2 = gcfVar2.l;
            aogcVar2.bj(gabVar8);
            defpackage.fzd fzdVar2 = (defpackage.fzd) aogcVar2.b.c();
            gabVar = fzdVar2 != null ? fzdVar2.d : null;
            if (gabVar != null) {
                throw new java.lang.IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
            }
            defpackage.gac gacVar5 = gagVar.a;
            z = (gacVar5 == defpackage.gac.b || !gabVar.c.c) && !(gacVar5 == defpackage.gac.c && gabVar.d.c);
            list = gagVar.b;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                } while (((defpackage.gdo) it.next()).b.isEmpty());
            } else {
                z2 = true;
                break;
            }
            if (!z) {
                gcfVar2.f = false;
            } else if (gcfVar2.f) {
                if (z2) {
                    kawVar = gcfVar2.k;
                    if (kawVar != null) {
                        kawVar.ah(gcfVar2.d.g(gcfVar2.g));
                    }
                }
            } else if (z2 || gcfVar2.g < gcfVar2.d.c) {
                kawVar = gcfVar2.k;
                if (kawVar != null) {
                    kawVar.ah(gcfVar2.d.g(gcfVar2.g));
                }
            } else {
                int i4 = gcfVar2.g;
                defpackage.gbo gboVar = gcfVar2.d;
                if (i4 <= gboVar.c + gboVar.b) {
                    gcfVar2.f = false;
                } else {
                    kawVar = gcfVar2.k;
                    if (kawVar != null) {
                        kawVar.ah(gcfVar2.d.g(gcfVar2.g));
                    }
                }
            }
        }
        defpackage.dzn dznVar2 = this.d;
        if ((dznVar2 instanceof defpackage.gag) || (dznVar2 instanceof defpackage.gae) || (dznVar2 instanceof defpackage.gai)) {
            java.util.Iterator it2 = this.b.e.iterator();
            while (it2.hasNext()) {
                ((defpackage.aomy) it2.next()).a();
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.gcc(this.d, this.b, this.c, aolnVar);
    }
}
