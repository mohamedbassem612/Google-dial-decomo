package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cjq {
    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void b(cfp cfpVar, cah cahVar, int i) {
        while (true) {
            int i2 = cfpVar.q;
            if (i > i2 && i < cfpVar.p) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            cfpVar.I();
            if (cfpVar.S(cfpVar.q)) {
                cahVar.h();
            }
            cfpVar.V();
        }
    }

    public static final java.util.List c(cfp cfpVar, int i, java.lang.Integer num) {
        int iL;
        int i2;
        adq adqVar;
        if (cfpVar.r || cfpVar.g() == 0) {
            return aokc.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (num != null) {
            iL = num.intValue();
        } else {
            iL = cfpVar.q;
            if (iL < 0) {
                iL = cfpVar.l(i);
            }
        }
        int iO = cfpVar.h - cfpVar.o(i);
        aco acoVar = cfpVar.t;
        int i3 = 0;
        if (acoVar != null && (adqVar = (adq) acoVar.a(i)) != null) {
            i3 = adqVar.b;
        }
        cfh cfhVarValueOf = java.lang.Integer.valueOf(iO + i3);
        if (cfpVar.h(i) * 5 < cfpVar.b.length) {
            i2 = cfpVar.i(i);
        } else {
            int iL2 = iL >= 0 ? cfpVar.l(iL) : iL;
            i2 = cfpVar.i(iL);
            int i4 = iL;
            iL = iL2;
            i = i4;
        }
        while (i >= 0) {
            d(i2, (cfpVar.b[(cfpVar.h(i) * 5) + 1] & 536870912) != 0 ? cfpVar.s(i) : cau.a, cfpVar.Y(i), cfhVarValueOf, arrayList);
            cfhVarValueOf = cfpVar.p(i);
            if (iL >= 0) {
                int iL3 = cfpVar.l(iL);
                i2 = cfpVar.i(iL);
                int i5 = iL;
                iL = iL3;
                i = i5;
            } else {
                i = iL;
            }
        }
        return arrayList;
    }

    public static final void d(int i, java.lang.Object obj, defpackage.rr rrVar, java.lang.Object obj2, java.util.List list) {
        if (rrVar != null || aooh.n(obj, cau.a)) {
            if (obj2 != null && rrVar != null) {
                throw null;
            }
            list.add(new defpackage.clz(i));
        }
    }
}
