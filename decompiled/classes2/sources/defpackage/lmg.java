package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lmg implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.lmk a;

    public /* synthetic */ lmg(defpackage.lmk lmkVar) {
        this.a = lmkVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        int iAN;
        defpackage.lex lexVar = (defpackage.lex) obj;
        defpackage.lgp lgpVar = lexVar.e;
        if (lgpVar == null) {
            lgpVar = defpackage.lgp.a;
        }
        defpackage.lmk lmkVar = this.a;
        if (lgpVar.b.size() > 0 && !lmkVar.n) {
            int size = lgpVar.b.size() - 1;
            while (true) {
                if (size < 0) {
                    optionalEmpty = j$.util.Optional.empty();
                    break;
                }
                defpackage.lgo lgoVar = (defpackage.lgo) lgpVar.b.get(size);
                int iAN2 = a.aN(lgoVar.g);
                if (iAN2 != 0 && iAN2 == 3) {
                    optionalEmpty = j$.util.Optional.of(lgoVar);
                    break;
                }
                size--;
            }
            if (optionalEmpty.isPresent() && (iAN = a.aN(((defpackage.lgo) optionalEmpty.orElseThrow()).f)) != 0 && iAN == 3) {
                j$.util.Optional optional = lmkVar.k;
                defpackage.kwv kwvVar = new defpackage.kwv(lmkVar, 17);
                if (true == optional.isPresent()) {
                    java.lang.Object obj2 = optional.get();
                    java.lang.Object obj3 = kwvVar.a;
                    aify aifyVarN = aify.n(((defpackage.lex) obj2).f);
                    defpackage.lmb lmbVar = ((defpackage.lmk) obj3).e;
                    ahvr.cj(lmbVar.g, "expected non null suggestions");
                    lmbVar.g = aifyVarN;
                    lmbVar.f(lmbVar.a() - 1);
                }
                defpackage.lmb lmbVar2 = lmkVar.e;
                lmbVar2.h = false;
                lmbVar2.f(lmbVar2.a() - 1);
            }
        }
        defpackage.lmb lmbVar3 = lmkVar.e;
        defpackage.lgp lgpVar2 = lexVar.e;
        if (lgpVar2 == null) {
            lgpVar2 = defpackage.lgp.a;
        }
        abwd abwdVar = lexVar.d;
        if (abwdVar == null) {
            abwdVar = abwd.a;
        }
        if (!j$.util.Objects.equals(lgpVar2, lmbVar3.e)) {
            lmbVar3.a.o(rmx.bC);
        }
        defpackage.lgp lgpVar3 = lmbVar3.e;
        lmbVar3.e = lgpVar2;
        if (lmbVar3.e == null) {
            lmbVar3.e = defpackage.lgp.a;
        }
        if (lgpVar3.b.size() == 0) {
            defpackage.lgp lgpVar4 = lmbVar3.e;
            int size2 = lgpVar4.b.size();
            if (size2 > 1) {
                lmbVar3.i = lgpVar4.b.size() - 1;
            } else if (size2 == 1) {
                defpackage.lgo lgoVar2 = (defpackage.lgo) lgpVar4.b.get(0);
                if ((lgoVar2.b & 64) == 0 || lgoVar2.i <= 0) {
                    lmbVar3.i = -1;
                } else {
                    lmbVar3.i = 0;
                }
            }
        }
        lmbVar3.f = abwdVar;
        int size3 = lmbVar3.e.b.size();
        int size4 = lgpVar3.b.size();
        if (size3 > size4) {
            while (size4 < lmbVar3.e.b.size()) {
                lmbVar3.g(size4);
                size4++;
            }
        } else {
            for (int i = 0; i < lmbVar3.e.b.size(); i++) {
                if (!((defpackage.lgo) lgpVar3.b.get(i)).equals((defpackage.lgo) lmbVar3.e.b.get(i))) {
                    lmbVar3.f(i);
                }
            }
        }
        if (lmkVar.m || !lmkVar.l) {
            return;
        }
        ((aw) lmkVar.b).Q.findViewById(2131427684).n.ae(lmbVar3.a() - 1);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
