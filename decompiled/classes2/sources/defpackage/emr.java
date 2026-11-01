package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class emr implements emv {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public emr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [gii, java.lang.Object] */
    public final void a(emx emxVar, emp empVar) {
        switch (this.$cid) {
            case 0:
                ((aozj) this.a).e(empVar.a());
                return;
            case 1:
                this.a.a(empVar);
                return;
            case 2:
                if (empVar == emp.ON_START) {
                    this.a.aT().f(defpackage.eni.class);
                    return;
                }
                return;
            case 3:
                defpackage.fxr fxrVar = (defpackage.fxr) this.a;
                fxrVar.k = empVar.a();
                if (fxrVar.c != null) {
                    for (defpackage.fvs fvsVar : ajsz.cb(fxrVar.f)) {
                        fvsVar.b = empVar.a();
                        fvsVar.c();
                    }
                    return;
                }
                return;
            case 4:
                if (empVar == emp.ON_RESUME) {
                    java.lang.Object obj = this.a;
                    ahok ahokVarF = ((defpackage.hmi) obj).h.f(20, "ContactNumberScreen.onResume");
                    try {
                        ((defpackage.hmi) obj).j.i((java.lang.String) null).b(mce.gg);
                        ((defpackage.hmi) obj).i.o(rmx.qB);
                        ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                        return;
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            ajsz.ak(ahokVarF, th);
                            throw th2;
                        }
                    }
                }
                return;
            case 5:
                if (empVar == emp.ON_RESUME) {
                    java.lang.Object obj2 = this.a;
                    ahok ahokVarF2 = ((defpackage.hnd) obj2).h.f(28, "FavoritesNumberPickerScreen.onResume");
                    try {
                        ((defpackage.hnd) obj2).j.i((java.lang.String) null).b(mce.fV);
                        ((defpackage.hnd) obj2).i.o(rmx.qy);
                        ajsz.ak(ahokVarF2, (java.lang.Throwable) null);
                        return;
                    } catch (java.lang.Throwable th3) {
                        try {
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            ajsz.ak(ahokVarF2, th3);
                            throw th4;
                        }
                    }
                }
                return;
            case 6:
                if (emxVar.P().a() == emq.a) {
                    ((whl) this.a).a = null;
                    emxVar.P().d(this);
                    return;
                }
                return;
            default:
                if (empVar == emp.ON_DESTROY) {
                    emxVar.P().d(this);
                    ((anqk) this.a).a();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ emr(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
