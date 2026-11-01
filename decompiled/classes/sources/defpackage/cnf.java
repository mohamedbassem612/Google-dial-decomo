package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cnf implements defpackage.coq {
    public final defpackage.dik a;
    public final android.view.View b;
    public final defpackage.diw c;
    public final java.lang.String d;
    public android.view.autofill.AutofillId e;
    public boolean f;
    public final defpackage.cnk g;
    public defpackage.acq h;

    public cnf(defpackage.cnk cnkVar, defpackage.dik dikVar, android.view.View view, defpackage.diw diwVar, java.lang.String str) {
        this.g = cnkVar;
        this.a = dikVar;
        this.b = view;
        this.c = diwVar;
        this.d = str;
        new android.graphics.Rect();
        aa$.ExternalSyntheticApiModelOutline0.m(view, 1);
        java.lang.Object obj = new defpackage.kaw(aa$.ExternalSyntheticApiModelOutline0.m(view)).a;
        if (obj == null) {
            defpackage.cwh.b("Required value was null.");
            throw new defpackage.aoiq();
        }
        this.e = aa$.ExternalSyntheticApiModelOutline0.m(obj);
        this.h = new defpackage.acq(6);
    }

    @Override // defpackage.coq
    public final void dA(defpackage.cpg cpgVar, defpackage.cpg cpgVar2) {
        defpackage.dbk dbkVarA;
        defpackage.die dieVarQ;
        defpackage.dbk dbkVarA2;
        defpackage.die dieVarQ2;
        if (cpgVar != null && (dbkVarA2 = defpackage.cfo.A(cpgVar)) != null && (dieVarQ2 = dbkVarA2.q()) != null && defpackage.den.V(dieVarQ2)) {
            aa$.ExternalSyntheticApiModelOutline0.m(this.g.a(), this.b, dbkVarA2.c);
        }
        if (cpgVar2 == null || (dbkVarA = defpackage.cfo.A(cpgVar2)) == null || (dieVarQ = dbkVarA.q()) == null || !defpackage.den.V(dieVarQ)) {
            return;
        }
        int i = dbkVarA.c;
        defpackage.diw diwVar = this.c;
        defpackage.dbk dbkVar = (defpackage.dbk) diwVar.a.a(i);
        if (dbkVar == null || !defpackage.diw.h(dbkVar)) {
            return;
        }
        defpackage.diu diuVar = diwVar.b;
        int iA = diwVar.a(dbkVar);
        long[] jArr = (long[]) diuVar.b;
        long j = jArr[iA];
        long j2 = jArr[iA + 1];
        long j3 = j2 >> 32;
        int i2 = (int) j2;
        aa$.ExternalSyntheticApiModelOutline0.m(this.g.a(), this.b, i, new android.graphics.Rect((int) (j >> 32), (int) j, (int) j3, i2));
    }

    public cnf() {
        throw null;
    }
}
