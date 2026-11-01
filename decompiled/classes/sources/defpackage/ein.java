package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ein {
    private static volatile int a = 100;

    final boolean a(java.lang.Object obj, defpackage.egr egrVar, int i) throws defpackage.eho {
        int i2 = egrVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            d(obj, i3, egrVar.k());
            return true;
        }
        if (i4 == 1) {
            defpackage.eio eioVar = (defpackage.eio) obj;
            eioVar.e((i3 << 3) | 1, java.lang.Long.valueOf(egrVar.j()));
            return true;
        }
        if (i4 == 2) {
            ((defpackage.eio) obj).e((i3 << 3) | 2, egrVar.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new defpackage.eho("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new defpackage.ehn();
            }
            ((defpackage.eio) obj).e((i3 << 3) | 5, java.lang.Integer.valueOf(egrVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        defpackage.eio eioVar2 = new defpackage.eio();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new defpackage.eho("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (egrVar.c() != Integer.MAX_VALUE && a(eioVar2, egrVar, i6)) {
        }
        if ((i5 | 4) != egrVar.b) {
            throw new defpackage.eho("Protocol message end-group tag did not match expected tag.");
        }
        eioVar2.d();
        ((defpackage.eio) obj).e(i5 | 3, eioVar2);
        return true;
    }

    public final defpackage.eio b(java.lang.Object obj) {
        defpackage.eio eioVarC = c(obj);
        if (eioVarC != defpackage.eio.a) {
            return eioVarC;
        }
        defpackage.eio eioVar = new defpackage.eio();
        f(obj, eioVar);
        return eioVar;
    }

    public final defpackage.eio c(java.lang.Object obj) {
        return ((defpackage.ehg) obj).unknownFields;
    }

    public final /* bridge */ /* synthetic */ void d(java.lang.Object obj, int i, long j) {
        ((defpackage.eio) obj).e(i << 3, java.lang.Long.valueOf(j));
    }

    public final void e(java.lang.Object obj) {
        c(obj).d();
    }

    public final void f(java.lang.Object obj, defpackage.eio eioVar) {
        ((defpackage.ehg) obj).unknownFields = eioVar;
    }
}
