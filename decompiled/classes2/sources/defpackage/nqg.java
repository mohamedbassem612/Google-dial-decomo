package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nqg extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    int g;
    final /* synthetic */ defpackage.nqh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqg(defpackage.nqh nqhVar, aoln aolnVar) {
        super(2, aolnVar);
        this.h = nqhVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.nqh nqhVar;
        java.lang.Object objA;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        uzx uzxVar;
        uzx uzxVar2;
        ajcq ajcqVarE;
        defpackage.nqh nqhVar2;
        aolu aoluVar = aolu.a;
        int i = this.g;
        if (i != 0) {
            if (i == 1) {
                java.lang.Object obj7 = this.f;
                java.lang.Object obj8 = this.e;
                java.lang.Object obj9 = this.d;
                obj4 = (uzx) this.c;
                obj3 = (uzx) this.b;
                nqhVar = (defpackage.nqh) this.a;
                aooc.af(obj);
                obj5 = obj7;
                objA = obj9;
                obj2 = obj8;
            } else if (i != 2) {
                aooc.af(obj);
                if (i == 3) {
                    nqhVar2 = this.h;
                    this.g = 4;
                    if (nqhVar2.e.k(3, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                objA = this.d;
                obj6 = (uzx) this.c;
                uzx uzxVar3 = (uzx) this.b;
                uzx uzxVar4 = (uzx) this.a;
                aooc.af(obj);
                uzxVar = uzxVar3;
                uzxVar2 = uzxVar4;
                defpackage.aivr aivrVar = (defpackage.aivr) obj;
                aooh.f(aivrVar, "value");
                akzx akzxVar = (akzx) ((uzx) objA).a;
                akzxVar.u();
                defpackage.aivu aivuVar = (defpackage.aivu) akzxVar.b;
                defpackage.aivu aivuVar2 = defpackage.aivu.a;
                j$.util.Objects.requireNonNull(aivrVar);
                aivuVar.A = aivrVar;
                aivuVar.b |= 268435456;
                ((uzx) obj6).s(uzxVar.az());
                akzx akzxVarP = uzxVar2.o().p();
                aooh.e(akzxVarP, "toBuilder(...)");
                ajcqVarE = this.h.c.e(akzxVarP);
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.g = 3;
                if (aosv.D(ajcqVarE, this) == aoluVar) {
                    return aoluVar;
                }
                nqhVar2 = this.h;
                this.g = 4;
                if (nqhVar2.e.k(3, this) == aoluVar) {
                    return aoluVar;
                }
            }
            ((kjr) this.h.f.a()).a();
            return aojh.a;
        }
        aooc.af(obj);
        nqhVar = this.h;
        nqhVar.g.b(mce.cb);
        uzx uzxVarCd = wsc.cd(ucq.a.m());
        uzxVarCd.q(1);
        java.lang.String strA = rlt.a(nqhVar.a, (android.telecom.PhoneAccountHandle) null);
        aooh.e(strA, "getCurrentCountryIso(...)");
        uzxVarCd.r(strA);
        uzxVarCd.p(nqhVar.b);
        objA = defpackage.airh.A(defpackage.aivu.a.m());
        this.a = nqhVar;
        this.b = uzxVarCd;
        this.c = objA;
        this.d = objA;
        this.e = uzxVarCd;
        this.f = objA;
        this.g = 1;
        java.lang.Object objD = nqhVar.d(this);
        if (objD == aoluVar) {
            return aoluVar;
        }
        obj2 = uzxVarCd;
        obj3 = obj2;
        obj4 = objA;
        obj = objD;
        obj5 = obj4;
        java.lang.String str = (java.lang.String) obj;
        if (str == null) {
            str = "";
        }
        ((uzx) obj5).aC(str);
        uzx uzxVar5 = (uzx) objA;
        uzxVar5.aG(wsc.bH(1));
        uzxVar5.aF(9);
        uzxVar5.aA(rms.a);
        uzxVar5.aB(rmt.a);
        uzxVar5.aE();
        uzxVar5.aD(defpackage.aivt.SPAM);
        defpackage.mqt mqtVar = nqhVar.d;
        this.a = obj3;
        this.b = obj4;
        this.c = obj2;
        this.d = objA;
        this.e = null;
        this.f = null;
        this.g = 2;
        obj = mqtVar.c(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        obj6 = obj2;
        uzxVar = obj4;
        uzxVar2 = obj3;
        defpackage.aivr aivrVar2 = (defpackage.aivr) obj;
        aooh.f(aivrVar2, "value");
        akzx akzxVar2 = (akzx) ((uzx) objA).a;
        akzxVar2.u();
        defpackage.aivu aivuVar3 = (defpackage.aivu) akzxVar2.b;
        defpackage.aivu aivuVar4 = defpackage.aivu.a;
        j$.util.Objects.requireNonNull(aivrVar2);
        aivuVar3.A = aivrVar2;
        aivuVar3.b |= 268435456;
        ((uzx) obj6).s(uzxVar.az());
        akzx akzxVarP2 = uzxVar2.o().p();
        aooh.e(akzxVarP2, "toBuilder(...)");
        ajcqVarE = this.h.c.e(akzxVarP2);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = 3;
        if (aosv.D(ajcqVarE, this) == aoluVar) {
            return aoluVar;
        }
        nqhVar2 = this.h;
        this.g = 4;
        if (nqhVar2.e.k(3, this) == aoluVar) {
            return aoluVar;
        }
        ((kjr) this.h.f.a()).a();
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nqg(this.h, aolnVar);
    }
}
