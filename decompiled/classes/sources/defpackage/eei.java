package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eei implements defpackage.ecx {
    public final defpackage.efe a;
    public final defpackage.ecq b;
    public final defpackage.aoss c;
    public final defpackage.aoir d;
    public final defpackage.aoir e;
    public final defpackage.eez f;
    public final defpackage.kgl g;
    public final defpackage.ipc h;
    private final defpackage.aoxh i;
    private int j;
    private defpackage.aoub k;
    private final defpackage.apdp l;

    public eei(defpackage.efe efeVar, java.util.List list, defpackage.ecq ecqVar, defpackage.aolr aolrVar) {
        if (list == null) {
            defpackage.aooh.i("initTasksList");
        }
        if (ecqVar == null) {
            defpackage.aooh.i("corruptionHandler");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        this.a = efeVar;
        this.b = ecqVar;
        defpackage.aoub aoubVar = (defpackage.aoub) aolrVar.get(defpackage.aoub.d);
        if (aoubVar == null) {
            java.util.Objects.toString(aolrVar);
            throw new java.lang.IllegalStateException("Missing Job on Coroutine context: ".concat(java.lang.String.valueOf(aolrVar)));
        }
        defpackage.aoss aossVarN = defpackage.aosv.n(aolrVar.plus(aoubVar));
        this.c = aossVarN;
        this.i = new defpackage.aowy(new defpackage.fyx(this, (defpackage.aoln) null, 1));
        this.l = new defpackage.apdp();
        this.h = new defpackage.ipc((char[]) null, (byte[]) null);
        this.f = new defpackage.eez(this, list, ((defpackage.apbj) aossVarN).a);
        this.d = new defpackage.aoiy(new defpackage.ddw(this, 10));
        int i = 11;
        this.e = new defpackage.aoiy(new defpackage.ddw(this, i));
        this.g = new defpackage.kgl(aossVarN, new defpackage.ddz(this, i), new defpackage.dkm(3), new defpackage.eee(this, (defpackage.aoln) null, 0));
    }

    @Override // defpackage.ecx
    public final java.lang.Object a(defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        defpackage.aooc.Y(((defpackage.apbj) this.c).a);
        return defpackage.dpy.o(new defpackage.eea(this, aonnVar, (defpackage.aoln) null, 2), aolnVar);
    }

    @Override // defpackage.ecx
    public final defpackage.aoxh b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.edc edcVar;
        defpackage.efd efdVar;
        if (aolnVar instanceof defpackage.edc) {
            edcVar = (defpackage.edc) aolnVar;
            int i = edcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                edcVar.c = i - Integer.MIN_VALUE;
            } else {
                edcVar = new defpackage.edc(this, aolnVar);
            }
        } else {
            edcVar = new defpackage.edc(this, aolnVar);
        }
        java.lang.Object objL = edcVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = edcVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objL);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objL);
            }
            efdVar = (defpackage.efd) objL;
            if (efdVar instanceof defpackage.ecr) {
                return ((defpackage.ecr) efdVar).a;
            }
            if (!(efdVar instanceof defpackage.efg)) {
                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (!(efdVar instanceof defpackage.eex)) {
                throw ((defpackage.eex) efdVar).a;
            }
            if (!(efdVar instanceof defpackage.eeu)) {
                throw ((defpackage.eeu) efdVar).a;
            }
            if (efdVar instanceof defpackage.eev) {
                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            throw new defpackage.aois();
        }
        defpackage.aooc.af(objL);
        defpackage.aooc.Y(((defpackage.apbj) this.c).a);
        edcVar.c = 1;
        objL = null;
        edcVar.c = 2;
        objL = l((defpackage.gjy) objL, edcVar);
        if (objL == obj) {
            return obj;
        }
        efdVar = (defpackage.efd) objL;
        if (efdVar instanceof defpackage.ecr) {
            return ((defpackage.ecr) efdVar).a;
        }
        if (!(efdVar instanceof defpackage.efg)) {
            throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        if (!(efdVar instanceof defpackage.eex)) {
            throw ((defpackage.eex) efdVar).a;
        }
        if (!(efdVar instanceof defpackage.eeu)) {
            throw ((defpackage.eeu) efdVar).a;
        }
        if (efdVar instanceof defpackage.eev) {
            throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        throw new defpackage.aois();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.edh edhVar;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof defpackage.edh) {
            edhVar = (defpackage.edh) aolnVar;
            int i = edhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                edhVar.c = i - Integer.MIN_VALUE;
            } else {
                edhVar = new defpackage.edh(this, aolnVar);
            }
        } else {
            edhVar = new defpackage.edh(this, aolnVar);
        }
        java.lang.Object obj = edhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = edhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.apdp apdpVar2 = this.l;
            edhVar.d = apdpVar2;
            edhVar.c = 1;
            if (apdpVar2.b(edhVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = edhVar.d;
            defpackage.aooc.af(obj);
        }
        try {
            int i3 = this.j - 1;
            this.j = i3;
            if (i3 == 0) {
                defpackage.aoub aoubVar = this.k;
                if (aoubVar != null) {
                    aoubVar.s(null);
                }
                this.k = null;
            }
            return defpackage.aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        defpackage.edl edlVar;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof defpackage.edl) {
            edlVar = (defpackage.edl) aolnVar;
            int i = edlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                edlVar.c = i - Integer.MIN_VALUE;
            } else {
                edlVar = new defpackage.edl(this, aolnVar);
            }
        } else {
            edlVar = new defpackage.edl(this, aolnVar);
        }
        java.lang.Object obj = edlVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = edlVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.apdp apdpVar2 = this.l;
            edlVar.d = apdpVar2;
            edlVar.c = 1;
            if (apdpVar2.b(edlVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = edlVar.d;
            defpackage.aooc.af(obj);
        }
        try {
            int i3 = this.j + 1;
            this.j = i3;
            if (i3 == 1) {
                this.k = defpackage.aoov.an(this.c, null, 0, new defpackage.dmu(this, (defpackage.aoln) null, 3, (byte[]) null), 3);
            }
            return defpackage.aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(boolean z, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.edp edpVar;
        java.lang.Object objX;
        defpackage.aoiu aoiuVar;
        defpackage.efd efdVar;
        if (aolnVar instanceof defpackage.edp) {
            edpVar = (defpackage.edp) aolnVar;
            int i = edpVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                edpVar.h = i - Integer.MIN_VALUE;
            } else {
                edpVar = new defpackage.edp(this, aolnVar);
            }
        } else {
            edpVar = new defpackage.edp(this, aolnVar);
        }
        java.lang.Object objBo = edpVar.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = edpVar.h;
        if (i2 == 0) {
            defpackage.aooc.af(objBo);
            objX = this.h.X();
            if (objX instanceof defpackage.efg) {
                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            defpackage.aogc aogcVarO = o();
            edpVar.b = objX;
            edpVar.a = z;
            edpVar.h = 1;
            objBo = aogcVarO.bo();
            if (objBo == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = edpVar.e;
                    int i4 = edpVar.d;
                    boolean z2 = edpVar.a;
                    java.lang.Object obj = edpVar.c;
                    java.lang.Object obj2 = edpVar.b;
                    defpackage.aooc.af(objBo);
                    aoiuVar = (defpackage.aoiu) objBo;
                    efdVar = (defpackage.efd) aoiuVar.a;
                    if (((java.lang.Boolean) aoiuVar.b).booleanValue()) {
                        return efdVar;
                    }
                    this.h.Y(efdVar);
                    return efdVar;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = edpVar.e;
                int i6 = edpVar.d;
                boolean z3 = edpVar.a;
                java.lang.Object obj3 = edpVar.c;
                java.lang.Object obj4 = edpVar.b;
                defpackage.aooc.af(objBo);
                aoiuVar = (defpackage.aoiu) objBo;
                efdVar = (defpackage.efd) aoiuVar.a;
                if (((java.lang.Boolean) aoiuVar.b).booleanValue()) {
                    return efdVar;
                }
                this.h.Y(efdVar);
                return efdVar;
            }
            z = edpVar.a;
            objX = edpVar.b;
            defpackage.aooc.af(objBo);
        }
        int iIntValue = ((java.lang.Number) objBo).intValue();
        boolean z4 = objX instanceof defpackage.ecr;
        int i7 = z4 ? ((defpackage.ecr) objX).c : -1;
        if (z4 && iIntValue == i7) {
            return objX;
        }
        eds edsVar = new eds(this, i7, (defpackage.aoln) null);
        if (z) {
            defpackage.aogc aogcVarO2 = o();
            edq edqVar = new edq(this, edsVar, (defpackage.aoln) null);
            edpVar.b = null;
            edpVar.c = null;
            edpVar.a = true;
            edpVar.d = iIntValue;
            edpVar.e = i7;
            edpVar.h = 2;
            objBo = aogcVarO2.bm(edqVar, edpVar);
            if (objBo == aoluVar) {
                return aoluVar;
            }
            aoiuVar = (defpackage.aoiu) objBo;
            efdVar = (defpackage.efd) aoiuVar.a;
            if (((java.lang.Boolean) aoiuVar.b).booleanValue()) {
                return efdVar;
            }
            this.h.Y(efdVar);
            return efdVar;
        }
        defpackage.aogc aogcVarO3 = o();
        edr edrVar = new edr(this, edsVar, (defpackage.aoln) null);
        edpVar.b = null;
        edpVar.c = null;
        edpVar.a = false;
        edpVar.d = iIntValue;
        edpVar.e = i7;
        edpVar.h = 3;
        objBo = aogcVarO3.bn(edrVar, edpVar);
        if (objBo == aoluVar) {
            return aoluVar;
        }
        aoiuVar = (defpackage.aoiu) objBo;
        efdVar = (defpackage.efd) aoiuVar.a;
        if (((java.lang.Boolean) aoiuVar.b).booleanValue()) {
            return efdVar;
        }
        this.h.Y(efdVar);
        return efdVar;
    }

    public final java.lang.Object g(defpackage.aoln aolnVar) {
        return defpackage.dpy.o(new defpackage.edt(this, (defpackage.aoln) null, 0), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [aonn] */
    public final java.lang.Object h(boolean z, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        defpackage.edu eduVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.edu) {
            eduVar = (defpackage.edu) aolnVar;
            int i = eduVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eduVar.e = i - Integer.MIN_VALUE;
            } else {
                eduVar = new defpackage.edu(this, aolnVar);
            }
        } else {
            eduVar = new defpackage.edu(this, aolnVar);
        }
        java.lang.Object obj2 = eduVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = eduVar.e;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            eduVar.b = aonnVar;
            eduVar.a = z;
            eduVar.e = 1;
            obj2 = null;
            obj = aonnVar;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj2);
                return obj2;
            }
            z = eduVar.a;
            java.lang.Object obj3 = eduVar.b;
            defpackage.aooc.af(obj2);
            obj = obj3;
        }
        boolean z2 = z;
        defpackage.aoss aossVar = this.c;
        defpackage.edy edyVar = new defpackage.edy(this, (defpackage.gjy) obj2, z2, obj, null);
        eduVar.b = null;
        eduVar.a = z2;
        eduVar.e = 2;
        java.lang.Object objAj = defpackage.aoov.aj(((defpackage.apbj) aossVar).a, edyVar, eduVar);
        return objAj == aoluVar ? aoluVar : objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(java.lang.Object obj, boolean z, defpackage.aoln aolnVar) {
        defpackage.eef eefVar;
        defpackage.aoor aoorVar;
        if (aolnVar instanceof defpackage.eef) {
            eefVar = (defpackage.eef) aolnVar;
            int i = eefVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eefVar.c = i - Integer.MIN_VALUE;
            } else {
                eefVar = new defpackage.eef(this, aolnVar);
            }
        } else {
            eefVar = new defpackage.eef(this, aolnVar);
        }
        java.lang.Object obj2 = eefVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = eefVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            defpackage.aoor aoorVar2 = new defpackage.aoor();
            defpackage.eer eerVarJ = j();
            defpackage.eeh eehVar = new defpackage.eeh(this, aoorVar2, obj, z, null);
            eefVar.d = aoorVar2;
            eefVar.c = 1;
            if (eerVarJ.c(eehVar, eefVar) == aoluVar) {
                return aoluVar;
            }
            aoorVar = aoorVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aoorVar = eefVar.d;
            defpackage.aooc.af(obj2);
        }
        return new java.lang.Integer(aoorVar.a);
    }

    public final defpackage.eer j() {
        return (defpackage.eer) this.d.a();
    }

    public final java.lang.Object k(defpackage.aonn aonnVar, defpackage.aolr aolrVar, defpackage.gjy gjyVar, defpackage.aoln aolnVar) {
        return o().bm(new defpackage.eed(this, gjyVar, aolrVar, aonnVar, null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(defpackage.gjy gjyVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.edz edzVar;
        if (aolnVar instanceof defpackage.edz) {
            edzVar = (defpackage.edz) aolnVar;
            int i = edzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                edzVar.c = i - Integer.MIN_VALUE;
            } else {
                edzVar = new defpackage.edz(this, aolnVar);
            }
        } else {
            edzVar = new defpackage.edz(this, aolnVar);
        }
        java.lang.Object obj = edzVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = edzVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                if (this.h.X() instanceof defpackage.eeu) {
                    return this.h.X();
                }
                edzVar.c = 1;
                if (m(edzVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
                return obj;
            }
            defpackage.aooc.af(obj);
            edzVar.c = 2;
            java.lang.Object objF = f(false, edzVar);
            if (objF != obj2) {
                return objF;
            }
            return obj2;
        } catch (java.lang.Throwable th) {
            return new defpackage.eex(th, -1);
        }
    }

    public final java.lang.Object m(defpackage.aoln aolnVar) {
        java.lang.Object objO = defpackage.dpy.o(new defpackage.edo(this, null), aolnVar);
        return objO != defpackage.aolu.a ? defpackage.aojh.a : objO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(defpackage.gat gatVar, defpackage.aoln aolnVar) {
        defpackage.edi ediVar;
        if (aolnVar instanceof defpackage.edi) {
            ediVar = (defpackage.edi) aolnVar;
            int i = ediVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ediVar.c = i - Integer.MIN_VALUE;
            } else {
                ediVar = new defpackage.edi(this, aolnVar);
            }
        } else {
            ediVar = new defpackage.edi(this, aolnVar);
        }
        java.lang.Object obj = ediVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ediVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            java.lang.Object obj2 = gatVar.a;
            defpackage.edk edkVar = new defpackage.edk(this, gatVar, null);
            ediVar.c = 1;
            if (defpackage.dpy.o(edkVar, ediVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final defpackage.aogc o() {
        return (defpackage.aogc) this.e.a();
    }
}
