package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jjw {
    private static final aimz c = aimz.i("com/android/dialer/blockreportspam/BlockReportSpamActions");
    public final zjm a;
    public final kgl b;
    private final ucr d;
    private final aolr e;
    private final zjm f;
    private final zjm g;

    public jjw(kgl kglVar, ucr ucrVar, zjm zjmVar, zjm zjmVar2, zjm zjmVar3, aolr aolrVar) {
        aooh.f(kglVar, "blocking");
        aooh.f(aolrVar, "backgroundContext");
        this.b = kglVar;
        this.d = ucrVar;
        this.f = zjmVar;
        this.g = zjmVar2;
        this.a = zjmVar3;
        this.e = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.content.Context context, defpackage.jjx jjxVar, aoln aolnVar) {
        defpackage.jjq jjqVar;
        if (aolnVar instanceof defpackage.jjq) {
            jjqVar = (defpackage.jjq) aolnVar;
            int i = jjqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jjqVar.c = i - Integer.MIN_VALUE;
            } else {
                jjqVar = new defpackage.jjq(this, aolnVar);
            }
        } else {
            jjqVar = new defpackage.jjq(this, aolnVar);
        }
        java.lang.Object obj = jjqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jjqVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aolr aolrVar = this.e;
            defpackage.fxp fxpVar = new defpackage.fxp(this, context, jjxVar, (aoln) null, 3);
            jjqVar.c = 1;
            if (aoov.aj(aolrVar, fxpVar, jjqVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.jjx jjxVar, aoln aolnVar) {
        defpackage.jjr jjrVar;
        if (aolnVar instanceof defpackage.jjr) {
            jjrVar = (defpackage.jjr) aolnVar;
            int i = jjrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jjrVar.c = i - Integer.MIN_VALUE;
            } else {
                jjrVar = new defpackage.jjr(this, aolnVar);
            }
        } else {
            jjrVar = new defpackage.jjr(this, aolnVar);
        }
        java.lang.Object obj = jjrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jjrVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aolr aolrVar = this.e;
            defpackage.blj bljVar = new defpackage.blj(this, jjxVar, (aoln) null, 17);
            jjrVar.c = 1;
            if (aoov.aj(aolrVar, bljVar, jjrVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.jjx jjxVar, aoln aolnVar) {
        defpackage.jjs jjsVar;
        if (aolnVar instanceof defpackage.jjs) {
            jjsVar = (defpackage.jjs) aolnVar;
            int i = jjsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jjsVar.c = i - Integer.MIN_VALUE;
            } else {
                jjsVar = new defpackage.jjs(this, aolnVar);
            }
        } else {
            jjsVar = new defpackage.jjs(this, aolnVar);
        }
        java.lang.Object obj = jjsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jjsVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aolr aolrVar = this.e;
            defpackage.blj bljVar = new defpackage.blj(this, jjxVar, (aoln) null, 18, (byte[]) null);
            jjsVar.c = 1;
            if (aoov.aj(aolrVar, bljVar, jjsVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.jjx jjxVar, aoln aolnVar) {
        defpackage.jjt jjtVar;
        if (aolnVar instanceof defpackage.jjt) {
            jjtVar = (defpackage.jjt) aolnVar;
            int i = jjtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jjtVar.c = i - Integer.MIN_VALUE;
            } else {
                jjtVar = new defpackage.jjt(this, aolnVar);
            }
        } else {
            jjtVar = new defpackage.jjt(this, aolnVar);
        }
        java.lang.Object objAR = jjtVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jjtVar.c;
        if (i2 == 0) {
            aooc.af(objAR);
            j$.util.Optional optionalG = this.f.g();
            aooh.e(optionalG, "getFeature(...)");
            mnp mnpVar = (mnp) aooh.q(optionalG);
            if (mnpVar != null) {
                long j = jjxVar.k;
                jjtVar.c = 1;
                objAR = mnpVar.f.aR(j, jjtVar);
                if (objAR == aoluVar) {
                    return aoluVar;
                }
            } else {
                c.b().l("com/android/dialer/blockreportspam/BlockReportSpamActions", "updateDobbyNotSpamStatus", 95, "BlockReportSpamActions.kt").v("Dobby feature is not present.");
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objAR);
        ((java.lang.Boolean) objAR).booleanValue();
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.jjx jjxVar, aoln aolnVar) {
        defpackage.jju jjuVar;
        if (aolnVar instanceof defpackage.jju) {
            jjuVar = (defpackage.jju) aolnVar;
            int i = jjuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jjuVar.c = i - Integer.MIN_VALUE;
            } else {
                jjuVar = new defpackage.jju(this, aolnVar);
            }
        } else {
            jjuVar = new defpackage.jju(this, aolnVar);
        }
        java.lang.Object objAS = jjuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jjuVar.c;
        if (i2 == 0) {
            aooc.af(objAS);
            j$.util.Optional optionalG = this.f.g();
            aooh.e(optionalG, "getFeature(...)");
            mnp mnpVar = (mnp) aooh.q(optionalG);
            if (mnpVar != null) {
                long j = jjxVar.k;
                jjuVar.c = 1;
                objAS = mnpVar.f.aS(j, jjuVar);
                if (objAS == aoluVar) {
                    return aoluVar;
                }
            } else {
                c.b().l("com/android/dialer/blockreportspam/BlockReportSpamActions", "updateDobbySpamStatus", 87, "BlockReportSpamActions.kt").v("Dobby feature is not present.");
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objAS);
        ((java.lang.Boolean) objAS).booleanValue();
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.jjx jjxVar, tki tkiVar, aoln aolnVar) {
        defpackage.jjv jjvVar;
        if (aolnVar instanceof defpackage.jjv) {
            jjvVar = (defpackage.jjv) aolnVar;
            int i = jjvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jjvVar.c = i - Integer.MIN_VALUE;
            } else {
                jjvVar = new defpackage.jjv(this, aolnVar);
            }
        } else {
            jjvVar = new defpackage.jjv(this, aolnVar);
        }
        java.lang.Object obj = jjvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jjvVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            tkj tkjVar = jjxVar.l;
            if (tkjVar == null) {
                tkjVar = tkj.a;
            }
            if (tkjVar.d) {
                j$.util.Optional optionalG = this.g.g();
                aooh.e(optionalG, "getFeature(...)");
                tkl tklVar = (tkl) aooh.q(optionalG);
                if (tklVar != null) {
                    j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(jjxVar.k);
                    aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
                    jjvVar.c = 1;
                    if (((rsr) tklVar.a).m(instantOfEpochMilli, tkiVar, jjvVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    c.d().l("com/android/dialer/blockreportspam/BlockReportSpamActions", "updateSharpieScamStatus", 121, "BlockReportSpamActions.kt").v("Sharpie feature is expected but not present.");
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final java.lang.Object g(defpackage.jjx jjxVar, int i, aoln aolnVar) {
        return aosv.D(this.d.e(defpackage.hht.b(jjxVar, i)), aolnVar);
    }
}
