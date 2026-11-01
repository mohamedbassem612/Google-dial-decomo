package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahiy {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;

    public ahiy(android.view.View view) {
        this.e = view;
        androidx.cardview.widget.CardView cardViewFindViewById = view.findViewById(2131428741);
        aooh.e(cardViewFindViewById, "findViewById(...)");
        this.a = cardViewFindViewById;
        android.view.View viewFindViewById = view.findViewById(2131428745);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
        this.f = imageView;
        android.view.View viewFindViewById2 = view.findViewById(2131428747);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.c = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(2131428746);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.d = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(2131428743);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.g = (android.widget.ImageView) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(2131428744);
        aooh.e(viewFindViewById5, "findViewById(...)");
        this.h = (android.widget.TextView) viewFindViewById5;
        android.view.View viewFindViewById6 = view.findViewById(2131428739);
        aooh.e(viewFindViewById6, "findViewById(...)");
        this.b = (android.widget.Button) viewFindViewById6;
        this.i = imageView.getImageTintList();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahzi, java.lang.Object] */
    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((afip) this.g.eZ()).b(1L, new java.lang.Object[]{str, str2, str3});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahzi, java.lang.Object] */
    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        ((afip) this.c.eZ()).b(1L, new java.lang.Object[]{str, str2, str3, str4});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahzi, java.lang.Object] */
    public final void c(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        ((afim) this.d.eZ()).b(d, new java.lang.Object[]{str, str2, str3, str4});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, aoln aolnVar) {
        defpackage.ugb ugbVar;
        if (aolnVar instanceof defpackage.ugb) {
            ugbVar = (defpackage.ugb) aolnVar;
            int i = ugbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugbVar.b = i - Integer.MIN_VALUE;
            } else {
                ugbVar = new defpackage.ugb(this, aolnVar);
            }
        } else {
            ugbVar = new defpackage.ugb(this, aolnVar);
        }
        java.lang.Object objB = ugbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ugbVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                str = ugbVar.c;
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            aooh.e(objB, "await(...)");
            return objB;
        }
        aooc.af(objB);
        java.lang.Object obj = this.e;
        ugbVar.c = str;
        ugbVar.b = 1;
        objB = ((rsr) obj).b(ugbVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarV = ((ahbv) this.b).v(str, (java.lang.String) objB);
        ugbVar.c = null;
        ugbVar.b = 2;
        objB = aosv.D(ajcqVarV, ugbVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        aooh.e(objB, "await(...)");
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ucr] */
    public final java.lang.Object e(hkd hkdVar, aoln aolnVar) {
        defpackage.ugc ugcVar;
        if (aolnVar instanceof defpackage.ugc) {
            ugcVar = (defpackage.ugc) aolnVar;
            int i = ugcVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugcVar.b = i - Integer.MIN_VALUE;
            } else {
                ugcVar = new defpackage.ugc(this, aolnVar);
            }
        } else {
            ugcVar = new defpackage.ugc(this, aolnVar);
        }
        java.lang.Object objD = ugcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ugcVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarB = this.g.b(new aile(hkdVar));
            aooh.e(ajcqVarB, "batchCheckSpamStatus(...)");
            ugcVar.c = hkdVar;
            ugcVar.b = 1;
            objD = aosv.D(ajcqVarB, ugcVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hkdVar = ugcVar.c;
            aooc.af(objD);
        }
        uip uipVar = (uip) ((aigf) objD).get(hkdVar);
        return uipVar == null ? ttj.I() : uipVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(hkd hkdVar, aoln aolnVar) {
        defpackage.ugd ugdVar;
        boolean zC;
        if (aolnVar instanceof defpackage.ugd) {
            ugdVar = (defpackage.ugd) aolnVar;
            int i = ugdVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugdVar.b = i - Integer.MIN_VALUE;
            } else {
                ugdVar = new defpackage.ugd(this, aolnVar);
            }
        } else {
            ugdVar = new defpackage.ugd(this, aolnVar);
        }
        java.lang.Object objE = ugdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ugdVar.b;
        if (i2 == 0) {
            aooc.af(objE);
            ugdVar.b = 1;
            objE = e(hkdVar, ugdVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        udm udmVar = ((uip) objE).k().b;
        if (udmVar != null) {
            udm udmVar2 = defpackage.udn.a;
            zC = defpackage.udn.c(udmVar);
        } else {
            zC = false;
        }
        return java.lang.Boolean.valueOf(zC);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object g(defpackage.ufz ufzVar, aoln aolnVar) {
        defpackage.uge ugeVar;
        defpackage.ufz ufzVar2;
        defpackage.ufz ufzVar3;
        hkd hkdVar;
        java.lang.String str;
        aiye aiyeVar;
        aiyi aiyiVar;
        java.lang.Object objF;
        aiye aiyeVar2;
        defpackage.ufz ufzVar4;
        aiyi aiyiVar2;
        hkd hkdVar2;
        java.lang.Boolean boolValueOf;
        defpackage.uga ugaVar;
        if (aolnVar instanceof defpackage.uge) {
            ugeVar = (defpackage.uge) aolnVar;
            int i = ugeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugeVar.b = i - Integer.MIN_VALUE;
            } else {
                ugeVar = new defpackage.uge(this, aolnVar);
            }
        } else {
            ugeVar = new defpackage.uge(this, aolnVar);
        }
        java.lang.Object objA = ugeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ugeVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                ufzVar2 = ugeVar.c;
                aooc.af(objA);
            } else if (i2 == 2) {
                ufzVar2 = ugeVar.c;
                aooc.af(objA);
                ufzVar3 = ufzVar2;
                hkdVar = (hkd) objA;
                ugeVar.c = ufzVar3;
                ugeVar.d = hkdVar;
                str = ufzVar3.a;
                ugeVar.e = str;
                aiyeVar = ufzVar3.b;
                ugeVar.f = aiyeVar;
                aiyiVar = ufzVar3.c;
                ugeVar.g = aiyiVar;
                ugeVar.b = 3;
                objF = f(hkdVar, ugeVar);
                if (objF != aoluVar) {
                    return aoluVar;
                }
                aiyeVar2 = aiyeVar;
                objA = objF;
                ufzVar4 = ufzVar3;
                aiyiVar2 = aiyiVar;
                hkdVar2 = hkdVar;
                boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                if ((hkdVar2.b & 16) != 0) {
                    boolValueOf = java.lang.Boolean.valueOf(hkdVar2.g);
                } else {
                    boolValueOf = null;
                }
                ugaVar = new defpackage.uga(str, aiyeVar2, aiyiVar2, zBooleanValue, boolValueOf, java.lang.Boolean.valueOf(((uct) this.f).a(ufzVar4.d.longValue())));
                ugeVar.c = null;
                ugeVar.d = null;
                ugeVar.e = null;
                ugeVar.f = null;
                ugeVar.g = null;
                ugeVar.b = 4;
                if (h(ugaVar, ugeVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                aiyi aiyiVar3 = ugeVar.g;
                aiye aiyeVar3 = ugeVar.f;
                str = ugeVar.e;
                hkd hkdVar3 = ugeVar.d;
                defpackage.ufz ufzVar5 = ugeVar.c;
                aooc.af(objA);
                aiyiVar2 = aiyiVar3;
                hkdVar2 = hkdVar3;
                aiyeVar2 = aiyeVar3;
                ufzVar4 = ufzVar5;
                boolean zBooleanValue2 = ((java.lang.Boolean) objA).booleanValue();
                if ((hkdVar2.b & 16) != 0) {
                    boolValueOf = java.lang.Boolean.valueOf(hkdVar2.g);
                } else {
                    boolValueOf = null;
                }
                ugaVar = new defpackage.uga(str, aiyeVar2, aiyiVar2, zBooleanValue2, boolValueOf, java.lang.Boolean.valueOf(((uct) this.f).a(ufzVar4.d.longValue())));
                ugeVar.c = null;
                ugeVar.d = null;
                ugeVar.e = null;
                ugeVar.f = null;
                ugeVar.g = null;
                ugeVar.b = 4;
                if (h(ugaVar, ugeVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        java.lang.Object obj = this.h;
        ufzVar2 = ufzVar;
        ugeVar.c = ufzVar2;
        ugeVar.b = 1;
        objA = ((defpackage.vie) obj).a(ugeVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objA).booleanValue()) {
            java.lang.String str2 = ufzVar2.a;
            ugeVar.c = ufzVar2;
            ugeVar.b = 2;
            objA = d(str2, ugeVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            ufzVar3 = ufzVar2;
            hkdVar = (hkd) objA;
            ugeVar.c = ufzVar3;
            ugeVar.d = hkdVar;
            str = ufzVar3.a;
            ugeVar.e = str;
            aiyeVar = ufzVar3.b;
            ugeVar.f = aiyeVar;
            aiyiVar = ufzVar3.c;
            ugeVar.g = aiyiVar;
            ugeVar.b = 3;
            objF = f(hkdVar, ugeVar);
            if (objF != aoluVar) {
                return aoluVar;
            }
            aiyeVar2 = aiyeVar;
            objA = objF;
            ufzVar4 = ufzVar3;
            aiyiVar2 = aiyiVar;
            hkdVar2 = hkdVar;
            boolean zBooleanValue3 = ((java.lang.Boolean) objA).booleanValue();
            if ((hkdVar2.b & 16) != 0) {
                boolValueOf = java.lang.Boolean.valueOf(hkdVar2.g);
            } else {
                boolValueOf = null;
            }
            ugaVar = new defpackage.uga(str, aiyeVar2, aiyiVar2, zBooleanValue3, boolValueOf, java.lang.Boolean.valueOf(((uct) this.f).a(ufzVar4.d.longValue())));
            ugeVar.c = null;
            ugeVar.d = null;
            ugeVar.e = null;
            ugeVar.f = null;
            ugeVar.g = null;
            ugeVar.b = 4;
            if (h(ugaVar, ugeVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object h(defpackage.uga ugaVar, aoln aolnVar) {
        defpackage.ugf ugfVar;
        defpackage.ahiy ahiyVar;
        if (aolnVar instanceof defpackage.ugf) {
            ugfVar = (defpackage.ugf) aolnVar;
            int i = ugfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugfVar.b = i - Integer.MIN_VALUE;
            } else {
                ugfVar = new defpackage.ugf(this, aolnVar);
            }
        } else {
            ugfVar = new defpackage.ugf(this, aolnVar);
        }
        java.lang.Object objAj = ugfVar.a;
        aojh aojhVar = aolu.a;
        int i2 = ugfVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objAj);
                ahiyVar = this;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objAj);
            }
            return aojh.a;
        }
        aooc.af(objAj);
        java.lang.String str = ugaVar.a;
        ?? r13 = this.a;
        ahiyVar = this;
        defpackage.ugg uggVar = new defpackage.ugg(ahiyVar, str, ugaVar, (aoln) null, 0);
        ugfVar.b = 1;
        objAj = aoov.aj((aolr) r13, uggVar, ugfVar);
        if (objAj == aojhVar) {
            return aojhVar;
        }
        ugfVar.b = 2;
        java.lang.Object obj = ahiyVar.c;
        defpackage.uzx uzxVarZ = airh.z(aixp.a.m());
        uzxVarZ.ay((aixo) objAj);
        zzd zzdVar = (zzd) obj;
        zzc zzcVarH = zzdVar.h(uzxVarZ.ax(), abtl.b((android.content.Context) ahiyVar.i, new aiyj()));
        zzcVarH.j(pez.bh(zzcVarH.a()), pez.bh(zzcVarH.b()));
        ((zdi) ahiyVar.d).d(zzcVarH);
        if (aojh.a == aojhVar) {
            return aojhVar;
        }
        return aojh.a;
    }

    public ahiy(android.content.Context context, zzd zzdVar, zdi zdiVar, ucr ucrVar, rsr rsrVar, ahbv ahbvVar, uct uctVar, defpackage.vie vieVar, aolr aolrVar) {
        aooh.f(context, "context");
        aooh.f(zzdVar, "scoobyCallLogger");
        aooh.f(ahbvVar, "dialerPhoneNumbers");
        aooh.f(vieVar, "scoobyCallLogLogging");
        aooh.f(aolrVar, "backgroundContext");
        this.i = context;
        this.c = zzdVar;
        this.d = zdiVar;
        this.g = ucrVar;
        this.e = rsrVar;
        this.b = ahbvVar;
        this.f = uctVar;
        this.h = vieVar;
        this.a = aolrVar;
    }

    public ahiy(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, ajxw ajxwVar, android.app.Application application) {
        this.c = ahvr.bI(new defpackage.ahiw(this, 8));
        this.d = ahvr.bI(new defpackage.ahiw(this, 9));
        this.e = ahvr.bI(new defpackage.ahiw(this, 10));
        this.f = ahvr.bI(new defpackage.ahiw(this, 11));
        this.g = ahvr.bI(new defpackage.ahiw(this, 12));
        this.h = ahvr.bI(new defpackage.ahiw(this, 13));
        this.i = ahvr.bI(new defpackage.ahiw(this, 14));
        afit afitVarD = afit.d("tiktok");
        this.a = afitVarD;
        afiv afivVar = afitVarD.c;
        if (afivVar == null) {
            this.b = afiv.c(ajxwVar, scheduledExecutorService, afitVarD, application);
        } else {
            this.b = afivVar;
            afivVar.f = ajxwVar;
        }
    }
}
