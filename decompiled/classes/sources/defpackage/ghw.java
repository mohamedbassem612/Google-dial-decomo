package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghw extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ defpackage.gfy f;
    final /* synthetic */ defpackage.aonj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghw(boolean z, boolean z2, defpackage.gfy gfyVar, defpackage.aoln aolnVar, defpackage.aonj aonjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = z;
        this.e = z2;
        this.f = gfyVar;
        this.g = aonjVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.ghw) c((defpackage.gha) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.ghw) c((defpackage.gha) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123  */
    /* JADX WARN: Code duplicated, block: B:75:0x0152  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.gha ghaVar;
        defpackage.gha ghaVar2;
        java.lang.Object obj3;
        defpackage.gfn gfnVarB;
        java.lang.Object objE;
        java.lang.Object obj4;
        java.lang.Object obj5;
        defpackage.gha ghaVar3;
        defpackage.gha ghaVar4;
        java.lang.Object obj6;
        defpackage.gfn gfnVarB2;
        java.lang.Object objE2;
        java.lang.Object obj7;
        if (this.$cid != 0) {
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i = this.b;
            if (i == 0) {
                defpackage.aooc.af(obj);
                defpackage.gha ghaVar5 = (defpackage.gha) this.c;
                if (!this.d) {
                    if (ghaVar5 == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    }
                    return this.g.a(ghaVar5.a);
                }
                boolean z = this.e;
                obj5 = z ? defpackage.ggg.a : defpackage.ggg.b;
                if (z) {
                    ghaVar3 = ghaVar5;
                } else {
                    this.c = ghaVar5;
                    this.a = obj5;
                    this.b = 1;
                    java.lang.Object objE3 = ghaVar5.e();
                    if (objE3 == aoluVar) {
                        return aoluVar;
                    }
                    ghaVar4 = ghaVar5;
                    obj = objE3;
                    obj6 = obj5;
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        gfnVarB2 = this.f.b();
                        this.c = ghaVar4;
                        this.a = obj6;
                        this.b = 2;
                        if (gfnVarB2.a(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    obj5 = obj6;
                    ghaVar3 = ghaVar4;
                }
                defpackage.ghq ghqVar = new defpackage.ghq((defpackage.aoln) null, this.g, 0);
                this.c = ghaVar3;
                this.a = null;
                this.b = 3;
                obj = ghaVar3.d((defpackage.ggg) obj5, ghqVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (!this.e) {
                    this.c = obj;
                    this.b = 4;
                    objE2 = ghaVar3.e();
                    if (objE2 != aoluVar) {
                        return aoluVar;
                    }
                    obj7 = obj;
                    obj = objE2;
                }
            } else if (i == 1) {
                obj6 = this.a;
                ghaVar4 = (defpackage.gha) this.c;
                defpackage.aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    gfnVarB2 = this.f.b();
                    this.c = ghaVar4;
                    this.a = obj6;
                    this.b = 2;
                    if (gfnVarB2.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj5 = obj6;
                ghaVar3 = ghaVar4;
                defpackage.ghq ghqVar2 = new defpackage.ghq((defpackage.aoln) null, this.g, 0);
                this.c = ghaVar3;
                this.a = null;
                this.b = 3;
                obj = ghaVar3.d((defpackage.ggg) obj5, ghqVar2, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (!this.e) {
                    this.c = obj;
                    this.b = 4;
                    objE2 = ghaVar3.e();
                    if (objE2 != aoluVar) {
                        return aoluVar;
                    }
                    obj7 = obj;
                    obj = objE2;
                }
            } else if (i != 2) {
                java.lang.Object obj8 = this.c;
                if (i != 3) {
                    defpackage.aooc.af(obj);
                    obj7 = obj8;
                } else {
                    ghaVar3 = (defpackage.gha) obj8;
                    defpackage.aooc.af(obj);
                    if (!this.e) {
                        this.c = obj;
                        this.b = 4;
                        objE2 = ghaVar3.e();
                        if (objE2 != aoluVar) {
                            return aoluVar;
                        }
                        obj7 = obj;
                        obj = objE2;
                    }
                }
            } else {
                java.lang.Object obj9 = this.a;
                defpackage.gha ghaVar6 = (defpackage.gha) this.c;
                defpackage.aooc.af(obj);
                obj5 = obj9;
                ghaVar3 = ghaVar6;
                defpackage.ghq ghqVar3 = new defpackage.ghq((defpackage.aoln) null, this.g, 0);
                this.c = ghaVar3;
                this.a = null;
                this.b = 3;
                obj = ghaVar3.d((defpackage.ggg) obj5, ghqVar3, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (!this.e) {
                    this.c = obj;
                    this.b = 4;
                    objE2 = ghaVar3.e();
                    if (objE2 != aoluVar) {
                        return aoluVar;
                    }
                    obj7 = obj;
                    obj = objE2;
                }
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                return obj7;
            }
            this.f.b().b();
            return obj7;
        }
        defpackage.aolu aoluVar2 = defpackage.aolu.a;
        int i2 = this.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.gha ghaVar7 = (defpackage.gha) this.c;
            if (!this.d) {
                if (ghaVar7 == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                }
                return this.g.a(ghaVar7.a);
            }
            boolean z2 = this.e;
            obj2 = z2 ? defpackage.ggg.a : defpackage.ggg.b;
            if (z2) {
                ghaVar = ghaVar7;
            } else {
                this.c = ghaVar7;
                this.a = obj2;
                this.b = 1;
                java.lang.Object objE4 = ghaVar7.e();
                if (objE4 == aoluVar2) {
                    return aoluVar2;
                }
                ghaVar2 = ghaVar7;
                obj = objE4;
                obj3 = obj2;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    gfnVarB = this.f.b();
                    this.c = ghaVar2;
                    this.a = obj3;
                    this.b = 2;
                    if (gfnVarB.a(this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                obj2 = obj3;
                ghaVar = ghaVar2;
            }
            ghv ghvVar = new ghv((defpackage.aoln) null, this.g, 0);
            this.c = ghaVar;
            this.a = null;
            this.b = 3;
            obj = ghaVar.d((defpackage.ggg) obj2, ghvVar, this);
            if (obj == aoluVar2) {
                return aoluVar2;
            }
            if (!this.e) {
                this.c = obj;
                this.b = 4;
                objE = ghaVar.e();
                if (objE != aoluVar2) {
                    return aoluVar2;
                }
                obj4 = obj;
                obj = objE;
            }
        } else if (i2 == 1) {
            obj3 = this.a;
            ghaVar2 = (defpackage.gha) this.c;
            defpackage.aooc.af(obj);
            if (!((java.lang.Boolean) obj).booleanValue()) {
                gfnVarB = this.f.b();
                this.c = ghaVar2;
                this.a = obj3;
                this.b = 2;
                if (gfnVarB.a(this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            obj2 = obj3;
            ghaVar = ghaVar2;
            ghv ghvVar2 = new ghv((defpackage.aoln) null, this.g, 0);
            this.c = ghaVar;
            this.a = null;
            this.b = 3;
            obj = ghaVar.d((defpackage.ggg) obj2, ghvVar2, this);
            if (obj == aoluVar2) {
                return aoluVar2;
            }
            if (!this.e) {
                this.c = obj;
                this.b = 4;
                objE = ghaVar.e();
                if (objE != aoluVar2) {
                    return aoluVar2;
                }
                obj4 = obj;
                obj = objE;
            }
        } else if (i2 != 2) {
            java.lang.Object obj10 = this.c;
            if (i2 != 3) {
                defpackage.aooc.af(obj);
                obj4 = obj10;
            } else {
                ghaVar = (defpackage.gha) obj10;
                defpackage.aooc.af(obj);
                if (!this.e) {
                    this.c = obj;
                    this.b = 4;
                    objE = ghaVar.e();
                    if (objE != aoluVar2) {
                        return aoluVar2;
                    }
                    obj4 = obj;
                    obj = objE;
                }
            }
        } else {
            java.lang.Object obj11 = this.a;
            defpackage.gha ghaVar8 = (defpackage.gha) this.c;
            defpackage.aooc.af(obj);
            obj2 = obj11;
            ghaVar = ghaVar8;
            ghv ghvVar3 = new ghv((defpackage.aoln) null, this.g, 0);
            this.c = ghaVar;
            this.a = null;
            this.b = 3;
            obj = ghaVar.d((defpackage.ggg) obj2, ghvVar3, this);
            if (obj == aoluVar2) {
                return aoluVar2;
            }
            if (!this.e) {
                this.c = obj;
                this.b = 4;
                objE = ghaVar.e();
                if (objE != aoluVar2) {
                    return aoluVar2;
                }
                obj4 = obj;
                obj = objE;
            }
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            return obj4;
        }
        this.f.b().b();
        return obj4;
        return obj;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.ghw ghwVar = new defpackage.ghw(this.d, this.e, this.f, aolnVar, this.g, 1, null);
            ghwVar.c = obj;
            return ghwVar;
        }
        defpackage.ghw ghwVar2 = new defpackage.ghw(this.d, this.e, this.f, aolnVar, this.g, 0);
        ghwVar2.c = obj;
        return ghwVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghw(boolean z, boolean z2, defpackage.gfy gfyVar, defpackage.aoln aolnVar, defpackage.aonj aonjVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = z;
        this.e = z2;
        this.f = gfyVar;
        this.g = aonjVar;
    }
}
