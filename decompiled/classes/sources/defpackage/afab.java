package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afab {
    public int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public afab(byte[] bArr, byte[] bArr2) {
        this.b = new android.util.SparseArray();
        this.a = 0;
        this.c = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
    }

    public static java.lang.String c(java.lang.String str) {
        int iIndexOf = str.indexOf(35);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public static final long i(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final defpackage.afaa a(java.lang.String str) {
        ?? r0 = this.c;
        defpackage.afaa afaaVar = (defpackage.afaa) r0.get(str);
        if (afaaVar != null) {
            return afaaVar;
        }
        defpackage.afaa afaaVar2 = new defpackage.afaa(this, str, new defpackage.aezy(new defpackage.jvu(this, str, 15)));
        r0.put(str, afaaVar2);
        return afaaVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.aify b(java.lang.String str) {
        defpackage.afaa afaaVarA = a(str);
        defpackage.aift aiftVar = new defpackage.aift(4);
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) afaaVarA.b(afaaVarA.a).values()).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            defpackage.ajsy ajsyVarA = ((defpackage.ajmo) ailkVarListIterator.next()).a();
            if (ajsyVarA != null) {
                aiftVar.i(ajsyVarA);
            }
        }
        return aiftVar.g();
    }

    public final void d(defpackage.acme acmeVar) {
        ((defpackage.adae) this.b).x(acmeVar);
    }

    public final void e(defpackage.acmc acmcVar) {
        ((defpackage.akzz) this.c).bV(acmcVar.b, acmcVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aoln aolnVar) {
        defpackage.fzj fzjVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (aolnVar instanceof defpackage.fzj) {
            fzjVar = (defpackage.fzj) aolnVar;
            int i = fzjVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzjVar.b = i - Integer.MIN_VALUE;
            } else {
                fzjVar = new defpackage.fzj(this, aolnVar);
            }
        } else {
            fzjVar = new defpackage.fzj(this, aolnVar);
        }
        java.lang.Object obj3 = fzjVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = fzjVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj3);
                java.lang.Object obj4 = this.c;
                defpackage.apdp apdpVar = (defpackage.apdp) obj4;
                fzjVar.c = apdpVar;
                fzjVar.b = 1;
                if (apdpVar.b(fzjVar) != aoluVar) {
                    obj2 = aoluVar;
                    obj = obj4;
                }
                obj2 = aoluVar;
                return obj2;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = fzjVar.c;
            defpackage.aooc.af(obj3);
            java.util.List listA = ((defpackage.fzl) this.b).a();
            int size = (this.a - listA.size()) + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList(listA.size());
            int i3 = 0;
            for (java.lang.Object obj5 : listA) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    defpackage.ajsz.bh();
                }
                arrayList.add(new defpackage.aokg(i3 + size, (defpackage.dzn) obj5));
                i3 = i4;
            }
            obj2 = aoluVar;
            return obj2;
        } finally {
            ((defpackage.apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.aokg aokgVar, defpackage.aoln aolnVar) {
        defpackage.fzk fzkVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.fzk) {
            fzkVar = (defpackage.fzk) aolnVar;
            int i = fzkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzkVar.b = i - Integer.MIN_VALUE;
            } else {
                fzkVar = new defpackage.fzk(this, aolnVar);
            }
        } else {
            fzkVar = new defpackage.fzk(this, aolnVar);
        }
        java.lang.Object obj2 = fzkVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = fzkVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            obj = this.c;
            fzkVar.c = aokgVar;
            defpackage.apdp apdpVar = (defpackage.apdp) obj;
            fzkVar.d = apdpVar;
            fzkVar.b = 1;
            if (apdpVar.b(fzkVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.apdp apdpVar2 = fzkVar.d;
            defpackage.aokg aokgVar2 = fzkVar.c;
            defpackage.aooc.af(obj2);
            obj = apdpVar2;
            aokgVar = aokgVar2;
        }
        try {
            this.a = aokgVar.a;
            java.lang.Object obj3 = this.b;
            defpackage.dzn dznVar = (defpackage.dzn) aokgVar.b;
            if (dznVar == null) {
                defpackage.aooh.i("event");
            }
            ((defpackage.fzl) obj3).d = true;
            int i3 = 0;
            if (dznVar instanceof defpackage.gag) {
                defpackage.gag gagVar = (defpackage.gag) dznVar;
                ((defpackage.fzl) obj3).e.h(gagVar.e);
                defpackage.gab gabVar = gagVar.f;
                int iOrdinal = gagVar.a.ordinal();
                if (iOrdinal == 0) {
                    defpackage.aojw aojwVar = ((defpackage.fzl) obj3).c;
                    aojwVar.clear();
                    ((defpackage.fzl) obj3).b = gagVar.d;
                    ((defpackage.fzl) obj3).a = gagVar.c;
                    aojwVar.addAll(gagVar.b);
                } else if (iOrdinal == 1) {
                    ((defpackage.fzl) obj3).a = gagVar.c;
                    java.util.List list = gagVar.b;
                    aopp it = new defpackage.aopo(list.size() - 1, 0, -1).iterator();
                    while (it.a) {
                        ((defpackage.fzl) obj3).c.addFirst(list.get(it.a()));
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.aois();
                    }
                    ((defpackage.fzl) obj3).b = gagVar.d;
                    ((defpackage.fzl) obj3).c.addAll(gagVar.b);
                }
            } else if (dznVar instanceof defpackage.gae) {
                defpackage.gae gaeVar = (defpackage.gae) dznVar;
                defpackage.ajni ajniVar = ((defpackage.fzl) obj3).e;
                defpackage.gac gacVar = gaeVar.a;
                ajniVar.i(gacVar, defpackage.fzz.b);
                int iOrdinal2 = gacVar.ordinal();
                if (iOrdinal2 == 1) {
                    ((defpackage.fzl) obj3).a = gaeVar.d;
                    int iQ = gaeVar.q();
                    while (i3 < iQ) {
                        ((defpackage.fzl) obj3).c.removeFirst();
                        i3++;
                    }
                } else {
                    if (iOrdinal2 != 2) {
                        throw new java.lang.IllegalArgumentException("Page drop type must be prepend or append");
                    }
                    ((defpackage.fzl) obj3).b = gaeVar.d;
                    int iQ2 = gaeVar.q();
                    while (i3 < iQ2) {
                        ((defpackage.fzl) obj3).c.removeLast();
                        i3++;
                    }
                }
            } else {
                if (!(dznVar instanceof defpackage.gah)) {
                    if (!(dznVar instanceof defpackage.gai)) {
                        throw new defpackage.aois();
                    }
                    throw null;
                }
                defpackage.gah gahVar = (defpackage.gah) dznVar;
                ((defpackage.fzl) obj3).e.h(gahVar.a);
                defpackage.gab gabVar2 = gahVar.b;
            }
            ((defpackage.apdp) obj).d();
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            ((defpackage.apdp) obj).d();
            throw th;
        }
    }

    public final defpackage.ks h(int i) {
        android.util.SparseArray sparseArray = (android.util.SparseArray) this.b;
        defpackage.ks ksVar = (defpackage.ks) sparseArray.get(i);
        if (ksVar != null) {
            return ksVar;
        }
        defpackage.ks ksVar2 = new defpackage.ks();
        sparseArray.put(i, ksVar2);
        return ksVar2;
    }

    public final defpackage.acxg j() {
        defpackage.ahvr.bZ(this.a != 0, "Semantic events must have a semantic ID.");
        defpackage.akzx akzxVarM = defpackage.aiwc.a.m();
        int i = this.a;
        akzxVarM.u();
        defpackage.aiwc aiwcVar = (defpackage.aiwc) akzxVarM.b;
        aiwcVar.b |= 8;
        aiwcVar.d = i;
        defpackage.aiwc aiwcVar2 = (defpackage.aiwc) akzxVarM.r();
        java.lang.Object obj = this.c;
        defpackage.akzx akzxVar = (defpackage.akzx) obj;
        akzxVar.u();
        defpackage.acmi acmiVar = (defpackage.acmi) ((defpackage.akzz) obj).b;
        defpackage.acmi acmiVar2 = defpackage.acmi.a;
        j$.util.Objects.requireNonNull(aiwcVar2);
        acmiVar.d = aiwcVar2;
        acmiVar.b |= 1;
        return new defpackage.acxg((defpackage.acmi) akzxVar.r(), ((defpackage.adae) this.b).w());
    }

    public afab(byte[] bArr) {
        this.b = new defpackage.fzl();
        this.c = new defpackage.apdp();
        this.a = -1;
    }

    public afab() {
        this.b = new defpackage.adae(2);
        this.c = (defpackage.akzz) defpackage.acmi.a.m();
    }

    public afab(android.content.pm.PackageManager packageManager) {
        this.c = new java.util.HashMap();
        this.a = 0;
        this.b = packageManager;
    }
}
