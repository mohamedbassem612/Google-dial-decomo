package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acdb implements acdf {
    private final acbd a;

    public acdb(acbd acbdVar) {
        aooh.f(acbdVar, "promoEvalLogger");
        this.a = acbdVar;
    }

    public final boolean a(defpackage.akis akisVar, defpackage.accs accsVar, java.util.Set set) {
        boolean zS;
        aooh.f(akisVar, "targetingTerm");
        akiy akiyVar = akisVar.c == 2 ? (akiy) akisVar.d : akiy.a;
        aooh.e(akiyVar, "getEventCount(...)");
        int i = akiyVar.d;
        int i2 = akiyVar.e;
        if (i2 == 0) {
            i2 = Integer.MAX_VALUE;
        }
        int iIntValue = 0;
        for (akiu akiuVar : akiyVar.c) {
            int i3 = akiuVar.b;
            int iX = a.X(i3);
            if (iX == 0) {
                throw null;
            }
            int i4 = iX - 1;
            if (i4 == 0) {
                akiq akiqVar = i3 == 1 ? (akiq) akiuVar.c : akiq.a;
                aooh.e(akiqVar, "getClearcutEvent(...)");
                java.lang.Integer num = (java.lang.Integer) accsVar.b.get(defpackage.abxl.t(akiqVar));
                iIntValue += num != null ? num.intValue() : 0;
            } else if (i4 == 1) {
                for (java.util.Map.Entry entry : accsVar.c.entrySet()) {
                    defpackage.akkn akknVar = (defpackage.akkn) entry.getKey();
                    int iIntValue2 = ((java.lang.Number) entry.getValue()).intValue();
                    defpackage.akkn akknVar2 = akiuVar.b == 2 ? (defpackage.akkn) akiuVar.c : defpackage.akkn.a;
                    aooh.e(akknVar2, "getVeEvent(...)");
                    aooh.f(akknVar, "reportedElement");
                    aooh.f(akknVar2, "targetElement");
                    akkm akkmVarB = akkm.b(akknVar.d);
                    if (akkmVarB == null) {
                        akkmVarB = akkm.a;
                    }
                    akkm akkmVarB2 = akkm.b(akknVar2.d);
                    if (akkmVarB2 == null) {
                        akkmVarB2 = akkm.a;
                    }
                    if (akkmVarB != akkmVarB2) {
                        zS = false;
                    } else if (akknVar2.c.isEmpty()) {
                        zS = true;
                    } else {
                        alak alakVar = akknVar.c;
                        aooh.e(alakVar, "getNodeIdPathList(...)");
                        zS = defpackage.abxl.s(alakVar, akknVar2);
                    }
                    if (zS) {
                        iIntValue += iIntValue2;
                    }
                }
            }
        }
        boolean z = i <= iIntValue && iIntValue < i2;
        boolean z2 = akisVar.e;
        boolean z3 = z != z2;
        if (!z3) {
            this.a.b(accsVar.a, "%s", new java.lang.Object[]{"Invalid count. \ncount: " + iIntValue + " \nmin inclusive: " + i + "\nmax exclusive: " + i2 + " \nshould negate: " + z2});
            set.add(akvm.d);
        }
        return z3;
    }
}
