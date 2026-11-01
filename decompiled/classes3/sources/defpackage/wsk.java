package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsk {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public wsk(ahhp ahhpVar, defpackage.adzn adznVar, aolr aolrVar) {
        aooh.f(ahhpVar, "imageManager");
        aooh.f(adznVar, "glideMediaFetcher");
        aooh.f(aolrVar, "blockingContext");
        this.a = adznVar;
        this.c = aolrVar;
        this.b = new defpackage.vqf(ahhpVar);
    }

    public static final int b(java.lang.String str) {
        if (str.length() == 0) {
            return 0;
        }
        return new aorg("\\s+").h(aoov.x(str).toString()).size();
    }

    public static final int c(java.lang.String str, int i, int i2) {
        if (str.length() == 0) {
            return 0;
        }
        java.lang.String strSubstring = str.substring(i, i2);
        aooh.e(strSubstring, "substring(...)");
        return b(strSubstring);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.wjq wjqVar;
        if (aolnVar instanceof defpackage.wjq) {
            wjqVar = (defpackage.wjq) aolnVar;
            int i = wjqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjqVar.b = i - Integer.MIN_VALUE;
            } else {
                wjqVar = new defpackage.wjq(this, aolnVar);
            }
        } else {
            wjqVar = new defpackage.wjq(this, aolnVar);
        }
        java.lang.Object obj = wjqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjqVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        java.lang.Object obj2 = this.b;
        wjqVar.b = 1;
        defpackage.wjt wjtVar = (defpackage.wjt) obj2;
        java.lang.Object objA = ahvr.ag(wjtVar.a, wjtVar.f, new uer(wjtVar, (aoln) null, 15)).a(wjqVar);
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        if (objA == aoluVar) {
            return aoluVar;
        }
        java.lang.Object obj3 = this.a;
        wjqVar.b = 2;
        defpackage.wjr wjrVar = (defpackage.wjr) obj3;
        java.lang.Object objA2 = ahvr.ag(wjrVar.b, wjrVar.d, new uer(wjrVar, (aoln) null, 14, (byte[]) null)).a(wjqVar);
        if (objA2 != aoluVar) {
            objA2 = aojh.a;
        }
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq d(java.lang.String str) {
        return ahvr.F(new vms(this, str, 20, (byte[]) null), (java.util.concurrent.Executor) this.b);
    }

    public final void e(java.lang.String str) {
        ((java.lang.StringBuilder) this.a).append(str);
    }

    public final void f(java.lang.String str) {
        ((java.util.ArrayList) this.b).add(str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aehm, java.lang.Object] */
    public final void g(java.lang.Object obj, android.widget.ImageView imageView) {
        int iIntValue;
        if (defpackage.yep.a == null) {
            defpackage.yep.a = (defpackage.yep) ((defpackage.yep) new defpackage.yep().o()).n();
        }
        defpackage.yep yepVar = defpackage.yep.a;
        ahyn ahynVarG = aesg.g(imageView);
        if (ahynVarG.f()) {
            yepVar = (defpackage.yep) yepVar.y(((java.lang.Integer) ahynVarG.b()).intValue());
        }
        defpackage.xsv xsvVarB = ((ahhp) ((defpackage.aprf) this.c).a).b().f(obj == null ? null : defpackage.aelb.b(obj, this.b)).i(yepVar);
        android.content.Context context = (android.content.Context) this.a;
        android.graphics.drawable.Drawable drawableBO = den.bO(context, 2131231921);
        if (aehj.j(context)) {
            iIntValue = aehj.o(context, 2130969078);
        } else {
            boolean zA = defpackage.aejk.a(context);
            aigf aigfVarB = defpackage.aejk.b(context);
            aigb aigbVar = new aigb(4);
            for (defpackage.aeji aejiVar : defpackage.aeji.values()) {
                aigbVar.i(aejiVar, java.lang.Integer.valueOf(context.getColor(zA ? aejiVar.e : aejiVar.f)));
            }
            java.lang.Integer num = (java.lang.Integer) new defpackage.aejk(zA, aigfVarB, aigbVar.e(true)).a.get(defpackage.aeji.BLUE);
            if (num == null) {
                throw new java.lang.IllegalArgumentException("Unsupported GoogleColors value");
            }
            iIntValue = num.intValue();
        }
        aehj.k(drawableBO, iIntValue);
        ((defpackage.xsv) xsvVarB.t(drawableBO)).m(imageView);
    }

    public final defpackage.wsk h() {
        java.lang.String string = ((java.lang.StringBuilder) this.a).toString();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.b;
        return new defpackage.wsk(this.c, string, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    public wsk(defpackage.whg whgVar, ajwr ajwrVar, defpackage.wsj wsjVar) {
        this.a = whgVar;
        this.c = ajwrVar;
        this.b = wsjVar;
    }

    public wsk(defpackage.wiv wivVar, defpackage.wjb wjbVar, ajct ajctVar) {
        aooh.f(wjbVar, "xatuTreeItemsLogTracker");
        aooh.f(ajctVar, "lightweightExecutor");
        this.c = wivVar;
        this.b = wjbVar;
        this.a = ajctVar;
    }

    public wsk(defpackage.wjt wjtVar, defpackage.wjr wjrVar, defpackage.wka wkaVar) {
        aooh.f(wjtVar, "duplexEventListener");
        aooh.f(wjrVar, "daredevilEventListener");
        aooh.f(wkaVar, "sodaEventListener");
        this.b = wjtVar;
        this.a = wjrVar;
        this.c = wkaVar;
    }

    public wsk(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public wsk(ajct ajctVar, aoin aoinVar) {
        this.c = new aca();
        this.b = new ajdc(ajctVar);
        this.a = aoinVar;
    }

    public wsk(java.lang.String str) {
        this.a = new java.lang.StringBuilder();
        this.b = new java.util.ArrayList();
        this.c = str;
    }
}
