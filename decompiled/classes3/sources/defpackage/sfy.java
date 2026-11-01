package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfy extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;
    final /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfy(aosy aosyVar, icm icmVar, icc iccVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.g = aosyVar;
        this.e = icmVar;
        this.f = iccVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:53:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18, types: [aosy, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        apdp apdpVar;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        defpackage.abxt abxtVar;
        java.lang.Object objC;
        defpackage.abxt abxtVar2;
        java.lang.Object obj7;
        java.lang.String str;
        defpackage.vaa vaaVarC;
        java.lang.String str2;
        java.lang.Object obj8;
        java.lang.Object obj9;
        apdp apdpVar2;
        java.lang.Object obj10;
        java.lang.Object obj11;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.d;
            if (i != 0) {
                if (i == 1) {
                    aooc.af(obj);
                } else if (i != 2) {
                    obj10 = this.c;
                    obj8 = this.b;
                    obj11 = this.a;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    obj8 = this.e;
                    obj9 = this.f;
                    apdpVar2 = ((icm) obj8).k;
                    this.a = apdpVar2;
                    this.b = obj8;
                    this.c = obj9;
                    this.d = 3;
                    if (apdpVar2.b(this) != aoluVar) {
                        return aoluVar;
                    }
                    obj10 = obj9;
                    obj11 = apdpVar2;
                }
                try {
                    ((icm) obj8).e.put(obj10, null);
                    return new aoiw(aojh.a);
                } finally {
                    ((apdp) obj11).d();
                }
            }
            aooc.af(obj);
            ?? r10 = this.g;
            this.d = 1;
            obj = r10.a(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            java.lang.Throwable thC = aoiw.c(((aoiw) obj).a);
            if (thC != null) {
                return new aoiw(aooc.ae(thC));
            }
            java.lang.Object obj12 = this.e;
            bbf bbfVar = new bbf((aoln) null, 4, (int[]) null);
            icm icmVar = (icm) obj12;
            aosy aosyVarAg = ahvr.ag(icmVar.b, icmVar.l, bbfVar);
            this.d = 2;
            if (aosyVarAg.a(this) == aoluVar) {
                return aoluVar;
            }
            obj8 = this.e;
            obj9 = this.f;
            apdpVar2 = ((icm) obj8).k;
            this.a = apdpVar2;
            this.b = obj8;
            this.c = obj9;
            this.d = 3;
            if (apdpVar2.b(this) != aoluVar) {
                return aoluVar;
            }
            obj10 = obj9;
            obj11 = apdpVar2;
            ((icm) obj8).e.put(obj10, null);
            return new aoiw(aojh.a);
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    obj3 = this.c;
                    obj2 = (defpackage.sfz) this.b;
                    apdpVar = (apdp) this.a;
                    aooc.af(obj);
                } else if (i2 != 2) {
                    abxtVar2 = (defpackage.abxt) this.b;
                    obj7 = (java.lang.String) this.a;
                    aooc.af(obj);
                } else {
                    obj5 = this.c;
                    obj6 = (java.lang.String) this.b;
                    obj4 = (defpackage.sfz) this.a;
                    aooc.af(obj);
                    abxtVar = (defpackage.abxt) obj;
                    this.a = obj6;
                    this.b = abxtVar;
                    this.c = null;
                    this.d = 3;
                    aimz aimzVar = defpackage.sfz.a;
                    objC = ((defpackage.sfz) obj4).c((android.net.Uri) obj5, this);
                    if (objC != aoluVar2) {
                        return aoluVar2;
                    }
                    abxtVar2 = abxtVar;
                    obj = objC;
                    obj7 = obj6;
                }
                defpackage.sfe sfeVar = (defpackage.sfe) obj;
                str = sfeVar.e;
                vaaVarC = defpackage.abxl.C(defpackage.abxn.a.m());
                str2 = sfeVar.a;
                if (str2 != null) {
                    obj7 = str2;
                }
                vaaVarC.N((java.lang.String) obj7);
                if (str != null) {
                    vaaVarC.O(str);
                }
                if (abxtVar2 != null) {
                    vaaVarC.P(abxtVar2);
                }
                vaaVarC.R(5);
                vaaVarC.Q(4);
                return vaaVarC.M();
            }
            aooc.af(obj);
            obj2 = this.e;
            obj3 = this.f;
            apdpVar = ((defpackage.sfz) obj2).v;
            this.a = apdpVar;
            this.b = obj2;
            this.c = obj3;
            this.d = 1;
            if (apdpVar.b(this) == aoluVar2) {
                return aoluVar2;
            }
            aimz aimzVar2 = defpackage.sfz.a;
            ((defpackage.sfz) obj2).q = (android.net.Uri) obj3;
            apdpVar.d();
            obj4 = this.e;
            defpackage.sfz sfzVar = (defpackage.sfz) obj4;
            android.net.Uri uri = sfzVar.q;
            if (uri == null) {
                return defpackage.abxl.C(defpackage.abxn.a.m()).M();
            }
            java.lang.Object obj13 = this.g;
            defpackage.uss ussVar = sfzVar.w;
            this.a = obj4;
            this.b = obj13;
            this.c = uri;
            this.d = 2;
            sin sinVar = (sin) ussVar.c;
            obj = aoov.aj(sinVar.c, new defpackage.wbf(sinVar, uri, (aoln) null, 1), this);
            if (obj == aoluVar2) {
                return aoluVar2;
            }
            obj5 = uri;
            obj6 = obj13;
            abxtVar = (defpackage.abxt) obj;
            this.a = obj6;
            this.b = abxtVar;
            this.c = null;
            this.d = 3;
            aimz aimzVar3 = defpackage.sfz.a;
            objC = ((defpackage.sfz) obj4).c((android.net.Uri) obj5, this);
            if (objC != aoluVar2) {
                return aoluVar2;
            }
            abxtVar2 = abxtVar;
            obj = objC;
            obj7 = obj6;
            defpackage.sfe sfeVar2 = (defpackage.sfe) obj;
            str = sfeVar2.e;
            vaaVarC = defpackage.abxl.C(defpackage.abxn.a.m());
            str2 = sfeVar2.a;
            if (str2 != null) {
                obj7 = str2;
            }
            vaaVarC.N((java.lang.String) obj7);
            if (str != null) {
                vaaVarC.O(str);
            }
            if (abxtVar2 != null) {
                vaaVarC.P(abxtVar2);
            }
            vaaVarC.R(5);
            vaaVarC.Q(4);
            return vaaVarC.M();
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aosy, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            return new defpackage.sfy((aosy) this.g, (icm) this.e, (icc) this.f, aolnVar, 1);
        }
        java.lang.Object obj2 = this.e;
        return new defpackage.sfy((defpackage.sfz) obj2, (android.net.Uri) this.f, (java.lang.String) this.g, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfy(defpackage.sfz sfzVar, android.net.Uri uri, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = sfzVar;
        this.f = uri;
        this.g = str;
    }
}
