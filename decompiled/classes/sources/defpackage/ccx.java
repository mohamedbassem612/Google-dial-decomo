package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ccx implements defpackage.cci {
    private final /* synthetic */ int $cid;
    public final java.lang.Object b;
    private final java.lang.Object c;

    public ccx(defpackage.aomy aomyVar, int i) {
        this.$cid = i;
        this.c = aomyVar;
        this.b = new defpackage.cix();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [cci, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aonj] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cix] */
    @Override // defpackage.cci
    public final java.lang.Object a(defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        defpackage.ccw ccwVar;
        ?? r8;
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
                aoscVar.z();
                cai caiVar = new cai(aonjVar, aoscVar);
                aoscVar.d(new aib(((defpackage.cix) this.b).a(caiVar, this.c), 2));
                return aoscVar.k();
            }
            defpackage.aosc aoscVar2 = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
            aoscVar2.z();
            defpackage.dew dewVar = new defpackage.dew(aoscVar2, aonjVar);
            java.lang.Object obj = this.b;
            java.lang.Object obj2 = this.c;
            defpackage.det detVar = (defpackage.det) obj2;
            android.view.Choreographer choreographer = detVar.c;
            if (defpackage.aooh.n(choreographer, obj)) {
                synchronized (detVar.e) {
                    ((defpackage.det) obj2).f.add(dewVar);
                    if (!((defpackage.det) obj2).h) {
                        ((defpackage.det) obj2).h = true;
                        choreographer.postFrameCallback(((defpackage.det) obj2).i);
                    }
                }
                aoscVar2.d(new defpackage.deu(obj2, dewVar, 0));
            } else {
                ((android.view.Choreographer) obj).postFrameCallback(dewVar);
                aoscVar2.d(new dev(this, dewVar, 0));
            }
            return aoscVar2.k();
        }
        if (aolnVar instanceof defpackage.ccw) {
            ccwVar = (defpackage.ccw) aolnVar;
            int i2 = ccwVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ccwVar.d = i2 - Integer.MIN_VALUE;
            } else {
                ccwVar = new defpackage.ccw(this, aolnVar);
            }
        } else {
            ccwVar = new defpackage.ccw(this, aolnVar);
        }
        java.lang.Object obj3 = ccwVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = ccwVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(obj3);
            java.lang.Object obj4 = this.b;
            ccwVar.a = aonjVar;
            ccwVar.d = 1;
            if (((defpackage.cce) obj4).a(ccwVar) != aoluVar) {
            }
            r8 = aonjVar;
            return aoluVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj3);
            return obj3;
        }
        java.lang.Object obj5 = ccwVar.a;
        defpackage.aooc.af(obj3);
        r8 = obj5;
        r8 = aonjVar;
        ?? r7 = this.c;
        ccwVar.a = null;
        ccwVar.d = 2;
        java.lang.Object objA = r7.a(r8, ccwVar);
        if (objA != aoluVar) {
            return objA;
        }
        r8 = aonjVar;
        return aoluVar;
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? aonnVar.a(obj, this) : aonnVar.a(obj, this);
        }
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? defpackage.ajsz.aq(this, aolqVar) : defpackage.ajsz.aq(this, aolqVar);
        }
        return defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public final /* synthetic */ defpackage.aolq getKey() {
        if (this.$cid != 0) {
        }
        return defpackage.cci.a;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? defpackage.ajsz.ar(this, aolqVar) : defpackage.ajsz.ar(this, aolqVar);
        }
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        int i = this.$cid;
        if (i == 0) {
            if (aolrVar == null) {
                defpackage.aooh.i("context");
            }
            return defpackage.ajsz.at(this, aolrVar);
        }
        if (i != 1) {
            if (aolrVar == null) {
                defpackage.aooh.i("context");
            }
            return defpackage.ajsz.at(this, aolrVar);
        }
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        return defpackage.ajsz.at(this, aolrVar);
    }

    public ccx(android.view.Choreographer choreographer, defpackage.det detVar, int i) {
        this.$cid = i;
        this.b = choreographer;
        this.c = detVar;
    }

    public ccx(defpackage.cci cciVar, int i) {
        this.$cid = i;
        this.c = cciVar;
        this.b = new defpackage.cce();
    }
}
