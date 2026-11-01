package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aoue extends defpackage.apcd implements defpackage.aotj, defpackage.aotx {
    public defpackage.aoul d;

    public abstract void a(java.lang.Throwable th);

    public abstract boolean b();

    public final defpackage.aoul e() {
        defpackage.aoul aoulVar = this.d;
        if (aoulVar != null) {
            return aoulVar;
        }
        defpackage.aooh.j("job");
        return null;
    }

    @Override // defpackage.aotx
    public final boolean fA() {
        return true;
    }

    @Override // defpackage.aotx
    public final defpackage.aouq fy() {
        return null;
    }

    @Override // defpackage.aotj
    public final void fz() {
        java.lang.Object objE;
        defpackage.aoul aoulVarE = e();
        do {
            objE = aoulVarE.E();
            j$.util.Objects.checkIndex(0, 4);
            if (objE == null) {
                return;
            }
            if (objE instanceof defpackage.aoue) {
                if (objE != this) {
                    return;
                }
            } else {
                if (!(objE instanceof defpackage.aouh)) {
                    if (!(objE instanceof defpackage.aotx) || ((defpackage.aotx) objE).fy() == null) {
                        return;
                    }
                    m();
                    return;
                }
                if (!defpackage.aoum.a) {
                    m();
                    return;
                }
                while (true) {
                    java.lang.Object objF = f();
                    if ((objF instanceof defpackage.apch) || defpackage.aooh.n(objF, this)) {
                        return;
                    }
                    if (objF instanceof defpackage.apcd) {
                        if (this.e.d(objF, ((defpackage.apcd) objF).i())) {
                            return;
                        }
                    }
                }
            }
        } while (!aoulVarE.e.d(objE, defpackage.aoum.i));
    }

    @Override // defpackage.apcd
    public final java.lang.String toString() {
        return defpackage.aosv.a(this) + '@' + defpackage.aosv.b(this) + "[job@" + defpackage.aosv.b(e()) + ']';
    }
}
