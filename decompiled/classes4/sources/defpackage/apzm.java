package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apzm {
    private static volatile int a = 100;

    final boolean a(java.lang.Object obj, defpackage.apxt apxtVar, int i) throws defpackage.apym {
        int i2 = apxtVar.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            d(obj, i3, apxtVar.k());
            return true;
        }
        if (i4 == 1) {
            defpackage.apzn apznVar = (defpackage.apzn) obj;
            apznVar.e((i3 << 3) | 1, java.lang.Long.valueOf(apxtVar.j()));
            return true;
        }
        if (i4 == 2) {
            ((defpackage.apzn) obj).e((i3 << 3) | 2, apxtVar.s());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new defpackage.apym("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new defpackage.apyl();
            }
            ((defpackage.apzn) obj).e((i3 << 3) | 5, java.lang.Integer.valueOf(apxtVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        defpackage.apzn apznVar2 = new defpackage.apzn();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new defpackage.apym("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (apxtVar.c() != Integer.MAX_VALUE && a(apznVar2, apxtVar, i6)) {
        }
        if ((i5 | 4) != apxtVar.a) {
            throw new defpackage.apym("Protocol message end-group tag did not match expected tag.");
        }
        apznVar2.d();
        ((defpackage.apzn) obj).e(i5 | 3, apznVar2);
        return true;
    }

    public final defpackage.apzn b(java.lang.Object obj) {
        defpackage.apzn apznVarC = c(obj);
        if (apznVarC != defpackage.apzn.a) {
            return apznVarC;
        }
        defpackage.apzn apznVar = new defpackage.apzn();
        f(obj, apznVar);
        return apznVar;
    }

    public final defpackage.apzn c(java.lang.Object obj) {
        return ((defpackage.apyf) obj).unknownFields;
    }

    public final /* bridge */ /* synthetic */ void d(java.lang.Object obj, int i, long j) {
        ((defpackage.apzn) obj).e(i << 3, java.lang.Long.valueOf(j));
    }

    public final void e(java.lang.Object obj) {
        c(obj).d();
    }

    public final void f(java.lang.Object obj, defpackage.apzn apznVar) {
        ((defpackage.apyf) obj).unknownFields = apznVar;
    }
}
