package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezs {
    public final boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public aezs(aezu aezuVar, defpackage.aezr aezrVar) {
        this.a = aezu.a.equals(aezuVar);
        this.b = aezuVar.c;
        this.c = aezuVar.d;
        java.lang.String str = aezuVar.e;
        long j = aezuVar.f;
        defpackage.aikn aiknVar = defpackage.aikn.a;
        defpackage.aigb aigbVarG = defpackage.aigf.g(aezuVar.g.size() + 3);
        java.util.Iterator it = aezuVar.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                aigbVarG.i("__phenotype_server_token", aezuVar.e);
                aigbVarG.i("__phenotype_snapshot_token", aezuVar.c);
                aigbVarG.i("__phenotype_configuration_version", java.lang.Long.valueOf(aezuVar.f));
                this.d = aigbVarG.e(false);
                this.e = aezrVar;
                return;
            }
            aezv aezvVar = (aezv) it.next();
            int i = aezvVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                aigbVarG.i(aezvVar.e, java.lang.Long.valueOf(i == 2 ? ((java.lang.Long) aezvVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                aigbVarG.i(aezvVar.e, java.lang.Boolean.valueOf(i == 3 ? ((java.lang.Boolean) aezvVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                aigbVarG.i(aezvVar.e, java.lang.Double.valueOf(i == 4 ? ((java.lang.Double) aezvVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                aigbVarG.i(aezvVar.e, i == 5 ? (java.lang.String) aezvVar.d : "");
            } else if (i3 == 4) {
                aigbVarG.i(aezvVar.e, (i == 6 ? (defpackage.akzc) aezvVar.d : defpackage.akzc.d).D());
            }
        }
    }

    public final boolean a() {
        return ((defpackage.aezr) this.e).a;
    }

    public aezs(defpackage.aext aextVar, defpackage.aezr aezrVar) {
        this.a = aextVar.b.b.isEmpty() && defpackage.aexm.a.equals(aextVar.c);
        this.b = aextVar.f();
        this.c = aextVar.d();
        aextVar.e();
        aextVar.a();
        java.util.Map mapG = aextVar.g();
        if (mapG != null) {
            defpackage.aihd.o(mapG.keySet());
        } else {
            defpackage.aikn aiknVar = defpackage.aikn.a;
        }
        defpackage.aiho aihoVar = aextVar.b().b;
        int size = aihoVar.size() + 3;
        defpackage.ahvr.bC(size, "expectedSize");
        defpackage.aigb aigbVar = new defpackage.aigb(size);
        defpackage.ailj it = aihoVar.iterator();
        while (it.hasNext()) {
            defpackage.aexq aexqVar = (defpackage.aexq) it.next();
            aigbVar.i(aexqVar.c(), aexqVar.b());
        }
        aigbVar.i("__phenotype_server_token", aextVar.e());
        aigbVar.i("__phenotype_snapshot_token", aextVar.f());
        aigbVar.i("__phenotype_configuration_version", java.lang.Long.valueOf(aextVar.a()));
        this.d = aigbVar.e(false);
        this.e = aezrVar;
    }

    public aezs(defpackage.adlk adlkVar) {
        this.e = new defpackage.tvn((char[]) null);
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
        defpackage.adth adthVar = adlkVar.c;
        adthVar.getClass();
        this.c = adthVar;
        this.a = true;
        defpackage.adlm adlmVar = new defpackage.adlm(this);
        this.d = adlmVar;
        adthVar.h(adlmVar);
    }
}
