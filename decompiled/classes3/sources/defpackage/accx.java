package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class accx implements acdf {
    private final acbd a;

    static {
        aiof.i("GnpSdk");
    }

    public accx(acbd acbdVar) {
        aooh.f(acbdVar, "promoEvalLogger");
        this.a = acbdVar;
    }

    public final boolean a(defpackage.akis akisVar, defpackage.accs accsVar, java.util.Set set) {
        aooh.f(akisVar, "targetingTerm");
        akip akipVar = akisVar.c == 3 ? (akip) akisVar.d : akip.a;
        aooh.e(akipVar, "getAppState(...)");
        java.lang.String str = akipVar.e;
        aooh.e(str, "getStateId(...)");
        java.util.Map map = accsVar.d;
        if (!map.containsKey(str)) {
            this.a.b(accsVar.a, "Missing required app state [%s]", new java.lang.Object[]{str});
            set.add(akvm.e);
            return false;
        }
        defpackage.ackx ackxVar = (defpackage.ackx) ajsz.aN(map, str);
        ackxVar.b();
        int i = akipVar.c;
        if (i != 2) {
            this.a.b(accsVar.a, "Integer app state does not have satisfied_range", new java.lang.Object[0]);
            set.add(akvm.f);
            return false;
        }
        int i2 = (i == 2 ? (akjn) akipVar.d : akjn.a).c;
        int i3 = (akipVar.c == 2 ? (akjn) akipVar.d : akjn.a).d;
        if (i3 == 0) {
            i3 = Integer.MAX_VALUE;
        }
        int iA = ackxVar.a();
        boolean z = i2 <= iA && iA < i3;
        boolean z2 = akisVar.e;
        boolean z3 = z != z2;
        java.lang.String str2 = "IsValueValid: " + z3 + " \n app state " + str + " (integer). \n value: " + iA + " \n min inclusive: " + i2 + "\n max exclusive: " + i3 + " \n should negate: " + z2;
        if (!z3) {
            this.a.b(accsVar.a, "%s", new java.lang.Object[]{str2});
            set.add(akvm.h);
        }
        return z3;
    }
}
